
package com.ellucian.generated.bpapi.ban.admissions_application_curricula.v1_0_0;

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
    "termCodeCtlg",
    "majrCodeAttach",
    "seqno",
    "tmstDesc",
    "endDate",
    "majrDesc",
    "tmstCode",
    "lfosRolledInd",
    "majrCode",
    "termCodeEnd",
    "userId",
    "currentInd",
    "lfstCode",
    "activityDate",
    "priorityNo",
    "attachConcDesc",
    "deptDesc",
    "cstsCode",
    "deptCode",
    "lfstCodeDesc",
    "startDate",
    "cactCode",
    "termCode"
})
@Generated("jsonschema2pojo")
public class Sorlfo {

    /**
     * Catalog
     * <p>
     * Lineage reference object : SOVLFOS_TERM_CODE_CTLG, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeCtlg")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_TERM_CODE_CTLG, Lookup lineage reference object : stvterm")
    private String termCodeCtlg;
    /**
     * Attached to Major
     * <p>
     * Lineage reference object : SOVLFOS_MAJR_CODE_ATTACH, Lookup lineage reference object : sobcact,stvmajr,sotlfos,sotlfos
     * 
     */
    @JsonProperty("majrCodeAttach")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_MAJR_CODE_ATTACH, Lookup lineage reference object : sobcact,stvmajr,sotlfos,sotlfos")
    private String majrCodeAttach;
    /**
     * Seq Num
     * <p>
     * Lineage reference object : SOVLFOS_SEQNO
     * 
     */
    @JsonProperty("seqno")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_SEQNO")
    private Double seqno;
    /**
     * Full or Part Time Description
     * <p>
     * 
     * 
     */
    @JsonProperty("tmstDesc")
    private String tmstDesc;
    /**
     * End Date
     * <p>
     * Lineage reference object : SOVLFOS_END_DATE
     * 
     */
    @JsonProperty("endDate")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_END_DATE")
    private Date endDate;
    /**
     * Field of Study Description
     * <p>
     * 
     * 
     */
    @JsonProperty("majrDesc")
    private String majrDesc;
    /**
     * Full or Part Time
     * <p>
     * Lineage reference object : SOVLFOS_TMST_CODE, Lookup lineage reference object : stvtmst
     * 
     */
    @JsonProperty("tmstCode")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_TMST_CODE, Lookup lineage reference object : stvtmst")
    private String tmstCode;
    @JsonProperty("lfosRolledInd")
    private String lfosRolledInd;
    /**
     * Field of Study
     * <p>
     * Lineage reference object : SOVLFOS_MAJR_CODE, Lookup lineage reference object : stvmajr,sovlfos
     * 
     */
    @JsonProperty("majrCode")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_MAJR_CODE, Lookup lineage reference object : stvmajr,sovlfos")
    private String majrCode;
    /**
     * End Term
     * <p>
     * Lineage reference object : SOVLFOS_TERM_CODE_END, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeEnd")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_TERM_CODE_END, Lookup lineage reference object : stvterm")
    private String termCodeEnd;
    /**
     * Lineage reference object : SOVLFOS_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_USER_ID")
    private String userId;
    /**
     * Lineage reference object : SOVLFOS_CURRENT_IND
     * 
     */
    @JsonProperty("currentInd")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_CURRENT_IND")
    private String currentInd;
    /**
     * Type
     * <p>
     * Lineage reference object : SOVLFOS_LFST_CODE, Lookup lineage reference object : gtvlfst
     * 
     */
    @JsonProperty("lfstCode")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_LFST_CODE, Lookup lineage reference object : gtvlfst")
    private String lfstCode;
    /**
     * Created
     * <p>
     * Lineage reference object : SOVLFOS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Priority
     * <p>
     * Lineage reference object : SOVLFOS_PRIORITY_NO
     * 
     */
    @JsonProperty("priorityNo")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_PRIORITY_NO")
    private Double priorityNo;
    /**
     * Attached to Major Description
     * <p>
     * 
     * 
     */
    @JsonProperty("attachConcDesc")
    private String attachConcDesc;
    /**
     * Department Description
     * <p>
     * 
     * 
     */
    @JsonProperty("deptDesc")
    private String deptDesc;
    /**
     * Status
     * <p>
     * Lineage reference object : SOVLFOS_CSTS_CODE, Lookup lineage reference object : stvcsts
     * 
     */
    @JsonProperty("cstsCode")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_CSTS_CODE, Lookup lineage reference object : stvcsts")
    private String cstsCode;
    /**
     * Department
     * <p>
     * Lineage reference object : SOVLFOS_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_DEPT_CODE, Lookup lineage reference object : stvdept")
    private String deptCode;
    /**
     * Type Description
     * <p>
     * 
     * 
     */
    @JsonProperty("lfstCodeDesc")
    private String lfstCodeDesc;
    /**
     * Start Date
     * <p>
     * Lineage reference object : SOVLFOS_START_DATE
     * 
     */
    @JsonProperty("startDate")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_START_DATE")
    private Date startDate;
    /**
     * Activity
     * <p>
     * Lineage reference object : SOVLFOS_CACT_CODE, Lookup lineage reference object : stvcact,sobcact
     * 
     */
    @JsonProperty("cactCode")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_CACT_CODE, Lookup lineage reference object : stvcact,sobcact")
    private String cactCode;
    /**
     * Term
     * <p>
     * Lineage reference object : SOVLFOS_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_TERM_CODE, Lookup lineage reference object : stvterm")
    private String termCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Catalog
     * <p>
     * Lineage reference object : SOVLFOS_TERM_CODE_CTLG, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeCtlg")
    public String getTermCodeCtlg() {
        return termCodeCtlg;
    }

    /**
     * Catalog
     * <p>
     * Lineage reference object : SOVLFOS_TERM_CODE_CTLG, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeCtlg")
    public void setTermCodeCtlg(String termCodeCtlg) {
        this.termCodeCtlg = termCodeCtlg;
    }

    public Sorlfo withTermCodeCtlg(String termCodeCtlg) {
        this.termCodeCtlg = termCodeCtlg;
        return this;
    }

    /**
     * Attached to Major
     * <p>
     * Lineage reference object : SOVLFOS_MAJR_CODE_ATTACH, Lookup lineage reference object : sobcact,stvmajr,sotlfos,sotlfos
     * 
     */
    @JsonProperty("majrCodeAttach")
    public String getMajrCodeAttach() {
        return majrCodeAttach;
    }

