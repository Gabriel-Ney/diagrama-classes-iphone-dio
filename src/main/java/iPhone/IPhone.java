package iPhone;

import iPhone.Funcoes.AparelhoTelefonico;
import iPhone.Funcoes.NavegadorInternet;
import iPhone.Funcoes.ReprodutorMusical;

public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    boolean desbloquearAparelho;

    //Aparelho Telefonico
    @Override
    public String ligarParaAlguem(String numero) {
        return ("Ligando para o contato de número: " + numero);
    }

    @Override
    public String atenderLigacao() {
        return ("Atendeno ligação");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado");
    }

    @Override
    public void selecionarMusica() {

    }


    public void desbloquearAparelho() {

        System.out.println ("Aparelho Desbloqueado");
    }



    //Navegador internet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina atualizada!");
    }

    //Reprodutor Musical


    @Override
    public String tocarMusica() {
        return ("Tocando música");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Nova aba adicionada!");
    }

    @Override
    public String selecionarMusica(String musica) {
        return("Musica selecionada: "+ musica);
    }


    public boolean isDesbloquearAparelho() {
        return desbloquearAparelho;
    }

    public void setDesbloquearAparelho(boolean desbloquearAparelho) {
        this.desbloquearAparelho = desbloquearAparelho;
    }
}
