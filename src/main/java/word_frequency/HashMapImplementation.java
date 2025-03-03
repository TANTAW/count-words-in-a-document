package word_frequency;

import java.util.HashMap;

public class HashMapImplementation implements Structure{
    private HashMap<String , Integer> words = new HashMap<>();
    @Override
    public void insert(String word) {
        if (words.containsKey(word)){
            words.put(word, words.get(word) + 1);
        } else {
            words.put(word, 1);
        }
    }

    @Override
    public int findFrequency(String word) {
        if (words.containsKey(word)){
            return words.get(word);
        }
        return 0;
    }
}
