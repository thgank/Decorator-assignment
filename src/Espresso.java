public class Espresso extends BaseCoffee{ //concretes
    public Espresso(){
        description = "Espresso - Just a shot of Espresso." +
                "\nVery bitter and rich in flavor";
    }

    @Override
    public double cost() {
        return 1.0;
    }
}
