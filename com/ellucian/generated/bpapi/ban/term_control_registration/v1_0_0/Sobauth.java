
package com.ellucian.generated.bpapi.ban.term_control_registration.v1_0_0;

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
    "SobauthRegAuthClosedInd",
    "stvrovrDesc",
    "daysRequired",
    "rovrCode",
    "daysReusable",
    "regAuthActiveInd"
})
@Generated("jsonschema2pojo")
public class Sobauth {

    /**
     * Disable Before Start Date
     * <p>
     * Lineage reference object : SOBAUTH_REG_AUTH_CLOSED_IND
     * 
     */
    @JsonProperty("SobauthRegAuthClosedInd")
    @JsonPropertyDescription("Lineage reference object : SOBAUTH_REG_AUTH_CLOSED_IND")
    private String sobauthRegAuthClosedInd;
    @JsonProperty("stvrovrDesc")
    private String stvrovrDesc;
    /**
     * Days Required Relative to Start Date
     * <p>
     * Lineage reference object : SOBAUTH_DAYS_REQUIRED
     * 
     */
    @JsonProperty("daysRequired")
    @JsonPropertyDescription("Lineage reference object : SOBAUTH_DAYS_REQUIRED")
    private Double daysRequired;
    /**
     * Permit-Override Code
     * <p>
     * Lineage reference object : SOBAUTH_ROVR_CODE, Lookup lineage reference object : stvrovr,sfrrovr
     * 
     */
    @JsonProperty("rovrCode")
    @JsonPropertyDescription("Lineage reference object : SOBAUTH_ROVR_CODE, Lookup lineage reference object : stvrovr,sfrrovr")
    private String rovrCode;
    /**
     * Days Reusable after Assignment
     * <p>
     * Lineage reference object : SOBAUTH_DAYS_REUSABLE
     * 
     */
    @JsonProperty("daysReusable")
    @JsonPropertyDescription("Lineage reference object : SOBAUTH_DAYS_REUSABLE")
    private Double daysReusable;
    /**
     * Active for Term
     * <p>
     * Lineage reference object : SOBAUTH_REG_AUTH_ACTIVE_IND
     * 
     */
    @JsonProperty("regAuthActiveInd")
    @JsonPropertyDescription("Lineage reference object : SOBAUTH_REG_AUTH_ACTIVE_IND")
    private String regAuthActiveInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Disable Before Start Date
     * <p>
     * Lineage reference object : SOBAUTH_REG_AUTH_CLOSED_IND
     * 
     */
    @JsonProperty("SobauthRegAuthClosedInd")
    public String getSobauthRegAuthClosedInd() {
        return sobauthRegAuthClosedInd;
    }

    /**
     * Disable Before Start Date
     * <p>
     * Lineage reference object : SOBAUTH_REG_AUTH_CLOSED_IND
     * 
     */
    @JsonProperty("SobauthRegAuthClosedInd")
    public void setSobauthRegAuthClosedInd(String sobauthRegAuthClosedInd) {
        this.sobauthRegAuthClosedInd = sobauthRegAuthClosedInd;
    }

    public Sobauth withSobauthRegAuthClosedInd(String sobauthRegAuthClosedInd) {
        this.sobauthRegAuthClosedInd = sobauthRegAuthClosedInd;
        return this;
    }

    @JsonProperty("stvrovrDesc")
    public String getStvrovrDesc() {
        return stvrovrDesc;
    }

    @JsonProperty("stvrovrDesc")
    public void setStvrovrDesc(String stvrovrDesc) {
        this.stvrovrDesc = stvrovrDesc;
    }

    public Sobauth withStvrovrDesc(String stvrovrDesc) {
        this.stvrovrDesc = stvrovrDesc;
        return this;
    }

    /**
     * Days Required Relative to Start Date
     * <p>
     * Lineage reference object : SOBAUTH_DAYS_REQUIRED
     * 
     */
    @JsonProperty("daysRequired")
    public Double getDaysRequired() {
        return daysRequired;
    }

    /**
     * Days Required Relative to Start Date
     * <p>
     * Lineage reference object : SOBAUTH_DAYS_REQUIRED
     * 
     */
    @JsonProperty("daysRequired")
    public void setDaysRequired(Double daysRequired) {
        this.daysRequired = daysRequired;
    }

    public Sobauth withDaysRequired(Double daysRequired) {
        this.daysRequired = daysRequired;
        return this;
    }

    /**
     * Permit-Override Code
     * <p>
     * Lineage reference object : SOBAUTH_ROVR_CODE, Lookup lineage reference object : stvrovr,sfrrovr
     * 
     */
    @JsonProperty("rovrCode")
    public String getRovrCode() {
        return rovrCode;
    }

