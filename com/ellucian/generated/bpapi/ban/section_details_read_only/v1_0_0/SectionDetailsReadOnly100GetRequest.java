
package com.ellucian.generated.bpapi.ban.section_details_read_only.v1_0_0;

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
    "keyblocTermCodeEff",
    "keyblckCrn"
})
@Generated("jsonschema2pojo")
public class SectionDetailsReadOnly100GetRequest {

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCodeEff, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCodeEff")
    @JsonPropertyDescription("Lineage reference object : keyblocTermCodeEff, Lookup lineage reference object : stvterm")
    private Object keyblocTermCodeEff;
    /**
     * Lineage reference object : keyblocCrn, Lookup lineage reference object : _date,ssbsect_reg_to_date,ssbsect_ssts_code,ssbsect_camp_code,course_title,ssbsect_schd_code,ssbsect_insm_code,ssbsect_dunt_code,ssbsect_number_of_units,block_indicator,ssbsect_link_ident,cross_list,ssbsect_reserved_ind,long_course_title,syllabus_indicator,section_comments_indicator,ssbsect_max_enrl,ssbsect_enrl,ssbsect_seats_avail,ssbsect_wait_capacity,ssbsect_wait_count,ssbsect_wait_avail,svq_ssasecq
     * 
     */
    @JsonProperty("keyblckCrn")
    @JsonPropertyDescription("Lineage reference object : keyblocCrn, Lookup lineage reference object : _date,ssbsect_reg_to_date,ssbsect_ssts_code,ssbsect_camp_code,course_title,ssbsect_schd_code,ssbsect_insm_code,ssbsect_dunt_code,ssbsect_number_of_units,block_indicator,ssbsect_link_ident,cross_list,ssbsect_reserved_ind,long_course_title,syllabus_indicator,section_comments_indicator,ssbsect_max_enrl,ssbsect_enrl,ssbsect_seats_avail,ssbsect_wait_capacity,ssbsect_wait_count,ssbsect_wait_avail,svq_ssasecq")
    private Object keyblckCrn;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCodeEff, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCodeEff")
    public Object getKeyblocTermCodeEff() {
        return keyblocTermCodeEff;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCodeEff, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCodeEff")
    public void setKeyblocTermCodeEff(Object keyblocTermCodeEff) {
        this.keyblocTermCodeEff = keyblocTermCodeEff;
    }

    public SectionDetailsReadOnly100GetRequest withKeyblocTermCodeEff(Object keyblocTermCodeEff) {
        this.keyblocTermCodeEff = keyblocTermCodeEff;
        return this;
    }

    /**
     * Lineage reference object : keyblocCrn, Lookup lineage reference object : _date,ssbsect_reg_to_date,ssbsect_ssts_code,ssbsect_camp_code,course_title,ssbsect_schd_code,ssbsect_insm_code,ssbsect_dunt_code,ssbsect_number_of_units,block_indicator,ssbsect_link_ident,cross_list,ssbsect_reserved_ind,long_course_title,syllabus_indicator,section_comments_indicator,ssbsect_max_enrl,ssbsect_enrl,ssbsect_seats_avail,ssbsect_wait_capacity,ssbsect_wait_count,ssbsect_wait_avail,svq_ssasecq
     * 
     */
    @JsonProperty("keyblckCrn")
    public Object getKeyblckCrn() {
        return keyblckCrn;
    }

    /**
     * Lineage reference object : keyblocCrn, Lookup lineage reference object : _date,ssbsect_reg_to_date,ssbsect_ssts_code,ssbsect_camp_code,course_title,ssbsect_schd_code,ssbsect_insm_code,ssbsect_dunt_code,ssbsect_number_of_units,block_indicator,ssbsect_link_ident,cross_list,ssbsect_reserved_ind,long_course_title,syllabus_indicator,section_comments_indicator,ssbsect_max_enrl,ssbsect_enrl,ssbsect_seats_avail,ssbsect_wait_capacity,ssbsect_wait_count,ssbsect_wait_avail,svq_ssasecq
     * 
     */
    @JsonProperty("keyblckCrn")
    public void setKeyblckCrn(Object keyblckCrn) {
        this.keyblckCrn = keyblckCrn;
    }

    public SectionDetailsReadOnly100GetRequest withKeyblckCrn(Object keyblckCrn) {
        this.keyblckCrn = keyblckCrn;
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

    public SectionDetailsReadOnly100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SectionDetailsReadOnly100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblocTermCodeEff");
        sb.append('=');
        sb.append(((this.keyblocTermCodeEff == null)?"<null>":this.keyblocTermCodeEff));
        sb.append(',');
        sb.append("keyblckCrn");
        sb.append('=');
        sb.append(((this.keyblckCrn == null)?"<null>":this.keyblckCrn));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.keyblocTermCodeEff == null)? 0 :this.keyblocTermCodeEff.hashCode()));
        result = ((result* 31)+((this.keyblckCrn == null)? 0 :this.keyblckCrn.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SectionDetailsReadOnly100GetRequest) == false) {
            return false;
        }
        SectionDetailsReadOnly100GetRequest rhs = ((SectionDetailsReadOnly100GetRequest) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.keyblocTermCodeEff == rhs.keyblocTermCodeEff)||((this.keyblocTermCodeEff!= null)&&this.keyblocTermCodeEff.equals(rhs.keyblocTermCodeEff))))&&((this.keyblckCrn == rhs.keyblckCrn)||((this.keyblckCrn!= null)&&this.keyblckCrn.equals(rhs.keyblckCrn))));
    }

}
