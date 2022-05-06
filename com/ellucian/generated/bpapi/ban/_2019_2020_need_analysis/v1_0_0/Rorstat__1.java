
package com.ellucian.generated.bpapi.ban._2019_2020_need_analysis.v1_0_0;

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
    "lockInd"
})
@Generated("jsonschema2pojo")
public class Rorstat__1 {

    /**
     * Lock Current
     * <p>
     * Lineage reference object : RORSTAT_LOCK_IND
     * (Required)
     * 
     */
    @JsonProperty("lockInd")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_LOCK_IND")
    private String lockInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lock Current
     * <p>
     * Lineage reference object : RORSTAT_LOCK_IND
     * (Required)
     * 
     */
    @JsonProperty("lockInd")
    public String getLockInd() {
        return lockInd;
    }

    /**
     * Lock Current
     * <p>
     * Lineage reference object : RORSTAT_LOCK_IND
     * (Required)
     * 
     */
    @JsonProperty("lockInd")
    public void setLockInd(String lockInd) {
        this.lockInd = lockInd;
    }

    public Rorstat__1 withLockInd(String lockInd) {
        this.lockInd = lockInd;
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

    public Rorstat__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Rorstat__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("lockInd");
        sb.append('=');
        sb.append(((this.lockInd == null)?"<null>":this.lockInd));
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
        result = ((result* 31)+((this.lockInd == null)? 0 :this.lockInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Rorstat__1) == false) {
            return false;
        }
        Rorstat__1 rhs = ((Rorstat__1) other);
        return (((this.lockInd == rhs.lockInd)||((this.lockInd!= null)&&this.lockInd.equals(rhs.lockInd)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
