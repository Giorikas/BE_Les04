public class Main {


    public static void main(String[] args) {
        float dummyVar;

        Pokemon Pyro = new FirePkm("Pyro", 100f, 0, 1, "Fire", 17, 7);

        Pyro.displayBasePkm();
        Pyro.attack();
        dummyVar = ((FirePkm) Pyro).firePunch();
        System.out.printf("%s attacks with FirePunch for %s base damage.\n", Pyro.name, dummyVar);
        ((FirePkm) Pyro).pyroBall();


        Pokemon Nero = new WaterPkm("Nero", 200f, 0,1, "Water", 11, 9);
        Nero.displayBasePkm();
        dummyVar = ((WaterPkm) Nero).hydroCanon();
        System.out.println(Nero.name + " does " + dummyVar + " damage");
        ((WaterPkm) Nero).surf();

    }
}