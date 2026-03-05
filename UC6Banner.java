public class UC6Banner {

    // Helper method for 'O'
    public static String[] getO() {
        return new String[]{
            " ***** ",
            " *   * ",
            " *   * ",
            " *   * ",
            " ***** "
        };
    }

    // Helper method for 'P'
    public static String[] getP() {
        return new String[]{
            " ***** ",
            " *   * ",
            " ***** ",
            " *     ",
            " *     "
        };
    }

    // Helper method for 'S'
    public static String[] getS() {
        return new String[]{
            " ***** ",
            " *     ",
            " ***** ",
            "     * ",
            " ***** "
        };
    }

    public static void main(String[] args) {
        // Build banner using helper methods
        String[][] banner = { getO(), getP(), getS() };

        // Render banner line by line
        for (int row = 0; row < banner[0].length; row++) {
            for (int col = 0; col < banner.length; col++) {
                System.out.print(banner[col][row] + "   "); // spacing between letters
            }
            System.out.println();
        }
    }
}
