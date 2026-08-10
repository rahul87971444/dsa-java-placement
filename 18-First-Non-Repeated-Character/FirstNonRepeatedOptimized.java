import java.util.HashMap;
import java.util.Map;
public class FirstNonRepeatedOptimized {
    public static void main(String[] args) {
        String str = "swiss";
        Map<Character, Integer> frequency =
                new HashMap<>();
        // Count frequency
        for (char ch : str.toCharArray()) {
            frequency.put(
                ch,
                frequency.getOrDefault(ch, 0) + 1
            );
        }
        // Find first character with frequency 1
        for (char ch : str.toCharArray()) {
            if (frequency.get(ch) == 1) {
                System.out.println(
                    "First non-repeated character: " + ch
                );
                return;
            }
        }

        System.out.println("No non-repeated character");
    }
}
