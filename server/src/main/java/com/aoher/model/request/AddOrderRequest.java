package com.aoher.model.request;

import com.aoher.model.Order;

import javax.xml.bind.annotation.*;

/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="order" type="{http://myapp.com/orders/}Order"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "order"
})
@XmlRootElement(name = "addOrderRequest")
public class AddOrderRequest {

    @XmlElement(required = true)
    protected Order order;

    /**
     * Gets the value of the order property.
     *
     * @return possible object is
     * {@link Order }
     */
    public Order getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     *
     * @param value allowed object is
     *              {@link Order }
     */
    public void setOrder(Order value) {
        this.order = value;
    }

}