import java.lang.*;

class Bankaccount{
int bal=20000;
int x,y;

public void balanceEnquiry(){
System.out.println("balance ="+bal);
}

public void withdraw(){
bal=bal-x;
System.out.println("Ammount after withdrawing :"+bal);

try{
bal=0;
System.out.println("Balance is zero");
}
catch(LowBalanceException e){
System.out.println("Balance is less"+e);
}

catch(NegativeNumberException e1){
System.out.println("Balance is in negative "+e1);
}
}

public void deposite(){
bal=bal-y;
System.out.println("Ammount after deposite :"+bal);
}


class Bank extends Bankaccount{ 
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
Bank ob= new Bank();


System.out.print("1.Withdraw 2.Deposite 3.Exit")
                                                                                                                                                                                     
}
}
