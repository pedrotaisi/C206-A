public class BrownieDoceDeLeite extends Brownie {

    public BrownieDoceDeLeite(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionarDoceDeLeite() {
        System.out.println("Doce de leite adicionado");
    }

    @Override
    public void addCarinhoDeCompra() {
        System.out.println("Um brownie de doce de leite foi adicionado");
    }
}
