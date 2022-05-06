
package com.ellucian.generated.bpapi.ban.room_assignment_status.v1_0_0;

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
    "criteria.fromDate",
    "criteria.ascdCode",
    "criteria.toDate",
    "endDate",
    "xxxxxxxTermCode",
    "toDate",
    "criteria.endDate",
    "criteria.startDate",
    "ascdCode",
    "fromDate",
    "criteria.refund",
    "criteria.slrrfcrAscdCode",
    "startDate",
    "refund"
})
@Generated("jsonschema2pojo")
public class RoomAssignmentStatus100PutRequest {

    /**
     * Start
     * <p>
     * Lineage reference object : SLRRFCR_FROM_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.fromDate")
    @JsonPropertyDescription("Lineage reference object : SLRRFCR_FROM_DATE")
    private Date criteriaFromDate;
    /**
     * Assignment Status
     * <p>
     * Lineage reference object : SLRASCD_ASCD_CODE, Lookup lineage reference object : stvascd
     * (Required)
     * 
     */
    @JsonProperty("criteria.ascdCode")
    @JsonPropertyDescription("Lineage reference object : SLRASCD_ASCD_CODE, Lookup lineage reference object : stvascd")
    private String criteriaAscdCode;
    /**
     * End
     * <p>
     * Lineage reference object : SLRRFCR_TO_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.toDate")
    @JsonPropertyDescription("Lineage reference object : SLRRFCR_TO_DATE")
    private Date criteriaToDate;
    /**
     * End
     * <p>
     * Lineage reference object : SLRASCD_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("endDate")
    @JsonPropertyDescription("Lineage reference object : SLRASCD_END_DATE")
    private Date endDate;
    /**
     * Term
     * <p>
     * Lineage reference object : xxxxxxxTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("xxxxxxxTermCode")
    @JsonPropertyDescription("Lineage reference object : xxxxxxxTermCode, Lookup lineage reference object : stvterm")
    private Object xxxxxxxTermCode;
    /**
     * End
     * <p>
     * Lineage reference object : SLRRFCR_TO_DATE
     * (Required)
     * 
     */
    @JsonProperty("toDate")
    @JsonPropertyDescription("Lineage reference object : SLRRFCR_TO_DATE")
    private Date toDate;
    /**
     * End
     * <p>
     * Lineage reference object : SLRASCD_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.endDate")
    @JsonPropertyDescription("Lineage reference object : SLRASCD_END_DATE")
    private Date criteriaEndDate;
    /**
     * Start
     * <p>
     * Lineage reference object : SLRASCD_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.startDate")
    @JsonPropertyDescription("Lineage reference object : SLRASCD_START_DATE")
    private Date criteriaStartDate;
    /**
     * Assignment Status
     * <p>
     * Lineage reference object : SLRASCD_ASCD_CODE, Lookup lineage reference object : stvascd
     * (Required)
     * 
     */
    @JsonProperty("ascdCode")
    @JsonPropertyDescription("Lineage reference object : SLRASCD_ASCD_CODE, Lookup lineage reference object : stvascd")
    private String ascdCode;
    /**
     * Start
     * <p>
     * Lineage reference object : SLRRFCR_FROM_DATE
     * (Required)
     * 
     */
    @JsonProperty("fromDate")
    @JsonPropertyDescription("Lineage reference object : SLRRFCR_FROM_DATE")
    private Date fromDate;
    /**
     * Refund
     * <p>
     * Lineage reference object : SLRRFCR_REFUND
     * (Required)
     * 
     */
    @JsonProperty("criteria.refund")
    @JsonPropertyDescription("Lineage reference object : SLRRFCR_REFUND")
    private Double criteriaRefund;
    /**
     * Assignment Status
     * <p>
     * Lineage reference object : SLRRFCR_ASCD_CODE
     * 
     */
    @JsonProperty("criteria.slrrfcrAscdCode")
    @JsonPropertyDescription("Lineage reference object : SLRRFCR_ASCD_CODE")
    private String criteriaSlrrfcrAscdCode;
    /**
     * Start
     * <p>
     * Lineage reference object : SLRASCD_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("startDate")
    @JsonPropertyDescription("Lineage reference object : SLRASCD_START_DATE")
    private Date startDate;
    /**
     * Refund
     * <p>
     * Lineage reference object : SLRRFCR_REFUND
     * (Required)
     * 
     */
    @JsonProperty("refund")
    @JsonPropertyDescription("Lineage reference object : SLRRFCR_REFUND")
    private Double refund;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Start
     * <p>
     * Lineage reference object : SLRRFCR_FROM_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.fromDate")
    public Date getCriteriaFromDate() {
        return criteriaFromDate;
    }

