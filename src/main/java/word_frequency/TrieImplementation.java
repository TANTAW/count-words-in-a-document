package word_frequency;

public class TrieImplementation implements Structure{
    private final TrieNode root = new TrieNode();

    public void insert(String word) {
        TrieNode current = root;
        for (char ch : word.toCharArray()) {
            current = current.getChildren().computeIfAbsent(ch, c -> new TrieNode());
        }
        if (current.isWord()){
            current.incrementCounter();
        } else{
            current.setWord(true);
            current.setContent(word);
            current.incrementCounter();
        }
    }

    @Override
    public int findFrequency(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.toCharArray().length; i++) {
            TrieNode node = current.getChildren().get(word.charAt(i));
            if (node == null) {
                return 0;
            }
            current = node;
        }
        return current.getCounter();
    }
}
