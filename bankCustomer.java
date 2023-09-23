// 2. Write a Java Program for bankCustomer where it has Withdraw() and Deposit() Methods.
// Using constructor Initialise the bank balance by 500 rupees. as per the customer choice call the withdraw() and deposit() methods,
// also show the bank balance in a separate method.
import java.util.Scanner;
public class bankCustomer {
    int bank_balance;
    public bankCustomer(){
        bank_balance = 500;
    }
    public void withdraw(int amount){
        
        if(bank_balance<501){
            System.out.println("Insufficient Funds, minimum balance cannot be less than 500 units!");
        }
        else{
            if((bank_balance-amount)<500){
                System.out.println("Cannot withdraw amount because balance cannot be less than 500 units");
            }
            else{
                bank_balance -=amount;
                System.out.println(amount + " units successfully withdrawn!");
            }
        }

    }
    public void deposit(int amount){
        bank_balance += amount;
        System.out.println(amount + " units deposited successfully into the account!");
    }
    public void showBalance(){
        System.out.println("Your account balance is : "+bank_balance+" units");
    }

    public static void main(String args[]){
        int menuFlag = 0;
        int option;
        int amt;
        Scanner sc = new Scanner(System.in);
        bankCustomer customer1 = new bankCustomer();
        while (menuFlag==0){
            System.out.println("\nEnter 1 to withdraw \n 2 to deposit \n 3 to display account balance \n any other key to exit");
            option = sc.nextInt();
            switch (option){
                case 1:
                    System.out.println("Enter the amount you want to withdraw : ");
                    amt = sc.nextInt();
                    customer1.withdraw(amt);
                    continue;
                case 2:
                    System.out.println("Enter the amount you want to deposit : ");
                    amt = sc.nextInt();
                    customer1.deposit(amt);
                    continue;
                case 3:
                    customer1.showBalance();
                    continue;
                default:
                    menuFlag=1;
            }
        }
    }
}