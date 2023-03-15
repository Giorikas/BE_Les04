abstract public class Pokemon {
    // PUBLIC VARS
    public String name;
    // PRIVATE VARS
    private float hitPoints;
    private int experiencePoints;
    private int lvl;


    //Constructor
    public Pokemon(String name, float hitPoints, int experiencePoints, int lvl) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.experiencePoints = experiencePoints;
        this.lvl = lvl;

    }

    //Getters
    public float getHitPoints() {
        return hitPoints;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public int getLvl() {
        return lvl;
    }

    //Setters
    public void setHitPoints(float hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    //Methods
    public void displayBasePkm(){
        int xp = getExperiencePoints();
        float hp = getHitPoints();
        System.out.printf("Name: %s\nHealth: %s\nExperience: %s\n\n",name, hp, xp);
    }


    abstract void attack();

}
