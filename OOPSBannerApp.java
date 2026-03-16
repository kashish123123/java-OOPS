public class OOPSBannerApp {

    /**
     * Static inner class to store a character and its banner pattern
     */
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap oPattern = new CharacterPatternMap('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        CharacterPatternMap pPattern = new CharacterPatternMap('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        CharacterPatternMap sPattern = new CharacterPatternMap('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        CharacterPatternMap[] banner = {
                oPattern, oPattern, pPattern, sPattern
        };

        int rows = oPattern.getPattern().length;

        for (int i = 0; i < rows; i++) {

            StringBuilder line = new StringBuilder();

            for (CharacterPatternMap cp : banner) {
                line.append(cp.getPattern()[i]).append("  ");
            }

            System.out.println(line);
        }
    }
}