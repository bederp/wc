import java.util.HashMap;

public class WordCounter {
    String newSentece;
    HashMap<String, Integer> sentenceMap = new HashMap<>();

    public void count(String sentence) {
        int oneValue = 1;
        String[] split = sentence.split(" ");
        for (int i = 0; i < split.length; i++) {
            if (!sentenceMap.containsKey(split[i])) {
                sentenceMap.put(split[i], oneValue);
            } else {
                sentenceMap.put(split[i], sentenceMap.get(split[i]) + 1);
            }
            System.out.println(split[i]);
        }
    }

    public int getCount(String word) {
        return sentenceMap.get(word);
    }
}
