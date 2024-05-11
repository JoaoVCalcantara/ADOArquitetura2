import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private Produto produto;
    private int quantidade;
    private static List<Estoque> baseDados = new ArrayList<>();

    public Estoque(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        baseDados.add(this);
    }

    public Produto getProduto() {
        return this.produto;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public static List<Estoque> getBaseDados() {
        return baseDados;
    }

    public static void adicionarProduto(Produto produto, int quantidade) {
        baseDados.add(new Estoque(produto, quantidade));
    }

    public static boolean removerProduto(Produto produto) {
        for (Estoque estoque : baseDados) {
            if (estoque.getProduto().equals(produto)) {
                if (estoque.getQuantidade() > 0) {
                    estoque.quantidade--;
                    return true;
                }
            }
        }
        return false;
    }
}