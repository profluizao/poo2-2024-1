package dominio;

public abstract class BasePessoa {
    protected int codigo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public BasePessoa(int codigo) {
        this.codigo = codigo;
    }
}
