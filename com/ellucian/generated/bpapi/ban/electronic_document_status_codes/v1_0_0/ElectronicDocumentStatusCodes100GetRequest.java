
package com.ellucian.generated.bpapi.ban.electronic_document_status_codes.v1_0_0;

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
    "archInd",
    "code",
    "acrecUdeInd",
    "immunizationInd",
    "studentUdeInd",
    "mainUdeInd",
    "courseUdeInd",
    "taInd",
    "testsInd",
    "defPriority",
    "desc"
})
@Generated("jsonschema2pojo")
public class ElectronicDocumentStatusCodes100GetRequest {

    /**
     * Lineage reference object : STVDSTS_ARCH_IND
     * 
     */
    @JsonProperty("archInd")
    @JsonPropertyDescription("Lineage reference object : STVDSTS_ARCH_IND")
    private String archInd;
    /**
     * Status Code
     * <p>
     * Lineage reference object : STVDSTS_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVDSTS_CODE")
    private String code;
    /**
     * Lineage reference object : STVDSTS_ACREC_UDE_IND
     * 
     */
    @JsonProperty("acrecUdeInd")
    @JsonPropertyDescription("Lineage reference object : STVDSTS_ACREC_UDE_IND")
    private String acrecUdeInd;
    /**
     * Lineage reference object : STVDSTS_IMMUNIZATION_IND
     * 
     */
    @JsonProperty("immunizationInd")
    @JsonPropertyDescription("Lineage reference object : STVDSTS_IMMUNIZATION_IND")
    private String immunizationInd;
    /**
     * Lineage reference object : STVDSTS_STUDENT_UDE_IND
     * 
     */
    @JsonProperty("studentUdeInd")
    @JsonPropertyDescription("Lineage reference object : STVDSTS_STUDENT_UDE_IND")
    private String studentUdeInd;
    /**
     * Lineage reference object : STVDSTS_MAIN_UDE_IND
     * 
     */
    @JsonProperty("mainUdeInd")
    @JsonPropertyDescription("Lineage reference object : STVDSTS_MAIN_UDE_IND")
    private String mainUdeInd;
    /**
     * Lineage reference object : STVDSTS_COURSE_UDE_IND
     * 
     */
    @JsonProperty("courseUdeInd")
    @JsonPropertyDescription("Lineage reference object : STVDSTS_COURSE_UDE_IND")
    private String courseUdeInd;
    /**
     * Lineage reference object : STVDSTS_TA_IND
     * 
     */
    @JsonProperty("taInd")
    @JsonPropertyDescription("Lineage reference object : STVDSTS_TA_IND")
    private String taInd;
    /**
     * Lineage reference object : STVDSTS_TESTS_IND
     * 
     */
    @JsonProperty("testsInd")
    @JsonPropertyDescription("Lineage reference object : STVDSTS_TESTS_IND")
    private String testsInd;
    /**
     * Priority
     * <p>
     * Lineage reference object : STVDSTS_DEF_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("defPriority")
    @JsonPropertyDescription("Lineage reference object : STVDSTS_DEF_PRIORITY")
    private Double defPriority;
    /**
     * Description
     * <p>
     * Lineage reference object : STVDSTS_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVDSTS_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : STVDSTS_ARCH_IND
     * 
     */
    @JsonProperty("archInd")
    public String getArchInd() {
        return archInd;
    }

    /**
     * Lineage reference object : STVDSTS_ARCH_IND
     * 
     */
    @JsonProperty("archInd")
    public void setArchInd(String archInd) {
        this.archInd = archInd;
    }

    public ElectronicDocumentStatusCodes100GetRequest withArchInd(String archInd) {
        this.archInd = archInd;
        return this;
    }

    /**
     * Status Code
     * <p>
     * Lineage reference object : STVDSTS_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Status Code
     * <p>
     * Lineage reference object : STVDSTS_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public ElectronicDocumentStatusCodes100GetRequest withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Lineage reference object : STVDSTS_ACREC_UDE_IND
     * 
     */
    @JsonProperty("acrecUdeInd")
    public String getAcrecUdeInd() {
        return acrecUdeInd;
    }

