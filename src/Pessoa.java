public class Pessoa {
    public String enviarMensagemLogistica(String mensagem) {
        return GestaoEvento.getInstancia().receberMensagemLogistica(mensagem);
    }

    public String enviarMensagemPalestras(String mensagem) {
        return GestaoEvento.getInstancia().receberMensagemPalestras(mensagem);
    }

    public String enviarMensagemInscricao(String mensagem) {
        return GestaoEvento.getInstancia().receberMensagemInscricao(mensagem);
    }
}
