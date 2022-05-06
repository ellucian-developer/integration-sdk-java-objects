
package com.ellucian.generated.bpapi.ban.student_adjustment_targets_waivers_substitutions_other_adjustments_tracking.v1_0_0;

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
    "smbsotkTableName",
    "smbsotkTermCodeEff",
    "keyblckTermCode",
    "smrsotkActivityDate",
    "id",
    "smbsotkUser",
    "smrsotkText",
    "smbsotkActivityDate",
    "smbsotkTableNameDesc"
})
@Generated("jsonschema2pojo")
public class StudentAdjustmentTargetsWaiversSubstitutionsOtherAdjustmentsTracking100GetRequest {

    /**
     * Smbsotk Table Name
     * <p>
     * Lineage reference object : SMBSOTK_TABLE_NAME, Lookup lineage reference object : smbsotk,smbsotk
     * 
     */
    @JsonProperty("smbsotkTableName")
    @JsonPropertyDescription("Lineage reference object : SMBSOTK_TABLE_NAME, Lookup lineage reference object : smbsotk,smbsotk")
    private String smbsotkTableName;
    /**
     * Smbsotk Term Code Eff
     * <p>
     * Lineage reference object : SMBSOTK_TERM_CODE_EFF, Lookup lineage reference object : smbsotk
     * 
     */
    @JsonProperty("smbsotkTermCodeEff")
    @JsonPropertyDescription("Lineage reference object : SMBSOTK_TERM_CODE_EFF, Lookup lineage reference object : smbsotk")
    private String smbsotkTermCodeEff;
    /**
     * Term
     * <p>
     * Lineage reference object : keyblckTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblckTermCode")
    @JsonPropertyDescription("Lineage reference object : keyblckTermCode, Lookup lineage reference object : stvterm")
    private Object keyblckTermCode;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SMRSOTK_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("smrsotkActivityDate")
    @JsonPropertyDescription("Lineage reference object : SMRSOTK_ACTIVITY_DATE")
    private Date smrsotkActivityDate;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
    /**
     * Smbsotk User
     * <p>
     * Lineage reference object : SMBSOTK_USER, Lookup lineage reference object : smbsotk,smbsotk
     * 
     */
    @JsonProperty("smbsotkUser")
    @JsonPropertyDescription("Lineage reference object : SMBSOTK_USER, Lookup lineage reference object : smbsotk,smbsotk")
    private String smbsotkUser;
    /**
     * Text Tracking
     * <p>
     * Lineage reference object : SMRSOTK_TEXT
     * 
     */
    @JsonProperty("smrsotkText")
    @JsonPropertyDescription("Lineage reference object : SMRSOTK_TEXT")
    private String smrsotkText;
    /**
     * Smbsotk Activity Date
     * <p>
     * Lineage reference object : SMBSOTK_ACTIVITY_DATE
     * 
     */
    @JsonProperty("smbsotkActivityDate")
    @JsonPropertyDescription("Lineage reference object : SMBSOTK_ACTIVITY_DATE")
    private Date smbsotkActivityDate;
    /**
     * Smbsotk Table Name Desc
     * <p>
     * Lineage reference object : SMBSOTK_TABLE_NAME_DESC
     * 
     */
    @JsonProperty("smbsotkTableNameDesc")
    @JsonPropertyDescription("Lineage reference object : SMBSOTK_TABLE_NAME_DESC")
    private String smbsotkTableNameDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Smbsotk Table Name
     * <p>
     * Lineage reference object : SMBSOTK_TABLE_NAME, Lookup lineage reference object : smbsotk,smbsotk
     * 
     */
    @JsonProperty("smbsotkTableName")
    public String getSmbsotkTableName() {
        return smbsotkTableName;
    }

