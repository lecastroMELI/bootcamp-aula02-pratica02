package distribuidorProdutos;

/*Crie uma classe Produto que possua os seguintes atributos: String nome e
    double preco, ela deve definir os
    métodos getters e setters para seus atributos,
    um construtor que recebe todos os seus atributos como parâmetro e
    o método toString().

    Crie o método calcular() para o qual vamos passar um
    parâmetro do tipo int chamado quantidadeDeProdutos; este método tem que
    multiplicar o preço pela quantidade de produtos passados.*/

public class Produto {
    protected String name;
    protected double price;

    Produto(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void  setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Produto{" +
            "name='" + name + '\'' +
            ", price=" + price +
            '}';
    }

    public double calc(int productsQuantity) {
        return productsQuantity * price;
    }
}
