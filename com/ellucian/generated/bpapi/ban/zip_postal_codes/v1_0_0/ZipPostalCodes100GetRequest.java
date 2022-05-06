
package com.ellucian.generated.bpapi.ban.zip_postal_codes.v1_0_0;

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
    "gtvzipcCity",
    "gtvzipcNatnCode",
    "gtvzipcCntyCode",
    "gtvzipcStatCode",
    "gtvzipcCode"
})
@Generated("jsonschema2pojo")
public class ZipPostalCodes100GetRequest {

    /**
     * City
     * <p>
     * Lineage reference object : GTVZIPC_CITY
     * (Required)
     * 
     */
    @JsonProperty("gtvzipcCity")
    @JsonPropertyDescription("Lineage reference object : GTVZIPC_CITY")
    private String gtvzipcCity;
    /**
     * Nation
     * <p>
     * Lineage reference object : GTVZIPC_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("gtvzipcNatnCode")
    @JsonPropertyDescription("Lineage reference object : GTVZIPC_NATN_CODE, Lookup lineage reference object : stvnatn")
    private String gtvzipcNatnCode;
    /**
     * County
     * <p>
     * Lineage reference object : GTVZIPC_CNTY_CODE, Lookup lineage reference object : stvcnty
     * 
     */
    @JsonProperty("gtvzipcCntyCode")
    @JsonPropertyDescription("Lineage reference object : GTVZIPC_CNTY_CODE, Lookup lineage reference object : stvcnty")
    private String gtvzipcCntyCode;
    /**
     * State or Province
     * <p>
     * Lineage reference object : GTVZIPC_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("gtvzipcStatCode")
    @JsonPropertyDescription("Lineage reference object : GTVZIPC_STAT_CODE, Lookup lineage reference object : stvstat")
    private String gtvzipcStatCode;
    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : GTVZIPC_CODE
     * (Required)
     * 
     */
    @JsonProperty("gtvzipcCode")
    @JsonPropertyDescription("Lineage reference object : GTVZIPC_CODE")
    private String gtvzipcCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * City
     * <p>
     * Lineage reference object : GTVZIPC_CITY
     * (Required)
     * 
     */
    @JsonProperty("gtvzipcCity")
    public String getGtvzipcCity() {
        return gtvzipcCity;
    }

    /**
     * City
     * <p>
     * Lineage reference object : GTVZIPC_CITY
     * (Required)
     * 
     */
    @JsonProperty("gtvzipcCity")
    public void setGtvzipcCity(String gtvzipcCity) {
        this.gtvzipcCity = gtvzipcCity;
    }

    public ZipPostalCodes100GetRequest withGtvzipcCity(String gtvzipcCity) {
        this.gtvzipcCity = gtvzipcCity;
        return this;
    }

    /**
     * Nation
     * <p>
     * Lineage reference object : GTVZIPC_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("gtvzipcNatnCode")
    public String getGtvzipcNatnCode() {
        return gtvzipcNatnCode;
    }

    /**
     * Nation
     * <p>
     * Lineage reference object : GTVZIPC_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("gtvzipcNatnCode")
    public void setGtvzipcNatnCode(String gtvzipcNatnCode) {
        this.gtvzipcNatnCode = gtvzipcNatnCode;
    }

    public ZipPostalCodes100GetRequest withGtvzipcNatnCode(String gtvzipcNatnCode) {
        this.gtvzipcNatnCode = gtvzipcNatnCode;
        return this;
    }

    /**
     * County
     * <p>
     * Lineage reference object : GTVZIPC_CNTY_CODE, Lookup lineage reference object : stvcnty
     * 
     */
    @JsonProperty("gtvzipcCntyCode")
    public String getGtvzipcCntyCode() {
        return gtvzipcCntyCode;
    }

    /**
     * County
     * <p>
     * Lineage reference object : GTVZIPC_CNTY_CODE, Lookup lineage reference object : stvcnty
     * 
     */
    @JsonProperty("gtvzipcCntyCode")
    public void setGtvzipcCntyCode(String gtvzipcCntyCode) {
        this.gtvzipcCntyCode = gtvzipcCntyCode;
    }

