import java.util.HashMap;

//what about access modifiers?
public class WordCounter {
    //not used variable?
    String newSentece;
    //why not use interface?
    HashMap<String, Integer> sentenceMap = new HashMap<>();

    public void count(String sentence) {
        //why have a reference for 1?
        int oneValue = 1;
        String[] split = sentence.split(" ");
        for (int i = 0; i < split.length; i++) {
            if (!sentenceMap.containsKey(split[i])) {
                sentenceMap.put(split[i], oneValue);
            } else {
                sentenceMap.put(split[i], sentenceMap.get(split[i]) + 1);
            }
            //left out testing code?
            System.out.println(split[i]);
        }
    }

    //this was missing how would you write this method?
    public int getCount(String word) {
        return sentenceMap.get(word);
    }
}
