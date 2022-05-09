
package com.ellucian.generated.eedm.accounting_string_formats.v8_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "component",
    "order"
})
@Generated("jsonschema2pojo")
public class Component {

    /**
     * Component
     * <p>
     * An accounting string component that is part of a valid accounting string.
     * (Required)
     * 
     */
    @JsonProperty("component")
    @JsonPropertyDescription("An accounting string component that is part of a valid accounting string.")
    private Component__1 component;
    /**
     * Order
     * <p>
     * The position of the accounting component within a valid accounting string.
     * (Required)
     * 
     */
    @JsonProperty("order")
    @JsonPropertyDescription("The position of the accounting component within a valid accounting string.")
    private Integer order;

    /**
     * Component
     * <p>
     * An accounting string component that is part of a valid accounting string.
     * (Required)
     * 
     */
    @JsonProperty("component")
    public Component__1 getComponent() {
        return component;
    }

    /**
     * Component
     * <p>
     * An accounting string component that is part of a valid accounting string.
     * (Required)
     * 
     */
    @JsonProperty("component")
    public void setComponent(Component__1 component) {
        this.component = component;
    }

    public Component withComponent(Component__1 component) {
        this.component = component;
        return this;
    }

    /**
     * Order
     * <p>
     * The position of the accounting component within a valid accounting string.
     * (Required)
     * 
     */
    @JsonProperty("order")
    public Integer getOrder() {
        return order;
    }

    /**
     * Order
     * <p>
     * The position of the accounting component within a valid accounting string.
     * (Required)
     * 
     */
    @JsonProperty("order")
    public void setOrder(Integer order) {
        this.order = order;
    }

    public Component withOrder(Integer order) {
        this.order = order;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Component.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("component");
        sb.append('=');
        sb.append(((this.component == null)?"<null>":this.component));
        sb.append(',');
        sb.append("order");
        sb.append('=');
        sb.append(((this.order == null)?"<null>":this.order));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.component == null)? 0 :this.component.hashCode()));
        result = ((result* 31)+((this.order == null)? 0 :this.order.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Component) == false) {
            return false;
        }
        Component rhs = ((Component) other);
        return (((this.component == rhs.component)||((this.component!= null)&&this.component.equals(rhs.component)))&&((this.order == rhs.order)||((this.order!= null)&&this.order.equals(rhs.order))));
    }

}