    /**
     * Start
     * <p>
     * Lineage reference object : SLRRFCR_FROM_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.fromDate")
    public void setCriteriaFromDate(Date criteriaFromDate) {
        this.criteriaFromDate = criteriaFromDate;
    }

    public RoomAssignmentStatus100PutRequest withCriteriaFromDate(Date criteriaFromDate) {
        this.criteriaFromDate = criteriaFromDate;
        return this;
    }

    /**
     * Assignment Status
     * <p>
     * Lineage reference object : SLRASCD_ASCD_CODE, Lookup lineage reference object : stvascd
     * (Required)
     * 
     */
    @JsonProperty("criteria.ascdCode")
    public String getCriteriaAscdCode() {
        return criteriaAscdCode;
    }

    /**
     * Assignment Status
     * <p>
     * Lineage reference object : SLRASCD_ASCD_CODE, Lookup lineage reference object : stvascd
     * (Required)
     * 
     */
    @JsonProperty("criteria.ascdCode")
    public void setCriteriaAscdCode(String criteriaAscdCode) {
        this.criteriaAscdCode = criteriaAscdCode;
    }

    public RoomAssignmentStatus100PutRequest withCriteriaAscdCode(String criteriaAscdCode) {
        this.criteriaAscdCode = criteriaAscdCode;
        return this;
    }

    /**
     * End
     * <p>
     * Lineage reference object : SLRRFCR_TO_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.toDate")
    public Date getCriteriaToDate() {
        return criteriaToDate;
    }

    /**
     * End
     * <p>
     * Lineage reference object : SLRRFCR_TO_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.toDate")
    public void setCriteriaToDate(Date criteriaToDate) {
        this.criteriaToDate = criteriaToDate;
    }

    public RoomAssignmentStatus100PutRequest withCriteriaToDate(Date criteriaToDate) {
        this.criteriaToDate = criteriaToDate;
        return this;
    }

    /**
     * End
     * <p>
     * Lineage reference object : SLRASCD_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("endDate")
    public Date getEndDate() {
        return endDate;
    }

    /**
     * End
     * <p>
     * Lineage reference object : SLRASCD_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("endDate")
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public RoomAssignmentStatus100PutRequest withEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : xxxxxxxTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("xxxxxxxTermCode")
    public Object getXxxxxxxTermCode() {
        return xxxxxxxTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : xxxxxxxTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("xxxxxxxTermCode")
    public void setXxxxxxxTermCode(Object xxxxxxxTermCode) {
        this.xxxxxxxTermCode = xxxxxxxTermCode;
    }

    public RoomAssignmentStatus100PutRequest withXxxxxxxTermCode(Object xxxxxxxTermCode) {
        this.xxxxxxxTermCode = xxxxxxxTermCode;
        return this;
    }

    /**
     * End
     * <p>
     * Lineage reference object : SLRRFCR_TO_DATE
     * (Required)
     * 
     */
    @JsonProperty("toDate")
    public Date getToDate() {
        return toDate;
    }

    /**
     * End
     * <p>
     * Lineage reference object : SLRRFCR_TO_DATE
     * (Required)
     * 
     */
    @JsonProperty("toDate")
    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public RoomAssignmentStatus100PutRequest withToDate(Date toDate) {
        this.toDate = toDate;
        return this;
    }

    /**
     * End
     * <p>
     * Lineage reference object : SLRASCD_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.endDate")
    public Date getCriteriaEndDate() {
        return criteriaEndDate;
    }

    /**
     * End
     * <p>
     * Lineage reference object : SLRASCD_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.endDate")
    public void setCriteriaEndDate(Date criteriaEndDate) {
        this.criteriaEndDate = criteriaEndDate;
    }

    public RoomAssignmentStatus100PutRequest withCriteriaEndDate(Date criteriaEndDate) {
        this.criteriaEndDate = criteriaEndDate;
        return this;
    }

    /**
     * Start
     * <p>
     * Lineage reference object : SLRASCD_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.startDate")
    public Date getCriteriaStartDate() {
        return criteriaStartDate;
    }

    /**
     * Start
     * <p>
     * Lineage reference object : SLRASCD_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.startDate")
    public void setCriteriaStartDate(Date criteriaStartDate) {
        this.criteriaStartDate = criteriaStartDate;
    }

    public RoomAssignmentStatus100PutRequest withCriteriaStartDate(Date criteriaStartDate) {
        this.criteriaStartDate = criteriaStartDate;
        return this;
    }

    /**
     * Assignment Status
     * <p>
     * Lineage reference object : SLRASCD_ASCD_CODE, Lookup lineage reference object : stvascd
     * (Required)
     * 
     */
    @JsonProperty("ascdCode")
    public String getAscdCode() {
        return ascdCode;
    }

