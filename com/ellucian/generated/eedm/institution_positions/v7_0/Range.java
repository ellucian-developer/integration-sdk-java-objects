
package com.ellucian.generated.eedm.institution_positions.v7_0;

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
 * Range
 * <p>
 * The range of compensation awarded for the position.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "lowerBound",
    "upperBound",
    "currencyCode"
})
@Generated("jsonschema2pojo")
public class Range {

    /**
     * Lower Bound
     * <p>
     * The lower bound of compensation offered for the position.
     * (Required)
     * 
     */
    @JsonProperty("lowerBound")
    @JsonPropertyDescription("The lower bound of compensation offered for the position.")
    private Double lowerBound;
    /**
     * Upper Bound
     * <p>
     * The upper bound of compensation offered for the position.
     * (Required)
     * 
     */
    @JsonProperty("upperBound")
    @JsonPropertyDescription("The upper bound of compensation offered for the position.")
    private Double upperBound;
    /**
     * Currency Code
     * <p>
     * The ISO 4217 currency code
     * (Required)
     * 
     */
    @JsonProperty("currencyCode")
    @JsonPropertyDescription("The ISO 4217 currency code")
    private Range.CurrencyCode currencyCode;

    /**
     * Lower Bound
     * <p>
     * The lower bound of compensation offered for the position.
     * (Required)
     * 
     */
    @JsonProperty("lowerBound")
    public Double getLowerBound() {
        return lowerBound;
    }

    /**
     * Lower Bound
     * <p>
     * The lower bound of compensation offered for the position.
     * (Required)
     * 
     */
    @JsonProperty("lowerBound")
    public void setLowerBound(Double lowerBound) {
        this.lowerBound = lowerBound;
    }

    public Range withLowerBound(Double lowerBound) {
        this.lowerBound = lowerBound;
        return this;
    }

    /**
     * Upper Bound
     * <p>
     * The upper bound of compensation offered for the position.
     * (Required)
     * 
     */
    @JsonProperty("upperBound")
    public Double getUpperBound() {
        return upperBound;
    }

    /**
     * Upper Bound
     * <p>
     * The upper bound of compensation offered for the position.
     * (Required)
     * 
     */
    @JsonProperty("upperBound")
    public void setUpperBound(Double upperBound) {
        this.upperBound = upperBound;
    }

    public Range withUpperBound(Double upperBound) {
        this.upperBound = upperBound;
        return this;
    }

