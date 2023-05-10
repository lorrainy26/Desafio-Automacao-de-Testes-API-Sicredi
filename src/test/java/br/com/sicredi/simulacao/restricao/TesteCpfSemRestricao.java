package br.com.sicredi.simulacao.restricao;

import org.junit.Test;

import java.io.IOException;
import java.text.ParseException;

public class TesteCpfSemRestricao {
    CosultaRestricaoController ConsultaRestricao = new CosultaRestricaoController();
    String CPF;

    @Test
    public void CpfSemRestricao() throws IOException, ParseException {
        String response = ConsultaRestricao.ConsultaCpfRestricao("99999999999", 204);
        System.out.println(response + System.lineSeparator() + "CPF sem restricao");
    }
}
