package Task5;

public class SubStringFinder {

    public String check(String string) {
        if (string.contains("00") || string.contains("aa")) {
            return "yes";
        }
        return "no";
    }
}
