package p2;

public class C3 {
    public static int j=0;
    public static void m4() {
        System.out.println("Entering m4...");
        
        // incrementing variables
        j++;
        
        // calling methods
        m5();
        
        // printing variables
        System.out.println("Variables accessible from m4 :");
        System.out.println("Value of j="+j);
        
        System.out.println("Exiting m4...");
    }
    
    static void m5() {
        System.out.println("Entering m5...");
        
        // incrementing variables
        j++;
        
        // calling methods
        p1.C2.m2();
        p2.p3.C4.m6();
        
        // printing variables
        System.out.println("Variables accessible from m5 :");
        System.out.println("Value of j="+j);
        
        System.out.println("Exiting m5...");
    }
}
