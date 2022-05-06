
package com.ellucian.generated.bpapi.ban.certification_information.v1_0_0;

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
    "endsDesc",
    "endsCode",
    "endsDate"
})
@Generated("jsonschema2pojo")
public class Pprend__1 {

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("endsDesc")
    private String endsDesc;
    /**
     * Endorsement Code
     * <p>
     * Lineage reference object : PPRENDS_ENDS_CODE, Lookup lineage reference object : ptvends
     * (Required)
     * 
     */
    @JsonProperty("endsCode")
    @JsonPropertyDescription("Lineage reference object : PPRENDS_ENDS_CODE, Lookup lineage reference object : ptvends")
    private String endsCode;
    /**
     * Endorsement Date
     * <p>
     * Lineage reference object : PPRENDS_ENDS_DATE
     * (Required)
     * 
     */
    @JsonProperty("endsDate")
    @JsonPropertyDescription("Lineage reference object : PPRENDS_ENDS_DATE")
    private Date endsDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("endsDesc")
    public String getEndsDesc() {
        return endsDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("endsDesc")
    public void setEndsDesc(String endsDesc) {
        this.endsDesc = endsDesc;
    }

    public Pprend__1 withEndsDesc(String endsDesc) {
        this.endsDesc = endsDesc;
        return this;
    }

    /**
     * Endorsement Code
     * <p>
     * Lineage reference object : PPRENDS_ENDS_CODE, Lookup lineage reference object : ptvends
     * (Required)
     * 
     */
    @JsonProperty("endsCode")
    public String getEndsCode() {
        return endsCode;
    }

    /**
     * Endorsement Code
     * <p>
     * Lineage reference object : PPRENDS_ENDS_CODE, Lookup lineage reference object : ptvends
     * (Required)
     * 
     */
    @JsonProperty("endsCode")
    public void setEndsCode(String endsCode) {
        this.endsCode = endsCode;
    }

    public Pprend__1 withEndsCode(String endsCode) {
        this.endsCode = endsCode;
        return this;
    }

    /**
     * Endorsement Date
     * <p>
     * Lineage reference object : PPRENDS_ENDS_DATE
     * (Required)
     * 
     */
    @JsonProperty("endsDate")
    public Date getEndsDate() {
        return endsDate;
    }

    /**
     * Endorsement Date
     * <p>
     * Lineage reference object : PPRENDS_ENDS_DATE
     * (Required)
     * 
     */
    @JsonProperty("endsDate")
    public void setEndsDate(Date endsDate) {
        this.endsDate = endsDate;
    }

    public Pprend__1 withEndsDate(Date endsDate) {
        this.endsDate = endsDate;
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

    public Pprend__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Pprend__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("endsDesc");
        sb.append('=');
        sb.append(((this.endsDesc == null)?"<null>":this.endsDesc));
        sb.append(',');
        sb.append("endsCode");
        sb.append('=');
        sb.append(((this.endsCode == null)?"<null>":this.endsCode));
        sb.append(',');
        sb.append("endsDate");
        sb.append('=');
        sb.append(((this.endsDate == null)?"<null>":this.endsDate));
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
        result = ((result* 31)+((this.endsCode == null)? 0 :this.endsCode.hashCode()));
        result = ((result* 31)+((this.endsDate == null)? 0 :this.endsDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.endsDesc == null)? 0 :this.endsDesc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Pprend__1) == false) {
            return false;
        }
        Pprend__1 rhs = ((Pprend__1) other);
        return (((((this.endsCode == rhs.endsCode)||((this.endsCode!= null)&&this.endsCode.equals(rhs.endsCode)))&&((this.endsDate == rhs.endsDate)||((this.endsDate!= null)&&this.endsDate.equals(rhs.endsDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.endsDesc == rhs.endsDesc)||((this.endsDesc!= null)&&this.endsDesc.equals(rhs.endsDesc))));
    }

}