    /**
     * Attached to Major
     * <p>
     * Lineage reference object : SOVLFOS_MAJR_CODE_ATTACH, Lookup lineage reference object : sobcact,stvmajr,sotlfos,sotlfos
     * 
     */
    @JsonProperty("majrCodeAttach")
    public void setMajrCodeAttach(String majrCodeAttach) {
        this.majrCodeAttach = majrCodeAttach;
    }

    public Sorlfo withMajrCodeAttach(String majrCodeAttach) {
        this.majrCodeAttach = majrCodeAttach;
        return this;
    }

    /**
     * Seq Num
     * <p>
     * Lineage reference object : SOVLFOS_SEQNO
     * 
     */
    @JsonProperty("seqno")
    public Double getSeqno() {
        return seqno;
    }

    /**
     * Seq Num
     * <p>
     * Lineage reference object : SOVLFOS_SEQNO
     * 
     */
    @JsonProperty("seqno")
    public void setSeqno(Double seqno) {
        this.seqno = seqno;
    }

    public Sorlfo withSeqno(Double seqno) {
        this.seqno = seqno;
        return this;
    }

    /**
     * Full or Part Time Description
     * <p>
     * 
     * 
     */
    @JsonProperty("tmstDesc")
    public String getTmstDesc() {
        return tmstDesc;
    }

    /**
     * Full or Part Time Description
     * <p>
     * 
     * 
     */
    @JsonProperty("tmstDesc")
    public void setTmstDesc(String tmstDesc) {
        this.tmstDesc = tmstDesc;
    }

