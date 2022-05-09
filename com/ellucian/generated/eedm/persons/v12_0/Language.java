
package com.ellucian.generated.eedm.persons.v12_0;

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
    "code",
    "preference"
})
@Generated("jsonschema2pojo")
public class Language {

    /**
     * Language Code
     * <p>
     * The ISO 639-3 alpha-3 language code
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("The ISO 639-3 alpha-3 language code")
    private Language.Code code;
    /**
     * Preference
     * <p>
     * Language preference indicator. Only one language should be set to primary for a person.
     * 
     */
    @JsonProperty("preference")
    @JsonPropertyDescription("Language preference indicator. Only one language should be set to primary for a person.")
    private Object preference;

    /**
     * Language Code
     * <p>
     * The ISO 639-3 alpha-3 language code
     * (Required)
     * 
     */
    @JsonProperty("code")
    public Language.Code getCode() {
        return code;
    }

    /**
     * Language Code
     * <p>
     * The ISO 639-3 alpha-3 language code
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(Language.Code code) {
        this.code = code;
    }

    public Language withCode(Language.Code code) {
        this.code = code;
        return this;
    }

    /**
     * Preference
     * <p>
     * Language preference indicator. Only one language should be set to primary for a person.
     * 
     */
    @JsonProperty("preference")
    public Object getPreference() {
        return preference;
    }

    /**
     * Preference
     * <p>
     * Language preference indicator. Only one language should be set to primary for a person.
     * 
     */
    @JsonProperty("preference")
    public void setPreference(Object preference) {
        this.preference = preference;
    }

    public Language withPreference(Object preference) {
        this.preference = preference;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Language.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("preference");
        sb.append('=');
        sb.append(((this.preference == null)?"<null>":this.preference));
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
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.preference == null)? 0 :this.preference.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Language) == false) {
            return false;
        }
        Language rhs = ((Language) other);
        return (((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code)))&&((this.preference == rhs.preference)||((this.preference!= null)&&this.preference.equals(rhs.preference))));
    }


    /**
     * Language Code
     * <p>
     * The ISO 639-3 alpha-3 language code
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Code {

        AAR("aar"),
        ABK("abk"),
        AFR("afr"),
        AKA("aka"),
        ALB("alb"),
        AMH("amh"),
        ARA("ara"),
        ARG("arg"),
        ARM("arm"),
        ASM("asm"),
        AVA("ava"),
        AVE("ave"),
        AYM("aym"),
        AZE("aze"),
        BAK("bak"),
        BAM("bam"),
        BAQ("baq"),
        BEL("bel"),
        BEN("ben"),
        BIH("bih"),
        BIS("bis"),
        BOS("bos"),
        BRE("bre"),
        BUL("bul"),
        BUR("bur"),
        CAT("cat"),
        CHA("cha"),
        CHE("che"),
        CHI("chi"),
        CHU("chu"),
        CHV("chv"),
        COR("cor"),
        COS("cos"),
        CRE("cre"),
        CZE("cze"),
        DAN("dan"),
        DIV("div"),
        DUT("dut"),
        DZO("dzo"),
        ENG("eng"),
        EPO("epo"),
        EST("est"),
        EWE("ewe"),
        FAO("fao"),
        FIJ("fij"),
        FIN("fin"),
        FRE("fre"),
        FRY("fry"),
        FUL("ful"),
        GEO("geo"),
        GER("ger"),
        GLA("gla"),
        GLE("gle"),
        GLG("glg"),
        GLV("glv"),
        GRE("gre"),
        GRN("grn"),
        GUJ("guj"),
        HAT("hat"),
        HAU("hau"),
        HEB("heb"),
        HER("her"),
        HIN("hin"),
        HMO("hmo"),
        HRV("hrv"),
        HUN("hun"),
        IBO("ibo"),
        ICE("ice"),
        IDO("ido"),
        III("iii"),
        IKU("iku"),
        ILE("ile"),
        INA("ina"),
        IND("ind"),
        IPK("ipk"),
        ITA("ita"),
        JAV("jav"),
        JPN("jpn"),
        KAL("kal"),
        KAN("kan"),
        KAS("kas"),
        KAU("kau"),
        KAZ("kaz"),
        KHM("khm"),
        KIK("kik"),
        KIN("kin"),
        KIR("kir"),
        KOM("kom"),
        KON("kon"),
        KOR("kor"),
        KUA("kua"),
        KUR("kur"),
        LAO("lao"),
        LAT("lat"),
        LAV("lav"),
        LIM("lim"),
        LIN("lin"),
        LIT("lit"),
        LTZ("ltz"),
        LUB("lub"),
        LUG("lug"),
        MAC("mac"),
        MAH("mah"),
        MAL("mal"),
        MAO("mao"),
        MAR("mar"),
        MAY("may"),
        MLG("mlg"),
        MLT("mlt"),
        MON("mon"),
        NAU("nau"),
        NAV("nav"),
        NBL("nbl"),
        NDE("nde"),
        NDO("ndo"),
        NEP("nep"),
        NNO("nno"),
        NOB("nob"),
        NOR("nor"),
        NYA("nya"),
        OCI("oci"),
        OJI("oji"),
        ORI("ori"),
        ORM("orm"),
        OSS("oss"),
        PAN("pan"),
        PER("per"),
        PLI("pli"),
        POL("pol"),
        POR("por"),
        PUS("pus"),
        QUE("que"),
        ROH("roh"),
        RUM("rum"),
        RUN("run"),
        RUS("rus"),
        SAG("sag"),
        SAN("san"),
        SIN("sin"),
        SLO("slo"),
        SLV("slv"),
        SME("sme"),
        SMO("smo"),
        SNA("sna"),
        SND("snd"),
        SOM("som"),
        SOT("sot"),
        SPA("spa"),
        SRD("srd"),
        SRP("srp"),
        SSW("ssw"),
        SUN("sun"),
        SWA("swa"),
        SWE("swe"),
        TAH("tah"),
        TAM("tam"),
        TAT("tat"),
        TEL("tel"),
        TGK("tgk"),
        TGL("tgl"),
        THA("tha"),
        TIB("tib"),
        TIR("tir"),
        TON("ton"),
        TSN("tsn"),
        TSO("tso"),
        TUK("tuk"),
        TUR("tur"),
        TWI("twi"),
        UIG("uig"),
        UKR("ukr"),
        URD("urd"),
        UZB("uzb"),
        VEN("ven"),
        VIE("vie"),
        VOL("vol"),
        WEL("wel"),
        WLN("wln"),
        WOL("wol"),
        XHO("xho"),
        YID("yid"),
        YOR("yor"),
        ZHA("zha"),
        ZUL("zul");
        private final String value;
        private final static Map<String, Language.Code> CONSTANTS = new HashMap<String, Language.Code>();

        static {
            for (Language.Code c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Code(String value) {
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
        public static Language.Code fromValue(String value) {
            Language.Code constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
