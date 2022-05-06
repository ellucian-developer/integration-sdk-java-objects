
package com.ellucian.generated.bpapi.ban.application_questions_or_answers.v1_0_0;

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
    "saradap",
    "sovlfos",
    "sovlcur",
    "sarquan"
})
@Generated("jsonschema2pojo")
public class ApplicationQuestionsOrAnswers100PutResponse {

    @JsonProperty("saradap")
    private List<Saradap__2> saradap = new ArrayList<Saradap__2>();
    @JsonProperty("sovlfos")
    private List<Sovlfo__2> sovlfos = new ArrayList<Sovlfo__2>();
    @JsonProperty("sovlcur")
    private List<Sovlcur__2> sovlcur = new ArrayList<Sovlcur__2>();
    @JsonProperty("sarquan")
    private List<Sarquan__2> sarquan = new ArrayList<Sarquan__2>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("saradap")
    public List<Saradap__2> getSaradap() {
        return saradap;
    }

    @JsonProperty("saradap")
    public void setSaradap(List<Saradap__2> saradap) {
        this.saradap = saradap;
    }

    public ApplicationQuestionsOrAnswers100PutResponse withSaradap(List<Saradap__2> saradap) {
        this.saradap = saradap;
        return this;
    }

    @JsonProperty("sovlfos")
    public List<Sovlfo__2> getSovlfos() {
        return sovlfos;
    }

    @JsonProperty("sovlfos")
    public void setSovlfos(List<Sovlfo__2> sovlfos) {
        this.sovlfos = sovlfos;
    }

    public ApplicationQuestionsOrAnswers100PutResponse withSovlfos(List<Sovlfo__2> sovlfos) {
        this.sovlfos = sovlfos;
        return this;
    }

    @JsonProperty("sovlcur")
    public List<Sovlcur__2> getSovlcur() {
        return sovlcur;
    }

    @JsonProperty("sovlcur")
    public void setSovlcur(List<Sovlcur__2> sovlcur) {
        this.sovlcur = sovlcur;
    }

    public ApplicationQuestionsOrAnswers100PutResponse withSovlcur(List<Sovlcur__2> sovlcur) {
        this.sovlcur = sovlcur;
        return this;
    }

    @JsonProperty("sarquan")
    public List<Sarquan__2> getSarquan() {
        return sarquan;
    }

    @JsonProperty("sarquan")
    public void setSarquan(List<Sarquan__2> sarquan) {
        this.sarquan = sarquan;
    }

    public ApplicationQuestionsOrAnswers100PutResponse withSarquan(List<Sarquan__2> sarquan) {
        this.sarquan = sarquan;
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

    public ApplicationQuestionsOrAnswers100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApplicationQuestionsOrAnswers100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("saradap");
        sb.append('=');
        sb.append(((this.saradap == null)?"<null>":this.saradap));
        sb.append(',');
        sb.append("sovlfos");
        sb.append('=');
        sb.append(((this.sovlfos == null)?"<null>":this.sovlfos));
        sb.append(',');
        sb.append("sovlcur");
        sb.append('=');
        sb.append(((this.sovlcur == null)?"<null>":this.sovlcur));
        sb.append(',');
        sb.append("sarquan");
        sb.append('=');
        sb.append(((this.sarquan == null)?"<null>":this.sarquan));
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
        result = ((result* 31)+((this.saradap == null)? 0 :this.saradap.hashCode()));
        result = ((result* 31)+((this.sovlfos == null)? 0 :this.sovlfos.hashCode()));
        result = ((result* 31)+((this.sovlcur == null)? 0 :this.sovlcur.hashCode()));
        result = ((result* 31)+((this.sarquan == null)? 0 :this.sarquan.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicationQuestionsOrAnswers100PutResponse) == false) {
            return false;
        }
        ApplicationQuestionsOrAnswers100PutResponse rhs = ((ApplicationQuestionsOrAnswers100PutResponse) other);
        return ((((((this.saradap == rhs.saradap)||((this.saradap!= null)&&this.saradap.equals(rhs.saradap)))&&((this.sovlfos == rhs.sovlfos)||((this.sovlfos!= null)&&this.sovlfos.equals(rhs.sovlfos))))&&((this.sovlcur == rhs.sovlcur)||((this.sovlcur!= null)&&this.sovlcur.equals(rhs.sovlcur))))&&((this.sarquan == rhs.sarquan)||((this.sarquan!= null)&&this.sarquan.equals(rhs.sarquan))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
