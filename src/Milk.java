public class Milk extends Decorator{ //decorators
    public Milk(BaseCoffee coffee){
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+" with the milkman";
    }

    @Override
    public double cost() {
        return coffee.cost()+0.5;
    }
}
