
package com.ellucian.generated.bpapi.ban.applicant_information.v1_0_0;

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
    "date",
    "desiredHourly",
    "reqNo",
    "asrcCode",
    "id",
    "posn",
    "fullPartInd",
    "desiredSalary"
})
@Generated("jsonschema2pojo")
public class ApplicantInformation100PostRequest {

    /**
     * Application Date
     * <p>
     * Lineage reference object : PABAPPL_DATE
     * (Required)
     * 
     */
    @JsonProperty("date")
    @JsonPropertyDescription("Lineage reference object : PABAPPL_DATE")
    private Date date;
    /**
     * Desired Hourly Rate
     * <p>
     * Lineage reference object : PABAPPL_DESIRED_HOURLY
     * 
     */
    @JsonProperty("desiredHourly")
    @JsonPropertyDescription("Lineage reference object : PABAPPL_DESIRED_HOURLY")
    private Double desiredHourly;
    /**
     * Requisition Number
     * <p>
     * Lineage reference object : PABAPPL_REQ_NO
     * 
     */
    @JsonProperty("reqNo")
    @JsonPropertyDescription("Lineage reference object : PABAPPL_REQ_NO")
    private String reqNo;
    /**
     * Source
     * <p>
     * Lineage reference object : PABAPPL_ASRC_CODE, Lookup lineage reference object : ptvasrc
     * (Required)
     * 
     */
    @JsonProperty("asrcCode")
    @JsonPropertyDescription("Lineage reference object : PABAPPL_ASRC_CODE, Lookup lineage reference object : ptvasrc")
    private String asrcCode;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private String id;
    /**
     * Position Number
     * <p>
     * Lineage reference object : PABAPPL_POSN
     * 
     */
    @JsonProperty("posn")
    @JsonPropertyDescription("Lineage reference object : PABAPPL_POSN")
    private String posn;
    /**
     * Full or Part Preference
     * <p>
     * Lineage reference object : PABAPPL_FULL_PART_IND
     * 
     */
    @JsonProperty("fullPartInd")
    @JsonPropertyDescription("Lineage reference object : PABAPPL_FULL_PART_IND")
    private String fullPartInd;
    /**
     * Desired Salary
     * <p>
     * Lineage reference object : PABAPPL_DESIRED_SALARY
     * 
     */
    @JsonProperty("desiredSalary")
    @JsonPropertyDescription("Lineage reference object : PABAPPL_DESIRED_SALARY")
    private Double desiredSalary;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Application Date
     * <p>
     * Lineage reference object : PABAPPL_DATE
     * (Required)
     * 
     */
    @JsonProperty("date")
    public Date getDate() {
        return date;
    }

    /**
     * Application Date
     * <p>
     * Lineage reference object : PABAPPL_DATE
     * (Required)
     * 
     */
    @JsonProperty("date")
    public void setDate(Date date) {
        this.date = date;
    }

    public ApplicantInformation100PostRequest withDate(Date date) {
        this.date = date;
        return this;
    }

    /**
     * Desired Hourly Rate
     * <p>
     * Lineage reference object : PABAPPL_DESIRED_HOURLY
     * 
     */
    @JsonProperty("desiredHourly")
    public Double getDesiredHourly() {
        return desiredHourly;
    }

    /**
     * Desired Hourly Rate
     * <p>
     * Lineage reference object : PABAPPL_DESIRED_HOURLY
     * 
     */
    @JsonProperty("desiredHourly")
    public void setDesiredHourly(Double desiredHourly) {
        this.desiredHourly = desiredHourly;
    }

    public ApplicantInformation100PostRequest withDesiredHourly(Double desiredHourly) {
        this.desiredHourly = desiredHourly;
        return this;
    }

    /**
     * Requisition Number
     * <p>
     * Lineage reference object : PABAPPL_REQ_NO
     * 
     */
    @JsonProperty("reqNo")
    public String getReqNo() {
        return reqNo;
    }

    /**
     * Requisition Number
     * <p>
     * Lineage reference object : PABAPPL_REQ_NO
     * 
     */
    @JsonProperty("reqNo")
    public void setReqNo(String reqNo) {
        this.reqNo = reqNo;
    }

