
package com.ellucian.generated.bpapi.ban.employee_new_hire.v1_0_0;

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
    "confirmedReDate",
    "lastName",
    "spridenActivityDate",
    "spridenUserId",
    "prefix",
    "ethnicityDesc",
    "sex",
    "suffix",
    "birthDate",
    "ethnCode",
    "ssn",
    "citzDesc",
    "firstName",
    "ntypCode",
    "citzCode",
    "ntypDesc",
    "ethnCde",
    "confirmedReCde",
    "mi",
    "age"
})
@Generated("jsonschema2pojo")
public class BioDemo__1 {

    /**
     * Confirmed Date
     * <p>
     * Lineage reference object : confirmedReDate
     * 
     */
    @JsonProperty("confirmedReDate")
    @JsonPropertyDescription("Lineage reference object : confirmedReDate")
    private Date confirmedReDate;
    /**
     * Last Name
     * <p>
     * Lineage reference object : lastName
     * (Required)
     * 
     */
    @JsonProperty("lastName")
    @JsonPropertyDescription("Lineage reference object : lastName")
    private String lastName;
    /**
     * Lineage reference object : spridenActivityDate
     * 
     */
    @JsonProperty("spridenActivityDate")
    @JsonPropertyDescription("Lineage reference object : spridenActivityDate")
    private Date spridenActivityDate;
    /**
     * Lineage reference object : spridenUserId
     * 
     */
    @JsonProperty("spridenUserId")
    @JsonPropertyDescription("Lineage reference object : spridenUserId")
    private String spridenUserId;
    /**
     * Prefix
     * <p>
     * Lineage reference object : prefix
     * 
     */
    @JsonProperty("prefix")
    @JsonPropertyDescription("Lineage reference object : prefix")
    private String prefix;
    /**
     * Lineage reference object : ethnicityDesc
     * 
     */
    @JsonProperty("ethnicityDesc")
    @JsonPropertyDescription("Lineage reference object : ethnicityDesc")
    private String ethnicityDesc;
    /**
     * Gender
     * <p>
     * Lineage reference object : sex
     * 
     */
    @JsonProperty("sex")
    @JsonPropertyDescription("Lineage reference object : sex")
    private String sex;
    /**
     * Suffix
     * <p>
     * Lineage reference object : suffix
     * 
     */
    @JsonProperty("suffix")
    @JsonPropertyDescription("Lineage reference object : suffix")
    private String suffix;
    /**
     * Birth Date
     * <p>
     * Lineage reference object : birthDate
     * (Required)
     * 
     */
    @JsonProperty("birthDate")
    @JsonPropertyDescription("Lineage reference object : birthDate")
    private Date birthDate;
    /**
     * Ethnicity
     * <p>
     * Lineage reference object : ethnCode, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnCode")
    @JsonPropertyDescription("Lineage reference object : ethnCode, Lookup lineage reference object : stvethn")
    private String ethnCode;
    /**
     * SSN/SIN/TIN
     * <p>
     * Lineage reference object : ssn
     * (Required)
     * 
     */
    @JsonProperty("ssn")
    @JsonPropertyDescription("Lineage reference object : ssn")
    private String ssn;
    /**
     * Lineage reference object : citzDesc
     * 
     */
    @JsonProperty("citzDesc")
    @JsonPropertyDescription("Lineage reference object : citzDesc")
    private String citzDesc;
    /**
     * First Name
     * <p>
     * Lineage reference object : firstName
     * (Required)
     * 
     */
    @JsonProperty("firstName")
    @JsonPropertyDescription("Lineage reference object : firstName")
    private String firstName;
    /**
     * Name Type
     * <p>
     * Lineage reference object : ntypCode, Lookup lineage reference object : gtvntyp
     * 
     */
    @JsonProperty("ntypCode")
    @JsonPropertyDescription("Lineage reference object : ntypCode, Lookup lineage reference object : gtvntyp")
    private String ntypCode;
    /**
     * Citizenship
     * <p>
     * Lineage reference object : citzCode, Lookup lineage reference object : stvcitz
     * (Required)
     * 
     */
    @JsonProperty("citzCode")
    @JsonPropertyDescription("Lineage reference object : citzCode, Lookup lineage reference object : stvcitz")
    private String citzCode;
    /**
     * Lineage reference object : ntypDesc
     * 
     */
    @JsonProperty("ntypDesc")
    @JsonPropertyDescription("Lineage reference object : ntypDesc")
    private String ntypDesc;
    /**
     * New Ethnicity
     * <p>
     * Lineage reference object : ethnCde
     * 
     */
    @JsonProperty("ethnCde")
    @JsonPropertyDescription("Lineage reference object : ethnCde")
    private String ethnCde;
    /**
     * Ethnicity and Race Confirmed
     * <p>
     * Lineage reference object : confirmedReCde
     * 
     */
    @JsonProperty("confirmedReCde")
    @JsonPropertyDescription("Lineage reference object : confirmedReCde")
    private String confirmedReCde;
    /**
     * Middle Name
     * <p>
     * Lineage reference object : mi
     * 
     */
    @JsonProperty("mi")
    @JsonPropertyDescription("Lineage reference object : mi")
    private String mi;
    /**
     * Age
     * <p>
     * Lineage reference object : age
     * 
     */
    @JsonProperty("age")
    @JsonPropertyDescription("Lineage reference object : age")
    private Double age;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Confirmed Date
     * <p>
     * Lineage reference object : confirmedReDate
     * 
     */
    @JsonProperty("confirmedReDate")
    public Date getConfirmedReDate() {
        return confirmedReDate;
    }

