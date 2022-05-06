
package com.ellucian.generated.bpapi.ban.agency_code_information_address.v1_0_0;

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
    "streetLine2",
    "zip",
    "cntyCode",
    "streetLine1",
    "statCode",
    "preferredAddr",
    "preferredRegion",
    "seqno",
    "natnCode",
    "city",
    "streetLine4",
    "streetLine3",
    "toDate",
    "combinedMailing",
    "houseNumber",
    "asrcCode",
    "fromDate",
    "statusInd",
    "id",
    "gstTaxId",
    "atypCode"
})
@Generated("jsonschema2pojo")
public class AgencyCodeInformationAddress100GetRequest {

    /**
     * Street Line 2
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE2
     * 
     */
    @JsonProperty("streetLine2")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_STREET_LINE2")
    private String streetLine2;
    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : SPRADDR_ZIP
     * 
     */
    @JsonProperty("zip")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_ZIP")
    private String zip;
    /**
     * County
     * <p>
     * Lineage reference object : SPRADDR_CNTY_CODE, Lookup lineage reference object : stvcnty
     * 
     */
    @JsonProperty("cntyCode")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_CNTY_CODE, Lookup lineage reference object : stvcnty")
    private String cntyCode;
    /**
     * Street Line 1
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE1
     * 
     */
    @JsonProperty("streetLine1")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_STREET_LINE1")
    private String streetLine1;
    /**
     * State or Province
     * <p>
     * Lineage reference object : SPRADDR_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCode")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_STAT_CODE, Lookup lineage reference object : stvstat")
    private String statCode;
    /**
     * Preferred Address
     * <p>
     * 
     * 
     */
    @JsonProperty("preferredAddr")
    private String preferredAddr;
    /**
     * Preferred Region
     * <p>
     * 
     * 
     */
    @JsonProperty("preferredRegion")
    private String preferredRegion;
    /**
     * Sequence Number
     * <p>
     * Lineage reference object : SPRADDR_SEQNO
     * 
     */
    @JsonProperty("seqno")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_SEQNO")
    private Double seqno;
    /**
     * Nation
     * <p>
     * Lineage reference object : SPRADDR_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCode")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_NATN_CODE, Lookup lineage reference object : stvnatn")
    private String natnCode;
    /**
     * City
     * <p>
     * Lineage reference object : SPRADDR_CITY
     * 
     */
    @JsonProperty("city")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_CITY")
    private String city;
    /**
     * Street Line 4
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE4
     * 
     */
    @JsonProperty("streetLine4")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_STREET_LINE4")
    private String streetLine4;
    /**
     * Street Line 3
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE3
     * 
     */
    @JsonProperty("streetLine3")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_STREET_LINE3")
    private String streetLine3;
    /**
     * To Date
     * <p>
     * Lineage reference object : SPRADDR_TO_DATE
     * 
     */
    @JsonProperty("toDate")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_TO_DATE")
    private Date toDate;
    /**
     * Combined Mailing
     * <p>
     * 
     * 
     */
    @JsonProperty("combinedMailing")
    private String combinedMailing;
    /**
     * House Number
     * <p>
     * Lineage reference object : SPRADDR_HOUSE_NUMBER
     * 
     */
    @JsonProperty("houseNumber")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_HOUSE_NUMBER")
    private String houseNumber;
    /**
     * Source
     * <p>
     * Lineage reference object : SPRADDR_ASRC_CODE, Lookup lineage reference object : stvasrc
     * 
     */
    @JsonProperty("asrcCode")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_ASRC_CODE, Lookup lineage reference object : stvasrc")
    private String asrcCode;
    /**
     * From Date
     * <p>
     * Lineage reference object : SPRADDR_FROM_DATE
     * 
     */
    @JsonProperty("fromDate")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_FROM_DATE")
    private Date fromDate;
    /**
     * Inactivate Address
     * <p>
     * Lineage reference object : SPRADDR_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_STATUS_IND")
    private String statusInd;
    /**
     * Agency
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
    /**
     * Registration Number
     * <p>
     * Lineage reference object : SPRADDR_GST_TAX_ID
     * 
     */
    @JsonProperty("gstTaxId")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_GST_TAX_ID")
    private String gstTaxId;
    /**
     * Address Type
     * <p>
     * Lineage reference object : SPRADDR_ATYP_CODE, Lookup lineage reference object : stvatyp
     * (Required)
     * 
     */
    @JsonProperty("atypCode")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_ATYP_CODE, Lookup lineage reference object : stvatyp")
    private String atypCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Street Line 2
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE2
     * 
     */
    @JsonProperty("streetLine2")
    public String getStreetLine2() {
        return streetLine2;
    }

