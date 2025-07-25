import java.util.Arrays;
import java.util.Scanner;

public class matrix {

  
  public static void main(String[] args) {

 
    Scanner scan = new Scanner(System.in);

 
    int a[][] = { { 5, 6, 7 }, { 8, 9, 10 }, { 3, 1, 2 } };
    int b[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

   
    int c[][] = new int[3][3];

  
    System.out.println("A = " + Arrays.deepToString(a));
    System.out.println("B = " + Arrays.deepToString(b));

    
    int choice;

    
    do {
     
      System.out.println("\nChoose the matrix operation,");
      System.out.println("----------------------------");
      System.out.println("1. Addition");
      System.out.println("2. Multiplication");
      System.out.println("3. Transpose");
      System.out.println("4. Exit");
      System.out.println("----------------------------");
      System.out.print("Enter your choice: ");
      choice = scan.nextInt();

      switch (choice) {
      case 1:
        c = add(a, b);
        System.out.println("Sum of matrix: ");
        System.out.println(Arrays.deepToString(c));
        break;
      
      case 2:
        c = multiply(a, b);
        System.out.println("Multiplication of matrix: ");
        System.out.println(Arrays.deepToString(c));
        break;
      case 3:
        System.out.println("Transpose of the first matrix: ");
        c = transpose(a);
        System.out.println(Arrays.deepToString(c));
        System.out.println("Transpose of the second matrix: ");
        c = transpose(b);
        System.out.println(Arrays.deepToString(c));
        break;
      case 4:
        System.out.println("Thank You.");
        return;
      default:
        System.out.println("Invalid input.");
        System.out.println("Please enter the correct input.");
      }
    } while (true);
  }

  
  public static int[][] add(int[][] a, int[][] b) {
    int row = a.length;
    int column = a[0].length;

   
    int sum[][] = new int[row][column];
   for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        sum[i][j] = a[i][j] + b[i][j];
      }
    }

    
    return sum;
  }
  public static int[][] multiply(int[][] a, int[][] b) {

    
    int row = a.length;
   
    int column = b[0].length;

    
    int product[][] = new int[row][column];

    
    for (int i = 0; i < row; i++) {
     
      for (int j = 0; j < column; j++) {
        
        product[i][j] = 0;

        
        for (int k = 0; k < a[0].length; k++) {
          product[i][j] += a[i][k] * b[k][j];
        }
      }
    }
    return product;
  }

  
  public static int[][] transpose(int[][] a) {

   
    int row = a.length;
    int column = a[0].length;

    
    int temp[][] = new int[row][column];

    
    for (int i = 0; i < row; i++) {
   
      for (int j = 0; j < column; j++) {
       
        temp[i][j] = a[j][i];
      }
    }

   
    return temp;
  }

}



/*ubuntu@ubuntu-OptiPlex-3020:~$ java matrix
A = [[5, 6, 7], [8, 9, 10], [3, 1, 2]]
B = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]

Choose the matrix operation,
----------------------------
1. Addition
2. Multiplication
3. Transpose
4. Exit
----------------------------
Enter your choice: 1
Sum of matrix: 
[[6, 8, 10], [12, 14, 16], [10, 9, 11]]

Choose the matrix operation,
----------------------------
1. Addition
2. Multiplication
3. Transpose
4. Exit
----------------------------
Enter your choice: 2
Multiplication of matrix: 
[[78, 96, 114], [114, 141, 168], [21, 27, 33]]

Choose the matrix operation,
----------------------------
1. Addition
2. Multiplication
3. Transpose
4. Exit
----------------------------
Enter your choice: 3
Transpose of the first matrix: 
[[5, 8, 3], [6, 9, 1], [7, 10, 2]]
Transpose of the second matrix: 
[[1, 4, 7], [2, 5, 8], [3, 6, 9]]

Choose the matrix operation,
----------------------------
1. Addition
2. Multiplication
3. Transpose
4. Exit
----------------------------
Enter your choice: 4
Thank You.
*\
