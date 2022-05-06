
package com.ellucian.generated.bpapi.ban.miscellaneous_transaction.v1_0_0;

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
    "natnDesc",
    "streetLine2",
    "zip",
    "streetLine1",
    "createSource",
    "statCode",
    "natnCode",
    "city",
    "streetLine3",
    "name",
    "atypCode",
    "atypSeqno"
})
@Generated("jsonschema2pojo")
public class Tbbmisc {

    @JsonProperty("natnDesc")
    private String natnDesc;
    /**
     * Street Line 2
     * <p>
     * Lineage reference object : TBBMISC_STREET_LINE2
     * 
     */
    @JsonProperty("streetLine2")
    @JsonPropertyDescription("Lineage reference object : TBBMISC_STREET_LINE2")
    private String streetLine2;
    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : TBBMISC_ZIP, Lookup lineage reference object : gtvzipc
     * 
     */
    @JsonProperty("zip")
    @JsonPropertyDescription("Lineage reference object : TBBMISC_ZIP, Lookup lineage reference object : gtvzipc")
    private String zip;
    /**
     * Street Line 1
     * <p>
     * Lineage reference object : TBBMISC_STREET_LINE1
     * 
     */
    @JsonProperty("streetLine1")
    @JsonPropertyDescription("Lineage reference object : TBBMISC_STREET_LINE1")
    private String streetLine1;
    /**
     * Create Source
     * <p>
     * Lineage reference object : TBBMISC_CREATE_SOURCE
     * 
     */
    @JsonProperty("createSource")
    @JsonPropertyDescription("Lineage reference object : TBBMISC_CREATE_SOURCE")
    private String createSource;
    /**
     * State or Province
     * <p>
     * Lineage reference object : TBBMISC_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCode")
    @JsonPropertyDescription("Lineage reference object : TBBMISC_STAT_CODE, Lookup lineage reference object : stvstat")
    private String statCode;
    /**
     * Nation
     * <p>
     * Lineage reference object : TBBMISC_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCode")
    @JsonPropertyDescription("Lineage reference object : TBBMISC_NATN_CODE, Lookup lineage reference object : stvnatn")
    private String natnCode;
    /**
     * City
     * <p>
     * Lineage reference object : TBBMISC_CITY
     * 
     */
    @JsonProperty("city")
    @JsonPropertyDescription("Lineage reference object : TBBMISC_CITY")
    private String city;
    /**
     * Street Line 3
     * <p>
     * Lineage reference object : TBBMISC_STREET_LINE3
     * 
     */
    @JsonProperty("streetLine3")
    @JsonPropertyDescription("Lineage reference object : TBBMISC_STREET_LINE3")
    private String streetLine3;
    /**
     * Name
     * <p>
     * Lineage reference object : TBBMISC_NAME
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Lineage reference object : TBBMISC_NAME")
    private String name;
    /**
     * Address Type
     * <p>
     * 
     * 
     */
    @JsonProperty("atypCode")
    private String atypCode;
    /**
     * Sequence Number
     * <p>
     * 
     * 
     */
    @JsonProperty("atypSeqno")
    private Double atypSeqno;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("natnDesc")
    public String getNatnDesc() {
        return natnDesc;
    }

    @JsonProperty("natnDesc")
    public void setNatnDesc(String natnDesc) {
        this.natnDesc = natnDesc;
    }

    public Tbbmisc withNatnDesc(String natnDesc) {
        this.natnDesc = natnDesc;
        return this;
    }

    /**
     * Street Line 2
     * <p>
     * Lineage reference object : TBBMISC_STREET_LINE2
     * 
     */
    @JsonProperty("streetLine2")
    public String getStreetLine2() {
        return streetLine2;
    }

    /**
     * Street Line 2
     * <p>
     * Lineage reference object : TBBMISC_STREET_LINE2
     * 
     */
    @JsonProperty("streetLine2")
    public void setStreetLine2(String streetLine2) {
        this.streetLine2 = streetLine2;
    }

