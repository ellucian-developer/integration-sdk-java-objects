
package com.ellucian.generated.bpapi.ban.prior_college_prior_college_address.v1_0_0;

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
    "sobsbgiStatCode",
    "sobsbgiNatnCode",
    "sobsbgiCntyCode",
    "sobsbgiZip",
    "stvstatDesc",
    "sobsbgiHouseNumber",
    "sobsbgiCity",
    "stvcntyDesc",
    "sobsbgiStreetLine1",
    "sobsbgiStreetLine2",
    "sobsbgiStreetLine3",
    "sobsbgiStreetLine4",
    "stvnatnDesc",
    "addrDisp"
})
@Generated("jsonschema2pojo")
public class PriorCollegePriorCollegeAddress100GetResponse {

    /**
     * State or Province
     * <p>
     * Lineage reference object : sobsbgiStatCode, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("sobsbgiStatCode")
    @JsonPropertyDescription("Lineage reference object : sobsbgiStatCode, Lookup lineage reference object : stvstat")
    private String sobsbgiStatCode;
    /**
     * Nation
     * <p>
     * Lineage reference object : sobsbgiNatnCode, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("sobsbgiNatnCode")
    @JsonPropertyDescription("Lineage reference object : sobsbgiNatnCode, Lookup lineage reference object : stvnatn")
    private String sobsbgiNatnCode;
    /**
     * County
     * <p>
     * Lineage reference object : sobsbgiCntyCode, Lookup lineage reference object : stvcnty
     * 
     */
    @JsonProperty("sobsbgiCntyCode")
    @JsonPropertyDescription("Lineage reference object : sobsbgiCntyCode, Lookup lineage reference object : stvcnty")
    private String sobsbgiCntyCode;
    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : sobsbgiZip
     * 
     */
    @JsonProperty("sobsbgiZip")
    @JsonPropertyDescription("Lineage reference object : sobsbgiZip")
    private String sobsbgiZip;
    /**
     * State or Province Description
     * <p>
     * Lineage reference object : stvstatDesc
     * 
     */
    @JsonProperty("stvstatDesc")
    @JsonPropertyDescription("Lineage reference object : stvstatDesc")
    private String stvstatDesc;
    /**
     * House Number
     * <p>
     * Lineage reference object : sobsbgiHouseNumber
     * 
     */
    @JsonProperty("sobsbgiHouseNumber")
    @JsonPropertyDescription("Lineage reference object : sobsbgiHouseNumber")
    private String sobsbgiHouseNumber;
    /**
     * City
     * <p>
     * Lineage reference object : sobsbgiCity
     * 
     */
    @JsonProperty("sobsbgiCity")
    @JsonPropertyDescription("Lineage reference object : sobsbgiCity")
    private String sobsbgiCity;
    /**
     * Lineage reference object : stvcntyDesc
     * 
     */
    @JsonProperty("stvcntyDesc")
    @JsonPropertyDescription("Lineage reference object : stvcntyDesc")
    private String stvcntyDesc;
    /**
     * Street Line 1
     * <p>
     * Lineage reference object : sobsbgiStreetLine1
     * 
     */
    @JsonProperty("sobsbgiStreetLine1")
    @JsonPropertyDescription("Lineage reference object : sobsbgiStreetLine1")
    private String sobsbgiStreetLine1;
    /**
     * Street Line 2
     * <p>
     * Lineage reference object : sobsbgiStreetLine2
     * 
     */
    @JsonProperty("sobsbgiStreetLine2")
    @JsonPropertyDescription("Lineage reference object : sobsbgiStreetLine2")
    private String sobsbgiStreetLine2;
    /**
     * Street Line 3
     * <p>
     * Lineage reference object : sobsbgiStreetLine3
     * 
     */
    @JsonProperty("sobsbgiStreetLine3")
    @JsonPropertyDescription("Lineage reference object : sobsbgiStreetLine3")
    private String sobsbgiStreetLine3;
    /**
     * Street Line 4
     * <p>
     * Lineage reference object : sobsbgiStreetLine4
     * 
     */
    @JsonProperty("sobsbgiStreetLine4")
    @JsonPropertyDescription("Lineage reference object : sobsbgiStreetLine4")
    private String sobsbgiStreetLine4;
    /**
     * Nation Description
     * <p>
     * Lineage reference object : stvnatnDesc
     * 
     */
    @JsonProperty("stvnatnDesc")
    @JsonPropertyDescription("Lineage reference object : stvnatnDesc")
    private String stvnatnDesc;
    /**
     * Lineage reference object : addrDisp
     * 
     */
    @JsonProperty("addrDisp")
    @JsonPropertyDescription("Lineage reference object : addrDisp")
    private String addrDisp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * State or Province
     * <p>
     * Lineage reference object : sobsbgiStatCode, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("sobsbgiStatCode")
    public String getSobsbgiStatCode() {
        return sobsbgiStatCode;
    }

