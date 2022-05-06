
package com.ellucian.generated.bpapi.ban.financial_managers.v1_0_0;

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
    "effDate",
    "statusInd",
    "finMgrName",
    "termDate",
    "displayFmgrCode"
})
@Generated("jsonschema2pojo")
public class FinancialManagers100GetResponse {

    /**
     * Effective
     * Date
     * <p>
     * Lineage reference object : FTVFMGR_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    @JsonPropertyDescription("Lineage reference object : FTVFMGR_EFF_DATE")
    private Date effDate;
    /**
     * Status
     * <p>
     * Lineage reference object : FTVFMGR_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : FTVFMGR_STATUS_IND")
    private String statusInd;
    @JsonProperty("finMgrName")
    private String finMgrName;
    /**
     * Termination
     * Date
     * <p>
     * Lineage reference object : FTVFMGR_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    @JsonPropertyDescription("Lineage reference object : FTVFMGR_TERM_DATE")
    private Date termDate;
    /**
     * Financial
     * Manager
     * <p>
     * 
     * 
     */
    @JsonProperty("displayFmgrCode")
    private String displayFmgrCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Effective
     * Date
     * <p>
     * Lineage reference object : FTVFMGR_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    public Date getEffDate() {
        return effDate;
    }

    /**
     * Effective
     * Date
     * <p>
     * Lineage reference object : FTVFMGR_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public FinancialManagers100GetResponse withEffDate(Date effDate) {
        this.effDate = effDate;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : FTVFMGR_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public String getStatusInd() {
        return statusInd;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : FTVFMGR_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public void setStatusInd(String statusInd) {
        this.statusInd = statusInd;
    }

    public FinancialManagers100GetResponse withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    @JsonProperty("finMgrName")
    public String getFinMgrName() {
        return finMgrName;
    }

    @JsonProperty("finMgrName")
    public void setFinMgrName(String finMgrName) {
        this.finMgrName = finMgrName;
    }

    public FinancialManagers100GetResponse withFinMgrName(String finMgrName) {
        this.finMgrName = finMgrName;
        return this;
    }

    /**
     * Termination
     * Date
     * <p>
     * Lineage reference object : FTVFMGR_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public Date getTermDate() {
        return termDate;
    }

    /**
     * Termination
     * Date
     * <p>
     * Lineage reference object : FTVFMGR_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public void setTermDate(Date termDate) {
        this.termDate = termDate;
    }

    public FinancialManagers100GetResponse withTermDate(Date termDate) {
        this.termDate = termDate;
        return this;
    }

    /**
     * Financial
     * Manager
     * <p>
     * 
     * 
     */
    @JsonProperty("displayFmgrCode")
    public String getDisplayFmgrCode() {
        return displayFmgrCode;
    }

    /**
     * Financial
     * Manager
     * <p>
     * 
     * 
     */
    @JsonProperty("displayFmgrCode")
    public void setDisplayFmgrCode(String displayFmgrCode) {
        this.displayFmgrCode = displayFmgrCode;
    }

    public FinancialManagers100GetResponse withDisplayFmgrCode(String displayFmgrCode) {
        this.displayFmgrCode = displayFmgrCode;
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

    public FinancialManagers100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FinancialManagers100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("finMgrName");
        sb.append('=');
        sb.append(((this.finMgrName == null)?"<null>":this.finMgrName));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
        sb.append(',');
        sb.append("displayFmgrCode");
        sb.append('=');
        sb.append(((this.displayFmgrCode == null)?"<null>":this.displayFmgrCode));
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
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.finMgrName == null)? 0 :this.finMgrName.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.displayFmgrCode == null)? 0 :this.displayFmgrCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FinancialManagers100GetResponse) == false) {
            return false;
        }
        FinancialManagers100GetResponse rhs = ((FinancialManagers100GetResponse) other);
        return (((((((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate)))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.finMgrName == rhs.finMgrName)||((this.finMgrName!= null)&&this.finMgrName.equals(rhs.finMgrName))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.displayFmgrCode == rhs.displayFmgrCode)||((this.displayFmgrCode!= null)&&this.displayFmgrCode.equals(rhs.displayFmgrCode))));
    }

}
