import java.util.Vector;

public class VectorOperationsDemo {
    public static void main(String[] args) {
        Vector<Double> vector1 = new Vector<>();
        Vector<Double> vector2 = new Vector<>();

        vector1.add(2.0);
        vector1.add(3.0);
        vector1.add(5.0);

        vector2.add(1.0);
        vector2.add(4.0);
        vector2.add(6.0);

        // Vector addition
        Vector<Double> sumVector = new Vector<>();
        for (int i = 0; i < vector1.size(); i++) {
            sumVector.add(vector1.get(i) + vector2.get(i));
        }
        System.out.println("Vector Addition: " + sumVector);

        // Vector subtraction
        Vector<Double> diffVector = new Vector<>();
        for (int i = 0; i < vector1.size(); i++) {
            diffVector.add(vector1.get(i) - vector2.get(i));
        }
        System.out.println("Vector Subtraction: " + diffVector);

        // Dot product
        double dotProduct = 0.0;
        for (int i = 0; i < vector1.size(); i++) {
            dotProduct += vector1.get(i) * vector2.get(i);
        }
        System.out.println("Dot Product: " + dotProduct);

        // Scalar multiplication
        double scalar = 2.0;
        Vector<Double> scalarMultVector = new Vector<>();
        for (int i = 0; i < vector1.size(); i++) {
            scalarMultVector.add(vector1.get(i) * scalar);
        }
        System.out.println("Scalar Multiplication: " + scalarMultVector);
    }
}
