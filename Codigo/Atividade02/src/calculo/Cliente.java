package calculo;

import java.util.Scanner;

import dominio.BasePessoa;
import dominio.IOperacao;

public class Cliente extends BasePessoa implements IOperacao{
    private String nome;
    private String endereco;
    private String telefone;

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }    

    public Cliente(int codigo) {
        super(codigo);
    }

    @Override
    public void Executar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome: ");
        this.nome = sc.nextLine();
        System.out.println("Endereço: ");
        this.endereco = sc.nextLine();
        System.out.println("Telefone: ");
        this.telefone = sc.nextLine();
        sc.close();
    }

    @Override
    public void Imprimir() {
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Telefone: " + this.telefone);
    }
}
