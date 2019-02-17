package FarmDog.dogs;


public class AdultDog extends Dog {

    String workplase;

    public AdultDog(String name, int age, boolean healthy, boolean hungry, boolean trained) {
        super(name, age, healthy, hungry, trained);
    }

    @Override
    public void eat() {
        super.hungry = false;
        System.out.println("adult dog " + super.name +" feeding");
    }

    @Override
    public void activity()
    {
        System.out.println(super.name + " is working");
        super.hungry = true;
    }

}
