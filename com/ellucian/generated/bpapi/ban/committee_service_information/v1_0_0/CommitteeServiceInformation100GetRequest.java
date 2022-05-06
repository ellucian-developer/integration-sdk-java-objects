
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
    "dicdCode",
    "id",
    "dissolvedDate",
    "shacomiComtCode",
    "collCode",
    "deptCode",
    "transPrint"
})
@Generated("jsonschema2pojo")
public class CommitteeServiceInformation100GetRequest {

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
     * District/Division
     * <p>
     * Lineage reference object : SHBCOMI_DICD_CODE, Lookup lineage reference object : gtvdicd
     * 
     */
    @JsonProperty("dicdCode")
    @JsonPropertyDescription("Lineage reference object : SHBCOMI_DICD_CODE, Lookup lineage reference object : gtvdicd")
    private String dicdCode;
    /**
     * Associated ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
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
     * Committee/Service Type
     * <p>
     * Lineage reference object : shacomiComtCode, Lookup lineage reference object : stvcomt
     * (Required)
     * 
     */
    @JsonProperty("shacomiComtCode")
    @JsonPropertyDescription("Lineage reference object : shacomiComtCode, Lookup lineage reference object : stvcomt")
    private Object shacomiComtCode;
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

    public CommitteeServiceInformation100GetRequest withInitiatedDate(Date initiatedDate) {
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

    public CommitteeServiceInformation100GetRequest withComsCode(String comsCode) {
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

    public CommitteeServiceInformation100GetRequest withDissolvedInd(String dissolvedInd) {
        this.dissolvedInd = dissolvedInd;
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

    public CommitteeServiceInformation100GetRequest withDicdCode(String dicdCode) {
        this.dicdCode = dicdCode;
        return this;
    }

    /**
     * Associated ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * Associated ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public CommitteeServiceInformation100GetRequest withId(Object id) {
        this.id = id;
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

    public CommitteeServiceInformation100GetRequest withDissolvedDate(Date dissolvedDate) {
        this.dissolvedDate = dissolvedDate;
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
    public Object getShacomiComtCode() {
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
    public void setShacomiComtCode(Object shacomiComtCode) {
        this.shacomiComtCode = shacomiComtCode;
    }

    public CommitteeServiceInformation100GetRequest withShacomiComtCode(Object shacomiComtCode) {
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

    public CommitteeServiceInformation100GetRequest withCollCode(String collCode) {
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

    public CommitteeServiceInformation100GetRequest withDeptCode(String deptCode) {
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

    public CommitteeServiceInformation100GetRequest withTransPrint(String transPrint) {
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

    public CommitteeServiceInformation100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CommitteeServiceInformation100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("dicdCode");
        sb.append('=');
        sb.append(((this.dicdCode == null)?"<null>":this.dicdCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("dissolvedDate");
        sb.append('=');
        sb.append(((this.dissolvedDate == null)?"<null>":this.dissolvedDate));
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
        result = ((result* 31)+((this.comsCode == null)? 0 :this.comsCode.hashCode()));
        result = ((result* 31)+((this.dissolvedInd == null)? 0 :this.dissolvedInd.hashCode()));
        result = ((result* 31)+((this.dicdCode == null)? 0 :this.dicdCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.dissolvedDate == null)? 0 :this.dissolvedDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.shacomiComtCode == null)? 0 :this.shacomiComtCode.hashCode()));
        result = ((result* 31)+((this.collCode == null)? 0 :this.collCode.hashCode()));
        result = ((result* 31)+((this.deptCode == null)? 0 :this.deptCode.hashCode()));
        result = ((result* 31)+((this.transPrint == null)? 0 :this.transPrint.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CommitteeServiceInformation100GetRequest) == false) {
            return false;
        }
        CommitteeServiceInformation100GetRequest rhs = ((CommitteeServiceInformation100GetRequest) other);
        return ((((((((((((this.initiatedDate == rhs.initiatedDate)||((this.initiatedDate!= null)&&this.initiatedDate.equals(rhs.initiatedDate)))&&((this.comsCode == rhs.comsCode)||((this.comsCode!= null)&&this.comsCode.equals(rhs.comsCode))))&&((this.dissolvedInd == rhs.dissolvedInd)||((this.dissolvedInd!= null)&&this.dissolvedInd.equals(rhs.dissolvedInd))))&&((this.dicdCode == rhs.dicdCode)||((this.dicdCode!= null)&&this.dicdCode.equals(rhs.dicdCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.dissolvedDate == rhs.dissolvedDate)||((this.dissolvedDate!= null)&&this.dissolvedDate.equals(rhs.dissolvedDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.shacomiComtCode == rhs.shacomiComtCode)||((this.shacomiComtCode!= null)&&this.shacomiComtCode.equals(rhs.shacomiComtCode))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.deptCode == rhs.deptCode)||((this.deptCode!= null)&&this.deptCode.equals(rhs.deptCode))))&&((this.transPrint == rhs.transPrint)||((this.transPrint!= null)&&this.transPrint.equals(rhs.transPrint))));
    }

}
