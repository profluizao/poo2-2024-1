package calculo;

import java.util.Scanner;

import dominio.IOperacao;

public class ReajustePoupanca implements IOperacao{
    private Double saldo, reajuste;

    public Double getSaldo() {
        return saldo;
    }

    public Double getReajuste() {
        return reajuste;
    }

    @Override
    public void Executar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o saldo: ");
        this.saldo = sc.nextDouble();
        this.reajuste = (this.saldo * 0.02) + this.saldo;
        sc.close();
    }

    @Override
    public void Imprimir() {
        System.out.println("O saldo reajustado vale " + this.reajuste);
    }
}
