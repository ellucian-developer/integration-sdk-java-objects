
package com.ellucian.generated.bpapi.ban.schedule_evaluation.v1_0_0;

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
    "ssrevalScoreE",
    "code",
    "ssrevalScore2",
    "ssrevalScore3",
    "ssrevalScore1",
    "ssrevalScore6",
    "ssrevalScore7",
    "ssrevalScore4",
    "ssrevalScore5",
    "ssrevalScoreNa",
    "ssrevalScoreNe",
    "ssrevalScoreTm",
    "desc"
})
@Generated("jsonschema2pojo")
public class Stveval {

    /**
     * Summary 3
     * <p>
     * 
     * 
     */
    @JsonProperty("ssrevalScoreE")
    private Object ssrevalScoreE;
    /**
     * Question
     * <p>
     * Lineage reference object : STVEVAL_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVEVAL_CODE")
    private Double code;
    /**
     * Score 2
     * <p>
     * 
     * 
     */
    @JsonProperty("ssrevalScore2")
    private Object ssrevalScore2;
    /**
     * Score 3
     * <p>
     * 
     * 
     */
    @JsonProperty("ssrevalScore3")
    private Object ssrevalScore3;
    /**
     * Low Score 1
     * <p>
     * 
     * 
     */
    @JsonProperty("ssrevalScore1")
    private Object ssrevalScore1;
    /**
     * Score 6
     * <p>
     * 
     * 
     */
    @JsonProperty("ssrevalScore6")
    private Object ssrevalScore6;
    /**
     * High Score 7
     * <p>
     * 
     * 
     */
    @JsonProperty("ssrevalScore7")
    private Object ssrevalScore7;
    /**
     * Score 4
     * <p>
     * 
     * 
     */
    @JsonProperty("ssrevalScore4")
    private Object ssrevalScore4;
    /**
     * Score 5
     * <p>
     * 
     * 
     */
    @JsonProperty("ssrevalScore5")
    private Object ssrevalScore5;
    /**
     * Summary 1
     * <p>
     * 
     * 
     */
    @JsonProperty("ssrevalScoreNa")
    private Object ssrevalScoreNa;
    /**
     * Summary 2
     * <p>
     * 
     * 
     */
    @JsonProperty("ssrevalScoreNe")
    private Object ssrevalScoreNe;
    /**
     * Summary 4
     * <p>
     * 
     * 
     */
    @JsonProperty("ssrevalScoreTm")
    private Object ssrevalScoreTm;
    /**
     * Description
     * <p>
     * Lineage reference object : STVEVAL_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVEVAL_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Summary 3
     * <p>
     * 
     * 
     */
    @JsonProperty("ssrevalScoreE")
    public Object getSsrevalScoreE() {
        return ssrevalScoreE;
    }

    /**
     * Summary 3
     * <p>
     * 
     * 
     */
    @JsonProperty("ssrevalScoreE")
    public void setSsrevalScoreE(Object ssrevalScoreE) {
        this.ssrevalScoreE = ssrevalScoreE;
    }

    public Stveval withSsrevalScoreE(Object ssrevalScoreE) {
        this.ssrevalScoreE = ssrevalScoreE;
        return this;
    }

    /**
     * Question
     * <p>
     * Lineage reference object : STVEVAL_CODE
     * 
     */
    @JsonProperty("code")
    public Double getCode() {
        return code;
    }

    /**
     * Question
     * <p>
     * Lineage reference object : STVEVAL_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(Double code) {
        this.code = code;
    }

    public Stveval withCode(Double code) {
        this.code = code;
        return this;
    }

    /**
     * Score 2
     * <p>
     * 
     * 
     */
    @JsonProperty("ssrevalScore2")
    public Object getSsrevalScore2() {
        return ssrevalScore2;
    }

    /**
     * Score 2
     * <p>
     * 
     * 
     */
    @JsonProperty("ssrevalScore2")
    public void setSsrevalScore2(Object ssrevalScore2) {
        this.ssrevalScore2 = ssrevalScore2;
    }

    public Stveval withSsrevalScore2(Object ssrevalScore2) {
        this.ssrevalScore2 = ssrevalScore2;
        return this;
    }

    /**
     * Score 3
     * <p>
     * 
     * 
     */
    @JsonProperty("ssrevalScore3")
    public Object getSsrevalScore3() {
        return ssrevalScore3;
    }

    /**
     * Score 3
     * <p>
     * 
     * 
     */
    @JsonProperty("ssrevalScore3")
    public void setSsrevalScore3(Object ssrevalScore3) {
        this.ssrevalScore3 = ssrevalScore3;
    }

    public Stveval withSsrevalScore3(Object ssrevalScore3) {
        this.ssrevalScore3 = ssrevalScore3;
        return this;
    }

    /**
     * Low Score 1
     * <p>
     * 
     * 
     */
    @JsonProperty("ssrevalScore1")
    public Object getSsrevalScore1() {
        return ssrevalScore1;
    }

    /**
     * Low Score 1
     * <p>
     * 
     * 
     */
    @JsonProperty("ssrevalScore1")
    public void setSsrevalScore1(Object ssrevalScore1) {
        this.ssrevalScore1 = ssrevalScore1;
    }

