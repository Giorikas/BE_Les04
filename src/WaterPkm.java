public class WaterPkm extends Pokemon {
    //VARS
    private String typeOfPkm;
    private float baseAttack;
    private float baseDefence;

    //CONSTRUCTOR
    public WaterPkm(String name, float hitPoints, int experiencePoints, int lvl,
                   String typeOfPkm, float baseAttack, float baseDefence) {
        super(name, hitPoints, experiencePoints, lvl);
        this.typeOfPkm = typeOfPkm;
        this.baseDefence = baseDefence;
        this.baseAttack = baseAttack;
    }

    //GETTERS
    public String getTypeOfPkm() {
        return typeOfPkm;
    }

    public float getBaseAttack() {
        return baseAttack;
    }

    public float getBaseDefence() {
        return baseDefence;
    }

    //SETTERS
    public void setBaseAttack(float baseAttack) {
        this.baseAttack = baseAttack;
    }

    public void setBaseDefence(float baseDefence) {
        this.baseDefence = baseDefence;
    }


    //METHODS
    public float hydroCanon()  {
        System.out.println(name + " uses HydroCanon...");
        return getBaseAttack()*1.75f;
    }

    public void surf() {
        System.out.println("Swoosh!!!");
    }


    // OVERRIDES
    @Override
    void attack() {
        System.out.println("Attack!");
    }

}

