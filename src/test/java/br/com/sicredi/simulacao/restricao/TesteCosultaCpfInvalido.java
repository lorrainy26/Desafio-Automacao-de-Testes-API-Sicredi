package br.com.sicredi.simulacao.restricao;

import org.junit.Test;

import java.io.IOException;
import java.text.ParseException;

public class TesteCosultaCpfInvalido {
    CosultaRestricaoController ConsultaRestricao = new CosultaRestricaoController();
    String CPF;

    @Test
    public void CpfInvalido() throws IOException, ParseException {
        String response = ConsultaRestricao.ConsultaCpfRestricao("999999999", 204); //Aceitando CPF com menos de 11 digitos o correto seria que nao validasse esse cpf
        System.out.println(response + System.lineSeparator() + "CPF invalido verifique se contém 11 digitos.");
    }
}
