package example;

public class RodoNaves implements Transportadora {

    @Override
    public void calcularFrete(Venda venda) {
        // calcula frete
        if (venda.getEntrega().equalsIgnoreCase("Maringa")) {
            venda.setFrete(10);
        } else {
            venda.setFrete(40);
        }
    }
}
