package FarmDog.dogs;


public class Puppy extends Dog {


    @Override
    public void eat() {
        super.hungry = false;
        System.out.println("feeding the puppy "  + super.name  );
    }

    @Override
    public void activity()
    {
        System.out.println(super.name + " is training");
        super.hungry = true;
    }

    public Puppy(String name, int age, boolean healthy, boolean hungry, boolean trained) {
        super(name, age, healthy, hungry, trained);
    }
}
