package pedido;
import java.util.ArrayList;

public  class Pedido {
    private Long  id;
    private Cliente cliente;
    private ArrayList<Item>itens = new ArrayList<>();


    public Float getValorTotal(){
        Float total = 0f;

        for(Item item : getItens()) {

            total = total + item.getValorTotal();
        }

        return total;
    }

    public void addItem(Item item){
        getItens().add(item);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }
}