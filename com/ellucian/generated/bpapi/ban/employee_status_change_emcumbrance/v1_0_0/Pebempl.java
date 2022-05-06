
package com.ellucian.generated.bpapi.ban.employee_status_change_emcumbrance.v1_0_0;

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
    "firstWorkDate",
    "lreaDesc",
    "termBargCbox",
    "currentHireDate",
    "adjServiceDate",
    "userId",
    "loaBegDate",
    "activityDate",
    "perbargEndDate",
    "treaDesc",
    "lastWorkDate",
    "loaEndDate",
    "treaCode",
    "lreaCode"
})
@Generated("jsonschema2pojo")
public class Pebempl {

    /**
     * First Work Day
     * <p>
     * Lineage reference object : PEBEMPL_FIRST_WORK_DATE
     * 
     */
    @JsonProperty("firstWorkDate")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_FIRST_WORK_DATE")
    private Date firstWorkDate;
    @JsonProperty("lreaDesc")
    private String lreaDesc;
    /**
     * Terminate Bargaining Units
     * <p>
     * 
     * 
     */
    @JsonProperty("termBargCbox")
    private String termBargCbox;
    /**
     * Current Hire Date
     * <p>
     * Lineage reference object : PEBEMPL_CURRENT_HIRE_DATE
     * 
     */
    @JsonProperty("currentHireDate")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_CURRENT_HIRE_DATE")
    private Date currentHireDate;
    /**
     * Adjusted Service Date
     * <p>
     * Lineage reference object : PEBEMPL_ADJ_SERVICE_DATE
     * 
     */
    @JsonProperty("adjServiceDate")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_ADJ_SERVICE_DATE")
    private Date adjServiceDate;
    /**
     * Lineage reference object : PEBEMPL_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_USER_ID")
    private String userId;
    /**
     * Leave Begin Date
     * <p>
     * Lineage reference object : PEBEMPL_LOA_BEG_DATE
     * 
     */
    @JsonProperty("loaBegDate")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_LOA_BEG_DATE")
    private Date loaBegDate;
    /**
     * Lineage reference object : PEBEMPL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Bargaining Units End Date
     * <p>
     * 
     * 
     */
    @JsonProperty("perbargEndDate")
    private Date perbargEndDate;
    @JsonProperty("treaDesc")
    private String treaDesc;
    /**
     * Last Work Day
     * <p>
     * Lineage reference object : PEBEMPL_LAST_WORK_DATE
     * 
     */
    @JsonProperty("lastWorkDate")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_LAST_WORK_DATE")
    private Date lastWorkDate;
    /**
     * Leave End Date
     * <p>
     * Lineage reference object : PEBEMPL_LOA_END_DATE
     * 
     */
    @JsonProperty("loaEndDate")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_LOA_END_DATE")
    private Date loaEndDate;
    /**
     * Termination Reason
     * <p>
     * Lineage reference object : PEBEMPL_TREA_CODE
     * 
     */
    @JsonProperty("treaCode")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_TREA_CODE")
    private String treaCode;
    /**
     * Leave Reason
     * <p>
     * Lineage reference object : PEBEMPL_LREA_CODE
     * 
     */
    @JsonProperty("lreaCode")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_LREA_CODE")
    private String lreaCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * First Work Day
     * <p>
     * Lineage reference object : PEBEMPL_FIRST_WORK_DATE
     * 
     */
    @JsonProperty("firstWorkDate")
    public Date getFirstWorkDate() {
        return firstWorkDate;
    }

    /**
     * First Work Day
     * <p>
     * Lineage reference object : PEBEMPL_FIRST_WORK_DATE
     * 
     */
    @JsonProperty("firstWorkDate")
    public void setFirstWorkDate(Date firstWorkDate) {
        this.firstWorkDate = firstWorkDate;
    }

    public Pebempl withFirstWorkDate(Date firstWorkDate) {
        this.firstWorkDate = firstWorkDate;
        return this;
    }

