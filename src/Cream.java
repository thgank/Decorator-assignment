public class Cream extends Decorator{ //decorator
    public Cream(BaseCoffee coffee){
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+" with Cream";
    }

    @Override
    public double cost() {
        return coffee.cost()+2.0;
    }
}
