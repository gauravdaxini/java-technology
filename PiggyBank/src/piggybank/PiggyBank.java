/*
 * Implementing an interactive piggy bank system
 */
package piggybank;
import javax.swing.JOptionPane;

public class PiggyBank {
    static private int balance;
    static private int[] lt = new int[10];
    static private int count;
    
    public static void main(String[] args) {
        boolean flag = true;
        JOptionPane.showMessageDialog(null, "Welcome to PiggyBank");
        while(flag){
            String ch = JOptionPane.showInputDialog(null, "Enter the opration to Perform:\n"
                                                    +"D - Deposite"+"\n"
                                                    +"W - Withdraw"+"\n"
                                                    +"S - Statement"+"\n"
                                                    +"Q - Quit"+"\n"
                       );

            switch(ch){
                case "d":
                case "D":   deposite(readVal("Enter the amount to be deposited."));
                            break;
                case "w":
                case "W":   withdraw(readVal("Enter the amount to withdraw."));
                            break;
                case "s":
                case "S":   showStatement();
                            break;
                case "q":
                case "Q":   flag = false;
                            JOptionPane.showMessageDialog(null, "Thank you for visiting PiggyBank");
                            break;
            }
        }
    }
    
    static int readVal(String s){
        String t = JOptionPane.showInputDialog(null, s);
        return Integer.parseInt(t);
    }
    
    static void showStatement(){
        String temp = "";
        for(int v:lt){
            temp = temp + v + ","; 
        }
        JOptionPane.showMessageDialog(null, "Balance = "+balance+"\n Last 10 Transactions = "+temp);
    }
    
    static void deposite(int amount){
        balance += amount;
        saveTransaction(amount);
    }
    
    static void withdraw(int amount){
        if(amount<=balance){
            balance -= amount;
            saveTransaction(-amount);
        }else{
            JOptionPane.showMessageDialog(null, "Insufficient balance. Terminating transacton...");
        }
    }
    
    static void saveTransaction(int t){
        if(count==10){
            for(int i=0; i<count-1; i++){
                lt[i] = lt[i+1];
            }
            lt[count-1] = t;
        }else{
            lt[count++] = t;
        }
    }
    
}
