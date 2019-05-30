public class D extends c{
    public void sayB(){
        System.out.println("B");
    }

    public static void main(String[] args){  //public access modifier
        D d =new D();
        d.sayA();
        d.sayB();
        d.say();
    }
}




/* Access modifier
Public,Protected,Default,Private*/