import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {

    public Moedas Convertendo() {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
<<<<<<< HEAD
                .uri(URI.create("https://v6.exchangerate-api.com/v6/sua_APIKEY/latest/USD")) // Substituir URL conforme necessário
=======
                .uri(URI.create("https://v6.exchangerate-api.com/v6/Sua_APIKEY/latest/USD")) // Substituir URL conforme necessário
>>>>>>> c347ac62f403faac4f8a64070a4bd56d0a6ebefb
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                return new Gson().fromJson(response.body(), Moedas.class);
            } else {
                System.out.println("Erro na requisição: " + response.statusCode());
            }

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        return null;
    }
}
