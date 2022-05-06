
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
    "comfDescription",
    "dicdDesc",
    "comsCode",
    "dicdCode",
    "toDate",
    "memberName",
    "collDescription",
    "comsDescription",
    "deptDescription",
    "fromDate",
    "comfCode",
    "collCode",
    "deptCode",
    "memberId"
})
@Generated("jsonschema2pojo")
public class CommitteeServiceMembers100GetResponse {

    /**
     * Role Description
     * <p>
     * 
     * 
     */
    @JsonProperty("comfDescription")
    private String comfDescription;
    @JsonProperty("dicdDesc")
    private String dicdDesc;
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
     * District/Division
     * <p>
     * Lineage reference object : SHRCOMM_DICD_CODE, Lookup lineage reference object : gtvdicd
     * 
     */
    @JsonProperty("dicdCode")
    @JsonPropertyDescription("Lineage reference object : SHRCOMM_DICD_CODE, Lookup lineage reference object : gtvdicd")
    private String dicdCode;
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
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("memberName")
    private String memberName;
    /**
     * Home College Description
     * <p>
     * 
     * 
     */
    @JsonProperty("collDescription")
    private String collDescription;
    /**
     * Status Description
     * <p>
     * 
     * 
     */
    @JsonProperty("comsDescription")
    private String comsDescription;
    /**
     * Home Department Description
     * <p>
     * 
     * 
     */
    @JsonProperty("deptDescription")
    private String deptDescription;
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
     * Role
     * <p>
     * Lineage reference object : SHRCOMM_COMF_CODE, Lookup lineage reference object : stvcomf
     * 
     */
    @JsonProperty("comfCode")
    @JsonPropertyDescription("Lineage reference object : SHRCOMM_COMF_CODE, Lookup lineage reference object : stvcomf")
    private String comfCode;
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
     * Role Description
     * <p>
     * 
     * 
     */
    @JsonProperty("comfDescription")
    public String getComfDescription() {
        return comfDescription;
    }

    /**
     * Role Description
     * <p>
     * 
     * 
     */
    @JsonProperty("comfDescription")
    public void setComfDescription(String comfDescription) {
        this.comfDescription = comfDescription;
    }

    public CommitteeServiceMembers100GetResponse withComfDescription(String comfDescription) {
        this.comfDescription = comfDescription;
        return this;
    }

    @JsonProperty("dicdDesc")
    public String getDicdDesc() {
        return dicdDesc;
    }

    @JsonProperty("dicdDesc")
    public void setDicdDesc(String dicdDesc) {
        this.dicdDesc = dicdDesc;
    }

