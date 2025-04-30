class info{
    int accNum; String holderName; int balance;
    void information(int accNum, String holderName, int balance){
        this.accNum=accNum;
        this.holderName=holderName;
        this.balance=balance;

    }
    void deposit(int d){
        balance+=d;
        System.out.println("BALANCE AFTER DEPOSIT: "+balance);
    }
    void withdraw(int w){
        balance -= w;
        System.out.println("BALANCE AFTER WITHDRAW: "+balance);
    }
}
public class BankAcc{
    public static void main(String[] args){
        info p1= new info();
        p1.information(123,"Avni",2000);
        p1.deposit(200);
        p1.deposit(200);
        p1.deposit(400);
        p1.withdraw(600);
    }
}