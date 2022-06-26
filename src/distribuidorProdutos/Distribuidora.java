package distribuidorProdutos;

public class Distribuidora {
    public static void main(String[] args) {
        ProdutosPereciveis produto = new ProdutosPereciveis("morango", 9.90, 1);

        double result = produto.calc(1);

        System.out.println(result);
    }
}
