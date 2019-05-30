import java.util.HashMap;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;
public class CountryCode{
    public static void main(String[] args){
        HashMap<String,String> countryCodes = new HashMap<>();
        BufferedReader br =null;
        FileReader fr = null;
        try{
           fr = new FileReader("CountryCodes.txt");
           br = new BufferedReader(fr);
        }catch(Exception e){
            System.out.println("file does not exist");
        }
        String line;
        try{
            while((line = br.readLine()) != null){
                //process the line
             String[] countryData= line.split("-");
            countryCodes.put(countryData[0],countryData[1]);
            }
            } catch(Exception e){
            System.out.println("Error");
        }       

        System.out.println(countryCodes);
    }
}




