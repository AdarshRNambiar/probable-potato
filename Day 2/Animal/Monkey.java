public class Monkey extends Animal{
    boolean climb;

    public Monkey(){
        this.says = null;
        this.legs = 0;
        this.climb = false;
    }

    public Monkey(String says,int legs,boolean climb){
        this.says = says;
        this.legs =legs;
        this.climb = climb;
    }

    public void setclimb(boolean climb){
        this.climb = climb;
    }

    public boolean getclimb(){
        return climb;
    }

    //overridding
    public void print(){
        if (climb)
            System.out.println("I"+says+",have"+legs+"legs and climb");
        else
            System.out.println("I"+says+",have"+legs+"legs and dont climb");
    }

    //overloading
    public void print(boolean c){
        if(c)
             System.out.println("climb");
        else 
            System.out.println("no climbing");
    }
    public String toString(){
        if(climb)
            return "I"+says+",have"+legs+"legs and climb";
        else
            return "I"+says+",have"+legs+"legs and dont climb";
    }
}