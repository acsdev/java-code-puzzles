package easypeasy;
import java.util.HashMap;
import java.util.Map;

class Paragram {

    public static boolean is(String text) {
        Map<Character, Integer> counts = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            Integer count = counts.get(ch);
            if (count == null) {
                count = 0;
            }
            count += 1;
            counts.put(ch, count);
        }
        return counts.entrySet().stream().allMatch(entry -> entry.getValue() == 1);
    }
}
