
package com.ellucian.generated.bpapi.ban.site_codes.v1_0_0;

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
    "streetAddr2",
    "streetAddr3",
    "code",
    "streetAddr1",
    "natnCode",
    "city",
    "houseNumber",
    "activityDate",
    "state",
    "zipc",
    "streetAddr4",
    "desc",
    "foreignCountry"
})
@Generated("jsonschema2pojo")
public class SiteCodes100GetRequest {

    /**
     * Street Line 2
     * <p>
     * Lineage reference object : STVSITE_STREET_ADDR2
     * 
     */
    @JsonProperty("streetAddr2")
    @JsonPropertyDescription("Lineage reference object : STVSITE_STREET_ADDR2")
    private String streetAddr2;
    /**
     * Street Line 3
     * <p>
     * Lineage reference object : STVSITE_STREET_ADDR3
     * 
     */
    @JsonProperty("streetAddr3")
    @JsonPropertyDescription("Lineage reference object : STVSITE_STREET_ADDR3")
    private String streetAddr3;
    /**
     * Site Code
     * <p>
     * Lineage reference object : STVSITE_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVSITE_CODE")
    private String code;
    /**
     * Street Line 1
     * <p>
     * Lineage reference object : STVSITE_STREET_ADDR1
     * 
     */
    @JsonProperty("streetAddr1")
    @JsonPropertyDescription("Lineage reference object : STVSITE_STREET_ADDR1")
    private String streetAddr1;
    /**
     * Nation
     * <p>
     * Lineage reference object : STVSITE_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCode")
    @JsonPropertyDescription("Lineage reference object : STVSITE_NATN_CODE, Lookup lineage reference object : stvnatn")
    private String natnCode;
    /**
     * City
     * <p>
     * Lineage reference object : STVSITE_CITY
     * (Required)
     * 
     */
    @JsonProperty("city")
    @JsonPropertyDescription("Lineage reference object : STVSITE_CITY")
    private String city;
    /**
     * House Number
     * <p>
     * Lineage reference object : STVSITE_HOUSE_NUMBER
     * 
     */
    @JsonProperty("houseNumber")
    @JsonPropertyDescription("Lineage reference object : STVSITE_HOUSE_NUMBER")
    private String houseNumber;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVSITE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : STVSITE_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * State or Province
     * <p>
     * Lineage reference object : STVSITE_STATE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("state")
    @JsonPropertyDescription("Lineage reference object : STVSITE_STATE, Lookup lineage reference object : stvstat")
    private String state;
    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : STVSITE_ZIPC, Lookup lineage reference object : gtvzipc
     * 
     */
    @JsonProperty("zipc")
    @JsonPropertyDescription("Lineage reference object : STVSITE_ZIPC, Lookup lineage reference object : gtvzipc")
    private String zipc;
    /**
     * Street Line 4
     * <p>
     * Lineage reference object : STVSITE_STREET_ADDR4
     * 
     */
    @JsonProperty("streetAddr4")
    @JsonPropertyDescription("Lineage reference object : STVSITE_STREET_ADDR4")
    private String streetAddr4;
    /**
     * Description
     * <p>
     * Lineage reference object : STVSITE_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVSITE_DESC")
    private String desc;
    /**
     * Other Description
     * <p>
     * Lineage reference object : STVSITE_FOREIGN_COUNTRY
     * 
     */
    @JsonProperty("foreignCountry")
    @JsonPropertyDescription("Lineage reference object : STVSITE_FOREIGN_COUNTRY")
    private String foreignCountry;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Street Line 2
     * <p>
     * Lineage reference object : STVSITE_STREET_ADDR2
     * 
     */
    @JsonProperty("streetAddr2")
    public String getStreetAddr2() {
        return streetAddr2;
    }

    /**
     * Street Line 2
     * <p>
     * Lineage reference object : STVSITE_STREET_ADDR2
     * 
     */
    @JsonProperty("streetAddr2")
    public void setStreetAddr2(String streetAddr2) {
        this.streetAddr2 = streetAddr2;
    }

    public SiteCodes100GetRequest withStreetAddr2(String streetAddr2) {
        this.streetAddr2 = streetAddr2;
        return this;
    }

