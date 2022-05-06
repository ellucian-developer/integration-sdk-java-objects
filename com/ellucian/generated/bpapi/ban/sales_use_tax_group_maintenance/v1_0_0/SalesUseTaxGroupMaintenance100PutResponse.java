
package com.ellucian.generated.bpapi.ban.sales_use_tax_group_maintenance.v1_0_0;

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
    "ftrtgtr",
    "ftvtgrp"
})
@Generated("jsonschema2pojo")
public class SalesUseTaxGroupMaintenance100PutResponse {

    @JsonProperty("ftrtgtr")
    private List<Ftrtgtr__2> ftrtgtr = new ArrayList<Ftrtgtr__2>();
    @JsonProperty("ftvtgrp")
    private List<Ftvtgrp__2> ftvtgrp = new ArrayList<Ftvtgrp__2>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ftrtgtr")
    public List<Ftrtgtr__2> getFtrtgtr() {
        return ftrtgtr;
    }

    @JsonProperty("ftrtgtr")
    public void setFtrtgtr(List<Ftrtgtr__2> ftrtgtr) {
        this.ftrtgtr = ftrtgtr;
    }

    public SalesUseTaxGroupMaintenance100PutResponse withFtrtgtr(List<Ftrtgtr__2> ftrtgtr) {
        this.ftrtgtr = ftrtgtr;
        return this;
    }

    @JsonProperty("ftvtgrp")
    public List<Ftvtgrp__2> getFtvtgrp() {
        return ftvtgrp;
    }

    @JsonProperty("ftvtgrp")
    public void setFtvtgrp(List<Ftvtgrp__2> ftvtgrp) {
        this.ftvtgrp = ftvtgrp;
    }

    public SalesUseTaxGroupMaintenance100PutResponse withFtvtgrp(List<Ftvtgrp__2> ftvtgrp) {
        this.ftvtgrp = ftvtgrp;
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

    public SalesUseTaxGroupMaintenance100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SalesUseTaxGroupMaintenance100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ftrtgtr");
        sb.append('=');
        sb.append(((this.ftrtgtr == null)?"<null>":this.ftrtgtr));
        sb.append(',');
        sb.append("ftvtgrp");
        sb.append('=');
        sb.append(((this.ftvtgrp == null)?"<null>":this.ftvtgrp));
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
        result = ((result* 31)+((this.ftvtgrp == null)? 0 :this.ftvtgrp.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ftrtgtr == null)? 0 :this.ftrtgtr.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SalesUseTaxGroupMaintenance100PutResponse) == false) {
            return false;
        }
        SalesUseTaxGroupMaintenance100PutResponse rhs = ((SalesUseTaxGroupMaintenance100PutResponse) other);
        return ((((this.ftvtgrp == rhs.ftvtgrp)||((this.ftvtgrp!= null)&&this.ftvtgrp.equals(rhs.ftvtgrp)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ftrtgtr == rhs.ftrtgtr)||((this.ftrtgtr!= null)&&this.ftrtgtr.equals(rhs.ftrtgtr))));
    }

}
