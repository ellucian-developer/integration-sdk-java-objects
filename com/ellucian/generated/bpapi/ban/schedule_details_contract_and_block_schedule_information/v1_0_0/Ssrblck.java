
package com.ellucian.generated.bpapi.ban.schedule_details_contract_and_block_schedule_information.v1_0_0;

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
    "activityDate",
    "apprInd",
    "blckCode",
    "blckDesc"
})
@Generated("jsonschema2pojo")
public class Ssrblck {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SSRBLCK_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SSRBLCK_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Lineage reference object : SSRBLCK_APPR_IND
     * 
     */
    @JsonProperty("apprInd")
    @JsonPropertyDescription("Lineage reference object : SSRBLCK_APPR_IND")
    private String apprInd;
    /**
     * Block
     * <p>
     * Lineage reference object : SSRBLCK_BLCK_CODE, Lookup lineage reference object : stvblck
     * (Required)
     * 
     */
    @JsonProperty("blckCode")
    @JsonPropertyDescription("Lineage reference object : SSRBLCK_BLCK_CODE, Lookup lineage reference object : stvblck")
    private String blckCode;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("blckDesc")
    private String blckDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SSRBLCK_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SSRBLCK_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Ssrblck withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Lineage reference object : SSRBLCK_APPR_IND
     * 
     */
    @JsonProperty("apprInd")
    public String getApprInd() {
        return apprInd;
    }

    /**
     * Lineage reference object : SSRBLCK_APPR_IND
     * 
     */
    @JsonProperty("apprInd")
    public void setApprInd(String apprInd) {
        this.apprInd = apprInd;
    }

    public Ssrblck withApprInd(String apprInd) {
        this.apprInd = apprInd;
        return this;
    }

    /**
     * Block
     * <p>
     * Lineage reference object : SSRBLCK_BLCK_CODE, Lookup lineage reference object : stvblck
     * (Required)
     * 
     */
    @JsonProperty("blckCode")
    public String getBlckCode() {
        return blckCode;
    }

    /**
     * Block
     * <p>
     * Lineage reference object : SSRBLCK_BLCK_CODE, Lookup lineage reference object : stvblck
     * (Required)
     * 
     */
    @JsonProperty("blckCode")
    public void setBlckCode(String blckCode) {
        this.blckCode = blckCode;
    }

    public Ssrblck withBlckCode(String blckCode) {
        this.blckCode = blckCode;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("blckDesc")
    public String getBlckDesc() {
        return blckDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("blckDesc")
    public void setBlckDesc(String blckDesc) {
        this.blckDesc = blckDesc;
    }

    public Ssrblck withBlckDesc(String blckDesc) {
        this.blckDesc = blckDesc;
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

    public Ssrblck withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ssrblck.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("apprInd");
        sb.append('=');
        sb.append(((this.apprInd == null)?"<null>":this.apprInd));
        sb.append(',');
        sb.append("blckCode");
        sb.append('=');
        sb.append(((this.blckCode == null)?"<null>":this.blckCode));
        sb.append(',');
        sb.append("blckDesc");
        sb.append('=');
        sb.append(((this.blckDesc == null)?"<null>":this.blckDesc));
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
        result = ((result* 31)+((this.blckCode == null)? 0 :this.blckCode.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.blckDesc == null)? 0 :this.blckDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.apprInd == null)? 0 :this.apprInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ssrblck) == false) {
            return false;
        }
        Ssrblck rhs = ((Ssrblck) other);
        return ((((((this.blckCode == rhs.blckCode)||((this.blckCode!= null)&&this.blckCode.equals(rhs.blckCode)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.blckDesc == rhs.blckDesc)||((this.blckDesc!= null)&&this.blckDesc.equals(rhs.blckDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.apprInd == rhs.apprInd)||((this.apprInd!= null)&&this.apprInd.equals(rhs.apprInd))));
    }

}
