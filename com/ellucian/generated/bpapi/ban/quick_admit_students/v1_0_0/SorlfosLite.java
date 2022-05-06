
package com.ellucian.generated.bpapi.ban.quick_admit_students.v1_0_0;

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
    "sorlfosMajrCodeAttach",
    "sorlfosLfstCode",
    "sorlfosDeptCode",
    "sorlfosMajrCode",
    "sorlfosPriorityNo",
    "sorlfosDeptDesc",
    "sorlfosAttachConcDesc",
    "sorlfosMajrDesc",
    "sorlfosCstsCode"
})
@Generated("jsonschema2pojo")
public class SorlfosLite {

    /**
     * Attached to Major
     * <p>
     * Lineage reference object : SOVLFOS_MAJR_CODE_ATTACH, Lookup lineage reference object : sobcact,stvmajr,sotlfos,sotlfos
     * 
     */
    @JsonProperty("sorlfosMajrCodeAttach")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_MAJR_CODE_ATTACH, Lookup lineage reference object : sobcact,stvmajr,sotlfos,sotlfos")
    private String sorlfosMajrCodeAttach;
    /**
     * Type
     * <p>
     * Lineage reference object : SOVLFOS_LFST_CODE, Lookup lineage reference object : gtvlfst
     * 
     */
    @JsonProperty("sorlfosLfstCode")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_LFST_CODE, Lookup lineage reference object : gtvlfst")
    private String sorlfosLfstCode;
    /**
     * Department
     * <p>
     * Lineage reference object : SOVLFOS_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("sorlfosDeptCode")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_DEPT_CODE, Lookup lineage reference object : stvdept")
    private String sorlfosDeptCode;
    /**
     * Field of Study
     * <p>
     * Lineage reference object : SOVLFOS_MAJR_CODE, Lookup lineage reference object : stvmajr,sovlfos
     * 
     */
    @JsonProperty("sorlfosMajrCode")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_MAJR_CODE, Lookup lineage reference object : stvmajr,sovlfos")
    private String sorlfosMajrCode;
    /**
     * Priority
     * <p>
     * Lineage reference object : SOVLFOS_PRIORITY_NO
     * 
     */
    @JsonProperty("sorlfosPriorityNo")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_PRIORITY_NO")
    private Double sorlfosPriorityNo;
    /**
     * Department Description
     * <p>
     * 
     * 
     */
    @JsonProperty("sorlfosDeptDesc")
    private String sorlfosDeptDesc;
    /**
     * Attached to Major Description
     * <p>
     * 
     * 
     */
    @JsonProperty("sorlfosAttachConcDesc")
    private String sorlfosAttachConcDesc;
    /**
     * Field of Study Description
     * <p>
     * 
     * 
     */
    @JsonProperty("sorlfosMajrDesc")
    private String sorlfosMajrDesc;
    /**
     * Status
     * <p>
     * Lineage reference object : SOVLFOS_CSTS_CODE, Lookup lineage reference object : stvcsts
     * 
     */
    @JsonProperty("sorlfosCstsCode")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_CSTS_CODE, Lookup lineage reference object : stvcsts")
    private String sorlfosCstsCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Attached to Major
     * <p>
     * Lineage reference object : SOVLFOS_MAJR_CODE_ATTACH, Lookup lineage reference object : sobcact,stvmajr,sotlfos,sotlfos
     * 
     */
    @JsonProperty("sorlfosMajrCodeAttach")
    public String getSorlfosMajrCodeAttach() {
        return sorlfosMajrCodeAttach;
    }

    /**
     * Attached to Major
     * <p>
     * Lineage reference object : SOVLFOS_MAJR_CODE_ATTACH, Lookup lineage reference object : sobcact,stvmajr,sotlfos,sotlfos
     * 
     */
    @JsonProperty("sorlfosMajrCodeAttach")
    public void setSorlfosMajrCodeAttach(String sorlfosMajrCodeAttach) {
        this.sorlfosMajrCodeAttach = sorlfosMajrCodeAttach;
    }

