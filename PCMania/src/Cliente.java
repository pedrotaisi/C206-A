public class Cliente {

    long cpf;
    String nome;

    Computador[] computador = new Computador[5];


    public float calculaTotalCompra(){

        float soma = 0;

        for (Computador value : computador) {

            if (value != null)
                soma += value.preco;
        }

        return soma;
    }
}