    /**
     * Street Line 3
     * <p>
     * Lineage reference object : STVSITE_STREET_ADDR3
     * 
     */
    @JsonProperty("streetAddr3")
    public String getStreetAddr3() {
        return streetAddr3;
    }

    /**
     * Street Line 3
     * <p>
     * Lineage reference object : STVSITE_STREET_ADDR3
     * 
     */
    @JsonProperty("streetAddr3")
    public void setStreetAddr3(String streetAddr3) {
        this.streetAddr3 = streetAddr3;
    }

    public SiteCodes100GetRequest withStreetAddr3(String streetAddr3) {
        this.streetAddr3 = streetAddr3;
        return this;
    }

    /**
     * Site Code
     * <p>
     * Lineage reference object : STVSITE_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Site Code
     * <p>
     * Lineage reference object : STVSITE_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public SiteCodes100GetRequest withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Street Line 1
     * <p>
     * Lineage reference object : STVSITE_STREET_ADDR1
     * 
     */
    @JsonProperty("streetAddr1")
    public String getStreetAddr1() {
        return streetAddr1;
    }

    /**
     * Street Line 1
     * <p>
     * Lineage reference object : STVSITE_STREET_ADDR1
     * 
     */
    @JsonProperty("streetAddr1")
    public void setStreetAddr1(String streetAddr1) {
        this.streetAddr1 = streetAddr1;
    }

    public SiteCodes100GetRequest withStreetAddr1(String streetAddr1) {
        this.streetAddr1 = streetAddr1;
        return this;
    }

