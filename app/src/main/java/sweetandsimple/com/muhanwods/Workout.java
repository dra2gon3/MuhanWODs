package sweetandsimple.com.muhanwods;

public class Workout {
    private String name;
    private String description;
    private boolean button;
    //add in type or name name later maybeeee

    public static final Workout[] workouts = {
            new Workout("The Limb Loosener",
                    "5 Handstand push-ups\n10 1-legged squats\n15 Pull-ups",
                    true)
    };

    private Workout(String name, String description, boolean button){
        this.name = name;
        this.description = description;
        this.button = button;
    }

    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public boolean ifButton(){
        return button;
    }
    public String toString(){
        return this.name;
    }
}
