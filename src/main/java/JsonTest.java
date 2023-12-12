import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import static util.JsonReader.readJsonFromUrl;

public class JsonTest {

    public static void main(String[] args) throws JSONException, IOException {

        //Exemplo URL via cep correios, mas pode ser qualquer outra que retorne um json.
        String URL = "https://viacep.com.br/ws/04755050/json/";

        //Aqui vc seta a url que contem o json
        JSONObject origem = readJsonFromUrl(URL);

        //Aqui vc digita a propriedade(chave) do qual vc deseja extrair o resultado
        String logradouro = origem.getString("logradouro");

        System.out.println(logradouro);
    }
}
