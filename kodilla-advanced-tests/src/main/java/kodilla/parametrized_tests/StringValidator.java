package kodilla.parametrized_tests;

public class StringValidator {
    public boolean isBlank(String text) {
        return text == null || text.trim().isEmpty();
    }

    public static class StringManipulator {
        public String reverseWithLowerCase(String input) {
            StringBuilder builder = new StringBuilder(input);
            return builder.reverse().toString().toLowerCase();
        }
    }
    public int getStringLengthWithoutSpaces(String input) {
        String value = input.replaceAll(" ", " ");
        return value.length();
    }
    public int countNumberOfCommas(String text) {
        int count = text.length() - text.replace(",", "").length();
        return count;
    }
}