    /**
     * Street Line 2
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE2
     * 
     */
    @JsonProperty("streetLine2")
    public void setStreetLine2(String streetLine2) {
        this.streetLine2 = streetLine2;
    }

    public AgencyCodeInformationAddress100GetRequest withStreetLine2(String streetLine2) {
        this.streetLine2 = streetLine2;
        return this;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : SPRADDR_ZIP
     * 
     */
    @JsonProperty("zip")
    public String getZip() {
        return zip;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : SPRADDR_ZIP
     * 
     */
    @JsonProperty("zip")
    public void setZip(String zip) {
        this.zip = zip;
    }

    public AgencyCodeInformationAddress100GetRequest withZip(String zip) {
        this.zip = zip;
        return this;
    }

    /**
     * County
     * <p>
     * Lineage reference object : SPRADDR_CNTY_CODE, Lookup lineage reference object : stvcnty
     * 
     */
    @JsonProperty("cntyCode")
    public String getCntyCode() {
        return cntyCode;
    }

    /**
     * County
     * <p>
     * Lineage reference object : SPRADDR_CNTY_CODE, Lookup lineage reference object : stvcnty
     * 
     */
    @JsonProperty("cntyCode")
    public void setCntyCode(String cntyCode) {
        this.cntyCode = cntyCode;
    }

    public AgencyCodeInformationAddress100GetRequest withCntyCode(String cntyCode) {
        this.cntyCode = cntyCode;
        return this;
    }

    /**
     * Street Line 1
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE1
     * 
     */
    @JsonProperty("streetLine1")
    public String getStreetLine1() {
        return streetLine1;
    }

    /**
     * Street Line 1
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE1
     * 
     */
    @JsonProperty("streetLine1")
    public void setStreetLine1(String streetLine1) {
        this.streetLine1 = streetLine1;
    }

    public AgencyCodeInformationAddress100GetRequest withStreetLine1(String streetLine1) {
        this.streetLine1 = streetLine1;
        return this;
    }

    /**
     * State or Province
     * <p>
     * Lineage reference object : SPRADDR_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCode")
    public String getStatCode() {
        return statCode;
    }

    /**
     * State or Province
     * <p>
     * Lineage reference object : SPRADDR_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCode")
    public void setStatCode(String statCode) {
        this.statCode = statCode;
    }

    public AgencyCodeInformationAddress100GetRequest withStatCode(String statCode) {
        this.statCode = statCode;
        return this;
    }

    /**
     * Preferred Address
     * <p>
     * 
     * 
     */
    @JsonProperty("preferredAddr")
    public String getPreferredAddr() {
        return preferredAddr;
    }

    /**
     * Preferred Address
     * <p>
     * 
     * 
     */
    @JsonProperty("preferredAddr")
    public void setPreferredAddr(String preferredAddr) {
        this.preferredAddr = preferredAddr;
    }

    public AgencyCodeInformationAddress100GetRequest withPreferredAddr(String preferredAddr) {
        this.preferredAddr = preferredAddr;
        return this;
    }

    /**
     * Preferred Region
     * <p>
     * 
     * 
     */
    @JsonProperty("preferredRegion")
    public String getPreferredRegion() {
        return preferredRegion;
    }

    /**
     * Preferred Region
     * <p>
     * 
     * 
     */
    @JsonProperty("preferredRegion")
    public void setPreferredRegion(String preferredRegion) {
        this.preferredRegion = preferredRegion;
    }

    public AgencyCodeInformationAddress100GetRequest withPreferredRegion(String preferredRegion) {
        this.preferredRegion = preferredRegion;
        return this;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : SPRADDR_SEQNO
     * 
     */
    @JsonProperty("seqno")
    public Double getSeqno() {
        return seqno;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : SPRADDR_SEQNO
     * 
     */
    @JsonProperty("seqno")
    public void setSeqno(Double seqno) {
        this.seqno = seqno;
    }

    public AgencyCodeInformationAddress100GetRequest withSeqno(Double seqno) {
        this.seqno = seqno;
        return this;
    }

    /**
     * Nation
     * <p>
     * Lineage reference object : SPRADDR_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCode")
    public String getNatnCode() {
        return natnCode;
    }

    /**
     * Nation
     * <p>
     * Lineage reference object : SPRADDR_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCode")
    public void setNatnCode(String natnCode) {
        this.natnCode = natnCode;
    }

    public AgencyCodeInformationAddress100GetRequest withNatnCode(String natnCode) {
        this.natnCode = natnCode;
        return this;
    }

    /**
     * City
     * <p>
     * Lineage reference object : SPRADDR_CITY
     * 
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * City
     * <p>
     * Lineage reference object : SPRADDR_CITY
     * 
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public AgencyCodeInformationAddress100GetRequest withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Street Line 4
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE4
     * 
     */
    @JsonProperty("streetLine4")
    public String getStreetLine4() {
        return streetLine4;
    }

    /**
     * Street Line 4
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE4
     * 
     */
    @JsonProperty("streetLine4")
    public void setStreetLine4(String streetLine4) {
        this.streetLine4 = streetLine4;
    }

    public AgencyCodeInformationAddress100GetRequest withStreetLine4(String streetLine4) {
        this.streetLine4 = streetLine4;
        return this;
    }

    /**
     * Street Line 3
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE3
     * 
     */
    @JsonProperty("streetLine3")
    public String getStreetLine3() {
        return streetLine3;
    }

    /**
     * Street Line 3
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE3
     * 
     */
    @JsonProperty("streetLine3")
    public void setStreetLine3(String streetLine3) {
        this.streetLine3 = streetLine3;
    }

    public AgencyCodeInformationAddress100GetRequest withStreetLine3(String streetLine3) {
        this.streetLine3 = streetLine3;
        return this;
    }

    /**
     * To Date
     * <p>
     * Lineage reference object : SPRADDR_TO_DATE
     * 
     */
    @JsonProperty("toDate")
    public Date getToDate() {
        return toDate;
    }

    /**
     * To Date
     * <p>
     * Lineage reference object : SPRADDR_TO_DATE
     * 
     */
    @JsonProperty("toDate")
    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public AgencyCodeInformationAddress100GetRequest withToDate(Date toDate) {
        this.toDate = toDate;
        return this;
    }

    /**
     * Combined Mailing
     * <p>
     * 
     * 
     */
    @JsonProperty("combinedMailing")
    public String getCombinedMailing() {
        return combinedMailing;
    }

    /**
     * Combined Mailing
     * <p>
     * 
     * 
     */
    @JsonProperty("combinedMailing")
    public void setCombinedMailing(String combinedMailing) {
        this.combinedMailing = combinedMailing;
    }

    public AgencyCodeInformationAddress100GetRequest withCombinedMailing(String combinedMailing) {
        this.combinedMailing = combinedMailing;
        return this;
    }

    /**
     * House Number
     * <p>
     * Lineage reference object : SPRADDR_HOUSE_NUMBER
     * 
     */
    @JsonProperty("houseNumber")
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * House Number
     * <p>
     * Lineage reference object : SPRADDR_HOUSE_NUMBER
     * 
     */
    @JsonProperty("houseNumber")
    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public AgencyCodeInformationAddress100GetRequest withHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
        return this;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : SPRADDR_ASRC_CODE, Lookup lineage reference object : stvasrc
     * 
     */
    @JsonProperty("asrcCode")
    public String getAsrcCode() {
        return asrcCode;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : SPRADDR_ASRC_CODE, Lookup lineage reference object : stvasrc
     * 
     */
    @JsonProperty("asrcCode")
    public void setAsrcCode(String asrcCode) {
        this.asrcCode = asrcCode;
    }

    public AgencyCodeInformationAddress100GetRequest withAsrcCode(String asrcCode) {
        this.asrcCode = asrcCode;
        return this;
    }

    /**
     * From Date
     * <p>
     * Lineage reference object : SPRADDR_FROM_DATE
     * 
     */
    @JsonProperty("fromDate")
    public Date getFromDate() {
        return fromDate;
    }

    /**
     * From Date
     * <p>
     * Lineage reference object : SPRADDR_FROM_DATE
     * 
     */
    @JsonProperty("fromDate")
    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public AgencyCodeInformationAddress100GetRequest withFromDate(Date fromDate) {
        this.fromDate = fromDate;
        return this;
    }

    /**
     * Inactivate Address
     * <p>
     * Lineage reference object : SPRADDR_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public String getStatusInd() {
        return statusInd;
    }

    /**
     * Inactivate Address
     * <p>
     * Lineage reference object : SPRADDR_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public void setStatusInd(String statusInd) {
        this.statusInd = statusInd;
    }

    public AgencyCodeInformationAddress100GetRequest withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * Agency
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * Agency
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public AgencyCodeInformationAddress100GetRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Registration Number
     * <p>
     * Lineage reference object : SPRADDR_GST_TAX_ID
     * 
     */
    @JsonProperty("gstTaxId")
    public String getGstTaxId() {
        return gstTaxId;
    }

    /**
     * Registration Number
     * <p>
     * Lineage reference object : SPRADDR_GST_TAX_ID
     * 
     */
    @JsonProperty("gstTaxId")
    public void setGstTaxId(String gstTaxId) {
        this.gstTaxId = gstTaxId;
    }

    public AgencyCodeInformationAddress100GetRequest withGstTaxId(String gstTaxId) {
        this.gstTaxId = gstTaxId;
        return this;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : SPRADDR_ATYP_CODE, Lookup lineage reference object : stvatyp
     * (Required)
     * 
     */
    @JsonProperty("atypCode")
    public String getAtypCode() {
        return atypCode;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : SPRADDR_ATYP_CODE, Lookup lineage reference object : stvatyp
     * (Required)
     * 
     */
    @JsonProperty("atypCode")
    public void setAtypCode(String atypCode) {
        this.atypCode = atypCode;
    }

    public AgencyCodeInformationAddress100GetRequest withAtypCode(String atypCode) {
        this.atypCode = atypCode;
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

    public AgencyCodeInformationAddress100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AgencyCodeInformationAddress100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("streetLine2");
        sb.append('=');
        sb.append(((this.streetLine2 == null)?"<null>":this.streetLine2));
        sb.append(',');
        sb.append("zip");
        sb.append('=');
        sb.append(((this.zip == null)?"<null>":this.zip));
        sb.append(',');
        sb.append("cntyCode");
        sb.append('=');
        sb.append(((this.cntyCode == null)?"<null>":this.cntyCode));
        sb.append(',');
        sb.append("streetLine1");
        sb.append('=');
        sb.append(((this.streetLine1 == null)?"<null>":this.streetLine1));
        sb.append(',');
        sb.append("statCode");
        sb.append('=');
        sb.append(((this.statCode == null)?"<null>":this.statCode));
        sb.append(',');
        sb.append("preferredAddr");
        sb.append('=');
        sb.append(((this.preferredAddr == null)?"<null>":this.preferredAddr));
        sb.append(',');
        sb.append("preferredRegion");
        sb.append('=');
        sb.append(((this.preferredRegion == null)?"<null>":this.preferredRegion));
        sb.append(',');
        sb.append("seqno");
        sb.append('=');
        sb.append(((this.seqno == null)?"<null>":this.seqno));
        sb.append(',');
        sb.append("natnCode");
        sb.append('=');
        sb.append(((this.natnCode == null)?"<null>":this.natnCode));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("streetLine4");
        sb.append('=');
        sb.append(((this.streetLine4 == null)?"<null>":this.streetLine4));
        sb.append(',');
        sb.append("streetLine3");
        sb.append('=');
        sb.append(((this.streetLine3 == null)?"<null>":this.streetLine3));
        sb.append(',');
        sb.append("toDate");
        sb.append('=');
        sb.append(((this.toDate == null)?"<null>":this.toDate));
        sb.append(',');
        sb.append("combinedMailing");
        sb.append('=');
        sb.append(((this.combinedMailing == null)?"<null>":this.combinedMailing));
        sb.append(',');
        sb.append("houseNumber");
        sb.append('=');
        sb.append(((this.houseNumber == null)?"<null>":this.houseNumber));
        sb.append(',');
        sb.append("asrcCode");
        sb.append('=');
        sb.append(((this.asrcCode == null)?"<null>":this.asrcCode));
        sb.append(',');
        sb.append("fromDate");
        sb.append('=');
        sb.append(((this.fromDate == null)?"<null>":this.fromDate));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("gstTaxId");
        sb.append('=');
        sb.append(((this.gstTaxId == null)?"<null>":this.gstTaxId));
        sb.append(',');
        sb.append("atypCode");
        sb.append('=');
        sb.append(((this.atypCode == null)?"<null>":this.atypCode));
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
        result = ((result* 31)+((this.streetLine2 == null)? 0 :this.streetLine2 .hashCode()));
        result = ((result* 31)+((this.zip == null)? 0 :this.zip.hashCode()));
        result = ((result* 31)+((this.cntyCode == null)? 0 :this.cntyCode.hashCode()));
        result = ((result* 31)+((this.streetLine1 == null)? 0 :this.streetLine1 .hashCode()));
        result = ((result* 31)+((this.statCode == null)? 0 :this.statCode.hashCode()));
        result = ((result* 31)+((this.preferredAddr == null)? 0 :this.preferredAddr.hashCode()));
        result = ((result* 31)+((this.preferredRegion == null)? 0 :this.preferredRegion.hashCode()));
        result = ((result* 31)+((this.seqno == null)? 0 :this.seqno.hashCode()));
        result = ((result* 31)+((this.natnCode == null)? 0 :this.natnCode.hashCode()));
        result = ((result* 31)+((this.city == null)? 0 :this.city.hashCode()));
        result = ((result* 31)+((this.streetLine4 == null)? 0 :this.streetLine4 .hashCode()));
        result = ((result* 31)+((this.streetLine3 == null)? 0 :this.streetLine3 .hashCode()));
        result = ((result* 31)+((this.toDate == null)? 0 :this.toDate.hashCode()));
        result = ((result* 31)+((this.combinedMailing == null)? 0 :this.combinedMailing.hashCode()));
        result = ((result* 31)+((this.houseNumber == null)? 0 :this.houseNumber.hashCode()));
        result = ((result* 31)+((this.asrcCode == null)? 0 :this.asrcCode.hashCode()));
        result = ((result* 31)+((this.fromDate == null)? 0 :this.fromDate.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.gstTaxId == null)? 0 :this.gstTaxId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.atypCode == null)? 0 :this.atypCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AgencyCodeInformationAddress100GetRequest) == false) {
            return false;
        }
        AgencyCodeInformationAddress100GetRequest rhs = ((AgencyCodeInformationAddress100GetRequest) other);
        return (((((((((((((((((((((((this.streetLine2 == rhs.streetLine2)||((this.streetLine2 != null)&&this.streetLine2 .equals(rhs.streetLine2)))&&((this.zip == rhs.zip)||((this.zip!= null)&&this.zip.equals(rhs.zip))))&&((this.cntyCode == rhs.cntyCode)||((this.cntyCode!= null)&&this.cntyCode.equals(rhs.cntyCode))))&&((this.streetLine1 == rhs.streetLine1)||((this.streetLine1 != null)&&this.streetLine1 .equals(rhs.streetLine1))))&&((this.statCode == rhs.statCode)||((this.statCode!= null)&&this.statCode.equals(rhs.statCode))))&&((this.preferredAddr == rhs.preferredAddr)||((this.preferredAddr!= null)&&this.preferredAddr.equals(rhs.preferredAddr))))&&((this.preferredRegion == rhs.preferredRegion)||((this.preferredRegion!= null)&&this.preferredRegion.equals(rhs.preferredRegion))))&&((this.seqno == rhs.seqno)||((this.seqno!= null)&&this.seqno.equals(rhs.seqno))))&&((this.natnCode == rhs.natnCode)||((this.natnCode!= null)&&this.natnCode.equals(rhs.natnCode))))&&((this.city == rhs.city)||((this.city!= null)&&this.city.equals(rhs.city))))&&((this.streetLine4 == rhs.streetLine4)||((this.streetLine4 != null)&&this.streetLine4 .equals(rhs.streetLine4))))&&((this.streetLine3 == rhs.streetLine3)||((this.streetLine3 != null)&&this.streetLine3 .equals(rhs.streetLine3))))&&((this.toDate == rhs.toDate)||((this.toDate!= null)&&this.toDate.equals(rhs.toDate))))&&((this.combinedMailing == rhs.combinedMailing)||((this.combinedMailing!= null)&&this.combinedMailing.equals(rhs.combinedMailing))))&&((this.houseNumber == rhs.houseNumber)||((this.houseNumber!= null)&&this.houseNumber.equals(rhs.houseNumber))))&&((this.asrcCode == rhs.asrcCode)||((this.asrcCode!= null)&&this.asrcCode.equals(rhs.asrcCode))))&&((this.fromDate == rhs.fromDate)||((this.fromDate!= null)&&this.fromDate.equals(rhs.fromDate))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.gstTaxId == rhs.gstTaxId)||((this.gstTaxId!= null)&&this.gstTaxId.equals(rhs.gstTaxId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.atypCode == rhs.atypCode)||((this.atypCode!= null)&&this.atypCode.equals(rhs.atypCode))));
    }

}
