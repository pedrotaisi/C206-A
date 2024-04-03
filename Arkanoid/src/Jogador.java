public class Jogador {

    private int pontos;

    public Jogador(){
        this.pontos = 0;
    }
    public int getPontos() {
        return pontos;
    }

    public void destruirBolco(){
        Bloco.blocosDestruidos++;
        Bloco.blocosExistentes--;
        this.pontos = Bloco.blocosDestruidos;
    }

}
