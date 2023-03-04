import java.util.Scanner;
class ATM
{
    float Balance;
    int PIN =1234;
    public void checkpin()
    {
        System.out.println("Enter your pin:");
        Scanner sc = new Scanner(System.in);
        int enterpin = sc.nextInt();
        if(enterpin==PIN)
        {
            menu();
        }
        else
        {
            System.out.println("Enter a valid pin.");
            checkpin();
        }

        
    }
    public void menu()
    {
        System.out.println("Enter your Choice:");
        System.out.println("1.Check A/C Balance");
        System.out.println("2.Withdraw Money");
        System.out.println("3.Deposit Money");
        System.out.println("4.Exit");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        if (opt==1)
        {
            checkbalance();
        }
        else if(opt==2)
        {
            withdrawmoney();
        }
        else if(opt==3)
        {
            depositmoney();
        }
        else if(opt==4)
        {
            return;
        }
        else 
        {
            System.out.println("Enter a valid Choice");
            menu();
        }
    }
    public void checkbalance()
    {
        System.out.println("Balance:"+Balance);
        menu();
    }
    public void withdrawmoney()
    {
        System.out.println("Enter amount to withdraw:");
        Scanner sc = new Scanner(System.in);
        float amount= sc.nextFloat();
        if(amount>Balance)
        {
            System.out.println("insufficient Balance");
        }
        else
        {
            Balance = Balance - amount;
            System.out.println("Money withdrawl Successfully");
        }
        menu();
    }
    public void depositmoney()
    {
        System.out.println("Enter the amount:");
        Scanner sc = new Scanner(System.in);
        float amount= sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money Deposite Successfully");
        menu();
    }
}


public class ATMmachine {
    public static void main(String[] args)
    {
        ATM obj = new ATM();
        obj.checkpin();
    }
    
}
