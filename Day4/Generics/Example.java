public class Example<A,B>{
    A variable;
    B var;

    public Example(A variable,B var){
        this.variable =variable;
        this.var =var;
    }

    public String toString(){
        return "First variable is "+variable+" Second variable is "+var;
    }
}