import program1.First;

public class PackageAndSubpackages extends First {
    public static void main(String[] args) {
        System.out.println("***** accessed program1 package in main method *****");
        PackageAndSubpackages obj = new PackageAndSubpackages();
        obj.access_subpack1();
    }
}
