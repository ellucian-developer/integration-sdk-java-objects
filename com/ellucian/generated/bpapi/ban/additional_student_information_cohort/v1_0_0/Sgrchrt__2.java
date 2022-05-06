
package com.ellucian.generated.bpapi.ban.additional_student_information_cohort.v1_0_0;

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
    "chrtCode",
    "creaCode",
    "stspKeySequence",
    "activeInd",
    "sgvstspDesc",
    "userId",
    "chrtDescription"
})
@Generated("jsonschema2pojo")
public class Sgrchrt__2 {

    /**
     * Cohort Code
     * <p>
     * Lineage reference object : SGRCHRT_CHRT_CODE, Lookup lineage reference object : stvchrt
     * (Required)
     * 
     */
    @JsonProperty("chrtCode")
    @JsonPropertyDescription("Lineage reference object : SGRCHRT_CHRT_CODE, Lookup lineage reference object : stvchrt")
    private String chrtCode;
    /**
     * Reason
     * <p>
     * Lineage reference object : SGRCHRT_CREA_CODE, Lookup lineage reference object : stvcrea
     * 
     */
    @JsonProperty("creaCode")
    @JsonPropertyDescription("Lineage reference object : SGRCHRT_CREA_CODE, Lookup lineage reference object : stvcrea")
    private String creaCode;
    /**
     * Study Path
     * <p>
     * Lineage reference object : SGRCHRT_STSP_KEY_SEQUENCE, Lookup lineage reference object : sgvstsp,sgrstsp
     * 
     */
    @JsonProperty("stspKeySequence")
    @JsonPropertyDescription("Lineage reference object : SGRCHRT_STSP_KEY_SEQUENCE, Lookup lineage reference object : sgvstsp,sgrstsp")
    private Double stspKeySequence;
    /**
     * Lineage reference object : SGRCHRT_ACTIVE_IND
     * 
     */
    @JsonProperty("activeInd")
    @JsonPropertyDescription("Lineage reference object : SGRCHRT_ACTIVE_IND")
    private String activeInd;
    @JsonProperty("sgvstspDesc")
    private String sgvstspDesc;
    /**
     * Lineage reference object : SGRCHRT_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SGRCHRT_USER_ID")
    private String userId;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("chrtDescription")
    private String chrtDescription;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Cohort Code
     * <p>
     * Lineage reference object : SGRCHRT_CHRT_CODE, Lookup lineage reference object : stvchrt
     * (Required)
     * 
     */
    @JsonProperty("chrtCode")
    public String getChrtCode() {
        return chrtCode;
    }

    /**
     * Cohort Code
     * <p>
     * Lineage reference object : SGRCHRT_CHRT_CODE, Lookup lineage reference object : stvchrt
     * (Required)
     * 
     */
    @JsonProperty("chrtCode")
    public void setChrtCode(String chrtCode) {
        this.chrtCode = chrtCode;
    }

    public Sgrchrt__2 withChrtCode(String chrtCode) {
        this.chrtCode = chrtCode;
        return this;
    }

    /**
     * Reason
     * <p>
     * Lineage reference object : SGRCHRT_CREA_CODE, Lookup lineage reference object : stvcrea
     * 
     */
    @JsonProperty("creaCode")
    public String getCreaCode() {
        return creaCode;
    }

    /**
     * Reason
     * <p>
     * Lineage reference object : SGRCHRT_CREA_CODE, Lookup lineage reference object : stvcrea
     * 
     */
    @JsonProperty("creaCode")
    public void setCreaCode(String creaCode) {
        this.creaCode = creaCode;
    }

