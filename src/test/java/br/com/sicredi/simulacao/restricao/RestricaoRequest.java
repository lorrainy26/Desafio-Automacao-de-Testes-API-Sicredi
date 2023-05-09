package br.com.sicredi.simulacao.restricao;

import br.com.sicredi.simulacao.ParametrosRequest;
import io.restassured.response.ExtractableResponse;
import org.apache.http.HttpStatus;

public class RestricaoRequest {
    private ParametrosRequest parametrosRequest = new ParametrosRequest();
    private BaseRequest baseRequest = new BaseRequest();

    public String getRestricao() {
        parametrosRequest.baseUri = "http://localhost:8080";
        parametrosRequest.pathUri = "/api/v1/restricoes";

        ExtractableResponse resultadoResponse = baseRequest.ChamadaRequestGet(parametrosRequest);
        if (resultadoResponse.statusCode() == HttpStatus.SC_INTERNAL_SERVER_ERROR) {
            throw new IllegalArgumentException("Api fora do ar ou com algum problema" + resultadoResponse.statusCode());
        }
        return resultadoResponse.asString();
    }


}
