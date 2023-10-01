package program1;

import program1.subpack1.SubPackage;

public class First extends SubPackage {
    public void access_subpack1() {
        System.out.println("\n***** here accessed subpack1 by first class *****");
        System.out.println("The value of a is: " + a);
        System.out.println("The Value Of B Is: " + b);
        SubPackage obj = new SubPackage();
        obj.add();
    }
}