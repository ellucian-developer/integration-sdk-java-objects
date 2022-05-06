
package com.ellucian.generated.bpapi.ban.departmental_honors_codes.v1_0_0;

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
    "code",
    "commencePrtInd",
    "transcPrtInd",
    "desc"
})
@Generated("jsonschema2pojo")
public class DepartmentalHonorsCodes100GetResponse {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVHOND_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : STVHOND_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Code
     * <p>
     * Lineage reference object : STVHOND_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVHOND_CODE")
    private String code;
    /**
     * Lineage reference object : STVHOND_COMMENCE_PRT_IND
     * 
     */
    @JsonProperty("commencePrtInd")
    @JsonPropertyDescription("Lineage reference object : STVHOND_COMMENCE_PRT_IND")
    private String commencePrtInd;
    /**
     * Lineage reference object : STVHOND_TRANSC_PRT_IND
     * 
     */
    @JsonProperty("transcPrtInd")
    @JsonPropertyDescription("Lineage reference object : STVHOND_TRANSC_PRT_IND")
    private String transcPrtInd;
    /**
     * Description
     * <p>
     * Lineage reference object : STVHOND_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVHOND_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVHOND_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVHOND_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public DepartmentalHonorsCodes100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : STVHOND_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : STVHOND_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public DepartmentalHonorsCodes100GetResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Lineage reference object : STVHOND_COMMENCE_PRT_IND
     * 
     */
    @JsonProperty("commencePrtInd")
    public String getCommencePrtInd() {
        return commencePrtInd;
    }

    /**
     * Lineage reference object : STVHOND_COMMENCE_PRT_IND
     * 
     */
    @JsonProperty("commencePrtInd")
    public void setCommencePrtInd(String commencePrtInd) {
        this.commencePrtInd = commencePrtInd;
    }

    public DepartmentalHonorsCodes100GetResponse withCommencePrtInd(String commencePrtInd) {
        this.commencePrtInd = commencePrtInd;
        return this;
    }

    /**
     * Lineage reference object : STVHOND_TRANSC_PRT_IND
     * 
     */
    @JsonProperty("transcPrtInd")
    public String getTranscPrtInd() {
        return transcPrtInd;
    }

    /**
     * Lineage reference object : STVHOND_TRANSC_PRT_IND
     * 
     */
    @JsonProperty("transcPrtInd")
    public void setTranscPrtInd(String transcPrtInd) {
        this.transcPrtInd = transcPrtInd;
    }

    public DepartmentalHonorsCodes100GetResponse withTranscPrtInd(String transcPrtInd) {
        this.transcPrtInd = transcPrtInd;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVHOND_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVHOND_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public DepartmentalHonorsCodes100GetResponse withDesc(String desc) {
        this.desc = desc;
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

    public DepartmentalHonorsCodes100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DepartmentalHonorsCodes100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("commencePrtInd");
        sb.append('=');
        sb.append(((this.commencePrtInd == null)?"<null>":this.commencePrtInd));
        sb.append(',');
        sb.append("transcPrtInd");
        sb.append('=');
        sb.append(((this.transcPrtInd == null)?"<null>":this.transcPrtInd));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
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
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.commencePrtInd == null)? 0 :this.commencePrtInd.hashCode()));
        result = ((result* 31)+((this.transcPrtInd == null)? 0 :this.transcPrtInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DepartmentalHonorsCodes100GetResponse) == false) {
            return false;
        }
        DepartmentalHonorsCodes100GetResponse rhs = ((DepartmentalHonorsCodes100GetResponse) other);
        return (((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.commencePrtInd == rhs.commencePrtInd)||((this.commencePrtInd!= null)&&this.commencePrtInd.equals(rhs.commencePrtInd))))&&((this.transcPrtInd == rhs.transcPrtInd)||((this.transcPrtInd!= null)&&this.transcPrtInd.equals(rhs.transcPrtInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
