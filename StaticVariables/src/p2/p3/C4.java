package p2.p3;

public class C4 {
    static int k=0;
    public static void m6() {
        System.out.println("Entering m6...");
        
        // incrementing variables
        p2.C3.j++;
        k++;
        
        // printing variables
        System.out.println("Variables accessible from m6 :");
        System.out.println("Value of j="+p2.C3.j);
        System.out.println("Value of k="+k);
        
        System.out.println("Exiting m6...");
    }
    
    public static void m7() {
        System.out.println("Entering m7...");
        
        // incrementing variables
        p2.C3.j++;
        k++;
        
        // printing variables
        System.out.println("Variables accessible from m7 :");
        System.out.println("Value of j="+p2.C3.j);
        System.out.println("Value of k="+k);
        
        System.out.println("Exiting m7...");
    }
}
