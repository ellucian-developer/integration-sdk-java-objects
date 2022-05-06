
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
    "sdatCodeOpt1",
    "sdatCodeAttr",
    "desc"
})
@Generated("jsonschema2pojo")
public class Frrgusn {

    /**
     * Value
     * <p>
     * Lineage reference object : FRRGUSN_SDAT_CODE_OPT_1
     * 
     */
    @JsonProperty("sdatCodeOpt1")
    @JsonPropertyDescription("Lineage reference object : FRRGUSN_SDAT_CODE_OPT_1")
    private String sdatCodeOpt1;
    /**
     * Literal
     * <p>
     * Lineage reference object : FRRGUSN_SDAT_CODE_ATTR
     * (Required)
     * 
     */
    @JsonProperty("sdatCodeAttr")
    @JsonPropertyDescription("Lineage reference object : FRRGUSN_SDAT_CODE_ATTR")
    private String sdatCodeAttr;
    @JsonProperty("desc")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public Frrgusn withSdatCodeOpt1(String sdatCodeOpt1) {
        this.sdatCodeOpt1 = sdatCodeOpt1;
        return this;
    }

    /**
     * Literal
     * <p>
     * Lineage reference object : FRRGUSN_SDAT_CODE_ATTR
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("sdatCodeAttr")
    public void setSdatCodeAttr(String sdatCodeAttr) {
        this.sdatCodeAttr = sdatCodeAttr;
    }

    public Frrgusn withSdatCodeAttr(String sdatCodeAttr) {
        this.sdatCodeAttr = sdatCodeAttr;
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

    public Frrgusn withDesc(String desc) {
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

    public Frrgusn withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Frrgusn.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sdatCodeOpt1");
        sb.append('=');
        sb.append(((this.sdatCodeOpt1 == null)?"<null>":this.sdatCodeOpt1));
        sb.append(',');
        sb.append("sdatCodeAttr");
        sb.append('=');
        sb.append(((this.sdatCodeAttr == null)?"<null>":this.sdatCodeAttr));
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
        if ((other instanceof Frrgusn) == false) {
            return false;
        }
        Frrgusn rhs = ((Frrgusn) other);
        return (((((this.sdatCodeOpt1 == rhs.sdatCodeOpt1)||((this.sdatCodeOpt1 != null)&&this.sdatCodeOpt1 .equals(rhs.sdatCodeOpt1)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sdatCodeAttr == rhs.sdatCodeAttr)||((this.sdatCodeAttr!= null)&&this.sdatCodeAttr.equals(rhs.sdatCodeAttr))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
