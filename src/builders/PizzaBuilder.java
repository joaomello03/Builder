package builders;

import pizza.Pizza;
import pizza.PizzaTipo;
import componentes.Tamanho;
import componentes.Sabor;
import componentes.Valor;

public class PizzaBuilder implements Builder {
    private PizzaTipo tipo;
    private Sabor sabor;
    private Tamanho tamanho;
    private Valor valor;

    @Override
    public void setPizzaTipo(PizzaTipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public void setSabor(Sabor sabor) {
        this.sabor = sabor;
    }

    @Override
    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public void setValor(Valor valor) {
        this.valor = valor;
    }

    public Pizza getResultado() {
        return new Pizza(tipo, sabor, tamanho, valor);
    }
}