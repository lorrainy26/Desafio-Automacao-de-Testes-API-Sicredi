package br.com.sicredi.simulacao.consulta;

import br.com.sicredi.simulacao.simulacoes.BaseMethods;
import br.com.sicredi.simulacao.simulacoes.SimulacaoController;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class ConsultaSimulacoesController {
    public static String ConsultaSimuacoes(Integer statusCode) {
        String endpoint = "http://localhost:8080/api/v1/simulacoes";
        RequestSpecification url = new RequestSpecBuilder().setBaseUri(endpoint).build();
        RestAssured.useRelaxedHTTPSValidation();
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();

        String resDash = given()
                .spec(url)
                .header("Content-Type", "application/json")
                .expect()
                .log().all()
                .statusCode(statusCode)
                .when()
                .get()
                .andReturn()
                .asString();

        return resDash;
    }
}
