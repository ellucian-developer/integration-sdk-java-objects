
package com.ellucian.generated.bpapi.ban.student_tax_notifications.v1_0_0;

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
    "taxYear",
    "keyblckStudentId"
})
@Generated("jsonschema2pojo")
public class StudentTaxNotifications100QapiPost {

    @JsonProperty("taxYear")
    private String taxYear;
    @JsonProperty("keyblckStudentId")
    private String keyblckStudentId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("taxYear")
    public String getTaxYear() {
        return taxYear;
    }

    @JsonProperty("taxYear")
    public void setTaxYear(String taxYear) {
        this.taxYear = taxYear;
    }

    public StudentTaxNotifications100QapiPost withTaxYear(String taxYear) {
        this.taxYear = taxYear;
        return this;
    }

    @JsonProperty("keyblckStudentId")
    public String getKeyblckStudentId() {
        return keyblckStudentId;
    }

    @JsonProperty("keyblckStudentId")
    public void setKeyblckStudentId(String keyblckStudentId) {
        this.keyblckStudentId = keyblckStudentId;
    }

    public StudentTaxNotifications100QapiPost withKeyblckStudentId(String keyblckStudentId) {
        this.keyblckStudentId = keyblckStudentId;
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

    public StudentTaxNotifications100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentTaxNotifications100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("taxYear");
        sb.append('=');
        sb.append(((this.taxYear == null)?"<null>":this.taxYear));
        sb.append(',');
        sb.append("keyblckStudentId");
        sb.append('=');
        sb.append(((this.keyblckStudentId == null)?"<null>":this.keyblckStudentId));
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
        result = ((result* 31)+((this.taxYear == null)? 0 :this.taxYear.hashCode()));
        result = ((result* 31)+((this.keyblckStudentId == null)? 0 :this.keyblckStudentId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentTaxNotifications100QapiPost) == false) {
            return false;
        }
        StudentTaxNotifications100QapiPost rhs = ((StudentTaxNotifications100QapiPost) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.taxYear == rhs.taxYear)||((this.taxYear!= null)&&this.taxYear.equals(rhs.taxYear))))&&((this.keyblckStudentId == rhs.keyblckStudentId)||((this.keyblckStudentId!= null)&&this.keyblckStudentId.equals(rhs.keyblckStudentId))));
    }

}
