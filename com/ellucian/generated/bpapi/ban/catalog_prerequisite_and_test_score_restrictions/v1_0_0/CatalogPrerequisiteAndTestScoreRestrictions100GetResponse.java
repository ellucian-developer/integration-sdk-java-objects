
package com.ellucian.generated.bpapi.ban.catalog_prerequisite_and_test_score_restrictions.v1_0_0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "scrclpp",
    "scrprts",
    "scrprts_ctrl_block"
})
@Generated("jsonschema2pojo")
public class CatalogPrerequisiteAndTestScoreRestrictions100GetResponse {

    @JsonProperty("scrclpp")
    private List<Scrclpp> scrclpp = new ArrayList<Scrclpp>();
    @JsonProperty("scrprts")
    private List<Scrprt> scrprts = new ArrayList<Scrprt>();
    @JsonProperty("scrprts_ctrl_block")
    private List<ScrprtsCtrlBlock> scrprtsCtrlBlock = new ArrayList<ScrprtsCtrlBlock>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("scrclpp")
    public List<Scrclpp> getScrclpp() {
        return scrclpp;
    }

    @JsonProperty("scrclpp")
    public void setScrclpp(List<Scrclpp> scrclpp) {
        this.scrclpp = scrclpp;
    }

    public CatalogPrerequisiteAndTestScoreRestrictions100GetResponse withScrclpp(List<Scrclpp> scrclpp) {
        this.scrclpp = scrclpp;
        return this;
    }

    @JsonProperty("scrprts")
    public List<Scrprt> getScrprts() {
        return scrprts;
    }

    @JsonProperty("scrprts")
    public void setScrprts(List<Scrprt> scrprts) {
        this.scrprts = scrprts;
    }

    public CatalogPrerequisiteAndTestScoreRestrictions100GetResponse withScrprts(List<Scrprt> scrprts) {
        this.scrprts = scrprts;
        return this;
    }

    @JsonProperty("scrprts_ctrl_block")
    public List<ScrprtsCtrlBlock> getScrprtsCtrlBlock() {
        return scrprtsCtrlBlock;
    }

    @JsonProperty("scrprts_ctrl_block")
    public void setScrprtsCtrlBlock(List<ScrprtsCtrlBlock> scrprtsCtrlBlock) {
        this.scrprtsCtrlBlock = scrprtsCtrlBlock;
    }

    public CatalogPrerequisiteAndTestScoreRestrictions100GetResponse withScrprtsCtrlBlock(List<ScrprtsCtrlBlock> scrprtsCtrlBlock) {
        this.scrprtsCtrlBlock = scrprtsCtrlBlock;
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

    public CatalogPrerequisiteAndTestScoreRestrictions100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CatalogPrerequisiteAndTestScoreRestrictions100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scrclpp");
        sb.append('=');
        sb.append(((this.scrclpp == null)?"<null>":this.scrclpp));
        sb.append(',');
        sb.append("scrprts");
        sb.append('=');
        sb.append(((this.scrprts == null)?"<null>":this.scrprts));
        sb.append(',');
        sb.append("scrprtsCtrlBlock");
        sb.append('=');
        sb.append(((this.scrprtsCtrlBlock == null)?"<null>":this.scrprtsCtrlBlock));
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
        result = ((result* 31)+((this.scrclpp == null)? 0 :this.scrclpp.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.scrprts == null)? 0 :this.scrprts.hashCode()));
        result = ((result* 31)+((this.scrprtsCtrlBlock == null)? 0 :this.scrprtsCtrlBlock.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CatalogPrerequisiteAndTestScoreRestrictions100GetResponse) == false) {
            return false;
        }
        CatalogPrerequisiteAndTestScoreRestrictions100GetResponse rhs = ((CatalogPrerequisiteAndTestScoreRestrictions100GetResponse) other);
        return (((((this.scrclpp == rhs.scrclpp)||((this.scrclpp!= null)&&this.scrclpp.equals(rhs.scrclpp)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.scrprts == rhs.scrprts)||((this.scrprts!= null)&&this.scrprts.equals(rhs.scrprts))))&&((this.scrprtsCtrlBlock == rhs.scrprtsCtrlBlock)||((this.scrprtsCtrlBlock!= null)&&this.scrprtsCtrlBlock.equals(rhs.scrprtsCtrlBlock))));
    }

}
