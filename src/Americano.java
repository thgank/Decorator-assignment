public class Americano extends BaseCoffee{ //concretes
    public Americano(){
        description = "Americano - A shot of Espresso with a hot water";
    }

    @Override
    public double cost() {
        return 2.0;
    }
}
