
package com.ellucian.generated.bpapi.ban.faculty_advisor_query.v1_0_0;

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
    "faclMi",
    "sirdpclCollCode",
    "sirdpclDeptCode",
    "faclFirstName",
    "faclSchdInd",
    "faclAdvrInd",
    "faclLastName",
    "faclDummy",
    "faclId"
})
@Generated("jsonschema2pojo")
public class FacultyAdvisorQuery100GetResponse {

    /**
     * Middle Name
     * <p>
     * 
     * 
     */
    @JsonProperty("faclMi")
    private String faclMi;
    /**
     * College
     * <p>
     * Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("sirdpclCollCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvcoll")
    private String sirdpclCollCode;
    /**
     * Department
     * <p>
     * Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("sirdpclDeptCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvdept")
    private String sirdpclDeptCode;
    /**
     * First Name
     * <p>
     * 
     * 
     */
    @JsonProperty("faclFirstName")
    private String faclFirstName;
    @JsonProperty("faclSchdInd")
    private String faclSchdInd;
    @JsonProperty("faclAdvrInd")
    private String faclAdvrInd;
    /**
     * Last Name
     * <p>
     * 
     * 
     */
    @JsonProperty("faclLastName")
    private String faclLastName;
    /**
     * Lookup lineage reference object : sirdpcl,sirdpcl
     * 
     */
    @JsonProperty("faclDummy")
    @JsonPropertyDescription("Lookup lineage reference object : sirdpcl,sirdpcl")
    private String faclDummy;
    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("faclId")
    private String faclId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Middle Name
     * <p>
     * 
     * 
     */
    @JsonProperty("faclMi")
    public String getFaclMi() {
        return faclMi;
    }

    /**
     * Middle Name
     * <p>
     * 
     * 
     */
    @JsonProperty("faclMi")
    public void setFaclMi(String faclMi) {
        this.faclMi = faclMi;
    }

    public FacultyAdvisorQuery100GetResponse withFaclMi(String faclMi) {
        this.faclMi = faclMi;
        return this;
    }

    /**
     * College
     * <p>
     * Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("sirdpclCollCode")
    public String getSirdpclCollCode() {
        return sirdpclCollCode;
    }

    /**
     * College
     * <p>
     * Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("sirdpclCollCode")
    public void setSirdpclCollCode(String sirdpclCollCode) {
        this.sirdpclCollCode = sirdpclCollCode;
    }

    public FacultyAdvisorQuery100GetResponse withSirdpclCollCode(String sirdpclCollCode) {
        this.sirdpclCollCode = sirdpclCollCode;
        return this;
    }

    /**
     * Department
     * <p>
     * Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("sirdpclDeptCode")
    public String getSirdpclDeptCode() {
        return sirdpclDeptCode;
    }

    /**
     * Department
     * <p>
     * Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("sirdpclDeptCode")
    public void setSirdpclDeptCode(String sirdpclDeptCode) {
        this.sirdpclDeptCode = sirdpclDeptCode;
    }

    public FacultyAdvisorQuery100GetResponse withSirdpclDeptCode(String sirdpclDeptCode) {
        this.sirdpclDeptCode = sirdpclDeptCode;
        return this;
    }

    /**
     * First Name
     * <p>
     * 
     * 
     */
    @JsonProperty("faclFirstName")
    public String getFaclFirstName() {
        return faclFirstName;
    }

    /**
     * First Name
     * <p>
     * 
     * 
     */
    @JsonProperty("faclFirstName")
    public void setFaclFirstName(String faclFirstName) {
        this.faclFirstName = faclFirstName;
    }

    public FacultyAdvisorQuery100GetResponse withFaclFirstName(String faclFirstName) {
        this.faclFirstName = faclFirstName;
        return this;
    }

    @JsonProperty("faclSchdInd")
    public String getFaclSchdInd() {
        return faclSchdInd;
    }

    @JsonProperty("faclSchdInd")
    public void setFaclSchdInd(String faclSchdInd) {
        this.faclSchdInd = faclSchdInd;
    }

    public FacultyAdvisorQuery100GetResponse withFaclSchdInd(String faclSchdInd) {
        this.faclSchdInd = faclSchdInd;
        return this;
    }

    @JsonProperty("faclAdvrInd")
    public String getFaclAdvrInd() {
        return faclAdvrInd;
    }

    @JsonProperty("faclAdvrInd")
    public void setFaclAdvrInd(String faclAdvrInd) {
        this.faclAdvrInd = faclAdvrInd;
    }

    public FacultyAdvisorQuery100GetResponse withFaclAdvrInd(String faclAdvrInd) {
        this.faclAdvrInd = faclAdvrInd;
        return this;
    }

    /**
     * Last Name
     * <p>
     * 
     * 
     */
    @JsonProperty("faclLastName")
    public String getFaclLastName() {
        return faclLastName;
    }

    /**
     * Last Name
     * <p>
     * 
     * 
     */
    @JsonProperty("faclLastName")
    public void setFaclLastName(String faclLastName) {
        this.faclLastName = faclLastName;
    }

