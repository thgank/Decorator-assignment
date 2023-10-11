public class Sugar extends Decorator{ //decorator
    public Sugar(BaseCoffee coffee){
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+" with a bunch of sugar cubes";
    }

    @Override
    public double cost() {
        return coffee.cost()+0.5;
    }
}
