class withdraw extends Thread{
    static int TotBalance=1000;
    int amount;
    public withdraw(int amount){
        this.amount=amount;
    }
    public void run(){
    if(TotBalance>=amount){
        System.out.println("is going to withdraw "+amount);   
    try {
       Thread.sleep(1000);
     
    } catch (InterruptedException e) {
    }
    TotBalance-=amount;
    System.out.println("remaining paisaa "+TotBalance);
    }
    else{
        System.out.println("sorry aap gareeb hai...");
    }
}}
public class mt9 {
    public static void main(String[] args){
        withdraw t1 = new withdraw(800);
        withdraw t2 = new withdraw(500);
        t1.start(); t2.start();
    }
    //this code gives error during the execution as both the thrad are running simantenously
}
