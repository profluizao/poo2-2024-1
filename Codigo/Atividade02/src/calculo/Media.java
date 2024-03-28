package calculo;

import dominio.IOperacao;

public class Media extends BaseCalculo implements IOperacao{
    private int v3;

    public Media(int v1, int v2, int v3) {
        super(v1, v2);
        this.v3 = v3;
    }

    @Override
    public void Executar() {
        res = (v1 + v2 + v3) / 3;
    }

    @Override
    public void Imprimir() {
        System.out.println("O resultado da média entre três valores é: " + res);
    }
}
