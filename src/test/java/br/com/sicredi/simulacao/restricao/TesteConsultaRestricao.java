package br.com.sicredi.simulacao.restricao;

import org.junit.Test;

import java.io.IOException;
import java.text.ParseException;

public class TesteConsultaRestricao {
   CosultaRestricaoController ConsultaRestricao = new CosultaRestricaoController();

    @Test
    public void verifica_restricao_97093236014() throws IOException {
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
    public void verifica_restricao_26276298085() throws IOException, ParseException {
        String response = ConsultaRestricao.ConsultaCpfRestricao("26276298085", 200);
        System.out.println(response + System.lineSeparator() + "CPF com restricao");
    }

    @Test
    public void verifica_restricao_01317496094() throws IOException, ParseException {
        String response = ConsultaRestricao.ConsultaCpfRestricao("01317496094", 200);
        System.out.println(response + System.lineSeparator() + "CPF com restricao");
    }

    @Test
    public void verifica_restricao_55856777050() throws IOException, ParseException{
        String response = ConsultaRestricao.ConsultaCpfRestricao("55856777050", 200);
        System.out.println(response + System.lineSeparator() + "CPF com restricao");
    }

    @Test
    public void verifia_restricao_19626829001() throws IOException, ParseException {
        String response = ConsultaRestricao.ConsultaCpfRestricao("19626829001", 200);
        System.out.println(response + System.lineSeparator() + "CPF com restricao");
    }

    @Test
    public void verifica_restricao_24094592008() throws IOException, ParseException {
        String response = ConsultaRestricao.ConsultaCpfRestricao("24094592008", 200);
        System.out.println(response + System.lineSeparator() + "CPF com restricao");
    }

    @Test
    public void verifica_restricao_58063164083() throws IOException, ParseException {
        String response = ConsultaRestricao.ConsultaCpfRestricao("58063164083", 200);
        System.out.println(response + System.lineSeparator() + "CPF com restricao");
    }

}