    public Stveval withSsrevalScore1(Object ssrevalScore1) {
        this.ssrevalScore1 = ssrevalScore1;
        return this;
    }

    /**
     * Score 6
     * <p>
     * 
     * 
     */
    @JsonProperty("ssrevalScore6")
    public Object getSsrevalScore6() {
        return ssrevalScore6;
    }

    /**
     * Score 6
     * <p>
     * 
     * 
     */
    @JsonProperty("ssrevalScore6")
    public void setSsrevalScore6(Object ssrevalScore6) {
        this.ssrevalScore6 = ssrevalScore6;
    }

    public Stveval withSsrevalScore6(Object ssrevalScore6) {
        this.ssrevalScore6 = ssrevalScore6;
        return this;
    }

    /**
     * High Score 7
     * <p>
     * 
     * 
     */
    @JsonProperty("ssrevalScore7")
    public Object getSsrevalScore7() {
        return ssrevalScore7;
    }

    /**
     * High Score 7
     * <p>
     * 
     * 
     */
    @JsonProperty("ssrevalScore7")
    public void setSsrevalScore7(Object ssrevalScore7) {
        this.ssrevalScore7 = ssrevalScore7;
    }

    public Stveval withSsrevalScore7(Object ssrevalScore7) {
        this.ssrevalScore7 = ssrevalScore7;
        return this;
    }

    /**
     * Score 4
     * <p>
     * 
     * 
     */
    @JsonProperty("ssrevalScore4")
    public Object getSsrevalScore4() {
        return ssrevalScore4;
    }

    /**
     * Score 4
     * <p>
     * 
     * 
     */
    @JsonProperty("ssrevalScore4")
    public void setSsrevalScore4(Object ssrevalScore4) {
        this.ssrevalScore4 = ssrevalScore4;
    }

    public Stveval withSsrevalScore4(Object ssrevalScore4) {
        this.ssrevalScore4 = ssrevalScore4;
        return this;
    }

    /**
     * Score 5
     * <p>
     * 
     * 
     */
    @JsonProperty("ssrevalScore5")
    public Object getSsrevalScore5() {
        return ssrevalScore5;
    }

    /**
     * Score 5
     * <p>
     * 
     * 
     */
    @JsonProperty("ssrevalScore5")
    public void setSsrevalScore5(Object ssrevalScore5) {
        this.ssrevalScore5 = ssrevalScore5;
    }

    public Stveval withSsrevalScore5(Object ssrevalScore5) {
        this.ssrevalScore5 = ssrevalScore5;
        return this;
    }

    /**
     * Summary 1
     * <p>
     * 
     * 
     */
    @JsonProperty("ssrevalScoreNa")
    public Object getSsrevalScoreNa() {
        return ssrevalScoreNa;
    }

    /**
     * Summary 1
     * <p>
     * 
     * 
     */
    @JsonProperty("ssrevalScoreNa")
    public void setSsrevalScoreNa(Object ssrevalScoreNa) {
        this.ssrevalScoreNa = ssrevalScoreNa;
    }

    public Stveval withSsrevalScoreNa(Object ssrevalScoreNa) {
        this.ssrevalScoreNa = ssrevalScoreNa;
        return this;
    }

    /**
     * Summary 2
     * <p>
     * 
     * 
     */
    @JsonProperty("ssrevalScoreNe")
    public Object getSsrevalScoreNe() {
        return ssrevalScoreNe;
    }

    /**
     * Summary 2
     * <p>
     * 
     * 
     */
    @JsonProperty("ssrevalScoreNe")
    public void setSsrevalScoreNe(Object ssrevalScoreNe) {
        this.ssrevalScoreNe = ssrevalScoreNe;
    }

    public Stveval withSsrevalScoreNe(Object ssrevalScoreNe) {
        this.ssrevalScoreNe = ssrevalScoreNe;
        return this;
    }

    /**
     * Summary 4
     * <p>
     * 
     * 
     */
    @JsonProperty("ssrevalScoreTm")
    public Object getSsrevalScoreTm() {
        return ssrevalScoreTm;
    }

    /**
     * Summary 4
     * <p>
     * 
     * 
     */
    @JsonProperty("ssrevalScoreTm")
    public void setSsrevalScoreTm(Object ssrevalScoreTm) {
        this.ssrevalScoreTm = ssrevalScoreTm;
    }

