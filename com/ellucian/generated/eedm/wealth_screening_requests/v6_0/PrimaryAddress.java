
package com.ellucian.generated.eedm.wealth_screening_requests.v6_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Primary Address
 * <p>
 * The primary mail or residential address
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "streetLine1",
    "streetLine2",
    "city",
    "region",
    "postalCode",
    "country"
})
@Generated("jsonschema2pojo")
public class PrimaryAddress {

    /**
     * Street Line 1
     * <p>
     * Line 1 of the street address
     * 
     */
    @JsonProperty("streetLine1")
    @JsonPropertyDescription("Line 1 of the street address")
    private String streetLine1;
    /**
     * Street Line 2
     * <p>
     * Line 2 of the street address
     * 
     */
    @JsonProperty("streetLine2")
    @JsonPropertyDescription("Line 2 of the street address")
    private String streetLine2;
    /**
     * City
     * <p>
     * The city of residence
     * 
     */
    @JsonProperty("city")
    @JsonPropertyDescription("The city of residence")
    private String city;
    /**
     * Region
     * <p>
     * The region within the country (state or province), in which the person resides
     * 
     */
    @JsonProperty("region")
    @JsonPropertyDescription("The region within the country (state or province), in which the person resides")
    private String region;
    /**
     * Postal Code
     * <p>
     * The postal (ZIP) code
     * 
     */
    @JsonProperty("postalCode")
    @JsonPropertyDescription("The postal (ZIP) code")
    private String postalCode;
    /**
     * Country
     * <p>
     * The ISO 3166-1 alpha-3 code of the country of residence
     * 
     */
    @JsonProperty("country")
    @JsonPropertyDescription("The ISO 3166-1 alpha-3 code of the country of residence")
    private PrimaryAddress.Country country;

    /**
     * Street Line 1
     * <p>
     * Line 1 of the street address
     * 
     */
    @JsonProperty("streetLine1")
    public String getStreetLine1() {
        return streetLine1;
    }

    /**
     * Street Line 1
     * <p>
     * Line 1 of the street address
     * 
     */
    @JsonProperty("streetLine1")
    public void setStreetLine1(String streetLine1) {
        this.streetLine1 = streetLine1;
    }

    public PrimaryAddress withStreetLine1(String streetLine1) {
        this.streetLine1 = streetLine1;
        return this;
    }

    /**
     * Street Line 2
     * <p>
     * Line 2 of the street address
     * 
     */
    @JsonProperty("streetLine2")
    public String getStreetLine2() {
        return streetLine2;
    }

    /**
     * Street Line 2
     * <p>
     * Line 2 of the street address
     * 
     */
    @JsonProperty("streetLine2")
    public void setStreetLine2(String streetLine2) {
        this.streetLine2 = streetLine2;
    }

    public PrimaryAddress withStreetLine2(String streetLine2) {
        this.streetLine2 = streetLine2;
        return this;
    }

    /**
     * City
     * <p>
     * The city of residence
     * 
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * City
     * <p>
     * The city of residence
     * 
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public PrimaryAddress withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Region
     * <p>
     * The region within the country (state or province), in which the person resides
     * 
     */
    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    /**
     * Region
     * <p>
     * The region within the country (state or province), in which the person resides
     * 
     */
    @JsonProperty("region")
    public void setRegion(String region) {
        this.region = region;
    }

