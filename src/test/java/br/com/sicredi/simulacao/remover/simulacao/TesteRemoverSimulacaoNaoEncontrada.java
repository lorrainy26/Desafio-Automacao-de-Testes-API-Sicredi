package br.com.sicredi.simulacao.remover.simulacao;

import org.junit.Test;

import java.io.IOException;
import java.text.ParseException;

public class TesteRemoverSimulacaoNaoEncontrada {
    @Test
    public void remover_simulacao_nao_encontrada() throws IOException {
        String response = RemoverSimulacaoController.RemoverSimulacao("11", 404);
        System.out.println(response);
    }
}
