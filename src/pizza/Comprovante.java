package pizza;

import componentes.Tamanho;
import componentes.Sabor;
import componentes.Valor;

public class Comprovante {
    private final PizzaTipo pizzaTipo;
    private final Sabor sabor;
    private final Tamanho tamanho;
    private final Valor valor;

    public Comprovante(PizzaTipo pizzaTipo, Sabor sabor, Tamanho tamanho, Valor valor) {
        this.pizzaTipo = pizzaTipo;
        this.sabor = sabor;
        this.valor = valor;
        this.tamanho = tamanho;
    }

    public String imprimir() {
        String comprovante = "";
        String descrTamanho = "";

        if (tamanho == Tamanho.P){
            descrTamanho = "Pequena";
        } else if (tamanho == Tamanho.M){
            descrTamanho = "Média";
        } else if (tamanho == Tamanho.G){
            descrTamanho = "Grande";
        }

        comprovante += "Tipo da Pizza: " + pizzaTipo + "\n";
        comprovante += "Sabor: " + sabor.getSabor() + "\n";
        comprovante += "Tamanho: " + descrTamanho + "\n";
        comprovante += "Valor: " + valor.getValor();

        return comprovante;
    }
}