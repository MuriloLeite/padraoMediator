public class Logistica implements Setor {
    private static Logistica instancia = new Logistica();

    private Logistica() {}

    public static Logistica getInstancia() {
        return instancia;
    }

    @Override
    public String processarMensagem(String mensagem) {
        return "Logística processou: " + mensagem;
    }
}
