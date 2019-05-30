public class Driver{
    public static void main(String[] args){
        String name ="125";
        int k=Integer.parseInt(name);
        k =k+1;
        System.out.println(k);

        name ="10.5";
        double n =Double.parseDouble(name);
        n=n+0.3;
        System.out.println(n);

        String binaryk =Integer.toBinaryString(k);  //to convert to binary
        System.out.println(binaryk);

        System.out.println(Integer.parseInt(binaryk,2));  //binary to integer
    }
}