//classe principale
public class BankManager {
    public static void main (String[] args){
        //instance de checkingAccount
        CheckingAccount checking = new CheckingAccount();
        checking.account= "CHK001";
        checking.balance=  500000.00;
        checking.limit= 1000000.00;

    }
}
