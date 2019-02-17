package FarmDog.locations;

public class Aviary {
    int number;
    boolean clean;

    public Aviary(int number, boolean clean) {
        this.number = number;
        this.clean = clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }

    public boolean isClean() {
        return clean;
    }

    public int getNumber() {
        return number;
    }
}
