package FarmDog;

import FarmDog.dogs.AdultDog;
import FarmDog.dogs.Dog;
import FarmDog.dogs.ElderlyDog;
import FarmDog.dogs.Puppy;
import FarmDog.locations.Aviary;

import java.sql.*;
import java.util.ArrayList;

public class DB {
    private static String password = "root";
    private static String username = "root";
    private static String conURL = "jdbc:mysql://localhost:3306/farmdog?characterEncoding=UTF-8";
    // private static Connection connection = null;
    protected static Connection connection = null;
    protected Statement statment = null;
    protected ResultSet result = null;

    public DB() {
        try{
            connection = DriverManager.getConnection(conURL, username, password);
            statment = connection.createStatement();
        }catch (SQLException e){}

    }
    public ArrayList<Dog> readdogs()
    {
        ArrayList<Dog> dogs= new ArrayList<Dog>();
        Dog dog;
        try {
            result = statment.executeQuery("SELECT * FROM DOGS");
            while (result.next())
            {
                if (result.getInt("AGE") <= 1)
                {
                    dog = new Puppy(result.getString(1),result.getInt(2), result.getBoolean(3), result.getBoolean(4), result.getBoolean(5));
                }else
                if (result.getInt("AGE") > 8)
                {
                    dog = new ElderlyDog(result.getString(1),result.getInt(2), result.getBoolean(3), result.getBoolean(4), result.getBoolean(5));
                }
                else
                {
                    dog = new AdultDog(result.getString(1),result.getInt(2), result.getBoolean(3), result.getBoolean(4), result.getBoolean(5));
                }
                dogs.add(dog);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dogs;
    }
    public ArrayList<Aviary> readaviary()
    {
        ArrayList<Aviary> aviaries = new ArrayList<Aviary>();
        try {
            result = statment.executeQuery("SELECT * FROM AVIARY;");
            while (result.next())
            {
                aviaries.add(new Aviary(result.getInt(1), result.getBoolean(2)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            return aviaries;
        }
    }
}
