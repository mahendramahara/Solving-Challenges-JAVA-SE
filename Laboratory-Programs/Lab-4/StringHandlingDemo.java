public class StringHandlingDemo {
    public static void main(String[] args) {
        String str1 = "Hello, ";
        String str2 = "world!";
        String str3 = "   Java Programming   ";

        // Length of a string
        int length = str1.length();
        System.out.println("Length of str1: " + length);

        // Concatenation
        String result = str1.concat(str2);
        System.out.println("Concatenated string: " + result);

        // Comparison
        boolean isEqual = str1.equals(str2);
        System.out.println("str1 equals str2: " + isEqual);

        // Ignoring case while comparison
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);
        System.out.println("str1 equals str2 (ignore case): " + isEqualIgnoreCase);

        // Substring
        String subStr = str3.substring(8, 15);
        System.out.println("Substring of str3: " + subStr);

        // Trim leading and trailing whitespaces
        String trimmedStr = str3.trim();
        System.out.println("Trimmed str3: " + trimmedStr);

        // Check if the string is empty
        boolean isEmpty = str1.isEmpty();
        System.out.println("The string is empty: " + isEmpty);

        // Convert to lowercase
        String lowerCaseStr = str2.toLowerCase();
        System.out.println("Lowercase of str2: " + lowerCaseStr);

        // Convert to uppercase
        String upperCaseStr = str1.toUpperCase();
        System.out.println("Uppercase of str1: " + upperCaseStr);

        // Replace characters
        String replacedStr = str2.replace('o', 'O');
        System.out.println("str2 after replacing 'o' with 'O': " + replacedStr);

        // Check if a string starts with a prefix
        boolean startsWithHello = str1.startsWith("Hello");
        System.out.println("str1 starts with 'Hello': " + startsWithHello);

        // Check if a string ends with a suffix
        boolean endsWithWorld = str2.endsWith("world!");
        System.out.println("str2 ends with 'world!': " + endsWithWorld);
    }
}
