import java.util.List;
import java.util.ArrayList;

public class LojaFacade {
    private List<Produto> produtos;
    private List<Pedido> pedidos;

    public LojaFacade() {
        this.produtos = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }

    public Produto criarProduto(int codigo, double preco, String categoria) {
        Produto produto = new Produto(codigo, preco, categoria);
        this.produtos.add(produto);
        return produto;
    }

    public void adicionarEstoque(Produto produto, int quantidade) {
        Estoque.adicionarProduto(produto, quantidade);
    }

    public Pedido criarPedido() {
        Pedido pedido = new Pedido();
        this.pedidos.add(pedido);
        return pedido;
    }

    public void adicionarItem(Pedido pedido, Produto produto, int quantidade) {
        ItemPedido item = new ItemPedido(quantidade, produto);
        pedido.adicionarItem(item);
    }
    public void imprimirProdutos() {
        for (Produto produto : this.produtos) {
            System.out.println("Produto: " + produto.getCodigo() + ", Preço: " + produto.getPreco() + ", Categoria: " + produto.getCategoria());
        }
    }

    public void imprimirPedidos() {
        for (Pedido pedido : this.pedidos) {
            System.out.println("Pedido: " + pedido.calcularTotal());
        }
    }
}