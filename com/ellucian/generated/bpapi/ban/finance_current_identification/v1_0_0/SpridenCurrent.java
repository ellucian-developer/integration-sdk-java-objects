
package com.ellucian.generated.bpapi.ban.finance_current_identification.v1_0_0;

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
    "persPrefFname",
    "spridenActivityDate",
    "mrtlDesc",
    "persPrefix",
    "spridenCreateUser",
    "greenDataBar2",
    "persLastName",
    "greenDataBar3",
    "persLegalName",
    "persMrtlCode",
    "currentNtypDesc",
    "spridenOrigin",
    "greenDataBar1",
    "persMi",
    "persSuffix",
    "spridenId",
    "persSurnamePrefix",
    "spridenUser",
    "nonPersName",
    "persSsn",
    "spridenNtypCode",
    "persFirstName",
    "spridenCreateDate"
})
@Generated("jsonschema2pojo")
public class SpridenCurrent {

    /**
     * Preferred First Name
     * <p>
     * 
     * 
     */
    @JsonProperty("persPrefFname")
    private String persPrefFname;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SPRIDEN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("spridenActivityDate")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_ACTIVITY_DATE")
    private Date spridenActivityDate;
    @JsonProperty("mrtlDesc")
    private String mrtlDesc;
    /**
     * Prefix
     * <p>
     * 
     * 
     */
    @JsonProperty("persPrefix")
    private String persPrefix;
    /**
     * User
     * <p>
     * Lineage reference object : SPRIDEN_CREATE_USER
     * 
     */
    @JsonProperty("spridenCreateUser")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_CREATE_USER")
    private String spridenCreateUser;
    @JsonProperty("greenDataBar2")
    private String greenDataBar2;
    /**
     * Last Name
     * <p>
     * 
     * 
     */
    @JsonProperty("persLastName")
    private String persLastName;
    @JsonProperty("greenDataBar3")
    private String greenDataBar3;
    /**
     * Full Legal Name
     * <p>
     * 
     * 
     */
    @JsonProperty("persLegalName")
    private String persLegalName;
    /**
     * Marital Status
     * <p>
     * Lookup lineage reference object : stvmrtl
     * 
     */
    @JsonProperty("persMrtlCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvmrtl")
    private String persMrtlCode;
    @JsonProperty("currentNtypDesc")
    private String currentNtypDesc;
    /**
     * Origin
     * <p>
     * Lineage reference object : SPRIDEN_ORIGIN
     * 
     */
    @JsonProperty("spridenOrigin")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_ORIGIN")
    private String spridenOrigin;
    @JsonProperty("greenDataBar1")
    private String greenDataBar1;
    /**
     * Middle Name
     * <p>
     * 
     * 
     */
    @JsonProperty("persMi")
    private String persMi;
    /**
     * Suffix
     * <p>
     * 
     * 
     */
    @JsonProperty("persSuffix")
    private String persSuffix;
    /**
     * ID
     * <p>
     * Lineage reference object : SPRIDEN_ID
     * 
     */
    @JsonProperty("spridenId")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_ID")
    private String spridenId;
    /**
     * Last Name Prefix
     * <p>
     * 
     * 
     */
    @JsonProperty("persSurnamePrefix")
    private String persSurnamePrefix;
    /**
     * User
     * <p>
     * Lineage reference object : SPRIDEN_USER
     * 
     */
    @JsonProperty("spridenUser")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_USER")
    private String spridenUser;
    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("nonPersName")
    private String nonPersName;
    /**
     * SSN/SIN/TIN
     * <p>
     * 
     * 
     */
    @JsonProperty("persSsn")
    private String persSsn;
    /**
     * Name Type
     * <p>
     * Lineage reference object : SPRIDEN_NTYP_CODE, Lookup lineage reference object : gtvntyp
     * 
     */
    @JsonProperty("spridenNtypCode")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_NTYP_CODE, Lookup lineage reference object : gtvntyp")
    private String spridenNtypCode;
    /**
     * First Name
     * <p>
     * 
     * 
     */
    @JsonProperty("persFirstName")
    private String persFirstName;
    /**
     * Create Date
     * <p>
     * Lineage reference object : SPRIDEN_CREATE_DATE
     * 
     */
    @JsonProperty("spridenCreateDate")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_CREATE_DATE")
    private Date spridenCreateDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Preferred First Name
     * <p>
     * 
     * 
     */
    @JsonProperty("persPrefFname")
    public String getPersPrefFname() {
        return persPrefFname;
    }

