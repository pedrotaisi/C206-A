
public class Main {
    public static void main(String[] args) {

        Bloco bloco_one = new Bloco();
        Bloco bloco_two = new Bloco();

        Jogador jogador = new Jogador();

        jogador.destruirBolco();

        System.out.println("Blocos existentes: " + Bloco.blocosExistentes);
        System.out.println("Blocos criados: " + Bloco.numBlocos);
        System.out.println("Blocos destruidos: " + Bloco.blocosDestruidos);
        System.out.println("pontuação atual: " + jogador.getPontos());
        Conversor.converter(jogador);



    }
}