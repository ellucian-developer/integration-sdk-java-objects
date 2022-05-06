
package com.ellucian.generated.bpapi.ban.electronic_prospect_load_codes.v1_0_0;

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
    "code",
    "desc",
    "enterWithVal",
    "hdrRecExistsInd",
    "infcCode",
    "tapeCode",
    "webPageId"
})
@Generated("jsonschema2pojo")
public class ElectronicProspectLoadCodes100QapiPost {

    /**
     * Prospect Code
     * <p>
     * Lineage reference object : STVPREL_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVPREL_CODE")
    private String code;
    /**
     * Description
     * <p>
     * Lineage reference object : STVPREL_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVPREL_DESC")
    private String desc;
    /**
     * Lineage reference object : STVPREL_ENTER_WITH_VAL
     * 
     */
    @JsonProperty("enterWithVal")
    @JsonPropertyDescription("Lineage reference object : STVPREL_ENTER_WITH_VAL")
    private String enterWithVal;
    /**
     * Lineage reference object : STVPREL_HDR_REC_EXISTS_IND
     * 
     */
    @JsonProperty("hdrRecExistsInd")
    @JsonPropertyDescription("Lineage reference object : STVPREL_HDR_REC_EXISTS_IND")
    private String hdrRecExistsInd;
    /**
     * Interface Code
     * <p>
     * Lineage reference object : STVPREL_INFC_CODE, Lookup lineage reference object : stvinfc
     * 
     */
    @JsonProperty("infcCode")
    @JsonPropertyDescription("Lineage reference object : STVPREL_INFC_CODE, Lookup lineage reference object : stvinfc")
    private String infcCode;
    /**
     * Tape Code
     * <p>
     * Lineage reference object : STVPREL_TAPE_CODE, Lookup lineage reference object : stvtape
     * 
     */
    @JsonProperty("tapeCode")
    @JsonPropertyDescription("Lineage reference object : STVPREL_TAPE_CODE, Lookup lineage reference object : stvtape")
    private String tapeCode;
    /**
     * WEB Page ID
     * <p>
     * Lineage reference object : STVPREL_WEB_PAGE_ID
     * 
     */
    @JsonProperty("webPageId")
    @JsonPropertyDescription("Lineage reference object : STVPREL_WEB_PAGE_ID")
    private String webPageId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Prospect Code
     * <p>
     * Lineage reference object : STVPREL_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Prospect Code
     * <p>
     * Lineage reference object : STVPREL_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public ElectronicProspectLoadCodes100QapiPost withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVPREL_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVPREL_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ElectronicProspectLoadCodes100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Lineage reference object : STVPREL_ENTER_WITH_VAL
     * 
     */
    @JsonProperty("enterWithVal")
    public String getEnterWithVal() {
        return enterWithVal;
    }

    /**
     * Lineage reference object : STVPREL_ENTER_WITH_VAL
     * 
     */
    @JsonProperty("enterWithVal")
    public void setEnterWithVal(String enterWithVal) {
        this.enterWithVal = enterWithVal;
    }

    public ElectronicProspectLoadCodes100QapiPost withEnterWithVal(String enterWithVal) {
        this.enterWithVal = enterWithVal;
        return this;
    }

    /**
     * Lineage reference object : STVPREL_HDR_REC_EXISTS_IND
     * 
     */
    @JsonProperty("hdrRecExistsInd")
    public String getHdrRecExistsInd() {
        return hdrRecExistsInd;
    }

    /**
     * Lineage reference object : STVPREL_HDR_REC_EXISTS_IND
     * 
     */
    @JsonProperty("hdrRecExistsInd")
    public void setHdrRecExistsInd(String hdrRecExistsInd) {
        this.hdrRecExistsInd = hdrRecExistsInd;
    }

    public ElectronicProspectLoadCodes100QapiPost withHdrRecExistsInd(String hdrRecExistsInd) {
        this.hdrRecExistsInd = hdrRecExistsInd;
        return this;
    }

    /**
     * Interface Code
     * <p>
     * Lineage reference object : STVPREL_INFC_CODE, Lookup lineage reference object : stvinfc
     * 
     */
    @JsonProperty("infcCode")
    public String getInfcCode() {
        return infcCode;
    }