    public PrimaryAddress withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Postal Code
     * <p>
     * The postal (ZIP) code
     * 
     */
    @JsonProperty("postalCode")
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Postal Code
     * <p>
     * The postal (ZIP) code
     * 
     */
    @JsonProperty("postalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public PrimaryAddress withPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     * Country
     * <p>
     * The ISO 3166-1 alpha-3 code of the country of residence
     * 
     */
    @JsonProperty("country")
    public PrimaryAddress.Country getCountry() {
        return country;
    }

    /**
     * Country
     * <p>
     * The ISO 3166-1 alpha-3 code of the country of residence
     * 
     */
    @JsonProperty("country")
    public void setCountry(PrimaryAddress.Country country) {
        this.country = country;
    }

    public PrimaryAddress withCountry(PrimaryAddress.Country country) {
        this.country = country;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PrimaryAddress.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("streetLine1");
        sb.append('=');
        sb.append(((this.streetLine1 == null)?"<null>":this.streetLine1));
        sb.append(',');
        sb.append("streetLine2");
        sb.append('=');
        sb.append(((this.streetLine2 == null)?"<null>":this.streetLine2));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("region");
        sb.append('=');
        sb.append(((this.region == null)?"<null>":this.region));
        sb.append(',');
        sb.append("postalCode");
        sb.append('=');
        sb.append(((this.postalCode == null)?"<null>":this.postalCode));
        sb.append(',');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
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
        result = ((result* 31)+((this.streetLine1 == null)? 0 :this.streetLine1 .hashCode()));
        result = ((result* 31)+((this.country == null)? 0 :this.country.hashCode()));
        result = ((result* 31)+((this.city == null)? 0 :this.city.hashCode()));
        result = ((result* 31)+((this.postalCode == null)? 0 :this.postalCode.hashCode()));
        result = ((result* 31)+((this.region == null)? 0 :this.region.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PrimaryAddress) == false) {
            return false;
        }
        PrimaryAddress rhs = ((PrimaryAddress) other);
        return (((((((this.streetLine2 == rhs.streetLine2)||((this.streetLine2 != null)&&this.streetLine2 .equals(rhs.streetLine2)))&&((this.streetLine1 == rhs.streetLine1)||((this.streetLine1 != null)&&this.streetLine1 .equals(rhs.streetLine1))))&&((this.country == rhs.country)||((this.country!= null)&&this.country.equals(rhs.country))))&&((this.city == rhs.city)||((this.city!= null)&&this.city.equals(rhs.city))))&&((this.postalCode == rhs.postalCode)||((this.postalCode!= null)&&this.postalCode.equals(rhs.postalCode))))&&((this.region == rhs.region)||((this.region!= null)&&this.region.equals(rhs.region))));
    }


    /**
     * Country
     * <p>
     * The ISO 3166-1 alpha-3 code of the country of residence
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Country {

        AFG("AFG"),
        AGO("AGO"),
        ALB("ALB"),
        AND("AND"),
        ARE("ARE"),
        ARG("ARG"),
        ARM("ARM"),
        ATG("ATG"),
        AUS("AUS"),
        AUT("AUT"),
        AZE("AZE"),
        BDI("BDI"),
        BEL("BEL"),
        BEN("BEN"),
        BES("BES"),
        BFA("BFA"),
        BGD("BGD"),
        BGR("BGR"),
        BHR("BHR"),
        BHS("BHS"),
        BIH("BIH"),
        BLR("BLR"),
        BLZ("BLZ"),
        BOL("BOL"),
        BRA("BRA"),
        BRB("BRB"),
        BRN("BRN"),
        BTN("BTN"),
        BWA("BWA"),
        CAF("CAF"),
        CAN("CAN"),
        CHE("CHE"),
        CHL("CHL"),
        CHN("CHN"),
        CIV("CIV"),
        CMR("CMR"),
        COD("COD"),
        COG("COG"),
        COL("COL"),
        COM("COM"),
        CPV("CPV"),
        CRI("CRI"),
        CUB("CUB"),
        CUW("CUW"),
        CYP("CYP"),
        CZE("CZE"),
        DEU("DEU"),
        DJI("DJI"),
        DMA("DMA"),
        DNK("DNK"),
        DOM("DOM"),
        DZA("DZA"),
        ECU("ECU"),
        EGY("EGY"),
        ERI("ERI"),
        ESH("ESH"),
        ESP("ESP"),
        EST("EST"),
        ETH("ETH"),
        FIN("FIN"),
        FJI("FJI"),
        FRA("FRA"),
        FSM("FSM"),
        GAB("GAB"),
        GBR("GBR"),
        GEO("GEO"),
        GHA("GHA"),
        GIN("GIN"),
        GLP("GLP"),
        GMB("GMB"),
        GNB("GNB"),
        GNQ("GNQ"),
        GRC("GRC"),
        GRD("GRD"),
        GTM("GTM"),
        GUY("GUY"),
        HND("HND"),
        HRV("HRV"),
        HTI("HTI"),
        HUN("HUN"),
        IDN("IDN"),
        IMN("IMN"),
        IND("IND"),
        IRL("IRL"),
        IRN("IRN"),
        IRQ("IRQ"),
        ISL("ISL"),
        ISR("ISR"),
        ITA("ITA"),
        JAM("JAM"),
        JOR("JOR"),
        JPN("JPN"),
        KAZ("KAZ"),
        KEN("KEN"),
        KGZ("KGZ"),
        KHM("KHM"),
        KIR("KIR"),
        KNA("KNA"),
        KOR("KOR"),
        KWT("KWT"),
        LAO("LAO"),
        LBN("LBN"),
        LBR("LBR"),
        LBY("LBY"),
        LCA("LCA"),
        LIE("LIE"),
        LKA("LKA"),
        LSO("LSO"),
        LTU("LTU"),
        LUX("LUX"),
        LVA("LVA"),
        MAR("MAR"),
        MCO("MCO"),
        MDA("MDA"),
        MDG("MDG"),
        MDV("MDV"),
        MEX("MEX"),
        MHL("MHL"),
        MKD("MKD"),
        MLI("MLI"),
        MLT("MLT"),
        MMR("MMR"),
        MNE("MNE"),
        MNG("MNG"),
        MNP("MNP"),
        MOZ("MOZ"),
        MRT("MRT"),
        MUS("MUS"),
        MWI("MWI"),
        MYS("MYS"),
        NAM("NAM"),
        NER("NER"),
        NGA("NGA"),
        NIC("NIC"),
        NLD("NLD"),
        NOR("NOR"),
        NPL("NPL"),
        NRU("NRU"),
        NZL("NZL"),
        OMN("OMN"),
        PAK("PAK"),
        PAN("PAN"),
        PCN("PCN"),
        PER("PER"),
        PHL("PHL"),
        PLW("PLW"),
        PNG("PNG"),
        POL("POL"),
        PRI("PRI"),
        PRK("PRK"),
        PRT("PRT"),
        PRY("PRY"),
        PSE("PSE"),
        QAT("QAT"),
        ROU("ROU"),
        RUS("RUS"),
        RWA("RWA"),
        SAU("SAU"),
        SDN("SDN"),
        SEN("SEN"),
        SGP("SGP"),
        SLB("SLB"),
        SLE("SLE"),
        SLV("SLV"),
        SMR("SMR"),
        SOM("SOM"),
        SRB("SRB"),
        SSD("SSD"),
        STP("STP"),
        SUR("SUR"),
        SVK("SVK"),
        SVN("SVN"),
        SWE("SWE"),
        SWZ("SWZ"),
        SXM("SXM"),
        SYC("SYC"),
        SYR("SYR"),
        TCD("TCD"),
        TGO("TGO"),
        THA("THA"),
        TJK("TJK"),
        TKM("TKM"),
        TLS("TLS"),
        TON("TON"),
        TTO("TTO"),
        TUN("TUN"),
        TUR("TUR"),
        TUV("TUV"),
        TWN("TWN"),
        TZA("TZA"),
        UGA("UGA"),
        UKR("UKR"),
        URY("URY"),
        USA("USA"),
        UZB("UZB"),
        VAT("VAT"),
        VCT("VCT"),
        VEN("VEN"),
        VNM("VNM"),
        VUT("VUT"),
        WSM("WSM"),
        YEM("YEM"),
        ZAF("ZAF"),
        ZMB("ZMB"),
        ZWE("ZWE");
        private final String value;
        private final static Map<String, PrimaryAddress.Country> CONSTANTS = new HashMap<String, PrimaryAddress.Country>();

        static {
            for (PrimaryAddress.Country c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Country(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static PrimaryAddress.Country fromValue(String value) {
            PrimaryAddress.Country constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
