package uni.makarov.hw6;

public class MargaritaPizzaBuilder extends PizzaBuilder{
    @Override
    public void buildDough() {
        pizza.setDough("stuffed crust");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("neapolitan");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("cheese + basel");
    }
}
