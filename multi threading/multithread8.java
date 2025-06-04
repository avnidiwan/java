class MyRunnable implements Runnable{
    String FileName;
    public  void downloadFile(String file){
        this.FileName=file;
    }
    public void run(){
         System.out.println("Thread using runable interface");  
        for(int i=0; i<=5; i++){
            System.out.println(FileName+" downloading... "+i*20+"%");
            try {
                Thread.sleep(2000);
             } catch (Exception e) {
            }
        }
    System.out.println( FileName+" done ");
    }
}
public class multithread8 {
    public static void main(String[] args){
        // MyRunnable obj= new MyRunnable();
        // Thread t1 = new Thread(obj);
        // t1.start();
        System.out.println("Main thread is runnable");
        downloadFile d1=new downloadFile("file A");
        downloadFile d2=new downloadFile("file B");
        Thread t1= new Thread(d1);
        Thread t2= new Thread(d2);
        t1.start(); t2.start();
    }
}
