package calculo;

import dominio.IOperacao;

public class AntecessorSucessor implements IOperacao {
    private int v1, ant, suc;

    public AntecessorSucessor(int v1){
        this.v1 = v1;
    }

    @Override
    public void Executar() {
        ant = v1-1;
        suc = v1+1;
    }

    @Override
    public void Imprimir() {
        System.out.println("Antecessor vale " + ant + ", Sucessor vale " + suc);
    }
}
