import java.util.*;
class Stack {
    static final int MAX = 100;
    int top = -1;
    int[] stack = new int[MAX];
    Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        Stack s = new Stack();
        s.menu();
    }

    public void menu() {
        int opt, val;
        while (true) {
            System.out.println("1. PUSH ");
            System.out.println("2. POP ");
            System.out.println("3. PEEK ");
            System.out.println("4. DISPLAY STACK ");
            System.out.println("5. EXIT ");
            System.out.println("\n Enter Your Option: ");
            opt = sc.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("Enter the value to be added to the stack: ");
                    val = sc.nextInt();
                    push(val);
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    peek();
                    break;
                case 4:
                    display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }

    public void push(int val) {
        if (top == MAX - 1) {
            System.out.println("Stack is FULL!");
        } else {
            top++;
            stack[top] = val;
            System.out.println("Element added to the stack is: " + val);
            display();
        }
    }

    public void pop() {
        int x;
        if (top == -1) {
            System.out.println("Stack is EMPTY!");
        } else {
            x = stack[top];
            System.out.println("The element deleted from the stack is: " + x);
            top--;
            display();
        }
    }

    public void peek() {
        if (top == -1) {
            System.out.println("Stack is EMPTY!");
        } else {
            System.out.println("The value at the top of the stack is: " + stack[top]);
        }
    }

    public void display() {
        if (top == -1)
            System.out.println("STACK IS EMPTY!");
        else {
            System.out.println("The elements in the stack are: ");
            for (int i = 0; i <= top; i++)
                System.out.println(stack[i]);
        }
    }
}
/*
ubuntu@ubuntu-OptiPlex-3020:~$ gedit Stack.java
ubuntu@ubuntu-OptiPlex-3020:~$ javac Stack.java
ubuntu@ubuntu-OptiPlex-3020:~$ java Stack
1. PUSH 
2. POP 
3. PEEK 
4. DISPLAY STACK 
5. EXIT 

 Enter Your Option: 
1
Enter the value to be added to the stack: 
23
Element added to the stack is: 23
The elements in the stack are: 
23
*/     

