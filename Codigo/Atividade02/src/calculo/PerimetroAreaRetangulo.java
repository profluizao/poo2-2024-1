package calculo;

import java.util.Scanner;

import dominio.IOperacao;

public class PerimetroAreaRetangulo implements IOperacao{

    private Double base, altura, perimetro, area;

    public Double getBase() {
        return base;
    }

    public Double getAltura() {
        return altura;
    }

    public Double getPerimetro() {
        return perimetro;
    }

    public Double getArea() {
        return area;
    }
    
    @Override
    public void Executar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a base: ");
        this.base = sc.nextDouble();
        System.out.println("Informe a altura: ");
        this.altura = sc.nextDouble();
        this.perimetro = this.base + this.altura;
        this.area = this.base * this.altura;
        sc.close();
    }

    @Override
    public void Imprimir() {
        System.out.println("Perimetro vale " + this.perimetro + ", Área vale " + this.area);
    }
}
