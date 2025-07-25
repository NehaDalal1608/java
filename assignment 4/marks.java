class Student
 {
    int rollNo;
 }
    class Test extends Student
     {
    int sub1, sub2;
    int getMarks() 
    {
    return sub1 + sub2;
    }
    }
    interface Sports {
    int getSMarks();
    void setSMarks(int smarks);
    }
    class Result extends Test implements Sports {
    int smarks;
    public int getSMarks() {
    return smarks;
        }
    public void setSMarks(int smarks) {
    this.smarks = smarks;
        }
    public void displayMarks() {
    System.out.println("Roll No: " + rollNo);
    System.out.println("Subject 1 Marks: " + sub1);
    System.out.println("Subject 2 Marks: " + sub2);
    System.out.println("Total Marks: " + getMarks());
    System.out.println("Sports Marks: " + getSMarks());
        }
    }
    public class marks {
    public static void main(String[] args) {
            Result result = new Result();
    result.rollNo = 35;
            result.sub1 = 80;
            result.sub2 = 85;
    result.setSMarks(100);
    result.displayMarks();
        }
    }    

