package org.alura;

import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConseguirValor {
    public ValorMoneda buscarMonedas(String monedaBase, String monedaElegida) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/00f0b123debfdd33be3770b9/pair/" + monedaBase + "/" + monedaElegida);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(),ValorMoneda.class);
        }catch (Exception e) {
            throw new RuntimeException("Moneda no encontrada");
        }
    }
}
