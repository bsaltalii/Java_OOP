package AtmMachine;

import java.util.Scanner;
/**
 *
 * @author BurakSaltali
 *
 */
public class ATMMachine {
    public static void main(String[] args) {

        //CREATING NECESSERY VARIABLES
        Account[] accounts =new Account[10];
        Scanner scan = new Scanner(System.in);
        int id;
        boolean isValid=true;
        int choice=-1;
        double withdrawOrDepositAmount=0;
        //END

        //CREATING ACCOUNTS
        for (int i=0;i<10;i++){
            accounts[i]= new Account(i+1,100.0);
        }
        //END

        //CHECKING ID
        System.out.print("Enter an id : ");
        id =scan.nextInt();

        for (int i=0;i< accounts.length;i++){
            if (accounts[i].getId()==id){
                isValid=true;
                break;
            }
            isValid=false;
        }
        //END

        //DISPLAY MENU SCREEN
        while (isValid & choice!=4){
            System.out.print("\nMain Menu \n 1:Check Balance \n 2:Withdraw \n 3:Deposit \n 4:Exit \n Enter a choice : ");
            choice=scan.nextInt();

            switch (choice){
                case 1:
                {
                    System.out.println("The balance is : "+accounts[id].getBalance()+"\n"+accounts[id].getDateCreated().toString());
                    break;
                }
                case 2:
                {
                    System.out.print("Enter an amount to withdraw : ");
                    withdrawOrDepositAmount=scan.nextInt();
                    accounts[id].withdraw(withdrawOrDepositAmount);
                    System.out.println("The balance is : "+accounts[id].getBalance()+"\n"+accounts[id].getDateCreated().toString());
                    break;
                }
                case 3:
                {
                    System.out.print("Enter an amount to deposit : ");
                    withdrawOrDepositAmount=scan.nextInt();
                    accounts[id].deposit(withdrawOrDepositAmount);
                    System.out.println("The balance is : "+accounts[id].getBalance()+"\n"+accounts[id].getDateCreated().toString());
                    break;
                }
            }
        //END
        }
    }
}
