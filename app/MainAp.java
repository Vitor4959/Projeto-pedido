package app;

import pedido.Cliente;
import pedido.Produto;
import pedido.Item;
import pedido.Pedido;

public class MainAp {
    public static void main(String[] args) {
        Pedido p1 = criarPedido();
        System.out.println(p1.getCliente().getNome());

    }


        public static Pedido criarPedido(){
            
            Cliente murakami = new Cliente();
            murakami.setId(1);
            murakami.setNome("Murakami");
    
            Produto coca = new Produto();
            coca.setNome("Coca-Cola Zero");
            coca.setVlrUnitario(5.0f);
    
            Produto coxinha = new Produto();
            coxinha.setNome("Coxinha");
            coxinha.setVlrUnitario(10f);


    
            Item item1 = new Item();
            item1.setProduto(coca);
            item1.setQtd(5);
    
            Item item2 = new Item();
            item2.setProduto(coxinha);
            item2.setQtd(100);
    
            Pedido pedido1 = new Pedido();
            pedido1.setId(1l);
            pedido1.setCliente(murakami);
            pedido1.addItem(item1);
            pedido1.addItem(item2);
            pedido1.getValorTotal();
            return pedido1;
        }
}
