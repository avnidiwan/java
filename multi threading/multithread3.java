
class downloadFile{
    public static void file(String file){
        for(int i=0; i<=5; i++){
            System.out.println(file+"  downloading... "+(i*20)+"%");
        
        try {
            Thread.sleep(2000);;
        } catch (Exception e) {
        } 
    }
 System.out.println(file+" done ");}
}
public class multithread3 {
    public static void main(String[] args){
        downloadFile d= new downloadFile();
        d.file("File A");
        d.file("File B");
    }
}
