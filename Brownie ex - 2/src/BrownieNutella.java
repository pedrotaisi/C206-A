public class BrownieNutella extends Brownie{

    public BrownieNutella(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionarNutella(){
        System.out.println("Nutella adicionada");
    }

    @Override
    public void addCarinhoDeCompra() {
        System.out.println("Um Brownie de nutella foi adicionado");
    }
}