    /**
     * Confirmed Date
     * <p>
     * Lineage reference object : confirmedReDate
     * 
     */
    @JsonProperty("confirmedReDate")
    public void setConfirmedReDate(Date confirmedReDate) {
        this.confirmedReDate = confirmedReDate;
    }

    public BioDemo__1 withConfirmedReDate(Date confirmedReDate) {
        this.confirmedReDate = confirmedReDate;
        return this;
    }

    /**
     * Last Name
     * <p>
     * Lineage reference object : lastName
     * (Required)
     * 
     */
    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    /**
     * Last Name
     * <p>
     * Lineage reference object : lastName
     * (Required)
     * 
     */
    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BioDemo__1 withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Lineage reference object : spridenActivityDate
     * 
     */
    @JsonProperty("spridenActivityDate")
    public Date getSpridenActivityDate() {
        return spridenActivityDate;
    }

    /**
     * Lineage reference object : spridenActivityDate
     * 
     */
    @JsonProperty("spridenActivityDate")
    public void setSpridenActivityDate(Date spridenActivityDate) {
        this.spridenActivityDate = spridenActivityDate;
    }

    public BioDemo__1 withSpridenActivityDate(Date spridenActivityDate) {
        this.spridenActivityDate = spridenActivityDate;
        return this;
    }

    /**
     * Lineage reference object : spridenUserId
     * 
     */
    @JsonProperty("spridenUserId")
    public String getSpridenUserId() {
        return spridenUserId;
    }

    /**
     * Lineage reference object : spridenUserId
     * 
     */
    @JsonProperty("spridenUserId")
    public void setSpridenUserId(String spridenUserId) {
        this.spridenUserId = spridenUserId;
    }

    public BioDemo__1 withSpridenUserId(String spridenUserId) {
        this.spridenUserId = spridenUserId;
        return this;
    }

    /**
     * Prefix
     * <p>
     * Lineage reference object : prefix
     * 
     */
    @JsonProperty("prefix")
    public String getPrefix() {
        return prefix;
    }

    /**
     * Prefix
     * <p>
     * Lineage reference object : prefix
     * 
     */
    @JsonProperty("prefix")
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public BioDemo__1 withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * Lineage reference object : ethnicityDesc
     * 
     */
    @JsonProperty("ethnicityDesc")
    public String getEthnicityDesc() {
        return ethnicityDesc;
    }

    /**
     * Lineage reference object : ethnicityDesc
     * 
     */
    @JsonProperty("ethnicityDesc")
    public void setEthnicityDesc(String ethnicityDesc) {
        this.ethnicityDesc = ethnicityDesc;
    }

    public BioDemo__1 withEthnicityDesc(String ethnicityDesc) {
        this.ethnicityDesc = ethnicityDesc;
        return this;
    }

    /**
     * Gender
     * <p>
     * Lineage reference object : sex
     * 
     */
    @JsonProperty("sex")
    public String getSex() {
        return sex;
    }

    /**
     * Gender
     * <p>
     * Lineage reference object : sex
     * 
     */
    @JsonProperty("sex")
    public void setSex(String sex) {
        this.sex = sex;
    }

    public BioDemo__1 withSex(String sex) {
        this.sex = sex;
        return this;
    }

    /**
     * Suffix
     * <p>
     * Lineage reference object : suffix
     * 
     */
    @JsonProperty("suffix")
    public String getSuffix() {
        return suffix;
    }

    /**
     * Suffix
     * <p>
     * Lineage reference object : suffix
     * 
     */
    @JsonProperty("suffix")
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public BioDemo__1 withSuffix(String suffix) {
        this.suffix = suffix;
        return this;
    }

