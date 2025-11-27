package ATM_Project;

import java.util.Scanner;

public class MainClass 
{
	public static void main(String[] args) {
        AtmOperationInterf op=new AtmOperationImpl();
        int atmnumber=12345;
        int atmpin=123;
        Scanner in=new Scanner(System.in);
        System.out.println("Welcome to ATM Machine !!!");
        System.out.print("Enter Atm Number : ");
        int atmNumber=in.nextInt();
        System.out.print("Enter Pin: ");
        int pin=in.nextInt();
        if((atmnumber==atmNumber)&&(atmpin==pin)){
            while(true){
                System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Ministatement\n5.Exit");
                System.out.println("Enter Choice : ");
                int ch=in.nextInt();
                switch(ch)
                {
                case 1:{
                        op.viewBalance();
                       System.out.println("------------------------------------");
                       break;
                       }
                case 2:{
                    System.out.println("Enter amount to withdraw ");
                    double withdrawAmount=in.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                    System.out.println("------------------------------------");
                    break;
                    }
                case 3:{
                    System.out.println("Enter Amount to Deposit :");
                    double depositAmount=in.nextDouble();//5000
                    op.depositAmount(depositAmount);
                    System.out.println("------------------------------------");
                    break;
                    }
                case 4:{
                    op.viewMiniStatement();
                    System.out.println("------------------------------------");
                    break;
                    }
                case 5:{
                    System.out.println("Collect your ATM Card\n Thank you for using ATM Machine!!");
                    System.exit(0);
                    System.out.println("------------------------------------");
                    break;
                    }
                default :{
                    System.out.println("Please enter correct choice");
                    System.out.println("------------------------------------");
                    }
               }
           }
        }
        else{
            System.out.println("Incorrect Atm Number or pin");
            System.exit(0);
            System.out.println("------------------------------------");
        }


    }
}
