public class AnimalDetails{
    public static void main(String[] args){
        Animal lion = new Animal();
        Animal dog =new Animal("bark",4);

        System.out.println(lion.says+" "+lion.legs);
        System.out.println(dog.says+" "+dog.legs);

        lion.setSays("lion");
        lion.setLegs(4);

        lion.print();

        Lion abc =new Lion("Roar!!",5,true);
        abc.print();
        abc.print(true);

        Animal lion1 = abc;   //Lion-> Animal
        lion1.print();

        System.out.println(abc);
        System.out.println(lion);


        Monkey monkey=new Monkey();





        System.out.println(abc);
        System.out.println(monkey);




       // Lion lion2 =lion;    //Animal->Lion          //not possible 
    }
} 