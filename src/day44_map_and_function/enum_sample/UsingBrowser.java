package day44_map_and_function.enum_sample;

public class UsingBrowser {
    public static void main(String[] args) {
        Browser browser = Browser.CHROME; //String browser = "CHROME"

        switch (browser){
            case CHROME :
            case FIREFOX:
                System.out.println("Opening either chrome or Firefox");
            case EDGE:
                System.out.println("Opening either Edge");
            case SAFARI:
                System.out.println("Opening either Safari");
            default:
                System.out.println("Unknown browser");
        }

    }
}
