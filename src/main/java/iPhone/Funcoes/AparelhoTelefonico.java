package iPhone.Funcoes;

public interface AparelhoTelefonico {
    boolean statusEnergia = false;

    public String ligarParaAlguem(String numero);
    public String atenderLigacao();
    public void iniciarCorreioVoz();


    //Reprodutor Musical
    void selecionarMusica();
}
