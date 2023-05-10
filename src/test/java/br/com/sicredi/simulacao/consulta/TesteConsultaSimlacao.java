package br.com.sicredi.simulacao.consulta;

import org.junit.Test;

import java.io.IOException;
import java.text.ParseException;

public class TesteConsultaSimlacao {
    @Test
    public void consulta_simulacoes() throws IOException, ParseException {
        String response = ConsultaSimulacoesController.ConsultaSimuacoes(200);
        System.out.println(response);
    }
}
