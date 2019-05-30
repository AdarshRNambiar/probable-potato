public class Student{
    String  name;
    int rollno;
    String classStudying;
    int age;

    public Student(String name,int rollno,String classStudying,int age){
        this.name =name;
        this.rollno =rollno;
        this.classStudying =classStudying;
        this.age =age;
    }

    public boolean checkAge() throws StudentUnderAgeException{
        if(age>=18)
            return true;
            else{
                throw new StudentUnderAgeException();
            }
    }
    public void print(){
        System.out.println("Name:"+name);
        System.out.println("Rollno:"+rollno);
        System.out.println("class:"+classStudying);
        System.out.println("Age:"+age);
    }
}