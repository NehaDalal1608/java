import java.util.*;
class Bank
{ 
      static int bal;
      public static int deposit(int x)
       {
          bal=bal+x;
          System.out.print("\n   Account Balance is "+bal);
          return bal;
        }
       public static void withdraw(int y)
        {
            bal=bal-y;  
             System.out.print("\n  Account Balance is "+bal);
             
        }
        public static void wdraw(int y)
        {
            withdraw (y);
        }
        
}
class BAnk extends Bank
{
       void withdraw()
         {
            System.out.print("amount cannot be withdraw");
          }
          public static void main(String ar[])
         {
               Scanner sc=new Scanner (System.in);
               BAnk  ob=new BAnk();
               int ch,bal=0,amt;
               while(true)
               {
               System.out.print("\nEnter 1-withdraw    2-deposit 3-Exit  ");
               ch=sc.nextInt();
               switch(ch)
              {
               case 1:
                if(bal<100)
                {
                 ob.withdraw();
                }
                else
                {
                System.out.print("\nenter amount to be withdraw");
                amt=sc.nextInt();
                wdraw(amt);
                }
               break;     
               case 2:
               System.out.print("\nenter amount to be deposited ");
               amt=sc.nextInt();
               bal=ob.deposit(amt); 
               break;
               case 3:
               System.out.println("\n Exit(0)");
               break;
               default:
               System.out.print("\nInvalid choice");
            }
           }
      }
}

