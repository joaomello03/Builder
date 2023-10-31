package diretor;

import builders.Builder;
import componentes.Tamanho;
import componentes.Sabor;
import componentes.Valor;
import pizza.PizzaTipo;

public class Diretor {

    public void pizzaSalgada(Builder builder) {
        builder.setPizzaTipo(PizzaTipo.SALGADA);
        builder.setSabor(new Sabor("Calabresa"));
        builder.setTamanho(Tamanho.M);
    }

    public void pizzaDoce(Builder builder) {
        builder.setPizzaTipo(PizzaTipo.DOCE);
        builder.setSabor(new Sabor("Chocolate Branco"));
        builder.setTamanho(Tamanho.P);
    }

    public void comprovanteSalgada(Builder builder) {
        builder.setPizzaTipo(PizzaTipo.SALGADA);
        builder.setSabor(new Sabor("Calabresa"));
        builder.setTamanho(Tamanho.M);
        builder.setValor(new Valor(70.00));
    }

    public void comprovanteDoce(Builder builder) {
        builder.setPizzaTipo(PizzaTipo.DOCE);
        builder.setSabor(new Sabor("Chocolate Branco"));
        builder.setTamanho(Tamanho.P);
        builder.setValor(new Valor(50.00));
    }
}