package br.com.sicredi.simulacao.alteracao.simulacao;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class AlteracaoController {
    public static String AlteracaoCadastro(String CPF, Integer statusCode, String body) {
        String endpoint = "http://localhost:8080/api/v1/simulacoes/" + CPF;
        RequestSpecification url = new RequestSpecBuilder().setBaseUri(endpoint).build();
        RestAssured.useRelaxedHTTPSValidation();
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();

        String resDash = given()
                .spec(url)
                .header("Content-Type", "application/json")
                .body(body)
                .expect()
                .log().all()
                .statusCode(statusCode)
                .when()
                .put()
                .andReturn()
                .asString();

        return resDash;
    }
}
