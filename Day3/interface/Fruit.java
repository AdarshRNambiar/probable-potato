public class Fruit{

    private String shape;
    private String color;
    private String name;

    public Fruit();{

    }


    public Fruit(String shape,String color){
        shape = fruitShape;
        this.color = color;
        this.name = name;
    }

    public void setShape(String shape){
        this.shape = shape;
    }

    public String getshape(){
        return shape;
    }
    
    @override
    public String toString(){
        return shape+" "+color+" "+name;
    }

}