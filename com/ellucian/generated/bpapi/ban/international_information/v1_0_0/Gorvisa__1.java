
package com.ellucian.generated.bpapi.ban.international_information.v1_0_0;

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
    "vtypCode",
    "visaReqDate",
    "seqNo",
    "vtypDesc",
    "natnCodeIssue",
    "visaIssueDate",
    "visaNumber",
    "issueNatnDesc",
    "noEntries",
    "vissCode",
    "vissDesc",
    "pentCode",
    "entryInd",
    "visaExpireDate",
    "visaStartDate",
    "pentDesc"
})
@Generated("jsonschema2pojo")
public class Gorvisa__1 {

    /**
     * Visa Type
     * <p>
     * Lineage reference object : GORVISA_VTYP_CODE, Lookup lineage reference object : stvvtyp
     * 
     */
    @JsonProperty("vtypCode")
    @JsonPropertyDescription("Lineage reference object : GORVISA_VTYP_CODE, Lookup lineage reference object : stvvtyp")
    private String vtypCode;
    /**
     * Date Requested
     * <p>
     * Lineage reference object : GORVISA_VISA_REQ_DATE
     * 
     */
    @JsonProperty("visaReqDate")
    @JsonPropertyDescription("Lineage reference object : GORVISA_VISA_REQ_DATE")
    private Date visaReqDate;
    /**
     * Sequence Number
     * <p>
     * Lineage reference object : GORVISA_SEQ_NO
     * 
     */
    @JsonProperty("seqNo")
    @JsonPropertyDescription("Lineage reference object : GORVISA_SEQ_NO")
    private Double seqNo;
    /**
     * Visa Information
     * <p>
     * 
     * 
     */
    @JsonProperty("vtypDesc")
    private String vtypDesc;
    /**
     * Nation of Issue
     * <p>
     * Lineage reference object : GORVISA_NATN_CODE_ISSUE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCodeIssue")
    @JsonPropertyDescription("Lineage reference object : GORVISA_NATN_CODE_ISSUE, Lookup lineage reference object : stvnatn")
    private String natnCodeIssue;
    /**
     * Date Issued
     * <p>
     * Lineage reference object : GORVISA_VISA_ISSUE_DATE
     * 
     */
    @JsonProperty("visaIssueDate")
    @JsonPropertyDescription("Lineage reference object : GORVISA_VISA_ISSUE_DATE")
    private Date visaIssueDate;
    /**
     * Visa Number
     * <p>
     * Lineage reference object : GORVISA_VISA_NUMBER
     * 
     */
    @JsonProperty("visaNumber")
    @JsonPropertyDescription("Lineage reference object : GORVISA_VISA_NUMBER")
    private String visaNumber;
    @JsonProperty("issueNatnDesc")
    private String issueNatnDesc;
    /**
     * Number of Entries
     * <p>
     * Lineage reference object : GORVISA_NO_ENTRIES
     * 
     */
    @JsonProperty("noEntries")
    @JsonPropertyDescription("Lineage reference object : GORVISA_NO_ENTRIES")
    private String noEntries;
    /**
     * Issuing Authority
     * <p>
     * Lineage reference object : GORVISA_VISS_CODE, Lookup lineage reference object : gtvviss
     * 
     */
    @JsonProperty("vissCode")
    @JsonPropertyDescription("Lineage reference object : GORVISA_VISS_CODE, Lookup lineage reference object : gtvviss")
    private String vissCode;
    @JsonProperty("vissDesc")
    private String vissDesc;
    /**
     * Port of Entry
     * <p>
     * Lineage reference object : GORVISA_PENT_CODE, Lookup lineage reference object : stvpent
     * 
     */
    @JsonProperty("pentCode")
    @JsonPropertyDescription("Lineage reference object : GORVISA_PENT_CODE, Lookup lineage reference object : stvpent")
    private String pentCode;
    /**
     * Entry
     * <p>
     * Lineage reference object : GORVISA_ENTRY_IND
     * 
     */
    @JsonProperty("entryInd")
    @JsonPropertyDescription("Lineage reference object : GORVISA_ENTRY_IND")
    private String entryInd;
    /**
     * End Date
     * <p>
     * Lineage reference object : GORVISA_VISA_EXPIRE_DATE
     * 
     */
    @JsonProperty("visaExpireDate")
    @JsonPropertyDescription("Lineage reference object : GORVISA_VISA_EXPIRE_DATE")
    private Date visaExpireDate;
    /**
     * Start Date
     * <p>
     * Lineage reference object : GORVISA_VISA_START_DATE
     * 
     */
    @JsonProperty("visaStartDate")
    @JsonPropertyDescription("Lineage reference object : GORVISA_VISA_START_DATE")
    private Date visaStartDate;
    @JsonProperty("pentDesc")
    private String pentDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Visa Type
     * <p>
     * Lineage reference object : GORVISA_VTYP_CODE, Lookup lineage reference object : stvvtyp
     * 
     */
    @JsonProperty("vtypCode")
    public String getVtypCode() {
        return vtypCode;
    }

