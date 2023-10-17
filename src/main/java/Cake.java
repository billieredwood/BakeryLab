public abstract class Cake extends Bakery {

    //firstly, outline the cake's properties, by declaring cake properties' variables:
    public String name;
    protected String baseFlavour;
    protected boolean hasFruit;
    protected boolean hasIcing;
    public double price;


// construct cake class object from the above-listed properties:
    public Cake (String name, String baseFlavour, boolean hasFruit, boolean hasIcing, double price){
        this.name = name;
        this.baseFlavour = baseFlavour;
        this.hasFruit = hasFruit;
        this.hasIcing =  hasIcing;
        this.price = price;
    }

    // list the methods that will test cake's properties exist as expected

    //methods:
    public boolean hasFruit(){
        return this.hasFruit;
    }       //if the cake is expected to have fruit, then its test should confirm true.

    public boolean hasIcing(){
        return this.hasIcing;
    }       //same as above.


}