    /**
     * Assignment Status
     * <p>
     * Lineage reference object : SLRASCD_ASCD_CODE, Lookup lineage reference object : stvascd
     * (Required)
     * 
     */
    @JsonProperty("ascdCode")
    public void setAscdCode(String ascdCode) {
        this.ascdCode = ascdCode;
    }

    public RoomAssignmentStatus100PutRequest withAscdCode(String ascdCode) {
        this.ascdCode = ascdCode;
        return this;
    }

    /**
     * Start
     * <p>
     * Lineage reference object : SLRRFCR_FROM_DATE
     * (Required)
     * 
     */
    @JsonProperty("fromDate")
    public Date getFromDate() {
        return fromDate;
    }

    /**
     * Start
     * <p>
     * Lineage reference object : SLRRFCR_FROM_DATE
     * (Required)
     * 
     */
    @JsonProperty("fromDate")
    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public RoomAssignmentStatus100PutRequest withFromDate(Date fromDate) {
        this.fromDate = fromDate;
        return this;
    }

    /**
     * Refund
     * <p>
     * Lineage reference object : SLRRFCR_REFUND
     * (Required)
     * 
     */
    @JsonProperty("criteria.refund")
    public Double getCriteriaRefund() {
        return criteriaRefund;
    }

    /**
     * Refund
     * <p>
     * Lineage reference object : SLRRFCR_REFUND
     * (Required)
     * 
     */
    @JsonProperty("criteria.refund")
    public void setCriteriaRefund(Double criteriaRefund) {
        this.criteriaRefund = criteriaRefund;
    }

    public RoomAssignmentStatus100PutRequest withCriteriaRefund(Double criteriaRefund) {
        this.criteriaRefund = criteriaRefund;
        return this;
    }

    /**
     * Assignment Status
     * <p>
     * Lineage reference object : SLRRFCR_ASCD_CODE
     * 
     */
    @JsonProperty("criteria.slrrfcrAscdCode")
    public String getCriteriaSlrrfcrAscdCode() {
        return criteriaSlrrfcrAscdCode;
    }

    /**
     * Assignment Status
     * <p>
     * Lineage reference object : SLRRFCR_ASCD_CODE
     * 
     */
    @JsonProperty("criteria.slrrfcrAscdCode")
    public void setCriteriaSlrrfcrAscdCode(String criteriaSlrrfcrAscdCode) {
        this.criteriaSlrrfcrAscdCode = criteriaSlrrfcrAscdCode;
    }

    public RoomAssignmentStatus100PutRequest withCriteriaSlrrfcrAscdCode(String criteriaSlrrfcrAscdCode) {
        this.criteriaSlrrfcrAscdCode = criteriaSlrrfcrAscdCode;
        return this;
    }

    /**
     * Start
     * <p>
     * Lineage reference object : SLRASCD_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("startDate")
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Start
     * <p>
     * Lineage reference object : SLRASCD_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("startDate")
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public RoomAssignmentStatus100PutRequest withStartDate(Date startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Refund
     * <p>
     * Lineage reference object : SLRRFCR_REFUND
     * (Required)
     * 
     */
    @JsonProperty("refund")
    public Double getRefund() {
        return refund;
    }

    /**
     * Refund
     * <p>
     * Lineage reference object : SLRRFCR_REFUND
     * (Required)
     * 
     */
    @JsonProperty("refund")
    public void setRefund(Double refund) {
        this.refund = refund;
    }

