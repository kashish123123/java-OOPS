 public class OOPSBannerApp {

    public static void main(String[] args) {
        System.out.println("--- OOPS Banner (UC5: Compact Initialization) ---");
        renderBanner();
    }

    public static void renderBanner() {
        String gap = "    "; 

        // Combining declaration, allocation, and initialization in one statement
        String[] bannerRows = {
            String.join(gap, " *** ", " *** ", " **** ", " **** "),
            String.join(gap, " * * ", " * * ", " *  *  ", " *    "),
            String.join(gap, " * * ", " * * ", " **** ", " ***  "),
            String.join(gap, " * * ", " * * ", " *    ", "    * "),
            String.join(gap, " *** ", " *** ", " *    ", " **** ")
        };

        // Efficient traversal using the enhanced for-loop
        for (String row : bannerRows) {
            System.out.println(row);
        }
    }
}