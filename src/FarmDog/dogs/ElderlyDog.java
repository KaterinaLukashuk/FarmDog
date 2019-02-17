package FarmDog.dogs;

public class ElderlyDog extends Dog {

    public ElderlyDog(String name, int age, boolean healthy, boolean hungry, boolean trained) {
        super(name, age, healthy, hungry, trained);
    }

    @Override
    public void eat() {
        super.hungry = false;
        System.out.println("elderly dog " + super.name +"  feeding");
    }

    @Override
    public void activity()
    {
        System.out.println(super.name + " remain in aviary");
        super.hungry = true;
    }

}
