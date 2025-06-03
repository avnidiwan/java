class MyThread extends Thread{
    public void run(){
        System.out.println("hiii");
    }
}
public class multithread1 {
    public static void main(String[] args){
        MyThread t1= new MyThread();
        t1.start();
        System.out.println("helloo");
        //always the work in the main class/thread will be executed first i.e. helloo
        //unless the fact that you have called the another thread before it, it will execute later i.e. hiii
    }
}
