public class Cappuccino extends BaseCoffee{ //concretes
    public Cappuccino(){
        description = "Cappuccino - Coffee with a large layer of milk foam";

    }

    @Override
    public double cost() {
        return 3.5;
    }
}
