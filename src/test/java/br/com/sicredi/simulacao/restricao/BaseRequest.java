package br.com.sicredi.simulacao.restricao;


import br.com.sicredi.simulacao.ParametrosRequest;
import com.fasterxml.classmate.types.ResolvedArrayType;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class BaseRequest {

    //Map<String, Object> baseParametros;
    private RequestSpecification dataSpec(String url ) {
        RequestSpecification specRequest = new RequestSpecBuilder()
                .setBaseUri(url)
                .setRelaxedHTTPSValidation()
                .build();
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        return specRequest;
    }

    public ExtractableResponse<Response> ChamadaRequestGet(ParametrosRequest params) {
        ExtractableResponse response =
                given()
                        .spec(dataSpec(params.baseUri))
                        .contentType(params.contentType)
                        .headers(params.headers)
                        .when()
                        .get(params.pathUri)
                        .then()
                        .extract();
        return response;
    }

   // public Map<String, Object> CriarParamentrosRestricao() {
     //   baseParametros = new HashMap<String, Object>();
       // baseParametros.put("CPF", "97093236014");
       // return baseParametros;
    //}
}
