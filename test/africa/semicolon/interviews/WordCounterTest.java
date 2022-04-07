package africa.semicolon.interviews;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class WordCounterTest {
    @Test
    void testThatWordCounterReturnsPrefixCount() {
        Map<String, List<String>> listOfProviderPrefixes = new HashMap<>();
        listOfProviderPrefixes.put("mtn", List.of("0703" ,"0706", "0803","0806", "0810", "0813", "0814", "0816", "0903", "0916", "07025", "07026", "0704"));
        listOfProviderPrefixes.put("air", List.of("0701", "0708", "0802", "0808", "0812", "0901", "0902", "0904", "0907", "0912"));
        listOfProviderPrefixes.put("glo", List.of("0705", "0805", "0807", "0811", "0815", "0905", "0915"));
        listOfProviderPrefixes.put("nineMobile", List.of("0809", "0817", "0818", "0909", "0908"));
        listOfProviderPrefixes.put("mtel", List.of("0804"));

        Map<String, Integer> expectedResponse = new HashMap<>(Map.of("nineMobile", 131409, "mtn", 342282, "air",263166, "glo",183734, "mtel",26596));
        Map<String, Integer> actualResult = WordCounter.providersPhoneNumberCount("/home/anjola/IdeaProjects/deitelJavaExercises/src/africa/semicolon/interviews/PhoneNumbers.txt", listOfProviderPrefixes);

        assertEquals(expectedResponse, actualResult);
    }

    @Test
    void testForToRoman() {
        String s = toRoman(45);
        assertEquals("XLV", s);


    }

    public final static String toRoman(int number) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

        int l =  map.floorKey(number);
        if ( number == l ) {
            return map.get(number);
        }
        return map.get(l) + toRoman(number-l);
    }


}