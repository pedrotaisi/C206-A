
public class Main {
    public static void main(String[] args) {

        Brownie cafe = new BrownieDeCafe("delicia de cafe", 12, "cafe");
        Brownie nutella = new BrownieNutella("delicia de nutella", 18, "nutella");
        Brownie doceDeLeite = new BrownieDoceDeLeite("delicia de Doce de leite", 15, "doce de leite");

        System.out.println("addCarinhoDeCompra:");
        cafe.addCarinhoDeCompra();
        nutella.addCarinhoDeCompra();
        doceDeLeite.addCarinhoDeCompra();

        System.out.println();

        System.out.println("calculaValorTotalCompra");
        cafe.calculaValorTotalCompra();
        nutella.calculaValorTotalCompra();
        doceDeLeite.calculaValorTotalCompra();

        System.out.println();

        System.out.println("adicionado mais ingredientes: ");

        if(cafe instanceof BrownieDeCafe){
            BrownieDeCafe brownieCafe = (BrownieDeCafe) cafe;
            brownieCafe.adicionarCafe();
        }

        if(nutella instanceof BrownieNutella){
            BrownieNutella brownienutella = (BrownieNutella) nutella;
            brownienutella.adicionarNutella();
        }

        if(doceDeLeite instanceof BrownieDoceDeLeite){
            BrownieDoceDeLeite browniedocedeleite = (BrownieDoceDeLeite) doceDeLeite;
            browniedocedeleite.adicionarDoceDeLeite();
        }

        System.out.println();


        System.out.println("mostrando informações:");
        System.out.println();

        System.out.println("Cafe:");
        cafe.mostrarInfo();

        System.out.println();

        System.out.println("Doce de leite: ");
        doceDeLeite.mostrarInfo();

        System.out.println();

        System.out.println("Nutella: ");
        nutella.mostrarInfo();

    }
}