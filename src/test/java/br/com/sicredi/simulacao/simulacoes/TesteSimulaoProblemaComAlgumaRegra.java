package br.com.sicredi.simulacao.simulacoes;

import org.junit.Test;

import java.io.IOException;


public class TesteSimulaoProblemaComAlgumaRegra {
    BaseMethods BaseMethods = new BaseMethods();
    @Test
    public void verifica_problema_com_regra() throws IOException, org.json.simple.parser.ParseException {
        String response = SimulacaoController.SimulacaoDados(400, this.BaseMethods.lerJson("/simulacao/SimulacaoRegraInvalida.json").toString());
        System.out.println(response);

    }
}
