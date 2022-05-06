
package com.ellucian.generated.bpapi.ban.student_registration_permit_override.v1_0_0;

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
    "keyblocId",
    "keyblocTermCode",
    "rovrCode",
    "crn",
    "subjCode",
    "crseNumb",
    "seqNumb",
    "activityDate"
})
@Generated("jsonschema2pojo")
public class StudentRegistrationPermitOverride100QapiPost {

    @JsonProperty("keyblocId")
    private String keyblocId;
    @JsonProperty("keyblocTermCode")
    private String keyblocTermCode;
    @JsonProperty("rovrCode")
    private String rovrCode;
    @JsonProperty("crn")
    private String crn;
    @JsonProperty("subjCode")
    private String subjCode;
    @JsonProperty("crseNumb")
    private String crseNumb;
    @JsonProperty("seqNumb")
    private String seqNumb;
    @JsonProperty("activityDate")
    private String activityDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("keyblocId")
    public String getKeyblocId() {
        return keyblocId;
    }

    @JsonProperty("keyblocId")
    public void setKeyblocId(String keyblocId) {
        this.keyblocId = keyblocId;
    }

    public StudentRegistrationPermitOverride100QapiPost withKeyblocId(String keyblocId) {
        this.keyblocId = keyblocId;
        return this;
    }

    @JsonProperty("keyblocTermCode")
    public String getKeyblocTermCode() {
        return keyblocTermCode;
    }

    @JsonProperty("keyblocTermCode")
    public void setKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
    }

    public StudentRegistrationPermitOverride100QapiPost withKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
        return this;
    }

    @JsonProperty("rovrCode")
    public String getRovrCode() {
        return rovrCode;
    }

    @JsonProperty("rovrCode")
    public void setRovrCode(String rovrCode) {
        this.rovrCode = rovrCode;
    }

    public StudentRegistrationPermitOverride100QapiPost withRovrCode(String rovrCode) {
        this.rovrCode = rovrCode;
        return this;
    }

    @JsonProperty("crn")
    public String getCrn() {
        return crn;
    }

    @JsonProperty("crn")
    public void setCrn(String crn) {
        this.crn = crn;
    }

    public StudentRegistrationPermitOverride100QapiPost withCrn(String crn) {
        this.crn = crn;
        return this;
    }

    @JsonProperty("subjCode")
    public String getSubjCode() {
        return subjCode;
    }

    @JsonProperty("subjCode")
    public void setSubjCode(String subjCode) {
        this.subjCode = subjCode;
    }

    public StudentRegistrationPermitOverride100QapiPost withSubjCode(String subjCode) {
        this.subjCode = subjCode;
        return this;
    }

    @JsonProperty("crseNumb")
    public String getCrseNumb() {
        return crseNumb;
    }

    @JsonProperty("crseNumb")
    public void setCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
    }

    public StudentRegistrationPermitOverride100QapiPost withCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
        return this;
    }

    @JsonProperty("seqNumb")
    public String getSeqNumb() {
        return seqNumb;
    }

    @JsonProperty("seqNumb")
    public void setSeqNumb(String seqNumb) {
        this.seqNumb = seqNumb;
    }

    public StudentRegistrationPermitOverride100QapiPost withSeqNumb(String seqNumb) {
        this.seqNumb = seqNumb;
        return this;
    }

    @JsonProperty("activityDate")
    public String getActivityDate() {
        return activityDate;
    }

    @JsonProperty("activityDate")
    public void setActivityDate(String activityDate) {
        this.activityDate = activityDate;
    }

    public StudentRegistrationPermitOverride100QapiPost withActivityDate(String activityDate) {
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

    public StudentRegistrationPermitOverride100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentRegistrationPermitOverride100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblocId");
        sb.append('=');
        sb.append(((this.keyblocId == null)?"<null>":this.keyblocId));
        sb.append(',');
        sb.append("keyblocTermCode");
        sb.append('=');
        sb.append(((this.keyblocTermCode == null)?"<null>":this.keyblocTermCode));
        sb.append(',');
        sb.append("rovrCode");
        sb.append('=');
        sb.append(((this.rovrCode == null)?"<null>":this.rovrCode));
        sb.append(',');
        sb.append("crn");
        sb.append('=');
        sb.append(((this.crn == null)?"<null>":this.crn));
        sb.append(',');
        sb.append("subjCode");
        sb.append('=');
        sb.append(((this.subjCode == null)?"<null>":this.subjCode));
        sb.append(',');
        sb.append("crseNumb");
        sb.append('=');
        sb.append(((this.crseNumb == null)?"<null>":this.crseNumb));
        sb.append(',');
        sb.append("seqNumb");
        sb.append('=');
        sb.append(((this.seqNumb == null)?"<null>":this.seqNumb));
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
        result = ((result* 31)+((this.crseNumb == null)? 0 :this.crseNumb.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.keyblocTermCode == null)? 0 :this.keyblocTermCode.hashCode()));
        result = ((result* 31)+((this.subjCode == null)? 0 :this.subjCode.hashCode()));
        result = ((result* 31)+((this.seqNumb == null)? 0 :this.seqNumb.hashCode()));
        result = ((result* 31)+((this.rovrCode == null)? 0 :this.rovrCode.hashCode()));
        result = ((result* 31)+((this.keyblocId == null)? 0 :this.keyblocId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.crn == null)? 0 :this.crn.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentRegistrationPermitOverride100QapiPost) == false) {
            return false;
        }
        StudentRegistrationPermitOverride100QapiPost rhs = ((StudentRegistrationPermitOverride100QapiPost) other);
        return ((((((((((this.crseNumb == rhs.crseNumb)||((this.crseNumb!= null)&&this.crseNumb.equals(rhs.crseNumb)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.keyblocTermCode == rhs.keyblocTermCode)||((this.keyblocTermCode!= null)&&this.keyblocTermCode.equals(rhs.keyblocTermCode))))&&((this.subjCode == rhs.subjCode)||((this.subjCode!= null)&&this.subjCode.equals(rhs.subjCode))))&&((this.seqNumb == rhs.seqNumb)||((this.seqNumb!= null)&&this.seqNumb.equals(rhs.seqNumb))))&&((this.rovrCode == rhs.rovrCode)||((this.rovrCode!= null)&&this.rovrCode.equals(rhs.rovrCode))))&&((this.keyblocId == rhs.keyblocId)||((this.keyblocId!= null)&&this.keyblocId.equals(rhs.keyblocId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.crn == rhs.crn)||((this.crn!= null)&&this.crn.equals(rhs.crn))));
    }

}
