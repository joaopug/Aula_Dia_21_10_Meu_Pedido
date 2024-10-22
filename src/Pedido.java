import java.util.ArrayList;
import java.util.List;

public class Pedido {

    public int numeroPedido;

    public int codigoCliente;

    public double valor;

    // Cria uma lista da classe "ItemPedido"
    // Essas listas são infinitas
    public List<ItemPedido> itensPedido;

    public void criarPedido(){

        this.numeroPedido = 0;
        this.valor = 50;
        this.itensPedido = new ArrayList<>();
    }

    public void adicionarItem(int codigo, int quantidade, double valor){
        ItemPedido item = new ItemPedido();
        item.sequeciaItem = this.itensPedido.size() + 1;
        item.codigoItem = codigo;
        item.quantidade = quantidade;
        item.valor = valor;

        // Pega a função "valor" e define que ela terá o valor dela (começando em 0) mais o valor do próximo item com a quantidade dele vezes o valor do item em si
        this.valor += item.quantidade * item.valor;

        this.itensPedido.add(item);
    }
}
