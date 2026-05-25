//classe principale
public class BankManager {
    public static void main (String[] args){
        //instance de checkingAccount
        CheckingAccount checking = new CheckingAccount();
        checking.account= "CHK001";
        checking.balance=  500000.00;
        checking.limit= 1000000.00;

        //instance de SavingsAccount
        SavingsAccount savings = new SavingsAccount();
        savings.account= "SVG001";
        savings.balance=  300000.00;

        //instance de COD
        COD cod = new COD();
        cod.account= "COD001";
        cod.balance=  25000000.00;


    }
}
