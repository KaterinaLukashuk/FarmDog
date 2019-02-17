package FarmDog.staff;

import FarmDog.dogs.Dog;
import FarmDog.locations.Aviary;

public class ServiceStaff extends Employee {


    public void feed (Dog obj)
    {
        obj.eat();
    }

    public void clean(Aviary obj)
    {
        obj.setClean(true);
        System.out.println("the aviary # "+ obj.getNumber() + " is clean");
    }
}
