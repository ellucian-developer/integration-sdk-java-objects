
package com.ellucian.generated.bpapi.ban.course_detail_information_transfer_institutions.v1_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "scacrseSubjCode",
    "scacrseCrseNumb",
    "scacrseTermCodeEff"
})
@Generated("jsonschema2pojo")
public class CourseDetailInformationTransferInstitutions100QapiPost {

    @JsonProperty("scacrseSubjCode")
    private String scacrseSubjCode;
    @JsonProperty("scacrseCrseNumb")
    private String scacrseCrseNumb;
    @JsonProperty("scacrseTermCodeEff")
    private String scacrseTermCodeEff;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("scacrseSubjCode")
    public String getScacrseSubjCode() {
        return scacrseSubjCode;
    }

    @JsonProperty("scacrseSubjCode")
    public void setScacrseSubjCode(String scacrseSubjCode) {
        this.scacrseSubjCode = scacrseSubjCode;
    }

    public CourseDetailInformationTransferInstitutions100QapiPost withScacrseSubjCode(String scacrseSubjCode) {
        this.scacrseSubjCode = scacrseSubjCode;
        return this;
    }

    @JsonProperty("scacrseCrseNumb")
    public String getScacrseCrseNumb() {
        return scacrseCrseNumb;
    }

    @JsonProperty("scacrseCrseNumb")
    public void setScacrseCrseNumb(String scacrseCrseNumb) {
        this.scacrseCrseNumb = scacrseCrseNumb;
    }

    public CourseDetailInformationTransferInstitutions100QapiPost withScacrseCrseNumb(String scacrseCrseNumb) {
        this.scacrseCrseNumb = scacrseCrseNumb;
        return this;
    }

    @JsonProperty("scacrseTermCodeEff")
    public String getScacrseTermCodeEff() {
        return scacrseTermCodeEff;
    }

    @JsonProperty("scacrseTermCodeEff")
    public void setScacrseTermCodeEff(String scacrseTermCodeEff) {
        this.scacrseTermCodeEff = scacrseTermCodeEff;
    }

    public CourseDetailInformationTransferInstitutions100QapiPost withScacrseTermCodeEff(String scacrseTermCodeEff) {
        this.scacrseTermCodeEff = scacrseTermCodeEff;
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

    public CourseDetailInformationTransferInstitutions100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CourseDetailInformationTransferInstitutions100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scacrseSubjCode");
        sb.append('=');
        sb.append(((this.scacrseSubjCode == null)?"<null>":this.scacrseSubjCode));
        sb.append(',');
        sb.append("scacrseCrseNumb");
        sb.append('=');
        sb.append(((this.scacrseCrseNumb == null)?"<null>":this.scacrseCrseNumb));
        sb.append(',');
        sb.append("scacrseTermCodeEff");
        sb.append('=');
        sb.append(((this.scacrseTermCodeEff == null)?"<null>":this.scacrseTermCodeEff));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.scacrseCrseNumb == null)? 0 :this.scacrseCrseNumb.hashCode()));
        result = ((result* 31)+((this.scacrseTermCodeEff == null)? 0 :this.scacrseTermCodeEff.hashCode()));
        result = ((result* 31)+((this.scacrseSubjCode == null)? 0 :this.scacrseSubjCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CourseDetailInformationTransferInstitutions100QapiPost) == false) {
            return false;
        }
        CourseDetailInformationTransferInstitutions100QapiPost rhs = ((CourseDetailInformationTransferInstitutions100QapiPost) other);
        return (((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.scacrseCrseNumb == rhs.scacrseCrseNumb)||((this.scacrseCrseNumb!= null)&&this.scacrseCrseNumb.equals(rhs.scacrseCrseNumb))))&&((this.scacrseTermCodeEff == rhs.scacrseTermCodeEff)||((this.scacrseTermCodeEff!= null)&&this.scacrseTermCodeEff.equals(rhs.scacrseTermCodeEff))))&&((this.scacrseSubjCode == rhs.scacrseSubjCode)||((this.scacrseSubjCode!= null)&&this.scacrseSubjCode.equals(rhs.scacrseSubjCode))));
    }

}
