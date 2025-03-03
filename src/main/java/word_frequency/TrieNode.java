package word_frequency;

import java.util.HashMap;

public class TrieNode {

    private HashMap<Character, TrieNode> children;
    private String content;
    private boolean isWord;
    private int counter;

    public int getCounter() {
        return counter;
    }

    public void incrementCounter() {
        this.counter += 1;
    }

    public TrieNode() {
        this.children = new HashMap<>();
        counter = 0;
    }

    public HashMap<Character, TrieNode> getChildren() {
        return children;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isWord() {
        return isWord;
    }

    public void setWord(boolean word) {
        isWord = word;
    }
}

