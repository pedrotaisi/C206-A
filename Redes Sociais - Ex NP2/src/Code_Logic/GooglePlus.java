package Code_Logic;

public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento {
    public GooglePlus(String name, int numAmigos) {
        super(name, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Google Plus");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou uma video no Google Plus");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou uma comentario no Google Plus");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Faz streaming no Google Plus");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhamento no Google Plus");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("curtir publicacao no Google Plus");
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getNumAmigos() {
        return super.getNumAmigos();
    }
}
