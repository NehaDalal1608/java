public class stat {
    static int staticVariable;
    static {
        System.out.println("Static block is executed.");
        staticVariable = 10;
    }
    static void staticMethod() {
        System.out.println("Static method is called.");
        System.out.println("Value of staticVariable: " + staticVariable);
    }
    public static void main(String[] args) {
        System.out.println("Value of staticVariable in main method: " + staticVariable);
        staticMethod();
    }
}

/*
ubuntu@ubuntuq:~$ gedit stat.java
ubuntu@ubuntuq:~$ javac stat.java
ubuntu@ubuntuq:~$ java stat
Static block is executed.
Value of staticVariable in main method: 10
Static method is called.
Value of staticVariable: 10
*/

