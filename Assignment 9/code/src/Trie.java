import java.util.*;
import  java.io.*;
import java.nio.*;

public class Trie  {
    Node root;

    public Trie(){
        root = new Node ();
        try (BufferedReader bufReader = new BufferedReader(new FileReader("kelly.txt"))){
            String line = bufReader.readLine();
            while (line != null) {
                add(line);
                line = bufReader.readLine();
            }
            bufReader.close();
        }
        catch (Exception e) {
            System.out.println("file ");
            e.printStackTrace();
        }
    }

    public String[] realSearch(String key) {
        if (key != null && key.length() > 0)
            return root.realSearch(key, "").split(" ");
        else
            return new String[0];
    }


    public class Node {
        public Node[] arrayCharacters;
        public boolean word;

        public Node() {
            arrayCharacters = new Node[27];
            word = false;
        }

        private String realSearch(String key, String word) {
            if (key.equals("")) {
                if (this.word)
                    return word;
                else
                    return "";
            }

            int firstIndex = getIndexPerKey(key.charAt(0) - '0') * 3;
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < 3; i++) {
                String possibleWord = "";
                if (arrayCharacters[firstIndex+i] != null)
                    possibleWord = arrayCharacters[firstIndex+i].realSearch(key.substring(1), word + findCharacter(firstIndex + i));
                sb.append(possibleWord);
                if (!possibleWord.endsWith(" "))
                    sb.append(' ');
            }
            return sb.toString();
        }
    }

    public static int findCharacterCode(char letter) {
        int code = (int) letter - 97;

        if (code > 15)
            code--;
        if (code > 20)
            code--;
        if (code == 130) // å
            return 24;
        if (code == 129) // ä
            return 25;
        if (code == 147) // ö
            return 26;
        return code;
    }

    public static char findCharacter(int code) {
        if (code > 26) {
            System.out.println("Wrong input");
            return ' ';
        }
        if (code == 26)
            return 'ö';
        if (code == 25)
            return 'ä';
        if (code == 24)
            return 'å';

        if (code > 20)
            code++;
        if (code > 15)
            code++;

        return (char) (code + 97);
    }

    public static int getIndexPerKey(int key) {
        return key - 1;
        // abc def ghi jkl mno prs tuv xyz åäö
        // 0   1   2   3   4   5   6   7   8
    }

    public static int getKeyFromChar(char letter) {
        return (findCharacterCode(letter) / 3) + 1;
    }

    public void add(String word){
        Node current = root;

        for (int i = 0; i < word.length(); i++){
            if (current.arrayCharacters[findCharacterCode(word.charAt(i))] == null){
                current.arrayCharacters[findCharacterCode(word.charAt(i))] = new Node();
            }
            current = current.arrayCharacters[findCharacterCode(word.charAt(i))];
        }
        current.word = true;
    }

    /*public boolean search (String word){
        Node current = root;

        for (int i = 0; i < word.length(); i++){
            if (current.arrayCharacters[findCharacterCode(word.charAt(i))] == null)
                return false;
            current = current.arrayCharacters[findCharacterCode(word.charAt(i))];
        }
        return current.word;
    }*/
}
