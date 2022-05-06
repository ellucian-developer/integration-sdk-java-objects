
package com.ellucian.generated.bpapi.ban.admissions_application_fees_mail_submission_withdrawal.v1_0_0;

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
    "stvinitDesc",
    "gtvletrDesc",
    "waitDays",
    "initCode",
    "letrCode"
})
@Generated("jsonschema2pojo")
public class Gurmail {

    @JsonProperty("stvinitDesc")
    private String stvinitDesc;
    @JsonProperty("gtvletrDesc")
    private String gtvletrDesc;
    /**
     * Wait Days
     * <p>
     * Lineage reference object : GURMAIL_WAIT_DAYS
     * 
     */
    @JsonProperty("waitDays")
    @JsonPropertyDescription("Lineage reference object : GURMAIL_WAIT_DAYS")
    private Double waitDays;
    /**
     * Initials
     * <p>
     * Lineage reference object : GURMAIL_INIT_CODE, Lookup lineage reference object : stvinit
     * 
     */
    @JsonProperty("initCode")
    @JsonPropertyDescription("Lineage reference object : GURMAIL_INIT_CODE, Lookup lineage reference object : stvinit")
    private String initCode;
    /**
     * Letter
     * <p>
     * Lineage reference object : GURMAIL_LETR_CODE, Lookup lineage reference object : gtvletr
     * 
     */
    @JsonProperty("letrCode")
    @JsonPropertyDescription("Lineage reference object : GURMAIL_LETR_CODE, Lookup lineage reference object : gtvletr")
    private String letrCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("stvinitDesc")
    public String getStvinitDesc() {
        return stvinitDesc;
    }

    @JsonProperty("stvinitDesc")
    public void setStvinitDesc(String stvinitDesc) {
        this.stvinitDesc = stvinitDesc;
    }

    public Gurmail withStvinitDesc(String stvinitDesc) {
        this.stvinitDesc = stvinitDesc;
        return this;
    }

    @JsonProperty("gtvletrDesc")
    public String getGtvletrDesc() {
        return gtvletrDesc;
    }

    @JsonProperty("gtvletrDesc")
    public void setGtvletrDesc(String gtvletrDesc) {
        this.gtvletrDesc = gtvletrDesc;
    }

    public Gurmail withGtvletrDesc(String gtvletrDesc) {
        this.gtvletrDesc = gtvletrDesc;
        return this;
    }

    /**
     * Wait Days
     * <p>
     * Lineage reference object : GURMAIL_WAIT_DAYS
     * 
     */
    @JsonProperty("waitDays")
    public Double getWaitDays() {
        return waitDays;
    }

    /**
     * Wait Days
     * <p>
     * Lineage reference object : GURMAIL_WAIT_DAYS
     * 
     */
    @JsonProperty("waitDays")
    public void setWaitDays(Double waitDays) {
        this.waitDays = waitDays;
    }

    public Gurmail withWaitDays(Double waitDays) {
        this.waitDays = waitDays;
        return this;
    }

    /**
     * Initials
     * <p>
     * Lineage reference object : GURMAIL_INIT_CODE, Lookup lineage reference object : stvinit
     * 
     */
    @JsonProperty("initCode")
    public String getInitCode() {
        return initCode;
    }

    /**
     * Initials
     * <p>
     * Lineage reference object : GURMAIL_INIT_CODE, Lookup lineage reference object : stvinit
     * 
     */
    @JsonProperty("initCode")
    public void setInitCode(String initCode) {
        this.initCode = initCode;
    }

    public Gurmail withInitCode(String initCode) {
        this.initCode = initCode;
        return this;
    }

    /**
     * Letter
     * <p>
     * Lineage reference object : GURMAIL_LETR_CODE, Lookup lineage reference object : gtvletr
     * 
     */
    @JsonProperty("letrCode")
    public String getLetrCode() {
        return letrCode;
    }

    /**
     * Letter
     * <p>
     * Lineage reference object : GURMAIL_LETR_CODE, Lookup lineage reference object : gtvletr
     * 
     */
    @JsonProperty("letrCode")
    public void setLetrCode(String letrCode) {
        this.letrCode = letrCode;
    }

    public Gurmail withLetrCode(String letrCode) {
        this.letrCode = letrCode;
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

    public Gurmail withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Gurmail.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("stvinitDesc");
        sb.append('=');
        sb.append(((this.stvinitDesc == null)?"<null>":this.stvinitDesc));
        sb.append(',');
        sb.append("gtvletrDesc");
        sb.append('=');
        sb.append(((this.gtvletrDesc == null)?"<null>":this.gtvletrDesc));
        sb.append(',');
        sb.append("waitDays");
        sb.append('=');
        sb.append(((this.waitDays == null)?"<null>":this.waitDays));
        sb.append(',');
        sb.append("initCode");
        sb.append('=');
        sb.append(((this.initCode == null)?"<null>":this.initCode));
        sb.append(',');
        sb.append("letrCode");
        sb.append('=');
        sb.append(((this.letrCode == null)?"<null>":this.letrCode));
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
        result = ((result* 31)+((this.stvinitDesc == null)? 0 :this.stvinitDesc.hashCode()));
        result = ((result* 31)+((this.gtvletrDesc == null)? 0 :this.gtvletrDesc.hashCode()));
        result = ((result* 31)+((this.waitDays == null)? 0 :this.waitDays.hashCode()));
        result = ((result* 31)+((this.initCode == null)? 0 :this.initCode.hashCode()));
        result = ((result* 31)+((this.letrCode == null)? 0 :this.letrCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Gurmail) == false) {
            return false;
        }
        Gurmail rhs = ((Gurmail) other);
        return (((((((this.stvinitDesc == rhs.stvinitDesc)||((this.stvinitDesc!= null)&&this.stvinitDesc.equals(rhs.stvinitDesc)))&&((this.gtvletrDesc == rhs.gtvletrDesc)||((this.gtvletrDesc!= null)&&this.gtvletrDesc.equals(rhs.gtvletrDesc))))&&((this.waitDays == rhs.waitDays)||((this.waitDays!= null)&&this.waitDays.equals(rhs.waitDays))))&&((this.initCode == rhs.initCode)||((this.initCode!= null)&&this.initCode.equals(rhs.initCode))))&&((this.letrCode == rhs.letrCode)||((this.letrCode!= null)&&this.letrCode.equals(rhs.letrCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