    /**
     * State or Province
     * <p>
     * Lineage reference object : sobsbgiStatCode, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("sobsbgiStatCode")
    public void setSobsbgiStatCode(String sobsbgiStatCode) {
        this.sobsbgiStatCode = sobsbgiStatCode;
    }

    public PriorCollegePriorCollegeAddress100GetResponse withSobsbgiStatCode(String sobsbgiStatCode) {
        this.sobsbgiStatCode = sobsbgiStatCode;
        return this;
    }

    /**
     * Nation
     * <p>
     * Lineage reference object : sobsbgiNatnCode, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("sobsbgiNatnCode")
    public String getSobsbgiNatnCode() {
        return sobsbgiNatnCode;
    }

    /**
     * Nation
     * <p>
     * Lineage reference object : sobsbgiNatnCode, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("sobsbgiNatnCode")
    public void setSobsbgiNatnCode(String sobsbgiNatnCode) {
        this.sobsbgiNatnCode = sobsbgiNatnCode;
    }

    public PriorCollegePriorCollegeAddress100GetResponse withSobsbgiNatnCode(String sobsbgiNatnCode) {
        this.sobsbgiNatnCode = sobsbgiNatnCode;
        return this;
    }

    /**
     * County
     * <p>
     * Lineage reference object : sobsbgiCntyCode, Lookup lineage reference object : stvcnty
     * 
     */
    @JsonProperty("sobsbgiCntyCode")
    public String getSobsbgiCntyCode() {
        return sobsbgiCntyCode;
    }

    /**
     * County
     * <p>
     * Lineage reference object : sobsbgiCntyCode, Lookup lineage reference object : stvcnty
     * 
     */
    @JsonProperty("sobsbgiCntyCode")
    public void setSobsbgiCntyCode(String sobsbgiCntyCode) {
        this.sobsbgiCntyCode = sobsbgiCntyCode;
    }

