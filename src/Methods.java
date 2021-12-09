public class Methods {

//    public static final String ANSI_RESET = "\u001B[0m";
//    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
//    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
//    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";

    public static void clear() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (java.io.IOException | InterruptedException ex) {
        }
    }

    public static void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

//    public static String makeCyan(String text) {
//        return ANSI_CYAN_BACKGROUND + text + ANSI_RESET;
//    }
//
//    public static String makeGreen(String text) {
//        return ANSI_GREEN_BACKGROUND + text + ANSI_RESET;
//    }
//
//    public static String makeRed(String text) {
//        return ANSI_RED_BACKGROUND + text + ANSI_RESET;
//    }
}
