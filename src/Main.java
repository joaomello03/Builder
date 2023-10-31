import pizza.Pizza;
import pizza.Comprovante;
import builders.PizzaBuilder;
import builders.ComprovanteBuilder;
import diretor.Diretor;

public class Main {
    public static void main(String[] args) throws Exception {
        Diretor diretor = new Diretor();

        PizzaBuilder builder = new PizzaBuilder();
        diretor.pizzaSalgada(builder);
        Pizza pizza = builder.getResultado();
        System.out.println("Pizza:\n" + pizza.getPizzaTipo());

        ComprovanteBuilder comprovanteBuilder = new ComprovanteBuilder();
        diretor.comprovanteSalgada(comprovanteBuilder);
        Comprovante comprovante = comprovanteBuilder.getResultado();
        System.out.println("\nComprovante:\n" + comprovante.imprimir());

        builder = new PizzaBuilder();
        diretor.pizzaDoce(builder);
        pizza = builder.getResultado();
        System.out.println("\nPizza:\n" + pizza.getPizzaTipo());

        comprovanteBuilder = new ComprovanteBuilder();
        diretor.comprovanteDoce(comprovanteBuilder);
        comprovante = comprovanteBuilder.getResultado();
        System.out.println("\nComprovante:\n" + comprovante.imprimir());
    }
}