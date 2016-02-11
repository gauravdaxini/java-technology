/*
 * Understanding the static variables, accessing the variables accross
 * the classes and packages.
 */
package p1;

class C1 {
    public static int i=0;
    
    public static void main(String[] args) {
        System.out.println("Entering main...");
        
        // incrementing variables
        i++;
        p2.C3.j++;
        
        // calling methods
        p2.C3.m4();
        m1();
        
        // printing variables
        System.out.println("Variables accessible from main :");
        System.out.println("Value of i="+i);
        System.out.println("Value of j="+p2.C3.j);
        
        System.out.println("Exiting main...");
    }
    
    static void m1() {
        System.out.println("Entering m1...");
        
        // incrementing variables
        i++;
        p2.C3.j++;
        
        // calling methods
        p2.p3.C4.m7();
        
        // printing variables
        System.out.println("Variables accessible from m1 :");
        System.out.println("Value of i="+i);
        System.out.println("Value of j="+p2.C3.j);
        
        System.out.println("Exiting m1...");
    }
}
