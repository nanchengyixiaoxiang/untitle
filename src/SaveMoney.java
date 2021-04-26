public class SaveMoney {
    public static void main(String args[]) {
        int amount=8000;
        CommericalBank bank= new CommericalBank();
        bank.savedMoney = amount;
        bank.year = 8.236;
        bank.setInterestRate (0.035) ;
        double interest2=bank.computerInterest() ;

    }
}
