package br.com.sicredi.simulacao.consulta;

import org.junit.Test;

import java.io.IOException;
import java.text.ParseException;

public class TesteNaoExisteSimulacao {
    @Test
    public void nao_existe_simulacao() throws IOException, ParseException {
        String response = ConsultaSimulacoesController.ConsultaSimuacoes(204);
        System.out.println(response);
    }
}
