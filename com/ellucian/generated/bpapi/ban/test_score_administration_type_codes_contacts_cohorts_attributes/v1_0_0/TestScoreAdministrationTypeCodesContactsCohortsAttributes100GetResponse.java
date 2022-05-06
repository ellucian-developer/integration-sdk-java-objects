
package com.ellucian.generated.bpapi.ban.test_score_administration_type_codes_contacts_cohorts_attributes.v1_0_0;

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
    "sgrchrt",
    "sgrsatt"
})
@Generated("jsonschema2pojo")
public class TestScoreAdministrationTypeCodesContactsCohortsAttributes100GetResponse {

    @JsonProperty("sgrchrt")
    private List<Sgrchrt> sgrchrt = new ArrayList<Sgrchrt>();
    @JsonProperty("sgrsatt")
    private List<Sgrsatt> sgrsatt = new ArrayList<Sgrsatt>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sgrchrt")
    public List<Sgrchrt> getSgrchrt() {
        return sgrchrt;
    }

    @JsonProperty("sgrchrt")
    public void setSgrchrt(List<Sgrchrt> sgrchrt) {
        this.sgrchrt = sgrchrt;
    }

    public TestScoreAdministrationTypeCodesContactsCohortsAttributes100GetResponse withSgrchrt(List<Sgrchrt> sgrchrt) {
        this.sgrchrt = sgrchrt;
        return this;
    }

    @JsonProperty("sgrsatt")
    public List<Sgrsatt> getSgrsatt() {
        return sgrsatt;
    }

    @JsonProperty("sgrsatt")
    public void setSgrsatt(List<Sgrsatt> sgrsatt) {
        this.sgrsatt = sgrsatt;
    }

    public TestScoreAdministrationTypeCodesContactsCohortsAttributes100GetResponse withSgrsatt(List<Sgrsatt> sgrsatt) {
        this.sgrsatt = sgrsatt;
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

    public TestScoreAdministrationTypeCodesContactsCohortsAttributes100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TestScoreAdministrationTypeCodesContactsCohortsAttributes100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sgrchrt");
        sb.append('=');
        sb.append(((this.sgrchrt == null)?"<null>":this.sgrchrt));
        sb.append(',');
        sb.append("sgrsatt");
        sb.append('=');
        sb.append(((this.sgrsatt == null)?"<null>":this.sgrsatt));
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
        result = ((result* 31)+((this.sgrchrt == null)? 0 :this.sgrchrt.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sgrsatt == null)? 0 :this.sgrsatt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TestScoreAdministrationTypeCodesContactsCohortsAttributes100GetResponse) == false) {
            return false;
        }
        TestScoreAdministrationTypeCodesContactsCohortsAttributes100GetResponse rhs = ((TestScoreAdministrationTypeCodesContactsCohortsAttributes100GetResponse) other);
        return ((((this.sgrchrt == rhs.sgrchrt)||((this.sgrchrt!= null)&&this.sgrchrt.equals(rhs.sgrchrt)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sgrsatt == rhs.sgrsatt)||((this.sgrsatt!= null)&&this.sgrsatt.equals(rhs.sgrsatt))));
    }

}
