public class SwitchString{
    public static void main (String[] args){
            double card=6.2;
            float card2=(float)card;
        switch(card2){
            case 1:System.out.println("1st card");//can be used for only int and string
                    break;
            case 6.2:System.out.println("6st card");
                    break;
            default:System.out.println("No card");
        }
    }
}