    /**
     * Lineage reference object : STVDSTS_ACREC_UDE_IND
     * 
     */
    @JsonProperty("acrecUdeInd")
    public void setAcrecUdeInd(String acrecUdeInd) {
        this.acrecUdeInd = acrecUdeInd;
    }

    public ElectronicDocumentStatusCodes100GetRequest withAcrecUdeInd(String acrecUdeInd) {
        this.acrecUdeInd = acrecUdeInd;
        return this;
    }

    /**
     * Lineage reference object : STVDSTS_IMMUNIZATION_IND
     * 
     */
    @JsonProperty("immunizationInd")
    public String getImmunizationInd() {
        return immunizationInd;
    }

    /**
     * Lineage reference object : STVDSTS_IMMUNIZATION_IND
     * 
     */
    @JsonProperty("immunizationInd")
    public void setImmunizationInd(String immunizationInd) {
        this.immunizationInd = immunizationInd;
    }

    public ElectronicDocumentStatusCodes100GetRequest withImmunizationInd(String immunizationInd) {
        this.immunizationInd = immunizationInd;
        return this;
    }

    /**
     * Lineage reference object : STVDSTS_STUDENT_UDE_IND
     * 
     */
    @JsonProperty("studentUdeInd")
    public String getStudentUdeInd() {
        return studentUdeInd;
    }

    /**
     * Lineage reference object : STVDSTS_STUDENT_UDE_IND
     * 
     */
    @JsonProperty("studentUdeInd")
    public void setStudentUdeInd(String studentUdeInd) {
        this.studentUdeInd = studentUdeInd;
    }

    public ElectronicDocumentStatusCodes100GetRequest withStudentUdeInd(String studentUdeInd) {
        this.studentUdeInd = studentUdeInd;
        return this;
    }

    /**
     * Lineage reference object : STVDSTS_MAIN_UDE_IND
     * 
     */
    @JsonProperty("mainUdeInd")
    public String getMainUdeInd() {
        return mainUdeInd;
    }

    /**
     * Lineage reference object : STVDSTS_MAIN_UDE_IND
     * 
     */
    @JsonProperty("mainUdeInd")
    public void setMainUdeInd(String mainUdeInd) {
        this.mainUdeInd = mainUdeInd;
    }

    public ElectronicDocumentStatusCodes100GetRequest withMainUdeInd(String mainUdeInd) {
        this.mainUdeInd = mainUdeInd;
        return this;
    }

    /**
     * Lineage reference object : STVDSTS_COURSE_UDE_IND
     * 
     */
    @JsonProperty("courseUdeInd")
    public String getCourseUdeInd() {
        return courseUdeInd;
    }

    /**
     * Lineage reference object : STVDSTS_COURSE_UDE_IND
     * 
     */
    @JsonProperty("courseUdeInd")
    public void setCourseUdeInd(String courseUdeInd) {
        this.courseUdeInd = courseUdeInd;
    }

    public ElectronicDocumentStatusCodes100GetRequest withCourseUdeInd(String courseUdeInd) {
        this.courseUdeInd = courseUdeInd;
        return this;
    }

    /**
     * Lineage reference object : STVDSTS_TA_IND
     * 
     */
    @JsonProperty("taInd")
    public String getTaInd() {
        return taInd;
    }

    /**
     * Lineage reference object : STVDSTS_TA_IND
     * 
     */
    @JsonProperty("taInd")
    public void setTaInd(String taInd) {
        this.taInd = taInd;
    }

    public ElectronicDocumentStatusCodes100GetRequest withTaInd(String taInd) {
        this.taInd = taInd;
        return this;
    }

    /**
     * Lineage reference object : STVDSTS_TESTS_IND
     * 
     */
    @JsonProperty("testsInd")
    public String getTestsInd() {
        return testsInd;
    }

    /**
     * Lineage reference object : STVDSTS_TESTS_IND
     * 
     */
    @JsonProperty("testsInd")
    public void setTestsInd(String testsInd) {
        this.testsInd = testsInd;
    }