    /**
     * Permit-Override Code
     * <p>
     * Lineage reference object : SOBAUTH_ROVR_CODE, Lookup lineage reference object : stvrovr,sfrrovr
     * 
     */
    @JsonProperty("rovrCode")
    public void setRovrCode(String rovrCode) {
        this.rovrCode = rovrCode;
    }

    public Sobauth withRovrCode(String rovrCode) {
        this.rovrCode = rovrCode;
        return this;
    }

    /**
     * Days Reusable after Assignment
     * <p>
     * Lineage reference object : SOBAUTH_DAYS_REUSABLE
     * 
     */
    @JsonProperty("daysReusable")
    public Double getDaysReusable() {
        return daysReusable;
    }

    /**
     * Days Reusable after Assignment
     * <p>
     * Lineage reference object : SOBAUTH_DAYS_REUSABLE
     * 
     */
    @JsonProperty("daysReusable")
    public void setDaysReusable(Double daysReusable) {
        this.daysReusable = daysReusable;
    }

    public Sobauth withDaysReusable(Double daysReusable) {
        this.daysReusable = daysReusable;
        return this;
    }

    /**
     * Active for Term
     * <p>
     * Lineage reference object : SOBAUTH_REG_AUTH_ACTIVE_IND
     * 
     */
    @JsonProperty("regAuthActiveInd")
    public String getRegAuthActiveInd() {
        return regAuthActiveInd;
    }

    /**
     * Active for Term
     * <p>
     * Lineage reference object : SOBAUTH_REG_AUTH_ACTIVE_IND
     * 
     */
    @JsonProperty("regAuthActiveInd")
    public void setRegAuthActiveInd(String regAuthActiveInd) {
        this.regAuthActiveInd = regAuthActiveInd;
    }

    public Sobauth withRegAuthActiveInd(String regAuthActiveInd) {
        this.regAuthActiveInd = regAuthActiveInd;
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

    public Sobauth withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sobauth.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sobauthRegAuthClosedInd");
        sb.append('=');
        sb.append(((this.sobauthRegAuthClosedInd == null)?"<null>":this.sobauthRegAuthClosedInd));
        sb.append(',');
        sb.append("stvrovrDesc");
        sb.append('=');
        sb.append(((this.stvrovrDesc == null)?"<null>":this.stvrovrDesc));
        sb.append(',');
        sb.append("daysRequired");
        sb.append('=');
        sb.append(((this.daysRequired == null)?"<null>":this.daysRequired));
        sb.append(',');
        sb.append("rovrCode");
        sb.append('=');
        sb.append(((this.rovrCode == null)?"<null>":this.rovrCode));
        sb.append(',');
        sb.append("daysReusable");
        sb.append('=');
        sb.append(((this.daysReusable == null)?"<null>":this.daysReusable));
        sb.append(',');
        sb.append("regAuthActiveInd");
        sb.append('=');
        sb.append(((this.regAuthActiveInd == null)?"<null>":this.regAuthActiveInd));
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
        result = ((result* 31)+((this.stvrovrDesc == null)? 0 :this.stvrovrDesc.hashCode()));
        result = ((result* 31)+((this.daysRequired == null)? 0 :this.daysRequired.hashCode()));
        result = ((result* 31)+((this.rovrCode == null)? 0 :this.rovrCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sobauthRegAuthClosedInd == null)? 0 :this.sobauthRegAuthClosedInd.hashCode()));
        result = ((result* 31)+((this.daysReusable == null)? 0 :this.daysReusable.hashCode()));
        result = ((result* 31)+((this.regAuthActiveInd == null)? 0 :this.regAuthActiveInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sobauth) == false) {
            return false;
        }
        Sobauth rhs = ((Sobauth) other);
        return ((((((((this.stvrovrDesc == rhs.stvrovrDesc)||((this.stvrovrDesc!= null)&&this.stvrovrDesc.equals(rhs.stvrovrDesc)))&&((this.daysRequired == rhs.daysRequired)||((this.daysRequired!= null)&&this.daysRequired.equals(rhs.daysRequired))))&&((this.rovrCode == rhs.rovrCode)||((this.rovrCode!= null)&&this.rovrCode.equals(rhs.rovrCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sobauthRegAuthClosedInd == rhs.sobauthRegAuthClosedInd)||((this.sobauthRegAuthClosedInd!= null)&&this.sobauthRegAuthClosedInd.equals(rhs.sobauthRegAuthClosedInd))))&&((this.daysReusable == rhs.daysReusable)||((this.daysReusable!= null)&&this.daysReusable.equals(rhs.daysReusable))))&&((this.regAuthActiveInd == rhs.regAuthActiveInd)||((this.regAuthActiveInd!= null)&&this.regAuthActiveInd.equals(rhs.regAuthActiveInd))));
    }

}
