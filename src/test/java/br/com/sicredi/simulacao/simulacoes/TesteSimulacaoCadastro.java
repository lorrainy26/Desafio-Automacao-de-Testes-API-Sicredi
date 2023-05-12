package br.com.sicredi.simulacao.simulacoes;

import org.junit.Test;

import java.io.IOException;


public class TesteSimulacaoCadastro {
    BaseMethods BaseMethods = new BaseMethods();
    @Test
    public void verifica_formato_cpf() throws IOException, org.json.simple.parser.ParseException {
        String response = SimulacaoController.SimulacaoDados(201, this.BaseMethods.lerJson("/simulacao/SimulacaoCadastro.json").toString());
        System.out.println(response);

    }

    @Test
    public void verifica_nome_valido() throws IOException, org.json.simple.parser.ParseException {
        String response = SimulacaoController.SimulacaoDados(201, this.BaseMethods.lerJson("/simulacao/SimulacaoCadastro.json").toString());
        System.out.print(response);
    }

   @Test
    public void verifica_nome_invalido() throws IOException, org.json.simple.parser.ParseException {
        String response = SimulacaoController.SimulacaoDados(400, this.BaseMethods.lerJson("/simulacao/SimulacaoNomeInvalido.json").toString());
        System.out.print(response);
    }

    @Test
    public void verifica_email_valido() throws IOException, org.json.simple.parser.ParseException {
        String response = SimulacaoController.SimulacaoDados(201, this.BaseMethods.lerJson("/simulacao/SimulacaoCadastro.json").toString());
        System.out.print(response);
    }

    @Test
    public void verifica_email_invalido() throws IOException, org.json.simple.parser.ParseException {
        String response = SimulacaoController.SimulacaoDados(400, this.BaseMethods.lerJson("/simulacao/SimulacaoEmailinvalido.json").toString());
        System.out.print(response);
    }

    @Test
    public void verifica_valor_valido() throws IOException, org.json.simple.parser.ParseException {
        String response = SimulacaoController.SimulacaoDados(201, this.BaseMethods.lerJson("/simulacao/SimulacaoCadastro.json").toString());
        System.out.print(response);
    }

    @Test
    public void verifica_valor_invalido_menor_que_1000() throws IOException, org.json.simple.parser.ParseException {
        String response = SimulacaoController.SimulacaoDados(400, this.BaseMethods.lerJson("/simulacao/SimulacaoValorMenorQueMil.json").toString());
        System.out.print(response);
    }

    @Test
    public void verifica_valor_invalido_maior_que_40000() throws IOException, org.json.simple.parser.ParseException {
        String response = SimulacaoController.SimulacaoDados(400, this.BaseMethods.lerJson("/simulacao/SimulacaoValorMaior.json").toString());
        System.out.print(response);
    }

    @Test
    public void verifica_parcela_menor_que_dois() throws IOException, org.json.simple.parser.ParseException {
        String response = SimulacaoController.SimulacaoDados(400, this.BaseMethods.lerJson("/simulacao/SimulacaoParcelaMenor.json").toString());
        System.out.print(response);
    }

    @Test
    public void verifica_parcela_maior() throws IOException, org.json.simple.parser.ParseException {
        String response = SimulacaoController.SimulacaoDados(400, this.BaseMethods.lerJson("/simulacao/SimulacaoParcelaMaior.json").toString());
        System.out.print(response);
    }

    @Test
    public void verifica_parcela() throws IOException, org.json.simple.parser.ParseException {
        String response = SimulacaoController.SimulacaoDados(200, this.BaseMethods.lerJson("/simulacao/SimulacaoCadastro.json").toString());
        System.out.print(response);
    }

    @Test
    public void verifica_seguro_ativo() throws IOException, org.json.simple.parser.ParseException {
        String response = SimulacaoController.SimulacaoDados(200, this.BaseMethods.lerJson("/simulacao/SimulacaoCadastro.json").toString());
        System.out.print(response);
    }

    @Test
    public void verifica_seguro_invativo() throws IOException, org.json.simple.parser.ParseException {
        String response = SimulacaoController.SimulacaoDados(200, this.BaseMethods.lerJson("/simulacao/SimulacaoCadastro.json").toString());
        System.out.print(response);
    }

}
