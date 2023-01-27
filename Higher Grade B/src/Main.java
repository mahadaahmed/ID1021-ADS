class Main {
    public static void main(String[] args) {
        Trie tree = new Trie();
        System.out.println(Trie.getKeyFromChar('t'));
        System.out.println(Trie.getKeyFromChar('o'));
        System.out.println(Trie.getKeyFromChar('f'));
        System.out.println(Trie.getKeyFromChar('f'));
        System.out.println(Trie.getKeyFromChar('e'));
        System.out.println(Trie.getKeyFromChar('l'));

        String key = "4545425";

        String[] allWords = tree.realSearch(key);

        for (String x: allWords){
            System.out.print(x + ", ");
        }







    }
}