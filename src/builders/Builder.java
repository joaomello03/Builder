package builders;

import pizza.PizzaTipo;
import componentes.Tamanho;
import componentes.Sabor;
import componentes.Valor;

public interface Builder {
    void setPizzaTipo(PizzaTipo tipo);
    void setSabor(Sabor sabor);
    void setTamanho(Tamanho tamanho);
    void setValor(Valor valor);
}