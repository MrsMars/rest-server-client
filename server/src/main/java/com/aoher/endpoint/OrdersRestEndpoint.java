package com.aoher.endpoint;

import com.aoher.model.Order;
import com.aoher.service.OrdersService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("orderapi")
@Api(value = "OrderService", produces = "application/json")
public class OrdersRestEndpoint {

    @Autowired
    private OrdersService service;

    @GET
    @Path("{productName}")
    @Produces({
            MediaType.APPLICATION_JSON,
            MediaType.APPLICATION_XML
    })
    @ApiOperation(value = "Find Order By name", response = List.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Resource found"),
            @ApiResponse(code = 404, message = "Resource not found")
    })
    public Response findByProductName(@PathParam("productName") String productName) {
        return Response.status(Response.Status.CREATED).entity(service.findByName(productName)).build();
    }

    @POST
    @Produces({
            MediaType.APPLICATION_JSON,
            MediaType.APPLICATION_XML
    })
    public String addNewOrder(Order order) {
        return service.addNewProduct(order);
    }

    @PUT
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public String updateExistingOrder(Order order) {
        return service.update(order);
    }

    @DELETE
    @Path("{id}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public String deleteExistingOrder(@PathParam("id") int productId) {
        return service.delete(productId);
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Order> findAllProducts() {
        return service.findAll();
    }
}
