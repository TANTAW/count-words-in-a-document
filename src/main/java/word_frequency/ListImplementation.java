package word_frequency;

import java.util.ArrayList;
import java.util.List;

public class ListImplementation implements Structure{
    List<String> words = new ArrayList<>();
    @Override
    public void insert(String word) {
        words.add(word);
    }

    @Override
    public int findFrequency(String keyword) {
        int occur = 0;
        for (String word: words) {
            if (word.equals(keyword)){
                occur++;
            }
        }
        return occur;
    }
}
