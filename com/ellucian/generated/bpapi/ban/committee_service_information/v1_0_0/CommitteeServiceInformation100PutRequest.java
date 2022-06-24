
package com.ellucian.generated.bpapi.ban.committee_service_information.v1_0_0;

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
    "initiatedDate",
    "comsCode",
    "dissolvedInd",
    "criteria.transPrint",
    "dicdCode",
    "criteria.dissolvedDate",
    "criteria.collCode",
    "criteria.deptCode",
    "dissolvedDate",
    "criteria.initiatedDate",
    "criteria.dicdCode",
    "criteria.comsCode",
    "criteria.dissolvedInd",
    "id",
    "shacomiComtCode",
    "collCode",
    "deptCode",
    "transPrint"
})
@Generated("jsonschema2pojo")
public class CommitteeServiceInformation100PutRequest {

    /**
     * Date Initiated
     * <p>
     * Lineage reference object : SHBCOMI_INITIATED_DATE
     * (Required)
     * 
     */
    @JsonProperty("initiatedDate")
    @JsonPropertyDescription("Lineage reference object : SHBCOMI_INITIATED_DATE")
    private Date initiatedDate;
    /**
     * Status
     * <p>
     * Lineage reference object : SHBCOMI_COMS_CODE, Lookup lineage reference object : stvcoms
     * (Required)
     * 
     */
    @JsonProperty("comsCode")
    @JsonPropertyDescription("Lineage reference object : SHBCOMI_COMS_CODE, Lookup lineage reference object : stvcoms")
    private String comsCode;
    /**
     * Lineage reference object : SHBCOMI_DISSOLVED_IND
     * 
     */
    @JsonProperty("dissolvedInd")
    @JsonPropertyDescription("Lineage reference object : SHBCOMI_DISSOLVED_IND")
    private String dissolvedInd;
    /**
     * Print on Transcript
     * <p>
     * Lineage reference object : SHBCOMI_TRANS_PRINT
     * 
     */
    @JsonProperty("criteria.transPrint")
    @JsonPropertyDescription("Lineage reference object : SHBCOMI_TRANS_PRINT")
    private String criteriaTransPrint;
    /**
     * District/Division
     * <p>
     * Lineage reference object : SHBCOMI_DICD_CODE, Lookup lineage reference object : gtvdicd
     * 
     */
    @JsonProperty("dicdCode")
    @JsonPropertyDescription("Lineage reference object : SHBCOMI_DICD_CODE, Lookup lineage reference object : gtvdicd")
    private String dicdCode;
    /**
     * Date Dissolved
     * <p>
     * Lineage reference object : SHBCOMI_DISSOLVED_DATE
     * 
     */
    @JsonProperty("criteria.dissolvedDate")
    @JsonPropertyDescription("Lineage reference object : SHBCOMI_DISSOLVED_DATE")
    private Date criteriaDissolvedDate;
    /**
     * Home College
     * <p>
     * Lineage reference object : SHBCOMI_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("criteria.collCode")
    @JsonPropertyDescription("Lineage reference object : SHBCOMI_COLL_CODE, Lookup lineage reference object : stvcoll")
    private String criteriaCollCode;
    /**
     * Home Department
     * <p>
     * Lineage reference object : SHBCOMI_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("criteria.deptCode")
    @JsonPropertyDescription("Lineage reference object : SHBCOMI_DEPT_CODE, Lookup lineage reference object : stvdept")
    private String criteriaDeptCode;
    /**
     * Date Dissolved
     * <p>
     * Lineage reference object : SHBCOMI_DISSOLVED_DATE
     * 
     */
    @JsonProperty("dissolvedDate")
    @JsonPropertyDescription("Lineage reference object : SHBCOMI_DISSOLVED_DATE")
    private Date dissolvedDate;
    /**
     * Date Initiated
     * <p>
     * Lineage reference object : SHBCOMI_INITIATED_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.initiatedDate")
    @JsonPropertyDescription("Lineage reference object : SHBCOMI_INITIATED_DATE")
    private Date criteriaInitiatedDate;
    /**
     * District/Division
     * <p>
     * Lineage reference object : SHBCOMI_DICD_CODE, Lookup lineage reference object : gtvdicd
     * 
     */
    @JsonProperty("criteria.dicdCode")
    @JsonPropertyDescription("Lineage reference object : SHBCOMI_DICD_CODE, Lookup lineage reference object : gtvdicd")
    private String criteriaDicdCode;
    /**
     * Status
     * <p>
     * Lineage reference object : SHBCOMI_COMS_CODE, Lookup lineage reference object : stvcoms
     * (Required)
     * 
     */
    @JsonProperty("criteria.comsCode")
    @JsonPropertyDescription("Lineage reference object : SHBCOMI_COMS_CODE, Lookup lineage reference object : stvcoms")
    private String criteriaComsCode;
    /**
     * Lineage reference object : SHBCOMI_DISSOLVED_IND
     * 
     */
    @JsonProperty("criteria.dissolvedInd")
    @JsonPropertyDescription("Lineage reference object : SHBCOMI_DISSOLVED_IND")
    private String criteriaDissolvedInd;
    /**
     * Associated ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private String id;
    /**
     * Committee/Service Type
     * <p>
     * Lineage reference object : shacomiComtCode, Lookup lineage reference object : stvcomt
     * (Required)
     * 
     */
    @JsonProperty("shacomiComtCode")
    @JsonPropertyDescription("Lineage reference object : shacomiComtCode, Lookup lineage reference object : stvcomt")
    private String shacomiComtCode;
    /**
     * Home College
     * <p>
     * Lineage reference object : SHBCOMI_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    @JsonPropertyDescription("Lineage reference object : SHBCOMI_COLL_CODE, Lookup lineage reference object : stvcoll")
    private String collCode;
    /**
     * Home Department
     * <p>
     * Lineage reference object : SHBCOMI_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    @JsonPropertyDescription("Lineage reference object : SHBCOMI_DEPT_CODE, Lookup lineage reference object : stvdept")
    private String deptCode;
    /**
     * Print on Transcript
     * <p>
     * Lineage reference object : SHBCOMI_TRANS_PRINT
     * 
     */
    @JsonProperty("transPrint")
    @JsonPropertyDescription("Lineage reference object : SHBCOMI_TRANS_PRINT")
    private String transPrint;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Date Initiated
     * <p>
     * Lineage reference object : SHBCOMI_INITIATED_DATE
     * (Required)
     * 
     */
    @JsonProperty("initiatedDate")
    public Date getInitiatedDate() {
        return initiatedDate;
    }

