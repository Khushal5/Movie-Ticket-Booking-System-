package pack1;
class Bank{
private int amount;
private int amt_deposited; 
private int amt_withdrawn;
Bank(int amt, int deposit, int withdraw){ 
amount=amt;
amt_deposited=deposit; 
amt_withdrawn=withdraw;
}
public int withdraw(int wd){
return amount-wd; 
}
public int deposit(int dp){ 
return amount+dp;
} 
}
class Client{
public static void main(String[] args){ 
Bank b=new Bank(5000,0,0);
System.out.println("Amount after withdrawing is: "+b.withdraw(2000));
System.out.println("Amount after withdrawing is: "+b.deposit(1500));
} 
}