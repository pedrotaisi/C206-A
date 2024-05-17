package Code_Logic;
import Exceptions.ContaJaCriada;
import Exceptions.SemRedeSocial;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        Facebook facebook = new Facebook("Facebook", 200);
        Twitter twitter = new Twitter("twitter", 400);
        GooglePlus googlePlus = new GooglePlus("googlePlus", 800);
        Instagram instagram = new Instagram("instagram", 900);

        HashSet<RedeSocial> Rs = new HashSet<>();

        Usuario usuario = new Usuario("Marcelo", "Marcelo@gmail.com", Rs);

        try{
            usuario.add(googlePlus);
            usuario.add(twitter);
            usuario.add(instagram);
            usuario.add(facebook);
        }catch (ContaJaCriada e){
            System.out.println("Erro: " + e.getMessage());
        }finally {
            System.out.println("Operacao concluida com sucesso!");
        }

        System.out.println();

        usuario.chamarMetodos();

        System.out.println();

       try {
           usuario.MostraInfo();
       }catch (SemRedeSocial e){
           System.out.println("Erro: " + e.getMessage());
       }finally {
           System.out.println("Operacao concluida com sucesso!");
       }

    }
}