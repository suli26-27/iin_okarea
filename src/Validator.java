/*
Készítette: Erős István, 2026-11-18
*/

public class Validator {
    public static boolean isValidInput(String input) {
        String regexSample = "[0-9]+";
        if(input.matches(regexSample)) {
            if(!isValidNumber(input)) {
                return false;
            }
        }else {
            return false;
        }
        return true;
    }
    private static boolean isValidNumber(String input) {
        Double num = Double.parseDouble(input);
        if ( num <= 0) {
            return false;
        }
        return true;
    }
}
