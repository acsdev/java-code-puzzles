package easypeasy;
import java.util.Map;

/**
 * Simple subtitution characters problem
 */
class ScrambleByDictionary {

    private final static Map<String, String> dictionary = Map.of("s", "5", "o", "0", "e", "3", "i", "1", "a", "4");

    public static String apply(String word) {
        StringBuilder text = new StringBuilder(word);
        dictionary.forEach((String k, String v) -> {
            while (true) {
                int i = text.indexOf(String.valueOf(k));
                if (i < 0) {
                    break;
                }
                text.replace(i, i + 1, String.valueOf(v));
            }
        });
        return text.toString();
    }
}
