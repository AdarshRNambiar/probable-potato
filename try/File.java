import java.util.Scanner;
import java.io.FileReader;
public class File{
    public static void main(String[] args){
        FileReader f=null;
        try{
            f=new FileReader("fileadd.txt");
        }catch (Exception e){
            System.out.println("not found");
        }
        Scanner scan =new Scanner(f);
        int s=0,c=0;
        while(scan.hasNext()){
            s=s+scan.nextInt();
            c++;
        }
        System.out.println(s);
        System.out.println(c);
    }
}