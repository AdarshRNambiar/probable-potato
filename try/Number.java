import java.util.Scanner;
public class Number{
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println(a);
        String m;
        m=scan.nextLine();
        System.out.println(m);
        if(a>2){
            System.out.println("the number is"+a);
        }else
            System.out.println("the number is 0");

    }
}
