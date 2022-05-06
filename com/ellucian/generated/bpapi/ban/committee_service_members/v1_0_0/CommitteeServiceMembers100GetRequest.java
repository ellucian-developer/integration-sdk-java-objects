
package com.ellucian.generated.bpapi.ban.committee_service_members.v1_0_0;

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
    "fromDate",
    "comsCode",
    "toDate",
    "comfCode",
    "dicdCode",
    "id",
    "shacomiComtCode",
    "collCode",
    "deptCode",
    "memberId"
})
@Generated("jsonschema2pojo")
public class CommitteeServiceMembers100GetRequest {

    /**
     * Participation From
     * <p>
     * Lineage reference object : SHRCOMM_FROM_DATE
     * (Required)
     * 
     */
    @JsonProperty("fromDate")
    @JsonPropertyDescription("Lineage reference object : SHRCOMM_FROM_DATE")
    private Date fromDate;
    /**
     * Status
     * <p>
     * Lineage reference object : SHRCOMM_COMS_CODE, Lookup lineage reference object : stvcoms
     * 
     */
    @JsonProperty("comsCode")
    @JsonPropertyDescription("Lineage reference object : SHRCOMM_COMS_CODE, Lookup lineage reference object : stvcoms")
    private String comsCode;
    /**
     * Participation To
     * <p>
     * Lineage reference object : SHRCOMM_TO_DATE
     * (Required)
     * 
     */
    @JsonProperty("toDate")
    @JsonPropertyDescription("Lineage reference object : SHRCOMM_TO_DATE")
    private Date toDate;
    /**
     * Role
     * <p>
     * Lineage reference object : SHRCOMM_COMF_CODE, Lookup lineage reference object : stvcomf
     * 
     */
    @JsonProperty("comfCode")
    @JsonPropertyDescription("Lineage reference object : SHRCOMM_COMF_CODE, Lookup lineage reference object : stvcomf")
    private String comfCode;
    /**
     * District/Division
     * <p>
     * Lineage reference object : SHRCOMM_DICD_CODE, Lookup lineage reference object : gtvdicd
     * 
     */
    @JsonProperty("dicdCode")
    @JsonPropertyDescription("Lineage reference object : SHRCOMM_DICD_CODE, Lookup lineage reference object : gtvdicd")
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
     * Lineage reference object : SHRCOMM_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    @JsonPropertyDescription("Lineage reference object : SHRCOMM_COLL_CODE, Lookup lineage reference object : stvcoll")
    private String collCode;
    /**
     * Home Department
     * <p>
     * Lineage reference object : SHRCOMM_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    @JsonPropertyDescription("Lineage reference object : SHRCOMM_DEPT_CODE, Lookup lineage reference object : stvdept")
    private String deptCode;
    /**
     * Member
     * <p>
     * 
     * 
     */
    @JsonProperty("memberId")
    private String memberId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Participation From
     * <p>
     * Lineage reference object : SHRCOMM_FROM_DATE
     * (Required)
     * 
     */
    @JsonProperty("fromDate")
    public Date getFromDate() {
        return fromDate;
    }

