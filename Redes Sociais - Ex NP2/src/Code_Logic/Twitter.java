package Code_Logic;

public class Twitter extends RedeSocial implements Compartilhamento {
    public Twitter(String name, int numAmigos) {
        super(name, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Twitter");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou uma video no Twitter");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou uma comentario no Twitter");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou uma midia no Twitter");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("curtir uma publicacao no Twitter");
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



