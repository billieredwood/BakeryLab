import java.util.ArrayList;

public class CupCake extends Cake {

    private ArrayList<String> fillings ;

    public CupCake (String name, String baseFlavour, boolean hasFruit, boolean hasIcing){
        super (name, baseFlavour, hasFruit, hasIcing);
        this.fillings = new ArrayList<>();
    }

    public ArrayList<String> checkHasFilling (){
       return this.fillings;
    }

    public void addFillings(String filling){
        this.fillings.add(filling);
    }

}