    public Sorlfo withTmstDesc(String tmstDesc) {
        this.tmstDesc = tmstDesc;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SOVLFOS_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public Date getEndDate() {
        return endDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SOVLFOS_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Sorlfo withEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Field of Study Description
     * <p>
     * 
     * 
     */
    @JsonProperty("majrDesc")
    public String getMajrDesc() {
        return majrDesc;
    }

    /**
     * Field of Study Description
     * <p>
     * 
     * 
     */
    @JsonProperty("majrDesc")
    public void setMajrDesc(String majrDesc) {
        this.majrDesc = majrDesc;
    }

    public Sorlfo withMajrDesc(String majrDesc) {
        this.majrDesc = majrDesc;
        return this;
    }

    /**
     * Full or Part Time
     * <p>
     * Lineage reference object : SOVLFOS_TMST_CODE, Lookup lineage reference object : stvtmst
     * 
     */
    @JsonProperty("tmstCode")
    public String getTmstCode() {
        return tmstCode;
    }

    /**
     * Full or Part Time
     * <p>
     * Lineage reference object : SOVLFOS_TMST_CODE, Lookup lineage reference object : stvtmst
     * 
     */
    @JsonProperty("tmstCode")
    public void setTmstCode(String tmstCode) {
        this.tmstCode = tmstCode;
    }

    public Sorlfo withTmstCode(String tmstCode) {
        this.tmstCode = tmstCode;
        return this;
    }

    @JsonProperty("lfosRolledInd")
    public String getLfosRolledInd() {
        return lfosRolledInd;
    }

    @JsonProperty("lfosRolledInd")
    public void setLfosRolledInd(String lfosRolledInd) {
        this.lfosRolledInd = lfosRolledInd;
    }

    public Sorlfo withLfosRolledInd(String lfosRolledInd) {
        this.lfosRolledInd = lfosRolledInd;
        return this;
    }

    /**
     * Field of Study
     * <p>
     * Lineage reference object : SOVLFOS_MAJR_CODE, Lookup lineage reference object : stvmajr,sovlfos
     * 
     */
    @JsonProperty("majrCode")
    public String getMajrCode() {
        return majrCode;
    }

    /**
     * Field of Study
     * <p>
     * Lineage reference object : SOVLFOS_MAJR_CODE, Lookup lineage reference object : stvmajr,sovlfos
     * 
     */
    @JsonProperty("majrCode")
    public void setMajrCode(String majrCode) {
        this.majrCode = majrCode;
    }

    public Sorlfo withMajrCode(String majrCode) {
        this.majrCode = majrCode;
        return this;
    }

    /**
     * End Term
     * <p>
     * Lineage reference object : SOVLFOS_TERM_CODE_END, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeEnd")
    public String getTermCodeEnd() {
        return termCodeEnd;
    }

    /**
     * End Term
     * <p>
     * Lineage reference object : SOVLFOS_TERM_CODE_END, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeEnd")
    public void setTermCodeEnd(String termCodeEnd) {
        this.termCodeEnd = termCodeEnd;
    }

    public Sorlfo withTermCodeEnd(String termCodeEnd) {
        this.termCodeEnd = termCodeEnd;
        return this;
    }

    /**
     * Lineage reference object : SOVLFOS_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SOVLFOS_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Sorlfo withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Lineage reference object : SOVLFOS_CURRENT_IND
     * 
     */
    @JsonProperty("currentInd")
    public String getCurrentInd() {
        return currentInd;
    }

    /**
     * Lineage reference object : SOVLFOS_CURRENT_IND
     * 
     */
    @JsonProperty("currentInd")
    public void setCurrentInd(String currentInd) {
        this.currentInd = currentInd;
    }

    public Sorlfo withCurrentInd(String currentInd) {
        this.currentInd = currentInd;
        return this;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : SOVLFOS_LFST_CODE, Lookup lineage reference object : gtvlfst
     * 
     */
    @JsonProperty("lfstCode")
    public String getLfstCode() {
        return lfstCode;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : SOVLFOS_LFST_CODE, Lookup lineage reference object : gtvlfst
     * 
     */
    @JsonProperty("lfstCode")
    public void setLfstCode(String lfstCode) {
        this.lfstCode = lfstCode;
    }

    public Sorlfo withLfstCode(String lfstCode) {
        this.lfstCode = lfstCode;
        return this;
    }

    /**
     * Created
     * <p>
     * Lineage reference object : SOVLFOS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Created
     * <p>
     * Lineage reference object : SOVLFOS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sorlfo withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : SOVLFOS_PRIORITY_NO
     * 
     */
    @JsonProperty("priorityNo")
    public Double getPriorityNo() {
        return priorityNo;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : SOVLFOS_PRIORITY_NO
     * 
     */
    @JsonProperty("priorityNo")
    public void setPriorityNo(Double priorityNo) {
        this.priorityNo = priorityNo;
    }

    public Sorlfo withPriorityNo(Double priorityNo) {
        this.priorityNo = priorityNo;
        return this;
    }

    /**
     * Attached to Major Description
     * <p>
     * 
     * 
     */
    @JsonProperty("attachConcDesc")
    public String getAttachConcDesc() {
        return attachConcDesc;
    }

    /**
     * Attached to Major Description
     * <p>
     * 
     * 
     */
    @JsonProperty("attachConcDesc")
    public void setAttachConcDesc(String attachConcDesc) {
        this.attachConcDesc = attachConcDesc;
    }

    public Sorlfo withAttachConcDesc(String attachConcDesc) {
        this.attachConcDesc = attachConcDesc;
        return this;
    }

    /**
     * Department Description
     * <p>
     * 
     * 
     */
    @JsonProperty("deptDesc")
    public String getDeptDesc() {
        return deptDesc;
    }

    /**
     * Department Description
     * <p>
     * 
     * 
     */
    @JsonProperty("deptDesc")
    public void setDeptDesc(String deptDesc) {
        this.deptDesc = deptDesc;
    }

    public Sorlfo withDeptDesc(String deptDesc) {
        this.deptDesc = deptDesc;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SOVLFOS_CSTS_CODE, Lookup lineage reference object : stvcsts
     * 
     */
    @JsonProperty("cstsCode")
    public String getCstsCode() {
        return cstsCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SOVLFOS_CSTS_CODE, Lookup lineage reference object : stvcsts
     * 
     */
    @JsonProperty("cstsCode")
    public void setCstsCode(String cstsCode) {
        this.cstsCode = cstsCode;
    }

    public Sorlfo withCstsCode(String cstsCode) {
        this.cstsCode = cstsCode;
        return this;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SOVLFOS_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SOVLFOS_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public Sorlfo withDeptCode(String deptCode) {
        this.deptCode = deptCode;
        return this;
    }

    /**
     * Type Description
     * <p>
     * 
     * 
     */
    @JsonProperty("lfstCodeDesc")
    public String getLfstCodeDesc() {
        return lfstCodeDesc;
    }

    /**
     * Type Description
     * <p>
     * 
     * 
     */
    @JsonProperty("lfstCodeDesc")
    public void setLfstCodeDesc(String lfstCodeDesc) {
        this.lfstCodeDesc = lfstCodeDesc;
    }

    public Sorlfo withLfstCodeDesc(String lfstCodeDesc) {
        this.lfstCodeDesc = lfstCodeDesc;
        return this;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : SOVLFOS_START_DATE
     * 
     */
    @JsonProperty("startDate")
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : SOVLFOS_START_DATE
     * 
     */
    @JsonProperty("startDate")
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Sorlfo withStartDate(Date startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : SOVLFOS_CACT_CODE, Lookup lineage reference object : stvcact,sobcact
     * 
     */
    @JsonProperty("cactCode")
    public String getCactCode() {
        return cactCode;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : SOVLFOS_CACT_CODE, Lookup lineage reference object : stvcact,sobcact
     * 
     */
    @JsonProperty("cactCode")
    public void setCactCode(String cactCode) {
        this.cactCode = cactCode;
    }

    public Sorlfo withCactCode(String cactCode) {
        this.cactCode = cactCode;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SOVLFOS_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SOVLFOS_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public Sorlfo withTermCode(String termCode) {
        this.termCode = termCode;
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

    public Sorlfo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sorlfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("termCodeCtlg");
        sb.append('=');
        sb.append(((this.termCodeCtlg == null)?"<null>":this.termCodeCtlg));
        sb.append(',');
        sb.append("majrCodeAttach");
        sb.append('=');
        sb.append(((this.majrCodeAttach == null)?"<null>":this.majrCodeAttach));
        sb.append(',');
        sb.append("seqno");
        sb.append('=');
        sb.append(((this.seqno == null)?"<null>":this.seqno));
        sb.append(',');
        sb.append("tmstDesc");
        sb.append('=');
        sb.append(((this.tmstDesc == null)?"<null>":this.tmstDesc));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("majrDesc");
        sb.append('=');
        sb.append(((this.majrDesc == null)?"<null>":this.majrDesc));
        sb.append(',');
        sb.append("tmstCode");
        sb.append('=');
        sb.append(((this.tmstCode == null)?"<null>":this.tmstCode));
        sb.append(',');
        sb.append("lfosRolledInd");
        sb.append('=');
        sb.append(((this.lfosRolledInd == null)?"<null>":this.lfosRolledInd));
        sb.append(',');
        sb.append("majrCode");
        sb.append('=');
        sb.append(((this.majrCode == null)?"<null>":this.majrCode));
        sb.append(',');
        sb.append("termCodeEnd");
        sb.append('=');
        sb.append(((this.termCodeEnd == null)?"<null>":this.termCodeEnd));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("currentInd");
        sb.append('=');
        sb.append(((this.currentInd == null)?"<null>":this.currentInd));
        sb.append(',');
        sb.append("lfstCode");
        sb.append('=');
        sb.append(((this.lfstCode == null)?"<null>":this.lfstCode));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("priorityNo");
        sb.append('=');
        sb.append(((this.priorityNo == null)?"<null>":this.priorityNo));
        sb.append(',');
        sb.append("attachConcDesc");
        sb.append('=');
        sb.append(((this.attachConcDesc == null)?"<null>":this.attachConcDesc));
        sb.append(',');
        sb.append("deptDesc");
        sb.append('=');
        sb.append(((this.deptDesc == null)?"<null>":this.deptDesc));
        sb.append(',');
        sb.append("cstsCode");
        sb.append('=');
        sb.append(((this.cstsCode == null)?"<null>":this.cstsCode));
        sb.append(',');
        sb.append("deptCode");
        sb.append('=');
        sb.append(((this.deptCode == null)?"<null>":this.deptCode));
        sb.append(',');
        sb.append("lfstCodeDesc");
        sb.append('=');
        sb.append(((this.lfstCodeDesc == null)?"<null>":this.lfstCodeDesc));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
        sb.append(',');
        sb.append("cactCode");
        sb.append('=');
        sb.append(((this.cactCode == null)?"<null>":this.cactCode));
        sb.append(',');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
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
        result = ((result* 31)+((this.tmstDesc == null)? 0 :this.tmstDesc.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.lfosRolledInd == null)? 0 :this.lfosRolledInd.hashCode()));
        result = ((result* 31)+((this.majrCode == null)? 0 :this.majrCode.hashCode()));
        result = ((result* 31)+((this.lfstCode == null)? 0 :this.lfstCode.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.priorityNo == null)? 0 :this.priorityNo.hashCode()));
        result = ((result* 31)+((this.deptDesc == null)? 0 :this.deptDesc.hashCode()));
        result = ((result* 31)+((this.cstsCode == null)? 0 :this.cstsCode.hashCode()));
        result = ((result* 31)+((this.cactCode == null)? 0 :this.cactCode.hashCode()));
        result = ((result* 31)+((this.termCodeCtlg == null)? 0 :this.termCodeCtlg.hashCode()));
        result = ((result* 31)+((this.majrCodeAttach == null)? 0 :this.majrCodeAttach.hashCode()));
        result = ((result* 31)+((this.seqno == null)? 0 :this.seqno.hashCode()));
        result = ((result* 31)+((this.majrDesc == null)? 0 :this.majrDesc.hashCode()));
        result = ((result* 31)+((this.tmstCode == null)? 0 :this.tmstCode.hashCode()));
        result = ((result* 31)+((this.termCodeEnd == null)? 0 :this.termCodeEnd.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.currentInd == null)? 0 :this.currentInd.hashCode()));
        result = ((result* 31)+((this.attachConcDesc == null)? 0 :this.attachConcDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.deptCode == null)? 0 :this.deptCode.hashCode()));
        result = ((result* 31)+((this.lfstCodeDesc == null)? 0 :this.lfstCodeDesc.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sorlfo) == false) {
            return false;
        }
        Sorlfo rhs = ((Sorlfo) other);
        return (((((((((((((((((((((((((this.tmstDesc == rhs.tmstDesc)||((this.tmstDesc!= null)&&this.tmstDesc.equals(rhs.tmstDesc)))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.lfosRolledInd == rhs.lfosRolledInd)||((this.lfosRolledInd!= null)&&this.lfosRolledInd.equals(rhs.lfosRolledInd))))&&((this.majrCode == rhs.majrCode)||((this.majrCode!= null)&&this.majrCode.equals(rhs.majrCode))))&&((this.lfstCode == rhs.lfstCode)||((this.lfstCode!= null)&&this.lfstCode.equals(rhs.lfstCode))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.priorityNo == rhs.priorityNo)||((this.priorityNo!= null)&&this.priorityNo.equals(rhs.priorityNo))))&&((this.deptDesc == rhs.deptDesc)||((this.deptDesc!= null)&&this.deptDesc.equals(rhs.deptDesc))))&&((this.cstsCode == rhs.cstsCode)||((this.cstsCode!= null)&&this.cstsCode.equals(rhs.cstsCode))))&&((this.cactCode == rhs.cactCode)||((this.cactCode!= null)&&this.cactCode.equals(rhs.cactCode))))&&((this.termCodeCtlg == rhs.termCodeCtlg)||((this.termCodeCtlg!= null)&&this.termCodeCtlg.equals(rhs.termCodeCtlg))))&&((this.majrCodeAttach == rhs.majrCodeAttach)||((this.majrCodeAttach!= null)&&this.majrCodeAttach.equals(rhs.majrCodeAttach))))&&((this.seqno == rhs.seqno)||((this.seqno!= null)&&this.seqno.equals(rhs.seqno))))&&((this.majrDesc == rhs.majrDesc)||((this.majrDesc!= null)&&this.majrDesc.equals(rhs.majrDesc))))&&((this.tmstCode == rhs.tmstCode)||((this.tmstCode!= null)&&this.tmstCode.equals(rhs.tmstCode))))&&((this.termCodeEnd == rhs.termCodeEnd)||((this.termCodeEnd!= null)&&this.termCodeEnd.equals(rhs.termCodeEnd))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.currentInd == rhs.currentInd)||((this.currentInd!= null)&&this.currentInd.equals(rhs.currentInd))))&&((this.attachConcDesc == rhs.attachConcDesc)||((this.attachConcDesc!= null)&&this.attachConcDesc.equals(rhs.attachConcDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.deptCode == rhs.deptCode)||((this.deptCode!= null)&&this.deptCode.equals(rhs.deptCode))))&&((this.lfstCodeDesc == rhs.lfstCodeDesc)||((this.lfstCodeDesc!= null)&&this.lfstCodeDesc.equals(rhs.lfstCodeDesc))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
