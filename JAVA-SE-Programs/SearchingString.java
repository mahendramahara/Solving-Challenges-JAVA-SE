// Title: Searching String

class SearchingString {
    public static void main(String[] args) {
        String text = "Java is a widely used programming language. It is known for its versatility and flexibility.";

        // indexOf()
        int indexOfJava = text.indexOf("Java");
        System.out.println("Index of 'Java': " + indexOfJava);

        // lastIndexOf()
        int lastIndexOfJava = text.lastIndexOf("Java");
        System.out.println("Last index of 'Java': " + lastIndexOfJava);

        // contains()
        boolean containsProgramming = text.contains("programming");
        System.out.println("Does the text contain 'programming'? " + containsProgramming);

        // startsWith()
        boolean startsWithJava = text.startsWith("Java");
        System.out.println("Does the text start with 'Java'? " + startsWithJava);

        // endsWith()
        boolean endsWithPeriod = text.endsWith(".");
        System.out.println("Does the text end with a period? " + endsWithPeriod);
    }
}

// © Mahendra Mahara 2023
