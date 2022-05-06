
package com.ellucian.generated.bpapi.ban.statement_and_payment_history.v1_0_0;

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
    "globalId",
    "globalInstitution"
})
@Generated("jsonschema2pojo")
public class StatementAndPaymentHistory100QapiPost {

    @JsonProperty("globalId")
    private String globalId;
    @JsonProperty("globalInstitution")
    private String globalInstitution;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("globalId")
    public String getGlobalId() {
        return globalId;
    }

    @JsonProperty("globalId")
    public void setGlobalId(String globalId) {
        this.globalId = globalId;
    }

    public StatementAndPaymentHistory100QapiPost withGlobalId(String globalId) {
        this.globalId = globalId;
        return this;
    }

    @JsonProperty("globalInstitution")
    public String getGlobalInstitution() {
        return globalInstitution;
    }

    @JsonProperty("globalInstitution")
    public void setGlobalInstitution(String globalInstitution) {
        this.globalInstitution = globalInstitution;
    }

    public StatementAndPaymentHistory100QapiPost withGlobalInstitution(String globalInstitution) {
        this.globalInstitution = globalInstitution;
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

    public StatementAndPaymentHistory100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StatementAndPaymentHistory100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("globalId");
        sb.append('=');
        sb.append(((this.globalId == null)?"<null>":this.globalId));
        sb.append(',');
        sb.append("globalInstitution");
        sb.append('=');
        sb.append(((this.globalInstitution == null)?"<null>":this.globalInstitution));
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
        result = ((result* 31)+((this.globalId == null)? 0 :this.globalId.hashCode()));
        result = ((result* 31)+((this.globalInstitution == null)? 0 :this.globalInstitution.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StatementAndPaymentHistory100QapiPost) == false) {
            return false;
        }
        StatementAndPaymentHistory100QapiPost rhs = ((StatementAndPaymentHistory100QapiPost) other);
        return ((((this.globalId == rhs.globalId)||((this.globalId!= null)&&this.globalId.equals(rhs.globalId)))&&((this.globalInstitution == rhs.globalInstitution)||((this.globalInstitution!= null)&&this.globalInstitution.equals(rhs.globalInstitution))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