    public SorlfosLite withSorlfosMajrCodeAttach(String sorlfosMajrCodeAttach) {
        this.sorlfosMajrCodeAttach = sorlfosMajrCodeAttach;
        return this;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : SOVLFOS_LFST_CODE, Lookup lineage reference object : gtvlfst
     * 
     */
    @JsonProperty("sorlfosLfstCode")
    public String getSorlfosLfstCode() {
        return sorlfosLfstCode;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : SOVLFOS_LFST_CODE, Lookup lineage reference object : gtvlfst
     * 
     */
    @JsonProperty("sorlfosLfstCode")
    public void setSorlfosLfstCode(String sorlfosLfstCode) {
        this.sorlfosLfstCode = sorlfosLfstCode;
    }

    public SorlfosLite withSorlfosLfstCode(String sorlfosLfstCode) {
        this.sorlfosLfstCode = sorlfosLfstCode;
        return this;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SOVLFOS_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("sorlfosDeptCode")
    public String getSorlfosDeptCode() {
        return sorlfosDeptCode;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SOVLFOS_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("sorlfosDeptCode")
    public void setSorlfosDeptCode(String sorlfosDeptCode) {
        this.sorlfosDeptCode = sorlfosDeptCode;
    }

    public SorlfosLite withSorlfosDeptCode(String sorlfosDeptCode) {
        this.sorlfosDeptCode = sorlfosDeptCode;
        return this;
    }

    /**
     * Field of Study
     * <p>
     * Lineage reference object : SOVLFOS_MAJR_CODE, Lookup lineage reference object : stvmajr,sovlfos
     * 
     */
    @JsonProperty("sorlfosMajrCode")
    public String getSorlfosMajrCode() {
        return sorlfosMajrCode;
    }

    /**
     * Field of Study
     * <p>
     * Lineage reference object : SOVLFOS_MAJR_CODE, Lookup lineage reference object : stvmajr,sovlfos
     * 
     */
    @JsonProperty("sorlfosMajrCode")
    public void setSorlfosMajrCode(String sorlfosMajrCode) {
        this.sorlfosMajrCode = sorlfosMajrCode;
    }

    public SorlfosLite withSorlfosMajrCode(String sorlfosMajrCode) {
        this.sorlfosMajrCode = sorlfosMajrCode;
        return this;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : SOVLFOS_PRIORITY_NO
     * 
     */
    @JsonProperty("sorlfosPriorityNo")
    public Double getSorlfosPriorityNo() {
        return sorlfosPriorityNo;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : SOVLFOS_PRIORITY_NO
     * 
     */
    @JsonProperty("sorlfosPriorityNo")
    public void setSorlfosPriorityNo(Double sorlfosPriorityNo) {
        this.sorlfosPriorityNo = sorlfosPriorityNo;
    }

    public SorlfosLite withSorlfosPriorityNo(Double sorlfosPriorityNo) {
        this.sorlfosPriorityNo = sorlfosPriorityNo;
        return this;
    }

    /**
     * Department Description
     * <p>
     * 
     * 
     */
    @JsonProperty("sorlfosDeptDesc")
    public String getSorlfosDeptDesc() {
        return sorlfosDeptDesc;
    }

    /**
     * Department Description
     * <p>
     * 
     * 
     */
    @JsonProperty("sorlfosDeptDesc")
    public void setSorlfosDeptDesc(String sorlfosDeptDesc) {
        this.sorlfosDeptDesc = sorlfosDeptDesc;
    }

    public SorlfosLite withSorlfosDeptDesc(String sorlfosDeptDesc) {
        this.sorlfosDeptDesc = sorlfosDeptDesc;
        return this;
    }

    /**
     * Attached to Major Description
     * <p>
     * 
     * 
     */
    @JsonProperty("sorlfosAttachConcDesc")
    public String getSorlfosAttachConcDesc() {
        return sorlfosAttachConcDesc;
    }

    /**
     * Attached to Major Description
     * <p>
     * 
     * 
     */
    @JsonProperty("sorlfosAttachConcDesc")
    public void setSorlfosAttachConcDesc(String sorlfosAttachConcDesc) {
        this.sorlfosAttachConcDesc = sorlfosAttachConcDesc;
    }

    public SorlfosLite withSorlfosAttachConcDesc(String sorlfosAttachConcDesc) {
        this.sorlfosAttachConcDesc = sorlfosAttachConcDesc;
        return this;
    }

    /**
     * Field of Study Description
     * <p>
     * 
     * 
     */
    @JsonProperty("sorlfosMajrDesc")
    public String getSorlfosMajrDesc() {
        return sorlfosMajrDesc;
    }

    /**
     * Field of Study Description
     * <p>
     * 
     * 
     */
    @JsonProperty("sorlfosMajrDesc")
    public void setSorlfosMajrDesc(String sorlfosMajrDesc) {
        this.sorlfosMajrDesc = sorlfosMajrDesc;
    }

    public SorlfosLite withSorlfosMajrDesc(String sorlfosMajrDesc) {
        this.sorlfosMajrDesc = sorlfosMajrDesc;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SOVLFOS_CSTS_CODE, Lookup lineage reference object : stvcsts
     * 
     */
    @JsonProperty("sorlfosCstsCode")
    public String getSorlfosCstsCode() {
        return sorlfosCstsCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SOVLFOS_CSTS_CODE, Lookup lineage reference object : stvcsts
     * 
     */
    @JsonProperty("sorlfosCstsCode")
    public void setSorlfosCstsCode(String sorlfosCstsCode) {
        this.sorlfosCstsCode = sorlfosCstsCode;
    }

    public SorlfosLite withSorlfosCstsCode(String sorlfosCstsCode) {
        this.sorlfosCstsCode = sorlfosCstsCode;
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

    public SorlfosLite withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SorlfosLite.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sorlfosMajrCodeAttach");
        sb.append('=');
        sb.append(((this.sorlfosMajrCodeAttach == null)?"<null>":this.sorlfosMajrCodeAttach));
        sb.append(',');
        sb.append("sorlfosLfstCode");
        sb.append('=');
        sb.append(((this.sorlfosLfstCode == null)?"<null>":this.sorlfosLfstCode));
        sb.append(',');
        sb.append("sorlfosDeptCode");
        sb.append('=');
        sb.append(((this.sorlfosDeptCode == null)?"<null>":this.sorlfosDeptCode));
        sb.append(',');
        sb.append("sorlfosMajrCode");
        sb.append('=');
        sb.append(((this.sorlfosMajrCode == null)?"<null>":this.sorlfosMajrCode));
        sb.append(',');
        sb.append("sorlfosPriorityNo");
        sb.append('=');
        sb.append(((this.sorlfosPriorityNo == null)?"<null>":this.sorlfosPriorityNo));
        sb.append(',');
        sb.append("sorlfosDeptDesc");
        sb.append('=');
        sb.append(((this.sorlfosDeptDesc == null)?"<null>":this.sorlfosDeptDesc));
        sb.append(',');
        sb.append("sorlfosAttachConcDesc");
        sb.append('=');
        sb.append(((this.sorlfosAttachConcDesc == null)?"<null>":this.sorlfosAttachConcDesc));
        sb.append(',');
        sb.append("sorlfosMajrDesc");
        sb.append('=');
        sb.append(((this.sorlfosMajrDesc == null)?"<null>":this.sorlfosMajrDesc));
        sb.append(',');
        sb.append("sorlfosCstsCode");
        sb.append('=');
        sb.append(((this.sorlfosCstsCode == null)?"<null>":this.sorlfosCstsCode));
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
        result = ((result* 31)+((this.sorlfosMajrCodeAttach == null)? 0 :this.sorlfosMajrCodeAttach.hashCode()));
        result = ((result* 31)+((this.sorlfosLfstCode == null)? 0 :this.sorlfosLfstCode.hashCode()));
        result = ((result* 31)+((this.sorlfosDeptCode == null)? 0 :this.sorlfosDeptCode.hashCode()));
        result = ((result* 31)+((this.sorlfosMajrCode == null)? 0 :this.sorlfosMajrCode.hashCode()));
        result = ((result* 31)+((this.sorlfosPriorityNo == null)? 0 :this.sorlfosPriorityNo.hashCode()));
        result = ((result* 31)+((this.sorlfosDeptDesc == null)? 0 :this.sorlfosDeptDesc.hashCode()));
        result = ((result* 31)+((this.sorlfosAttachConcDesc == null)? 0 :this.sorlfosAttachConcDesc.hashCode()));
        result = ((result* 31)+((this.sorlfosMajrDesc == null)? 0 :this.sorlfosMajrDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sorlfosCstsCode == null)? 0 :this.sorlfosCstsCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SorlfosLite) == false) {
            return false;
        }
        SorlfosLite rhs = ((SorlfosLite) other);
        return (((((((((((this.sorlfosMajrCodeAttach == rhs.sorlfosMajrCodeAttach)||((this.sorlfosMajrCodeAttach!= null)&&this.sorlfosMajrCodeAttach.equals(rhs.sorlfosMajrCodeAttach)))&&((this.sorlfosLfstCode == rhs.sorlfosLfstCode)||((this.sorlfosLfstCode!= null)&&this.sorlfosLfstCode.equals(rhs.sorlfosLfstCode))))&&((this.sorlfosDeptCode == rhs.sorlfosDeptCode)||((this.sorlfosDeptCode!= null)&&this.sorlfosDeptCode.equals(rhs.sorlfosDeptCode))))&&((this.sorlfosMajrCode == rhs.sorlfosMajrCode)||((this.sorlfosMajrCode!= null)&&this.sorlfosMajrCode.equals(rhs.sorlfosMajrCode))))&&((this.sorlfosPriorityNo == rhs.sorlfosPriorityNo)||((this.sorlfosPriorityNo!= null)&&this.sorlfosPriorityNo.equals(rhs.sorlfosPriorityNo))))&&((this.sorlfosDeptDesc == rhs.sorlfosDeptDesc)||((this.sorlfosDeptDesc!= null)&&this.sorlfosDeptDesc.equals(rhs.sorlfosDeptDesc))))&&((this.sorlfosAttachConcDesc == rhs.sorlfosAttachConcDesc)||((this.sorlfosAttachConcDesc!= null)&&this.sorlfosAttachConcDesc.equals(rhs.sorlfosAttachConcDesc))))&&((this.sorlfosMajrDesc == rhs.sorlfosMajrDesc)||((this.sorlfosMajrDesc!= null)&&this.sorlfosMajrDesc.equals(rhs.sorlfosMajrDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sorlfosCstsCode == rhs.sorlfosCstsCode)||((this.sorlfosCstsCode!= null)&&this.sorlfosCstsCode.equals(rhs.sorlfosCstsCode))));
    }

}
