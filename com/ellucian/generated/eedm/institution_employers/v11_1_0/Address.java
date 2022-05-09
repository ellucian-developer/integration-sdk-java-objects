
package com.ellucian.generated.eedm.institution_employers.v11_1_0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Address
 * <p>
 * The physical address associated with the institution employer.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "addressLines",
    "city",
    "state",
    "country",
    "postalCode"
})
@Generated("jsonschema2pojo")
public class Address {

    /**
     * Address Lines
     * <p>
     * The address lines of the address, such as a street address, post office box number, or city, region, and postal code.
     * (Required)
     * 
     */
    @JsonProperty("addressLines")
    @JsonPropertyDescription("The address lines of the address, such as a street address, post office box number, or city, region, and postal code.")
    private List<String> addressLines = new ArrayList<String>();
    /**
     * City
     * <p>
     * The city associated with the employer.
     * (Required)
     * 
     */
    @JsonProperty("city")
    @JsonPropertyDescription("The city associated with the employer.")
    private String city;
    /**
     * State
     * <p>
     * The state associated with the employer.
     * (Required)
     * 
     */
    @JsonProperty("state")
    @JsonPropertyDescription("The state associated with the employer.")
    private String state;
    /**
     * Country
     * <p>
     * The ISO 3166-1 alpha-3 code of the country associated with the employer.
     * (Required)
     * 
     */
    @JsonProperty("country")
    @JsonPropertyDescription("The ISO 3166-1 alpha-3 code of the country associated with the employer.")
    private Address.Country country;
    /**
     * Postal Code
     * <p>
     * The postal code associated with the employer.
     * (Required)
     * 
     */
    @JsonProperty("postalCode")
    @JsonPropertyDescription("The postal code associated with the employer.")
    private String postalCode;

    /**
     * Address Lines
     * <p>
     * The address lines of the address, such as a street address, post office box number, or city, region, and postal code.
     * (Required)
     * 
     */
    @JsonProperty("addressLines")
    public List<String> getAddressLines() {
        return addressLines;
    }

    /**
     * Address Lines
     * <p>
     * The address lines of the address, such as a street address, post office box number, or city, region, and postal code.
     * (Required)
     * 
     */
    @JsonProperty("addressLines")
    public void setAddressLines(List<String> addressLines) {
        this.addressLines = addressLines;
    }

    public Address withAddressLines(List<String> addressLines) {
        this.addressLines = addressLines;
        return this;
    }

    /**
     * City
     * <p>
     * The city associated with the employer.
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
     * The city associated with the employer.
     * (Required)
     * 
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public Address withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * State
     * <p>
     * The state associated with the employer.
     * (Required)
     * 
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * State
     * <p>
     * The state associated with the employer.
     * (Required)
     * 
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    public Address withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Country
     * <p>
     * The ISO 3166-1 alpha-3 code of the country associated with the employer.
     * (Required)
     * 
     */
    @JsonProperty("country")
    public Address.Country getCountry() {
        return country;
    }

    /**
     * Country
     * <p>
     * The ISO 3166-1 alpha-3 code of the country associated with the employer.
     * (Required)
     * 
     */
    @JsonProperty("country")
    public void setCountry(Address.Country country) {
        this.country = country;
    }

    public Address withCountry(Address.Country country) {
        this.country = country;
        return this;
    }

    /**
     * Postal Code
     * <p>
     * The postal code associated with the employer.
     * (Required)
     * 
     */
    @JsonProperty("postalCode")
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Postal Code
     * <p>
     * The postal code associated with the employer.
     * (Required)
     * 
     */
    @JsonProperty("postalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Address withPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Address.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("addressLines");
        sb.append('=');
        sb.append(((this.addressLines == null)?"<null>":this.addressLines));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
        sb.append(',');
        sb.append("postalCode");
        sb.append('=');
        sb.append(((this.postalCode == null)?"<null>":this.postalCode));
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
        result = ((result* 31)+((this.country == null)? 0 :this.country.hashCode()));
        result = ((result* 31)+((this.addressLines == null)? 0 :this.addressLines.hashCode()));
        result = ((result* 31)+((this.state == null)? 0 :this.state.hashCode()));
        result = ((result* 31)+((this.city == null)? 0 :this.city.hashCode()));
        result = ((result* 31)+((this.postalCode == null)? 0 :this.postalCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Address) == false) {
            return false;
        }
        Address rhs = ((Address) other);
        return ((((((this.country == rhs.country)||((this.country!= null)&&this.country.equals(rhs.country)))&&((this.addressLines == rhs.addressLines)||((this.addressLines!= null)&&this.addressLines.equals(rhs.addressLines))))&&((this.state == rhs.state)||((this.state!= null)&&this.state.equals(rhs.state))))&&((this.city == rhs.city)||((this.city!= null)&&this.city.equals(rhs.city))))&&((this.postalCode == rhs.postalCode)||((this.postalCode!= null)&&this.postalCode.equals(rhs.postalCode))));
    }


    /**
     * Country
     * <p>
     * The ISO 3166-1 alpha-3 code of the country associated with the employer.
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
        private final static Map<String, Address.Country> CONSTANTS = new HashMap<String, Address.Country>();

        static {
            for (Address.Country c: values()) {
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
        public static Address.Country fromValue(String value) {
            Address.Country constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
