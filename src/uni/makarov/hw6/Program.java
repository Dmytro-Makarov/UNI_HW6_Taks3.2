package uni.makarov.hw6;

public class Program {

        public static void main(String[] args) {
            Waiter waiter = new Waiter();
            PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
            PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();
            PizzaBuilder margaritaPizzaBuilder = new MargaritaPizzaBuilder();

            waiter.setPizzaBuilder(hawaiianPizzaBuilder);
            waiter.constructPizza();
            Pizza pizza = waiter.getPizza();
            pizza.info();

            waiter.setPizzaBuilder(spicyPizzaBuilder);
            waiter.constructPizza();
            Pizza pizza1 = waiter.getPizza();
            pizza1.info();

            waiter.setPizzaBuilder(margaritaPizzaBuilder);
            waiter.constructPizza();
            Pizza pizza2 = waiter.getPizza();
            pizza2.info();
        }
}
