package builders;

import pizza.Comprovante;
import pizza.PizzaTipo;
import componentes.Tamanho;
import componentes.Sabor;
import componentes.Valor;

public class ComprovanteBuilder implements Builder{
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

    public Comprovante getResultado() {
        return new Comprovante(tipo, sabor, tamanho, valor);
    }
}