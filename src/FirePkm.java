public class FirePkm extends Pokemon {
    //VARS
    private String typeOfPkm;
    private float baseAttack;
    private float baseDefence;

    //CONSTRUCTOR
    public FirePkm(String name, float hitPoints, int experiencePoints, int lvl,
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
    // public void setTypeOfPkm(String typeOfPkm){this.typeOfPkm=typeOfPkm;} Alleen bij instantiatie.
    public void setBaseAttack(float baseAttack) {
        this.baseAttack = baseAttack;
    }

    public void setBaseDefence(float baseDefence) {
        this.baseDefence = baseDefence;
    }


    //METHODS
    public float firePunch()  {
        return getBaseAttack()*2.5f;
    }

    public void pyroBall() {
        System.out.println("BOOM!");
    }


    // OVERRIDES
    @Override
    void attack() {
        System.out.println("Attack!");
    }

}