    public Tbbmisc withStreetLine2(String streetLine2) {
        this.streetLine2 = streetLine2;
        return this;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : TBBMISC_ZIP, Lookup lineage reference object : gtvzipc
     * 
     */
    @JsonProperty("zip")
    public String getZip() {
        return zip;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : TBBMISC_ZIP, Lookup lineage reference object : gtvzipc
     * 
     */
    @JsonProperty("zip")
    public void setZip(String zip) {
        this.zip = zip;
    }

    public Tbbmisc withZip(String zip) {
        this.zip = zip;
        return this;
    }

    /**
     * Street Line 1
     * <p>
     * Lineage reference object : TBBMISC_STREET_LINE1
     * 
     */
    @JsonProperty("streetLine1")
    public String getStreetLine1() {
        return streetLine1;
    }

    /**
     * Street Line 1
     * <p>
     * Lineage reference object : TBBMISC_STREET_LINE1
     * 
     */
    @JsonProperty("streetLine1")
    public void setStreetLine1(String streetLine1) {
        this.streetLine1 = streetLine1;
    }

    public Tbbmisc withStreetLine1(String streetLine1) {
        this.streetLine1 = streetLine1;
        return this;
    }

    /**
     * Create Source
     * <p>
     * Lineage reference object : TBBMISC_CREATE_SOURCE
     * 
     */
    @JsonProperty("createSource")
    public String getCreateSource() {
        return createSource;
    }

    /**
     * Create Source
     * <p>
     * Lineage reference object : TBBMISC_CREATE_SOURCE
     * 
     */
    @JsonProperty("createSource")
    public void setCreateSource(String createSource) {
        this.createSource = createSource;
    }

    public Tbbmisc withCreateSource(String createSource) {
        this.createSource = createSource;
        return this;
    }

    /**
     * State or Province
     * <p>
     * Lineage reference object : TBBMISC_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCode")
    public String getStatCode() {
        return statCode;
    }

    /**
     * State or Province
     * <p>
     * Lineage reference object : TBBMISC_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCode")
    public void setStatCode(String statCode) {
        this.statCode = statCode;
    }

    public Tbbmisc withStatCode(String statCode) {
        this.statCode = statCode;
        return this;
    }

    /**
     * Nation
     * <p>
     * Lineage reference object : TBBMISC_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCode")
    public String getNatnCode() {
        return natnCode;
    }

    /**
     * Nation
     * <p>
     * Lineage reference object : TBBMISC_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCode")
    public void setNatnCode(String natnCode) {
        this.natnCode = natnCode;
    }

    public Tbbmisc withNatnCode(String natnCode) {
        this.natnCode = natnCode;
        return this;
    }

    /**
     * City
     * <p>
     * Lineage reference object : TBBMISC_CITY
     * 
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * City
     * <p>
     * Lineage reference object : TBBMISC_CITY
     * 
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public Tbbmisc withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Street Line 3
     * <p>
     * Lineage reference object : TBBMISC_STREET_LINE3
     * 
     */
    @JsonProperty("streetLine3")
    public String getStreetLine3() {
        return streetLine3;
    }

    /**
     * Street Line 3
     * <p>
     * Lineage reference object : TBBMISC_STREET_LINE3
     * 
     */
    @JsonProperty("streetLine3")
    public void setStreetLine3(String streetLine3) {
        this.streetLine3 = streetLine3;
    }

    public Tbbmisc withStreetLine3(String streetLine3) {
        this.streetLine3 = streetLine3;
        return this;
    }

    /**
     * Name
     * <p>
     * Lineage reference object : TBBMISC_NAME
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name
     * <p>
     * Lineage reference object : TBBMISC_NAME
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Tbbmisc withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Address Type
     * <p>
     * 
     * 
     */
    @JsonProperty("atypCode")
    public String getAtypCode() {
        return atypCode;
    }

    /**
     * Address Type
     * <p>
     * 
     * 
     */
    @JsonProperty("atypCode")
    public void setAtypCode(String atypCode) {
        this.atypCode = atypCode;
    }

    public Tbbmisc withAtypCode(String atypCode) {
        this.atypCode = atypCode;
        return this;
    }

    /**
     * Sequence Number
     * <p>
     * 
     * 
     */
    @JsonProperty("atypSeqno")
    public Double getAtypSeqno() {
        return atypSeqno;
    }

    /**
     * Sequence Number
     * <p>
     * 
     * 
     */
    @JsonProperty("atypSeqno")
    public void setAtypSeqno(Double atypSeqno) {
        this.atypSeqno = atypSeqno;
    }

    public Tbbmisc withAtypSeqno(Double atypSeqno) {
        this.atypSeqno = atypSeqno;
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

    public Tbbmisc withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Tbbmisc.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("natnDesc");
        sb.append('=');
        sb.append(((this.natnDesc == null)?"<null>":this.natnDesc));
        sb.append(',');
        sb.append("streetLine2");
        sb.append('=');
        sb.append(((this.streetLine2 == null)?"<null>":this.streetLine2));
        sb.append(',');
        sb.append("zip");
        sb.append('=');
        sb.append(((this.zip == null)?"<null>":this.zip));
        sb.append(',');
        sb.append("streetLine1");
        sb.append('=');
        sb.append(((this.streetLine1 == null)?"<null>":this.streetLine1));
        sb.append(',');
        sb.append("createSource");
        sb.append('=');
        sb.append(((this.createSource == null)?"<null>":this.createSource));
        sb.append(',');
        sb.append("statCode");
        sb.append('=');
        sb.append(((this.statCode == null)?"<null>":this.statCode));
        sb.append(',');
        sb.append("natnCode");
        sb.append('=');
        sb.append(((this.natnCode == null)?"<null>":this.natnCode));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("streetLine3");
        sb.append('=');
        sb.append(((this.streetLine3 == null)?"<null>":this.streetLine3));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("atypCode");
        sb.append('=');
        sb.append(((this.atypCode == null)?"<null>":this.atypCode));
        sb.append(',');
        sb.append("atypSeqno");
        sb.append('=');
        sb.append(((this.atypSeqno == null)?"<null>":this.atypSeqno));
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
        result = ((result* 31)+((this.natnDesc == null)? 0 :this.natnDesc.hashCode()));
        result = ((result* 31)+((this.streetLine2 == null)? 0 :this.streetLine2 .hashCode()));
        result = ((result* 31)+((this.zip == null)? 0 :this.zip.hashCode()));
        result = ((result* 31)+((this.streetLine1 == null)? 0 :this.streetLine1 .hashCode()));
        result = ((result* 31)+((this.statCode == null)? 0 :this.statCode.hashCode()));
        result = ((result* 31)+((this.natnCode == null)? 0 :this.natnCode.hashCode()));
        result = ((result* 31)+((this.city == null)? 0 :this.city.hashCode()));
        result = ((result* 31)+((this.streetLine3 == null)? 0 :this.streetLine3 .hashCode()));
        result = ((result* 31)+((this.createSource == null)? 0 :this.createSource.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.atypCode == null)? 0 :this.atypCode.hashCode()));
        result = ((result* 31)+((this.atypSeqno == null)? 0 :this.atypSeqno.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tbbmisc) == false) {
            return false;
        }
        Tbbmisc rhs = ((Tbbmisc) other);
        return ((((((((((((((this.natnDesc == rhs.natnDesc)||((this.natnDesc!= null)&&this.natnDesc.equals(rhs.natnDesc)))&&((this.streetLine2 == rhs.streetLine2)||((this.streetLine2 != null)&&this.streetLine2 .equals(rhs.streetLine2))))&&((this.zip == rhs.zip)||((this.zip!= null)&&this.zip.equals(rhs.zip))))&&((this.streetLine1 == rhs.streetLine1)||((this.streetLine1 != null)&&this.streetLine1 .equals(rhs.streetLine1))))&&((this.statCode == rhs.statCode)||((this.statCode!= null)&&this.statCode.equals(rhs.statCode))))&&((this.natnCode == rhs.natnCode)||((this.natnCode!= null)&&this.natnCode.equals(rhs.natnCode))))&&((this.city == rhs.city)||((this.city!= null)&&this.city.equals(rhs.city))))&&((this.streetLine3 == rhs.streetLine3)||((this.streetLine3 != null)&&this.streetLine3 .equals(rhs.streetLine3))))&&((this.createSource == rhs.createSource)||((this.createSource!= null)&&this.createSource.equals(rhs.createSource))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.atypCode == rhs.atypCode)||((this.atypCode!= null)&&this.atypCode.equals(rhs.atypCode))))&&((this.atypSeqno == rhs.atypSeqno)||((this.atypSeqno!= null)&&this.atypSeqno.equals(rhs.atypSeqno))));
    }

}
