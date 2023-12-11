// Title: String Methods - Built-In

class StringMethods {
    public static void main(String[] args) {
        // length()
        String str = "Hello, World!";
        int length = str.length();
        System.out.println("Length of the string: " + length);

        // compareTo()
        String str1 = "apple";
        String str2 = "banana";
        int comparison = str1.compareTo(str2);
        System.out.println("Comparison result: " + comparison);

        // concat()
        String concatResult = str1.concat(str2);
        System.out.println("Concatenated string: " + concatResult);

        // isEmpty()
        String emptyStr = "";
        boolean isEmpty = emptyStr.isEmpty();
        System.out.println("Is the string empty? " + isEmpty);

        // trim()
        String stringWithWhitespace = "   Hello, World!   ";
        String trimmedString = stringWithWhitespace.trim();
        System.out.println("Original string: \"" + stringWithWhitespace + "\"");
        System.out.println("Trimmed string: \"" + trimmedString + "\"");

        // Other methods
        String upperCaseStr = str.toUpperCase();
        String lowerCaseStr = str.toLowerCase();
        System.out.println("Uppercase string: " + upperCaseStr);
        System.out.println("Lowercase string: " + lowerCaseStr);

        boolean startsWithHello = str.startsWith("Hello");
        boolean endsWithWorld = str.endsWith("World!");
        System.out.println("Does the string start with 'Hello'? " + startsWithHello);
        System.out.println("Does the string end with 'World!'? " + endsWithWorld);

        int indexOfComma = str.indexOf(',');
        System.out.println("Index of ',' in the string: " + indexOfComma);

        String replacedString = str.replace('o', '0');
        System.out.println("String with 'o' replaced by '0': " + replacedString);
    }
}

// © Mahendra Mahara 2023
