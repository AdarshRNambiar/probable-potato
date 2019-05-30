import java.util.Scanner;

public class MyDetails{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int rollno = scan.nextInt();
        String cclass = scan.next();
          scan.nextLine();
        String name = scan.nextLine();
        String school = scan.nextLine();
        System.out.println(rollno);
        System.out.println(cclass);
        System.out.println(name);
        System.out.println(school);
    }
}