
package com.ellucian.generated.bpapi.ban.financial_manager_maintenance.v1_0_0;

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
    "coasCode",
    "locationTitle",
    "locnCode",
    "title",
    "currentNtypDesc",
    "orgnCode",
    "effDate",
    "activityDate",
    "addrSeqno",
    "statusInd",
    "organizationTitle",
    "spridenNtypCode",
    "termDate",
    "coasTitle",
    "addrType"
})
@Generated("jsonschema2pojo")
public class Ftvfmgr__2 {

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVFMGR_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : FTVFMGR_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String coasCode;
    @JsonProperty("locationTitle")
    private String locationTitle;
    /**
     * Assigned Location
     * <p>
     * Lineage reference object : FTVFMGR_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    @JsonPropertyDescription("Lineage reference object : FTVFMGR_LOCN_CODE")
    private String locnCode;
    /**
     * Title
     * <p>
     * Lineage reference object : FTVFMGR_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("Lineage reference object : FTVFMGR_TITLE")
    private String title;
    @JsonProperty("currentNtypDesc")
    private String currentNtypDesc;
    /**
     * Assigned Organization
     * <p>
     * Lineage reference object : FTVFMGR_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    @JsonPropertyDescription("Lineage reference object : FTVFMGR_ORGN_CODE")
    private String orgnCode;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVFMGR_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    @JsonPropertyDescription("Lineage reference object : FTVFMGR_EFF_DATE")
    private Date effDate;
    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVFMGR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : FTVFMGR_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Sequence Number
     * <p>
     * Lineage reference object : FTVFMGR_ADDR_SEQNO
     * 
     */
    @JsonProperty("addrSeqno")
    @JsonPropertyDescription("Lineage reference object : FTVFMGR_ADDR_SEQNO")
    private Double addrSeqno;
    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVFMGR_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : FTVFMGR_STATUS_IND")
    private String statusInd;
    @JsonProperty("organizationTitle")
    private String organizationTitle;
    /**
     * Name Type
     * <p>
     * Lookup lineage reference object : gtvntyp
     * 
     */
    @JsonProperty("spridenNtypCode")
    @JsonPropertyDescription("Lookup lineage reference object : gtvntyp")
    private String spridenNtypCode;
    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVFMGR_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    @JsonPropertyDescription("Lineage reference object : FTVFMGR_TERM_DATE")
    private Date termDate;
    @JsonProperty("coasTitle")
    private String coasTitle;
    /**
     * Default Address Type
     * <p>
     * Lineage reference object : FTVFMGR_ADDR_TYPE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("addrType")
    @JsonPropertyDescription("Lineage reference object : FTVFMGR_ADDR_TYPE, Lookup lineage reference object : stvatyp")
    private String addrType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVFMGR_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCode")
    public String getCoasCode() {
        return coasCode;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVFMGR_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public Ftvfmgr__2 withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    @JsonProperty("locationTitle")
    public String getLocationTitle() {
        return locationTitle;
    }

    @JsonProperty("locationTitle")
    public void setLocationTitle(String locationTitle) {
        this.locationTitle = locationTitle;
    }

    public Ftvfmgr__2 withLocationTitle(String locationTitle) {
        this.locationTitle = locationTitle;
        return this;
    }

    /**
     * Assigned Location
     * <p>
     * Lineage reference object : FTVFMGR_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    public String getLocnCode() {
        return locnCode;
    }

    /**
     * Assigned Location
     * <p>
     * Lineage reference object : FTVFMGR_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    public void setLocnCode(String locnCode) {
        this.locnCode = locnCode;
    }

    public Ftvfmgr__2 withLocnCode(String locnCode) {
        this.locnCode = locnCode;
        return this;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : FTVFMGR_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : FTVFMGR_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Ftvfmgr__2 withTitle(String title) {
        this.title = title;
        return this;
    }

    @JsonProperty("currentNtypDesc")
    public String getCurrentNtypDesc() {
        return currentNtypDesc;
    }

    @JsonProperty("currentNtypDesc")
    public void setCurrentNtypDesc(String currentNtypDesc) {
        this.currentNtypDesc = currentNtypDesc;
    }

    public Ftvfmgr__2 withCurrentNtypDesc(String currentNtypDesc) {
        this.currentNtypDesc = currentNtypDesc;
        return this;
    }

    /**
     * Assigned Organization
     * <p>
     * Lineage reference object : FTVFMGR_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    public String getOrgnCode() {
        return orgnCode;
    }

    /**
     * Assigned Organization
     * <p>
     * Lineage reference object : FTVFMGR_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    public void setOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
    }

    public Ftvfmgr__2 withOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVFMGR_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    public Date getEffDate() {
        return effDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVFMGR_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public Ftvfmgr__2 withEffDate(Date effDate) {
        this.effDate = effDate;
        return this;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVFMGR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVFMGR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Ftvfmgr__2 withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : FTVFMGR_ADDR_SEQNO
     * 
     */
    @JsonProperty("addrSeqno")
    public Double getAddrSeqno() {
        return addrSeqno;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : FTVFMGR_ADDR_SEQNO
     * 
     */
    @JsonProperty("addrSeqno")
    public void setAddrSeqno(Double addrSeqno) {
        this.addrSeqno = addrSeqno;
    }

    public Ftvfmgr__2 withAddrSeqno(Double addrSeqno) {
        this.addrSeqno = addrSeqno;
        return this;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVFMGR_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public String getStatusInd() {
        return statusInd;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVFMGR_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public void setStatusInd(String statusInd) {
        this.statusInd = statusInd;
    }

    public Ftvfmgr__2 withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    @JsonProperty("organizationTitle")
    public String getOrganizationTitle() {
        return organizationTitle;
    }

    @JsonProperty("organizationTitle")
    public void setOrganizationTitle(String organizationTitle) {
        this.organizationTitle = organizationTitle;
    }

    public Ftvfmgr__2 withOrganizationTitle(String organizationTitle) {
        this.organizationTitle = organizationTitle;
        return this;
    }

    /**
     * Name Type
     * <p>
     * Lookup lineage reference object : gtvntyp
     * 
     */
    @JsonProperty("spridenNtypCode")
    public String getSpridenNtypCode() {
        return spridenNtypCode;
    }

    /**
     * Name Type
     * <p>
     * Lookup lineage reference object : gtvntyp
     * 
     */
    @JsonProperty("spridenNtypCode")
    public void setSpridenNtypCode(String spridenNtypCode) {
        this.spridenNtypCode = spridenNtypCode;
    }

    public Ftvfmgr__2 withSpridenNtypCode(String spridenNtypCode) {
        this.spridenNtypCode = spridenNtypCode;
        return this;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVFMGR_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public Date getTermDate() {
        return termDate;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVFMGR_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public void setTermDate(Date termDate) {
        this.termDate = termDate;
    }

    public Ftvfmgr__2 withTermDate(Date termDate) {
        this.termDate = termDate;
        return this;
    }

    @JsonProperty("coasTitle")
    public String getCoasTitle() {
        return coasTitle;
    }

    @JsonProperty("coasTitle")
    public void setCoasTitle(String coasTitle) {
        this.coasTitle = coasTitle;
    }

    public Ftvfmgr__2 withCoasTitle(String coasTitle) {
        this.coasTitle = coasTitle;
        return this;
    }

    /**
     * Default Address Type
     * <p>
     * Lineage reference object : FTVFMGR_ADDR_TYPE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("addrType")
    public String getAddrType() {
        return addrType;
    }

    /**
     * Default Address Type
     * <p>
     * Lineage reference object : FTVFMGR_ADDR_TYPE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("addrType")
    public void setAddrType(String addrType) {
        this.addrType = addrType;
    }

    public Ftvfmgr__2 withAddrType(String addrType) {
        this.addrType = addrType;
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

    public Ftvfmgr__2 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ftvfmgr__2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("locationTitle");
        sb.append('=');
        sb.append(((this.locationTitle == null)?"<null>":this.locationTitle));
        sb.append(',');
        sb.append("locnCode");
        sb.append('=');
        sb.append(((this.locnCode == null)?"<null>":this.locnCode));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("currentNtypDesc");
        sb.append('=');
        sb.append(((this.currentNtypDesc == null)?"<null>":this.currentNtypDesc));
        sb.append(',');
        sb.append("orgnCode");
        sb.append('=');
        sb.append(((this.orgnCode == null)?"<null>":this.orgnCode));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("addrSeqno");
        sb.append('=');
        sb.append(((this.addrSeqno == null)?"<null>":this.addrSeqno));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("organizationTitle");
        sb.append('=');
        sb.append(((this.organizationTitle == null)?"<null>":this.organizationTitle));
        sb.append(',');
        sb.append("spridenNtypCode");
        sb.append('=');
        sb.append(((this.spridenNtypCode == null)?"<null>":this.spridenNtypCode));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
        sb.append(',');
        sb.append("coasTitle");
        sb.append('=');
        sb.append(((this.coasTitle == null)?"<null>":this.coasTitle));
        sb.append(',');
        sb.append("addrType");
        sb.append('=');
        sb.append(((this.addrType == null)?"<null>":this.addrType));
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
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.locationTitle == null)? 0 :this.locationTitle.hashCode()));
        result = ((result* 31)+((this.locnCode == null)? 0 :this.locnCode.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.currentNtypDesc == null)? 0 :this.currentNtypDesc.hashCode()));
        result = ((result* 31)+((this.orgnCode == null)? 0 :this.orgnCode.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.addrSeqno == null)? 0 :this.addrSeqno.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.organizationTitle == null)? 0 :this.organizationTitle.hashCode()));
        result = ((result* 31)+((this.spridenNtypCode == null)? 0 :this.spridenNtypCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.coasTitle == null)? 0 :this.coasTitle.hashCode()));
        result = ((result* 31)+((this.addrType == null)? 0 :this.addrType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ftvfmgr__2) == false) {
            return false;
        }
        Ftvfmgr__2 rhs = ((Ftvfmgr__2) other);
        return (((((((((((((((((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode)))&&((this.locationTitle == rhs.locationTitle)||((this.locationTitle!= null)&&this.locationTitle.equals(rhs.locationTitle))))&&((this.locnCode == rhs.locnCode)||((this.locnCode!= null)&&this.locnCode.equals(rhs.locnCode))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.currentNtypDesc == rhs.currentNtypDesc)||((this.currentNtypDesc!= null)&&this.currentNtypDesc.equals(rhs.currentNtypDesc))))&&((this.orgnCode == rhs.orgnCode)||((this.orgnCode!= null)&&this.orgnCode.equals(rhs.orgnCode))))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.addrSeqno == rhs.addrSeqno)||((this.addrSeqno!= null)&&this.addrSeqno.equals(rhs.addrSeqno))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.organizationTitle == rhs.organizationTitle)||((this.organizationTitle!= null)&&this.organizationTitle.equals(rhs.organizationTitle))))&&((this.spridenNtypCode == rhs.spridenNtypCode)||((this.spridenNtypCode!= null)&&this.spridenNtypCode.equals(rhs.spridenNtypCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.coasTitle == rhs.coasTitle)||((this.coasTitle!= null)&&this.coasTitle.equals(rhs.coasTitle))))&&((this.addrType == rhs.addrType)||((this.addrType!= null)&&this.addrType.equals(rhs.addrType))));
    }

}
