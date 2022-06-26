package distribuidorProdutos;

/*Crie a classe Pereciveis, que terá um atributo chamado diasParaVencer do tipo
    int, igual a classe produto, defina setters, getters, um construtor que recebe
    todos os atributos por parâmetro e o método toString().

    Essa classe deve
    herdar da classe Produto e sobrescrever o método calcular(), que deve fazer o
    mesmo que a classe Produto (multiplicar o preço pelo número de produtos) e,
    adicionalmente, reduzir o preço de acordo com o diasParaVencer:

    a. Se faltar um (1) dia para expirar, o preço final será reduzido em 4 vezes.

    b. Se faltarem dois (2) dias para expirar, o preço final será reduzido em 3
    vezes.
    c. Se faltarem 3 dias (3) para expirar, metade do seu preço final será
    reduzido.*/

public class ProdutosPereciveis extends Produto {
    protected  int expirationDay;

    public ProdutosPereciveis(String name, double price, int expirationDay) {
        super(name, price);
        this.expirationDay = expirationDay;
    }

    public int getExpirationDay() {
        return expirationDay;
    }

    public void setExpirationDay(int expirationDay) {
        this.expirationDay = expirationDay;
    }

    @Override
    public String toString() {
        return "ProdutosPereciveis{" +
            "Dias para vencer: =" + expirationDay +
            '}';
    }

    @Override
    public double calc(int productsQuantity) {
        double totalPrice = 0;
        double result = super.calc(productsQuantity);
        if(expirationDay == 1) {
            totalPrice = result - 4;
        } else {
            if(expirationDay == 2) {
                totalPrice = result - 3;
            } else {
                totalPrice = result / 2;
            }
        }
        return totalPrice;
    }
}
