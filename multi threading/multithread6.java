class MyRunnable implements Runnable{
    public void run(){
        System.out.println("Thread using runable interface");
    }
}
public class multithread6 {
    public static void main(String[] args){
        MyRunnable obj= new MyRunnable();
        Thread t1 = new Thread(obj);
        t1.start();
        System.out.println("Main thread is runnable");
    }
}