    public Stveval withSsrevalScoreTm(Object ssrevalScoreTm) {
        this.ssrevalScoreTm = ssrevalScoreTm;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVEVAL_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVEVAL_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Stveval withDesc(String desc) {
        this.desc = desc;
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

    public Stveval withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Stveval.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssrevalScoreE");
        sb.append('=');
        sb.append(((this.ssrevalScoreE == null)?"<null>":this.ssrevalScoreE));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("ssrevalScore2");
        sb.append('=');
        sb.append(((this.ssrevalScore2 == null)?"<null>":this.ssrevalScore2));
        sb.append(',');
        sb.append("ssrevalScore3");
        sb.append('=');
        sb.append(((this.ssrevalScore3 == null)?"<null>":this.ssrevalScore3));
        sb.append(',');
        sb.append("ssrevalScore1");
        sb.append('=');
        sb.append(((this.ssrevalScore1 == null)?"<null>":this.ssrevalScore1));
        sb.append(',');
        sb.append("ssrevalScore6");
        sb.append('=');
        sb.append(((this.ssrevalScore6 == null)?"<null>":this.ssrevalScore6));
        sb.append(',');
        sb.append("ssrevalScore7");
        sb.append('=');
        sb.append(((this.ssrevalScore7 == null)?"<null>":this.ssrevalScore7));
        sb.append(',');
        sb.append("ssrevalScore4");
        sb.append('=');
        sb.append(((this.ssrevalScore4 == null)?"<null>":this.ssrevalScore4));
        sb.append(',');
        sb.append("ssrevalScore5");
        sb.append('=');
        sb.append(((this.ssrevalScore5 == null)?"<null>":this.ssrevalScore5));
        sb.append(',');
        sb.append("ssrevalScoreNa");
        sb.append('=');
        sb.append(((this.ssrevalScoreNa == null)?"<null>":this.ssrevalScoreNa));
        sb.append(',');
        sb.append("ssrevalScoreNe");
        sb.append('=');
        sb.append(((this.ssrevalScoreNe == null)?"<null>":this.ssrevalScoreNe));
        sb.append(',');
        sb.append("ssrevalScoreTm");
        sb.append('=');
        sb.append(((this.ssrevalScoreTm == null)?"<null>":this.ssrevalScoreTm));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
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
        result = ((result* 31)+((this.ssrevalScoreE == null)? 0 :this.ssrevalScoreE.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.ssrevalScore2 == null)? 0 :this.ssrevalScore2 .hashCode()));
        result = ((result* 31)+((this.ssrevalScore3 == null)? 0 :this.ssrevalScore3 .hashCode()));
        result = ((result* 31)+((this.ssrevalScore1 == null)? 0 :this.ssrevalScore1 .hashCode()));
        result = ((result* 31)+((this.ssrevalScore6 == null)? 0 :this.ssrevalScore6 .hashCode()));
        result = ((result* 31)+((this.ssrevalScore7 == null)? 0 :this.ssrevalScore7 .hashCode()));
        result = ((result* 31)+((this.ssrevalScore4 == null)? 0 :this.ssrevalScore4 .hashCode()));
        result = ((result* 31)+((this.ssrevalScore5 == null)? 0 :this.ssrevalScore5 .hashCode()));
        result = ((result* 31)+((this.ssrevalScoreNa == null)? 0 :this.ssrevalScoreNa.hashCode()));
        result = ((result* 31)+((this.ssrevalScoreNe == null)? 0 :this.ssrevalScoreNe.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ssrevalScoreTm == null)? 0 :this.ssrevalScoreTm.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Stveval) == false) {
            return false;
        }
        Stveval rhs = ((Stveval) other);
        return (((((((((((((((this.ssrevalScoreE == rhs.ssrevalScoreE)||((this.ssrevalScoreE!= null)&&this.ssrevalScoreE.equals(rhs.ssrevalScoreE)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.ssrevalScore2 == rhs.ssrevalScore2)||((this.ssrevalScore2 != null)&&this.ssrevalScore2 .equals(rhs.ssrevalScore2))))&&((this.ssrevalScore3 == rhs.ssrevalScore3)||((this.ssrevalScore3 != null)&&this.ssrevalScore3 .equals(rhs.ssrevalScore3))))&&((this.ssrevalScore1 == rhs.ssrevalScore1)||((this.ssrevalScore1 != null)&&this.ssrevalScore1 .equals(rhs.ssrevalScore1))))&&((this.ssrevalScore6 == rhs.ssrevalScore6)||((this.ssrevalScore6 != null)&&this.ssrevalScore6 .equals(rhs.ssrevalScore6))))&&((this.ssrevalScore7 == rhs.ssrevalScore7)||((this.ssrevalScore7 != null)&&this.ssrevalScore7 .equals(rhs.ssrevalScore7))))&&((this.ssrevalScore4 == rhs.ssrevalScore4)||((this.ssrevalScore4 != null)&&this.ssrevalScore4 .equals(rhs.ssrevalScore4))))&&((this.ssrevalScore5 == rhs.ssrevalScore5)||((this.ssrevalScore5 != null)&&this.ssrevalScore5 .equals(rhs.ssrevalScore5))))&&((this.ssrevalScoreNa == rhs.ssrevalScoreNa)||((this.ssrevalScoreNa!= null)&&this.ssrevalScoreNa.equals(rhs.ssrevalScoreNa))))&&((this.ssrevalScoreNe == rhs.ssrevalScoreNe)||((this.ssrevalScoreNe!= null)&&this.ssrevalScoreNe.equals(rhs.ssrevalScoreNe))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ssrevalScoreTm == rhs.ssrevalScoreTm)||((this.ssrevalScoreTm!= null)&&this.ssrevalScoreTm.equals(rhs.ssrevalScoreTm))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
