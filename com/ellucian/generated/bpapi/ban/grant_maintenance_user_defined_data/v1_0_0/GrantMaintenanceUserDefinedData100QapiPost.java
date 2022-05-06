
package com.ellucian.generated.bpapi.ban.grant_maintenance_user_defined_data.v1_0_0;

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
    "displayFrbgrntCode",
    "displayPropCode",
    "sdatCodeAttr",
    "sdatCodeOpt1",
    "desc"
})
@Generated("jsonschema2pojo")
public class GrantMaintenanceUserDefinedData100QapiPost {

    @JsonProperty("displayFrbgrntCode")
    private String displayFrbgrntCode;
    @JsonProperty("displayPropCode")
    private String displayPropCode;
    /**
     * Literal
     * <p>
     * Lineage reference object : FRRGUSN_SDAT_CODE_ATTR
     * 
     */
    @JsonProperty("sdatCodeAttr")
    @JsonPropertyDescription("Lineage reference object : FRRGUSN_SDAT_CODE_ATTR")
    private String sdatCodeAttr;
    /**
     * Value
     * <p>
     * Lineage reference object : FRRGUSN_SDAT_CODE_OPT_1
     * 
     */
    @JsonProperty("sdatCodeOpt1")
    @JsonPropertyDescription("Lineage reference object : FRRGUSN_SDAT_CODE_OPT_1")
    private String sdatCodeOpt1;
    @JsonProperty("desc")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("displayFrbgrntCode")
    public String getDisplayFrbgrntCode() {
        return displayFrbgrntCode;
    }

    @JsonProperty("displayFrbgrntCode")
    public void setDisplayFrbgrntCode(String displayFrbgrntCode) {
        this.displayFrbgrntCode = displayFrbgrntCode;
    }

    public GrantMaintenanceUserDefinedData100QapiPost withDisplayFrbgrntCode(String displayFrbgrntCode) {
        this.displayFrbgrntCode = displayFrbgrntCode;
        return this;
    }

    @JsonProperty("displayPropCode")
    public String getDisplayPropCode() {
        return displayPropCode;
    }

    @JsonProperty("displayPropCode")
    public void setDisplayPropCode(String displayPropCode) {
        this.displayPropCode = displayPropCode;
    }

    public GrantMaintenanceUserDefinedData100QapiPost withDisplayPropCode(String displayPropCode) {
        this.displayPropCode = displayPropCode;
        return this;
    }

    /**
     * Literal
     * <p>
     * Lineage reference object : FRRGUSN_SDAT_CODE_ATTR
     * 
     */
    @JsonProperty("sdatCodeAttr")
    public String getSdatCodeAttr() {
        return sdatCodeAttr;
    }

    /**
     * Literal
     * <p>
     * Lineage reference object : FRRGUSN_SDAT_CODE_ATTR
     * 
     */
    @JsonProperty("sdatCodeAttr")
    public void setSdatCodeAttr(String sdatCodeAttr) {
        this.sdatCodeAttr = sdatCodeAttr;
    }

    public GrantMaintenanceUserDefinedData100QapiPost withSdatCodeAttr(String sdatCodeAttr) {
        this.sdatCodeAttr = sdatCodeAttr;
        return this;
    }

    /**
     * Value
     * <p>
     * Lineage reference object : FRRGUSN_SDAT_CODE_OPT_1
     * 
     */
    @JsonProperty("sdatCodeOpt1")
    public String getSdatCodeOpt1() {
        return sdatCodeOpt1;
    }

    /**
     * Value
     * <p>
     * Lineage reference object : FRRGUSN_SDAT_CODE_OPT_1
     * 
     */
    @JsonProperty("sdatCodeOpt1")
    public void setSdatCodeOpt1(String sdatCodeOpt1) {
        this.sdatCodeOpt1 = sdatCodeOpt1;
    }

    public GrantMaintenanceUserDefinedData100QapiPost withSdatCodeOpt1(String sdatCodeOpt1) {
        this.sdatCodeOpt1 = sdatCodeOpt1;
        return this;
    }

    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public GrantMaintenanceUserDefinedData100QapiPost withDesc(String desc) {
        this.desc = desc;
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

    public GrantMaintenanceUserDefinedData100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GrantMaintenanceUserDefinedData100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("displayFrbgrntCode");
        sb.append('=');
        sb.append(((this.displayFrbgrntCode == null)?"<null>":this.displayFrbgrntCode));
        sb.append(',');
        sb.append("displayPropCode");
        sb.append('=');
        sb.append(((this.displayPropCode == null)?"<null>":this.displayPropCode));
        sb.append(',');
        sb.append("sdatCodeAttr");
        sb.append('=');
        sb.append(((this.sdatCodeAttr == null)?"<null>":this.sdatCodeAttr));
        sb.append(',');
        sb.append("sdatCodeOpt1");
        sb.append('=');
        sb.append(((this.sdatCodeOpt1 == null)?"<null>":this.sdatCodeOpt1));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
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
        result = ((result* 31)+((this.displayFrbgrntCode == null)? 0 :this.displayFrbgrntCode.hashCode()));
        result = ((result* 31)+((this.displayPropCode == null)? 0 :this.displayPropCode.hashCode()));
        result = ((result* 31)+((this.sdatCodeOpt1 == null)? 0 :this.sdatCodeOpt1 .hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sdatCodeAttr == null)? 0 :this.sdatCodeAttr.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GrantMaintenanceUserDefinedData100QapiPost) == false) {
            return false;
        }
        GrantMaintenanceUserDefinedData100QapiPost rhs = ((GrantMaintenanceUserDefinedData100QapiPost) other);
        return (((((((this.displayFrbgrntCode == rhs.displayFrbgrntCode)||((this.displayFrbgrntCode!= null)&&this.displayFrbgrntCode.equals(rhs.displayFrbgrntCode)))&&((this.displayPropCode == rhs.displayPropCode)||((this.displayPropCode!= null)&&this.displayPropCode.equals(rhs.displayPropCode))))&&((this.sdatCodeOpt1 == rhs.sdatCodeOpt1)||((this.sdatCodeOpt1 != null)&&this.sdatCodeOpt1 .equals(rhs.sdatCodeOpt1))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sdatCodeAttr == rhs.sdatCodeAttr)||((this.sdatCodeAttr!= null)&&this.sdatCodeAttr.equals(rhs.sdatCodeAttr))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
