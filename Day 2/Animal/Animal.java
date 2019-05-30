public class Animal{
    String says;
    int legs;


public Animal(){
    says=null;
    legs=0;
}
public Animal(String says,int legs){
    this.says =says;
    this.legs =legs;
}

public Animal(String says){
    this.says=says;
}

public void setSays(String says){
    this.says=says;
}

public void setLegs(int legs){
    this.legs=legs;
}

public String getSays(){
    return says;
} 
 public void print(){
        System.out.println("I am "+says+"and have "+legs+"legs");
}
public String toString(){
            return "I"+says+",have"+legs+"legs and hunt";
}

}