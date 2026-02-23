public class OOPSBanner {

    // Static method to build one line of banner
    public static String buildLine(String... parts) {
        return String.join("", parts);
    }

    // Static method to print banner
    public static void printBanner() {

        String line1 = buildLine(
                "OOOO   ", "OOOO   ", "PPPP   ", "SSSS"
        );

        String line2 = buildLine(
                "O   O  ", "O   O  ", "P   P  ", "S"
        );

        String line3 = buildLine(
                "O   O  ", "O   O  ", "PPPP   ", "SSSS"
        );

        String line4 = buildLine(
                "O   O  ", "O   O  ", "P      ", "   S"
        );

        String line5 = buildLine(
                "OOOO   ", "OOOO   ", "P      ", "SSSS"
        );

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
    }

    // Main method
    public static void main(String[] args) {
        printBanner();
    }
}