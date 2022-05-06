
package com.ellucian.generated.bpapi.ban.flexible_spending_accounts_rule.v1_0_0;

import java.util.Date;
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
    "newPeriod",
    "curPeriod"
})
@Generated("jsonschema2pojo")
public class Ptrflex {

    /**
     * Ending Benefit Period
     * <p>
     * Lineage reference object : PTRFLEX_NEW_PERIOD
     * (Required)
     * 
     */
    @JsonProperty("newPeriod")
    @JsonPropertyDescription("Lineage reference object : PTRFLEX_NEW_PERIOD")
    private Date newPeriod;
    /**
     * Current Benefit Period
     * <p>
     * Lineage reference object : PTRFLEX_CUR_PERIOD
     * 
     */
    @JsonProperty("curPeriod")
    @JsonPropertyDescription("Lineage reference object : PTRFLEX_CUR_PERIOD")
    private Date curPeriod;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Ending Benefit Period
     * <p>
     * Lineage reference object : PTRFLEX_NEW_PERIOD
     * (Required)
     * 
     */
    @JsonProperty("newPeriod")
    public Date getNewPeriod() {
        return newPeriod;
    }

    /**
     * Ending Benefit Period
     * <p>
     * Lineage reference object : PTRFLEX_NEW_PERIOD
     * (Required)
     * 
     */
    @JsonProperty("newPeriod")
    public void setNewPeriod(Date newPeriod) {
        this.newPeriod = newPeriod;
    }

    public Ptrflex withNewPeriod(Date newPeriod) {
        this.newPeriod = newPeriod;
        return this;
    }

    /**
     * Current Benefit Period
     * <p>
     * Lineage reference object : PTRFLEX_CUR_PERIOD
     * 
     */
    @JsonProperty("curPeriod")
    public Date getCurPeriod() {
        return curPeriod;
    }

    /**
     * Current Benefit Period
     * <p>
     * Lineage reference object : PTRFLEX_CUR_PERIOD
     * 
     */
    @JsonProperty("curPeriod")
    public void setCurPeriod(Date curPeriod) {
        this.curPeriod = curPeriod;
    }

    public Ptrflex withCurPeriod(Date curPeriod) {
        this.curPeriod = curPeriod;
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

    public Ptrflex withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ptrflex.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("newPeriod");
        sb.append('=');
        sb.append(((this.newPeriod == null)?"<null>":this.newPeriod));
        sb.append(',');
        sb.append("curPeriod");
        sb.append('=');
        sb.append(((this.curPeriod == null)?"<null>":this.curPeriod));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.newPeriod == null)? 0 :this.newPeriod.hashCode()));
        result = ((result* 31)+((this.curPeriod == null)? 0 :this.curPeriod.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ptrflex) == false) {
            return false;
        }
        Ptrflex rhs = ((Ptrflex) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.newPeriod == rhs.newPeriod)||((this.newPeriod!= null)&&this.newPeriod.equals(rhs.newPeriod))))&&((this.curPeriod == rhs.curPeriod)||((this.curPeriod!= null)&&this.curPeriod.equals(rhs.curPeriod))));
    }

}
