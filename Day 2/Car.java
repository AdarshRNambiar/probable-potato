public class Car {
    String company;
    String color;
    int noOfSeates;

    public Car(){ //default constructor
        company = null;
        color =null;
        noOfSeates =0;
    }

    //constructor
    public Car(String company,String color,int noOfSeates){
        this.company = company;
        this.color = color;
        this.noOfSeates =noOfSeates;
    }

    public Car(String company,String color){
        this.company = company;
        this.color = color;
    }

    public Car(String company){
        this.company =company;
    }
    //methods
    public void setColor(String color){  //setter
        this.color = color;
    }
    public void setCompany(String company){
        this.company =company;
    }

    public String getCompany(){//getters we can use instead of company in the program
        return company;
    }

    public String getColor(){
        return color;
    }

    public int getNoOfSeates(){
        return noOfSeates;
    }

    public void addSeats(int seats){
        noOfSeates = noOfSeates+seats;
    }

    public void print(){
        System.out.println(this.company+" "+this.color+" "+this.noOfSeates+" ");
    }
}