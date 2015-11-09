package sweetandsimple.com.muhancrossfit;

public class Workout {
    private String name;
    private String description;

    public static final Workout[] workouts = {
            new Workout("Daily WODs",
                    "5 Handstand push-ups\n10 1-legged squats\n15 Pull-ups"),
            new Workout("Other WODs",
                    "100 Pull-ups\n100 Push-ups\n100 Sit-ups\n100 Squats"),
            new Workout("Information",
                    "5 Pull-ups\n10 Push-ups\n15 Squats")
    };

    private Workout(String name, String description){
        this.name = name;
        this.description = description;
    }
    public String getDescription(){
        return description;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return this.name;
    }
}
