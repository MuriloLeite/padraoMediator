public class Palestras implements Setor {
    private static Palestras instancia = new Palestras();

    private Palestras() {}

    public static Palestras getInstancia() {
        return instancia;
    }

    @Override
    public String processarMensagem(String mensagem) {
        return "Palestras processou: " + mensagem;
    }
}
