public class Brownie {

    protected String nome;
    protected double preco;
    protected  String sabor;

    public Brownie(String nome, double preco, String sabor) {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public void addCarinhoDeCompra(){
        System.out.println("o produto " + nome + " foi adicionado");
    }

    public void calculaValorTotalCompra(){
        System.out.println("o valor da sua compra foi de: " + preco);
    }

    public void mostrarInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Sabor: " + sabor);
    }


}
