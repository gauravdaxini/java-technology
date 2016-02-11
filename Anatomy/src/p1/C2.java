package p1;

public class C2 {
    public static void m2() {
        System.out.println("Entering m2...");
        m3();
        System.out.println("Exiting m2...");
    }
    
    static void m3() {
        System.out.println("Entering m3...");
        System.out.println("Exiting m3...");
    }
}
