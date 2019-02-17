package FarmDog;

import FarmDog.dogs.Dog;
import FarmDog.dogs.Puppy;
import FarmDog.locations.Aviary;
import FarmDog.staff.ServiceStaff;
import FarmDog.staff.Veterinarian;

import java.util.ArrayList;

public class FarmDog {
    ArrayList<Dog> dogs;
    ArrayList<Aviary> aviaries;
    ServiceStaff servst;
    Veterinarian vet;
   public void oneday( )
    {
        dogs = new ArrayList<Dog>();
        servst = new ServiceStaff();
        vet = new Veterinarian();
        aviaries = new ArrayList<Aviary>();
        DB db = new DB();

        dogs =  db.readdogs();
        aviaries = db.readaviary();

        // morning feeding

        for (int i = 0 ; i < dogs.size(); i++)
        {
            if (dogs.get(i).isHungry())
            {
                servst.feed(dogs.get(i));
            }
        }

        for (int i = 0 ; i < dogs.size(); i++)
        {
            if (!vet.look(dogs.get(i)))
            {
                vet.treat(dogs.get(i));
            }
        }

        for (int i = 0 ; i < aviaries.size(); i++)
        {
            if (!aviaries.get(i).isClean())
            {
                servst.clean(aviaries.get(i));
            }
        }


        for (int i = 0 ; i < dogs.size(); i++)
        {
            dogs.get(i).activity();
        }

        // evening feeding

        for (int i = 0 ; i < dogs.size(); i++)
        {
            if (dogs.get(i).isHungry())
            {
                servst.feed(dogs.get(i));
            }
        }
    }
}
