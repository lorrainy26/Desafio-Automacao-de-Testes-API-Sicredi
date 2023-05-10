package br.com.sicredi.simulacao.remover.simulacao;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class RemoverSimulacaoController {
    public static String RemoverSimulacao(String ID, Integer statusCode) {
        String endpoint = "http://localhost:8080/api/v1/simulacoes/" + ID;
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
                .delete()
                .andReturn()
                .asString();

        return resDash;
    }
}
