package FarmDog.staff;

import FarmDog.dogs.Dog;

public class Veterinarian extends Employee {

    public void treat(Dog obj)
    {
        obj.setHealthy(true);
        System.out.println("treat " + obj.getName() );
    }

    public boolean look(Dog obj)
    {
        return obj.isHealthy();
    }
}
