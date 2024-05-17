package Code_Logic;
import Exceptions.ContaJaCriada;
import Exceptions.SemRedeSocial;
import java.util.HashSet;
import java.util.Iterator;

public class Usuario {
    private String nome;
    private String email;
    private HashSet<RedeSocial> n_redesSociais;

    public Usuario(String nome, String email, HashSet<RedeSocial> Rs) {
        this.nome = nome;
        this.email = email;
        this.n_redesSociais = Rs;
    }

    public void add(RedeSocial Rs) throws ContaJaCriada {

        if(n_redesSociais.contains(Rs)){
            throw new ContaJaCriada("Conta já existe");
        }else{
            n_redesSociais.add(Rs);
        }
    }

    public void chamarMetodos(){

        Iterator<RedeSocial> it = n_redesSociais.iterator();

        while(it.hasNext() ){

            RedeSocial Rs = it.next();

            if (Rs instanceof GooglePlus) {
                GooglePlus googlePlus = (GooglePlus) Rs;
                googlePlus.fazStreaming();
                googlePlus.compartilhar();
                googlePlus.curtirPublicacao();
            } else if (Rs instanceof Facebook) {
                Facebook facebook = (Facebook) Rs;
                facebook.fazStreaming();
                facebook.compartilhar();
                facebook.curtirPublicacao();
            }else{
                Rs.postarVideo();
                Rs.postarComentario();
                Rs.postarFoto();
            }

            System.out.println();
            System.out.println("----------");
            System.out.println();

        }

    }

    public void MostraInfo() throws SemRedeSocial {
        System.out.println("Informacao sobre o usuario");
        System.out.println();
        System.out.println("nome do usuario: " + this.nome);
        System.out.println("Email do usuario: " + this.email);
        System.out.println("numero de redes sociais: " + n_redesSociais.size());

        System.out.println();
        System.out.println("-------------------");
        System.out.println();

        if(n_redesSociais.isEmpty()){
            throw new SemRedeSocial("Sem redes sociais cadastradas");
        }else{
            System.out.println("Informacoes sobre as redes socias cadastradas");
            System.out.println();
            for(RedeSocial Rs : n_redesSociais){
                System.out.println("Nome: " + Rs.getName());
                System.out.println("numero de seguidore: " + Rs.numAmigos);
                System.out.println();
            }

        }
    }
}
