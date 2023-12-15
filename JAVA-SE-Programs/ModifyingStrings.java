// Title: Modifying Strings

class ModifyingStrings {
    public static void main(String[] args) {
        String original = "Java is a programming language";

        // Concatenation
        String concatenated = original + " widely used for various purposes.";
        System.out.println("Concatenated string: " + concatenated);

        // Substring
        String substring = original.substring(10, 22);
        System.out.println("Substring: " + substring);

        // Replace
        String replaced = original.replace("programming", "versatile");
        System.out.println("Replaced string: " + replaced);

        // Uppercase
        String upperCase = original.toUpperCase();
        System.out.println("Uppercase string: " + upperCase);

        // Lowercase
        String lowerCase = original.toLowerCase();
        System.out.println("Lowercase string: " + lowerCase);

        // Trim
        String withWhitespace = "   Java   ";
        String trimmed = withWhitespace.trim();
        System.out.println("Original string: \"" + withWhitespace + "\"");
        System.out.println("Trimmed string: \"" + trimmed + "\"");
    }
}

// © Mahendra Mahara 2023
