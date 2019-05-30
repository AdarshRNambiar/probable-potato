public class Sample {
    public static void main(String[] args){
        int[] arr = new int[5];

        try{
            arr[5] = 6;
        }catch(ArrayIndexOutOfBoundsException m){ //we can replace with exception
            System.err.println(m);
        }finally{                                                       /*notcompulsory*/
            System.out.println("Done");
        }
    }
}