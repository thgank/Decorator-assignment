public abstract class Decorator extends BaseCoffee{ //base decorator
    protected BaseCoffee coffee;

    public Decorator(BaseCoffee coffee){
        this.coffee = coffee;
    }
}