    /**
     * Smbsotk Table Name
     * <p>
     * Lineage reference object : SMBSOTK_TABLE_NAME, Lookup lineage reference object : smbsotk,smbsotk
     * 
     */
    @JsonProperty("smbsotkTableName")
    public void setSmbsotkTableName(String smbsotkTableName) {
        this.smbsotkTableName = smbsotkTableName;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsOtherAdjustmentsTracking100GetRequest withSmbsotkTableName(String smbsotkTableName) {
        this.smbsotkTableName = smbsotkTableName;
        return this;
    }

    /**
     * Smbsotk Term Code Eff
     * <p>
     * Lineage reference object : SMBSOTK_TERM_CODE_EFF, Lookup lineage reference object : smbsotk
     * 
     */
    @JsonProperty("smbsotkTermCodeEff")
    public String getSmbsotkTermCodeEff() {
        return smbsotkTermCodeEff;
    }

    /**
     * Smbsotk Term Code Eff
     * <p>
     * Lineage reference object : SMBSOTK_TERM_CODE_EFF, Lookup lineage reference object : smbsotk
     * 
     */
    @JsonProperty("smbsotkTermCodeEff")
    public void setSmbsotkTermCodeEff(String smbsotkTermCodeEff) {
        this.smbsotkTermCodeEff = smbsotkTermCodeEff;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsOtherAdjustmentsTracking100GetRequest withSmbsotkTermCodeEff(String smbsotkTermCodeEff) {
        this.smbsotkTermCodeEff = smbsotkTermCodeEff;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblckTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblckTermCode")
    public Object getKeyblckTermCode() {
        return keyblckTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblckTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblckTermCode")
    public void setKeyblckTermCode(Object keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsOtherAdjustmentsTracking100GetRequest withKeyblckTermCode(Object keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SMRSOTK_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("smrsotkActivityDate")
    public Date getSmrsotkActivityDate() {
        return smrsotkActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SMRSOTK_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("smrsotkActivityDate")
    public void setSmrsotkActivityDate(Date smrsotkActivityDate) {
        this.smrsotkActivityDate = smrsotkActivityDate;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsOtherAdjustmentsTracking100GetRequest withSmrsotkActivityDate(Date smrsotkActivityDate) {
        this.smrsotkActivityDate = smrsotkActivityDate;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsOtherAdjustmentsTracking100GetRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Smbsotk User
     * <p>
     * Lineage reference object : SMBSOTK_USER, Lookup lineage reference object : smbsotk,smbsotk
     * 
     */
    @JsonProperty("smbsotkUser")
    public String getSmbsotkUser() {
        return smbsotkUser;
    }

    /**
     * Smbsotk User
     * <p>
     * Lineage reference object : SMBSOTK_USER, Lookup lineage reference object : smbsotk,smbsotk
     * 
     */
    @JsonProperty("smbsotkUser")
    public void setSmbsotkUser(String smbsotkUser) {
        this.smbsotkUser = smbsotkUser;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsOtherAdjustmentsTracking100GetRequest withSmbsotkUser(String smbsotkUser) {
        this.smbsotkUser = smbsotkUser;
        return this;
    }

    /**
     * Text Tracking
     * <p>
     * Lineage reference object : SMRSOTK_TEXT
     * 
     */
    @JsonProperty("smrsotkText")
    public String getSmrsotkText() {
        return smrsotkText;
    }

    /**
     * Text Tracking
     * <p>
     * Lineage reference object : SMRSOTK_TEXT
     * 
     */
    @JsonProperty("smrsotkText")
    public void setSmrsotkText(String smrsotkText) {
        this.smrsotkText = smrsotkText;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsOtherAdjustmentsTracking100GetRequest withSmrsotkText(String smrsotkText) {
        this.smrsotkText = smrsotkText;
        return this;
    }

    /**
     * Smbsotk Activity Date
     * <p>
     * Lineage reference object : SMBSOTK_ACTIVITY_DATE
     * 
     */
    @JsonProperty("smbsotkActivityDate")
    public Date getSmbsotkActivityDate() {
        return smbsotkActivityDate;
    }

    /**
     * Smbsotk Activity Date
     * <p>
     * Lineage reference object : SMBSOTK_ACTIVITY_DATE
     * 
     */
    @JsonProperty("smbsotkActivityDate")
    public void setSmbsotkActivityDate(Date smbsotkActivityDate) {
        this.smbsotkActivityDate = smbsotkActivityDate;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsOtherAdjustmentsTracking100GetRequest withSmbsotkActivityDate(Date smbsotkActivityDate) {
        this.smbsotkActivityDate = smbsotkActivityDate;
        return this;
    }

    /**
     * Smbsotk Table Name Desc
     * <p>
     * Lineage reference object : SMBSOTK_TABLE_NAME_DESC
     * 
     */
    @JsonProperty("smbsotkTableNameDesc")
    public String getSmbsotkTableNameDesc() {
        return smbsotkTableNameDesc;
    }

    /**
     * Smbsotk Table Name Desc
     * <p>
     * Lineage reference object : SMBSOTK_TABLE_NAME_DESC
     * 
     */
    @JsonProperty("smbsotkTableNameDesc")
    public void setSmbsotkTableNameDesc(String smbsotkTableNameDesc) {
        this.smbsotkTableNameDesc = smbsotkTableNameDesc;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsOtherAdjustmentsTracking100GetRequest withSmbsotkTableNameDesc(String smbsotkTableNameDesc) {
        this.smbsotkTableNameDesc = smbsotkTableNameDesc;
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

    public StudentAdjustmentTargetsWaiversSubstitutionsOtherAdjustmentsTracking100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentAdjustmentTargetsWaiversSubstitutionsOtherAdjustmentsTracking100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("smbsotkTableName");
        sb.append('=');
        sb.append(((this.smbsotkTableName == null)?"<null>":this.smbsotkTableName));
        sb.append(',');
        sb.append("smbsotkTermCodeEff");
        sb.append('=');
        sb.append(((this.smbsotkTermCodeEff == null)?"<null>":this.smbsotkTermCodeEff));
        sb.append(',');
        sb.append("keyblckTermCode");
        sb.append('=');
        sb.append(((this.keyblckTermCode == null)?"<null>":this.keyblckTermCode));
        sb.append(',');
        sb.append("smrsotkActivityDate");
        sb.append('=');
        sb.append(((this.smrsotkActivityDate == null)?"<null>":this.smrsotkActivityDate));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("smbsotkUser");
        sb.append('=');
        sb.append(((this.smbsotkUser == null)?"<null>":this.smbsotkUser));
        sb.append(',');
        sb.append("smrsotkText");
        sb.append('=');
        sb.append(((this.smrsotkText == null)?"<null>":this.smrsotkText));
        sb.append(',');
        sb.append("smbsotkActivityDate");
        sb.append('=');
        sb.append(((this.smbsotkActivityDate == null)?"<null>":this.smbsotkActivityDate));
        sb.append(',');
        sb.append("smbsotkTableNameDesc");
        sb.append('=');
        sb.append(((this.smbsotkTableNameDesc == null)?"<null>":this.smbsotkTableNameDesc));
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
        if ((other instanceof StudentAdjustmentTargetsWaiversSubstitutionsOtherAdjustmentsTracking100GetRequest) == false) {
            return false;
        }
        StudentAdjustmentTargetsWaiversSubstitutionsOtherAdjustmentsTracking100GetRequest rhs = ((StudentAdjustmentTargetsWaiversSubstitutionsOtherAdjustmentsTracking100GetRequest) other);
        return (((((((((((this.smbsotkTableName == rhs.smbsotkTableName)||((this.smbsotkTableName!= null)&&this.smbsotkTableName.equals(rhs.smbsotkTableName)))&&((this.smbsotkTermCodeEff == rhs.smbsotkTermCodeEff)||((this.smbsotkTermCodeEff!= null)&&this.smbsotkTermCodeEff.equals(rhs.smbsotkTermCodeEff))))&&((this.keyblckTermCode == rhs.keyblckTermCode)||((this.keyblckTermCode!= null)&&this.keyblckTermCode.equals(rhs.keyblckTermCode))))&&((this.smrsotkActivityDate == rhs.smrsotkActivityDate)||((this.smrsotkActivityDate!= null)&&this.smrsotkActivityDate.equals(rhs.smrsotkActivityDate))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.smbsotkUser == rhs.smbsotkUser)||((this.smbsotkUser!= null)&&this.smbsotkUser.equals(rhs.smbsotkUser))))&&((this.smrsotkText == rhs.smrsotkText)||((this.smrsotkText!= null)&&this.smrsotkText.equals(rhs.smrsotkText))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.smbsotkActivityDate == rhs.smbsotkActivityDate)||((this.smbsotkActivityDate!= null)&&this.smbsotkActivityDate.equals(rhs.smbsotkActivityDate))))&&((this.smbsotkTableNameDesc == rhs.smbsotkTableNameDesc)||((this.smbsotkTableNameDesc!= null)&&this.smbsotkTableNameDesc.equals(rhs.smbsotkTableNameDesc))));
    }

}
