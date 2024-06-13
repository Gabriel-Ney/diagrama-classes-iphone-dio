package iPhone.Usuario;

import iPhone.IPhone;
import iPhone.Funcoes.ReprodutorMusical;
import iPhone.Funcoes.NavegadorInternet;
import iPhone.Funcoes.AparelhoTelefonico;

public class Usuario {
    public static void main(String[] args) {

        IPhone iphone_1 = new IPhone();

        iphone_1.desbloquearAparelho();

        System.out.println(iphone_1.selecionarMusica("MC poze do rodo"));
        System.out.println(iphone_1.tocarMusica());
        System.out.println(iphone_1.atenderLigacao());

    }
}