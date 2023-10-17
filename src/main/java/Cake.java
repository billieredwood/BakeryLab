public abstract class Cake {

    //declare variables
    protected String name;
    protected String baseFlavour;
    protected boolean hasFruit;
    protected boolean hasIcing;
    public double price;

    public String size;




// construct cake class object
    public Cake (String name, String baseFlavour, boolean hasFruit, boolean hasIcing){
        this.name = name;
        this.baseFlavour = baseFlavour;
        this.hasFruit = hasFruit;
        this.hasIcing =  hasIcing;

    }

    public boolean hasFruit(){
        return this.hasFruit;

    }

    public boolean hasIcing(){
        return this.hasIcing;
    }


}
