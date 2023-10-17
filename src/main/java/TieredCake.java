import java.util.ArrayList;

public abstract class TieredCake extends Cake{

    private ArrayList<String> fillings ;
   public TieredCake (String name, String baseFlavour, boolean hasFruit, boolean hasIcing, double price) {
       super(name, baseFlavour, hasFruit, hasIcing, price);
       this.fillings = new ArrayList<>();
   }
    public void addFillings(String filling){

        this.fillings.add(filling);
    }
}
