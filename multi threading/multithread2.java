class MyThread extends Thread{
    public void run(){
        System.out.println("helloo");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println("Avni");
         try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println("hiii");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println("Unnati");     
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println("heyyy");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println("Sampo");
}}
public class multithread2 {
    public static void main(String[] args) {
        MyThread t1= new MyThread();
        t1.start();
        
    }
}
