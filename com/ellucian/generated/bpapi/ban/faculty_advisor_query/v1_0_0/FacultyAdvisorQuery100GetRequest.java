
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
    "keyblckFcstCode",
    "sirdpclDeptCode",
    "keyblckTenrCode",
    "keyblckTermCode",
    "keyblckAdvrInd",
    "faclSchdInd",
    "faclLastName",
    "faclAdvrInd",
    "faclId",
    "faclMi",
    "sirdpclCollCode",
    "keyblckFctgCode",
    "keyblckSchdInd",
    "faclFirstName",
    "keyblckFstpCode",
    "faclDummy"
})
@Generated("jsonschema2pojo")
public class FacultyAdvisorQuery100GetRequest {

    /**
     * Status
     * <p>
     * Lineage reference object : keyblckFcstCode, Lookup lineage reference object : stvfcst
     * 
     */
    @JsonProperty("keyblckFcstCode")
    @JsonPropertyDescription("Lineage reference object : keyblckFcstCode, Lookup lineage reference object : stvfcst")
    private String keyblckFcstCode;
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
     * Tenure Status
     * <p>
     * Lineage reference object : keyblckTenrCode
     * 
     */
    @JsonProperty("keyblckTenrCode")
    @JsonPropertyDescription("Lineage reference object : keyblckTenrCode")
    private String keyblckTenrCode;
    /**
     * Term
     * <p>
     * Lineage reference object : keyblckTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblckTermCode")
    @JsonPropertyDescription("Lineage reference object : keyblckTermCode, Lookup lineage reference object : stvterm")
    private String keyblckTermCode;
    /**
     * Advisor
     * <p>
     * Lineage reference object : keyblckAdvrInd
     * 
     */
    @JsonProperty("keyblckAdvrInd")
    @JsonPropertyDescription("Lineage reference object : keyblckAdvrInd")
    private String keyblckAdvrInd;
    @JsonProperty("faclSchdInd")
    private String faclSchdInd;
    /**
     * Last Name
     * <p>
     * 
     * 
     */
    @JsonProperty("faclLastName")
    private String faclLastName;
    @JsonProperty("faclAdvrInd")
    private String faclAdvrInd;
    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("faclId")
    private String faclId;
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
     * Category
     * <p>
     * Lineage reference object : keyblckFctgCode, Lookup lineage reference object : stvfctg
     * 
     */
    @JsonProperty("keyblckFctgCode")
    @JsonPropertyDescription("Lineage reference object : keyblckFctgCode, Lookup lineage reference object : stvfctg")
    private String keyblckFctgCode;
    /**
     * Faculty
     * <p>
     * Lineage reference object : keyblckSchdInd
     * 
     */
    @JsonProperty("keyblckSchdInd")
    @JsonPropertyDescription("Lineage reference object : keyblckSchdInd")
    private String keyblckSchdInd;
    /**
     * First Name
     * <p>
     * 
     * 
     */
    @JsonProperty("faclFirstName")
    private String faclFirstName;
    /**
     * Staff Type
     * <p>
     * Lineage reference object : keyblckFstpCode, Lookup lineage reference object : stvfstp
     * 
     */
    @JsonProperty("keyblckFstpCode")
    @JsonPropertyDescription("Lineage reference object : keyblckFstpCode, Lookup lineage reference object : stvfstp")
    private String keyblckFstpCode;
    /**
     * Lookup lineage reference object : sirdpcl,sirdpcl
     * 
     */
    @JsonProperty("faclDummy")
    @JsonPropertyDescription("Lookup lineage reference object : sirdpcl,sirdpcl")
    private String faclDummy;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Status
     * <p>
     * Lineage reference object : keyblckFcstCode, Lookup lineage reference object : stvfcst
     * 
     */
    @JsonProperty("keyblckFcstCode")
    public String getKeyblckFcstCode() {
        return keyblckFcstCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : keyblckFcstCode, Lookup lineage reference object : stvfcst
     * 
     */
    @JsonProperty("keyblckFcstCode")
    public void setKeyblckFcstCode(String keyblckFcstCode) {
        this.keyblckFcstCode = keyblckFcstCode;
    }

    public FacultyAdvisorQuery100GetRequest withKeyblckFcstCode(String keyblckFcstCode) {
        this.keyblckFcstCode = keyblckFcstCode;
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

    public FacultyAdvisorQuery100GetRequest withSirdpclDeptCode(String sirdpclDeptCode) {
        this.sirdpclDeptCode = sirdpclDeptCode;
        return this;
    }

    /**
     * Tenure Status
     * <p>
     * Lineage reference object : keyblckTenrCode
     * 
     */
    @JsonProperty("keyblckTenrCode")
    public String getKeyblckTenrCode() {
        return keyblckTenrCode;
    }

    /**
     * Tenure Status
     * <p>
     * Lineage reference object : keyblckTenrCode
     * 
     */
    @JsonProperty("keyblckTenrCode")
    public void setKeyblckTenrCode(String keyblckTenrCode) {
        this.keyblckTenrCode = keyblckTenrCode;
    }

    public FacultyAdvisorQuery100GetRequest withKeyblckTenrCode(String keyblckTenrCode) {
        this.keyblckTenrCode = keyblckTenrCode;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblckTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblckTermCode")
    public String getKeyblckTermCode() {
        return keyblckTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblckTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblckTermCode")
    public void setKeyblckTermCode(String keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
    }

    public FacultyAdvisorQuery100GetRequest withKeyblckTermCode(String keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
        return this;
    }

    /**
     * Advisor
     * <p>
     * Lineage reference object : keyblckAdvrInd
     * 
     */
    @JsonProperty("keyblckAdvrInd")
    public String getKeyblckAdvrInd() {
        return keyblckAdvrInd;
    }

    /**
     * Advisor
     * <p>
     * Lineage reference object : keyblckAdvrInd
     * 
     */
    @JsonProperty("keyblckAdvrInd")
    public void setKeyblckAdvrInd(String keyblckAdvrInd) {
        this.keyblckAdvrInd = keyblckAdvrInd;
    }

    public FacultyAdvisorQuery100GetRequest withKeyblckAdvrInd(String keyblckAdvrInd) {
        this.keyblckAdvrInd = keyblckAdvrInd;
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

    public FacultyAdvisorQuery100GetRequest withFaclSchdInd(String faclSchdInd) {
        this.faclSchdInd = faclSchdInd;
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

    public FacultyAdvisorQuery100GetRequest withFaclLastName(String faclLastName) {
        this.faclLastName = faclLastName;
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

    public FacultyAdvisorQuery100GetRequest withFaclAdvrInd(String faclAdvrInd) {
        this.faclAdvrInd = faclAdvrInd;
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

    public FacultyAdvisorQuery100GetRequest withFaclId(String faclId) {
        this.faclId = faclId;
        return this;
    }

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

    public FacultyAdvisorQuery100GetRequest withFaclMi(String faclMi) {
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

    public FacultyAdvisorQuery100GetRequest withSirdpclCollCode(String sirdpclCollCode) {
        this.sirdpclCollCode = sirdpclCollCode;
        return this;
    }

    /**
     * Category
     * <p>
     * Lineage reference object : keyblckFctgCode, Lookup lineage reference object : stvfctg
     * 
     */
    @JsonProperty("keyblckFctgCode")
    public String getKeyblckFctgCode() {
        return keyblckFctgCode;
    }

    /**
     * Category
     * <p>
     * Lineage reference object : keyblckFctgCode, Lookup lineage reference object : stvfctg
     * 
     */
    @JsonProperty("keyblckFctgCode")
    public void setKeyblckFctgCode(String keyblckFctgCode) {
        this.keyblckFctgCode = keyblckFctgCode;
    }

    public FacultyAdvisorQuery100GetRequest withKeyblckFctgCode(String keyblckFctgCode) {
        this.keyblckFctgCode = keyblckFctgCode;
        return this;
    }

    /**
     * Faculty
     * <p>
     * Lineage reference object : keyblckSchdInd
     * 
     */
    @JsonProperty("keyblckSchdInd")
    public String getKeyblckSchdInd() {
        return keyblckSchdInd;
    }

    /**
     * Faculty
     * <p>
     * Lineage reference object : keyblckSchdInd
     * 
     */
    @JsonProperty("keyblckSchdInd")
    public void setKeyblckSchdInd(String keyblckSchdInd) {
        this.keyblckSchdInd = keyblckSchdInd;
    }

    public FacultyAdvisorQuery100GetRequest withKeyblckSchdInd(String keyblckSchdInd) {
        this.keyblckSchdInd = keyblckSchdInd;
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

    public FacultyAdvisorQuery100GetRequest withFaclFirstName(String faclFirstName) {
        this.faclFirstName = faclFirstName;
        return this;
    }

    /**
     * Staff Type
     * <p>
     * Lineage reference object : keyblckFstpCode, Lookup lineage reference object : stvfstp
     * 
     */
    @JsonProperty("keyblckFstpCode")
    public String getKeyblckFstpCode() {
        return keyblckFstpCode;
    }

    /**
     * Staff Type
     * <p>
     * Lineage reference object : keyblckFstpCode, Lookup lineage reference object : stvfstp
     * 
     */
    @JsonProperty("keyblckFstpCode")
    public void setKeyblckFstpCode(String keyblckFstpCode) {
        this.keyblckFstpCode = keyblckFstpCode;
    }

    public FacultyAdvisorQuery100GetRequest withKeyblckFstpCode(String keyblckFstpCode) {
        this.keyblckFstpCode = keyblckFstpCode;
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

    public FacultyAdvisorQuery100GetRequest withFaclDummy(String faclDummy) {
        this.faclDummy = faclDummy;
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

    public FacultyAdvisorQuery100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FacultyAdvisorQuery100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblckFcstCode");
        sb.append('=');
        sb.append(((this.keyblckFcstCode == null)?"<null>":this.keyblckFcstCode));
        sb.append(',');
        sb.append("sirdpclDeptCode");
        sb.append('=');
        sb.append(((this.sirdpclDeptCode == null)?"<null>":this.sirdpclDeptCode));
        sb.append(',');
        sb.append("keyblckTenrCode");
        sb.append('=');
        sb.append(((this.keyblckTenrCode == null)?"<null>":this.keyblckTenrCode));
        sb.append(',');
        sb.append("keyblckTermCode");
        sb.append('=');
        sb.append(((this.keyblckTermCode == null)?"<null>":this.keyblckTermCode));
        sb.append(',');
        sb.append("keyblckAdvrInd");
        sb.append('=');
        sb.append(((this.keyblckAdvrInd == null)?"<null>":this.keyblckAdvrInd));
        sb.append(',');
        sb.append("faclSchdInd");
        sb.append('=');
        sb.append(((this.faclSchdInd == null)?"<null>":this.faclSchdInd));
        sb.append(',');
        sb.append("faclLastName");
        sb.append('=');
        sb.append(((this.faclLastName == null)?"<null>":this.faclLastName));
        sb.append(',');
        sb.append("faclAdvrInd");
        sb.append('=');
        sb.append(((this.faclAdvrInd == null)?"<null>":this.faclAdvrInd));
        sb.append(',');
        sb.append("faclId");
        sb.append('=');
        sb.append(((this.faclId == null)?"<null>":this.faclId));
        sb.append(',');
        sb.append("faclMi");
        sb.append('=');
        sb.append(((this.faclMi == null)?"<null>":this.faclMi));
        sb.append(',');
        sb.append("sirdpclCollCode");
        sb.append('=');
        sb.append(((this.sirdpclCollCode == null)?"<null>":this.sirdpclCollCode));
        sb.append(',');
        sb.append("keyblckFctgCode");
        sb.append('=');
        sb.append(((this.keyblckFctgCode == null)?"<null>":this.keyblckFctgCode));
        sb.append(',');
        sb.append("keyblckSchdInd");
        sb.append('=');
        sb.append(((this.keyblckSchdInd == null)?"<null>":this.keyblckSchdInd));
        sb.append(',');
        sb.append("faclFirstName");
        sb.append('=');
        sb.append(((this.faclFirstName == null)?"<null>":this.faclFirstName));
        sb.append(',');
        sb.append("keyblckFstpCode");
        sb.append('=');
        sb.append(((this.keyblckFstpCode == null)?"<null>":this.keyblckFstpCode));
        sb.append(',');
        sb.append("faclDummy");
        sb.append('=');
        sb.append(((this.faclDummy == null)?"<null>":this.faclDummy));
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
        result = ((result* 31)+((this.keyblckFcstCode == null)? 0 :this.keyblckFcstCode.hashCode()));
        result = ((result* 31)+((this.sirdpclDeptCode == null)? 0 :this.sirdpclDeptCode.hashCode()));
        result = ((result* 31)+((this.keyblckTenrCode == null)? 0 :this.keyblckTenrCode.hashCode()));
        result = ((result* 31)+((this.keyblckTermCode == null)? 0 :this.keyblckTermCode.hashCode()));
        result = ((result* 31)+((this.keyblckAdvrInd == null)? 0 :this.keyblckAdvrInd.hashCode()));
        result = ((result* 31)+((this.faclSchdInd == null)? 0 :this.faclSchdInd.hashCode()));
        result = ((result* 31)+((this.faclLastName == null)? 0 :this.faclLastName.hashCode()));
        result = ((result* 31)+((this.faclAdvrInd == null)? 0 :this.faclAdvrInd.hashCode()));
        result = ((result* 31)+((this.faclId == null)? 0 :this.faclId.hashCode()));
        result = ((result* 31)+((this.faclMi == null)? 0 :this.faclMi.hashCode()));
        result = ((result* 31)+((this.sirdpclCollCode == null)? 0 :this.sirdpclCollCode.hashCode()));
        result = ((result* 31)+((this.keyblckFctgCode == null)? 0 :this.keyblckFctgCode.hashCode()));
        result = ((result* 31)+((this.keyblckSchdInd == null)? 0 :this.keyblckSchdInd.hashCode()));
        result = ((result* 31)+((this.faclFirstName == null)? 0 :this.faclFirstName.hashCode()));
        result = ((result* 31)+((this.keyblckFstpCode == null)? 0 :this.keyblckFstpCode.hashCode()));
        result = ((result* 31)+((this.faclDummy == null)? 0 :this.faclDummy.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FacultyAdvisorQuery100GetRequest) == false) {
            return false;
        }
        FacultyAdvisorQuery100GetRequest rhs = ((FacultyAdvisorQuery100GetRequest) other);
        return ((((((((((((((((((this.keyblckFcstCode == rhs.keyblckFcstCode)||((this.keyblckFcstCode!= null)&&this.keyblckFcstCode.equals(rhs.keyblckFcstCode)))&&((this.sirdpclDeptCode == rhs.sirdpclDeptCode)||((this.sirdpclDeptCode!= null)&&this.sirdpclDeptCode.equals(rhs.sirdpclDeptCode))))&&((this.keyblckTenrCode == rhs.keyblckTenrCode)||((this.keyblckTenrCode!= null)&&this.keyblckTenrCode.equals(rhs.keyblckTenrCode))))&&((this.keyblckTermCode == rhs.keyblckTermCode)||((this.keyblckTermCode!= null)&&this.keyblckTermCode.equals(rhs.keyblckTermCode))))&&((this.keyblckAdvrInd == rhs.keyblckAdvrInd)||((this.keyblckAdvrInd!= null)&&this.keyblckAdvrInd.equals(rhs.keyblckAdvrInd))))&&((this.faclSchdInd == rhs.faclSchdInd)||((this.faclSchdInd!= null)&&this.faclSchdInd.equals(rhs.faclSchdInd))))&&((this.faclLastName == rhs.faclLastName)||((this.faclLastName!= null)&&this.faclLastName.equals(rhs.faclLastName))))&&((this.faclAdvrInd == rhs.faclAdvrInd)||((this.faclAdvrInd!= null)&&this.faclAdvrInd.equals(rhs.faclAdvrInd))))&&((this.faclId == rhs.faclId)||((this.faclId!= null)&&this.faclId.equals(rhs.faclId))))&&((this.faclMi == rhs.faclMi)||((this.faclMi!= null)&&this.faclMi.equals(rhs.faclMi))))&&((this.sirdpclCollCode == rhs.sirdpclCollCode)||((this.sirdpclCollCode!= null)&&this.sirdpclCollCode.equals(rhs.sirdpclCollCode))))&&((this.keyblckFctgCode == rhs.keyblckFctgCode)||((this.keyblckFctgCode!= null)&&this.keyblckFctgCode.equals(rhs.keyblckFctgCode))))&&((this.keyblckSchdInd == rhs.keyblckSchdInd)||((this.keyblckSchdInd!= null)&&this.keyblckSchdInd.equals(rhs.keyblckSchdInd))))&&((this.faclFirstName == rhs.faclFirstName)||((this.faclFirstName!= null)&&this.faclFirstName.equals(rhs.faclFirstName))))&&((this.keyblckFstpCode == rhs.keyblckFstpCode)||((this.keyblckFstpCode!= null)&&this.keyblckFstpCode.equals(rhs.keyblckFstpCode))))&&((this.faclDummy == rhs.faclDummy)||((this.faclDummy!= null)&&this.faclDummy.equals(rhs.faclDummy))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
