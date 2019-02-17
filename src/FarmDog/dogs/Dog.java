package FarmDog.dogs;

/*Пояснения: основной объект-собака может быть здорова/больна, накормлена/голодна,
  выдрессирована. По возрасту собаки делятся на  щенков, взрослых, пожилых(старше 8 лет).
   собак различного  возраста
   */


public abstract class Dog {

    String name;
    int age;
    boolean healthy;
    boolean hungry;
    boolean trained;


    public Dog(String name, int age, boolean healthy, boolean hungry, boolean trained) {
        this.name = name;
        this.age = age;
        this.healthy = healthy;
        this.hungry = hungry;
        this.trained = trained;
    }

    public abstract void eat();
    public abstract void activity();

    public void setHealthy(boolean healthy)
    {
        this.healthy = healthy;
    }

    public boolean isHealthy()
    {
        return healthy;
    }

    public boolean isHungry()
    {
        return hungry;
    }

    public String getName() {
        return name;
    }
}
