package br.com.sicredi.simulacao.consulta.pelo.cpf;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class ConsultaSimulacaoPeloCpfController {
    public static String ConsultaSimuacoesPeloCpf(String CPF, Integer statusCode) {
        String endpoint = "http://localhost:8080/api/v1/simulacoes/" + CPF;
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
