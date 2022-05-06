
package com.ellucian.generated.bpapi.ban.general_person_identification.v1_0_0;

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
    "id",
    "spridenId",
    "fromDate",
    "persSex",
    "emalCode",
    "adidCode"
})
@Generated("jsonschema2pojo")
public class GeneralPersonIdentification100QapiPost {

    @JsonProperty("id")
    private String id;
    @JsonProperty("spridenId")
    private String spridenId;
    @JsonProperty("fromDate")
    private String fromDate;
    @JsonProperty("persSex")
    private String persSex;
    @JsonProperty("emalCode")
    private String emalCode;
    /**
     * ID Type
     * <p>
     * Lineage reference object : GORADID_ADID_CODE, Lookup lineage reference object : gtvadid
     * 
     */
    @JsonProperty("adidCode")
    @JsonPropertyDescription("Lineage reference object : GORADID_ADID_CODE, Lookup lineage reference object : gtvadid")
    private String adidCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public GeneralPersonIdentification100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("spridenId")
    public String getSpridenId() {
        return spridenId;
    }

    @JsonProperty("spridenId")
    public void setSpridenId(String spridenId) {
        this.spridenId = spridenId;
    }

    public GeneralPersonIdentification100QapiPost withSpridenId(String spridenId) {
        this.spridenId = spridenId;
        return this;
    }

    @JsonProperty("fromDate")
    public String getFromDate() {
        return fromDate;
    }

    @JsonProperty("fromDate")
    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public GeneralPersonIdentification100QapiPost withFromDate(String fromDate) {
        this.fromDate = fromDate;
        return this;
    }

    @JsonProperty("persSex")
    public String getPersSex() {
        return persSex;
    }

    @JsonProperty("persSex")
    public void setPersSex(String persSex) {
        this.persSex = persSex;
    }

    public GeneralPersonIdentification100QapiPost withPersSex(String persSex) {
        this.persSex = persSex;
        return this;
    }

    @JsonProperty("emalCode")
    public String getEmalCode() {
        return emalCode;
    }

    @JsonProperty("emalCode")
    public void setEmalCode(String emalCode) {
        this.emalCode = emalCode;
    }

    public GeneralPersonIdentification100QapiPost withEmalCode(String emalCode) {
        this.emalCode = emalCode;
        return this;
    }

    /**
     * ID Type
     * <p>
     * Lineage reference object : GORADID_ADID_CODE, Lookup lineage reference object : gtvadid
     * 
     */
    @JsonProperty("adidCode")
    public String getAdidCode() {
        return adidCode;
    }

    /**
     * ID Type
     * <p>
     * Lineage reference object : GORADID_ADID_CODE, Lookup lineage reference object : gtvadid
     * 
     */
    @JsonProperty("adidCode")
    public void setAdidCode(String adidCode) {
        this.adidCode = adidCode;
    }

    public GeneralPersonIdentification100QapiPost withAdidCode(String adidCode) {
        this.adidCode = adidCode;
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

    public GeneralPersonIdentification100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GeneralPersonIdentification100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("spridenId");
        sb.append('=');
        sb.append(((this.spridenId == null)?"<null>":this.spridenId));
        sb.append(',');
        sb.append("fromDate");
        sb.append('=');
        sb.append(((this.fromDate == null)?"<null>":this.fromDate));
        sb.append(',');
        sb.append("persSex");
        sb.append('=');
        sb.append(((this.persSex == null)?"<null>":this.persSex));
        sb.append(',');
        sb.append("emalCode");
        sb.append('=');
        sb.append(((this.emalCode == null)?"<null>":this.emalCode));
        sb.append(',');
        sb.append("adidCode");
        sb.append('=');
        sb.append(((this.adidCode == null)?"<null>":this.adidCode));
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
        result = ((result* 31)+((this.fromDate == null)? 0 :this.fromDate.hashCode()));
        result = ((result* 31)+((this.spridenId == null)? 0 :this.spridenId.hashCode()));
        result = ((result* 31)+((this.adidCode == null)? 0 :this.adidCode.hashCode()));
        result = ((result* 31)+((this.emalCode == null)? 0 :this.emalCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.persSex == null)? 0 :this.persSex.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeneralPersonIdentification100QapiPost) == false) {
            return false;
        }
        GeneralPersonIdentification100QapiPost rhs = ((GeneralPersonIdentification100QapiPost) other);
        return ((((((((this.fromDate == rhs.fromDate)||((this.fromDate!= null)&&this.fromDate.equals(rhs.fromDate)))&&((this.spridenId == rhs.spridenId)||((this.spridenId!= null)&&this.spridenId.equals(rhs.spridenId))))&&((this.adidCode == rhs.adidCode)||((this.adidCode!= null)&&this.adidCode.equals(rhs.adidCode))))&&((this.emalCode == rhs.emalCode)||((this.emalCode!= null)&&this.emalCode.equals(rhs.emalCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.persSex == rhs.persSex)||((this.persSex!= null)&&this.persSex.equals(rhs.persSex))));
    }

}