    public FacultyAdvisorQuery100GetResponse withFaclLastName(String faclLastName) {
        this.faclLastName = faclLastName;
        return this;
    }

    /**
     * Lookup lineage reference object : sirdpcl,sirdpcl
     * 
     */
    @JsonProperty("faclDummy")
    public String getFaclDummy() {
        return faclDummy;
    }

    /**
     * Lookup lineage reference object : sirdpcl,sirdpcl
     * 
     */
    @JsonProperty("faclDummy")
    public void setFaclDummy(String faclDummy) {
        this.faclDummy = faclDummy;
    }

    public FacultyAdvisorQuery100GetResponse withFaclDummy(String faclDummy) {
        this.faclDummy = faclDummy;
        return this;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("faclId")
    public String getFaclId() {
        return faclId;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("faclId")
    public void setFaclId(String faclId) {
        this.faclId = faclId;
    }

    public FacultyAdvisorQuery100GetResponse withFaclId(String faclId) {
        this.faclId = faclId;
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

    public FacultyAdvisorQuery100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FacultyAdvisorQuery100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("faclMi");
        sb.append('=');
        sb.append(((this.faclMi == null)?"<null>":this.faclMi));
        sb.append(',');
        sb.append("sirdpclCollCode");
        sb.append('=');
        sb.append(((this.sirdpclCollCode == null)?"<null>":this.sirdpclCollCode));
        sb.append(',');
        sb.append("sirdpclDeptCode");
        sb.append('=');
        sb.append(((this.sirdpclDeptCode == null)?"<null>":this.sirdpclDeptCode));
        sb.append(',');
        sb.append("faclFirstName");
        sb.append('=');
        sb.append(((this.faclFirstName == null)?"<null>":this.faclFirstName));
        sb.append(',');
        sb.append("faclSchdInd");
        sb.append('=');
        sb.append(((this.faclSchdInd == null)?"<null>":this.faclSchdInd));
        sb.append(',');
        sb.append("faclAdvrInd");
        sb.append('=');
        sb.append(((this.faclAdvrInd == null)?"<null>":this.faclAdvrInd));
        sb.append(',');
        sb.append("faclLastName");
        sb.append('=');
        sb.append(((this.faclLastName == null)?"<null>":this.faclLastName));
        sb.append(',');
        sb.append("faclDummy");
        sb.append('=');
        sb.append(((this.faclDummy == null)?"<null>":this.faclDummy));
        sb.append(',');
        sb.append("faclId");
        sb.append('=');
        sb.append(((this.faclId == null)?"<null>":this.faclId));
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
        result = ((result* 31)+((this.faclMi == null)? 0 :this.faclMi.hashCode()));
        result = ((result* 31)+((this.sirdpclCollCode == null)? 0 :this.sirdpclCollCode.hashCode()));
        result = ((result* 31)+((this.sirdpclDeptCode == null)? 0 :this.sirdpclDeptCode.hashCode()));
        result = ((result* 31)+((this.faclFirstName == null)? 0 :this.faclFirstName.hashCode()));
        result = ((result* 31)+((this.faclSchdInd == null)? 0 :this.faclSchdInd.hashCode()));
        result = ((result* 31)+((this.faclAdvrInd == null)? 0 :this.faclAdvrInd.hashCode()));
        result = ((result* 31)+((this.faclLastName == null)? 0 :this.faclLastName.hashCode()));
        result = ((result* 31)+((this.faclDummy == null)? 0 :this.faclDummy.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.faclId == null)? 0 :this.faclId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FacultyAdvisorQuery100GetResponse) == false) {
            return false;
        }
        FacultyAdvisorQuery100GetResponse rhs = ((FacultyAdvisorQuery100GetResponse) other);
        return (((((((((((this.faclMi == rhs.faclMi)||((this.faclMi!= null)&&this.faclMi.equals(rhs.faclMi)))&&((this.sirdpclCollCode == rhs.sirdpclCollCode)||((this.sirdpclCollCode!= null)&&this.sirdpclCollCode.equals(rhs.sirdpclCollCode))))&&((this.sirdpclDeptCode == rhs.sirdpclDeptCode)||((this.sirdpclDeptCode!= null)&&this.sirdpclDeptCode.equals(rhs.sirdpclDeptCode))))&&((this.faclFirstName == rhs.faclFirstName)||((this.faclFirstName!= null)&&this.faclFirstName.equals(rhs.faclFirstName))))&&((this.faclSchdInd == rhs.faclSchdInd)||((this.faclSchdInd!= null)&&this.faclSchdInd.equals(rhs.faclSchdInd))))&&((this.faclAdvrInd == rhs.faclAdvrInd)||((this.faclAdvrInd!= null)&&this.faclAdvrInd.equals(rhs.faclAdvrInd))))&&((this.faclLastName == rhs.faclLastName)||((this.faclLastName!= null)&&this.faclLastName.equals(rhs.faclLastName))))&&((this.faclDummy == rhs.faclDummy)||((this.faclDummy!= null)&&this.faclDummy.equals(rhs.faclDummy))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.faclId == rhs.faclId)||((this.faclId!= null)&&this.faclId.equals(rhs.faclId))));
    }

}
