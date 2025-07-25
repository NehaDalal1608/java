import java.util.*;
class Area {
    private double length;
    private double breadth;
    public void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public double getArea() {
        return length * breadth;
    }
}
public class file {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Area rectangle = new Area();
        System.out.print("Enter the length of the rectangle: ");
        Double length = scanner.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        Double breadth = scanner.nextDouble();
        rectangle.setDim(length, breadth);
        double area = rectangle.getArea();
        System.out.println("Area of the rectangle: " + area);
        scanner.close();
    }
}
/*
ubuntu@ubuntuq:~$ gedit file.java
ubuntu@ubuntuq:~$ javac file.java
ubuntu@ubuntuq:~$ java file
Enter the length of the rectangle: 45
Enter the breadth of the rectangle: 3
Area of the rectangle: 135.0
*/
