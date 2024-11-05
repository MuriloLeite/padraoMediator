import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GestaoEventoTest {
    @Test
    public void testEnviarMensagemLogistica() {
        Participante participante = new Participante();
        String mensagem = "Preciso de informações sobre transporte.";
        String respostaEsperada = "Gestão do Evento agradece sua mensagem.\n" +
                "Logística respondeu: Logística processou: Preciso de informações sobre transporte.";

        String resposta = participante.enviarMensagemLogistica(mensagem);
        assertEquals(respostaEsperada, resposta);
    }

    @Test
    public void testEnviarMensagemPalestras() {
        Participante participante = new Participante();
        String mensagem = "Qual o horário da palestra sobre IA?";
        String respostaEsperada = "Gestão do Evento agradece sua mensagem.\n" +
                "Palestras respondeu: Palestras processou: Qual o horário da palestra sobre IA?";

        String resposta = participante.enviarMensagemPalestras(mensagem);
        assertEquals(respostaEsperada, resposta);
    }

    @Test
    public void testEnviarMensagemInscricao() {
        Participante participante = new Participante();
        String mensagem = "Como faço para me inscrever no evento?";
        String respostaEsperada = "Gestão do Evento agradece sua mensagem.\n" +
                "Inscrição respondeu: Inscrição processou: Como faço para me inscrever no evento?";

        String resposta = participante.enviarMensagemInscricao(mensagem);
        assertEquals(respostaEsperada, resposta);
    }
}
