public class Mocha extends BaseCoffee{ //concretes
    public Mocha(){
        description = "Mocha - Coffee with a chocolate";
    }

    @Override
    public double cost() {
        return 4.0;
    }
}
