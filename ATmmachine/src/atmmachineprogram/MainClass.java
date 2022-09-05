package atmmachineprogram;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        ATMOpertionInterf op= new ATMOperationImpl();
        int atmnumber=12345;
        int atmpin=123;
        Scanner in = new Scanner(System.in);
        System.out.println(" Welcome To ATM machine !! ");

        System.out.println("Enter ATM Number");
        int atmNumber = in.nextInt();
        System.out.println(" Enter ATM PIN ");
        int atmPin = in.nextInt();
        if((atmnumber==atmNumber)&&(atmPin==atmPin)){
            while(true){
                System.out.println(" 1.View Available Balance\n"+" 2.Withdraw the Money\n " + " 3.Deposit the Amount\n"+ "4.View Mini Statement\n" + "5.Exit from application \n");
                System.out.println("Enter Choice");
                int ch = in.nextInt();

                if (ch==1){
                    op.viewBalance();

                } else if (ch==2) {
                    System.out.println("Enter Withdraw Amount");
                    double withDrawamount =in.nextDouble();
                    op.withdrawAmount(withDrawamount);

                } else if (ch==3) {
                    System.out.println(" Enter Amount to Deposit : ");
                double deposit = in.nextDouble(); //5000
                op.deositAmount(deposit);


                } else if (ch==4) {
                    op.viewMiniStatement();

                } else if (ch==5) {

                    System.out.println(" Collect your ATM Card\n " + " Thank you for Using ATM Machine");
                    System.exit(0);


                }
                else {
                    System.out.println("Please Enter Correct Choices ");                }
            }

        }
        else
        {
            System.out.println(" Incorrect ATM Number");
            System.exit(0);
        }

    }

}