    public ApplicantInformation100PostRequest withReqNo(String reqNo) {
        this.reqNo = reqNo;
        return this;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : PABAPPL_ASRC_CODE, Lookup lineage reference object : ptvasrc
     * (Required)
     * 
     */
    @JsonProperty("asrcCode")
    public String getAsrcCode() {
        return asrcCode;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : PABAPPL_ASRC_CODE, Lookup lineage reference object : ptvasrc
     * (Required)
     * 
     */
    @JsonProperty("asrcCode")
    public void setAsrcCode(String asrcCode) {
        this.asrcCode = asrcCode;
    }

    public ApplicantInformation100PostRequest withAsrcCode(String asrcCode) {
        this.asrcCode = asrcCode;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ApplicantInformation100PostRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Position Number
     * <p>
     * Lineage reference object : PABAPPL_POSN
     * 
     */
    @JsonProperty("posn")
    public String getPosn() {
        return posn;
    }

    /**
     * Position Number
     * <p>
     * Lineage reference object : PABAPPL_POSN
     * 
     */
    @JsonProperty("posn")
    public void setPosn(String posn) {
        this.posn = posn;
    }

    public ApplicantInformation100PostRequest withPosn(String posn) {
        this.posn = posn;
        return this;
    }

    /**
     * Full or Part Preference
     * <p>
     * Lineage reference object : PABAPPL_FULL_PART_IND
     * 
     */
    @JsonProperty("fullPartInd")
    public String getFullPartInd() {
        return fullPartInd;
    }

    /**
     * Full or Part Preference
     * <p>
     * Lineage reference object : PABAPPL_FULL_PART_IND
     * 
     */
    @JsonProperty("fullPartInd")
    public void setFullPartInd(String fullPartInd) {
        this.fullPartInd = fullPartInd;
    }

    public ApplicantInformation100PostRequest withFullPartInd(String fullPartInd) {
        this.fullPartInd = fullPartInd;
        return this;
    }

    /**
     * Desired Salary
     * <p>
     * Lineage reference object : PABAPPL_DESIRED_SALARY
     * 
     */
    @JsonProperty("desiredSalary")
    public Double getDesiredSalary() {
        return desiredSalary;
    }

    /**
     * Desired Salary
     * <p>
     * Lineage reference object : PABAPPL_DESIRED_SALARY
     * 
     */
    @JsonProperty("desiredSalary")
    public void setDesiredSalary(Double desiredSalary) {
        this.desiredSalary = desiredSalary;
    }

    public ApplicantInformation100PostRequest withDesiredSalary(Double desiredSalary) {
        this.desiredSalary = desiredSalary;
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

    public ApplicantInformation100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApplicantInformation100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
        sb.append(',');
        sb.append("desiredHourly");
        sb.append('=');
        sb.append(((this.desiredHourly == null)?"<null>":this.desiredHourly));
        sb.append(',');
        sb.append("reqNo");
        sb.append('=');
        sb.append(((this.reqNo == null)?"<null>":this.reqNo));
        sb.append(',');
        sb.append("asrcCode");
        sb.append('=');
        sb.append(((this.asrcCode == null)?"<null>":this.asrcCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("posn");
        sb.append('=');
        sb.append(((this.posn == null)?"<null>":this.posn));
        sb.append(',');
        sb.append("fullPartInd");
        sb.append('=');
        sb.append(((this.fullPartInd == null)?"<null>":this.fullPartInd));
        sb.append(',');
        sb.append("desiredSalary");
        sb.append('=');
        sb.append(((this.desiredSalary == null)?"<null>":this.desiredSalary));
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
        result = ((result* 31)+((this.date == null)? 0 :this.date.hashCode()));
        result = ((result* 31)+((this.desiredHourly == null)? 0 :this.desiredHourly.hashCode()));
        result = ((result* 31)+((this.reqNo == null)? 0 :this.reqNo.hashCode()));
        result = ((result* 31)+((this.asrcCode == null)? 0 :this.asrcCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.posn == null)? 0 :this.posn.hashCode()));
        result = ((result* 31)+((this.fullPartInd == null)? 0 :this.fullPartInd.hashCode()));
        result = ((result* 31)+((this.desiredSalary == null)? 0 :this.desiredSalary.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicantInformation100PostRequest) == false) {
            return false;
        }
        ApplicantInformation100PostRequest rhs = ((ApplicantInformation100PostRequest) other);
        return ((((((((((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date)))&&((this.desiredHourly == rhs.desiredHourly)||((this.desiredHourly!= null)&&this.desiredHourly.equals(rhs.desiredHourly))))&&((this.reqNo == rhs.reqNo)||((this.reqNo!= null)&&this.reqNo.equals(rhs.reqNo))))&&((this.asrcCode == rhs.asrcCode)||((this.asrcCode!= null)&&this.asrcCode.equals(rhs.asrcCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.posn == rhs.posn)||((this.posn!= null)&&this.posn.equals(rhs.posn))))&&((this.fullPartInd == rhs.fullPartInd)||((this.fullPartInd!= null)&&this.fullPartInd.equals(rhs.fullPartInd))))&&((this.desiredSalary == rhs.desiredSalary)||((this.desiredSalary!= null)&&this.desiredSalary.equals(rhs.desiredSalary))));
    }

}