    /**
     * Currency Code
     * <p>
     * The ISO 4217 currency code
     * (Required)
     * 
     */
    @JsonProperty("currencyCode")
    public Range.CurrencyCode getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Currency Code
     * <p>
     * The ISO 4217 currency code
     * (Required)
     * 
     */
    @JsonProperty("currencyCode")
    public void setCurrencyCode(Range.CurrencyCode currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Range withCurrencyCode(Range.CurrencyCode currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Range.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("lowerBound");
        sb.append('=');
        sb.append(((this.lowerBound == null)?"<null>":this.lowerBound));
        sb.append(',');
        sb.append("upperBound");
        sb.append('=');
        sb.append(((this.upperBound == null)?"<null>":this.upperBound));
        sb.append(',');
        sb.append("currencyCode");
        sb.append('=');
        sb.append(((this.currencyCode == null)?"<null>":this.currencyCode));
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
        result = ((result* 31)+((this.lowerBound == null)? 0 :this.lowerBound.hashCode()));
        result = ((result* 31)+((this.upperBound == null)? 0 :this.upperBound.hashCode()));
        result = ((result* 31)+((this.currencyCode == null)? 0 :this.currencyCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Range) == false) {
            return false;
        }
        Range rhs = ((Range) other);
        return ((((this.lowerBound == rhs.lowerBound)||((this.lowerBound!= null)&&this.lowerBound.equals(rhs.lowerBound)))&&((this.upperBound == rhs.upperBound)||((this.upperBound!= null)&&this.upperBound.equals(rhs.upperBound))))&&((this.currencyCode == rhs.currencyCode)||((this.currencyCode!= null)&&this.currencyCode.equals(rhs.currencyCode))));
    }


    /**
     * Currency Code
     * <p>
     * The ISO 4217 currency code
     * 
     */
    @Generated("jsonschema2pojo")
    public enum CurrencyCode {

        AED("AED"),
        AFN("AFN"),
        ALL("ALL"),
        AMD("AMD"),
        ANG("ANG"),
        AOA("AOA"),
        ARS("ARS"),
        AUD("AUD"),
        AWG("AWG"),
        AZN("AZN"),
        BAM("BAM"),
        BBD("BBD"),
        BDT("BDT"),
        BGN("BGN"),
        BHD("BHD"),
        BIF("BIF"),
        BMD("BMD"),
        BND("BND"),
        BOB("BOB"),
        BRL("BRL"),
        BSD("BSD"),
        BTN("BTN"),
        BWP("BWP"),
        BYR("BYR"),
        BZD("BZD"),
        CAD("CAD"),
        CDF("CDF"),
        CHF("CHF"),
        CLP("CLP"),
        CNY("CNY"),
        COP("COP"),
        CRC("CRC"),
        CUC("CUC"),
        CUP("CUP"),
        CVE("CVE"),
        CZK("CZK"),
        DJF("DJF"),
        DKK("DKK"),
        DOP("DOP"),
        DZD("DZD"),
        EGP("EGP"),
        ERN("ERN"),
        ETB("ETB"),
        EUR("EUR"),
        FJD("FJD"),
        FKP("FKP"),
        GBP("GBP"),
        GEL("GEL"),
        GHS("GHS"),
        GIP("GIP"),
        GMD("GMD"),
        GNF("GNF"),
        GTQ("GTQ"),
        GYD("GYD"),
        HKD("HKD"),
        HNL("HNL"),
        HRK("HRK"),
        HTG("HTG"),
        HUF("HUF"),
        IDR("IDR"),
        ILS("ILS"),
        INR("INR"),
        IQD("IQD"),
        IRR("IRR"),
        ISK("ISK"),
        JMD("JMD"),
        JOD("JOD"),
        JPY("JPY"),
        KES("KES"),
        KGS("KGS"),
        KHR("KHR"),
        KMF("KMF"),
        KPW("KPW"),
        KRW("KRW"),
        KWD("KWD"),
        KYD("KYD"),
        KZT("KZT"),
        LAK("LAK"),
        LBP("LBP"),
        LKR("LKR"),
        LRD("LRD"),
        LSL("LSL"),
        LYD("LYD"),
        MAD("MAD"),
        MDL("MDL"),
        MGA("MGA"),
        MKD("MKD"),
        MMK("MMK"),
        MNT("MNT"),
        MOP("MOP"),
        MRO("MRO"),
        MUR("MUR"),
        MVR("MVR"),
        MWK("MWK"),
        MXN("MXN"),
        MYR("MYR"),
        MZN("MZN"),
        NAD("NAD"),
        NGN("NGN"),
        NIO("NIO"),
        NOK("NOK"),
        NPR("NPR"),
        NZD("NZD"),
        OMR("OMR"),
        PAB("PAB"),
        PEN("PEN"),
        PGK("PGK"),
        PHP("PHP"),
        PKR("PKR"),
        PLN("PLN"),
        PYG("PYG"),
        QAR("QAR"),
        RON("RON"),
        RSD("RSD"),
        RUB("RUB"),
        RWF("RWF"),
        SAR("SAR"),
        SBD("SBD"),
        SCR("SCR"),
        SDG("SDG"),
        SEK("SEK"),
        SGD("SGD"),
        SHP("SHP"),
        SLL("SLL"),
        SOS("SOS"),
        SRD("SRD"),
        SSP("SSP"),
        STD("STD"),
        SVC("SVC"),
        SYP("SYP"),
        SZL("SZL"),
        THB("THB"),
        TJS("TJS"),
        TMT("TMT"),
        TND("TND"),
        TOP("TOP"),
        TRY("TRY"),
        TTD("TTD"),
        TWD("TWD"),
        TZS("TZS"),
        UAH("UAH"),
        UGX("UGX"),
        USD("USD"),
        UYU("UYU"),
        UZS("UZS"),
        VEF("VEF"),
        VND("VND"),
        VUV("VUV"),
        WST("WST"),
        XAF("XAF"),
        XCD("XCD"),
        XOF("XOF"),
        XPF("XPF"),
        YER("YER"),
        ZAR("ZAR"),
        ZMW("ZMW"),
        ZWL("ZWL");
        private final String value;
        private final static Map<String, Range.CurrencyCode> CONSTANTS = new HashMap<String, Range.CurrencyCode>();

        static {
            for (Range.CurrencyCode c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        CurrencyCode(String value) {
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
        public static Range.CurrencyCode fromValue(String value) {
            Range.CurrencyCode constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
