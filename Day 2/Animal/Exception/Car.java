public class Car{
    int fuel;

    public car(){
        fuel = 100;
    }

    public void setFuel(int fuel){
        this.fuel = fuel;
    }

    public void go() throws CarOutOfFuel{
        if(fuel > 0)
            System.out.println("I am going at a speed of 60");
        else
            throw new CarOutOfFuel();
    }
}