public class Comprador {

    private String nome;
    private int saldo;

    public String getNome() {
        return nome;
    }

    public int getSaldo() {
        return saldo;
    }

    public Comprador(String nome, int saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public void efetuarCompra(Brownie brownie){

        if(brownie.getPreco() <= saldo)
            System.out.println("Compra do brownie de " + brownie.getNome() + " efetuada com sucesso");
        else
            System.out.println("saldo insuficiente para a compra do " + brownie.getNome());
    }
}
