import java.util.HashMap;
public class HashMapExample{
    public static void main(String[] args){
        HashMap<Integer,String> studentHashMap = new HashMap<>();
        studentHashMap.put(1,"joker");//if same key given value will be overriten
        studentHashMap.put(2,"Tony Stark");
        studentHashMap.put(3,"Harry");
        studentHashMap.put(4,"Hermione");//it store things that we given
        studentHashMap.put(5,"jack Sparrow");

        System.out.println(studentHashMap);
    }
}


//linkedhashmap are used to make it in order.