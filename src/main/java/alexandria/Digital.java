package alexandria;

public abstract class Digital extends Inventory {


    protected Digital(){
        super(false);
    }
    protected Digital(boolean borrowed){
        super(borrowed);
    }

    public String requiredDevice(){
        return "I require a computer to be viewed";
    };
}