    @JsonProperty("lreaDesc")
    public String getLreaDesc() {
        return lreaDesc;
    }

    @JsonProperty("lreaDesc")
    public void setLreaDesc(String lreaDesc) {
        this.lreaDesc = lreaDesc;
    }

    public Pebempl withLreaDesc(String lreaDesc) {
        this.lreaDesc = lreaDesc;
        return this;
    }

    /**
     * Terminate Bargaining Units
     * <p>
     * 
     * 
     */
    @JsonProperty("termBargCbox")
    public String getTermBargCbox() {
        return termBargCbox;
    }

    /**
     * Terminate Bargaining Units
     * <p>
     * 
     * 
     */
    @JsonProperty("termBargCbox")
    public void setTermBargCbox(String termBargCbox) {
        this.termBargCbox = termBargCbox;
    }

    public Pebempl withTermBargCbox(String termBargCbox) {
        this.termBargCbox = termBargCbox;
        return this;
    }

    /**
     * Current Hire Date
     * <p>
     * Lineage reference object : PEBEMPL_CURRENT_HIRE_DATE
     * 
     */
    @JsonProperty("currentHireDate")
    public Date getCurrentHireDate() {
        return currentHireDate;
    }

    /**
     * Current Hire Date
     * <p>
     * Lineage reference object : PEBEMPL_CURRENT_HIRE_DATE
     * 
     */
    @JsonProperty("currentHireDate")
    public void setCurrentHireDate(Date currentHireDate) {
        this.currentHireDate = currentHireDate;
    }

    public Pebempl withCurrentHireDate(Date currentHireDate) {
        this.currentHireDate = currentHireDate;
        return this;
    }

    /**
     * Adjusted Service Date
     * <p>
     * Lineage reference object : PEBEMPL_ADJ_SERVICE_DATE
     * 
     */
    @JsonProperty("adjServiceDate")
    public Date getAdjServiceDate() {
        return adjServiceDate;
    }

    /**
     * Adjusted Service Date
     * <p>
     * Lineage reference object : PEBEMPL_ADJ_SERVICE_DATE
     * 
     */
    @JsonProperty("adjServiceDate")
    public void setAdjServiceDate(Date adjServiceDate) {
        this.adjServiceDate = adjServiceDate;
    }

    public Pebempl withAdjServiceDate(Date adjServiceDate) {
        this.adjServiceDate = adjServiceDate;
        return this;
    }

    /**
     * Lineage reference object : PEBEMPL_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : PEBEMPL_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Pebempl withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Leave Begin Date
     * <p>
     * Lineage reference object : PEBEMPL_LOA_BEG_DATE
     * 
     */
    @JsonProperty("loaBegDate")
    public Date getLoaBegDate() {
        return loaBegDate;
    }

    /**
     * Leave Begin Date
     * <p>
     * Lineage reference object : PEBEMPL_LOA_BEG_DATE
     * 
     */
    @JsonProperty("loaBegDate")
    public void setLoaBegDate(Date loaBegDate) {
        this.loaBegDate = loaBegDate;
    }

    public Pebempl withLoaBegDate(Date loaBegDate) {
        this.loaBegDate = loaBegDate;
        return this;
    }

    /**
     * Lineage reference object : PEBEMPL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : PEBEMPL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Pebempl withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Bargaining Units End Date
     * <p>
     * 
     * 
     */
    @JsonProperty("perbargEndDate")
    public Date getPerbargEndDate() {
        return perbargEndDate;
    }

    /**
     * Bargaining Units End Date
     * <p>
     * 
     * 
     */
    @JsonProperty("perbargEndDate")
    public void setPerbargEndDate(Date perbargEndDate) {
        this.perbargEndDate = perbargEndDate;
    }

    public Pebempl withPerbargEndDate(Date perbargEndDate) {
        this.perbargEndDate = perbargEndDate;
        return this;
    }

    @JsonProperty("treaDesc")
    public String getTreaDesc() {
        return treaDesc;
    }

