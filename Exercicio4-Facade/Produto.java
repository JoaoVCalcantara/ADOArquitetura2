public class Produto {
    private int codigo;
    private double preco;
    private String categoria;

    public Produto(int codigo, double preco, String categoria) {
        this.codigo = codigo;
        this.preco = preco;
        this.categoria = categoria;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}