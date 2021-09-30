package alexandria;

public abstract class Inventory {

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    private boolean borrowed;

    protected Inventory(boolean borrowed){
        this.borrowed = borrowed;
    }

    public String request(){
        if (!borrowed){
            return "Your book is available for collection, please proceed to the next step.";

        } else {
            return "Unfortunately, your book is not available at this time. Please try again later.";
        }
    }

    public String borrow(){
        if (!borrowed){
            this.borrowed = true;
            return "You have borrowed this item.";
        }
        else {
            return "The item you are trying to borrow is not available at this time.";
        }
    }

    public String bringBack(){
        if (borrowed){
            this.borrowed = false;
            return "Thank you for bringing back the item.";
        } else {
            return "You cannot return an item that has not been borrowed.";
        }
    }
}
