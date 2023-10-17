import java.util.ArrayList;

public abstract class TieredCake extends Cake{


   public TieredCake (String name, String baseFlavour, boolean hasFruit, boolean hasIcing, int tierTotal) {
       super(name, baseFlavour, hasFruit, hasIcing);
       this.tierTotal = tierTotal;
   }
   public int tierTotal(){
       return this.tierTotal = 3;
       }

}
