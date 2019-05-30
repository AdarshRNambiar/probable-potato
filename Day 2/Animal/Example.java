public class Example {
    public static void print(){
        System.out.println("something");
    }

    public void sayHello(){
        System.out.println("Hello");
        print();
    }

    public static void main (String[] args){
        print();
    }
}