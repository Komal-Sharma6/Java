public class Account {
    private double balance;

    public double getBalance( ){
        return balance;
    }
    public void setBalance(double amount){
        if(amount>=0){
            balance = amount;
        }
    }
    public static void main(String[] args){
        Account acc1  = new Account();
        acc1.setBalance(23000.09);
        System.out.println(acc1.getBalance());
    }
}