    /**
     * Interface Code
     * <p>
     * Lineage reference object : STVPREL_INFC_CODE, Lookup lineage reference object : stvinfc
     * 
     */
    @JsonProperty("infcCode")
    public void setInfcCode(String infcCode) {
        this.infcCode = infcCode;
    }

    public ElectronicProspectLoadCodes100QapiPost withInfcCode(String infcCode) {
        this.infcCode = infcCode;
        return this;
    }

    /**
     * Tape Code
     * <p>
     * Lineage reference object : STVPREL_TAPE_CODE, Lookup lineage reference object : stvtape
     * 
     */
    @JsonProperty("tapeCode")
    public String getTapeCode() {
        return tapeCode;
    }

    /**
     * Tape Code
     * <p>
     * Lineage reference object : STVPREL_TAPE_CODE, Lookup lineage reference object : stvtape
     * 
     */
    @JsonProperty("tapeCode")
    public void setTapeCode(String tapeCode) {
        this.tapeCode = tapeCode;
    }

    public ElectronicProspectLoadCodes100QapiPost withTapeCode(String tapeCode) {
        this.tapeCode = tapeCode;
        return this;
    }

    /**
     * WEB Page ID
     * <p>
     * Lineage reference object : STVPREL_WEB_PAGE_ID
     * 
     */
    @JsonProperty("webPageId")
    public String getWebPageId() {
        return webPageId;
    }

    /**
     * WEB Page ID
     * <p>
     * Lineage reference object : STVPREL_WEB_PAGE_ID
     * 
     */
    @JsonProperty("webPageId")
    public void setWebPageId(String webPageId) {
        this.webPageId = webPageId;
    }

    public ElectronicProspectLoadCodes100QapiPost withWebPageId(String webPageId) {
        this.webPageId = webPageId;
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

    public ElectronicProspectLoadCodes100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ElectronicProspectLoadCodes100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("enterWithVal");
        sb.append('=');
        sb.append(((this.enterWithVal == null)?"<null>":this.enterWithVal));
        sb.append(',');
        sb.append("hdrRecExistsInd");
        sb.append('=');
        sb.append(((this.hdrRecExistsInd == null)?"<null>":this.hdrRecExistsInd));
        sb.append(',');
        sb.append("infcCode");
        sb.append('=');
        sb.append(((this.infcCode == null)?"<null>":this.infcCode));
        sb.append(',');
        sb.append("tapeCode");
        sb.append('=');
        sb.append(((this.tapeCode == null)?"<null>":this.tapeCode));
        sb.append(',');
        sb.append("webPageId");
        sb.append('=');
        sb.append(((this.webPageId == null)?"<null>":this.webPageId));
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
        result = ((result* 31)+((this.hdrRecExistsInd == null)? 0 :this.hdrRecExistsInd.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.enterWithVal == null)? 0 :this.enterWithVal.hashCode()));
        result = ((result* 31)+((this.infcCode == null)? 0 :this.infcCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.tapeCode == null)? 0 :this.tapeCode.hashCode()));
        result = ((result* 31)+((this.webPageId == null)? 0 :this.webPageId.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ElectronicProspectLoadCodes100QapiPost) == false) {
            return false;
        }
        ElectronicProspectLoadCodes100QapiPost rhs = ((ElectronicProspectLoadCodes100QapiPost) other);
        return (((((((((this.hdrRecExistsInd == rhs.hdrRecExistsInd)||((this.hdrRecExistsInd!= null)&&this.hdrRecExistsInd.equals(rhs.hdrRecExistsInd)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.enterWithVal == rhs.enterWithVal)||((this.enterWithVal!= null)&&this.enterWithVal.equals(rhs.enterWithVal))))&&((this.infcCode == rhs.infcCode)||((this.infcCode!= null)&&this.infcCode.equals(rhs.infcCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.tapeCode == rhs.tapeCode)||((this.tapeCode!= null)&&this.tapeCode.equals(rhs.tapeCode))))&&((this.webPageId == rhs.webPageId)||((this.webPageId!= null)&&this.webPageId.equals(rhs.webPageId))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
