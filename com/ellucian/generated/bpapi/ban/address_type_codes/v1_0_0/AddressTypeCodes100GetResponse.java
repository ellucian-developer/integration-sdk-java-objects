
package com.ellucian.generated.bpapi.ban.address_type_codes.v1_0_0;

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
    "activityDate",
    "code",
    "teleDesc",
    "systemReqInd",
    "desc",
    "teleCode"
})
@Generated("jsonschema2pojo")
public class AddressTypeCodes100GetResponse {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVATYP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : STVATYP_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Address Type
     * <p>
     * Lineage reference object : STVATYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVATYP_CODE")
    private String code;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("teleDesc")
    private String teleDesc;
    /**
     * Lineage reference object : STVATYP_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("systemReqInd")
    @JsonPropertyDescription("Lineage reference object : STVATYP_SYSTEM_REQ_IND")
    private String systemReqInd;
    /**
     * Description
     * <p>
     * Lineage reference object : STVATYP_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVATYP_DESC")
    private String desc;
    /**
     * Telephone Type
     * <p>
     * Lineage reference object : STVATYP_TELE_CODE, Lookup lineage reference object : stvtele
     * 
     */
    @JsonProperty("teleCode")
    @JsonPropertyDescription("Lineage reference object : STVATYP_TELE_CODE, Lookup lineage reference object : stvtele")
    private String teleCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVATYP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVATYP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public AddressTypeCodes100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : STVATYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : STVATYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public AddressTypeCodes100GetResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("teleDesc")
    public String getTeleDesc() {
        return teleDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("teleDesc")
    public void setTeleDesc(String teleDesc) {
        this.teleDesc = teleDesc;
    }

    public AddressTypeCodes100GetResponse withTeleDesc(String teleDesc) {
        this.teleDesc = teleDesc;
        return this;
    }

    /**
     * Lineage reference object : STVATYP_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("systemReqInd")
    public String getSystemReqInd() {
        return systemReqInd;
    }

    /**
     * Lineage reference object : STVATYP_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("systemReqInd")
    public void setSystemReqInd(String systemReqInd) {
        this.systemReqInd = systemReqInd;
    }

    public AddressTypeCodes100GetResponse withSystemReqInd(String systemReqInd) {
        this.systemReqInd = systemReqInd;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVATYP_DESC
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
     * Lineage reference object : STVATYP_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public AddressTypeCodes100GetResponse withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Telephone Type
     * <p>
     * Lineage reference object : STVATYP_TELE_CODE, Lookup lineage reference object : stvtele
     * 
     */
    @JsonProperty("teleCode")
    public String getTeleCode() {
        return teleCode;
    }

    /**
     * Telephone Type
     * <p>
     * Lineage reference object : STVATYP_TELE_CODE, Lookup lineage reference object : stvtele
     * 
     */
    @JsonProperty("teleCode")
    public void setTeleCode(String teleCode) {
        this.teleCode = teleCode;
    }

    public AddressTypeCodes100GetResponse withTeleCode(String teleCode) {
        this.teleCode = teleCode;
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

    public AddressTypeCodes100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AddressTypeCodes100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("teleDesc");
        sb.append('=');
        sb.append(((this.teleDesc == null)?"<null>":this.teleDesc));
        sb.append(',');
        sb.append("systemReqInd");
        sb.append('=');
        sb.append(((this.systemReqInd == null)?"<null>":this.systemReqInd));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("teleCode");
        sb.append('=');
        sb.append(((this.teleCode == null)?"<null>":this.teleCode));
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
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.teleDesc == null)? 0 :this.teleDesc.hashCode()));
        result = ((result* 31)+((this.systemReqInd == null)? 0 :this.systemReqInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        result = ((result* 31)+((this.teleCode == null)? 0 :this.teleCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AddressTypeCodes100GetResponse) == false) {
            return false;
        }
        AddressTypeCodes100GetResponse rhs = ((AddressTypeCodes100GetResponse) other);
        return ((((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.teleDesc == rhs.teleDesc)||((this.teleDesc!= null)&&this.teleDesc.equals(rhs.teleDesc))))&&((this.systemReqInd == rhs.systemReqInd)||((this.systemReqInd!= null)&&this.systemReqInd.equals(rhs.systemReqInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.teleCode == rhs.teleCode)||((this.teleCode!= null)&&this.teleCode.equals(rhs.teleCode))));
    }

}
