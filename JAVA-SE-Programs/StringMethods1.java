// Title: String Methods - Built-In and Created Methods

class StringMethods1 {
    public static void main(String[] args) {
        // Using built-in string methods
        String str = "Hello, World!";
        int length = getLength(str);
        System.out.println("Length of the string: " + length);

        String str1 = "apple";
        String str2 = "banana";
        int comparison = compareStrings(str1, str2);
        System.out.println("Comparison result: " + comparison);

        String concatResult = concatenateStrings(str1, str2);
        System.out.println("Concatenated string: " + concatResult);

        boolean isEmpty = checkIfEmpty("");
        System.out.println("Is the string empty? " + isEmpty);

        String stringWithWhitespace = "   Hello, World!   ";
        String trimmedString = trimWhitespace(stringWithWhitespace);
        System.out.println("Original string: \"" + stringWithWhitespace + "\"");
        System.out.println("Trimmed string: \"" + trimmedString + "\"");
    }

    // Custom method to get the length of a string
    static int getLength(String str) {
        return str.length();
    }

    // Custom method to compare two strings
    static int compareStrings(String str1, String str2) {
        return str1.compareTo(str2);
    }

    // Custom method to concatenate two strings
    static String concatenateStrings(String str1, String str2) {
        return str1.concat(str2);
    }

    // Custom method to check if a string is empty
    static boolean checkIfEmpty(String str) {
        return str.isEmpty();
    }

    // Custom method to trim whitespace from a string
    static String trimWhitespace(String str) {
        return str.trim();
    }
}

// © Mahendra Mahara 2023
