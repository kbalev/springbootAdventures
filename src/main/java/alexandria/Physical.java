package alexandria;

public abstract class Physical extends Inventory {


    protected Physical(){
        super(false);
    }
    protected Physical(boolean borrowed){
        super(borrowed);
    }

}
