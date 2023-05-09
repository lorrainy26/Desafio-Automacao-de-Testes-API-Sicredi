package br.com.sicredi.simulacao.restricao;


import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class CosultaRestricao {
    public static String ConsultaCpfRestricao(String CPF,Integer statusCode) {
        String endpoint = "http://localhost:8080/api/v1/restricoes/" + CPF;
        RequestSpecification url = new RequestSpecBuilder().setBaseUri(endpoint).build();
        RestAssured.useRelaxedHTTPSValidation();
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();

        String response = RestAssured.given()
                .spec(url)
                .expect()
                .statusCode(statusCode)
                .when()
                .get()
                .andReturn()
                .asString();

        return response;
    }
}
