import java.util.*;

// class createAccount{
//     String name;
//     String accountType;
//     void createAccount(String name, String accountType) {
//         this.name = name;
//         this.accountType = accountType;
//     }
//     void generateAccNum(){
//         // Logic to generate account number
//         System.out.println("Account Number generated for " + name);
//         RandomGenerator random = RandomGenerator.getDefault();
//         int accountNumber = random.nextInt(100000, 999999);
//     }
// }
class account{
    private String name;
    private int accNum;
    private double balance;
    ArrayList<transactions> transaction= new ArrayList<>();
    public account(String name, int accNum, double balance){
        this.name = name;
        this.accNum = accNum;
        this.balance = balance;
    }
    public void deposit(double amount){
        if (amount>0){
            balance+=amount;
            transaction.add(new transactions("Deposit", amount));
            System.out.println("Deposited succesfully!");
        }
    }
    public void withdraw(double amount){
        if (amount>0 && amount<=balance){
            balance-=amount;
            transaction.add(new transactions("Withdraw", amount));
            System.out.println("Withdrawn succesfully!");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
    public String getName(){
        return name;
    }
    public int getaccNum(){
        return accNum;
    }
}
class transactions{
    String type;
    double amount;
    public transactions(String type, double amount){
        this.type=type;
        this.amount=amount;
    }
}
class createAcc{
    private String name;
    private String type;
    double balance=0;
    void getname(){
        Scanner name = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String holderName = name.next();
    }
    void getaccType(){
        Scanner accType = new Scanner(System.in);
        System.out.print("Enter account type: ");
        System.out.println("Please enter 'savings' or 'current'.");
        String accountType = accType.next();
       //getaccType();  Recursive call to re-enter account type       
    }
    int generateAccNum(){
        Random random = new Random();
        int accNum = random.nextInt(100000, 999999);
        System.out.println("Your Account Number: " + accNum);
        return accNum;
    }
}
public class project {
    public static void main(String[] args) {
        System.out.println("Welcome to the Bank Management System");
        System.out.print("Enter your name: ");
        Scanner obj= new Scanner(System.in);
        String name = obj.next();
        System.out.println("what you want to do?");
        System.out.println("1. Create an account");
        System.out.println("2. check Balance");
        System.out.println("3. Deposit money");
        System.out.println("4. Withdraw money");
        System.out.println("5. Check transaction history");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
        int choice = obj.nextInt();
        switch(choice){
            case 1: {
                System.out.println("Creating an account...");
                createAcc acc = new createAcc();
                acc.getname();
                acc.getaccType();
                int accNum = acc.generateAccNum();
                System.out.println("Your current balance is: "+acc.balance);
                System.out.println("Your account is created successfully");
            }
            break;
            case 2: System.out.println("Checking balance...");break;
            case 3: {
                System.out.println("Depositing money...");
              
                break;
            }
            case 4: System.out.println("Withdrawing money...");break;
            case 5: System.out.println("Checking transaction history...");break;
            case 6: {
                System.out.println("Exiting the system. Goodbye!");
                return; // Exit the program
            }
            default: System.out.println("Invalid choice. Please try again.");
        }
    }
}