    /**
     * Participation From
     * <p>
     * Lineage reference object : SHRCOMM_FROM_DATE
     * (Required)
     * 
     */
    @JsonProperty("fromDate")
    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public CommitteeServiceMembers100GetRequest withFromDate(Date fromDate) {
        this.fromDate = fromDate;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SHRCOMM_COMS_CODE, Lookup lineage reference object : stvcoms
     * 
     */
    @JsonProperty("comsCode")
    public String getComsCode() {
        return comsCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SHRCOMM_COMS_CODE, Lookup lineage reference object : stvcoms
     * 
     */
    @JsonProperty("comsCode")
    public void setComsCode(String comsCode) {
        this.comsCode = comsCode;
    }

    public CommitteeServiceMembers100GetRequest withComsCode(String comsCode) {
        this.comsCode = comsCode;
        return this;
    }

    /**
     * Participation To
     * <p>
     * Lineage reference object : SHRCOMM_TO_DATE
     * (Required)
     * 
     */
    @JsonProperty("toDate")
    public Date getToDate() {
        return toDate;
    }

    /**
     * Participation To
     * <p>
     * Lineage reference object : SHRCOMM_TO_DATE
     * (Required)
     * 
     */
    @JsonProperty("toDate")
    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public CommitteeServiceMembers100GetRequest withToDate(Date toDate) {
        this.toDate = toDate;
        return this;
    }

    /**
     * Role
     * <p>
     * Lineage reference object : SHRCOMM_COMF_CODE, Lookup lineage reference object : stvcomf
     * 
     */
    @JsonProperty("comfCode")
    public String getComfCode() {
        return comfCode;
    }

    /**
     * Role
     * <p>
     * Lineage reference object : SHRCOMM_COMF_CODE, Lookup lineage reference object : stvcomf
     * 
     */
    @JsonProperty("comfCode")
    public void setComfCode(String comfCode) {
        this.comfCode = comfCode;
    }

    public CommitteeServiceMembers100GetRequest withComfCode(String comfCode) {
        this.comfCode = comfCode;
        return this;
    }

    /**
     * District/Division
     * <p>
     * Lineage reference object : SHRCOMM_DICD_CODE, Lookup lineage reference object : gtvdicd
     * 
     */
    @JsonProperty("dicdCode")
    public String getDicdCode() {
        return dicdCode;
    }

    /**
     * District/Division
     * <p>
     * Lineage reference object : SHRCOMM_DICD_CODE, Lookup lineage reference object : gtvdicd
     * 
     */
    @JsonProperty("dicdCode")
    public void setDicdCode(String dicdCode) {
        this.dicdCode = dicdCode;
    }

    public CommitteeServiceMembers100GetRequest withDicdCode(String dicdCode) {
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

    public CommitteeServiceMembers100GetRequest withId(Object id) {
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

    public CommitteeServiceMembers100GetRequest withShacomiComtCode(Object shacomiComtCode) {
        this.shacomiComtCode = shacomiComtCode;
        return this;
    }

    /**
     * Home College
     * <p>
     * Lineage reference object : SHRCOMM_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    public String getCollCode() {
        return collCode;
    }

    /**
     * Home College
     * <p>
     * Lineage reference object : SHRCOMM_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    public void setCollCode(String collCode) {
        this.collCode = collCode;
    }

    public CommitteeServiceMembers100GetRequest withCollCode(String collCode) {
        this.collCode = collCode;
        return this;
    }

    /**
     * Home Department
     * <p>
     * Lineage reference object : SHRCOMM_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * Home Department
     * <p>
     * Lineage reference object : SHRCOMM_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public CommitteeServiceMembers100GetRequest withDeptCode(String deptCode) {
        this.deptCode = deptCode;
        return this;
    }

    /**
     * Member
     * <p>
     * 
     * 
     */
    @JsonProperty("memberId")
    public String getMemberId() {
        return memberId;
    }

    /**
     * Member
     * <p>
     * 
     * 
     */
    @JsonProperty("memberId")
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public CommitteeServiceMembers100GetRequest withMemberId(String memberId) {
        this.memberId = memberId;
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

    public CommitteeServiceMembers100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CommitteeServiceMembers100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fromDate");
        sb.append('=');
        sb.append(((this.fromDate == null)?"<null>":this.fromDate));
        sb.append(',');
        sb.append("comsCode");
        sb.append('=');
        sb.append(((this.comsCode == null)?"<null>":this.comsCode));
        sb.append(',');
        sb.append("toDate");
        sb.append('=');
        sb.append(((this.toDate == null)?"<null>":this.toDate));
        sb.append(',');
        sb.append("comfCode");
        sb.append('=');
        sb.append(((this.comfCode == null)?"<null>":this.comfCode));
        sb.append(',');
        sb.append("dicdCode");
        sb.append('=');
        sb.append(((this.dicdCode == null)?"<null>":this.dicdCode));
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
        sb.append("memberId");
        sb.append('=');
        sb.append(((this.memberId == null)?"<null>":this.memberId));
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
        result = ((result* 31)+((this.fromDate == null)? 0 :this.fromDate.hashCode()));
        result = ((result* 31)+((this.comsCode == null)? 0 :this.comsCode.hashCode()));
        result = ((result* 31)+((this.toDate == null)? 0 :this.toDate.hashCode()));
        result = ((result* 31)+((this.comfCode == null)? 0 :this.comfCode.hashCode()));
        result = ((result* 31)+((this.dicdCode == null)? 0 :this.dicdCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.shacomiComtCode == null)? 0 :this.shacomiComtCode.hashCode()));
        result = ((result* 31)+((this.collCode == null)? 0 :this.collCode.hashCode()));
        result = ((result* 31)+((this.deptCode == null)? 0 :this.deptCode.hashCode()));
        result = ((result* 31)+((this.memberId == null)? 0 :this.memberId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CommitteeServiceMembers100GetRequest) == false) {
            return false;
        }
        CommitteeServiceMembers100GetRequest rhs = ((CommitteeServiceMembers100GetRequest) other);
        return ((((((((((((this.fromDate == rhs.fromDate)||((this.fromDate!= null)&&this.fromDate.equals(rhs.fromDate)))&&((this.comsCode == rhs.comsCode)||((this.comsCode!= null)&&this.comsCode.equals(rhs.comsCode))))&&((this.toDate == rhs.toDate)||((this.toDate!= null)&&this.toDate.equals(rhs.toDate))))&&((this.comfCode == rhs.comfCode)||((this.comfCode!= null)&&this.comfCode.equals(rhs.comfCode))))&&((this.dicdCode == rhs.dicdCode)||((this.dicdCode!= null)&&this.dicdCode.equals(rhs.dicdCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.shacomiComtCode == rhs.shacomiComtCode)||((this.shacomiComtCode!= null)&&this.shacomiComtCode.equals(rhs.shacomiComtCode))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.deptCode == rhs.deptCode)||((this.deptCode!= null)&&this.deptCode.equals(rhs.deptCode))))&&((this.memberId == rhs.memberId)||((this.memberId!= null)&&this.memberId.equals(rhs.memberId))));
    }

}
