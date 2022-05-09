
package com.ellucian.generated.eedm.proposed_planned_gifts.v13_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "description",
    "type",
    "amount",
    "percentage"
})
@Generated("jsonschema2pojo")
public class Beneficiary {

    /**
     * Name
     * <p>
     * The name of the beneficiary.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of the beneficiary.")
    private String name;
    /**
     * Description
     * <p>
     * The description of the beneficiary.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the beneficiary.")
    private String description;
    /**
     * Type
     * <p>
     * The type of the beneficiary, e.g.: family, charitable organization, etc.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of the beneficiary, e.g.: family, charitable organization, etc.")
    private Object type;
    /**
     * Amount
     * <p>
     * The amount of the planned gift that the beneficiary will receive.
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("The amount of the planned gift that the beneficiary will receive.")
    private Object amount;
    /**
     * Percentage
     * <p>
     * The percentage of the planned gift that the beneficiary will receive.
     * 
     */
    @JsonProperty("percentage")
    @JsonPropertyDescription("The percentage of the planned gift that the beneficiary will receive.")
    private Object percentage;

    /**
     * Name
     * <p>
     * The name of the beneficiary.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name
     * <p>
     * The name of the beneficiary.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Beneficiary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the beneficiary.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the beneficiary.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Beneficiary withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Type
     * <p>
     * The type of the beneficiary, e.g.: family, charitable organization, etc.
     * 
     */
    @JsonProperty("type")
    public Object getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of the beneficiary, e.g.: family, charitable organization, etc.
     * 
     */
    @JsonProperty("type")
    public void setType(Object type) {
        this.type = type;
    }

    public Beneficiary withType(Object type) {
        this.type = type;
        return this;
    }

    /**
     * Amount
     * <p>
     * The amount of the planned gift that the beneficiary will receive.
     * 
     */
    @JsonProperty("amount")
    public Object getAmount() {
        return amount;
    }

    /**
     * Amount
     * <p>
     * The amount of the planned gift that the beneficiary will receive.
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Object amount) {
        this.amount = amount;
    }

    public Beneficiary withAmount(Object amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Percentage
     * <p>
     * The percentage of the planned gift that the beneficiary will receive.
     * 
     */
    @JsonProperty("percentage")
    public Object getPercentage() {
        return percentage;
    }

    /**
     * Percentage
     * <p>
     * The percentage of the planned gift that the beneficiary will receive.
     * 
     */
    @JsonProperty("percentage")
    public void setPercentage(Object percentage) {
        this.percentage = percentage;
    }

    public Beneficiary withPercentage(Object percentage) {
        this.percentage = percentage;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Beneficiary.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("percentage");
        sb.append('=');
        sb.append(((this.percentage == null)?"<null>":this.percentage));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.percentage == null)? 0 :this.percentage.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Beneficiary) == false) {
            return false;
        }
        Beneficiary rhs = ((Beneficiary) other);
        return ((((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.percentage == rhs.percentage)||((this.percentage!= null)&&this.percentage.equals(rhs.percentage))));
    }

}
