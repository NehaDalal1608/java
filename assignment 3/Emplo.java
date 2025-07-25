class Employee {
    private String name;
    private String address;
    private double salary;

    public Employee(String name, String address, double salary) {
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double calculateBonus() {
        return salary * 0.1; 
    }

    public void generatePerformanceReport() {
        System.out.println("Performance report for: " + name);
       
    }
}
/*
ubuntu@ubuntu-OptiPlex-5090:~$ gedit Emplo.java
ubuntu@ubuntu-OptiPlex-5090:~$ javac Emplo.java
ubuntu@ubuntu-OptiPlex-5090:~$ java Emplo
Diksha works in the IT department.
Managing projects for department: IT
Purva writes code in Java.
Writing code in: Java
NArayanii debugs code in Python.
Debugging code in: Python
Diksha's bonus: $8000.0
Performance report for: Diksha
*/

class Manager extends Employee {
    private String department;

    public Manager(String name, String address, double salary, String department) {
        super(name, address, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void manageProjects() {
        System.out.println("Managing projects for department: " + department);
        // Project management logic
    }
}

class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, String address, double salary, String programmingLanguage) {
        super(name, address, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void writeCode() {
        System.out.println("Writing code in: " + programmingLanguage);
        // Code writing logic
    }
}

class Programmer extends Developer {
    public Programmer(String name, String address, double salary, String programmingLanguage) {
        super(name, address, salary, programmingLanguage);
    }

    public void debugCode() {
        System.out.println("Debugging code in: " + getProgrammingLanguage());
        // Debugging logic
    }
}

public class Emplo{
    public static void main(String[] args) {
        Manager manager = new Manager("Diksha", " kasba bawda", 80000, "IT");
        Developer developer = new Developer("Purva", "nehru colony", 60000, "Java");
        Programmer programmer = new Programmer("NArayanii", "Mahalaxmi nagar", 70000, "Python");

        System.out.println(manager.getName() + " works in the " + manager.getDepartment() + " department.");
        manager.manageProjects();
        System.out.println(developer.getName() + " writes code in " + developer.getProgrammingLanguage() + ".");
        developer.writeCode();
        System.out.println(programmer.getName() + " debugs code in " + programmer.getProgrammingLanguage() + ".");
        programmer.debugCode();

        System.out.println(manager.getName() + "'s bonus: $" + manager.calculateBonus());
        manager.generatePerformanceReport();
    }
    }

