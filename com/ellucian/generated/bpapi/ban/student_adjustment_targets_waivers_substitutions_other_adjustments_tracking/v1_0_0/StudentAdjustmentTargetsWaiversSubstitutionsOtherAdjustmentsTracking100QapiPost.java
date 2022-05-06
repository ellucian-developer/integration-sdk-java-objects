
package com.ellucian.generated.bpapi.ban.student_adjustment_targets_waivers_substitutions_other_adjustments_tracking.v1_0_0;

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
    "id",
    "keyblckTermCode",
    "smbsotkTableName",
    "smbsotkTableNameDesc",
    "smbsotkUser",
    "smbsotkTermCodeEff",
    "smbsotkActivityDate",
    "smrsotkActivityDate",
    "smrsotkText"
})
@Generated("jsonschema2pojo")
public class StudentAdjustmentTargetsWaiversSubstitutionsOtherAdjustmentsTracking100QapiPost {

    @JsonProperty("id")
    private String id;
    @JsonProperty("keyblckTermCode")
    private String keyblckTermCode;
    @JsonProperty("smbsotkTableName")
    private String smbsotkTableName;
    @JsonProperty("smbsotkTableNameDesc")
    private String smbsotkTableNameDesc;
    @JsonProperty("smbsotkUser")
    private String smbsotkUser;
    @JsonProperty("smbsotkTermCodeEff")
    private String smbsotkTermCodeEff;
    @JsonProperty("smbsotkActivityDate")
    private String smbsotkActivityDate;
    @JsonProperty("smrsotkActivityDate")
    private String smrsotkActivityDate;
    @JsonProperty("smrsotkText")
    private String smrsotkText;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsOtherAdjustmentsTracking100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("keyblckTermCode")
    public String getKeyblckTermCode() {
        return keyblckTermCode;
    }

