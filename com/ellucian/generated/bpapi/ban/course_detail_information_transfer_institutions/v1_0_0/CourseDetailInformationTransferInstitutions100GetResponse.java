
package com.ellucian.generated.bpapi.ban.course_detail_information_transfer_institutions.v1_0_0;

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
    "sbgiDescription",
    "agreementDate",
    "sbgiCode"
})
@Generated("jsonschema2pojo")
public class CourseDetailInformationTransferInstitutions100GetResponse {

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("sbgiDescription")
    private String sbgiDescription;
    /**
     * Agreement Date
     * <p>
     * Lineage reference object : SCRSBGI_AGREEMENT_DATE
     * (Required)
     * 
     */
    @JsonProperty("agreementDate")
    @JsonPropertyDescription("Lineage reference object : SCRSBGI_AGREEMENT_DATE")
    private Date agreementDate;
    /**
     * Source
     * <p>
     * Lineage reference object : SCRSBGI_SBGI_CODE
     * (Required)
     * 
     */
    @JsonProperty("sbgiCode")
    @JsonPropertyDescription("Lineage reference object : SCRSBGI_SBGI_CODE")
    private String sbgiCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("sbgiDescription")
    public String getSbgiDescription() {
        return sbgiDescription;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("sbgiDescription")
    public void setSbgiDescription(String sbgiDescription) {
        this.sbgiDescription = sbgiDescription;
    }

    public CourseDetailInformationTransferInstitutions100GetResponse withSbgiDescription(String sbgiDescription) {
        this.sbgiDescription = sbgiDescription;
        return this;
    }

    /**
     * Agreement Date
     * <p>
     * Lineage reference object : SCRSBGI_AGREEMENT_DATE
     * (Required)
     * 
     */
    @JsonProperty("agreementDate")
    public Date getAgreementDate() {
        return agreementDate;
    }

    /**
     * Agreement Date
     * <p>
     * Lineage reference object : SCRSBGI_AGREEMENT_DATE
     * (Required)
     * 
     */
    @JsonProperty("agreementDate")
    public void setAgreementDate(Date agreementDate) {
        this.agreementDate = agreementDate;
    }

    public CourseDetailInformationTransferInstitutions100GetResponse withAgreementDate(Date agreementDate) {
        this.agreementDate = agreementDate;
        return this;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : SCRSBGI_SBGI_CODE
     * (Required)
     * 
     */
    @JsonProperty("sbgiCode")
    public String getSbgiCode() {
        return sbgiCode;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : SCRSBGI_SBGI_CODE
     * (Required)
     * 
     */
    @JsonProperty("sbgiCode")
    public void setSbgiCode(String sbgiCode) {
        this.sbgiCode = sbgiCode;
    }

    public CourseDetailInformationTransferInstitutions100GetResponse withSbgiCode(String sbgiCode) {
        this.sbgiCode = sbgiCode;
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

    public CourseDetailInformationTransferInstitutions100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CourseDetailInformationTransferInstitutions100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sbgiDescription");
        sb.append('=');
        sb.append(((this.sbgiDescription == null)?"<null>":this.sbgiDescription));
        sb.append(',');
        sb.append("agreementDate");
        sb.append('=');
        sb.append(((this.agreementDate == null)?"<null>":this.agreementDate));
        sb.append(',');
        sb.append("sbgiCode");
        sb.append('=');
        sb.append(((this.sbgiCode == null)?"<null>":this.sbgiCode));
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
        result = ((result* 31)+((this.sbgiDescription == null)? 0 :this.sbgiDescription.hashCode()));
        result = ((result* 31)+((this.sbgiCode == null)? 0 :this.sbgiCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.agreementDate == null)? 0 :this.agreementDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CourseDetailInformationTransferInstitutions100GetResponse) == false) {
            return false;
        }
        CourseDetailInformationTransferInstitutions100GetResponse rhs = ((CourseDetailInformationTransferInstitutions100GetResponse) other);
        return (((((this.sbgiDescription == rhs.sbgiDescription)||((this.sbgiDescription!= null)&&this.sbgiDescription.equals(rhs.sbgiDescription)))&&((this.sbgiCode == rhs.sbgiCode)||((this.sbgiCode!= null)&&this.sbgiCode.equals(rhs.sbgiCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.agreementDate == rhs.agreementDate)||((this.agreementDate!= null)&&this.agreementDate.equals(rhs.agreementDate))));
    }

}
