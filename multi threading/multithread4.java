class downloadFile extends Thread{
    String FileName;
    public  downloadFile(String file){
        this.FileName=file;
    }
    public void run(){
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
public class multithread4 {
    public static void main(String[] args){
        downloadFile d1=new downloadFile("file A");
        downloadFile d2=new downloadFile("file B");
        d1.start(); d2.start();
        
    }
}
