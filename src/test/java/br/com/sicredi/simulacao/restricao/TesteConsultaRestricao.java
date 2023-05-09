package br.com.sicredi.simulacao.restricao;

import org.junit.Test;

import java.io.IOException;
import java.text.ParseException;
import java.util.Map;

public class TesteConsultaRestricao {
    //Map<String, Object> parDetalhes;
   CosultaRestricao ConsultaRestricao = new CosultaRestricao();
   BaseRequest BaseRequest = new BaseRequest();
   String CPF;

    @Test
    public void verifica_restricao_97093236014() throws IOException, ParseException {
        String response = ConsultaRestricao.ConsultaCpfRestricao("97093236014", 200);
        System.out.println(response + System.lineSeparator() + "CPF com restricao");
    }

    @Test
    public void verifica_restricao_60094146012() throws IOException, ParseException {
        String response = ConsultaRestricao.ConsultaCpfRestricao("60094146012", 200);
        System.out.println(response + System.lineSeparator() + "CPF com restricao");
    }

    @Test
    public void verifica_restricao_84809766080() throws IOException, ParseException {
        String response = ConsultaRestricao.ConsultaCpfRestricao("84809766080", 200);
        System.out.println(response + System.lineSeparator() + "CPF com restricao");
    }

    @Test
    public void verifica_restricao_62648716050() throws IOException, ParseException {
        String response = ConsultaRestricao.ConsultaCpfRestricao("62648716050", 200);
        System.out.println(response + System.lineSeparator() + "CPF com restricao");
    }

    @Test
    public 

    //private void criarParametros() {
        //parDetalhes = CriarParamentrosRestricao();
    //    parDetalhes.put("CPF", "97093236014");
   // }
}