    public Sgrchrt__2 withCreaCode(String creaCode) {
        this.creaCode = creaCode;
        return this;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : SGRCHRT_STSP_KEY_SEQUENCE, Lookup lineage reference object : sgvstsp,sgrstsp
     * 
     */
    @JsonProperty("stspKeySequence")
    public Double getStspKeySequence() {
        return stspKeySequence;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : SGRCHRT_STSP_KEY_SEQUENCE, Lookup lineage reference object : sgvstsp,sgrstsp
     * 
     */
    @JsonProperty("stspKeySequence")
    public void setStspKeySequence(Double stspKeySequence) {
        this.stspKeySequence = stspKeySequence;
    }

    public Sgrchrt__2 withStspKeySequence(Double stspKeySequence) {
        this.stspKeySequence = stspKeySequence;
        return this;
    }

    /**
     * Lineage reference object : SGRCHRT_ACTIVE_IND
     * 
     */
    @JsonProperty("activeInd")
    public String getActiveInd() {
        return activeInd;
    }

    /**
     * Lineage reference object : SGRCHRT_ACTIVE_IND
     * 
     */
    @JsonProperty("activeInd")
    public void setActiveInd(String activeInd) {
        this.activeInd = activeInd;
    }

    public Sgrchrt__2 withActiveInd(String activeInd) {
        this.activeInd = activeInd;
        return this;
    }

    @JsonProperty("sgvstspDesc")
    public String getSgvstspDesc() {
        return sgvstspDesc;
    }

    @JsonProperty("sgvstspDesc")
    public void setSgvstspDesc(String sgvstspDesc) {
        this.sgvstspDesc = sgvstspDesc;
    }

    public Sgrchrt__2 withSgvstspDesc(String sgvstspDesc) {
        this.sgvstspDesc = sgvstspDesc;
        return this;
    }

    /**
     * Lineage reference object : SGRCHRT_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SGRCHRT_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Sgrchrt__2 withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("chrtDescription")
    public String getChrtDescription() {
        return chrtDescription;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("chrtDescription")
    public void setChrtDescription(String chrtDescription) {
        this.chrtDescription = chrtDescription;
    }

    public Sgrchrt__2 withChrtDescription(String chrtDescription) {
        this.chrtDescription = chrtDescription;
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

    public Sgrchrt__2 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sgrchrt__2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("chrtCode");
        sb.append('=');
        sb.append(((this.chrtCode == null)?"<null>":this.chrtCode));
        sb.append(',');
        sb.append("creaCode");
        sb.append('=');
        sb.append(((this.creaCode == null)?"<null>":this.creaCode));
        sb.append(',');
        sb.append("stspKeySequence");
        sb.append('=');
        sb.append(((this.stspKeySequence == null)?"<null>":this.stspKeySequence));
        sb.append(',');
        sb.append("activeInd");
        sb.append('=');
        sb.append(((this.activeInd == null)?"<null>":this.activeInd));
        sb.append(',');
        sb.append("sgvstspDesc");
        sb.append('=');
        sb.append(((this.sgvstspDesc == null)?"<null>":this.sgvstspDesc));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("chrtDescription");
        sb.append('=');
        sb.append(((this.chrtDescription == null)?"<null>":this.chrtDescription));
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
        result = ((result* 31)+((this.chrtCode == null)? 0 :this.chrtCode.hashCode()));
        result = ((result* 31)+((this.creaCode == null)? 0 :this.creaCode.hashCode()));
        result = ((result* 31)+((this.stspKeySequence == null)? 0 :this.stspKeySequence.hashCode()));
        result = ((result* 31)+((this.activeInd == null)? 0 :this.activeInd.hashCode()));
        result = ((result* 31)+((this.sgvstspDesc == null)? 0 :this.sgvstspDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.chrtDescription == null)? 0 :this.chrtDescription.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sgrchrt__2) == false) {
            return false;
        }
        Sgrchrt__2 rhs = ((Sgrchrt__2) other);
        return (((((((((this.chrtCode == rhs.chrtCode)||((this.chrtCode!= null)&&this.chrtCode.equals(rhs.chrtCode)))&&((this.creaCode == rhs.creaCode)||((this.creaCode!= null)&&this.creaCode.equals(rhs.creaCode))))&&((this.stspKeySequence == rhs.stspKeySequence)||((this.stspKeySequence!= null)&&this.stspKeySequence.equals(rhs.stspKeySequence))))&&((this.activeInd == rhs.activeInd)||((this.activeInd!= null)&&this.activeInd.equals(rhs.activeInd))))&&((this.sgvstspDesc == rhs.sgvstspDesc)||((this.sgvstspDesc!= null)&&this.sgvstspDesc.equals(rhs.sgvstspDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.chrtDescription == rhs.chrtDescription)||((this.chrtDescription!= null)&&this.chrtDescription.equals(rhs.chrtDescription))));
    }

}
