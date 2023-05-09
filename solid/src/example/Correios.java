package example;

public class Correios implements Transportadora {

    @Override
    public void calcularFrete(Venda venda) {
        // calcula frete
        if (venda.getEntrega().equalsIgnoreCase("Sarandi")) {
            venda.setFrete(15);
        } else {
            venda.setFrete(30);
        }
    }
}
