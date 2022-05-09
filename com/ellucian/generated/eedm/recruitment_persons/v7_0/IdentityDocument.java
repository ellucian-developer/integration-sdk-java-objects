
package com.ellucian.generated.eedm.recruitment_persons.v7_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "countryCode",
    "type",
    "documentId",
    "issuingAuthority",
    "expiresOn"
})
@Generated("jsonschema2pojo")
public class IdentityDocument {

    /**
     * Country Code
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("countryCode")
    @JsonPropertyDescription("")
    private IdentityDocument.CountryCode countryCode;
    /**
     * Type
     * <p>
     * Identity document type
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Identity document type")
    private Type__1 type;
    /**
     * Document ID
     * <p>
     * The identification code or number of the document
     * 
     */
    @JsonProperty("documentId")
    @JsonPropertyDescription("The identification code or number of the document")
    private String documentId;
    /**
     * Issuing Authority
     * <p>
     * The authority that issued the document
     * 
     */
    @JsonProperty("issuingAuthority")
    @JsonPropertyDescription("The authority that issued the document")
    private Object issuingAuthority;
    /**
     * Expires On
     * <p>
     * The document expiration date
     * 
     */
    @JsonProperty("expiresOn")
    @JsonPropertyDescription("The document expiration date")
    private Object expiresOn;

    /**
     * Country Code
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("countryCode")
    public IdentityDocument.CountryCode getCountryCode() {
        return countryCode;
    }

    /**
     * Country Code
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("countryCode")
    public void setCountryCode(IdentityDocument.CountryCode countryCode) {
        this.countryCode = countryCode;
    }

    public IdentityDocument withCountryCode(IdentityDocument.CountryCode countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Type
     * <p>
     * Identity document type
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Type__1 getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * Identity document type
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Type__1 type) {
        this.type = type;
    }

    public IdentityDocument withType(Type__1 type) {
        this.type = type;
        return this;
    }

    /**
     * Document ID
     * <p>
     * The identification code or number of the document
     * 
     */
    @JsonProperty("documentId")
    public String getDocumentId() {
        return documentId;
    }

    /**
     * Document ID
     * <p>
     * The identification code or number of the document
     * 
     */
    @JsonProperty("documentId")
    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public IdentityDocument withDocumentId(String documentId) {
        this.documentId = documentId;
        return this;
    }

    /**
     * Issuing Authority
     * <p>
     * The authority that issued the document
     * 
     */
    @JsonProperty("issuingAuthority")
    public Object getIssuingAuthority() {
        return issuingAuthority;
    }

    /**
     * Issuing Authority
     * <p>
     * The authority that issued the document
     * 
     */
    @JsonProperty("issuingAuthority")
    public void setIssuingAuthority(Object issuingAuthority) {
        this.issuingAuthority = issuingAuthority;
    }

    public IdentityDocument withIssuingAuthority(Object issuingAuthority) {
        this.issuingAuthority = issuingAuthority;
        return this;
    }

    /**
     * Expires On
     * <p>
     * The document expiration date
     * 
     */
    @JsonProperty("expiresOn")
    public Object getExpiresOn() {
        return expiresOn;
    }

    /**
     * Expires On
     * <p>
     * The document expiration date
     * 
     */
    @JsonProperty("expiresOn")
    public void setExpiresOn(Object expiresOn) {
        this.expiresOn = expiresOn;
    }

    public IdentityDocument withExpiresOn(Object expiresOn) {
        this.expiresOn = expiresOn;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(IdentityDocument.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("countryCode");
        sb.append('=');
        sb.append(((this.countryCode == null)?"<null>":this.countryCode));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("documentId");
        sb.append('=');
        sb.append(((this.documentId == null)?"<null>":this.documentId));
        sb.append(',');
        sb.append("issuingAuthority");
        sb.append('=');
        sb.append(((this.issuingAuthority == null)?"<null>":this.issuingAuthority));
        sb.append(',');
        sb.append("expiresOn");
        sb.append('=');
        sb.append(((this.expiresOn == null)?"<null>":this.expiresOn));
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
        result = ((result* 31)+((this.issuingAuthority == null)? 0 :this.issuingAuthority.hashCode()));
        result = ((result* 31)+((this.documentId == null)? 0 :this.documentId.hashCode()));
        result = ((result* 31)+((this.expiresOn == null)? 0 :this.expiresOn.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.countryCode == null)? 0 :this.countryCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IdentityDocument) == false) {
            return false;
        }
        IdentityDocument rhs = ((IdentityDocument) other);
        return ((((((this.issuingAuthority == rhs.issuingAuthority)||((this.issuingAuthority!= null)&&this.issuingAuthority.equals(rhs.issuingAuthority)))&&((this.documentId == rhs.documentId)||((this.documentId!= null)&&this.documentId.equals(rhs.documentId))))&&((this.expiresOn == rhs.expiresOn)||((this.expiresOn!= null)&&this.expiresOn.equals(rhs.expiresOn))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.countryCode == rhs.countryCode)||((this.countryCode!= null)&&this.countryCode.equals(rhs.countryCode))));
    }


    /**
     * Country Code
     * <p>
     * 
     * 
     */
    @Generated("jsonschema2pojo")
    public enum CountryCode {

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
        private final static Map<String, IdentityDocument.CountryCode> CONSTANTS = new HashMap<String, IdentityDocument.CountryCode>();

        static {
            for (IdentityDocument.CountryCode c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        CountryCode(String value) {
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
        public static IdentityDocument.CountryCode fromValue(String value) {
            IdentityDocument.CountryCode constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