    @JsonProperty("treaDesc")
    public void setTreaDesc(String treaDesc) {
        this.treaDesc = treaDesc;
    }

    public Pebempl withTreaDesc(String treaDesc) {
        this.treaDesc = treaDesc;
        return this;
    }

    /**
     * Last Work Day
     * <p>
     * Lineage reference object : PEBEMPL_LAST_WORK_DATE
     * 
     */
    @JsonProperty("lastWorkDate")
    public Date getLastWorkDate() {
        return lastWorkDate;
    }

    /**
     * Last Work Day
     * <p>
     * Lineage reference object : PEBEMPL_LAST_WORK_DATE
     * 
     */
    @JsonProperty("lastWorkDate")
    public void setLastWorkDate(Date lastWorkDate) {
        this.lastWorkDate = lastWorkDate;
    }

    public Pebempl withLastWorkDate(Date lastWorkDate) {
        this.lastWorkDate = lastWorkDate;
        return this;
    }

    /**
     * Leave End Date
     * <p>
     * Lineage reference object : PEBEMPL_LOA_END_DATE
     * 
     */
    @JsonProperty("loaEndDate")
    public Date getLoaEndDate() {
        return loaEndDate;
    }

    /**
     * Leave End Date
     * <p>
     * Lineage reference object : PEBEMPL_LOA_END_DATE
     * 
     */
    @JsonProperty("loaEndDate")
    public void setLoaEndDate(Date loaEndDate) {
        this.loaEndDate = loaEndDate;
    }

    public Pebempl withLoaEndDate(Date loaEndDate) {
        this.loaEndDate = loaEndDate;
        return this;
    }

    /**
     * Termination Reason
     * <p>
     * Lineage reference object : PEBEMPL_TREA_CODE
     * 
     */
    @JsonProperty("treaCode")
    public String getTreaCode() {
        return treaCode;
    }

    /**
     * Termination Reason
     * <p>
     * Lineage reference object : PEBEMPL_TREA_CODE
     * 
     */
    @JsonProperty("treaCode")
    public void setTreaCode(String treaCode) {
        this.treaCode = treaCode;
    }

    public Pebempl withTreaCode(String treaCode) {
        this.treaCode = treaCode;
        return this;
    }

    /**
     * Leave Reason
     * <p>
     * Lineage reference object : PEBEMPL_LREA_CODE
     * 
     */
    @JsonProperty("lreaCode")
    public String getLreaCode() {
        return lreaCode;
    }

    /**
     * Leave Reason
     * <p>
     * Lineage reference object : PEBEMPL_LREA_CODE
     * 
     */
    @JsonProperty("lreaCode")
    public void setLreaCode(String lreaCode) {
        this.lreaCode = lreaCode;
    }