    /**
     * Birth Date
     * <p>
     * Lineage reference object : birthDate
     * (Required)
     * 
     */
    @JsonProperty("birthDate")
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * Birth Date
     * <p>
     * Lineage reference object : birthDate
     * (Required)
     * 
     */
    @JsonProperty("birthDate")
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public BioDemo__1 withBirthDate(Date birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    /**
     * Ethnicity
     * <p>
     * Lineage reference object : ethnCode, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnCode")
    public String getEthnCode() {
        return ethnCode;
    }

    /**
     * Ethnicity
     * <p>
     * Lineage reference object : ethnCode, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnCode")
    public void setEthnCode(String ethnCode) {
        this.ethnCode = ethnCode;
    }

    public BioDemo__1 withEthnCode(String ethnCode) {
        this.ethnCode = ethnCode;
        return this;
    }

    /**
     * SSN/SIN/TIN
     * <p>
     * Lineage reference object : ssn
     * (Required)
     * 
     */
    @JsonProperty("ssn")
    public String getSsn() {
        return ssn;
    }

    /**
     * SSN/SIN/TIN
     * <p>
     * Lineage reference object : ssn
     * (Required)
     * 
     */
    @JsonProperty("ssn")
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public BioDemo__1 withSsn(String ssn) {
        this.ssn = ssn;
        return this;
    }

    /**
     * Lineage reference object : citzDesc
     * 
     */
    @JsonProperty("citzDesc")
    public String getCitzDesc() {
        return citzDesc;
    }

    /**
     * Lineage reference object : citzDesc
     * 
     */
    @JsonProperty("citzDesc")
    public void setCitzDesc(String citzDesc) {
        this.citzDesc = citzDesc;
    }

    public BioDemo__1 withCitzDesc(String citzDesc) {
        this.citzDesc = citzDesc;
        return this;
    }

    /**
     * First Name
     * <p>
     * Lineage reference object : firstName
     * (Required)
     * 
     */
    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    /**
     * First Name
     * <p>
     * Lineage reference object : firstName
     * (Required)
     * 
     */
    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public BioDemo__1 withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Name Type
     * <p>
     * Lineage reference object : ntypCode, Lookup lineage reference object : gtvntyp
     * 
     */
    @JsonProperty("ntypCode")
    public String getNtypCode() {
        return ntypCode;
    }

    /**
     * Name Type
     * <p>
     * Lineage reference object : ntypCode, Lookup lineage reference object : gtvntyp
     * 
     */
    @JsonProperty("ntypCode")
    public void setNtypCode(String ntypCode) {
        this.ntypCode = ntypCode;
    }

    public BioDemo__1 withNtypCode(String ntypCode) {
        this.ntypCode = ntypCode;
        return this;
    }

    /**
     * Citizenship
     * <p>
     * Lineage reference object : citzCode, Lookup lineage reference object : stvcitz
     * (Required)
     * 
     */
    @JsonProperty("citzCode")
    public String getCitzCode() {
        return citzCode;
    }

    /**
     * Citizenship
     * <p>
     * Lineage reference object : citzCode, Lookup lineage reference object : stvcitz
     * (Required)
     * 
     */
    @JsonProperty("citzCode")
    public void setCitzCode(String citzCode) {
        this.citzCode = citzCode;
    }

    public BioDemo__1 withCitzCode(String citzCode) {
        this.citzCode = citzCode;
        return this;
    }

    /**
     * Lineage reference object : ntypDesc
     * 
     */
    @JsonProperty("ntypDesc")
    public String getNtypDesc() {
        return ntypDesc;
    }

    /**
     * Lineage reference object : ntypDesc
     * 
     */
    @JsonProperty("ntypDesc")
    public void setNtypDesc(String ntypDesc) {
        this.ntypDesc = ntypDesc;
    }

    public BioDemo__1 withNtypDesc(String ntypDesc) {
        this.ntypDesc = ntypDesc;
        return this;
    }

    /**
     * New Ethnicity
     * <p>
     * Lineage reference object : ethnCde
     * 
     */
    @JsonProperty("ethnCde")
    public String getEthnCde() {
        return ethnCde;
    }

    /**
     * New Ethnicity
     * <p>
     * Lineage reference object : ethnCde
     * 
     */
    @JsonProperty("ethnCde")
    public void setEthnCde(String ethnCde) {
        this.ethnCde = ethnCde;
    }

    public BioDemo__1 withEthnCde(String ethnCde) {
        this.ethnCde = ethnCde;
        return this;
    }

    /**
     * Ethnicity and Race Confirmed
     * <p>
     * Lineage reference object : confirmedReCde
     * 
     */
    @JsonProperty("confirmedReCde")
    public String getConfirmedReCde() {
        return confirmedReCde;
    }

    /**
     * Ethnicity and Race Confirmed
     * <p>
     * Lineage reference object : confirmedReCde
     * 
     */
    @JsonProperty("confirmedReCde")
    public void setConfirmedReCde(String confirmedReCde) {
        this.confirmedReCde = confirmedReCde;
    }

    public BioDemo__1 withConfirmedReCde(String confirmedReCde) {
        this.confirmedReCde = confirmedReCde;
        return this;
    }

    /**
     * Middle Name
     * <p>
     * Lineage reference object : mi
     * 
     */
    @JsonProperty("mi")
    public String getMi() {
        return mi;
    }

    /**
     * Middle Name
     * <p>
     * Lineage reference object : mi
     * 
     */
    @JsonProperty("mi")
    public void setMi(String mi) {
        this.mi = mi;
    }

    public BioDemo__1 withMi(String mi) {
        this.mi = mi;
        return this;
    }

    /**
     * Age
     * <p>
     * Lineage reference object : age
     * 
     */
    @JsonProperty("age")
    public Double getAge() {
        return age;
    }

    /**
     * Age
     * <p>
     * Lineage reference object : age
     * 
     */
    @JsonProperty("age")
    public void setAge(Double age) {
        this.age = age;
    }

    public BioDemo__1 withAge(Double age) {
        this.age = age;
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

    public BioDemo__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BioDemo__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("confirmedReDate");
        sb.append('=');
        sb.append(((this.confirmedReDate == null)?"<null>":this.confirmedReDate));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("spridenActivityDate");
        sb.append('=');
        sb.append(((this.spridenActivityDate == null)?"<null>":this.spridenActivityDate));
        sb.append(',');
        sb.append("spridenUserId");
        sb.append('=');
        sb.append(((this.spridenUserId == null)?"<null>":this.spridenUserId));
        sb.append(',');
        sb.append("prefix");
        sb.append('=');
        sb.append(((this.prefix == null)?"<null>":this.prefix));
        sb.append(',');
        sb.append("ethnicityDesc");
        sb.append('=');
        sb.append(((this.ethnicityDesc == null)?"<null>":this.ethnicityDesc));
        sb.append(',');
        sb.append("sex");
        sb.append('=');
        sb.append(((this.sex == null)?"<null>":this.sex));
        sb.append(',');
        sb.append("suffix");
        sb.append('=');
        sb.append(((this.suffix == null)?"<null>":this.suffix));
        sb.append(',');
        sb.append("birthDate");
        sb.append('=');
        sb.append(((this.birthDate == null)?"<null>":this.birthDate));
        sb.append(',');
        sb.append("ethnCode");
        sb.append('=');
        sb.append(((this.ethnCode == null)?"<null>":this.ethnCode));
        sb.append(',');
        sb.append("ssn");
        sb.append('=');
        sb.append(((this.ssn == null)?"<null>":this.ssn));
        sb.append(',');
        sb.append("citzDesc");
        sb.append('=');
        sb.append(((this.citzDesc == null)?"<null>":this.citzDesc));
        sb.append(',');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("ntypCode");
        sb.append('=');
        sb.append(((this.ntypCode == null)?"<null>":this.ntypCode));
        sb.append(',');
        sb.append("citzCode");
        sb.append('=');
        sb.append(((this.citzCode == null)?"<null>":this.citzCode));
        sb.append(',');
        sb.append("ntypDesc");
        sb.append('=');
        sb.append(((this.ntypDesc == null)?"<null>":this.ntypDesc));
        sb.append(',');
        sb.append("ethnCde");
        sb.append('=');
        sb.append(((this.ethnCde == null)?"<null>":this.ethnCde));
        sb.append(',');
        sb.append("confirmedReCde");
        sb.append('=');
        sb.append(((this.confirmedReCde == null)?"<null>":this.confirmedReCde));
        sb.append(',');
        sb.append("mi");
        sb.append('=');
        sb.append(((this.mi == null)?"<null>":this.mi));
        sb.append(',');
        sb.append("age");
        sb.append('=');
        sb.append(((this.age == null)?"<null>":this.age));
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
        result = ((result* 31)+((this.confirmedReDate == null)? 0 :this.confirmedReDate.hashCode()));
        result = ((result* 31)+((this.lastName == null)? 0 :this.lastName.hashCode()));
        result = ((result* 31)+((this.spridenActivityDate == null)? 0 :this.spridenActivityDate.hashCode()));
        result = ((result* 31)+((this.spridenUserId == null)? 0 :this.spridenUserId.hashCode()));
        result = ((result* 31)+((this.prefix == null)? 0 :this.prefix.hashCode()));
        result = ((result* 31)+((this.ethnicityDesc == null)? 0 :this.ethnicityDesc.hashCode()));
        result = ((result* 31)+((this.sex == null)? 0 :this.sex.hashCode()));
        result = ((result* 31)+((this.suffix == null)? 0 :this.suffix.hashCode()));
        result = ((result* 31)+((this.birthDate == null)? 0 :this.birthDate.hashCode()));
        result = ((result* 31)+((this.ethnCode == null)? 0 :this.ethnCode.hashCode()));
        result = ((result* 31)+((this.ssn == null)? 0 :this.ssn.hashCode()));
        result = ((result* 31)+((this.citzDesc == null)? 0 :this.citzDesc.hashCode()));
        result = ((result* 31)+((this.firstName == null)? 0 :this.firstName.hashCode()));
        result = ((result* 31)+((this.ntypCode == null)? 0 :this.ntypCode.hashCode()));
        result = ((result* 31)+((this.citzCode == null)? 0 :this.citzCode.hashCode()));
        result = ((result* 31)+((this.ntypDesc == null)? 0 :this.ntypDesc.hashCode()));
        result = ((result* 31)+((this.ethnCde == null)? 0 :this.ethnCde.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.confirmedReCde == null)? 0 :this.confirmedReCde.hashCode()));
        result = ((result* 31)+((this.mi == null)? 0 :this.mi.hashCode()));
        result = ((result* 31)+((this.age == null)? 0 :this.age.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BioDemo__1) == false) {
            return false;
        }
        BioDemo__1 rhs = ((BioDemo__1) other);
        return ((((((((((((((((((((((this.confirmedReDate == rhs.confirmedReDate)||((this.confirmedReDate!= null)&&this.confirmedReDate.equals(rhs.confirmedReDate)))&&((this.lastName == rhs.lastName)||((this.lastName!= null)&&this.lastName.equals(rhs.lastName))))&&((this.spridenActivityDate == rhs.spridenActivityDate)||((this.spridenActivityDate!= null)&&this.spridenActivityDate.equals(rhs.spridenActivityDate))))&&((this.spridenUserId == rhs.spridenUserId)||((this.spridenUserId!= null)&&this.spridenUserId.equals(rhs.spridenUserId))))&&((this.prefix == rhs.prefix)||((this.prefix!= null)&&this.prefix.equals(rhs.prefix))))&&((this.ethnicityDesc == rhs.ethnicityDesc)||((this.ethnicityDesc!= null)&&this.ethnicityDesc.equals(rhs.ethnicityDesc))))&&((this.sex == rhs.sex)||((this.sex!= null)&&this.sex.equals(rhs.sex))))&&((this.suffix == rhs.suffix)||((this.suffix!= null)&&this.suffix.equals(rhs.suffix))))&&((this.birthDate == rhs.birthDate)||((this.birthDate!= null)&&this.birthDate.equals(rhs.birthDate))))&&((this.ethnCode == rhs.ethnCode)||((this.ethnCode!= null)&&this.ethnCode.equals(rhs.ethnCode))))&&((this.ssn == rhs.ssn)||((this.ssn!= null)&&this.ssn.equals(rhs.ssn))))&&((this.citzDesc == rhs.citzDesc)||((this.citzDesc!= null)&&this.citzDesc.equals(rhs.citzDesc))))&&((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName))))&&((this.ntypCode == rhs.ntypCode)||((this.ntypCode!= null)&&this.ntypCode.equals(rhs.ntypCode))))&&((this.citzCode == rhs.citzCode)||((this.citzCode!= null)&&this.citzCode.equals(rhs.citzCode))))&&((this.ntypDesc == rhs.ntypDesc)||((this.ntypDesc!= null)&&this.ntypDesc.equals(rhs.ntypDesc))))&&((this.ethnCde == rhs.ethnCde)||((this.ethnCde!= null)&&this.ethnCde.equals(rhs.ethnCde))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.confirmedReCde == rhs.confirmedReCde)||((this.confirmedReCde!= null)&&this.confirmedReCde.equals(rhs.confirmedReCde))))&&((this.mi == rhs.mi)||((this.mi!= null)&&this.mi.equals(rhs.mi))))&&((this.age == rhs.age)||((this.age!= null)&&this.age.equals(rhs.age))));
    }

}
