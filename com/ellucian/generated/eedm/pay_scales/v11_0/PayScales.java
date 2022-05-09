
package com.ellucian.generated.eedm.pay_scales.v11_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Pay Scales
 * <p>
 * Information on pay for employees at each level.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "code",
    "startOn",
    "endOn",
    "classification",
    "scales"
})
@Generated("jsonschema2pojo")
public class PayScales {

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    @JsonPropertyDescription("Metadata about the JSON payload")
    private Metadata metadata;
    /**
     * ID
     * <p>
     * The global identifier of the pay scale.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the pay scale.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the pay scale.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the pay scale.")
    private String title;
    /**
     * Code
     * <p>
     * The code used to identify the pay scale.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("The code used to identify the pay scale.")
    private String code;
    /**
     * Start On
     * <p>
     * The start date of the pay scale.
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The start date of the pay scale.")
    private Object startOn;
    /**
     * End On
     * <p>
     * The end date of the pay scale.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The end date of the pay scale.")
    private Object endOn;
    /**
     * Classification
     * <p>
     * The classification associated with the pay scale.
     * (Required)
     * 
     */
    @JsonProperty("classification")
    @JsonPropertyDescription("The classification associated with the pay scale.")
    private Classification classification;
    /**
     * Scales
     * <p>
     * The pay structure based on grades with step levels.
     * 
     */
    @JsonProperty("scales")
    @JsonPropertyDescription("The pay structure based on grades with step levels.")
    private List<Scale> scales = new ArrayList<Scale>();

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public PayScales withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the pay scale.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * The global identifier of the pay scale.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public PayScales withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the pay scale.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * The full name of the pay scale.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public PayScales withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Code
     * <p>
     * The code used to identify the pay scale.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * The code used to identify the pay scale.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public PayScales withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Start On
     * <p>
     * The start date of the pay scale.
     * 
     */
    @JsonProperty("startOn")
    public Object getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The start date of the pay scale.
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Object startOn) {
        this.startOn = startOn;
    }

    public PayScales withStartOn(Object startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The end date of the pay scale.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The end date of the pay scale.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public PayScales withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Classification
     * <p>
     * The classification associated with the pay scale.
     * (Required)
     * 
     */
    @JsonProperty("classification")
    public Classification getClassification() {
        return classification;
    }

    /**
     * Classification
     * <p>
     * The classification associated with the pay scale.
     * (Required)
     * 
     */
    @JsonProperty("classification")
    public void setClassification(Classification classification) {
        this.classification = classification;
    }

    public PayScales withClassification(Classification classification) {
        this.classification = classification;
        return this;
    }

    /**
     * Scales
     * <p>
     * The pay structure based on grades with step levels.
     * 
     */
    @JsonProperty("scales")
    public List<Scale> getScales() {
        return scales;
    }

    /**
     * Scales
     * <p>
     * The pay structure based on grades with step levels.
     * 
     */
    @JsonProperty("scales")
    public void setScales(List<Scale> scales) {
        this.scales = scales;
    }

    public PayScales withScales(List<Scale> scales) {
        this.scales = scales;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PayScales.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
        sb.append(',');
        sb.append("classification");
        sb.append('=');
        sb.append(((this.classification == null)?"<null>":this.classification));
        sb.append(',');
        sb.append("scales");
        sb.append('=');
        sb.append(((this.scales == null)?"<null>":this.scales));
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
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.scales == null)? 0 :this.scales.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.classification == null)? 0 :this.classification.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PayScales) == false) {
            return false;
        }
        PayScales rhs = ((PayScales) other);
        return (((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.scales == rhs.scales)||((this.scales!= null)&&this.scales.equals(rhs.scales))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.classification == rhs.classification)||((this.classification!= null)&&this.classification.equals(rhs.classification))));
    }

}
