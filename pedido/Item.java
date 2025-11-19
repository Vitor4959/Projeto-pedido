package pedido;

public class Item {
    private Integer qtd;
    private Produto produto;

    public Float getValorTotal() {
        return qtd * produto.getVlrUnitario();
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
