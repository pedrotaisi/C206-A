package Inimigo;

public class Asteroide {
    private String nome;
    private String tipoAsteroide;

    public String getTipoAsteroide() {
        return tipoAsteroide;
    }

    public Asteroide(String nome, String tipoAsteroide) {
        this.nome = nome;
        this.tipoAsteroide = tipoAsteroide;
    }

    public void Destruir(){
        System.out.println("Asteroide destruido");
    }
}
