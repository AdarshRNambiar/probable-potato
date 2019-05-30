import java.util.Scanner;
import java.io.FileReader;
public class FileRead{
        public static void main(String[] args){
            FileReader file = null;
            try{
                file = new FileReader("file.txt");
        }catch(Exception e){
                System.out.println("file does not exist");
        }
        Scanner scan =new Scanner(file);
        int sum=0,c=0;
        while(scan.hasNext()){
                sum=sum+scan.nextInt();
                c++;
        }
        System.out.println("the no:- numbers"+c);
        System.out.println("the sum"+sum);
        System.out.println("the average"+sum/c);
        }
}