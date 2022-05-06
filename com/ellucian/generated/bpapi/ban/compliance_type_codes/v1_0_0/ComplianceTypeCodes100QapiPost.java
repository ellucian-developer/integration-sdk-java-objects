
package com.ellucian.generated.bpapi.ban.compliance_type_codes.v1_0_0;

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
    "desc",
    "officialInd",
    "reportTitle"
})
@Generated("jsonschema2pojo")
public class ComplianceTypeCodes100QapiPost {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVCPRT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : STVCPRT_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Type
     * <p>
     * Lineage reference object : STVCPRT_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVCPRT_CODE")
    private String code;
    /**
     * Description
     * <p>
     * Lineage reference object : STVCPRT_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVCPRT_DESC")
    private String desc;
    /**
     * Official
     * <p>
     * Lineage reference object : STVCPRT_OFFICIAL_IND
     * 
     */
    @JsonProperty("officialInd")
    @JsonPropertyDescription("Lineage reference object : STVCPRT_OFFICIAL_IND")
    private String officialInd;
    /**
     * Report Title
     * <p>
     * Lineage reference object : STVCPRT_REPORT_TITLE
     * 
     */
    @JsonProperty("reportTitle")
    @JsonPropertyDescription("Lineage reference object : STVCPRT_REPORT_TITLE")
    private String reportTitle;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVCPRT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVCPRT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public ComplianceTypeCodes100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : STVCPRT_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : STVCPRT_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public ComplianceTypeCodes100QapiPost withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVCPRT_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVCPRT_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ComplianceTypeCodes100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Official
     * <p>
     * Lineage reference object : STVCPRT_OFFICIAL_IND
     * 
     */
    @JsonProperty("officialInd")
    public String getOfficialInd() {
        return officialInd;
    }

    /**
     * Official
     * <p>
     * Lineage reference object : STVCPRT_OFFICIAL_IND
     * 
     */
    @JsonProperty("officialInd")
    public void setOfficialInd(String officialInd) {
        this.officialInd = officialInd;
    }

    public ComplianceTypeCodes100QapiPost withOfficialInd(String officialInd) {
        this.officialInd = officialInd;
        return this;
    }

    /**
     * Report Title
     * <p>
     * Lineage reference object : STVCPRT_REPORT_TITLE
     * 
     */
    @JsonProperty("reportTitle")
    public String getReportTitle() {
        return reportTitle;
    }

    /**
     * Report Title
     * <p>
     * Lineage reference object : STVCPRT_REPORT_TITLE
     * 
     */
    @JsonProperty("reportTitle")
    public void setReportTitle(String reportTitle) {
        this.reportTitle = reportTitle;
    }

    public ComplianceTypeCodes100QapiPost withReportTitle(String reportTitle) {
        this.reportTitle = reportTitle;
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

    public ComplianceTypeCodes100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ComplianceTypeCodes100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("officialInd");
        sb.append('=');
        sb.append(((this.officialInd == null)?"<null>":this.officialInd));
        sb.append(',');
        sb.append("reportTitle");
        sb.append('=');
        sb.append(((this.reportTitle == null)?"<null>":this.reportTitle));
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
        result = ((result* 31)+((this.reportTitle == null)? 0 :this.reportTitle.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        result = ((result* 31)+((this.officialInd == null)? 0 :this.officialInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ComplianceTypeCodes100QapiPost) == false) {
            return false;
        }
        ComplianceTypeCodes100QapiPost rhs = ((ComplianceTypeCodes100QapiPost) other);
        return (((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.reportTitle == rhs.reportTitle)||((this.reportTitle!= null)&&this.reportTitle.equals(rhs.reportTitle))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.officialInd == rhs.officialInd)||((this.officialInd!= null)&&this.officialInd.equals(rhs.officialInd))));
    }

}
