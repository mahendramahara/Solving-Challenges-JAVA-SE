// Title: String Buffer Demonstration

class StringBufferDemo {
    public static void main(String[] args) {
        // Creating a StringBuffer object
        StringBuffer stringBuffer = new StringBuffer("Hello");

        // Appending additional characters
        stringBuffer.append(" World!");
        System.out.println("Appended string: " + stringBuffer);

        // Inserting characters at a specific position
        stringBuffer.insert(6, "Beautiful ");
        System.out.println("Inserted string: " + stringBuffer);

        // Deleting characters from a StringBuffer
        stringBuffer.delete(6, 16);
        System.out.println("After deletion: " + stringBuffer);

        // Reversing the StringBuffer
        stringBuffer.reverse();
        System.out.println("Reversed string: " + stringBuffer);

        // Updating a character at a specific position
        stringBuffer.setCharAt(4, 'p');
        System.out.println("Updated string: " + stringBuffer);
    }
}

// © Mahendra Mahara 2023
