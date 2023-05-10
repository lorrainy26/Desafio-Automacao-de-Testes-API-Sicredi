package br.com.sicredi.simulacao.simulacoes;

import org.junit.Test;

import java.io.IOException;
import java.text.ParseException;

public class TesteSimulacaoCadastro {
    BaseMethods BaseMethods = new BaseMethods();
    @Test
    public void verifica_formato_cpf() throws IOException, ParseException, org.json.simple.parser.ParseException {
        String response = SimulacaoController.SimulacaoDados(201, this.BaseMethods.lerJson("/simulacao/SimulacaoCadastro.json").toString());
        System.out.println(response);

    }
}
