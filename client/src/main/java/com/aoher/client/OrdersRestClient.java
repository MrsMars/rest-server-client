package com.aoher.client;

import com.aoher.model.Order;
import org.glassfish.jersey.client.ClientConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Component
public class OrdersRestClient {

    private static final String NAMESPACE = "http://localhost:8003/api";

    public List<Order> getOrders() {
        Client client = ClientBuilder.newClient(new ClientConfig());
        WebTarget webTarget = client.target(NAMESPACE).path("orderapi");

        Response response = webTarget.path("/blackberry").request(APPLICATION_JSON).get();
        return response.readEntity(List.class);
    }
}
