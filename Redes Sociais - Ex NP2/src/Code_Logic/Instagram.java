package Code_Logic;

public class Instagram extends RedeSocial {

    public Instagram(String name, int numAmigos) {
        super(name, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Instagram");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou uma video no Instagram");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou uma comentario no Instagram");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("curtir publicacao no Instagram");
    }
}

