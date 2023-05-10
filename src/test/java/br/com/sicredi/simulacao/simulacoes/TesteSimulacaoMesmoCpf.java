package br.com.sicredi.simulacao.simulacoes;

import org.junit.Test;

import java.io.IOException;
import java.text.ParseException;

public class TesteSimulacaoMesmoCpf {
    BaseMethods BaseMethods = new BaseMethods();
    @Test
    public void verifica_o_mesmo_cpf() throws IOException, ParseException, org.json.simple.parser.ParseException {
        String response = SimulacaoController.SimulacaoDados(400, this.BaseMethods.lerJson("/simulacao/SimulaoCpfExistente.json").toString());
        System.out.println(response);

    }
}
