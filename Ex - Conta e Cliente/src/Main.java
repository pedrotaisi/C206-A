//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Conta conta =  new Conta();
        conta.cliente[0] = new Cliente();

        conta.cliente[0].setNome("pedro");
        conta.cliente[0].setCpf(1234567);

        conta.setNumero(12);
        conta.setLimite(7000);

        conta.depositar(10000);
        conta.sacar(7000);

        System.out.println("valor restante: " + conta.getSaldo());


    }
}