    /**
     * Visa Type
     * <p>
     * Lineage reference object : GORVISA_VTYP_CODE, Lookup lineage reference object : stvvtyp
     * 
     */
    @JsonProperty("vtypCode")
    public void setVtypCode(String vtypCode) {
        this.vtypCode = vtypCode;
    }

    public Gorvisa__1 withVtypCode(String vtypCode) {
        this.vtypCode = vtypCode;
        return this;
    }

    /**
     * Date Requested
     * <p>
     * Lineage reference object : GORVISA_VISA_REQ_DATE
     * 
     */
    @JsonProperty("visaReqDate")
    public Date getVisaReqDate() {
        return visaReqDate;
    }

    /**
     * Date Requested
     * <p>
     * Lineage reference object : GORVISA_VISA_REQ_DATE
     * 
     */
    @JsonProperty("visaReqDate")
    public void setVisaReqDate(Date visaReqDate) {
        this.visaReqDate = visaReqDate;
    }

    public Gorvisa__1 withVisaReqDate(Date visaReqDate) {
        this.visaReqDate = visaReqDate;
        return this;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : GORVISA_SEQ_NO
     * 
     */
    @JsonProperty("seqNo")
    public Double getSeqNo() {
        return seqNo;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : GORVISA_SEQ_NO
     * 
     */
    @JsonProperty("seqNo")
    public void setSeqNo(Double seqNo) {
        this.seqNo = seqNo;
    }

    public Gorvisa__1 withSeqNo(Double seqNo) {
        this.seqNo = seqNo;
        return this;
    }

    /**
     * Visa Information
     * <p>
     * 
     * 
     */
    @JsonProperty("vtypDesc")
    public String getVtypDesc() {
        return vtypDesc;
    }

    /**
     * Visa Information
     * <p>
     * 
     * 
     */
    @JsonProperty("vtypDesc")
    public void setVtypDesc(String vtypDesc) {
        this.vtypDesc = vtypDesc;
    }

    public Gorvisa__1 withVtypDesc(String vtypDesc) {
        this.vtypDesc = vtypDesc;
        return this;
    }

    /**
     * Nation of Issue
     * <p>
     * Lineage reference object : GORVISA_NATN_CODE_ISSUE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCodeIssue")
    public String getNatnCodeIssue() {
        return natnCodeIssue;
    }

    /**
     * Nation of Issue
     * <p>
     * Lineage reference object : GORVISA_NATN_CODE_ISSUE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCodeIssue")
    public void setNatnCodeIssue(String natnCodeIssue) {
        this.natnCodeIssue = natnCodeIssue;
    }

    public Gorvisa__1 withNatnCodeIssue(String natnCodeIssue) {
        this.natnCodeIssue = natnCodeIssue;
        return this;
    }

    /**
     * Date Issued
     * <p>
     * Lineage reference object : GORVISA_VISA_ISSUE_DATE
     * 
     */
    @JsonProperty("visaIssueDate")
    public Date getVisaIssueDate() {
        return visaIssueDate;
    }

    /**
     * Date Issued
     * <p>
     * Lineage reference object : GORVISA_VISA_ISSUE_DATE
     * 
     */
    @JsonProperty("visaIssueDate")
    public void setVisaIssueDate(Date visaIssueDate) {
        this.visaIssueDate = visaIssueDate;
    }

    public Gorvisa__1 withVisaIssueDate(Date visaIssueDate) {
        this.visaIssueDate = visaIssueDate;
        return this;
    }

    /**
     * Visa Number
     * <p>
     * Lineage reference object : GORVISA_VISA_NUMBER
     * 
     */
    @JsonProperty("visaNumber")
    public String getVisaNumber() {
        return visaNumber;
    }

    /**
     * Visa Number
     * <p>
     * Lineage reference object : GORVISA_VISA_NUMBER
     * 
     */
    @JsonProperty("visaNumber")
    public void setVisaNumber(String visaNumber) {
        this.visaNumber = visaNumber;
    }

    public Gorvisa__1 withVisaNumber(String visaNumber) {
        this.visaNumber = visaNumber;
        return this;
    }

    @JsonProperty("issueNatnDesc")
    public String getIssueNatnDesc() {
        return issueNatnDesc;
    }

    @JsonProperty("issueNatnDesc")
    public void setIssueNatnDesc(String issueNatnDesc) {
        this.issueNatnDesc = issueNatnDesc;
    }

    public Gorvisa__1 withIssueNatnDesc(String issueNatnDesc) {
        this.issueNatnDesc = issueNatnDesc;
        return this;
    }

    /**
     * Number of Entries
     * <p>
     * Lineage reference object : GORVISA_NO_ENTRIES
     * 
     */
    @JsonProperty("noEntries")
    public String getNoEntries() {
        return noEntries;
    }

    /**
     * Number of Entries
     * <p>
     * Lineage reference object : GORVISA_NO_ENTRIES
     * 
     */
    @JsonProperty("noEntries")
    public void setNoEntries(String noEntries) {
        this.noEntries = noEntries;
    }

    public Gorvisa__1 withNoEntries(String noEntries) {
        this.noEntries = noEntries;
        return this;
    }

    /**
     * Issuing Authority
     * <p>
     * Lineage reference object : GORVISA_VISS_CODE, Lookup lineage reference object : gtvviss
     * 
     */
    @JsonProperty("vissCode")
    public String getVissCode() {
        return vissCode;
    }

    /**
     * Issuing Authority
     * <p>
     * Lineage reference object : GORVISA_VISS_CODE, Lookup lineage reference object : gtvviss
     * 
     */
    @JsonProperty("vissCode")
    public void setVissCode(String vissCode) {
        this.vissCode = vissCode;
    }

    public Gorvisa__1 withVissCode(String vissCode) {
        this.vissCode = vissCode;
        return this;
    }

    @JsonProperty("vissDesc")
    public String getVissDesc() {
        return vissDesc;
    }

    @JsonProperty("vissDesc")
    public void setVissDesc(String vissDesc) {
        this.vissDesc = vissDesc;
    }

    public Gorvisa__1 withVissDesc(String vissDesc) {
        this.vissDesc = vissDesc;
        return this;
    }

    /**
     * Port of Entry
     * <p>
     * Lineage reference object : GORVISA_PENT_CODE, Lookup lineage reference object : stvpent
     * 
     */
    @JsonProperty("pentCode")
    public String getPentCode() {
        return pentCode;
    }

    /**
     * Port of Entry
     * <p>
     * Lineage reference object : GORVISA_PENT_CODE, Lookup lineage reference object : stvpent
     * 
     */
    @JsonProperty("pentCode")
    public void setPentCode(String pentCode) {
        this.pentCode = pentCode;
    }

    public Gorvisa__1 withPentCode(String pentCode) {
        this.pentCode = pentCode;
        return this;
    }

    /**
     * Entry
     * <p>
     * Lineage reference object : GORVISA_ENTRY_IND
     * 
     */
    @JsonProperty("entryInd")
    public String getEntryInd() {
        return entryInd;
    }

    /**
     * Entry
     * <p>
     * Lineage reference object : GORVISA_ENTRY_IND
     * 
     */
    @JsonProperty("entryInd")
    public void setEntryInd(String entryInd) {
        this.entryInd = entryInd;
    }

    public Gorvisa__1 withEntryInd(String entryInd) {
        this.entryInd = entryInd;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : GORVISA_VISA_EXPIRE_DATE
     * 
     */
    @JsonProperty("visaExpireDate")
    public Date getVisaExpireDate() {
        return visaExpireDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : GORVISA_VISA_EXPIRE_DATE
     * 
     */
    @JsonProperty("visaExpireDate")
    public void setVisaExpireDate(Date visaExpireDate) {
        this.visaExpireDate = visaExpireDate;
    }

    public Gorvisa__1 withVisaExpireDate(Date visaExpireDate) {
        this.visaExpireDate = visaExpireDate;
        return this;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : GORVISA_VISA_START_DATE
     * 
     */
    @JsonProperty("visaStartDate")
    public Date getVisaStartDate() {
        return visaStartDate;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : GORVISA_VISA_START_DATE
     * 
     */
    @JsonProperty("visaStartDate")
    public void setVisaStartDate(Date visaStartDate) {
        this.visaStartDate = visaStartDate;
    }

    public Gorvisa__1 withVisaStartDate(Date visaStartDate) {
        this.visaStartDate = visaStartDate;
        return this;
    }

    @JsonProperty("pentDesc")
    public String getPentDesc() {
        return pentDesc;
    }

    @JsonProperty("pentDesc")
    public void setPentDesc(String pentDesc) {
        this.pentDesc = pentDesc;
    }

    public Gorvisa__1 withPentDesc(String pentDesc) {
        this.pentDesc = pentDesc;
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

    public Gorvisa__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Gorvisa__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("vtypCode");
        sb.append('=');
        sb.append(((this.vtypCode == null)?"<null>":this.vtypCode));
        sb.append(',');
        sb.append("visaReqDate");
        sb.append('=');
        sb.append(((this.visaReqDate == null)?"<null>":this.visaReqDate));
        sb.append(',');
        sb.append("seqNo");
        sb.append('=');
        sb.append(((this.seqNo == null)?"<null>":this.seqNo));
        sb.append(',');
        sb.append("vtypDesc");
        sb.append('=');
        sb.append(((this.vtypDesc == null)?"<null>":this.vtypDesc));
        sb.append(',');
        sb.append("natnCodeIssue");
        sb.append('=');
        sb.append(((this.natnCodeIssue == null)?"<null>":this.natnCodeIssue));
        sb.append(',');
        sb.append("visaIssueDate");
        sb.append('=');
        sb.append(((this.visaIssueDate == null)?"<null>":this.visaIssueDate));
        sb.append(',');
        sb.append("visaNumber");
        sb.append('=');
        sb.append(((this.visaNumber == null)?"<null>":this.visaNumber));
        sb.append(',');
        sb.append("issueNatnDesc");
        sb.append('=');
        sb.append(((this.issueNatnDesc == null)?"<null>":this.issueNatnDesc));
        sb.append(',');
        sb.append("noEntries");
        sb.append('=');
        sb.append(((this.noEntries == null)?"<null>":this.noEntries));
        sb.append(',');
        sb.append("vissCode");
        sb.append('=');
        sb.append(((this.vissCode == null)?"<null>":this.vissCode));
        sb.append(',');
        sb.append("vissDesc");
        sb.append('=');
        sb.append(((this.vissDesc == null)?"<null>":this.vissDesc));
        sb.append(',');
        sb.append("pentCode");
        sb.append('=');
        sb.append(((this.pentCode == null)?"<null>":this.pentCode));
        sb.append(',');
        sb.append("entryInd");
        sb.append('=');
        sb.append(((this.entryInd == null)?"<null>":this.entryInd));
        sb.append(',');
        sb.append("visaExpireDate");
        sb.append('=');
        sb.append(((this.visaExpireDate == null)?"<null>":this.visaExpireDate));
        sb.append(',');
        sb.append("visaStartDate");
        sb.append('=');
        sb.append(((this.visaStartDate == null)?"<null>":this.visaStartDate));
        sb.append(',');
        sb.append("pentDesc");
        sb.append('=');
        sb.append(((this.pentDesc == null)?"<null>":this.pentDesc));
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
        result = ((result* 31)+((this.vtypCode == null)? 0 :this.vtypCode.hashCode()));
        result = ((result* 31)+((this.visaReqDate == null)? 0 :this.visaReqDate.hashCode()));
        result = ((result* 31)+((this.seqNo == null)? 0 :this.seqNo.hashCode()));
        result = ((result* 31)+((this.vtypDesc == null)? 0 :this.vtypDesc.hashCode()));
        result = ((result* 31)+((this.natnCodeIssue == null)? 0 :this.natnCodeIssue.hashCode()));
        result = ((result* 31)+((this.visaIssueDate == null)? 0 :this.visaIssueDate.hashCode()));
        result = ((result* 31)+((this.visaNumber == null)? 0 :this.visaNumber.hashCode()));
        result = ((result* 31)+((this.issueNatnDesc == null)? 0 :this.issueNatnDesc.hashCode()));
        result = ((result* 31)+((this.noEntries == null)? 0 :this.noEntries.hashCode()));
        result = ((result* 31)+((this.vissCode == null)? 0 :this.vissCode.hashCode()));
        result = ((result* 31)+((this.vissDesc == null)? 0 :this.vissDesc.hashCode()));
        result = ((result* 31)+((this.pentCode == null)? 0 :this.pentCode.hashCode()));
        result = ((result* 31)+((this.entryInd == null)? 0 :this.entryInd.hashCode()));
        result = ((result* 31)+((this.visaExpireDate == null)? 0 :this.visaExpireDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.visaStartDate == null)? 0 :this.visaStartDate.hashCode()));
        result = ((result* 31)+((this.pentDesc == null)? 0 :this.pentDesc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Gorvisa__1) == false) {
            return false;
        }
        Gorvisa__1 rhs = ((Gorvisa__1) other);
        return ((((((((((((((((((this.vtypCode == rhs.vtypCode)||((this.vtypCode!= null)&&this.vtypCode.equals(rhs.vtypCode)))&&((this.visaReqDate == rhs.visaReqDate)||((this.visaReqDate!= null)&&this.visaReqDate.equals(rhs.visaReqDate))))&&((this.seqNo == rhs.seqNo)||((this.seqNo!= null)&&this.seqNo.equals(rhs.seqNo))))&&((this.vtypDesc == rhs.vtypDesc)||((this.vtypDesc!= null)&&this.vtypDesc.equals(rhs.vtypDesc))))&&((this.natnCodeIssue == rhs.natnCodeIssue)||((this.natnCodeIssue!= null)&&this.natnCodeIssue.equals(rhs.natnCodeIssue))))&&((this.visaIssueDate == rhs.visaIssueDate)||((this.visaIssueDate!= null)&&this.visaIssueDate.equals(rhs.visaIssueDate))))&&((this.visaNumber == rhs.visaNumber)||((this.visaNumber!= null)&&this.visaNumber.equals(rhs.visaNumber))))&&((this.issueNatnDesc == rhs.issueNatnDesc)||((this.issueNatnDesc!= null)&&this.issueNatnDesc.equals(rhs.issueNatnDesc))))&&((this.noEntries == rhs.noEntries)||((this.noEntries!= null)&&this.noEntries.equals(rhs.noEntries))))&&((this.vissCode == rhs.vissCode)||((this.vissCode!= null)&&this.vissCode.equals(rhs.vissCode))))&&((this.vissDesc == rhs.vissDesc)||((this.vissDesc!= null)&&this.vissDesc.equals(rhs.vissDesc))))&&((this.pentCode == rhs.pentCode)||((this.pentCode!= null)&&this.pentCode.equals(rhs.pentCode))))&&((this.entryInd == rhs.entryInd)||((this.entryInd!= null)&&this.entryInd.equals(rhs.entryInd))))&&((this.visaExpireDate == rhs.visaExpireDate)||((this.visaExpireDate!= null)&&this.visaExpireDate.equals(rhs.visaExpireDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.visaStartDate == rhs.visaStartDate)||((this.visaStartDate!= null)&&this.visaStartDate.equals(rhs.visaStartDate))))&&((this.pentDesc == rhs.pentDesc)||((this.pentDesc!= null)&&this.pentDesc.equals(rhs.pentDesc))));
    }

}
