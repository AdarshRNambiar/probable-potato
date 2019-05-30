public class TypeCasting {
    public static void main(String[] args){
        double number = 1.6;
        int intNumber =(int) number;
        System.out.println(number);
        System.out.println(intNumber);
        if(number > 0){
                System.out.println("positive number");
        }
        else if(number<0){
                System.out.println("negetive number");
        }else{
            System.out.println("zero");
        }
    }
}