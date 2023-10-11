public class Latte extends BaseCoffee{ // concretes
    public Latte(){
        description = "Latte - Soft Coffee with a lot of milk";
    }

    @Override
    public double cost(){
        return 3.5;
    }
}
