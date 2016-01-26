/*
 * Understanding the anatomy of the Java Application, accessing the methods accross
 * the classes and packages.
 */
package p1;

class C1 {
    public static void main(String[] args) {
        System.out.println("Entering main...");
        p2.C3.m4();
        m1();
        System.out.println("Exiting main...");
    }
    
    static void m1() {
        System.out.println("Entering m1...");
        p2.p3.C4.m7();
        System.out.println("Exiting m1...");
    }
}