    public RoomAssignmentStatus100PutRequest withRefund(Double refund) {
        this.refund = refund;
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

    public RoomAssignmentStatus100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RoomAssignmentStatus100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaFromDate");
        sb.append('=');
        sb.append(((this.criteriaFromDate == null)?"<null>":this.criteriaFromDate));
        sb.append(',');
        sb.append("criteriaAscdCode");
        sb.append('=');
        sb.append(((this.criteriaAscdCode == null)?"<null>":this.criteriaAscdCode));
        sb.append(',');
        sb.append("criteriaToDate");
        sb.append('=');
        sb.append(((this.criteriaToDate == null)?"<null>":this.criteriaToDate));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("xxxxxxxTermCode");
        sb.append('=');
        sb.append(((this.xxxxxxxTermCode == null)?"<null>":this.xxxxxxxTermCode));
        sb.append(',');
        sb.append("toDate");
        sb.append('=');
        sb.append(((this.toDate == null)?"<null>":this.toDate));
        sb.append(',');
        sb.append("criteriaEndDate");
        sb.append('=');
        sb.append(((this.criteriaEndDate == null)?"<null>":this.criteriaEndDate));
        sb.append(',');
        sb.append("criteriaStartDate");
        sb.append('=');
        sb.append(((this.criteriaStartDate == null)?"<null>":this.criteriaStartDate));
        sb.append(',');
        sb.append("ascdCode");
        sb.append('=');
        sb.append(((this.ascdCode == null)?"<null>":this.ascdCode));
        sb.append(',');
        sb.append("fromDate");
        sb.append('=');
        sb.append(((this.fromDate == null)?"<null>":this.fromDate));
        sb.append(',');
        sb.append("criteriaRefund");
        sb.append('=');
        sb.append(((this.criteriaRefund == null)?"<null>":this.criteriaRefund));
        sb.append(',');
        sb.append("criteriaSlrrfcrAscdCode");
        sb.append('=');
        sb.append(((this.criteriaSlrrfcrAscdCode == null)?"<null>":this.criteriaSlrrfcrAscdCode));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
        sb.append(',');
        sb.append("refund");
        sb.append('=');
        sb.append(((this.refund == null)?"<null>":this.refund));
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
        result = ((result* 31)+((this.criteriaStartDate == null)? 0 :this.criteriaStartDate.hashCode()));
        result = ((result* 31)+((this.criteriaFromDate == null)? 0 :this.criteriaFromDate.hashCode()));
        result = ((result* 31)+((this.criteriaRefund == null)? 0 :this.criteriaRefund.hashCode()));
        result = ((result* 31)+((this.criteriaAscdCode == null)? 0 :this.criteriaAscdCode.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.xxxxxxxTermCode == null)? 0 :this.xxxxxxxTermCode.hashCode()));
        result = ((result* 31)+((this.toDate == null)? 0 :this.toDate.hashCode()));
        result = ((result* 31)+((this.ascdCode == null)? 0 :this.ascdCode.hashCode()));
        result = ((result* 31)+((this.fromDate == null)? 0 :this.fromDate.hashCode()));
        result = ((result* 31)+((this.criteriaToDate == null)? 0 :this.criteriaToDate.hashCode()));
        result = ((result* 31)+((this.criteriaEndDate == null)? 0 :this.criteriaEndDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaSlrrfcrAscdCode == null)? 0 :this.criteriaSlrrfcrAscdCode.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        result = ((result* 31)+((this.refund == null)? 0 :this.refund.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RoomAssignmentStatus100PutRequest) == false) {
            return false;
        }
        RoomAssignmentStatus100PutRequest rhs = ((RoomAssignmentStatus100PutRequest) other);
        return ((((((((((((((((this.criteriaStartDate == rhs.criteriaStartDate)||((this.criteriaStartDate!= null)&&this.criteriaStartDate.equals(rhs.criteriaStartDate)))&&((this.criteriaFromDate == rhs.criteriaFromDate)||((this.criteriaFromDate!= null)&&this.criteriaFromDate.equals(rhs.criteriaFromDate))))&&((this.criteriaRefund == rhs.criteriaRefund)||((this.criteriaRefund!= null)&&this.criteriaRefund.equals(rhs.criteriaRefund))))&&((this.criteriaAscdCode == rhs.criteriaAscdCode)||((this.criteriaAscdCode!= null)&&this.criteriaAscdCode.equals(rhs.criteriaAscdCode))))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.xxxxxxxTermCode == rhs.xxxxxxxTermCode)||((this.xxxxxxxTermCode!= null)&&this.xxxxxxxTermCode.equals(rhs.xxxxxxxTermCode))))&&((this.toDate == rhs.toDate)||((this.toDate!= null)&&this.toDate.equals(rhs.toDate))))&&((this.ascdCode == rhs.ascdCode)||((this.ascdCode!= null)&&this.ascdCode.equals(rhs.ascdCode))))&&((this.fromDate == rhs.fromDate)||((this.fromDate!= null)&&this.fromDate.equals(rhs.fromDate))))&&((this.criteriaToDate == rhs.criteriaToDate)||((this.criteriaToDate!= null)&&this.criteriaToDate.equals(rhs.criteriaToDate))))&&((this.criteriaEndDate == rhs.criteriaEndDate)||((this.criteriaEndDate!= null)&&this.criteriaEndDate.equals(rhs.criteriaEndDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaSlrrfcrAscdCode == rhs.criteriaSlrrfcrAscdCode)||((this.criteriaSlrrfcrAscdCode!= null)&&this.criteriaSlrrfcrAscdCode.equals(rhs.criteriaSlrrfcrAscdCode))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))))&&((this.refund == rhs.refund)||((this.refund!= null)&&this.refund.equals(rhs.refund))));
    }

}
