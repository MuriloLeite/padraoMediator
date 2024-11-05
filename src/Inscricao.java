public class Inscricao implements Setor {
    private static Inscricao instancia = new Inscricao();

    private Inscricao() {}

    public static Inscricao getInstancia() {
        return instancia;
    }

    @Override
    public String processarMensagem(String mensagem) {
        return "Inscrição processou: " + mensagem;
    }
}
