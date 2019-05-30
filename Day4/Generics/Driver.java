public class Driver{
    public static void main(String[] args){
        Sample<Integer> SampleInteger = new Sample<>(65);
        System.out.println(SampleInteger);

        Sample<String>SampleString = new Sample<>("Hello");
        System.out.println(SampleString);

        //similar to array list
        Example<Integer,String> example = new Example<>(5,"Adarsh");
        System.out.println(example);
    }
}