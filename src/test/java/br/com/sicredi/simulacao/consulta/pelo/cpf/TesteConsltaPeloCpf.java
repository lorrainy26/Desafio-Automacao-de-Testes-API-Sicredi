package br.com.sicredi.simulacao.consulta.pelo.cpf;

import br.com.sicredi.simulacao.consulta.ConsultaSimulacoesController;
import org.junit.Test;

import java.io.IOException;
import java.text.ParseException;

public class TesteConsltaPeloCpf {
    @Test
    public void consulta_simulacoes() throws IOException, ParseException {
        String response = ConsultaSimulacaoPeloCpfController.ConsultaSimuacoesPeloCpf("123.999.999-99",200);
        System.out.println(response);
    }
}
