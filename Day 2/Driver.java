public class Driver{
        public static void main(String[] args){
            Car suzuki = new Car();
            Car honda = new Car("Honda","Red",5);

            System.out.println(suzuki.company +" "+suzuki.color+" "+suzuki.noOfSeates+" ");
            System.out.println(honda.company +" "+honda.color+" "+honda.noOfSeates+" ");

            suzuki.setColor("Blue");
            suzuki.setCompany("Suzuki");
            System.out.println(suzuki.company+" "+suzuki.color+" "+suzuki.noOfSeates+" ");
            String comp = suzuki.getCompany();
            if(suzuki.getCompany() !="Honda")
                System.out.println(suzuki.getCompany()+" "+suzuki.color+" "+suzuki.noOfSeates+" ");
            else
                System.out.println(comp);


            honda.addSeats(1);
            honda.print();
        }


}