public class GestaoEvento {

    private static GestaoEvento instancia = new GestaoEvento();

    private GestaoEvento() {}

    public static GestaoEvento getInstancia() {
        return instancia;
    }

    public String receberMensagemLogistica(String mensagem) {
        return "Gestão do Evento agradece sua mensagem.\n" +
                "Logística respondeu: " +
                Logistica.getInstancia().processarMensagem(mensagem);
    }

    public String receberMensagemPalestras(String mensagem) {
        return "Gestão do Evento agradece sua mensagem.\n" +
                "Palestras respondeu: "  +
                Palestras.getInstancia().processarMensagem(mensagem);
    }

    public String receberMensagemInscricao(String mensagem) {
        return "Gestão do Evento agradece sua mensagem.\n" +
                "Inscrição respondeu: " +
                Inscricao.getInstancia().processarMensagem(mensagem);
    }
}
