
package com.ellucian.generated.bpapi.ban.degree_summary.v1_0_0;

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
    "stspKeySequence",
    "seqNo",
    "grstCode",
    "dualDegInd",
    "acyrCodeBulletin",
    "degsCode",
    "diplomaName",
    "gradDate",
    "termCodeSturec",
    "termCodeGrad",
    "termCodeComp"
})
@Generated("jsonschema2pojo")
public class Shrdgmr {

    /**
     * Study Path
     * <p>
     * Lineage reference object : SHRDGMR_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("stspKeySequence")
    @JsonPropertyDescription("Lineage reference object : SHRDGMR_STSP_KEY_SEQUENCE")
    private Double stspKeySequence;
    /**
     * Sequence Number
     * <p>
     * Lineage reference object : SHRDGMR_SEQ_NO
     * (Required)
     * 
     */
    @JsonProperty("seqNo")
    @JsonPropertyDescription("Lineage reference object : SHRDGMR_SEQ_NO")
    private Double seqNo;
    /**
     * Graduation Status
     * <p>
     * Lineage reference object : SHRDGMR_GRST_CODE, Lookup lineage reference object : stvgrst
     * 
     */
    @JsonProperty("grstCode")
    @JsonPropertyDescription("Lineage reference object : SHRDGMR_GRST_CODE, Lookup lineage reference object : stvgrst")
    private String grstCode;
    @JsonProperty("dualDegInd")
    private String dualDegInd;
    /**
     * Bulletin Year
     * <p>
     * Lineage reference object : SHRDGMR_ACYR_CODE_BULLETIN, Lookup lineage reference object : stvacyr
     * 
     */
    @JsonProperty("acyrCodeBulletin")
    @JsonPropertyDescription("Lineage reference object : SHRDGMR_ACYR_CODE_BULLETIN, Lookup lineage reference object : stvacyr")
    private String acyrCodeBulletin;
    /**
     * Outcome Status
     * <p>
     * Lineage reference object : SHRDGMR_DEGS_CODE, Lookup lineage reference object : stvdegs
     * 
     */
    @JsonProperty("degsCode")
    @JsonPropertyDescription("Lineage reference object : SHRDGMR_DEGS_CODE, Lookup lineage reference object : stvdegs")
    private String degsCode;
    /**
     * Diploma Name
     * <p>
     * 
     * 
     */
    @JsonProperty("diplomaName")
    private String diplomaName;
    /**
     * Graduation Date
     * <p>
     * Lineage reference object : SHRDGMR_GRAD_DATE
     * 
     */
    @JsonProperty("gradDate")
    @JsonPropertyDescription("Lineage reference object : SHRDGMR_GRAD_DATE")
    private Date gradDate;
    /**
     * Learner Record Term
     * <p>
     * Lineage reference object : SHRDGMR_TERM_CODE_STUREC, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeSturec")
    @JsonPropertyDescription("Lineage reference object : SHRDGMR_TERM_CODE_STUREC, Lookup lineage reference object : stvterm")
    private String termCodeSturec;
    /**
     * Graduation Term
     * <p>
     * Lineage reference object : SHRDGMR_TERM_CODE_GRAD, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeGrad")
    @JsonPropertyDescription("Lineage reference object : SHRDGMR_TERM_CODE_GRAD, Lookup lineage reference object : stvterm")
    private String termCodeGrad;
    /**
     * Outcome Completion Term
     * <p>
     * Lineage reference object : SHRDGMR_TERM_CODE_COMPLETED, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeComp")
    @JsonPropertyDescription("Lineage reference object : SHRDGMR_TERM_CODE_COMPLETED, Lookup lineage reference object : stvterm")
    private String termCodeComp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Study Path
     * <p>
     * Lineage reference object : SHRDGMR_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("stspKeySequence")
    public Double getStspKeySequence() {
        return stspKeySequence;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : SHRDGMR_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("stspKeySequence")
    public void setStspKeySequence(Double stspKeySequence) {
        this.stspKeySequence = stspKeySequence;
    }

    public Shrdgmr withStspKeySequence(Double stspKeySequence) {
        this.stspKeySequence = stspKeySequence;
        return this;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : SHRDGMR_SEQ_NO
     * (Required)
     * 
     */
    @JsonProperty("seqNo")
    public Double getSeqNo() {
        return seqNo;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : SHRDGMR_SEQ_NO
     * (Required)
     * 
     */
    @JsonProperty("seqNo")
    public void setSeqNo(Double seqNo) {
        this.seqNo = seqNo;
    }

    public Shrdgmr withSeqNo(Double seqNo) {
        this.seqNo = seqNo;
        return this;
    }

    /**
     * Graduation Status
     * <p>
     * Lineage reference object : SHRDGMR_GRST_CODE, Lookup lineage reference object : stvgrst
     * 
     */
    @JsonProperty("grstCode")
    public String getGrstCode() {
        return grstCode;
    }

    /**
     * Graduation Status
     * <p>
     * Lineage reference object : SHRDGMR_GRST_CODE, Lookup lineage reference object : stvgrst
     * 
     */
    @JsonProperty("grstCode")
    public void setGrstCode(String grstCode) {
        this.grstCode = grstCode;
    }

    public Shrdgmr withGrstCode(String grstCode) {
        this.grstCode = grstCode;
        return this;
    }

    @JsonProperty("dualDegInd")
    public String getDualDegInd() {
        return dualDegInd;
    }

    @JsonProperty("dualDegInd")
    public void setDualDegInd(String dualDegInd) {
        this.dualDegInd = dualDegInd;
    }

    public Shrdgmr withDualDegInd(String dualDegInd) {
        this.dualDegInd = dualDegInd;
        return this;
    }

    /**
     * Bulletin Year
     * <p>
     * Lineage reference object : SHRDGMR_ACYR_CODE_BULLETIN, Lookup lineage reference object : stvacyr
     * 
     */
    @JsonProperty("acyrCodeBulletin")
    public String getAcyrCodeBulletin() {
        return acyrCodeBulletin;
    }

    /**
     * Bulletin Year
     * <p>
     * Lineage reference object : SHRDGMR_ACYR_CODE_BULLETIN, Lookup lineage reference object : stvacyr
     * 
     */
    @JsonProperty("acyrCodeBulletin")
    public void setAcyrCodeBulletin(String acyrCodeBulletin) {
        this.acyrCodeBulletin = acyrCodeBulletin;
    }

    public Shrdgmr withAcyrCodeBulletin(String acyrCodeBulletin) {
        this.acyrCodeBulletin = acyrCodeBulletin;
        return this;
    }

    /**
     * Outcome Status
     * <p>
     * Lineage reference object : SHRDGMR_DEGS_CODE, Lookup lineage reference object : stvdegs
     * 
     */
    @JsonProperty("degsCode")
    public String getDegsCode() {
        return degsCode;
    }

    /**
     * Outcome Status
     * <p>
     * Lineage reference object : SHRDGMR_DEGS_CODE, Lookup lineage reference object : stvdegs
     * 
     */
    @JsonProperty("degsCode")
    public void setDegsCode(String degsCode) {
        this.degsCode = degsCode;
    }

    public Shrdgmr withDegsCode(String degsCode) {
        this.degsCode = degsCode;
        return this;
    }

    /**
     * Diploma Name
     * <p>
     * 
     * 
     */
    @JsonProperty("diplomaName")
    public String getDiplomaName() {
        return diplomaName;
    }

    /**
     * Diploma Name
     * <p>
     * 
     * 
     */
    @JsonProperty("diplomaName")
    public void setDiplomaName(String diplomaName) {
        this.diplomaName = diplomaName;
    }

    public Shrdgmr withDiplomaName(String diplomaName) {
        this.diplomaName = diplomaName;
        return this;
    }

    /**
     * Graduation Date
     * <p>
     * Lineage reference object : SHRDGMR_GRAD_DATE
     * 
     */
    @JsonProperty("gradDate")
    public Date getGradDate() {
        return gradDate;
    }

    /**
     * Graduation Date
     * <p>
     * Lineage reference object : SHRDGMR_GRAD_DATE
     * 
     */
    @JsonProperty("gradDate")
    public void setGradDate(Date gradDate) {
        this.gradDate = gradDate;
    }

    public Shrdgmr withGradDate(Date gradDate) {
        this.gradDate = gradDate;
        return this;
    }

    /**
     * Learner Record Term
     * <p>
     * Lineage reference object : SHRDGMR_TERM_CODE_STUREC, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeSturec")
    public String getTermCodeSturec() {
        return termCodeSturec;
    }

    /**
     * Learner Record Term
     * <p>
     * Lineage reference object : SHRDGMR_TERM_CODE_STUREC, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeSturec")
    public void setTermCodeSturec(String termCodeSturec) {
        this.termCodeSturec = termCodeSturec;
    }

    public Shrdgmr withTermCodeSturec(String termCodeSturec) {
        this.termCodeSturec = termCodeSturec;
        return this;
    }

    /**
     * Graduation Term
     * <p>
     * Lineage reference object : SHRDGMR_TERM_CODE_GRAD, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeGrad")
    public String getTermCodeGrad() {
        return termCodeGrad;
    }

    /**
     * Graduation Term
     * <p>
     * Lineage reference object : SHRDGMR_TERM_CODE_GRAD, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeGrad")
    public void setTermCodeGrad(String termCodeGrad) {
        this.termCodeGrad = termCodeGrad;
    }

    public Shrdgmr withTermCodeGrad(String termCodeGrad) {
        this.termCodeGrad = termCodeGrad;
        return this;
    }

    /**
     * Outcome Completion Term
     * <p>
     * Lineage reference object : SHRDGMR_TERM_CODE_COMPLETED, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeComp")
    public String getTermCodeComp() {
        return termCodeComp;
    }

    /**
     * Outcome Completion Term
     * <p>
     * Lineage reference object : SHRDGMR_TERM_CODE_COMPLETED, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeComp")
    public void setTermCodeComp(String termCodeComp) {
        this.termCodeComp = termCodeComp;
    }

    public Shrdgmr withTermCodeComp(String termCodeComp) {
        this.termCodeComp = termCodeComp;
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

    public Shrdgmr withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Shrdgmr.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("stspKeySequence");
        sb.append('=');
        sb.append(((this.stspKeySequence == null)?"<null>":this.stspKeySequence));
        sb.append(',');
        sb.append("seqNo");
        sb.append('=');
        sb.append(((this.seqNo == null)?"<null>":this.seqNo));
        sb.append(',');
        sb.append("grstCode");
        sb.append('=');
        sb.append(((this.grstCode == null)?"<null>":this.grstCode));
        sb.append(',');
        sb.append("dualDegInd");
        sb.append('=');
        sb.append(((this.dualDegInd == null)?"<null>":this.dualDegInd));
        sb.append(',');
        sb.append("acyrCodeBulletin");
        sb.append('=');
        sb.append(((this.acyrCodeBulletin == null)?"<null>":this.acyrCodeBulletin));
        sb.append(',');
        sb.append("degsCode");
        sb.append('=');
        sb.append(((this.degsCode == null)?"<null>":this.degsCode));
        sb.append(',');
        sb.append("diplomaName");
        sb.append('=');
        sb.append(((this.diplomaName == null)?"<null>":this.diplomaName));
        sb.append(',');
        sb.append("gradDate");
        sb.append('=');
        sb.append(((this.gradDate == null)?"<null>":this.gradDate));
        sb.append(',');
        sb.append("termCodeSturec");
        sb.append('=');
        sb.append(((this.termCodeSturec == null)?"<null>":this.termCodeSturec));
        sb.append(',');
        sb.append("termCodeGrad");
        sb.append('=');
        sb.append(((this.termCodeGrad == null)?"<null>":this.termCodeGrad));
        sb.append(',');
        sb.append("termCodeComp");
        sb.append('=');
        sb.append(((this.termCodeComp == null)?"<null>":this.termCodeComp));
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
        result = ((result* 31)+((this.stspKeySequence == null)? 0 :this.stspKeySequence.hashCode()));
        result = ((result* 31)+((this.seqNo == null)? 0 :this.seqNo.hashCode()));
        result = ((result* 31)+((this.grstCode == null)? 0 :this.grstCode.hashCode()));
        result = ((result* 31)+((this.dualDegInd == null)? 0 :this.dualDegInd.hashCode()));
        result = ((result* 31)+((this.termCodeSturec == null)? 0 :this.termCodeSturec.hashCode()));
        result = ((result* 31)+((this.termCodeGrad == null)? 0 :this.termCodeGrad.hashCode()));
        result = ((result* 31)+((this.termCodeComp == null)? 0 :this.termCodeComp.hashCode()));
        result = ((result* 31)+((this.acyrCodeBulletin == null)? 0 :this.acyrCodeBulletin.hashCode()));
        result = ((result* 31)+((this.degsCode == null)? 0 :this.degsCode.hashCode()));
        result = ((result* 31)+((this.diplomaName == null)? 0 :this.diplomaName.hashCode()));
        result = ((result* 31)+((this.gradDate == null)? 0 :this.gradDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Shrdgmr) == false) {
            return false;
        }
        Shrdgmr rhs = ((Shrdgmr) other);
        return (((((((((((((this.stspKeySequence == rhs.stspKeySequence)||((this.stspKeySequence!= null)&&this.stspKeySequence.equals(rhs.stspKeySequence)))&&((this.seqNo == rhs.seqNo)||((this.seqNo!= null)&&this.seqNo.equals(rhs.seqNo))))&&((this.grstCode == rhs.grstCode)||((this.grstCode!= null)&&this.grstCode.equals(rhs.grstCode))))&&((this.dualDegInd == rhs.dualDegInd)||((this.dualDegInd!= null)&&this.dualDegInd.equals(rhs.dualDegInd))))&&((this.termCodeSturec == rhs.termCodeSturec)||((this.termCodeSturec!= null)&&this.termCodeSturec.equals(rhs.termCodeSturec))))&&((this.termCodeGrad == rhs.termCodeGrad)||((this.termCodeGrad!= null)&&this.termCodeGrad.equals(rhs.termCodeGrad))))&&((this.termCodeComp == rhs.termCodeComp)||((this.termCodeComp!= null)&&this.termCodeComp.equals(rhs.termCodeComp))))&&((this.acyrCodeBulletin == rhs.acyrCodeBulletin)||((this.acyrCodeBulletin!= null)&&this.acyrCodeBulletin.equals(rhs.acyrCodeBulletin))))&&((this.degsCode == rhs.degsCode)||((this.degsCode!= null)&&this.degsCode.equals(rhs.degsCode))))&&((this.diplomaName == rhs.diplomaName)||((this.diplomaName!= null)&&this.diplomaName.equals(rhs.diplomaName))))&&((this.gradDate == rhs.gradDate)||((this.gradDate!= null)&&this.gradDate.equals(rhs.gradDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
