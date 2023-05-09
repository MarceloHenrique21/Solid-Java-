package example;

public class Caixa {

    private final EmissorNF emissorNF;
    private final IntegracaoEstoque integracaoEstoque;
    private final Transportadora transportadora;

    public Caixa(Transportadora transportadora) {
        this.emissorNF = new EmissorNF();
        this.integracaoEstoque = new IntegracaoEstoque();
        this.transportadora = transportadora;
    }

    public Venda faturar(Venda venda) {

        // calula frete
        transportadora.calcularFrete(venda);

        //calcula desconto
        venda.aplicaDesconto();


        //outras chamadas
        this.emissorNF.emitir();
        this.integracaoEstoque.integrar();

        return venda;
    }

}
