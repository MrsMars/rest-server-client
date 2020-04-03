package com.aoher.model;

import com.aoher.model.request.AddOrderRequest;
import com.aoher.model.request.GetSearchRequest;
import com.aoher.model.response.AddOrderResponse;
import com.aoher.model.response.GetSearchResponse;

import javax.xml.bind.annotation.XmlRegistry;

/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.myapp.ws.model package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.myapp.ws.model
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetSearchRequest }
     */
    public GetSearchRequest createGetSearchRequest() {
        return new GetSearchRequest();
    }

    /**
     * Create an instance of {@link GetSearchResponse }
     */
    public GetSearchResponse createGetSearchResponse() {
        return new GetSearchResponse();
    }

    /**
     * Create an instance of {@link Order }
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link AddOrderRequest }
     */
    public AddOrderRequest createAddOrderRequest() {
        return new AddOrderRequest();
    }

    /**
     * Create an instance of {@link AddOrderResponse }
     */
    public AddOrderResponse createAddOrderResponse() {
        return new AddOrderResponse();
    }
}