    @JsonProperty("keyblckTermCode")
    public void setKeyblckTermCode(String keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsOtherAdjustmentsTracking100QapiPost withKeyblckTermCode(String keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
        return this;
    }

    @JsonProperty("smbsotkTableName")
    public String getSmbsotkTableName() {
        return smbsotkTableName;
    }

    @JsonProperty("smbsotkTableName")
    public void setSmbsotkTableName(String smbsotkTableName) {
        this.smbsotkTableName = smbsotkTableName;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsOtherAdjustmentsTracking100QapiPost withSmbsotkTableName(String smbsotkTableName) {
        this.smbsotkTableName = smbsotkTableName;
        return this;
    }

    @JsonProperty("smbsotkTableNameDesc")
    public String getSmbsotkTableNameDesc() {
        return smbsotkTableNameDesc;
    }

    @JsonProperty("smbsotkTableNameDesc")
    public void setSmbsotkTableNameDesc(String smbsotkTableNameDesc) {
        this.smbsotkTableNameDesc = smbsotkTableNameDesc;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsOtherAdjustmentsTracking100QapiPost withSmbsotkTableNameDesc(String smbsotkTableNameDesc) {
        this.smbsotkTableNameDesc = smbsotkTableNameDesc;
        return this;
    }

    @JsonProperty("smbsotkUser")
    public String getSmbsotkUser() {
        return smbsotkUser;
    }

    @JsonProperty("smbsotkUser")
    public void setSmbsotkUser(String smbsotkUser) {
        this.smbsotkUser = smbsotkUser;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsOtherAdjustmentsTracking100QapiPost withSmbsotkUser(String smbsotkUser) {
        this.smbsotkUser = smbsotkUser;
        return this;
    }

    @JsonProperty("smbsotkTermCodeEff")
    public String getSmbsotkTermCodeEff() {
        return smbsotkTermCodeEff;
    }

    @JsonProperty("smbsotkTermCodeEff")
    public void setSmbsotkTermCodeEff(String smbsotkTermCodeEff) {
        this.smbsotkTermCodeEff = smbsotkTermCodeEff;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsOtherAdjustmentsTracking100QapiPost withSmbsotkTermCodeEff(String smbsotkTermCodeEff) {
        this.smbsotkTermCodeEff = smbsotkTermCodeEff;
        return this;
    }

    @JsonProperty("smbsotkActivityDate")
    public String getSmbsotkActivityDate() {
        return smbsotkActivityDate;
    }

    @JsonProperty("smbsotkActivityDate")
    public void setSmbsotkActivityDate(String smbsotkActivityDate) {
        this.smbsotkActivityDate = smbsotkActivityDate;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsOtherAdjustmentsTracking100QapiPost withSmbsotkActivityDate(String smbsotkActivityDate) {
        this.smbsotkActivityDate = smbsotkActivityDate;
        return this;
    }

    @JsonProperty("smrsotkActivityDate")
    public String getSmrsotkActivityDate() {
        return smrsotkActivityDate;
    }

    @JsonProperty("smrsotkActivityDate")
    public void setSmrsotkActivityDate(String smrsotkActivityDate) {
        this.smrsotkActivityDate = smrsotkActivityDate;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsOtherAdjustmentsTracking100QapiPost withSmrsotkActivityDate(String smrsotkActivityDate) {
        this.smrsotkActivityDate = smrsotkActivityDate;
        return this;
    }

    @JsonProperty("smrsotkText")
    public String getSmrsotkText() {
        return smrsotkText;
    }

    @JsonProperty("smrsotkText")
    public void setSmrsotkText(String smrsotkText) {
        this.smrsotkText = smrsotkText;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsOtherAdjustmentsTracking100QapiPost withSmrsotkText(String smrsotkText) {
        this.smrsotkText = smrsotkText;
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

    public StudentAdjustmentTargetsWaiversSubstitutionsOtherAdjustmentsTracking100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentAdjustmentTargetsWaiversSubstitutionsOtherAdjustmentsTracking100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("keyblckTermCode");
        sb.append('=');
        sb.append(((this.keyblckTermCode == null)?"<null>":this.keyblckTermCode));
        sb.append(',');
        sb.append("smbsotkTableName");
        sb.append('=');
        sb.append(((this.smbsotkTableName == null)?"<null>":this.smbsotkTableName));
        sb.append(',');
        sb.append("smbsotkTableNameDesc");
        sb.append('=');
        sb.append(((this.smbsotkTableNameDesc == null)?"<null>":this.smbsotkTableNameDesc));
        sb.append(',');
        sb.append("smbsotkUser");
        sb.append('=');
        sb.append(((this.smbsotkUser == null)?"<null>":this.smbsotkUser));
        sb.append(',');
        sb.append("smbsotkTermCodeEff");
        sb.append('=');
        sb.append(((this.smbsotkTermCodeEff == null)?"<null>":this.smbsotkTermCodeEff));
        sb.append(',');
        sb.append("smbsotkActivityDate");
        sb.append('=');
        sb.append(((this.smbsotkActivityDate == null)?"<null>":this.smbsotkActivityDate));
        sb.append(',');
        sb.append("smrsotkActivityDate");
        sb.append('=');
        sb.append(((this.smrsotkActivityDate == null)?"<null>":this.smrsotkActivityDate));
        sb.append(',');
        sb.append("smrsotkText");
        sb.append('=');
        sb.append(((this.smrsotkText == null)?"<null>":this.smrsotkText));
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
        result = ((result* 31)+((this.smbsotkTableName == null)? 0 :this.smbsotkTableName.hashCode()));
        result = ((result* 31)+((this.smbsotkTermCodeEff == null)? 0 :this.smbsotkTermCodeEff.hashCode()));
        result = ((result* 31)+((this.keyblckTermCode == null)? 0 :this.keyblckTermCode.hashCode()));
        result = ((result* 31)+((this.smrsotkActivityDate == null)? 0 :this.smrsotkActivityDate.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.smbsotkUser == null)? 0 :this.smbsotkUser.hashCode()));
        result = ((result* 31)+((this.smrsotkText == null)? 0 :this.smrsotkText.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.smbsotkActivityDate == null)? 0 :this.smbsotkActivityDate.hashCode()));
        result = ((result* 31)+((this.smbsotkTableNameDesc == null)? 0 :this.smbsotkTableNameDesc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentAdjustmentTargetsWaiversSubstitutionsOtherAdjustmentsTracking100QapiPost) == false) {
            return false;
        }
        StudentAdjustmentTargetsWaiversSubstitutionsOtherAdjustmentsTracking100QapiPost rhs = ((StudentAdjustmentTargetsWaiversSubstitutionsOtherAdjustmentsTracking100QapiPost) other);
        return (((((((((((this.smbsotkTableName == rhs.smbsotkTableName)||((this.smbsotkTableName!= null)&&this.smbsotkTableName.equals(rhs.smbsotkTableName)))&&((this.smbsotkTermCodeEff == rhs.smbsotkTermCodeEff)||((this.smbsotkTermCodeEff!= null)&&this.smbsotkTermCodeEff.equals(rhs.smbsotkTermCodeEff))))&&((this.keyblckTermCode == rhs.keyblckTermCode)||((this.keyblckTermCode!= null)&&this.keyblckTermCode.equals(rhs.keyblckTermCode))))&&((this.smrsotkActivityDate == rhs.smrsotkActivityDate)||((this.smrsotkActivityDate!= null)&&this.smrsotkActivityDate.equals(rhs.smrsotkActivityDate))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.smbsotkUser == rhs.smbsotkUser)||((this.smbsotkUser!= null)&&this.smbsotkUser.equals(rhs.smbsotkUser))))&&((this.smrsotkText == rhs.smrsotkText)||((this.smrsotkText!= null)&&this.smrsotkText.equals(rhs.smrsotkText))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.smbsotkActivityDate == rhs.smbsotkActivityDate)||((this.smbsotkActivityDate!= null)&&this.smbsotkActivityDate.equals(rhs.smbsotkActivityDate))))&&((this.smbsotkTableNameDesc == rhs.smbsotkTableNameDesc)||((this.smbsotkTableNameDesc!= null)&&this.smbsotkTableNameDesc.equals(rhs.smbsotkTableNameDesc))));
    }

}
