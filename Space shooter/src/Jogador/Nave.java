package Jogador;


import Inimigo.Asteroide;

public class Nave {
    private String nome;
    private double vida;
    private String tipoTiro;

    public Nave(String nome, double vida, String tipoTiro) {
        this.nome = nome;
        this.vida = vida;
        this.tipoTiro = tipoTiro;
    }

    public void Atirar(Asteroide ast) {

        if((ast.getTipoAsteroide() == "grande") && (this.tipoTiro == "normal")){
            System.out.println("nao é possivel destruir");
        } else {
           ast.Destruir();
        }
    }
}
