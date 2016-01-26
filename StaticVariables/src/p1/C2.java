package p1;

public class C2 {
    private static int l=0;
    public static void m2() {
        System.out.println("Entering m2...");
        
        // incrementing variables
        C1.i++;
        p2.C3.j++;
        l++;
        
        // calling methods
        m3();
        
        // printing variables
        System.out.println("Variables accessible from m2 :");
        System.out.println("Value of i="+p1.C1.i);
        System.out.println("Value of j="+p2.C3.j);
        System.out.println("Value of l="+l);
        
        System.out.println("Exiting m2...");
    }
    
    static void m3() {
        System.out.println("Entering m3...");
        
        // incrementing variables
        C1.i++;
        p2.C3.j++;
        l++;
        
        // printing variables
        System.out.println("Variables accessible from m3 :");
        System.out.println("Value of i="+p1.C1.i);
        System.out.println("Value of j="+p2.C3.j);
        System.out.println("Value of l="+l);
        
        System.out.println("Exiting m3...");
    }
}
