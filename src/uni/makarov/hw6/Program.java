package uni.makarov.hw6;

public class Program {

    static class Pizza {
        String dough;
        String sauce;
        String topping;
        public Pizza() {}
        public void setDough(String dough) {this.dough = dough;}
        public void setSauce(String sauce) {this.sauce = sauce;}
        public void setTopping(String topping) {this.topping = topping;}
        public void info(){
            System.out.printf("Dough: %s%nSauce: %s%n\nTopping: %s%n",dough, sauce, topping);
        }
    }

    //Abstract Builder
    static abstract class PizzaBuilder {
        protected Pizza pizza;
        public PizzaBuilder() {};
        public Pizza getPizza() {return pizza;}
        public void createNewPizza() {pizza = new Pizza();}

        public abstract void buildDough();
        public abstract void buildSauce();
        public abstract void buildTopping();
    }

    //Concrete Builder
    static class HawaiianPizzaBuilder extends PizzaBuilder {
        @Override
        public void buildDough() {
            pizza.setDough("cross");
        }

        @Override
        public void buildSauce() {
            pizza.setSauce("mild");
        }

        @Override
        public void buildTopping() {
            pizza.setTopping("ham+pineapple");
        }
    }

    //Concrete Builder
    static class SpicyPizzaBuilder extends PizzaBuilder {
        @Override
        public void buildDough() {
            pizza.setDough("pan baked");
        }

        @Override
        public void buildSauce() {
            pizza.setSauce("hot");
        }

        @Override
        public void buildTopping() {
            pizza.setTopping("pepperoni+salami");
        }
    }

    //Concrete Builder
    static class MargaritaPizzaBuilder extends PizzaBuilder {
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
            pizza.setTopping("cheese+basil");
        }
    }

    /** "Director" */
    static class Waiter {
        private PizzaBuilder pizzaBuilder;
        public void setPizzaBuilder(PizzaBuilder pb) {
            pizzaBuilder = pb;
        }
        public Pizza getPizza() {
            return pizzaBuilder.getPizza();
        }
        public void constructPizza() {
            pizzaBuilder.createNewPizza();
            pizzaBuilder.buildDough();
            pizzaBuilder.buildSauce();
            pizzaBuilder.buildTopping();
        }
    }

    /** A customer ordering a pizza. */
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
