package word_frequency;

public class Main {

    public static void main(String[] args) {
        long start = 0L;
        long end = 0L;


        TrieImplementation trie = new TrieImplementation();
        FileHelper.readFromFile(trie);

        System.out.println("=========== Trie ===========");
        start = System.currentTimeMillis();
        System.out.println("Programming is found " + trie.findFrequency("Programming") + " times");
        end = System.currentTimeMillis();
        System.out.println("Time taken: " + (end - start) + " MS");


        ListImplementation list = new ListImplementation();
        FileHelper.readFromFile(list);

        System.out.println("=========== List ===========");
        start = System.currentTimeMillis();
        System.out.println("Programming is found " + list.findFrequency("Programming") + " times");
        end = System.currentTimeMillis();
        System.out.println("Time taken: " + (end - start) + " MS");


        HashMapImplementation hashMap = new HashMapImplementation();
        FileHelper.readFromFile(hashMap);

        System.out.println("=========== Hash map ===========");
        start = System.currentTimeMillis();
        System.out.println("Programming is found " + hashMap.findFrequency("Programming") + " times");
        end = System.currentTimeMillis();
        System.out.println("Time taken: " + (end - start) + " MS");




    }

}