    public Pebempl withLreaCode(String lreaCode) {
        this.lreaCode = lreaCode;
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

    public Pebempl withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Pebempl.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("firstWorkDate");
        sb.append('=');
        sb.append(((this.firstWorkDate == null)?"<null>":this.firstWorkDate));
        sb.append(',');
        sb.append("lreaDesc");
        sb.append('=');
        sb.append(((this.lreaDesc == null)?"<null>":this.lreaDesc));
        sb.append(',');
        sb.append("termBargCbox");
        sb.append('=');
        sb.append(((this.termBargCbox == null)?"<null>":this.termBargCbox));
        sb.append(',');
        sb.append("currentHireDate");
        sb.append('=');
        sb.append(((this.currentHireDate == null)?"<null>":this.currentHireDate));
        sb.append(',');
        sb.append("adjServiceDate");
        sb.append('=');
        sb.append(((this.adjServiceDate == null)?"<null>":this.adjServiceDate));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("loaBegDate");
        sb.append('=');
        sb.append(((this.loaBegDate == null)?"<null>":this.loaBegDate));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("perbargEndDate");
        sb.append('=');
        sb.append(((this.perbargEndDate == null)?"<null>":this.perbargEndDate));
        sb.append(',');
        sb.append("treaDesc");
        sb.append('=');
        sb.append(((this.treaDesc == null)?"<null>":this.treaDesc));
        sb.append(',');
        sb.append("lastWorkDate");
        sb.append('=');
        sb.append(((this.lastWorkDate == null)?"<null>":this.lastWorkDate));
        sb.append(',');
        sb.append("loaEndDate");
        sb.append('=');
        sb.append(((this.loaEndDate == null)?"<null>":this.loaEndDate));
        sb.append(',');
        sb.append("treaCode");
        sb.append('=');
        sb.append(((this.treaCode == null)?"<null>":this.treaCode));
        sb.append(',');
        sb.append("lreaCode");
        sb.append('=');
        sb.append(((this.lreaCode == null)?"<null>":this.lreaCode));
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
        result = ((result* 31)+((this.firstWorkDate == null)? 0 :this.firstWorkDate.hashCode()));
        result = ((result* 31)+((this.lreaDesc == null)? 0 :this.lreaDesc.hashCode()));
        result = ((result* 31)+((this.termBargCbox == null)? 0 :this.termBargCbox.hashCode()));
        result = ((result* 31)+((this.currentHireDate == null)? 0 :this.currentHireDate.hashCode()));
        result = ((result* 31)+((this.adjServiceDate == null)? 0 :this.adjServiceDate.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.loaBegDate == null)? 0 :this.loaBegDate.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.perbargEndDate == null)? 0 :this.perbargEndDate.hashCode()));
        result = ((result* 31)+((this.treaDesc == null)? 0 :this.treaDesc.hashCode()));
        result = ((result* 31)+((this.lastWorkDate == null)? 0 :this.lastWorkDate.hashCode()));
        result = ((result* 31)+((this.loaEndDate == null)? 0 :this.loaEndDate.hashCode()));
        result = ((result* 31)+((this.treaCode == null)? 0 :this.treaCode.hashCode()));
        result = ((result* 31)+((this.lreaCode == null)? 0 :this.lreaCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Pebempl) == false) {
            return false;
        }
        Pebempl rhs = ((Pebempl) other);
        return ((((((((((((((((this.firstWorkDate == rhs.firstWorkDate)||((this.firstWorkDate!= null)&&this.firstWorkDate.equals(rhs.firstWorkDate)))&&((this.lreaDesc == rhs.lreaDesc)||((this.lreaDesc!= null)&&this.lreaDesc.equals(rhs.lreaDesc))))&&((this.termBargCbox == rhs.termBargCbox)||((this.termBargCbox!= null)&&this.termBargCbox.equals(rhs.termBargCbox))))&&((this.currentHireDate == rhs.currentHireDate)||((this.currentHireDate!= null)&&this.currentHireDate.equals(rhs.currentHireDate))))&&((this.adjServiceDate == rhs.adjServiceDate)||((this.adjServiceDate!= null)&&this.adjServiceDate.equals(rhs.adjServiceDate))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.loaBegDate == rhs.loaBegDate)||((this.loaBegDate!= null)&&this.loaBegDate.equals(rhs.loaBegDate))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.perbargEndDate == rhs.perbargEndDate)||((this.perbargEndDate!= null)&&this.perbargEndDate.equals(rhs.perbargEndDate))))&&((this.treaDesc == rhs.treaDesc)||((this.treaDesc!= null)&&this.treaDesc.equals(rhs.treaDesc))))&&((this.lastWorkDate == rhs.lastWorkDate)||((this.lastWorkDate!= null)&&this.lastWorkDate.equals(rhs.lastWorkDate))))&&((this.loaEndDate == rhs.loaEndDate)||((this.loaEndDate!= null)&&this.loaEndDate.equals(rhs.loaEndDate))))&&((this.treaCode == rhs.treaCode)||((this.treaCode!= null)&&this.treaCode.equals(rhs.treaCode))))&&((this.lreaCode == rhs.lreaCode)||((this.lreaCode!= null)&&this.lreaCode.equals(rhs.lreaCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
