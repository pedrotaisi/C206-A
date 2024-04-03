import Inimigo.Asteroide;
import Jogador.Nave;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Nave nave_one = new Nave("jorge", 1000, "explosivo");
        Nave nave_two = new Nave("cleiton", 1000, "normal");

        Asteroide asteroide_one = new Asteroide("ast", "grande");
        Asteroide asteroide_two = new Asteroide("asr", "pequeno");

        nave_one.Atirar(asteroide_one);
        nave_one.Atirar(asteroide_two);
        nave_two.Atirar(asteroide_two);
        nave_two.Atirar(asteroide_one);

    }
}