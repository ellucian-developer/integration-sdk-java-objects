
package com.ellucian.generated.bpapi.ban.check_cancellation.v1_0_0;

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
    "faachksAddr3",
    "faachksVendCheckName",
    "faachksAddr2",
    "faachksAddr1",
    "faachksVendCode",
    "fabchksCheckDate",
    "faachksZip",
    "faachksCity",
    "faachksState",
    "fabchksCheckAmt",
    "faachksVendCheckCode",
    "faachksVendName"
})
@Generated("jsonschema2pojo")
public class CheckCancellation100GetResponse {

    /**
     * Street Line 3
     * <p>
     * 
     * 
     */
    @JsonProperty("faachksAddr3")
    private String faachksAddr3;
    @JsonProperty("faachksVendCheckName")
    private String faachksVendCheckName;
    /**
     * Street Line 2
     * <p>
     * 
     * 
     */
    @JsonProperty("faachksAddr2")
    private String faachksAddr2;
    /**
     * Street Line 1
     * <p>
     * 
     * 
     */
    @JsonProperty("faachksAddr1")
    private String faachksAddr1;
    /**
     * Vendor
     * <p>
     * Lookup lineage reference object : ftvvend
     * 
     */
    @JsonProperty("faachksVendCode")
    @JsonPropertyDescription("Lookup lineage reference object : ftvvend")
    private String faachksVendCode;
    /**
     * Date
     * <p>
     * 
     * 
     */
    @JsonProperty("fabchksCheckDate")
    private Date fabchksCheckDate;
    /**
     * ZIP or Postal Code
     * <p>
     * 
     * 
     */
    @JsonProperty("faachksZip")
    private String faachksZip;
    /**
     * City
     * <p>
     * 
     * 
     */
    @JsonProperty("faachksCity")
    private String faachksCity;
    /**
     * State or Province
     * <p>
     * 
     * 
     */
    @JsonProperty("faachksState")
    private String faachksState;
    /**
     * Amount
     * <p>
     * 
     * 
     */
    @JsonProperty("fabchksCheckAmt")
    private Double fabchksCheckAmt;
    /**
     * Check Vendor
     * <p>
     * 
     * 
     */
    @JsonProperty("faachksVendCheckCode")
    private String faachksVendCheckCode;
    @JsonProperty("faachksVendName")
    private String faachksVendName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Street Line 3
     * <p>
     * 
     * 
     */
    @JsonProperty("faachksAddr3")
    public String getFaachksAddr3() {
        return faachksAddr3;
    }

    /**
     * Street Line 3
     * <p>
     * 
     * 
     */
    @JsonProperty("faachksAddr3")
    public void setFaachksAddr3(String faachksAddr3) {
        this.faachksAddr3 = faachksAddr3;
    }

    public CheckCancellation100GetResponse withFaachksAddr3(String faachksAddr3) {
        this.faachksAddr3 = faachksAddr3;
        return this;
    }

    @JsonProperty("faachksVendCheckName")
    public String getFaachksVendCheckName() {
        return faachksVendCheckName;
    }

    @JsonProperty("faachksVendCheckName")
    public void setFaachksVendCheckName(String faachksVendCheckName) {
        this.faachksVendCheckName = faachksVendCheckName;
    }

    public CheckCancellation100GetResponse withFaachksVendCheckName(String faachksVendCheckName) {
        this.faachksVendCheckName = faachksVendCheckName;
        return this;
    }

    /**
     * Street Line 2
     * <p>
     * 
     * 
     */
    @JsonProperty("faachksAddr2")
    public String getFaachksAddr2() {
        return faachksAddr2;
    }

    /**
     * Street Line 2
     * <p>
     * 
     * 
     */
    @JsonProperty("faachksAddr2")
    public void setFaachksAddr2(String faachksAddr2) {
        this.faachksAddr2 = faachksAddr2;
    }

    public CheckCancellation100GetResponse withFaachksAddr2(String faachksAddr2) {
        this.faachksAddr2 = faachksAddr2;
        return this;
    }

    /**
     * Street Line 1
     * <p>
     * 
     * 
     */
    @JsonProperty("faachksAddr1")
    public String getFaachksAddr1() {
        return faachksAddr1;
    }

    /**
     * Street Line 1
     * <p>
     * 
     * 
     */
    @JsonProperty("faachksAddr1")
    public void setFaachksAddr1(String faachksAddr1) {
        this.faachksAddr1 = faachksAddr1;
    }

    public CheckCancellation100GetResponse withFaachksAddr1(String faachksAddr1) {
        this.faachksAddr1 = faachksAddr1;
        return this;
    }

    /**
     * Vendor
     * <p>
     * Lookup lineage reference object : ftvvend
     * 
     */
    @JsonProperty("faachksVendCode")
    public String getFaachksVendCode() {
        return faachksVendCode;
    }