    /**
     * Nation
     * <p>
     * Lineage reference object : STVSITE_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCode")
    public String getNatnCode() {
        return natnCode;
    }

    /**
     * Nation
     * <p>
     * Lineage reference object : STVSITE_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCode")
    public void setNatnCode(String natnCode) {
        this.natnCode = natnCode;
    }

    public SiteCodes100GetRequest withNatnCode(String natnCode) {
        this.natnCode = natnCode;
        return this;
    }

    /**
     * City
     * <p>
     * Lineage reference object : STVSITE_CITY
     * (Required)
     * 
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * City
     * <p>
     * Lineage reference object : STVSITE_CITY
     * (Required)
     * 
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public SiteCodes100GetRequest withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * House Number
     * <p>
     * Lineage reference object : STVSITE_HOUSE_NUMBER
     * 
     */
    @JsonProperty("houseNumber")
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * House Number
     * <p>
     * Lineage reference object : STVSITE_HOUSE_NUMBER
     * 
     */
    @JsonProperty("houseNumber")
    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public SiteCodes100GetRequest withHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVSITE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVSITE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public SiteCodes100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * State or Province
     * <p>
     * Lineage reference object : STVSITE_STATE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * State or Province
     * <p>
     * Lineage reference object : STVSITE_STATE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    public SiteCodes100GetRequest withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : STVSITE_ZIPC, Lookup lineage reference object : gtvzipc
     * 
     */
    @JsonProperty("zipc")
    public String getZipc() {
        return zipc;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : STVSITE_ZIPC, Lookup lineage reference object : gtvzipc
     * 
     */
    @JsonProperty("zipc")
    public void setZipc(String zipc) {
        this.zipc = zipc;
    }

    public SiteCodes100GetRequest withZipc(String zipc) {
        this.zipc = zipc;
        return this;
    }

    /**
     * Street Line 4
     * <p>
     * Lineage reference object : STVSITE_STREET_ADDR4
     * 
     */
    @JsonProperty("streetAddr4")
    public String getStreetAddr4() {
        return streetAddr4;
    }

    /**
     * Street Line 4
     * <p>
     * Lineage reference object : STVSITE_STREET_ADDR4
     * 
     */
    @JsonProperty("streetAddr4")
    public void setStreetAddr4(String streetAddr4) {
        this.streetAddr4 = streetAddr4;
    }

    public SiteCodes100GetRequest withStreetAddr4(String streetAddr4) {
        this.streetAddr4 = streetAddr4;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVSITE_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVSITE_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public SiteCodes100GetRequest withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Other Description
     * <p>
     * Lineage reference object : STVSITE_FOREIGN_COUNTRY
     * 
     */
    @JsonProperty("foreignCountry")
    public String getForeignCountry() {
        return foreignCountry;
    }

    /**
     * Other Description
     * <p>
     * Lineage reference object : STVSITE_FOREIGN_COUNTRY
     * 
     */
    @JsonProperty("foreignCountry")
    public void setForeignCountry(String foreignCountry) {
        this.foreignCountry = foreignCountry;
    }

    public SiteCodes100GetRequest withForeignCountry(String foreignCountry) {
        this.foreignCountry = foreignCountry;
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

    public SiteCodes100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SiteCodes100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("streetAddr2");
        sb.append('=');
        sb.append(((this.streetAddr2 == null)?"<null>":this.streetAddr2));
        sb.append(',');
        sb.append("streetAddr3");
        sb.append('=');
        sb.append(((this.streetAddr3 == null)?"<null>":this.streetAddr3));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("streetAddr1");
        sb.append('=');
        sb.append(((this.streetAddr1 == null)?"<null>":this.streetAddr1));
        sb.append(',');
        sb.append("natnCode");
        sb.append('=');
        sb.append(((this.natnCode == null)?"<null>":this.natnCode));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("houseNumber");
        sb.append('=');
        sb.append(((this.houseNumber == null)?"<null>":this.houseNumber));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("zipc");
        sb.append('=');
        sb.append(((this.zipc == null)?"<null>":this.zipc));
        sb.append(',');
        sb.append("streetAddr4");
        sb.append('=');
        sb.append(((this.streetAddr4 == null)?"<null>":this.streetAddr4));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("foreignCountry");
        sb.append('=');
        sb.append(((this.foreignCountry == null)?"<null>":this.foreignCountry));
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
        result = ((result* 31)+((this.streetAddr2 == null)? 0 :this.streetAddr2 .hashCode()));
        result = ((result* 31)+((this.streetAddr3 == null)? 0 :this.streetAddr3 .hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.streetAddr1 == null)? 0 :this.streetAddr1 .hashCode()));
        result = ((result* 31)+((this.natnCode == null)? 0 :this.natnCode.hashCode()));
        result = ((result* 31)+((this.city == null)? 0 :this.city.hashCode()));
        result = ((result* 31)+((this.houseNumber == null)? 0 :this.houseNumber.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.state == null)? 0 :this.state.hashCode()));
        result = ((result* 31)+((this.zipc == null)? 0 :this.zipc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.streetAddr4 == null)? 0 :this.streetAddr4 .hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        result = ((result* 31)+((this.foreignCountry == null)? 0 :this.foreignCountry.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SiteCodes100GetRequest) == false) {
            return false;
        }
        SiteCodes100GetRequest rhs = ((SiteCodes100GetRequest) other);
        return (((((((((((((((this.streetAddr2 == rhs.streetAddr2)||((this.streetAddr2 != null)&&this.streetAddr2 .equals(rhs.streetAddr2)))&&((this.streetAddr3 == rhs.streetAddr3)||((this.streetAddr3 != null)&&this.streetAddr3 .equals(rhs.streetAddr3))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.streetAddr1 == rhs.streetAddr1)||((this.streetAddr1 != null)&&this.streetAddr1 .equals(rhs.streetAddr1))))&&((this.natnCode == rhs.natnCode)||((this.natnCode!= null)&&this.natnCode.equals(rhs.natnCode))))&&((this.city == rhs.city)||((this.city!= null)&&this.city.equals(rhs.city))))&&((this.houseNumber == rhs.houseNumber)||((this.houseNumber!= null)&&this.houseNumber.equals(rhs.houseNumber))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.state == rhs.state)||((this.state!= null)&&this.state.equals(rhs.state))))&&((this.zipc == rhs.zipc)||((this.zipc!= null)&&this.zipc.equals(rhs.zipc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.streetAddr4 == rhs.streetAddr4)||((this.streetAddr4 != null)&&this.streetAddr4 .equals(rhs.streetAddr4))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.foreignCountry == rhs.foreignCountry)||((this.foreignCountry!= null)&&this.foreignCountry.equals(rhs.foreignCountry))));
    }

}
