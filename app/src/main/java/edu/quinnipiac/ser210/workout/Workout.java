package edu.quinnipiac.ser210.workout;

public class Workout {
    private String name;
    private String description;

    public static final Workout [] workouts={
     new Workout("The Limb Loosener", "5 Handstand Push-ups\n10 1-legged squats\n15 Pull-ups"),
     new Workout("Core Angony", "100 Pull-ups\n100 Push-ups\n100 Sit-ups\n100 Squats") ,
     new Workout("The Whimp Special", "5 Pull-ups\n10 Push=ups\n15 Squats"),
     new Workout("Strength and Legs", "500 meter run\n21x1.5 pood Kettleball Swings\n21 x Pull-ups")

    };

    private Workout(String name, String description){
        this.name = name;
        this.description=description;
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
