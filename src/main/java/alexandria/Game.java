package alexandria;


import java.time.LocalTime;

public class Game extends Digital{

    private String title;
    private String studio;
    private int ageRating;

    public Game(String title, String studio, int ageRating){
        this.title = title;
        this.studio = studio;
        this.ageRating = ageRating;
    }

    public Game(String title){
        this(title, "Unknown Studio", 18);
    }
    public Game(String title, String studio){
        this(title, studio, 18);
    }

    public String otherPlayers(){
        if((LocalTime.now().isAfter(LocalTime.of(17,30))) && (LocalTime.now().isBefore(LocalTime.of(22, 30)))){
            return "There are people around to play this game with.";
        }
        else { return "There does not seem to be anyone around to play with";}
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public int getAgeRating() {
        return ageRating;
    }

    public void setAgeRating(int ageRating) {
        this.ageRating = ageRating;
    }
}
