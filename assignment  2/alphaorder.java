import java.util.*;
class aplhaorder
 {
	public static void main(String args[])
	{
	 Scanner sc = new Scanner(System.in);
         String names[] = new String[10];
          int i;
         System.out.println("Enter the names:-");
         for(i=0;i<10;i++)
          names[i] = sc.nextLine(); 
	 String temp;
         int n=10;
	 for(i=0;i<10;i++)
	 for(int j=i+1;j<10;j++)
         if(names[i].compareTo(names[j])>0)
         {
	  temp=names[i];
	  names[i]=names[j];
	  names[j]=temp;
         }
        System.out.println("The Alphabetical order:-");
	for(i=0;i<10;i++)
         System.out.println(names[i]);
        }
    } 
/*
Enter the names:-
shravani lohar
anushka
nandini
vaishnavi
arya
samiksha
shrutika
diksha
samrudhi
neha
The Alphabetical order:-
anushka
arya
diksha
nandini
neha
samiksha
samrudhi
shravani lohar
shrutika
vaishnavi
*/
                                                                                                                                                       
         