    /**
     * Preferred First Name
     * <p>
     * 
     * 
     */
    @JsonProperty("persPrefFname")
    public void setPersPrefFname(String persPrefFname) {
        this.persPrefFname = persPrefFname;
    }

    public SpridenCurrent withPersPrefFname(String persPrefFname) {
        this.persPrefFname = persPrefFname;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SPRIDEN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("spridenActivityDate")
    public Date getSpridenActivityDate() {
        return spridenActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SPRIDEN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("spridenActivityDate")
    public void setSpridenActivityDate(Date spridenActivityDate) {
        this.spridenActivityDate = spridenActivityDate;
    }

    public SpridenCurrent withSpridenActivityDate(Date spridenActivityDate) {
        this.spridenActivityDate = spridenActivityDate;
        return this;
    }

    @JsonProperty("mrtlDesc")
    public String getMrtlDesc() {
        return mrtlDesc;
    }

    @JsonProperty("mrtlDesc")
    public void setMrtlDesc(String mrtlDesc) {
        this.mrtlDesc = mrtlDesc;
    }

    public SpridenCurrent withMrtlDesc(String mrtlDesc) {
        this.mrtlDesc = mrtlDesc;
        return this;
    }

    /**
     * Prefix
     * <p>
     * 
     * 
     */
    @JsonProperty("persPrefix")
    public String getPersPrefix() {
        return persPrefix;
    }

    /**
     * Prefix
     * <p>
     * 
     * 
     */
    @JsonProperty("persPrefix")
    public void setPersPrefix(String persPrefix) {
        this.persPrefix = persPrefix;
    }

    public SpridenCurrent withPersPrefix(String persPrefix) {
        this.persPrefix = persPrefix;
        return this;
    }

    /**
     * User
     * <p>
     * Lineage reference object : SPRIDEN_CREATE_USER
     * 
     */
    @JsonProperty("spridenCreateUser")
    public String getSpridenCreateUser() {
        return spridenCreateUser;
    }

    /**
     * User
     * <p>
     * Lineage reference object : SPRIDEN_CREATE_USER
     * 
     */
    @JsonProperty("spridenCreateUser")
    public void setSpridenCreateUser(String spridenCreateUser) {
        this.spridenCreateUser = spridenCreateUser;
    }

    public SpridenCurrent withSpridenCreateUser(String spridenCreateUser) {
        this.spridenCreateUser = spridenCreateUser;
        return this;
    }

    @JsonProperty("greenDataBar2")
    public String getGreenDataBar2() {
        return greenDataBar2;
    }

    @JsonProperty("greenDataBar2")
    public void setGreenDataBar2(String greenDataBar2) {
        this.greenDataBar2 = greenDataBar2;
    }

    public SpridenCurrent withGreenDataBar2(String greenDataBar2) {
        this.greenDataBar2 = greenDataBar2;
        return this;
    }

    /**
     * Last Name
     * <p>
     * 
     * 
     */
    @JsonProperty("persLastName")
    public String getPersLastName() {
        return persLastName;
    }

    /**
     * Last Name
     * <p>
     * 
     * 
     */
    @JsonProperty("persLastName")
    public void setPersLastName(String persLastName) {
        this.persLastName = persLastName;
    }

    public SpridenCurrent withPersLastName(String persLastName) {
        this.persLastName = persLastName;
        return this;
    }

    @JsonProperty("greenDataBar3")
    public String getGreenDataBar3() {
        return greenDataBar3;
    }

    @JsonProperty("greenDataBar3")
    public void setGreenDataBar3(String greenDataBar3) {
        this.greenDataBar3 = greenDataBar3;
    }

    public SpridenCurrent withGreenDataBar3(String greenDataBar3) {
        this.greenDataBar3 = greenDataBar3;
        return this;
    }

    /**
     * Full Legal Name
     * <p>
     * 
     * 
     */
    @JsonProperty("persLegalName")
    public String getPersLegalName() {
        return persLegalName;
    }

    /**
     * Full Legal Name
     * <p>
     * 
     * 
     */
    @JsonProperty("persLegalName")
    public void setPersLegalName(String persLegalName) {
        this.persLegalName = persLegalName;
    }

    public SpridenCurrent withPersLegalName(String persLegalName) {
        this.persLegalName = persLegalName;
        return this;
    }

    /**
     * Marital Status
     * <p>
     * Lookup lineage reference object : stvmrtl
     * 
     */
    @JsonProperty("persMrtlCode")
    public String getPersMrtlCode() {
        return persMrtlCode;
    }

    /**
     * Marital Status
     * <p>
     * Lookup lineage reference object : stvmrtl
     * 
     */
    @JsonProperty("persMrtlCode")
    public void setPersMrtlCode(String persMrtlCode) {
        this.persMrtlCode = persMrtlCode;
    }

    public SpridenCurrent withPersMrtlCode(String persMrtlCode) {
        this.persMrtlCode = persMrtlCode;
        return this;
    }

    @JsonProperty("currentNtypDesc")
    public String getCurrentNtypDesc() {
        return currentNtypDesc;
    }

    @JsonProperty("currentNtypDesc")
    public void setCurrentNtypDesc(String currentNtypDesc) {
        this.currentNtypDesc = currentNtypDesc;
    }

    public SpridenCurrent withCurrentNtypDesc(String currentNtypDesc) {
        this.currentNtypDesc = currentNtypDesc;
        return this;
    }

    /**
     * Origin
     * <p>
     * Lineage reference object : SPRIDEN_ORIGIN
     * 
     */
    @JsonProperty("spridenOrigin")
    public String getSpridenOrigin() {
        return spridenOrigin;
    }

    /**
     * Origin
     * <p>
     * Lineage reference object : SPRIDEN_ORIGIN
     * 
     */
    @JsonProperty("spridenOrigin")
    public void setSpridenOrigin(String spridenOrigin) {
        this.spridenOrigin = spridenOrigin;
    }

    public SpridenCurrent withSpridenOrigin(String spridenOrigin) {
        this.spridenOrigin = spridenOrigin;
        return this;
    }

    @JsonProperty("greenDataBar1")
    public String getGreenDataBar1() {
        return greenDataBar1;
    }

    @JsonProperty("greenDataBar1")
    public void setGreenDataBar1(String greenDataBar1) {
        this.greenDataBar1 = greenDataBar1;
    }

    public SpridenCurrent withGreenDataBar1(String greenDataBar1) {
        this.greenDataBar1 = greenDataBar1;
        return this;
    }

    /**
     * Middle Name
     * <p>
     * 
     * 
     */
    @JsonProperty("persMi")
    public String getPersMi() {
        return persMi;
    }

    /**
     * Middle Name
     * <p>
     * 
     * 
     */
    @JsonProperty("persMi")
    public void setPersMi(String persMi) {
        this.persMi = persMi;
    }

    public SpridenCurrent withPersMi(String persMi) {
        this.persMi = persMi;
        return this;
    }

    /**
     * Suffix
     * <p>
     * 
     * 
     */
    @JsonProperty("persSuffix")
    public String getPersSuffix() {
        return persSuffix;
    }

    /**
     * Suffix
     * <p>
     * 
     * 
     */
    @JsonProperty("persSuffix")
    public void setPersSuffix(String persSuffix) {
        this.persSuffix = persSuffix;
    }

    public SpridenCurrent withPersSuffix(String persSuffix) {
        this.persSuffix = persSuffix;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : SPRIDEN_ID
     * 
     */
    @JsonProperty("spridenId")
    public String getSpridenId() {
        return spridenId;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : SPRIDEN_ID
     * 
     */
    @JsonProperty("spridenId")
    public void setSpridenId(String spridenId) {
        this.spridenId = spridenId;
    }

    public SpridenCurrent withSpridenId(String spridenId) {
        this.spridenId = spridenId;
        return this;
    }

    /**
     * Last Name Prefix
     * <p>
     * 
     * 
     */
    @JsonProperty("persSurnamePrefix")
    public String getPersSurnamePrefix() {
        return persSurnamePrefix;
    }

    /**
     * Last Name Prefix
     * <p>
     * 
     * 
     */
    @JsonProperty("persSurnamePrefix")
    public void setPersSurnamePrefix(String persSurnamePrefix) {
        this.persSurnamePrefix = persSurnamePrefix;
    }

    public SpridenCurrent withPersSurnamePrefix(String persSurnamePrefix) {
        this.persSurnamePrefix = persSurnamePrefix;
        return this;
    }

    /**
     * User
     * <p>
     * Lineage reference object : SPRIDEN_USER
     * 
     */
    @JsonProperty("spridenUser")
    public String getSpridenUser() {
        return spridenUser;
    }

    /**
     * User
     * <p>
     * Lineage reference object : SPRIDEN_USER
     * 
     */
    @JsonProperty("spridenUser")
    public void setSpridenUser(String spridenUser) {
        this.spridenUser = spridenUser;
    }

    public SpridenCurrent withSpridenUser(String spridenUser) {
        this.spridenUser = spridenUser;
        return this;
    }

    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("nonPersName")
    public String getNonPersName() {
        return nonPersName;
    }

    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("nonPersName")
    public void setNonPersName(String nonPersName) {
        this.nonPersName = nonPersName;
    }

    public SpridenCurrent withNonPersName(String nonPersName) {
        this.nonPersName = nonPersName;
        return this;
    }

    /**
     * SSN/SIN/TIN
     * <p>
     * 
     * 
     */
    @JsonProperty("persSsn")
    public String getPersSsn() {
        return persSsn;
    }

    /**
     * SSN/SIN/TIN
     * <p>
     * 
     * 
     */
    @JsonProperty("persSsn")
    public void setPersSsn(String persSsn) {
        this.persSsn = persSsn;
    }

    public SpridenCurrent withPersSsn(String persSsn) {
        this.persSsn = persSsn;
        return this;
    }

    /**
     * Name Type
     * <p>
     * Lineage reference object : SPRIDEN_NTYP_CODE, Lookup lineage reference object : gtvntyp
     * 
     */
    @JsonProperty("spridenNtypCode")
    public String getSpridenNtypCode() {
        return spridenNtypCode;
    }

    /**
     * Name Type
     * <p>
     * Lineage reference object : SPRIDEN_NTYP_CODE, Lookup lineage reference object : gtvntyp
     * 
     */
    @JsonProperty("spridenNtypCode")
    public void setSpridenNtypCode(String spridenNtypCode) {
        this.spridenNtypCode = spridenNtypCode;
    }

    public SpridenCurrent withSpridenNtypCode(String spridenNtypCode) {
        this.spridenNtypCode = spridenNtypCode;
        return this;
    }

    /**
     * First Name
     * <p>
     * 
     * 
     */
    @JsonProperty("persFirstName")
    public String getPersFirstName() {
        return persFirstName;
    }

    /**
     * First Name
     * <p>
     * 
     * 
     */
    @JsonProperty("persFirstName")
    public void setPersFirstName(String persFirstName) {
        this.persFirstName = persFirstName;
    }

    public SpridenCurrent withPersFirstName(String persFirstName) {
        this.persFirstName = persFirstName;
        return this;
    }

    /**
     * Create Date
     * <p>
     * Lineage reference object : SPRIDEN_CREATE_DATE
     * 
     */
    @JsonProperty("spridenCreateDate")
    public Date getSpridenCreateDate() {
        return spridenCreateDate;
    }

    /**
     * Create Date
     * <p>
     * Lineage reference object : SPRIDEN_CREATE_DATE
     * 
     */
    @JsonProperty("spridenCreateDate")
    public void setSpridenCreateDate(Date spridenCreateDate) {
        this.spridenCreateDate = spridenCreateDate;
    }

    public SpridenCurrent withSpridenCreateDate(Date spridenCreateDate) {
        this.spridenCreateDate = spridenCreateDate;
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

    public SpridenCurrent withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SpridenCurrent.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("persPrefFname");
        sb.append('=');
        sb.append(((this.persPrefFname == null)?"<null>":this.persPrefFname));
        sb.append(',');
        sb.append("spridenActivityDate");
        sb.append('=');
        sb.append(((this.spridenActivityDate == null)?"<null>":this.spridenActivityDate));
        sb.append(',');
        sb.append("mrtlDesc");
        sb.append('=');
        sb.append(((this.mrtlDesc == null)?"<null>":this.mrtlDesc));
        sb.append(',');
        sb.append("persPrefix");
        sb.append('=');
        sb.append(((this.persPrefix == null)?"<null>":this.persPrefix));
        sb.append(',');
        sb.append("spridenCreateUser");
        sb.append('=');
        sb.append(((this.spridenCreateUser == null)?"<null>":this.spridenCreateUser));
        sb.append(',');
        sb.append("greenDataBar2");
        sb.append('=');
        sb.append(((this.greenDataBar2 == null)?"<null>":this.greenDataBar2));
        sb.append(',');
        sb.append("persLastName");
        sb.append('=');
        sb.append(((this.persLastName == null)?"<null>":this.persLastName));
        sb.append(',');
        sb.append("greenDataBar3");
        sb.append('=');
        sb.append(((this.greenDataBar3 == null)?"<null>":this.greenDataBar3));
        sb.append(',');
        sb.append("persLegalName");
        sb.append('=');
        sb.append(((this.persLegalName == null)?"<null>":this.persLegalName));
        sb.append(',');
        sb.append("persMrtlCode");
        sb.append('=');
        sb.append(((this.persMrtlCode == null)?"<null>":this.persMrtlCode));
        sb.append(',');
        sb.append("currentNtypDesc");
        sb.append('=');
        sb.append(((this.currentNtypDesc == null)?"<null>":this.currentNtypDesc));
        sb.append(',');
        sb.append("spridenOrigin");
        sb.append('=');
        sb.append(((this.spridenOrigin == null)?"<null>":this.spridenOrigin));
        sb.append(',');
        sb.append("greenDataBar1");
        sb.append('=');
        sb.append(((this.greenDataBar1 == null)?"<null>":this.greenDataBar1));
        sb.append(',');
        sb.append("persMi");
        sb.append('=');
        sb.append(((this.persMi == null)?"<null>":this.persMi));
        sb.append(',');
        sb.append("persSuffix");
        sb.append('=');
        sb.append(((this.persSuffix == null)?"<null>":this.persSuffix));
        sb.append(',');
        sb.append("spridenId");
        sb.append('=');
        sb.append(((this.spridenId == null)?"<null>":this.spridenId));
        sb.append(',');
        sb.append("persSurnamePrefix");
        sb.append('=');
        sb.append(((this.persSurnamePrefix == null)?"<null>":this.persSurnamePrefix));
        sb.append(',');
        sb.append("spridenUser");
        sb.append('=');
        sb.append(((this.spridenUser == null)?"<null>":this.spridenUser));
        sb.append(',');
        sb.append("nonPersName");
        sb.append('=');
        sb.append(((this.nonPersName == null)?"<null>":this.nonPersName));
        sb.append(',');
        sb.append("persSsn");
        sb.append('=');
        sb.append(((this.persSsn == null)?"<null>":this.persSsn));
        sb.append(',');
        sb.append("spridenNtypCode");
        sb.append('=');
        sb.append(((this.spridenNtypCode == null)?"<null>":this.spridenNtypCode));
        sb.append(',');
        sb.append("persFirstName");
        sb.append('=');
        sb.append(((this.persFirstName == null)?"<null>":this.persFirstName));
        sb.append(',');
        sb.append("spridenCreateDate");
        sb.append('=');
        sb.append(((this.spridenCreateDate == null)?"<null>":this.spridenCreateDate));
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
        result = ((result* 31)+((this.spridenActivityDate == null)? 0 :this.spridenActivityDate.hashCode()));
        result = ((result* 31)+((this.spridenCreateUser == null)? 0 :this.spridenCreateUser.hashCode()));
        result = ((result* 31)+((this.greenDataBar2 == null)? 0 :this.greenDataBar2 .hashCode()));
        result = ((result* 31)+((this.greenDataBar3 == null)? 0 :this.greenDataBar3 .hashCode()));
        result = ((result* 31)+((this.currentNtypDesc == null)? 0 :this.currentNtypDesc.hashCode()));
        result = ((result* 31)+((this.greenDataBar1 == null)? 0 :this.greenDataBar1 .hashCode()));
        result = ((result* 31)+((this.persMi == null)? 0 :this.persMi.hashCode()));
        result = ((result* 31)+((this.spridenId == null)? 0 :this.spridenId.hashCode()));
        result = ((result* 31)+((this.persSurnamePrefix == null)? 0 :this.persSurnamePrefix.hashCode()));
        result = ((result* 31)+((this.spridenUser == null)? 0 :this.spridenUser.hashCode()));
        result = ((result* 31)+((this.persFirstName == null)? 0 :this.persFirstName.hashCode()));
        result = ((result* 31)+((this.spridenCreateDate == null)? 0 :this.spridenCreateDate.hashCode()));
        result = ((result* 31)+((this.persPrefFname == null)? 0 :this.persPrefFname.hashCode()));
        result = ((result* 31)+((this.mrtlDesc == null)? 0 :this.mrtlDesc.hashCode()));
        result = ((result* 31)+((this.persPrefix == null)? 0 :this.persPrefix.hashCode()));
        result = ((result* 31)+((this.persLastName == null)? 0 :this.persLastName.hashCode()));
        result = ((result* 31)+((this.persLegalName == null)? 0 :this.persLegalName.hashCode()));
        result = ((result* 31)+((this.persMrtlCode == null)? 0 :this.persMrtlCode.hashCode()));
        result = ((result* 31)+((this.spridenOrigin == null)? 0 :this.spridenOrigin.hashCode()));
        result = ((result* 31)+((this.persSuffix == null)? 0 :this.persSuffix.hashCode()));
        result = ((result* 31)+((this.nonPersName == null)? 0 :this.nonPersName.hashCode()));
        result = ((result* 31)+((this.persSsn == null)? 0 :this.persSsn.hashCode()));
        result = ((result* 31)+((this.spridenNtypCode == null)? 0 :this.spridenNtypCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SpridenCurrent) == false) {
            return false;
        }
        SpridenCurrent rhs = ((SpridenCurrent) other);
        return (((((((((((((((((((((((((this.spridenActivityDate == rhs.spridenActivityDate)||((this.spridenActivityDate!= null)&&this.spridenActivityDate.equals(rhs.spridenActivityDate)))&&((this.spridenCreateUser == rhs.spridenCreateUser)||((this.spridenCreateUser!= null)&&this.spridenCreateUser.equals(rhs.spridenCreateUser))))&&((this.greenDataBar2 == rhs.greenDataBar2)||((this.greenDataBar2 != null)&&this.greenDataBar2 .equals(rhs.greenDataBar2))))&&((this.greenDataBar3 == rhs.greenDataBar3)||((this.greenDataBar3 != null)&&this.greenDataBar3 .equals(rhs.greenDataBar3))))&&((this.currentNtypDesc == rhs.currentNtypDesc)||((this.currentNtypDesc!= null)&&this.currentNtypDesc.equals(rhs.currentNtypDesc))))&&((this.greenDataBar1 == rhs.greenDataBar1)||((this.greenDataBar1 != null)&&this.greenDataBar1 .equals(rhs.greenDataBar1))))&&((this.persMi == rhs.persMi)||((this.persMi!= null)&&this.persMi.equals(rhs.persMi))))&&((this.spridenId == rhs.spridenId)||((this.spridenId!= null)&&this.spridenId.equals(rhs.spridenId))))&&((this.persSurnamePrefix == rhs.persSurnamePrefix)||((this.persSurnamePrefix!= null)&&this.persSurnamePrefix.equals(rhs.persSurnamePrefix))))&&((this.spridenUser == rhs.spridenUser)||((this.spridenUser!= null)&&this.spridenUser.equals(rhs.spridenUser))))&&((this.persFirstName == rhs.persFirstName)||((this.persFirstName!= null)&&this.persFirstName.equals(rhs.persFirstName))))&&((this.spridenCreateDate == rhs.spridenCreateDate)||((this.spridenCreateDate!= null)&&this.spridenCreateDate.equals(rhs.spridenCreateDate))))&&((this.persPrefFname == rhs.persPrefFname)||((this.persPrefFname!= null)&&this.persPrefFname.equals(rhs.persPrefFname))))&&((this.mrtlDesc == rhs.mrtlDesc)||((this.mrtlDesc!= null)&&this.mrtlDesc.equals(rhs.mrtlDesc))))&&((this.persPrefix == rhs.persPrefix)||((this.persPrefix!= null)&&this.persPrefix.equals(rhs.persPrefix))))&&((this.persLastName == rhs.persLastName)||((this.persLastName!= null)&&this.persLastName.equals(rhs.persLastName))))&&((this.persLegalName == rhs.persLegalName)||((this.persLegalName!= null)&&this.persLegalName.equals(rhs.persLegalName))))&&((this.persMrtlCode == rhs.persMrtlCode)||((this.persMrtlCode!= null)&&this.persMrtlCode.equals(rhs.persMrtlCode))))&&((this.spridenOrigin == rhs.spridenOrigin)||((this.spridenOrigin!= null)&&this.spridenOrigin.equals(rhs.spridenOrigin))))&&((this.persSuffix == rhs.persSuffix)||((this.persSuffix!= null)&&this.persSuffix.equals(rhs.persSuffix))))&&((this.nonPersName == rhs.nonPersName)||((this.nonPersName!= null)&&this.nonPersName.equals(rhs.nonPersName))))&&((this.persSsn == rhs.persSsn)||((this.persSsn!= null)&&this.persSsn.equals(rhs.persSsn))))&&((this.spridenNtypCode == rhs.spridenNtypCode)||((this.spridenNtypCode!= null)&&this.spridenNtypCode.equals(rhs.spridenNtypCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
