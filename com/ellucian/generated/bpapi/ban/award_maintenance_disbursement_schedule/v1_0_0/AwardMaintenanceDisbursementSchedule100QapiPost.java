
package com.ellucian.generated.bpapi.ban.award_maintenance_disbursement_schedule.v1_0_0;

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
    "keyblckAidyCode",
    "id",
    "fundCode",
    "period",
    "scheduleDate",
    "displayScheduleAmt",
    "disbursePct",
    "disburseLoadOpt"
})
@Generated("jsonschema2pojo")
public class AwardMaintenanceDisbursementSchedule100QapiPost {

    @JsonProperty("keyblckAidyCode")
    private String keyblckAidyCode;
    @JsonProperty("id")
    private String id;
    @JsonProperty("fundCode")
    private String fundCode;
    @JsonProperty("period")
    private String period;
    @JsonProperty("scheduleDate")
    private String scheduleDate;
    @JsonProperty("displayScheduleAmt")
    private String displayScheduleAmt;
    @JsonProperty("disbursePct")
    private String disbursePct;
    @JsonProperty("disburseLoadOpt")
    private String disburseLoadOpt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("keyblckAidyCode")
    public String getKeyblckAidyCode() {
        return keyblckAidyCode;
    }

    @JsonProperty("keyblckAidyCode")
    public void setKeyblckAidyCode(String keyblckAidyCode) {
        this.keyblckAidyCode = keyblckAidyCode;
    }

    public AwardMaintenanceDisbursementSchedule100QapiPost withKeyblckAidyCode(String keyblckAidyCode) {
        this.keyblckAidyCode = keyblckAidyCode;
        return this;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public AwardMaintenanceDisbursementSchedule100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("fundCode")
    public String getFundCode() {
        return fundCode;
    }

    @JsonProperty("fundCode")
    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public AwardMaintenanceDisbursementSchedule100QapiPost withFundCode(String fundCode) {
        this.fundCode = fundCode;
        return this;
    }

    @JsonProperty("period")
    public String getPeriod() {
        return period;
    }

    @JsonProperty("period")
    public void setPeriod(String period) {
        this.period = period;
    }

    public AwardMaintenanceDisbursementSchedule100QapiPost withPeriod(String period) {
        this.period = period;
        return this;
    }

    @JsonProperty("scheduleDate")
    public String getScheduleDate() {
        return scheduleDate;
    }

    @JsonProperty("scheduleDate")
    public void setScheduleDate(String scheduleDate) {
        this.scheduleDate = scheduleDate;
    }

    public AwardMaintenanceDisbursementSchedule100QapiPost withScheduleDate(String scheduleDate) {
        this.scheduleDate = scheduleDate;
        return this;
    }

    @JsonProperty("displayScheduleAmt")
    public String getDisplayScheduleAmt() {
        return displayScheduleAmt;
    }

    @JsonProperty("displayScheduleAmt")
    public void setDisplayScheduleAmt(String displayScheduleAmt) {
        this.displayScheduleAmt = displayScheduleAmt;
    }

    public AwardMaintenanceDisbursementSchedule100QapiPost withDisplayScheduleAmt(String displayScheduleAmt) {
        this.displayScheduleAmt = displayScheduleAmt;
        return this;
    }

    @JsonProperty("disbursePct")
    public String getDisbursePct() {
        return disbursePct;
    }

    @JsonProperty("disbursePct")
    public void setDisbursePct(String disbursePct) {
        this.disbursePct = disbursePct;
    }

    public AwardMaintenanceDisbursementSchedule100QapiPost withDisbursePct(String disbursePct) {
        this.disbursePct = disbursePct;
        return this;
    }

    @JsonProperty("disburseLoadOpt")
    public String getDisburseLoadOpt() {
        return disburseLoadOpt;
    }

    @JsonProperty("disburseLoadOpt")
    public void setDisburseLoadOpt(String disburseLoadOpt) {
        this.disburseLoadOpt = disburseLoadOpt;
    }

    public AwardMaintenanceDisbursementSchedule100QapiPost withDisburseLoadOpt(String disburseLoadOpt) {
        this.disburseLoadOpt = disburseLoadOpt;
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

    public AwardMaintenanceDisbursementSchedule100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AwardMaintenanceDisbursementSchedule100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblckAidyCode");
        sb.append('=');
        sb.append(((this.keyblckAidyCode == null)?"<null>":this.keyblckAidyCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("fundCode");
        sb.append('=');
        sb.append(((this.fundCode == null)?"<null>":this.fundCode));
        sb.append(',');
        sb.append("period");
        sb.append('=');
        sb.append(((this.period == null)?"<null>":this.period));
        sb.append(',');
        sb.append("scheduleDate");
        sb.append('=');
        sb.append(((this.scheduleDate == null)?"<null>":this.scheduleDate));
        sb.append(',');
        sb.append("displayScheduleAmt");
        sb.append('=');
        sb.append(((this.displayScheduleAmt == null)?"<null>":this.displayScheduleAmt));
        sb.append(',');
        sb.append("disbursePct");
        sb.append('=');
        sb.append(((this.disbursePct == null)?"<null>":this.disbursePct));
        sb.append(',');
        sb.append("disburseLoadOpt");
        sb.append('=');
        sb.append(((this.disburseLoadOpt == null)?"<null>":this.disburseLoadOpt));
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
        result = ((result* 31)+((this.keyblckAidyCode == null)? 0 :this.keyblckAidyCode.hashCode()));
        result = ((result* 31)+((this.period == null)? 0 :this.period.hashCode()));
        result = ((result* 31)+((this.fundCode == null)? 0 :this.fundCode.hashCode()));
        result = ((result* 31)+((this.disbursePct == null)? 0 :this.disbursePct.hashCode()));
        result = ((result* 31)+((this.scheduleDate == null)? 0 :this.scheduleDate.hashCode()));
        result = ((result* 31)+((this.disburseLoadOpt == null)? 0 :this.disburseLoadOpt.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.displayScheduleAmt == null)? 0 :this.displayScheduleAmt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AwardMaintenanceDisbursementSchedule100QapiPost) == false) {
            return false;
        }
        AwardMaintenanceDisbursementSchedule100QapiPost rhs = ((AwardMaintenanceDisbursementSchedule100QapiPost) other);
        return ((((((((((this.keyblckAidyCode == rhs.keyblckAidyCode)||((this.keyblckAidyCode!= null)&&this.keyblckAidyCode.equals(rhs.keyblckAidyCode)))&&((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period))))&&((this.fundCode == rhs.fundCode)||((this.fundCode!= null)&&this.fundCode.equals(rhs.fundCode))))&&((this.disbursePct == rhs.disbursePct)||((this.disbursePct!= null)&&this.disbursePct.equals(rhs.disbursePct))))&&((this.scheduleDate == rhs.scheduleDate)||((this.scheduleDate!= null)&&this.scheduleDate.equals(rhs.scheduleDate))))&&((this.disburseLoadOpt == rhs.disburseLoadOpt)||((this.disburseLoadOpt!= null)&&this.disburseLoadOpt.equals(rhs.disburseLoadOpt))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.displayScheduleAmt == rhs.displayScheduleAmt)||((this.displayScheduleAmt!= null)&&this.displayScheduleAmt.equals(rhs.displayScheduleAmt))));
    }

}
