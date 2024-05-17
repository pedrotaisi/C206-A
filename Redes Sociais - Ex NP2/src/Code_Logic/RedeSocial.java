package Code_Logic;

public abstract class RedeSocial {

    protected String name;
    protected int numAmigos;

    public RedeSocial(String name, int numAmigos) {
        this.name = name;
        this.numAmigos = numAmigos;
    }

    public abstract void postarFoto();

    public abstract void postarVideo();

    public abstract void postarComentario();

    public void curtirPublicacao(){

    }

    public String getName() {
        return name;
    }

    public int getNumAmigos() {
        return numAmigos;
    }


}
