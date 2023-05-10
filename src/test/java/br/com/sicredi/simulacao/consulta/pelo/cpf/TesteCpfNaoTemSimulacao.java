package br.com.sicredi.simulacao.consulta.pelo.cpf;

import org.junit.Test;

import java.io.IOException;
import java.text.ParseException;

public class TesteCpfNaoTemSimulacao {
    @Test
    public void consulta_cpf_nao_encontrado() throws IOException, ParseException {
        String response = ConsultaSimulacaoPeloCpfController.ConsultaSimuacoesPeloCpf("111.111.111-11",404);
        System.out.println(response);
    }
}
