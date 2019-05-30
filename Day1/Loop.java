public class Loop{
    public static void main(String[] args){
        int limit=100;
        for(int i=1;i<=limit;i++)
            System.out.println(i);//automatically come as downwise to give straigt line print
        
        while(limit-->0)
            System.out.println(limit+1);
    }
}