    public PriorCollegePriorCollegeAddress100GetResponse withSobsbgiCntyCode(String sobsbgiCntyCode) {
        this.sobsbgiCntyCode = sobsbgiCntyCode;
        return this;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : sobsbgiZip
     * 
     */
    @JsonProperty("sobsbgiZip")
    public String getSobsbgiZip() {
        return sobsbgiZip;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : sobsbgiZip
     * 
     */
    @JsonProperty("sobsbgiZip")
    public void setSobsbgiZip(String sobsbgiZip) {
        this.sobsbgiZip = sobsbgiZip;
    }

    public PriorCollegePriorCollegeAddress100GetResponse withSobsbgiZip(String sobsbgiZip) {
        this.sobsbgiZip = sobsbgiZip;
        return this;
    }

    /**
     * State or Province Description
     * <p>
     * Lineage reference object : stvstatDesc
     * 
     */
    @JsonProperty("stvstatDesc")
    public String getStvstatDesc() {
        return stvstatDesc;
    }

    /**
     * State or Province Description
     * <p>
     * Lineage reference object : stvstatDesc
     * 
     */
    @JsonProperty("stvstatDesc")
    public void setStvstatDesc(String stvstatDesc) {
        this.stvstatDesc = stvstatDesc;
    }

    public PriorCollegePriorCollegeAddress100GetResponse withStvstatDesc(String stvstatDesc) {
        this.stvstatDesc = stvstatDesc;
        return this;
    }

    /**
     * House Number
     * <p>
     * Lineage reference object : sobsbgiHouseNumber
     * 
     */
    @JsonProperty("sobsbgiHouseNumber")
    public String getSobsbgiHouseNumber() {
        return sobsbgiHouseNumber;
    }

    /**
     * House Number
     * <p>
     * Lineage reference object : sobsbgiHouseNumber
     * 
     */
    @JsonProperty("sobsbgiHouseNumber")
    public void setSobsbgiHouseNumber(String sobsbgiHouseNumber) {
        this.sobsbgiHouseNumber = sobsbgiHouseNumber;
    }

    public PriorCollegePriorCollegeAddress100GetResponse withSobsbgiHouseNumber(String sobsbgiHouseNumber) {
        this.sobsbgiHouseNumber = sobsbgiHouseNumber;
        return this;
    }

    /**
     * City
     * <p>
     * Lineage reference object : sobsbgiCity
     * 
     */
    @JsonProperty("sobsbgiCity")
    public String getSobsbgiCity() {
        return sobsbgiCity;
    }

    /**
     * City
     * <p>
     * Lineage reference object : sobsbgiCity
     * 
     */
    @JsonProperty("sobsbgiCity")
    public void setSobsbgiCity(String sobsbgiCity) {
        this.sobsbgiCity = sobsbgiCity;
    }

    public PriorCollegePriorCollegeAddress100GetResponse withSobsbgiCity(String sobsbgiCity) {
        this.sobsbgiCity = sobsbgiCity;
        return this;
    }

    /**
     * Lineage reference object : stvcntyDesc
     * 
     */
    @JsonProperty("stvcntyDesc")
    public String getStvcntyDesc() {
        return stvcntyDesc;
    }

    /**
     * Lineage reference object : stvcntyDesc
     * 
     */
    @JsonProperty("stvcntyDesc")
    public void setStvcntyDesc(String stvcntyDesc) {
        this.stvcntyDesc = stvcntyDesc;
    }

    public PriorCollegePriorCollegeAddress100GetResponse withStvcntyDesc(String stvcntyDesc) {
        this.stvcntyDesc = stvcntyDesc;
        return this;
    }

    /**
     * Street Line 1
     * <p>
     * Lineage reference object : sobsbgiStreetLine1
     * 
     */
    @JsonProperty("sobsbgiStreetLine1")
    public String getSobsbgiStreetLine1() {
        return sobsbgiStreetLine1;
    }

    /**
     * Street Line 1
     * <p>
     * Lineage reference object : sobsbgiStreetLine1
     * 
     */
    @JsonProperty("sobsbgiStreetLine1")
    public void setSobsbgiStreetLine1(String sobsbgiStreetLine1) {
        this.sobsbgiStreetLine1 = sobsbgiStreetLine1;
    }

    public PriorCollegePriorCollegeAddress100GetResponse withSobsbgiStreetLine1(String sobsbgiStreetLine1) {
        this.sobsbgiStreetLine1 = sobsbgiStreetLine1;
        return this;
    }

    /**
     * Street Line 2
     * <p>
     * Lineage reference object : sobsbgiStreetLine2
     * 
     */
    @JsonProperty("sobsbgiStreetLine2")
    public String getSobsbgiStreetLine2() {
        return sobsbgiStreetLine2;
    }

    /**
     * Street Line 2
     * <p>
     * Lineage reference object : sobsbgiStreetLine2
     * 
     */
    @JsonProperty("sobsbgiStreetLine2")
    public void setSobsbgiStreetLine2(String sobsbgiStreetLine2) {
        this.sobsbgiStreetLine2 = sobsbgiStreetLine2;
    }

    public PriorCollegePriorCollegeAddress100GetResponse withSobsbgiStreetLine2(String sobsbgiStreetLine2) {
        this.sobsbgiStreetLine2 = sobsbgiStreetLine2;
        return this;
    }

    /**
     * Street Line 3
     * <p>
     * Lineage reference object : sobsbgiStreetLine3
     * 
     */
    @JsonProperty("sobsbgiStreetLine3")
    public String getSobsbgiStreetLine3() {
        return sobsbgiStreetLine3;
    }

    /**
     * Street Line 3
     * <p>
     * Lineage reference object : sobsbgiStreetLine3
     * 
     */
    @JsonProperty("sobsbgiStreetLine3")
    public void setSobsbgiStreetLine3(String sobsbgiStreetLine3) {
        this.sobsbgiStreetLine3 = sobsbgiStreetLine3;
    }

    public PriorCollegePriorCollegeAddress100GetResponse withSobsbgiStreetLine3(String sobsbgiStreetLine3) {
        this.sobsbgiStreetLine3 = sobsbgiStreetLine3;
        return this;
    }

    /**
     * Street Line 4
     * <p>
     * Lineage reference object : sobsbgiStreetLine4
     * 
     */
    @JsonProperty("sobsbgiStreetLine4")
    public String getSobsbgiStreetLine4() {
        return sobsbgiStreetLine4;
    }

    /**
     * Street Line 4
     * <p>
     * Lineage reference object : sobsbgiStreetLine4
     * 
     */
    @JsonProperty("sobsbgiStreetLine4")
    public void setSobsbgiStreetLine4(String sobsbgiStreetLine4) {
        this.sobsbgiStreetLine4 = sobsbgiStreetLine4;
    }

    public PriorCollegePriorCollegeAddress100GetResponse withSobsbgiStreetLine4(String sobsbgiStreetLine4) {
        this.sobsbgiStreetLine4 = sobsbgiStreetLine4;
        return this;
    }

    /**
     * Nation Description
     * <p>
     * Lineage reference object : stvnatnDesc
     * 
     */
    @JsonProperty("stvnatnDesc")
    public String getStvnatnDesc() {
        return stvnatnDesc;
    }

    /**
     * Nation Description
     * <p>
     * Lineage reference object : stvnatnDesc
     * 
     */
    @JsonProperty("stvnatnDesc")
    public void setStvnatnDesc(String stvnatnDesc) {
        this.stvnatnDesc = stvnatnDesc;
    }

    public PriorCollegePriorCollegeAddress100GetResponse withStvnatnDesc(String stvnatnDesc) {
        this.stvnatnDesc = stvnatnDesc;
        return this;
    }

    /**
     * Lineage reference object : addrDisp
     * 
     */
    @JsonProperty("addrDisp")
    public String getAddrDisp() {
        return addrDisp;
    }

    /**
     * Lineage reference object : addrDisp
     * 
     */
    @JsonProperty("addrDisp")
    public void setAddrDisp(String addrDisp) {
        this.addrDisp = addrDisp;
    }

    public PriorCollegePriorCollegeAddress100GetResponse withAddrDisp(String addrDisp) {
        this.addrDisp = addrDisp;
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

    public PriorCollegePriorCollegeAddress100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PriorCollegePriorCollegeAddress100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sobsbgiStatCode");
        sb.append('=');
        sb.append(((this.sobsbgiStatCode == null)?"<null>":this.sobsbgiStatCode));
        sb.append(',');
        sb.append("sobsbgiNatnCode");
        sb.append('=');
        sb.append(((this.sobsbgiNatnCode == null)?"<null>":this.sobsbgiNatnCode));
        sb.append(',');
        sb.append("sobsbgiCntyCode");
        sb.append('=');
        sb.append(((this.sobsbgiCntyCode == null)?"<null>":this.sobsbgiCntyCode));
        sb.append(',');
        sb.append("sobsbgiZip");
        sb.append('=');
        sb.append(((this.sobsbgiZip == null)?"<null>":this.sobsbgiZip));
        sb.append(',');
        sb.append("stvstatDesc");
        sb.append('=');
        sb.append(((this.stvstatDesc == null)?"<null>":this.stvstatDesc));
        sb.append(',');
        sb.append("sobsbgiHouseNumber");
        sb.append('=');
        sb.append(((this.sobsbgiHouseNumber == null)?"<null>":this.sobsbgiHouseNumber));
        sb.append(',');
        sb.append("sobsbgiCity");
        sb.append('=');
        sb.append(((this.sobsbgiCity == null)?"<null>":this.sobsbgiCity));
        sb.append(',');
        sb.append("stvcntyDesc");
        sb.append('=');
        sb.append(((this.stvcntyDesc == null)?"<null>":this.stvcntyDesc));
        sb.append(',');
        sb.append("sobsbgiStreetLine1");
        sb.append('=');
        sb.append(((this.sobsbgiStreetLine1 == null)?"<null>":this.sobsbgiStreetLine1));
        sb.append(',');
        sb.append("sobsbgiStreetLine2");
        sb.append('=');
        sb.append(((this.sobsbgiStreetLine2 == null)?"<null>":this.sobsbgiStreetLine2));
        sb.append(',');
        sb.append("sobsbgiStreetLine3");
        sb.append('=');
        sb.append(((this.sobsbgiStreetLine3 == null)?"<null>":this.sobsbgiStreetLine3));
        sb.append(',');
        sb.append("sobsbgiStreetLine4");
        sb.append('=');
        sb.append(((this.sobsbgiStreetLine4 == null)?"<null>":this.sobsbgiStreetLine4));
        sb.append(',');
        sb.append("stvnatnDesc");
        sb.append('=');
        sb.append(((this.stvnatnDesc == null)?"<null>":this.stvnatnDesc));
        sb.append(',');
        sb.append("addrDisp");
        sb.append('=');
        sb.append(((this.addrDisp == null)?"<null>":this.addrDisp));
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
        result = ((result* 31)+((this.sobsbgiStatCode == null)? 0 :this.sobsbgiStatCode.hashCode()));
        result = ((result* 31)+((this.sobsbgiNatnCode == null)? 0 :this.sobsbgiNatnCode.hashCode()));
        result = ((result* 31)+((this.sobsbgiCntyCode == null)? 0 :this.sobsbgiCntyCode.hashCode()));
        result = ((result* 31)+((this.sobsbgiZip == null)? 0 :this.sobsbgiZip.hashCode()));
        result = ((result* 31)+((this.stvstatDesc == null)? 0 :this.stvstatDesc.hashCode()));
        result = ((result* 31)+((this.sobsbgiHouseNumber == null)? 0 :this.sobsbgiHouseNumber.hashCode()));
        result = ((result* 31)+((this.sobsbgiCity == null)? 0 :this.sobsbgiCity.hashCode()));
        result = ((result* 31)+((this.stvcntyDesc == null)? 0 :this.stvcntyDesc.hashCode()));
        result = ((result* 31)+((this.sobsbgiStreetLine1 == null)? 0 :this.sobsbgiStreetLine1 .hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sobsbgiStreetLine2 == null)? 0 :this.sobsbgiStreetLine2 .hashCode()));
        result = ((result* 31)+((this.sobsbgiStreetLine3 == null)? 0 :this.sobsbgiStreetLine3 .hashCode()));
        result = ((result* 31)+((this.sobsbgiStreetLine4 == null)? 0 :this.sobsbgiStreetLine4 .hashCode()));
        result = ((result* 31)+((this.stvnatnDesc == null)? 0 :this.stvnatnDesc.hashCode()));
        result = ((result* 31)+((this.addrDisp == null)? 0 :this.addrDisp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PriorCollegePriorCollegeAddress100GetResponse) == false) {
            return false;
        }
        PriorCollegePriorCollegeAddress100GetResponse rhs = ((PriorCollegePriorCollegeAddress100GetResponse) other);
        return ((((((((((((((((this.sobsbgiStatCode == rhs.sobsbgiStatCode)||((this.sobsbgiStatCode!= null)&&this.sobsbgiStatCode.equals(rhs.sobsbgiStatCode)))&&((this.sobsbgiNatnCode == rhs.sobsbgiNatnCode)||((this.sobsbgiNatnCode!= null)&&this.sobsbgiNatnCode.equals(rhs.sobsbgiNatnCode))))&&((this.sobsbgiCntyCode == rhs.sobsbgiCntyCode)||((this.sobsbgiCntyCode!= null)&&this.sobsbgiCntyCode.equals(rhs.sobsbgiCntyCode))))&&((this.sobsbgiZip == rhs.sobsbgiZip)||((this.sobsbgiZip!= null)&&this.sobsbgiZip.equals(rhs.sobsbgiZip))))&&((this.stvstatDesc == rhs.stvstatDesc)||((this.stvstatDesc!= null)&&this.stvstatDesc.equals(rhs.stvstatDesc))))&&((this.sobsbgiHouseNumber == rhs.sobsbgiHouseNumber)||((this.sobsbgiHouseNumber!= null)&&this.sobsbgiHouseNumber.equals(rhs.sobsbgiHouseNumber))))&&((this.sobsbgiCity == rhs.sobsbgiCity)||((this.sobsbgiCity!= null)&&this.sobsbgiCity.equals(rhs.sobsbgiCity))))&&((this.stvcntyDesc == rhs.stvcntyDesc)||((this.stvcntyDesc!= null)&&this.stvcntyDesc.equals(rhs.stvcntyDesc))))&&((this.sobsbgiStreetLine1 == rhs.sobsbgiStreetLine1)||((this.sobsbgiStreetLine1 != null)&&this.sobsbgiStreetLine1 .equals(rhs.sobsbgiStreetLine1))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sobsbgiStreetLine2 == rhs.sobsbgiStreetLine2)||((this.sobsbgiStreetLine2 != null)&&this.sobsbgiStreetLine2 .equals(rhs.sobsbgiStreetLine2))))&&((this.sobsbgiStreetLine3 == rhs.sobsbgiStreetLine3)||((this.sobsbgiStreetLine3 != null)&&this.sobsbgiStreetLine3 .equals(rhs.sobsbgiStreetLine3))))&&((this.sobsbgiStreetLine4 == rhs.sobsbgiStreetLine4)||((this.sobsbgiStreetLine4 != null)&&this.sobsbgiStreetLine4 .equals(rhs.sobsbgiStreetLine4))))&&((this.stvnatnDesc == rhs.stvnatnDesc)||((this.stvnatnDesc!= null)&&this.stvnatnDesc.equals(rhs.stvnatnDesc))))&&((this.addrDisp == rhs.addrDisp)||((this.addrDisp!= null)&&this.addrDisp.equals(rhs.addrDisp))));
    }

}
