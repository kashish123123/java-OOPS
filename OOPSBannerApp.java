public class OOPSBannerApp {


    // Static method to create O
    public static String[] createO() {
        return new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };
    }

    // Static method to create P
    public static String[] createP() {
        return new String[]{
            "**** ",
            "*   *",
            "**** ",
            "*    ",
            "*    "
        };
    }

    // Static method to create S
    public static String[] createS() {
        return new String[]{
            " ****",
            "*    ",
            " *** ",
            "    *",
            "**** "
        };
    }

    public static void main(String[] args) {

        String[] O = createO();
        String[] P = createP();
        String[] S = createS();

        for (int i = 0; i < O.length; i++) {
            System.out.println(O[i] + "  " + O[i] + "  " + P[i] + "  " + S[i]);
        }
    }
}