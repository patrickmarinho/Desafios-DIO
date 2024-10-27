package DesafioUML;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorDeInternet{
    private String numero;
    private String modelo;

    public Iphone (String numero, String modelo){
        this.numero = numero;
        this.modelo = modelo;
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música.");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música " + musica);
    }

    /*
        Getters e Setters
     */
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public static void main(String[] args) {
        Iphone iphone = new Iphone("12345-6789", "Iphone 11");
        //Reprodutor Musical
        iphone.selecionarMusica("Imagine - John Lennon");
        iphone.tocar();
        iphone.pausar();

        // Aparelho Telefonico
        iphone.ligar("00000-0000");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Navegador de internet
        iphone.exibirPagina("google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
