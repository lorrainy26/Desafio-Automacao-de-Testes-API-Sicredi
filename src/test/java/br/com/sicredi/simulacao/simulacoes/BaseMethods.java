package br.com.sicredi.simulacao.simulacoes;

        import org.json.simple.JSONObject;
        import org.json.simple.parser.JSONParser;
        import org.json.simple.parser.ParseException;
        import java.io.FileReader;
        import java.io.IOException;
public class BaseMethods {
    public JSONObject lerJson(String jsonName) throws IOException, ParseException {
        JSONObject jsonObject = null;
        JSONParser jsonParser = new JSONParser();
        jsonObject = (org.json.simple.JSONObject) jsonParser.parse(new FileReader(System.getProperty("user.dir") + "/src/test/resources/" + jsonName));
        return jsonObject;
    }

}
