package br.com.sicredi.simulacao.remover.simulacao;

import br.com.sicredi.simulacao.consulta.pelo.cpf.ConsultaSimulacaoPeloCpfController;
import org.junit.Test;

import java.io.IOException;


public class TesteRemoverSimulacao {
    @Test
    public void remover_simulacao() throws IOException {
        String response = RemoverSimulacaoController.RemoverSimulacao("11", 200);
        System.out.println(response);
    }
}
