public class Lion extends Animal{ //inheritance
    boolean hunt;


    public Lion(){
        this.says = null;
        this.legs = 0;
        this.hunt = false;
    }

    public Lion(String says,int legs,boolean hunt){
        this.says =says;
        this.legs = legs;
        this.hunt = hunt;
    }

    public void  setHunt(boolean hunt){
        this.hunt = hunt;
    }

    public boolean getHunt(){
         return hunt;
    }
    //@overridding
    public void print(){//overridding
        if (hunt)
            System.out.println("I"+says+",have"+legs+"legs and hunt");
        else
            System.out.println("I"+says+",have"+legs+"legs and dont hunt");
    }

    //@overloading
    public void print(boolean p){
        if(p)
            System.out.println("hunt");
        else
            System.out.println("no hunting");
    }
    public String tostring(){
        if(hunt)
            return "I"+says+",have"+legs+"legs and hunt";
        else
            return "I"+says+",have"+legs+"legs and dont hunt";
    }
}