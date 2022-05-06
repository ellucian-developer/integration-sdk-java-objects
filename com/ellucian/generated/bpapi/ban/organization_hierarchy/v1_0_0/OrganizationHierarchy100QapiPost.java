
package com.ellucian.generated.bpapi.ban.organization_hierarchy.v1_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "coasCode",
    "orgnCode",
    "orgnTitle",
    "effDateYmdhms",
    "orgnCodePredTitle",
    "orgnCodePred"
})
@Generated("jsonschema2pojo")
public class OrganizationHierarchy100QapiPost {

    @JsonProperty("coasCode")
    private String coasCode;
    @JsonProperty("orgnCode")
    private String orgnCode;
    @JsonProperty("orgnTitle")
    private String orgnTitle;
    @JsonProperty("effDateYmdhms")
    private String effDateYmdhms;
    @JsonProperty("orgnCodePredTitle")
    private String orgnCodePredTitle;
    @JsonProperty("orgnCodePred")
    private String orgnCodePred;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("coasCode")
    public String getCoasCode() {
        return coasCode;
    }

    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public OrganizationHierarchy100QapiPost withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    @JsonProperty("orgnCode")
    public String getOrgnCode() {
        return orgnCode;
    }

    @JsonProperty("orgnCode")
    public void setOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
    }

    public OrganizationHierarchy100QapiPost withOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
        return this;
    }

    @JsonProperty("orgnTitle")
    public String getOrgnTitle() {
        return orgnTitle;
    }

    @JsonProperty("orgnTitle")
    public void setOrgnTitle(String orgnTitle) {
        this.orgnTitle = orgnTitle;
    }

    public OrganizationHierarchy100QapiPost withOrgnTitle(String orgnTitle) {
        this.orgnTitle = orgnTitle;
        return this;
    }

    @JsonProperty("effDateYmdhms")
    public String getEffDateYmdhms() {
        return effDateYmdhms;
    }

    @JsonProperty("effDateYmdhms")
    public void setEffDateYmdhms(String effDateYmdhms) {
        this.effDateYmdhms = effDateYmdhms;
    }

    public OrganizationHierarchy100QapiPost withEffDateYmdhms(String effDateYmdhms) {
        this.effDateYmdhms = effDateYmdhms;
        return this;
    }

    @JsonProperty("orgnCodePredTitle")
    public String getOrgnCodePredTitle() {
        return orgnCodePredTitle;
    }

    @JsonProperty("orgnCodePredTitle")
    public void setOrgnCodePredTitle(String orgnCodePredTitle) {
        this.orgnCodePredTitle = orgnCodePredTitle;
    }

    public OrganizationHierarchy100QapiPost withOrgnCodePredTitle(String orgnCodePredTitle) {
        this.orgnCodePredTitle = orgnCodePredTitle;
        return this;
    }

    @JsonProperty("orgnCodePred")
    public String getOrgnCodePred() {
        return orgnCodePred;
    }

    @JsonProperty("orgnCodePred")
    public void setOrgnCodePred(String orgnCodePred) {
        this.orgnCodePred = orgnCodePred;
    }

    public OrganizationHierarchy100QapiPost withOrgnCodePred(String orgnCodePred) {
        this.orgnCodePred = orgnCodePred;
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

    public OrganizationHierarchy100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OrganizationHierarchy100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("orgnCode");
        sb.append('=');
        sb.append(((this.orgnCode == null)?"<null>":this.orgnCode));
        sb.append(',');
        sb.append("orgnTitle");
        sb.append('=');
        sb.append(((this.orgnTitle == null)?"<null>":this.orgnTitle));
        sb.append(',');
        sb.append("effDateYmdhms");
        sb.append('=');
        sb.append(((this.effDateYmdhms == null)?"<null>":this.effDateYmdhms));
        sb.append(',');
        sb.append("orgnCodePredTitle");
        sb.append('=');
        sb.append(((this.orgnCodePredTitle == null)?"<null>":this.orgnCodePredTitle));
        sb.append(',');
        sb.append("orgnCodePred");
        sb.append('=');
        sb.append(((this.orgnCodePred == null)?"<null>":this.orgnCodePred));
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
        result = ((result* 31)+((this.orgnTitle == null)? 0 :this.orgnTitle.hashCode()));
        result = ((result* 31)+((this.effDateYmdhms == null)? 0 :this.effDateYmdhms.hashCode()));
        result = ((result* 31)+((this.orgnCodePredTitle == null)? 0 :this.orgnCodePredTitle.hashCode()));
        result = ((result* 31)+((this.orgnCodePred == null)? 0 :this.orgnCodePred.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.orgnCode == null)? 0 :this.orgnCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OrganizationHierarchy100QapiPost) == false) {
            return false;
        }
        OrganizationHierarchy100QapiPost rhs = ((OrganizationHierarchy100QapiPost) other);
        return ((((((((this.orgnTitle == rhs.orgnTitle)||((this.orgnTitle!= null)&&this.orgnTitle.equals(rhs.orgnTitle)))&&((this.effDateYmdhms == rhs.effDateYmdhms)||((this.effDateYmdhms!= null)&&this.effDateYmdhms.equals(rhs.effDateYmdhms))))&&((this.orgnCodePredTitle == rhs.orgnCodePredTitle)||((this.orgnCodePredTitle!= null)&&this.orgnCodePredTitle.equals(rhs.orgnCodePredTitle))))&&((this.orgnCodePred == rhs.orgnCodePred)||((this.orgnCodePred!= null)&&this.orgnCodePred.equals(rhs.orgnCodePred))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.orgnCode == rhs.orgnCode)||((this.orgnCode!= null)&&this.orgnCode.equals(rhs.orgnCode))));
    }

}
