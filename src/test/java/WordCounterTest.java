import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kinder112 on 03.05.2017.
 */
public class WordCounterTest {

    WordCounter wordCounter;

    @Before
    public void setUp() throws Exception {
        wordCounter = new WordCounter();
    }

    @Test
    public void shouldReturnZeroWhenNoSentenceWasGiven() {
        int count = wordCounter.getCount("Ala");

        assertEquals(0, count);
    }

    @Test
    public void shouldReturn1One1Occurrence() throws Exception {
        wordCounter.count("Ala ma kota");

        int count = wordCounter.getCount("Ala");

        assertEquals(1, count);
    }

    @Test
    public void shouldReturn2WhenWordOccursTwiceInSentence() throws Exception {
        wordCounter.count("Ala ma kota Ala");

        int count = wordCounter.getCount("Ala");

        assertEquals(2, count);
    }
    @Test
    public void shouldReturn2WhenWordOccursTwiceInSentenceIngoringCase() throws Exception {
        wordCounter.count("Ala ma kota ala");

        int count = wordCounter.getCount("Ala");

        assertEquals(2, count);
    }

    @Test
    public void shouldReturn2WhenSameSentenceIsGivenTwice() throws Exception {
        wordCounter.count("Ala ma kota. Ala ma kota");

        int count = wordCounter.getCount("kota");

        assertEquals(2, count);

    }
}