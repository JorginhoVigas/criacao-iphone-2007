public class Main {
    public static void main(String[] args) {

        iPhone meuIphone = new iPhone();

        // Teste do reprodutor musical
        meuIphone.selecionarMusica("Zero - Liniker - Cru");
        meuIphone.tocar();
        meuIphone.pausar();

        System.out.println();

        // Teste do aparelho telefônico
        meuIphone.ligar("11-99403-2967");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        System.out.println();

        // Teste do navegador de internet
        meuIphone.exibirPagina("https://github.com/JorginhoVigas");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}