    public ElectronicDocumentStatusCodes100GetRequest withTestsInd(String testsInd) {
        this.testsInd = testsInd;
        return this;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : STVDSTS_DEF_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("defPriority")
    public Double getDefPriority() {
        return defPriority;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : STVDSTS_DEF_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("defPriority")
    public void setDefPriority(Double defPriority) {
        this.defPriority = defPriority;
    }

    public ElectronicDocumentStatusCodes100GetRequest withDefPriority(Double defPriority) {
        this.defPriority = defPriority;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVDSTS_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVDSTS_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ElectronicDocumentStatusCodes100GetRequest withDesc(String desc) {
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

    public ElectronicDocumentStatusCodes100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ElectronicDocumentStatusCodes100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("archInd");
        sb.append('=');
        sb.append(((this.archInd == null)?"<null>":this.archInd));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("acrecUdeInd");
        sb.append('=');
        sb.append(((this.acrecUdeInd == null)?"<null>":this.acrecUdeInd));
        sb.append(',');
        sb.append("immunizationInd");
        sb.append('=');
        sb.append(((this.immunizationInd == null)?"<null>":this.immunizationInd));
        sb.append(',');
        sb.append("studentUdeInd");
        sb.append('=');
        sb.append(((this.studentUdeInd == null)?"<null>":this.studentUdeInd));
        sb.append(',');
        sb.append("mainUdeInd");
        sb.append('=');
        sb.append(((this.mainUdeInd == null)?"<null>":this.mainUdeInd));
        sb.append(',');
        sb.append("courseUdeInd");
        sb.append('=');
        sb.append(((this.courseUdeInd == null)?"<null>":this.courseUdeInd));
        sb.append(',');
        sb.append("taInd");
        sb.append('=');
        sb.append(((this.taInd == null)?"<null>":this.taInd));
        sb.append(',');
        sb.append("testsInd");
        sb.append('=');
        sb.append(((this.testsInd == null)?"<null>":this.testsInd));
        sb.append(',');
        sb.append("defPriority");
        sb.append('=');
        sb.append(((this.defPriority == null)?"<null>":this.defPriority));
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
        result = ((result* 31)+((this.archInd == null)? 0 :this.archInd.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.studentUdeInd == null)? 0 :this.studentUdeInd.hashCode()));
        result = ((result* 31)+((this.testsInd == null)? 0 :this.testsInd.hashCode()));
        result = ((result* 31)+((this.acrecUdeInd == null)? 0 :this.acrecUdeInd.hashCode()));
        result = ((result* 31)+((this.immunizationInd == null)? 0 :this.immunizationInd.hashCode()));
        result = ((result* 31)+((this.mainUdeInd == null)? 0 :this.mainUdeInd.hashCode()));
        result = ((result* 31)+((this.courseUdeInd == null)? 0 :this.courseUdeInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.taInd == null)? 0 :this.taInd.hashCode()));
        result = ((result* 31)+((this.defPriority == null)? 0 :this.defPriority.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ElectronicDocumentStatusCodes100GetRequest) == false) {
            return false;
        }
        ElectronicDocumentStatusCodes100GetRequest rhs = ((ElectronicDocumentStatusCodes100GetRequest) other);
        return (((((((((((((this.archInd == rhs.archInd)||((this.archInd!= null)&&this.archInd.equals(rhs.archInd)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.studentUdeInd == rhs.studentUdeInd)||((this.studentUdeInd!= null)&&this.studentUdeInd.equals(rhs.studentUdeInd))))&&((this.testsInd == rhs.testsInd)||((this.testsInd!= null)&&this.testsInd.equals(rhs.testsInd))))&&((this.acrecUdeInd == rhs.acrecUdeInd)||((this.acrecUdeInd!= null)&&this.acrecUdeInd.equals(rhs.acrecUdeInd))))&&((this.immunizationInd == rhs.immunizationInd)||((this.immunizationInd!= null)&&this.immunizationInd.equals(rhs.immunizationInd))))&&((this.mainUdeInd == rhs.mainUdeInd)||((this.mainUdeInd!= null)&&this.mainUdeInd.equals(rhs.mainUdeInd))))&&((this.courseUdeInd == rhs.courseUdeInd)||((this.courseUdeInd!= null)&&this.courseUdeInd.equals(rhs.courseUdeInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.taInd == rhs.taInd)||((this.taInd!= null)&&this.taInd.equals(rhs.taInd))))&&((this.defPriority == rhs.defPriority)||((this.defPriority!= null)&&this.defPriority.equals(rhs.defPriority))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
