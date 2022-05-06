
package com.ellucian.generated.bpapi.ban.eu_hesa_qualification_details.v1_0_0;

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
    "qualId",
    "qualTitle",
    "ssdtCodeQualCatgry",
    "ssdtCodeQualCatgrySt",
    "userId",
    "activityDate"
})
@Generated("jsonschema2pojo")
public class EuHesaQualificationDetails100QapiPost {

    @JsonProperty("qualId")
    private String qualId;
    @JsonProperty("qualTitle")
    private String qualTitle;
    @JsonProperty("ssdtCodeQualCatgry")
    private String ssdtCodeQualCatgry;
    @JsonProperty("ssdtCodeQualCatgrySt")
    private String ssdtCodeQualCatgrySt;
    /**
     * Lineage reference object : SORAWBR_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SORAWBR_USER_ID")
    private String userId;
    /**
     * Lineage reference object : SORAWBR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SORAWBR_ACTIVITY_DATE")
    private Date activityDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("qualId")
    public String getQualId() {
        return qualId;
    }

    @JsonProperty("qualId")
    public void setQualId(String qualId) {
        this.qualId = qualId;
    }

    public EuHesaQualificationDetails100QapiPost withQualId(String qualId) {
        this.qualId = qualId;
        return this;
    }

    @JsonProperty("qualTitle")
    public String getQualTitle() {
        return qualTitle;
    }

    @JsonProperty("qualTitle")
    public void setQualTitle(String qualTitle) {
        this.qualTitle = qualTitle;
    }

    public EuHesaQualificationDetails100QapiPost withQualTitle(String qualTitle) {
        this.qualTitle = qualTitle;
        return this;
    }

    @JsonProperty("ssdtCodeQualCatgry")
    public String getSsdtCodeQualCatgry() {
        return ssdtCodeQualCatgry;
    }

    @JsonProperty("ssdtCodeQualCatgry")
    public void setSsdtCodeQualCatgry(String ssdtCodeQualCatgry) {
        this.ssdtCodeQualCatgry = ssdtCodeQualCatgry;
    }

    public EuHesaQualificationDetails100QapiPost withSsdtCodeQualCatgry(String ssdtCodeQualCatgry) {
        this.ssdtCodeQualCatgry = ssdtCodeQualCatgry;
        return this;
    }

    @JsonProperty("ssdtCodeQualCatgrySt")
    public String getSsdtCodeQualCatgrySt() {
        return ssdtCodeQualCatgrySt;
    }

    @JsonProperty("ssdtCodeQualCatgrySt")
    public void setSsdtCodeQualCatgrySt(String ssdtCodeQualCatgrySt) {
        this.ssdtCodeQualCatgrySt = ssdtCodeQualCatgrySt;
    }

    public EuHesaQualificationDetails100QapiPost withSsdtCodeQualCatgrySt(String ssdtCodeQualCatgrySt) {
        this.ssdtCodeQualCatgrySt = ssdtCodeQualCatgrySt;
        return this;
    }

    /**
     * Lineage reference object : SORAWBR_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SORAWBR_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public EuHesaQualificationDetails100QapiPost withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Lineage reference object : SORAWBR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SORAWBR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public EuHesaQualificationDetails100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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

    public EuHesaQualificationDetails100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EuHesaQualificationDetails100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("qualId");
        sb.append('=');
        sb.append(((this.qualId == null)?"<null>":this.qualId));
        sb.append(',');
        sb.append("qualTitle");
        sb.append('=');
        sb.append(((this.qualTitle == null)?"<null>":this.qualTitle));
        sb.append(',');
        sb.append("ssdtCodeQualCatgry");
        sb.append('=');
        sb.append(((this.ssdtCodeQualCatgry == null)?"<null>":this.ssdtCodeQualCatgry));
        sb.append(',');
        sb.append("ssdtCodeQualCatgrySt");
        sb.append('=');
        sb.append(((this.ssdtCodeQualCatgrySt == null)?"<null>":this.ssdtCodeQualCatgrySt));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
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
        result = ((result* 31)+((this.ssdtCodeQualCatgry == null)? 0 :this.ssdtCodeQualCatgry.hashCode()));
        result = ((result* 31)+((this.ssdtCodeQualCatgrySt == null)? 0 :this.ssdtCodeQualCatgrySt.hashCode()));
        result = ((result* 31)+((this.qualId == null)? 0 :this.qualId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.qualTitle == null)? 0 :this.qualTitle.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EuHesaQualificationDetails100QapiPost) == false) {
            return false;
        }
        EuHesaQualificationDetails100QapiPost rhs = ((EuHesaQualificationDetails100QapiPost) other);
        return ((((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.ssdtCodeQualCatgry == rhs.ssdtCodeQualCatgry)||((this.ssdtCodeQualCatgry!= null)&&this.ssdtCodeQualCatgry.equals(rhs.ssdtCodeQualCatgry))))&&((this.ssdtCodeQualCatgrySt == rhs.ssdtCodeQualCatgrySt)||((this.ssdtCodeQualCatgrySt!= null)&&this.ssdtCodeQualCatgrySt.equals(rhs.ssdtCodeQualCatgrySt))))&&((this.qualId == rhs.qualId)||((this.qualId!= null)&&this.qualId.equals(rhs.qualId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.qualTitle == rhs.qualTitle)||((this.qualTitle!= null)&&this.qualTitle.equals(rhs.qualTitle))));
    }

}
