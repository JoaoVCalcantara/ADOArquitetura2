
import java.util.List;
import java.util.ArrayList;

public class Pedido {
    private double valorTotal;
    private List<ItemPedido> lista;

    public Pedido() {
        this.lista = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido item) {
        if (Estoque.removerProduto(item.getProduto())) {
            this.lista.add(item);
            this.valorTotal += item.getQuantidade() * item.getProduto().getPreco();
        } else {
            System.out.println("Produto não disponível no estoque.");
        }
    }

    public double calcularTotal() {
        return this.valorTotal;
    }

    public void cupomFiscal() {
        // Implementação do método cupomFiscal
    }
}