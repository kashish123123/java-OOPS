import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // Map to store character patterns
    static Map<Character, String[]> patternMap = new HashMap<>();

    // Method to initialize patterns
    public static void initializePatterns() {

        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });
    }

    // Function to render banner word
    public static void renderBanner(String word) {

        int rows = patternMap.get(word.charAt(0)).length;

        for (int i = 0; i < rows; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                String[] pattern = patternMap.get(ch);
                line.append(pattern[i]).append("  ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        initializePatterns();
        renderBanner("OOPS");
    }
}