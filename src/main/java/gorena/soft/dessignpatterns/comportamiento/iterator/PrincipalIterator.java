package gorena.soft.dessignpatterns.comportamiento.iterator;

import java.util.ArrayList;
import java.util.List;

import gorena.soft.dessignpatterns.comportamiento.iterator.entity.Facebook;
import gorena.soft.dessignpatterns.comportamiento.iterator.entity.Perfil;
import gorena.soft.dessignpatterns.comportamiento.iterator.interfaces.RedSocial;

public class PrincipalIterator {

    public static void main(String[] args) {

        RedSocial redSocial;
        redSocial = new Facebook(crearPerfilesPrueba());

        SocialSpammer spammer = new SocialSpammer(redSocial);
        spammer.enviarSpamAmigos("anna.smith@bing.com", "Mensaje de prueba de un amigo");
        spammer.enviarSpamColaboradores("anna.smith@bing.com", "Mensaje de prueba a colaboradores");

    }

    public static List<Perfil> crearPerfilesPrueba() {
        List<Perfil> data = new ArrayList<Perfil>();
        data.add(new Perfil("anna.smith@bing.com", "Anna Smith", "friends:mad_max@ya.com", "friends:catwoman@yahoo.com",
                "coworkers:sam@amazon.com"));
        data.add(new Perfil("mad_max@ya.com", "Maximilian", "friends:anna.smith@bing.com", "coworkers:sam@amazon.com"));
        data.add(new Perfil("bill@microsoft.eu", "Billie", "coworkers:avanger@ukr.net"));
        data.add(new Perfil("avanger@ukr.net", "John Day", "coworkers:bill@microsoft.eu"));
        data.add(new Perfil("sam@amazon.com", "Sam Kitting", "coworkers:anna.smith@bing.com",
                "coworkers:mad_max@ya.com", "friends:catwoman@yahoo.com"));
        data.add(new Perfil("catwoman@yahoo.com", "Liza", "friends:anna.smith@bing.com", "friends:sam@amazon.com"));
        return data;

    }
}
