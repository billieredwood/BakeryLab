import java.util.ArrayList;

public class Bakery {

// Bakery is made up of the following properties:
public String name;
public double till;
public int soldItems;
public ArrayList<Cake> cakeStock;

// construct Bakery class object from the above-listed properties:
public void Bakery (String name, double till, int soldItems){
        this.name = name;
        this.till = 0;
        this.soldItems = soldItems;
        this.cakeStock = new ArrayList<>();
// this object/class has a name and till. it has an array list of cake stock and counts the total number of sold items

// list the methods that will test that these above-listed properties function as expected:
    public ArrayList<String> checkStock(){
        return this.cakeStock;

    public String getName(){
    return this.name;
    }

public void checkStock(String stock){
    this.stock.add(stock);
    }

public removeItemFromStock(String stock){
    return.stock.remove(stock);
    }

public calculateProfit(){

    }




    // public Bakery ()
    // insert array list of cakes
    //cake is abstract
}
