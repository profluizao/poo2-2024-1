import calculo.Cliente;
import calculo.Soma;

public class App {
    public static void main(String[] args) throws Exception {
        // Soma op = new Soma(15, 55);
        // op.Executar();
        // op.Imprimir();

        Cliente cl = new Cliente(20);
        cl.Executar();
        cl.Imprimir();
    }
}
