package br.com.sicredi.simulacao.alteracao.simulacao;

import br.com.sicredi.simulacao.simulacoes.BaseMethods;
import br.com.sicredi.simulacao.simulacoes.SimulacaoController;
import org.junit.Test;

import java.io.IOException;
import java.text.ParseException;

public class TesteAlteracaoDoCpf {
   BaseMethods BaseMethods = new BaseMethods();
   AlteracaoController AlteracaoController = new AlteracaoController();
    @Test
    public void verifica_alteracao_cpf() throws IOException, org.json.simple.parser.ParseException {
        String response = AlteracaoController.AlteracaoCadastro("999.999.999-99", 200, this.BaseMethods.lerJson("/alteracao/AlteracaoDoCpf.json").toString());
        System.out.println(response);

    }
}
