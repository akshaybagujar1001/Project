package atmmachineprogram;

import java.util.HashMap;
import java.util.Map;

public class ATMOperationImpl implements ATMOpertionInterf{
    ATM atm = new ATM();
    Map<Double,String> ministmt = new HashMap<>();



    @Override
    public void viewBalance() {
        System.out.println("Available Balance is :" + atm.getBalance());

    }

    @Override
    public void withdrawAmount(double withDrawAmount) {
        if ((withDrawAmount % 500 == 0)) {


            if (withDrawAmount <= atm.getBalance()) {
                ministmt.put(withDrawAmount, " Amount Withdrawn ");

                System.out.println("Collect the Cash " + withDrawAmount);
                atm.setBalance(atm.getBalance() - withDrawAmount);
                viewBalance();


            } else {
                System.out.println("Insufficient BAlance!!");
            }


        }
        else {
            System.out.println("please enter Amount Multiple in 500");
        }
    }


    @Override
    public void deositAmount(double depositAmount) {
        ministmt.put(depositAmount," Amount Deposited ");
        System.out.println(depositAmount + "Deposited Successfully");
        atm.setBalance(atm.getBalance() + depositAmount);
        viewBalance();


    }

    @Override
    public void viewMiniStatement() {
        for (Map.Entry<Double,String>m:ministmt.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }

    }
}

