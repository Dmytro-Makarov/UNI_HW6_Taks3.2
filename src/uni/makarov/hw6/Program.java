package uni.makarov.hw6;

public class Program {

        public static void main(String[] args) {
            Waiter waiter = new Waiter();
            PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
            PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();
            PizzaBuilder margaritaPizzaBuilder = new MargaritaPizzaBuilder();

            waiter.setPizzaBuilder(margaritaPizzaBuilder);
            waiter.constructPizza();

            Pizza pizza = waiter.getPizza();
            pizza.info();
        }
}