    /**
     * Vendor
     * <p>
     * Lookup lineage reference object : ftvvend
     * 
     */
    @JsonProperty("faachksVendCode")
    public void setFaachksVendCode(String faachksVendCode) {
        this.faachksVendCode = faachksVendCode;
    }

    public CheckCancellation100GetResponse withFaachksVendCode(String faachksVendCode) {
        this.faachksVendCode = faachksVendCode;
        return this;
    }

    /**
     * Date
     * <p>
     * 
     * 
     */
    @JsonProperty("fabchksCheckDate")
    public Date getFabchksCheckDate() {
        return fabchksCheckDate;
    }

    /**
     * Date
     * <p>
     * 
     * 
     */
    @JsonProperty("fabchksCheckDate")
    public void setFabchksCheckDate(Date fabchksCheckDate) {
        this.fabchksCheckDate = fabchksCheckDate;
    }

    public CheckCancellation100GetResponse withFabchksCheckDate(Date fabchksCheckDate) {
        this.fabchksCheckDate = fabchksCheckDate;
        return this;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * 
     * 
     */
    @JsonProperty("faachksZip")
    public String getFaachksZip() {
        return faachksZip;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * 
     * 
     */
    @JsonProperty("faachksZip")
    public void setFaachksZip(String faachksZip) {
        this.faachksZip = faachksZip;
    }

    public CheckCancellation100GetResponse withFaachksZip(String faachksZip) {
        this.faachksZip = faachksZip;
        return this;
    }

    /**
     * City
     * <p>
     * 
     * 
     */
    @JsonProperty("faachksCity")
    public String getFaachksCity() {
        return faachksCity;
    }

    /**
     * City
     * <p>
     * 
     * 
     */
    @JsonProperty("faachksCity")
    public void setFaachksCity(String faachksCity) {
        this.faachksCity = faachksCity;
    }

    public CheckCancellation100GetResponse withFaachksCity(String faachksCity) {
        this.faachksCity = faachksCity;
        return this;
    }

    /**
     * State or Province
     * <p>
     * 
     * 
     */
    @JsonProperty("faachksState")
    public String getFaachksState() {
        return faachksState;
    }

    /**
     * State or Province
     * <p>
     * 
     * 
     */
    @JsonProperty("faachksState")
    public void setFaachksState(String faachksState) {
        this.faachksState = faachksState;
    }

    public CheckCancellation100GetResponse withFaachksState(String faachksState) {
        this.faachksState = faachksState;
        return this;
    }

    /**
     * Amount
     * <p>
     * 
     * 
     */
    @JsonProperty("fabchksCheckAmt")
    public Double getFabchksCheckAmt() {
        return fabchksCheckAmt;
    }

    /**
     * Amount
     * <p>
     * 
     * 
     */
    @JsonProperty("fabchksCheckAmt")
    public void setFabchksCheckAmt(Double fabchksCheckAmt) {
        this.fabchksCheckAmt = fabchksCheckAmt;
    }

    public CheckCancellation100GetResponse withFabchksCheckAmt(Double fabchksCheckAmt) {
        this.fabchksCheckAmt = fabchksCheckAmt;
        return this;
    }

    /**
     * Check Vendor
     * <p>
     * 
     * 
     */
    @JsonProperty("faachksVendCheckCode")
    public String getFaachksVendCheckCode() {
        return faachksVendCheckCode;
    }

    /**
     * Check Vendor
     * <p>
     * 
     * 
     */
    @JsonProperty("faachksVendCheckCode")
    public void setFaachksVendCheckCode(String faachksVendCheckCode) {
        this.faachksVendCheckCode = faachksVendCheckCode;
    }

    public CheckCancellation100GetResponse withFaachksVendCheckCode(String faachksVendCheckCode) {
        this.faachksVendCheckCode = faachksVendCheckCode;
        return this;
    }

    @JsonProperty("faachksVendName")
    public String getFaachksVendName() {
        return faachksVendName;
    }

    @JsonProperty("faachksVendName")
    public void setFaachksVendName(String faachksVendName) {
        this.faachksVendName = faachksVendName;
    }

    public CheckCancellation100GetResponse withFaachksVendName(String faachksVendName) {
        this.faachksVendName = faachksVendName;
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

    public CheckCancellation100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CheckCancellation100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("faachksAddr3");
        sb.append('=');
        sb.append(((this.faachksAddr3 == null)?"<null>":this.faachksAddr3));
        sb.append(',');
        sb.append("faachksVendCheckName");
        sb.append('=');
        sb.append(((this.faachksVendCheckName == null)?"<null>":this.faachksVendCheckName));
        sb.append(',');
        sb.append("faachksAddr2");
        sb.append('=');
        sb.append(((this.faachksAddr2 == null)?"<null>":this.faachksAddr2));
        sb.append(',');
        sb.append("faachksAddr1");
        sb.append('=');
        sb.append(((this.faachksAddr1 == null)?"<null>":this.faachksAddr1));
        sb.append(',');
        sb.append("faachksVendCode");
        sb.append('=');
        sb.append(((this.faachksVendCode == null)?"<null>":this.faachksVendCode));
        sb.append(',');
        sb.append("fabchksCheckDate");
        sb.append('=');
        sb.append(((this.fabchksCheckDate == null)?"<null>":this.fabchksCheckDate));
        sb.append(',');
        sb.append("faachksZip");
        sb.append('=');
        sb.append(((this.faachksZip == null)?"<null>":this.faachksZip));
        sb.append(',');
        sb.append("faachksCity");
        sb.append('=');
        sb.append(((this.faachksCity == null)?"<null>":this.faachksCity));
        sb.append(',');
        sb.append("faachksState");
        sb.append('=');
        sb.append(((this.faachksState == null)?"<null>":this.faachksState));
        sb.append(',');
        sb.append("fabchksCheckAmt");
        sb.append('=');
        sb.append(((this.fabchksCheckAmt == null)?"<null>":this.fabchksCheckAmt));
        sb.append(',');
        sb.append("faachksVendCheckCode");
        sb.append('=');
        sb.append(((this.faachksVendCheckCode == null)?"<null>":this.faachksVendCheckCode));
        sb.append(',');
        sb.append("faachksVendName");
        sb.append('=');
        sb.append(((this.faachksVendName == null)?"<null>":this.faachksVendName));
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
        result = ((result* 31)+((this.faachksAddr3 == null)? 0 :this.faachksAddr3 .hashCode()));
        result = ((result* 31)+((this.faachksVendCheckName == null)? 0 :this.faachksVendCheckName.hashCode()));
        result = ((result* 31)+((this.faachksAddr2 == null)? 0 :this.faachksAddr2 .hashCode()));
        result = ((result* 31)+((this.faachksAddr1 == null)? 0 :this.faachksAddr1 .hashCode()));
        result = ((result* 31)+((this.fabchksCheckDate == null)? 0 :this.fabchksCheckDate.hashCode()));
        result = ((result* 31)+((this.faachksState == null)? 0 :this.faachksState.hashCode()));
        result = ((result* 31)+((this.fabchksCheckAmt == null)? 0 :this.fabchksCheckAmt.hashCode()));
        result = ((result* 31)+((this.faachksVendCheckCode == null)? 0 :this.faachksVendCheckCode.hashCode()));
        result = ((result* 31)+((this.faachksVendCode == null)? 0 :this.faachksVendCode.hashCode()));
        result = ((result* 31)+((this.faachksZip == null)? 0 :this.faachksZip.hashCode()));
        result = ((result* 31)+((this.faachksCity == null)? 0 :this.faachksCity.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.faachksVendName == null)? 0 :this.faachksVendName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CheckCancellation100GetResponse) == false) {
            return false;
        }
        CheckCancellation100GetResponse rhs = ((CheckCancellation100GetResponse) other);
        return ((((((((((((((this.faachksAddr3 == rhs.faachksAddr3)||((this.faachksAddr3 != null)&&this.faachksAddr3 .equals(rhs.faachksAddr3)))&&((this.faachksVendCheckName == rhs.faachksVendCheckName)||((this.faachksVendCheckName!= null)&&this.faachksVendCheckName.equals(rhs.faachksVendCheckName))))&&((this.faachksAddr2 == rhs.faachksAddr2)||((this.faachksAddr2 != null)&&this.faachksAddr2 .equals(rhs.faachksAddr2))))&&((this.faachksAddr1 == rhs.faachksAddr1)||((this.faachksAddr1 != null)&&this.faachksAddr1 .equals(rhs.faachksAddr1))))&&((this.fabchksCheckDate == rhs.fabchksCheckDate)||((this.fabchksCheckDate!= null)&&this.fabchksCheckDate.equals(rhs.fabchksCheckDate))))&&((this.faachksState == rhs.faachksState)||((this.faachksState!= null)&&this.faachksState.equals(rhs.faachksState))))&&((this.fabchksCheckAmt == rhs.fabchksCheckAmt)||((this.fabchksCheckAmt!= null)&&this.fabchksCheckAmt.equals(rhs.fabchksCheckAmt))))&&((this.faachksVendCheckCode == rhs.faachksVendCheckCode)||((this.faachksVendCheckCode!= null)&&this.faachksVendCheckCode.equals(rhs.faachksVendCheckCode))))&&((this.faachksVendCode == rhs.faachksVendCode)||((this.faachksVendCode!= null)&&this.faachksVendCode.equals(rhs.faachksVendCode))))&&((this.faachksZip == rhs.faachksZip)||((this.faachksZip!= null)&&this.faachksZip.equals(rhs.faachksZip))))&&((this.faachksCity == rhs.faachksCity)||((this.faachksCity!= null)&&this.faachksCity.equals(rhs.faachksCity))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.faachksVendName == rhs.faachksVendName)||((this.faachksVendName!= null)&&this.faachksVendName.equals(rhs.faachksVendName))));
    }

}
