package modular;

import javax.swing.JOptionPane;

public class ModularStack {
    public static void main(String[] args) {
        Stack s = new Stack();
        JOptionPane.showMessageDialog(null, "Welcome to modular stack");
        boolean flag = true;
        while(flag){
            String op = JOptionPane.showInputDialog(null, "Enter the operation to perform. \n"
                    + "P - Push \n"
                    + "O - Pop \n"
                    + "D - Display \n"
                    + "Q - Quit \n"
            );
            
            switch(op){
                case "P":
                case "p":   String temp = JOptionPane.showInputDialog(null, "Enter the value to be added");
                            int v = Integer.parseInt(temp);
                            s.push(v);
                            break;
                case "O":
                case "o":   JOptionPane.showMessageDialog(null, "Last value popped = " + s.pop());
                            break;
                            
                case "D":
                case "d":   s.display();
                            break;
                            
                case "Q":
                case "q":   flag = false;
                            break;
            }
        }
    }
}

class Stack{
    final private static int SIZE = 10;
    private static int st = SIZE;
    private static int stack[] = new int[SIZE];
    
    void push(int v){
        if(st==0){
            JOptionPane.showMessageDialog(null, "Stack Overflow...");
        }else{
            stack[--st] = v;
        }
    }
    
    int pop(){
        int temp = -1;
        if(st==SIZE-1){
            JOptionPane.showMessageDialog(null, "Stack Underflow...");
        }else{
            temp = stack[st];
            st++;
        }
        return temp;
    }
    
    void display(){
        if(st==SIZE){
            JOptionPane.showMessageDialog(null, "Stack empty");
        }else{
            String s = "";
            for(int i=SIZE-1; i >=st; i--){
                s += stack[i]+" ";
            }
            JOptionPane.showMessageDialog(null, "Stack Values are : \n"+s);
        }
    }
}
