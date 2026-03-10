public class OOPSBannerApp {

    public static void main(String[] args) {
        System.out.println("--- OOPS Banner (UC4: Arrays & Loops) ---");
        renderBanner();
    }

    public static void renderBanner() {
        String gap = "    "; 
        
        // Initializing a String array to hold the 5 rows of the banner
        String[] bannerRows = new String[5];

        // Populating the array using String.join (leveraging UC3 logic)
        bannerRows[0] = String.join(gap, " *** ", " *** ", "**** ", " **** ");
        bannerRows[1] = String.join(gap, " * * ", " * * ", "*  * ", " *    ");
        bannerRows[2] = String.join(gap, " * * ", " * * ", "**** ", "  *** ");
        bannerRows[3] = String.join(gap, " * * ", " * * ", "*    ", "    * ");
        bannerRows[4] = String.join(gap, " *** ", " *** ", "*    ", " **** ");

        // Using an enhanced for-loop for clean output traversal
        for (String row : bannerRows) {
            System.out.println(row);
        }
    }
}