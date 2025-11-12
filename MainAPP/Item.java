public class Item {
    private Integer qtd;
    private Produto produto;

    public Float getValorTotal() {
        return qtd * produto.getVlrUnitario();
    }

    public int getQyc() {
        return qtd;
    }

    public void setQyc(int qyc) {
        this.qtd = qyc;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
