package calculo;

import dominio.IOperacao;

public class Produto extends BaseCalculo implements IOperacao{

    public Produto(int v1, int v2) {
        super(v1, v2);
    }

    @Override
    public void Executar() {
        res = v1 * v2;
    }

    @Override
    public void Imprimir() {
        System.out.println("O resultado da operação de produto é: " + res);
    }
}
