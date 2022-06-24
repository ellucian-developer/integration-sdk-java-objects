
package com.ellucian.generated.bpapi.ban.test_score_information.v0_1_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "disMaxValue",
    "disMessage",
    "disMinValue",
    "disTest",
    "disPositions",
    "disTypeDesc"
})
@Generated("jsonschema2pojo")
public class Distest {

    /**
     * -
     * <p>
     * Lineage reference object : disMaxValue
     * 
     */
    @JsonProperty("disMaxValue")
    @JsonPropertyDescription("Lineage reference object : disMaxValue")
    private String disMaxValue;
    /**
     * Lineage reference object : disMessage
     * 
     */
    @JsonProperty("disMessage")
    @JsonPropertyDescription("Lineage reference object : disMessage")
    private String disMessage;
    /**
     * characters in range of
     * <p>
     * Lineage reference object : disMinValue
     * 
     */
    @JsonProperty("disMinValue")
    @JsonPropertyDescription("Lineage reference object : disMinValue")
    private String disMinValue;
    /**
     * Lineage reference object : disTest
     * 
     */
    @JsonProperty("disTest")
    @JsonPropertyDescription("Lineage reference object : disTest")
    private String disTest;
    /**
     * Scores can be a maximum of
     * <p>
     * Lineage reference object : disPositions
     * 
     */
    @JsonProperty("disPositions")
    @JsonPropertyDescription("Lineage reference object : disPositions")
    private String disPositions;
    /**
     * -
     * <p>
     * Lineage reference object : disTypeDesc
     * 
     */
    @JsonProperty("disTypeDesc")
    @JsonPropertyDescription("Lineage reference object : disTypeDesc")
    private String disTypeDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * -
     * <p>
     * Lineage reference object : disMaxValue
     * 
     */
    @JsonProperty("disMaxValue")
    public String getDisMaxValue() {
        return disMaxValue;
    }

    /**
     * -
     * <p>
     * Lineage reference object : disMaxValue
     * 
     */
    @JsonProperty("disMaxValue")
    public void setDisMaxValue(String disMaxValue) {
        this.disMaxValue = disMaxValue;
    }

    public Distest withDisMaxValue(String disMaxValue) {
        this.disMaxValue = disMaxValue;
        return this;
    }

    /**
     * Lineage reference object : disMessage
     * 
     */
    @JsonProperty("disMessage")
    public String getDisMessage() {
        return disMessage;
    }

    /**
     * Lineage reference object : disMessage
     * 
     */
    @JsonProperty("disMessage")
    public void setDisMessage(String disMessage) {
        this.disMessage = disMessage;
    }

    public Distest withDisMessage(String disMessage) {
        this.disMessage = disMessage;
        return this;
    }

    /**
     * characters in range of
     * <p>
     * Lineage reference object : disMinValue
     * 
     */
    @JsonProperty("disMinValue")
    public String getDisMinValue() {
        return disMinValue;
    }

    /**
     * characters in range of
     * <p>
     * Lineage reference object : disMinValue
     * 
     */
    @JsonProperty("disMinValue")
    public void setDisMinValue(String disMinValue) {
        this.disMinValue = disMinValue;
    }

    public Distest withDisMinValue(String disMinValue) {
        this.disMinValue = disMinValue;
        return this;
    }

    /**
     * Lineage reference object : disTest
     * 
     */
    @JsonProperty("disTest")
    public String getDisTest() {
        return disTest;
    }

    /**
     * Lineage reference object : disTest
     * 
     */
    @JsonProperty("disTest")
    public void setDisTest(String disTest) {
        this.disTest = disTest;
    }

    public Distest withDisTest(String disTest) {
        this.disTest = disTest;
        return this;
    }

    /**
     * Scores can be a maximum of
     * <p>
     * Lineage reference object : disPositions
     * 
     */
    @JsonProperty("disPositions")
    public String getDisPositions() {
        return disPositions;
    }

    /**
     * Scores can be a maximum of
     * <p>
     * Lineage reference object : disPositions
     * 
     */
    @JsonProperty("disPositions")
    public void setDisPositions(String disPositions) {
        this.disPositions = disPositions;
    }

    public Distest withDisPositions(String disPositions) {
        this.disPositions = disPositions;
        return this;
    }

    /**
     * -
     * <p>
     * Lineage reference object : disTypeDesc
     * 
     */
    @JsonProperty("disTypeDesc")
    public String getDisTypeDesc() {
        return disTypeDesc;
    }

    /**
     * -
     * <p>
     * Lineage reference object : disTypeDesc
     * 
     */
    @JsonProperty("disTypeDesc")
    public void setDisTypeDesc(String disTypeDesc) {
        this.disTypeDesc = disTypeDesc;
    }

    public Distest withDisTypeDesc(String disTypeDesc) {
        this.disTypeDesc = disTypeDesc;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Distest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Distest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("disMaxValue");
        sb.append('=');
        sb.append(((this.disMaxValue == null)?"<null>":this.disMaxValue));
        sb.append(',');
        sb.append("disMessage");
        sb.append('=');
        sb.append(((this.disMessage == null)?"<null>":this.disMessage));
        sb.append(',');
        sb.append("disMinValue");
        sb.append('=');
        sb.append(((this.disMinValue == null)?"<null>":this.disMinValue));
        sb.append(',');
        sb.append("disTest");
        sb.append('=');
        sb.append(((this.disTest == null)?"<null>":this.disTest));
        sb.append(',');
        sb.append("disPositions");
        sb.append('=');
        sb.append(((this.disPositions == null)?"<null>":this.disPositions));
        sb.append(',');
        sb.append("disTypeDesc");
        sb.append('=');
        sb.append(((this.disTypeDesc == null)?"<null>":this.disTypeDesc));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
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
        result = ((result* 31)+((this.disMaxValue == null)? 0 :this.disMaxValue.hashCode()));
        result = ((result* 31)+((this.disMessage == null)? 0 :this.disMessage.hashCode()));
        result = ((result* 31)+((this.disMinValue == null)? 0 :this.disMinValue.hashCode()));
        result = ((result* 31)+((this.disTest == null)? 0 :this.disTest.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.disPositions == null)? 0 :this.disPositions.hashCode()));
        result = ((result* 31)+((this.disTypeDesc == null)? 0 :this.disTypeDesc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Distest) == false) {
            return false;
        }
        Distest rhs = ((Distest) other);
        return ((((((((this.disMaxValue == rhs.disMaxValue)||((this.disMaxValue!= null)&&this.disMaxValue.equals(rhs.disMaxValue)))&&((this.disMessage == rhs.disMessage)||((this.disMessage!= null)&&this.disMessage.equals(rhs.disMessage))))&&((this.disMinValue == rhs.disMinValue)||((this.disMinValue!= null)&&this.disMinValue.equals(rhs.disMinValue))))&&((this.disTest == rhs.disTest)||((this.disTest!= null)&&this.disTest.equals(rhs.disTest))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.disPositions == rhs.disPositions)||((this.disPositions!= null)&&this.disPositions.equals(rhs.disPositions))))&&((this.disTypeDesc == rhs.disTypeDesc)||((this.disTypeDesc!= null)&&this.disTypeDesc.equals(rhs.disTypeDesc))));
    }

}
