package com.aoher.model.response;

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
 *         &lt;element name="ordername" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "ordername"
})
@XmlRootElement(name = "addOrderResponse")
public class AddOrderResponse {

    @XmlElement(required = true)
    protected String orderName;

    /**
     * Gets the value of the orderName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOrderName() {
        return orderName;
    }

    /**
     * Sets the value of the orderName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOrderName(String value) {
        this.orderName = value;
    }
}