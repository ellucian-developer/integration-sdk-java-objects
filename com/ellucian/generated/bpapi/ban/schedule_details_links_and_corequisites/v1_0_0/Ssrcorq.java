
package com.ellucian.generated.bpapi.ban.schedule_details_links_and_corequisites.v1_0_0;

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
    "crseNumb",
    "crnCorq",
    "subjCode",
    "sectNumb"
})
@Generated("jsonschema2pojo")
public class Ssrcorq {

    /**
     * Course
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("crseNumb")
    private String crseNumb;
    /**
     * CRN
     * <p>
     * Lineage reference object : SSRCORQ_CRN_CORQ, Lookup lineage reference object : ssbsect,scrcorq
     * (Required)
     * 
     */
    @JsonProperty("crnCorq")
    @JsonPropertyDescription("Lineage reference object : SSRCORQ_CRN_CORQ, Lookup lineage reference object : ssbsect,scrcorq")
    private String crnCorq;
    /**
     * Subject
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("subjCode")
    private String subjCode;
    /**
     * Section
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("sectNumb")
    private String sectNumb;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Course
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("crseNumb")
    public String getCrseNumb() {
        return crseNumb;
    }

    /**
     * Course
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("crseNumb")
    public void setCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
    }

    public Ssrcorq withCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
        return this;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : SSRCORQ_CRN_CORQ, Lookup lineage reference object : ssbsect,scrcorq
     * (Required)
     * 
     */
    @JsonProperty("crnCorq")
    public String getCrnCorq() {
        return crnCorq;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : SSRCORQ_CRN_CORQ, Lookup lineage reference object : ssbsect,scrcorq
     * (Required)
     * 
     */
    @JsonProperty("crnCorq")
    public void setCrnCorq(String crnCorq) {
        this.crnCorq = crnCorq;
    }

    public Ssrcorq withCrnCorq(String crnCorq) {
        this.crnCorq = crnCorq;
        return this;
    }

    /**
     * Subject
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("subjCode")
    public String getSubjCode() {
        return subjCode;
    }

    /**
     * Subject
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("subjCode")
    public void setSubjCode(String subjCode) {
        this.subjCode = subjCode;
    }

    public Ssrcorq withSubjCode(String subjCode) {
        this.subjCode = subjCode;
        return this;
    }

    /**
     * Section
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("sectNumb")
    public String getSectNumb() {
        return sectNumb;
    }

    /**
     * Section
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("sectNumb")
    public void setSectNumb(String sectNumb) {
        this.sectNumb = sectNumb;
    }

    public Ssrcorq withSectNumb(String sectNumb) {
        this.sectNumb = sectNumb;
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

    public Ssrcorq withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ssrcorq.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("crseNumb");
        sb.append('=');
        sb.append(((this.crseNumb == null)?"<null>":this.crseNumb));
        sb.append(',');
        sb.append("crnCorq");
        sb.append('=');
        sb.append(((this.crnCorq == null)?"<null>":this.crnCorq));
        sb.append(',');
        sb.append("subjCode");
        sb.append('=');
        sb.append(((this.subjCode == null)?"<null>":this.subjCode));
        sb.append(',');
        sb.append("sectNumb");
        sb.append('=');
        sb.append(((this.sectNumb == null)?"<null>":this.sectNumb));
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
        result = ((result* 31)+((this.crseNumb == null)? 0 :this.crseNumb.hashCode()));
        result = ((result* 31)+((this.sectNumb == null)? 0 :this.sectNumb.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.crnCorq == null)? 0 :this.crnCorq.hashCode()));
        result = ((result* 31)+((this.subjCode == null)? 0 :this.subjCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ssrcorq) == false) {
            return false;
        }
        Ssrcorq rhs = ((Ssrcorq) other);
        return ((((((this.crseNumb == rhs.crseNumb)||((this.crseNumb!= null)&&this.crseNumb.equals(rhs.crseNumb)))&&((this.sectNumb == rhs.sectNumb)||((this.sectNumb!= null)&&this.sectNumb.equals(rhs.sectNumb))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.crnCorq == rhs.crnCorq)||((this.crnCorq!= null)&&this.crnCorq.equals(rhs.crnCorq))))&&((this.subjCode == rhs.subjCode)||((this.subjCode!= null)&&this.subjCode.equals(rhs.subjCode))));
    }

}
