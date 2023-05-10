package br.com.sicredi.simulacao.alteracao.simulacao;

import br.com.sicredi.simulacao.simulacoes.BaseMethods;
import org.junit.Test;

import java.io.IOException;

public class TesteAlteracaoCpfNaoEncontrado {
    br.com.sicredi.simulacao.simulacoes.BaseMethods BaseMethods = new BaseMethods();
    AlteracaoController AlteracaoController = new AlteracaoController();
    @Test
    public void verifica_alteracao_cpf() throws IOException, org.json.simple.parser.ParseException {
        String response = AlteracaoController.AlteracaoCadastro("999.999.999-11", 404, this.BaseMethods.lerJson("/alteracao/AlteracaoDoCpf.json").toString());
        System.out.println(response);

    }
}
