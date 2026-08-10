public class FirstNonRepeated {
    public static void main(String[] args) {
        String str = "swiss";
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == current) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(
                    "First non-repeated character: " + current
                );
                return;
            }
        }
        System.out.println("No non-repeated character");
    }
}
