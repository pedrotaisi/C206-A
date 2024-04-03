public class Conta {

    private int numero;
    private float saldo;
    private float limite;

    Cliente []cliente = new Cliente[5];

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    public float getSaldo() {
        return saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public void sacar(float quantia){

        if(quantia < saldo){
            this.saldo -= quantia;
            System.out.println("valor sacado: " + quantia);
        }else
        {
            System.out.println("saldo insuficiente");
        }
    }

    public void depositar(float quantia){
        this.saldo += quantia;
        System.out.println("valor depositado " + quantia);
    }
}