    public ZipPostalCodes100GetRequest withGtvzipcCntyCode(String gtvzipcCntyCode) {
        this.gtvzipcCntyCode = gtvzipcCntyCode;
        return this;
    }

    /**
     * State or Province
     * <p>
     * Lineage reference object : GTVZIPC_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("gtvzipcStatCode")
    public String getGtvzipcStatCode() {
        return gtvzipcStatCode;
    }

    /**
     * State or Province
     * <p>
     * Lineage reference object : GTVZIPC_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("gtvzipcStatCode")
    public void setGtvzipcStatCode(String gtvzipcStatCode) {
        this.gtvzipcStatCode = gtvzipcStatCode;
    }

    public ZipPostalCodes100GetRequest withGtvzipcStatCode(String gtvzipcStatCode) {
        this.gtvzipcStatCode = gtvzipcStatCode;
        return this;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : GTVZIPC_CODE
     * (Required)
     * 
     */
    @JsonProperty("gtvzipcCode")
    public String getGtvzipcCode() {
        return gtvzipcCode;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : GTVZIPC_CODE
     * (Required)
     * 
     */
    @JsonProperty("gtvzipcCode")
    public void setGtvzipcCode(String gtvzipcCode) {
        this.gtvzipcCode = gtvzipcCode;
    }

    public ZipPostalCodes100GetRequest withGtvzipcCode(String gtvzipcCode) {
        this.gtvzipcCode = gtvzipcCode;
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

    public ZipPostalCodes100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ZipPostalCodes100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("gtvzipcCity");
        sb.append('=');
        sb.append(((this.gtvzipcCity == null)?"<null>":this.gtvzipcCity));
        sb.append(',');
        sb.append("gtvzipcNatnCode");
        sb.append('=');
        sb.append(((this.gtvzipcNatnCode == null)?"<null>":this.gtvzipcNatnCode));
        sb.append(',');
        sb.append("gtvzipcCntyCode");
        sb.append('=');
        sb.append(((this.gtvzipcCntyCode == null)?"<null>":this.gtvzipcCntyCode));
        sb.append(',');
        sb.append("gtvzipcStatCode");
        sb.append('=');
        sb.append(((this.gtvzipcStatCode == null)?"<null>":this.gtvzipcStatCode));
        sb.append(',');
        sb.append("gtvzipcCode");
        sb.append('=');
        sb.append(((this.gtvzipcCode == null)?"<null>":this.gtvzipcCode));
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
        result = ((result* 31)+((this.gtvzipcCity == null)? 0 :this.gtvzipcCity.hashCode()));
        result = ((result* 31)+((this.gtvzipcNatnCode == null)? 0 :this.gtvzipcNatnCode.hashCode()));
        result = ((result* 31)+((this.gtvzipcCntyCode == null)? 0 :this.gtvzipcCntyCode.hashCode()));
        result = ((result* 31)+((this.gtvzipcStatCode == null)? 0 :this.gtvzipcStatCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.gtvzipcCode == null)? 0 :this.gtvzipcCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ZipPostalCodes100GetRequest) == false) {
            return false;
        }
        ZipPostalCodes100GetRequest rhs = ((ZipPostalCodes100GetRequest) other);
        return (((((((this.gtvzipcCity == rhs.gtvzipcCity)||((this.gtvzipcCity!= null)&&this.gtvzipcCity.equals(rhs.gtvzipcCity)))&&((this.gtvzipcNatnCode == rhs.gtvzipcNatnCode)||((this.gtvzipcNatnCode!= null)&&this.gtvzipcNatnCode.equals(rhs.gtvzipcNatnCode))))&&((this.gtvzipcCntyCode == rhs.gtvzipcCntyCode)||((this.gtvzipcCntyCode!= null)&&this.gtvzipcCntyCode.equals(rhs.gtvzipcCntyCode))))&&((this.gtvzipcStatCode == rhs.gtvzipcStatCode)||((this.gtvzipcStatCode!= null)&&this.gtvzipcStatCode.equals(rhs.gtvzipcStatCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.gtvzipcCode == rhs.gtvzipcCode)||((this.gtvzipcCode!= null)&&this.gtvzipcCode.equals(rhs.gtvzipcCode))));
    }

}