    public CommitteeServiceMembers100GetResponse withDicdDesc(String dicdDesc) {
        this.dicdDesc = dicdDesc;
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

    public CommitteeServiceMembers100GetResponse withComsCode(String comsCode) {
        this.comsCode = comsCode;
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

    public CommitteeServiceMembers100GetResponse withDicdCode(String dicdCode) {
        this.dicdCode = dicdCode;
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

    public CommitteeServiceMembers100GetResponse withToDate(Date toDate) {
        this.toDate = toDate;
        return this;
    }

    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("memberName")
    public String getMemberName() {
        return memberName;
    }

    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("memberName")
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public CommitteeServiceMembers100GetResponse withMemberName(String memberName) {
        this.memberName = memberName;
        return this;
    }

    /**
     * Home College Description
     * <p>
     * 
     * 
     */
    @JsonProperty("collDescription")
    public String getCollDescription() {
        return collDescription;
    }

    /**
     * Home College Description
     * <p>
     * 
     * 
     */
    @JsonProperty("collDescription")
    public void setCollDescription(String collDescription) {
        this.collDescription = collDescription;
    }

    public CommitteeServiceMembers100GetResponse withCollDescription(String collDescription) {
        this.collDescription = collDescription;
        return this;
    }

    /**
     * Status Description
     * <p>
     * 
     * 
     */
    @JsonProperty("comsDescription")
    public String getComsDescription() {
        return comsDescription;
    }

    /**
     * Status Description
     * <p>
     * 
     * 
     */
    @JsonProperty("comsDescription")
    public void setComsDescription(String comsDescription) {
        this.comsDescription = comsDescription;
    }

    public CommitteeServiceMembers100GetResponse withComsDescription(String comsDescription) {
        this.comsDescription = comsDescription;
        return this;
    }

    /**
     * Home Department Description
     * <p>
     * 
     * 
     */
    @JsonProperty("deptDescription")
    public String getDeptDescription() {
        return deptDescription;
    }

    /**
     * Home Department Description
     * <p>
     * 
     * 
     */
    @JsonProperty("deptDescription")
    public void setDeptDescription(String deptDescription) {
        this.deptDescription = deptDescription;
    }

    public CommitteeServiceMembers100GetResponse withDeptDescription(String deptDescription) {
        this.deptDescription = deptDescription;
        return this;
    }

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

    public CommitteeServiceMembers100GetResponse withFromDate(Date fromDate) {
        this.fromDate = fromDate;
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

    public CommitteeServiceMembers100GetResponse withComfCode(String comfCode) {
        this.comfCode = comfCode;
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

    public CommitteeServiceMembers100GetResponse withCollCode(String collCode) {
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

    public CommitteeServiceMembers100GetResponse withDeptCode(String deptCode) {
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

    public CommitteeServiceMembers100GetResponse withMemberId(String memberId) {
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

    public CommitteeServiceMembers100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CommitteeServiceMembers100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("comfDescription");
        sb.append('=');
        sb.append(((this.comfDescription == null)?"<null>":this.comfDescription));
        sb.append(',');
        sb.append("dicdDesc");
        sb.append('=');
        sb.append(((this.dicdDesc == null)?"<null>":this.dicdDesc));
        sb.append(',');
        sb.append("comsCode");
        sb.append('=');
        sb.append(((this.comsCode == null)?"<null>":this.comsCode));
        sb.append(',');
        sb.append("dicdCode");
        sb.append('=');
        sb.append(((this.dicdCode == null)?"<null>":this.dicdCode));
        sb.append(',');
        sb.append("toDate");
        sb.append('=');
        sb.append(((this.toDate == null)?"<null>":this.toDate));
        sb.append(',');
        sb.append("memberName");
        sb.append('=');
        sb.append(((this.memberName == null)?"<null>":this.memberName));
        sb.append(',');
        sb.append("collDescription");
        sb.append('=');
        sb.append(((this.collDescription == null)?"<null>":this.collDescription));
        sb.append(',');
        sb.append("comsDescription");
        sb.append('=');
        sb.append(((this.comsDescription == null)?"<null>":this.comsDescription));
        sb.append(',');
        sb.append("deptDescription");
        sb.append('=');
        sb.append(((this.deptDescription == null)?"<null>":this.deptDescription));
        sb.append(',');
        sb.append("fromDate");
        sb.append('=');
        sb.append(((this.fromDate == null)?"<null>":this.fromDate));
        sb.append(',');
        sb.append("comfCode");
        sb.append('=');
        sb.append(((this.comfCode == null)?"<null>":this.comfCode));
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
        result = ((result* 31)+((this.comfDescription == null)? 0 :this.comfDescription.hashCode()));
        result = ((result* 31)+((this.dicdDesc == null)? 0 :this.dicdDesc.hashCode()));
        result = ((result* 31)+((this.comsCode == null)? 0 :this.comsCode.hashCode()));
        result = ((result* 31)+((this.dicdCode == null)? 0 :this.dicdCode.hashCode()));
        result = ((result* 31)+((this.toDate == null)? 0 :this.toDate.hashCode()));
        result = ((result* 31)+((this.memberName == null)? 0 :this.memberName.hashCode()));
        result = ((result* 31)+((this.collDescription == null)? 0 :this.collDescription.hashCode()));
        result = ((result* 31)+((this.comsDescription == null)? 0 :this.comsDescription.hashCode()));
        result = ((result* 31)+((this.deptDescription == null)? 0 :this.deptDescription.hashCode()));
        result = ((result* 31)+((this.fromDate == null)? 0 :this.fromDate.hashCode()));
        result = ((result* 31)+((this.comfCode == null)? 0 :this.comfCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
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
        if ((other instanceof CommitteeServiceMembers100GetResponse) == false) {
            return false;
        }
        CommitteeServiceMembers100GetResponse rhs = ((CommitteeServiceMembers100GetResponse) other);
        return ((((((((((((((((this.comfDescription == rhs.comfDescription)||((this.comfDescription!= null)&&this.comfDescription.equals(rhs.comfDescription)))&&((this.dicdDesc == rhs.dicdDesc)||((this.dicdDesc!= null)&&this.dicdDesc.equals(rhs.dicdDesc))))&&((this.comsCode == rhs.comsCode)||((this.comsCode!= null)&&this.comsCode.equals(rhs.comsCode))))&&((this.dicdCode == rhs.dicdCode)||((this.dicdCode!= null)&&this.dicdCode.equals(rhs.dicdCode))))&&((this.toDate == rhs.toDate)||((this.toDate!= null)&&this.toDate.equals(rhs.toDate))))&&((this.memberName == rhs.memberName)||((this.memberName!= null)&&this.memberName.equals(rhs.memberName))))&&((this.collDescription == rhs.collDescription)||((this.collDescription!= null)&&this.collDescription.equals(rhs.collDescription))))&&((this.comsDescription == rhs.comsDescription)||((this.comsDescription!= null)&&this.comsDescription.equals(rhs.comsDescription))))&&((this.deptDescription == rhs.deptDescription)||((this.deptDescription!= null)&&this.deptDescription.equals(rhs.deptDescription))))&&((this.fromDate == rhs.fromDate)||((this.fromDate!= null)&&this.fromDate.equals(rhs.fromDate))))&&((this.comfCode == rhs.comfCode)||((this.comfCode!= null)&&this.comfCode.equals(rhs.comfCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.deptCode == rhs.deptCode)||((this.deptCode!= null)&&this.deptCode.equals(rhs.deptCode))))&&((this.memberId == rhs.memberId)||((this.memberId!= null)&&this.memberId.equals(rhs.memberId))));
    }

}