    /**
     * Date Initiated
     * <p>
     * Lineage reference object : SHBCOMI_INITIATED_DATE
     * (Required)
     * 
     */
    @JsonProperty("initiatedDate")
    public void setInitiatedDate(Date initiatedDate) {
        this.initiatedDate = initiatedDate;
    }

    public CommitteeServiceInformation100PutRequest withInitiatedDate(Date initiatedDate) {
        this.initiatedDate = initiatedDate;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SHBCOMI_COMS_CODE, Lookup lineage reference object : stvcoms
     * (Required)
     * 
     */
    @JsonProperty("comsCode")
    public String getComsCode() {
        return comsCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SHBCOMI_COMS_CODE, Lookup lineage reference object : stvcoms
     * (Required)
     * 
     */
    @JsonProperty("comsCode")
    public void setComsCode(String comsCode) {
        this.comsCode = comsCode;
    }

    public CommitteeServiceInformation100PutRequest withComsCode(String comsCode) {
        this.comsCode = comsCode;
        return this;
    }

    /**
     * Lineage reference object : SHBCOMI_DISSOLVED_IND
     * 
     */
    @JsonProperty("dissolvedInd")
    public String getDissolvedInd() {
        return dissolvedInd;
    }

    /**
     * Lineage reference object : SHBCOMI_DISSOLVED_IND
     * 
     */
    @JsonProperty("dissolvedInd")
    public void setDissolvedInd(String dissolvedInd) {
        this.dissolvedInd = dissolvedInd;
    }

    public CommitteeServiceInformation100PutRequest withDissolvedInd(String dissolvedInd) {
        this.dissolvedInd = dissolvedInd;
        return this;
    }

    /**
     * Print on Transcript
     * <p>
     * Lineage reference object : SHBCOMI_TRANS_PRINT
     * 
     */
    @JsonProperty("criteria.transPrint")
    public String getCriteriaTransPrint() {
        return criteriaTransPrint;
    }

    /**
     * Print on Transcript
     * <p>
     * Lineage reference object : SHBCOMI_TRANS_PRINT
     * 
     */
    @JsonProperty("criteria.transPrint")
    public void setCriteriaTransPrint(String criteriaTransPrint) {
        this.criteriaTransPrint = criteriaTransPrint;
    }

    public CommitteeServiceInformation100PutRequest withCriteriaTransPrint(String criteriaTransPrint) {
        this.criteriaTransPrint = criteriaTransPrint;
        return this;
    }

    /**
     * District/Division
     * <p>
     * Lineage reference object : SHBCOMI_DICD_CODE, Lookup lineage reference object : gtvdicd
     * 
     */
    @JsonProperty("dicdCode")
    public String getDicdCode() {
        return dicdCode;
    }

    /**
     * District/Division
     * <p>
     * Lineage reference object : SHBCOMI_DICD_CODE, Lookup lineage reference object : gtvdicd
     * 
     */
    @JsonProperty("dicdCode")
    public void setDicdCode(String dicdCode) {
        this.dicdCode = dicdCode;
    }

    public CommitteeServiceInformation100PutRequest withDicdCode(String dicdCode) {
        this.dicdCode = dicdCode;
        return this;
    }

    /**
     * Date Dissolved
     * <p>
     * Lineage reference object : SHBCOMI_DISSOLVED_DATE
     * 
     */
    @JsonProperty("criteria.dissolvedDate")
    public Date getCriteriaDissolvedDate() {
        return criteriaDissolvedDate;
    }

    /**
     * Date Dissolved
     * <p>
     * Lineage reference object : SHBCOMI_DISSOLVED_DATE
     * 
     */
    @JsonProperty("criteria.dissolvedDate")
    public void setCriteriaDissolvedDate(Date criteriaDissolvedDate) {
        this.criteriaDissolvedDate = criteriaDissolvedDate;
    }

    public CommitteeServiceInformation100PutRequest withCriteriaDissolvedDate(Date criteriaDissolvedDate) {
        this.criteriaDissolvedDate = criteriaDissolvedDate;
        return this;
    }

    /**
     * Home College
     * <p>
     * Lineage reference object : SHBCOMI_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("criteria.collCode")
    public String getCriteriaCollCode() {
        return criteriaCollCode;
    }

    /**
     * Home College
     * <p>
     * Lineage reference object : SHBCOMI_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("criteria.collCode")
    public void setCriteriaCollCode(String criteriaCollCode) {
        this.criteriaCollCode = criteriaCollCode;
    }

    public CommitteeServiceInformation100PutRequest withCriteriaCollCode(String criteriaCollCode) {
        this.criteriaCollCode = criteriaCollCode;
        return this;
    }

    /**
     * Home Department
     * <p>
     * Lineage reference object : SHBCOMI_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("criteria.deptCode")
    public String getCriteriaDeptCode() {
        return criteriaDeptCode;
    }

    /**
     * Home Department
     * <p>
     * Lineage reference object : SHBCOMI_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("criteria.deptCode")
    public void setCriteriaDeptCode(String criteriaDeptCode) {
        this.criteriaDeptCode = criteriaDeptCode;
    }

    public CommitteeServiceInformation100PutRequest withCriteriaDeptCode(String criteriaDeptCode) {
        this.criteriaDeptCode = criteriaDeptCode;
        return this;
    }

    /**
     * Date Dissolved
     * <p>
     * Lineage reference object : SHBCOMI_DISSOLVED_DATE
     * 
     */
    @JsonProperty("dissolvedDate")
    public Date getDissolvedDate() {
        return dissolvedDate;
    }

    /**
     * Date Dissolved
     * <p>
     * Lineage reference object : SHBCOMI_DISSOLVED_DATE
     * 
     */
    @JsonProperty("dissolvedDate")
    public void setDissolvedDate(Date dissolvedDate) {
        this.dissolvedDate = dissolvedDate;
    }

    public CommitteeServiceInformation100PutRequest withDissolvedDate(Date dissolvedDate) {
        this.dissolvedDate = dissolvedDate;
        return this;
    }

    /**
     * Date Initiated
     * <p>
     * Lineage reference object : SHBCOMI_INITIATED_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.initiatedDate")
    public Date getCriteriaInitiatedDate() {
        return criteriaInitiatedDate;
    }

    /**
     * Date Initiated
     * <p>
     * Lineage reference object : SHBCOMI_INITIATED_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.initiatedDate")
    public void setCriteriaInitiatedDate(Date criteriaInitiatedDate) {
        this.criteriaInitiatedDate = criteriaInitiatedDate;
    }

    public CommitteeServiceInformation100PutRequest withCriteriaInitiatedDate(Date criteriaInitiatedDate) {
        this.criteriaInitiatedDate = criteriaInitiatedDate;
        return this;
    }

    /**
     * District/Division
     * <p>
     * Lineage reference object : SHBCOMI_DICD_CODE, Lookup lineage reference object : gtvdicd
     * 
     */
    @JsonProperty("criteria.dicdCode")
    public String getCriteriaDicdCode() {
        return criteriaDicdCode;
    }

    /**
     * District/Division
     * <p>
     * Lineage reference object : SHBCOMI_DICD_CODE, Lookup lineage reference object : gtvdicd
     * 
     */
    @JsonProperty("criteria.dicdCode")
    public void setCriteriaDicdCode(String criteriaDicdCode) {
        this.criteriaDicdCode = criteriaDicdCode;
    }

    public CommitteeServiceInformation100PutRequest withCriteriaDicdCode(String criteriaDicdCode) {
        this.criteriaDicdCode = criteriaDicdCode;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SHBCOMI_COMS_CODE, Lookup lineage reference object : stvcoms
     * (Required)
     * 
     */
    @JsonProperty("criteria.comsCode")
    public String getCriteriaComsCode() {
        return criteriaComsCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SHBCOMI_COMS_CODE, Lookup lineage reference object : stvcoms
     * (Required)
     * 
     */
    @JsonProperty("criteria.comsCode")
    public void setCriteriaComsCode(String criteriaComsCode) {
        this.criteriaComsCode = criteriaComsCode;
    }

    public CommitteeServiceInformation100PutRequest withCriteriaComsCode(String criteriaComsCode) {
        this.criteriaComsCode = criteriaComsCode;
        return this;
    }

    /**
     * Lineage reference object : SHBCOMI_DISSOLVED_IND
     * 
     */
    @JsonProperty("criteria.dissolvedInd")
    public String getCriteriaDissolvedInd() {
        return criteriaDissolvedInd;
    }

    /**
     * Lineage reference object : SHBCOMI_DISSOLVED_IND
     * 
     */
    @JsonProperty("criteria.dissolvedInd")
    public void setCriteriaDissolvedInd(String criteriaDissolvedInd) {
        this.criteriaDissolvedInd = criteriaDissolvedInd;
    }

    public CommitteeServiceInformation100PutRequest withCriteriaDissolvedInd(String criteriaDissolvedInd) {
        this.criteriaDissolvedInd = criteriaDissolvedInd;
        return this;
    }

    /**
     * Associated ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Associated ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public CommitteeServiceInformation100PutRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Committee/Service Type
     * <p>
     * Lineage reference object : shacomiComtCode, Lookup lineage reference object : stvcomt
     * (Required)
     * 
     */
    @JsonProperty("shacomiComtCode")
    public String getShacomiComtCode() {
        return shacomiComtCode;
    }

    /**
     * Committee/Service Type
     * <p>
     * Lineage reference object : shacomiComtCode, Lookup lineage reference object : stvcomt
     * (Required)
     * 
     */
    @JsonProperty("shacomiComtCode")
    public void setShacomiComtCode(String shacomiComtCode) {
        this.shacomiComtCode = shacomiComtCode;
    }

    public CommitteeServiceInformation100PutRequest withShacomiComtCode(String shacomiComtCode) {
        this.shacomiComtCode = shacomiComtCode;
        return this;
    }

    /**
     * Home College
     * <p>
     * Lineage reference object : SHBCOMI_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    public String getCollCode() {
        return collCode;
    }

    /**
     * Home College
     * <p>
     * Lineage reference object : SHBCOMI_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    public void setCollCode(String collCode) {
        this.collCode = collCode;
    }

    public CommitteeServiceInformation100PutRequest withCollCode(String collCode) {
        this.collCode = collCode;
        return this;
    }

    /**
     * Home Department
     * <p>
     * Lineage reference object : SHBCOMI_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * Home Department
     * <p>
     * Lineage reference object : SHBCOMI_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public CommitteeServiceInformation100PutRequest withDeptCode(String deptCode) {
        this.deptCode = deptCode;
        return this;
    }

    /**
     * Print on Transcript
     * <p>
     * Lineage reference object : SHBCOMI_TRANS_PRINT
     * 
     */
    @JsonProperty("transPrint")
    public String getTransPrint() {
        return transPrint;
    }

    /**
     * Print on Transcript
     * <p>
     * Lineage reference object : SHBCOMI_TRANS_PRINT
     * 
     */
    @JsonProperty("transPrint")
    public void setTransPrint(String transPrint) {
        this.transPrint = transPrint;
    }

    public CommitteeServiceInformation100PutRequest withTransPrint(String transPrint) {
        this.transPrint = transPrint;
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

    public CommitteeServiceInformation100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CommitteeServiceInformation100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("initiatedDate");
        sb.append('=');
        sb.append(((this.initiatedDate == null)?"<null>":this.initiatedDate));
        sb.append(',');
        sb.append("comsCode");
        sb.append('=');
        sb.append(((this.comsCode == null)?"<null>":this.comsCode));
        sb.append(',');
        sb.append("dissolvedInd");
        sb.append('=');
        sb.append(((this.dissolvedInd == null)?"<null>":this.dissolvedInd));
        sb.append(',');
        sb.append("criteriaTransPrint");
        sb.append('=');
        sb.append(((this.criteriaTransPrint == null)?"<null>":this.criteriaTransPrint));
        sb.append(',');
        sb.append("dicdCode");
        sb.append('=');
        sb.append(((this.dicdCode == null)?"<null>":this.dicdCode));
        sb.append(',');
        sb.append("criteriaDissolvedDate");
        sb.append('=');
        sb.append(((this.criteriaDissolvedDate == null)?"<null>":this.criteriaDissolvedDate));
        sb.append(',');
        sb.append("criteriaCollCode");
        sb.append('=');
        sb.append(((this.criteriaCollCode == null)?"<null>":this.criteriaCollCode));
        sb.append(',');
        sb.append("criteriaDeptCode");
        sb.append('=');
        sb.append(((this.criteriaDeptCode == null)?"<null>":this.criteriaDeptCode));
        sb.append(',');
        sb.append("dissolvedDate");
        sb.append('=');
        sb.append(((this.dissolvedDate == null)?"<null>":this.dissolvedDate));
        sb.append(',');
        sb.append("criteriaInitiatedDate");
        sb.append('=');
        sb.append(((this.criteriaInitiatedDate == null)?"<null>":this.criteriaInitiatedDate));
        sb.append(',');
        sb.append("criteriaDicdCode");
        sb.append('=');
        sb.append(((this.criteriaDicdCode == null)?"<null>":this.criteriaDicdCode));
        sb.append(',');
        sb.append("criteriaComsCode");
        sb.append('=');
        sb.append(((this.criteriaComsCode == null)?"<null>":this.criteriaComsCode));
        sb.append(',');
        sb.append("criteriaDissolvedInd");
        sb.append('=');
        sb.append(((this.criteriaDissolvedInd == null)?"<null>":this.criteriaDissolvedInd));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("shacomiComtCode");
        sb.append('=');
        sb.append(((this.shacomiComtCode == null)?"<null>":this.shacomiComtCode));
        sb.append(',');
        sb.append("collCode");
        sb.append('=');
        sb.append(((this.collCode == null)?"<null>":this.collCode));
        sb.append(',');
        sb.append("deptCode");
        sb.append('=');
        sb.append(((this.deptCode == null)?"<null>":this.deptCode));
        sb.append(',');
        sb.append("transPrint");
        sb.append('=');
        sb.append(((this.transPrint == null)?"<null>":this.transPrint));
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
        result = ((result* 31)+((this.initiatedDate == null)? 0 :this.initiatedDate.hashCode()));
        result = ((result* 31)+((this.criteriaDissolvedDate == null)? 0 :this.criteriaDissolvedDate.hashCode()));
        result = ((result* 31)+((this.comsCode == null)? 0 :this.comsCode.hashCode()));
        result = ((result* 31)+((this.dissolvedInd == null)? 0 :this.dissolvedInd.hashCode()));
        result = ((result* 31)+((this.dicdCode == null)? 0 :this.dicdCode.hashCode()));
        result = ((result* 31)+((this.criteriaDeptCode == null)? 0 :this.criteriaDeptCode.hashCode()));
        result = ((result* 31)+((this.dissolvedDate == null)? 0 :this.dissolvedDate.hashCode()));
        result = ((result* 31)+((this.criteriaDicdCode == null)? 0 :this.criteriaDicdCode.hashCode()));
        result = ((result* 31)+((this.criteriaDissolvedInd == null)? 0 :this.criteriaDissolvedInd.hashCode()));
        result = ((result* 31)+((this.criteriaInitiatedDate == null)? 0 :this.criteriaInitiatedDate.hashCode()));
        result = ((result* 31)+((this.criteriaCollCode == null)? 0 :this.criteriaCollCode.hashCode()));
        result = ((result* 31)+((this.criteriaComsCode == null)? 0 :this.criteriaComsCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.shacomiComtCode == null)? 0 :this.shacomiComtCode.hashCode()));
        result = ((result* 31)+((this.collCode == null)? 0 :this.collCode.hashCode()));
        result = ((result* 31)+((this.criteriaTransPrint == null)? 0 :this.criteriaTransPrint.hashCode()));
        result = ((result* 31)+((this.deptCode == null)? 0 :this.deptCode.hashCode()));
        result = ((result* 31)+((this.transPrint == null)? 0 :this.transPrint.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CommitteeServiceInformation100PutRequest) == false) {
            return false;
        }
        CommitteeServiceInformation100PutRequest rhs = ((CommitteeServiceInformation100PutRequest) other);
        return ((((((((((((((((((((this.initiatedDate == rhs.initiatedDate)||((this.initiatedDate!= null)&&this.initiatedDate.equals(rhs.initiatedDate)))&&((this.criteriaDissolvedDate == rhs.criteriaDissolvedDate)||((this.criteriaDissolvedDate!= null)&&this.criteriaDissolvedDate.equals(rhs.criteriaDissolvedDate))))&&((this.comsCode == rhs.comsCode)||((this.comsCode!= null)&&this.comsCode.equals(rhs.comsCode))))&&((this.dissolvedInd == rhs.dissolvedInd)||((this.dissolvedInd!= null)&&this.dissolvedInd.equals(rhs.dissolvedInd))))&&((this.dicdCode == rhs.dicdCode)||((this.dicdCode!= null)&&this.dicdCode.equals(rhs.dicdCode))))&&((this.criteriaDeptCode == rhs.criteriaDeptCode)||((this.criteriaDeptCode!= null)&&this.criteriaDeptCode.equals(rhs.criteriaDeptCode))))&&((this.dissolvedDate == rhs.dissolvedDate)||((this.dissolvedDate!= null)&&this.dissolvedDate.equals(rhs.dissolvedDate))))&&((this.criteriaDicdCode == rhs.criteriaDicdCode)||((this.criteriaDicdCode!= null)&&this.criteriaDicdCode.equals(rhs.criteriaDicdCode))))&&((this.criteriaDissolvedInd == rhs.criteriaDissolvedInd)||((this.criteriaDissolvedInd!= null)&&this.criteriaDissolvedInd.equals(rhs.criteriaDissolvedInd))))&&((this.criteriaInitiatedDate == rhs.criteriaInitiatedDate)||((this.criteriaInitiatedDate!= null)&&this.criteriaInitiatedDate.equals(rhs.criteriaInitiatedDate))))&&((this.criteriaCollCode == rhs.criteriaCollCode)||((this.criteriaCollCode!= null)&&this.criteriaCollCode.equals(rhs.criteriaCollCode))))&&((this.criteriaComsCode == rhs.criteriaComsCode)||((this.criteriaComsCode!= null)&&this.criteriaComsCode.equals(rhs.criteriaComsCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.shacomiComtCode == rhs.shacomiComtCode)||((this.shacomiComtCode!= null)&&this.shacomiComtCode.equals(rhs.shacomiComtCode))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.criteriaTransPrint == rhs.criteriaTransPrint)||((this.criteriaTransPrint!= null)&&this.criteriaTransPrint.equals(rhs.criteriaTransPrint))))&&((this.deptCode == rhs.deptCode)||((this.deptCode!= null)&&this.deptCode.equals(rhs.deptCode))))&&((this.transPrint == rhs.transPrint)||((this.transPrint!= null)&&this.transPrint.equals(rhs.transPrint))));
    }

}
