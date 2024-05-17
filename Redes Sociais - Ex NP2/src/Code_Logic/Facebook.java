package Code_Logic;

public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento {
    public Facebook(String name, int numAmigos) {
        super(name, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Facebook");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou uma video no Facebook");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou uma comentario no Facebook");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fez um Streaming no Facebook");
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getNumAmigos() {
        return super.getNumAmigos();
    }

    @Override
    public void compartilhar() {
        System.out.println("compartilhamento no Facebook");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("curtir publicacao no Facebook");
    }
}

