package pizza;

import componentes.Tamanho;
import componentes.Sabor;
import componentes.Valor;

public class Pizza {
    private final PizzaTipo pizzaTipo;
    private final Sabor sabor;
    private final Tamanho tamanho;
    private final Valor valor;

    public Pizza(PizzaTipo pizzaTipo, Sabor sabor, Tamanho tamanho, Valor valor) {
        this.pizzaTipo = pizzaTipo;
        this.sabor = sabor;
        this.valor = valor;
        this.tamanho = tamanho;
    }

    public PizzaTipo getPizzaTipo() {
        return pizzaTipo;
    }

    public Sabor getSabor() {
        return sabor;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public Valor getValor() {
        return valor;
    }
}