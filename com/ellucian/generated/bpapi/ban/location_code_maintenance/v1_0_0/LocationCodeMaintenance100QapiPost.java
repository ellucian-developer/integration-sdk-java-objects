
package com.ellucian.generated.bpapi.ban.location_code_maintenance.v1_0_0;

import java.util.Date;
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
    "criteria.coasCode",
    "criteria.addrLine4",
    "criteria.statusInd",
    "criteria.city",
    "criteria.locnCode",
    "criteria.state",
    "criteria.title",
    "criteria.zip",
    "criteria.effDate",
    "criteria.cntyCode",
    "criteria.termDate",
    "criteria.natnCode",
    "criteria.ctryCodePhone",
    "criteria.locnCodePred",
    "criteria.phoneArea",
    "criteria.squareFootage",
    "criteria.squareFootageRate",
    "criteria.phoneExt",
    "criteria.houseNumber",
    "criteria.carrierRoute",
    "criteria.addrLine1",
    "criteria.deliveryPoint",
    "criteria.addrLine2",
    "criteria.correctionDigit",
    "criteria.addrLine3",
    "activityDate"
})
@Generated("jsonschema2pojo")
public class LocationCodeMaintenance100QapiPost {

    @JsonProperty("criteria.coasCode")
    private String criteriaCoasCode;
    @JsonProperty("criteria.addrLine4")
    private String criteriaAddrLine4;
    @JsonProperty("criteria.statusInd")
    private String criteriaStatusInd;
    @JsonProperty("criteria.city")
    private String criteriaCity;
    @JsonProperty("criteria.locnCode")
    private String criteriaLocnCode;
    @JsonProperty("criteria.state")
    private String criteriaState;
    @JsonProperty("criteria.title")
    private String criteriaTitle;
    @JsonProperty("criteria.zip")
    private String criteriaZip;
    @JsonProperty("criteria.effDate")
    private String criteriaEffDate;
    @JsonProperty("criteria.cntyCode")
    private String criteriaCntyCode;
    @JsonProperty("criteria.termDate")
    private String criteriaTermDate;
    @JsonProperty("criteria.natnCode")
    private String criteriaNatnCode;
    @JsonProperty("criteria.ctryCodePhone")
    private String criteriaCtryCodePhone;
    @JsonProperty("criteria.locnCodePred")
    private String criteriaLocnCodePred;
    @JsonProperty("criteria.phoneArea")
    private String criteriaPhoneArea;
    @JsonProperty("criteria.squareFootage")
    private String criteriaSquareFootage;
    @JsonProperty("criteria.squareFootageRate")
    private String criteriaSquareFootageRate;
    @JsonProperty("criteria.phoneExt")
    private String criteriaPhoneExt;
    @JsonProperty("criteria.houseNumber")
    private String criteriaHouseNumber;
    @JsonProperty("criteria.carrierRoute")
    private String criteriaCarrierRoute;
    @JsonProperty("criteria.addrLine1")
    private String criteriaAddrLine1;
    @JsonProperty("criteria.deliveryPoint")
    private String criteriaDeliveryPoint;
    @JsonProperty("criteria.addrLine2")
    private String criteriaAddrLine2;
    @JsonProperty("criteria.correctionDigit")
    private String criteriaCorrectionDigit;
    @JsonProperty("criteria.addrLine3")
    private String criteriaAddrLine3;
    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVLOCN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : FTVLOCN_ACTIVITY_DATE")
    private Date activityDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("criteria.coasCode")
    public String getCriteriaCoasCode() {
        return criteriaCoasCode;
    }

    @JsonProperty("criteria.coasCode")
    public void setCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
    }

    public LocationCodeMaintenance100QapiPost withCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
        return this;
    }

    @JsonProperty("criteria.addrLine4")
    public String getCriteriaAddrLine4() {
        return criteriaAddrLine4;
    }

    @JsonProperty("criteria.addrLine4")
    public void setCriteriaAddrLine4(String criteriaAddrLine4) {
        this.criteriaAddrLine4 = criteriaAddrLine4;
    }

    public LocationCodeMaintenance100QapiPost withCriteriaAddrLine4(String criteriaAddrLine4) {
        this.criteriaAddrLine4 = criteriaAddrLine4;
        return this;
    }

    @JsonProperty("criteria.statusInd")
    public String getCriteriaStatusInd() {
        return criteriaStatusInd;
    }

    @JsonProperty("criteria.statusInd")
    public void setCriteriaStatusInd(String criteriaStatusInd) {
        this.criteriaStatusInd = criteriaStatusInd;
    }

    public LocationCodeMaintenance100QapiPost withCriteriaStatusInd(String criteriaStatusInd) {
        this.criteriaStatusInd = criteriaStatusInd;
        return this;
    }

    @JsonProperty("criteria.city")
    public String getCriteriaCity() {
        return criteriaCity;
    }

    @JsonProperty("criteria.city")
    public void setCriteriaCity(String criteriaCity) {
        this.criteriaCity = criteriaCity;
    }

    public LocationCodeMaintenance100QapiPost withCriteriaCity(String criteriaCity) {
        this.criteriaCity = criteriaCity;
        return this;
    }

    @JsonProperty("criteria.locnCode")
    public String getCriteriaLocnCode() {
        return criteriaLocnCode;
    }

    @JsonProperty("criteria.locnCode")
    public void setCriteriaLocnCode(String criteriaLocnCode) {
        this.criteriaLocnCode = criteriaLocnCode;
    }

    public LocationCodeMaintenance100QapiPost withCriteriaLocnCode(String criteriaLocnCode) {
        this.criteriaLocnCode = criteriaLocnCode;
        return this;
    }

    @JsonProperty("criteria.state")
    public String getCriteriaState() {
        return criteriaState;
    }

    @JsonProperty("criteria.state")
    public void setCriteriaState(String criteriaState) {
        this.criteriaState = criteriaState;
    }

    public LocationCodeMaintenance100QapiPost withCriteriaState(String criteriaState) {
        this.criteriaState = criteriaState;
        return this;
    }

    @JsonProperty("criteria.title")
    public String getCriteriaTitle() {
        return criteriaTitle;
    }

    @JsonProperty("criteria.title")
    public void setCriteriaTitle(String criteriaTitle) {
        this.criteriaTitle = criteriaTitle;
    }

    public LocationCodeMaintenance100QapiPost withCriteriaTitle(String criteriaTitle) {
        this.criteriaTitle = criteriaTitle;
        return this;
    }

    @JsonProperty("criteria.zip")
    public String getCriteriaZip() {
        return criteriaZip;
    }

    @JsonProperty("criteria.zip")
    public void setCriteriaZip(String criteriaZip) {
        this.criteriaZip = criteriaZip;
    }

    public LocationCodeMaintenance100QapiPost withCriteriaZip(String criteriaZip) {
        this.criteriaZip = criteriaZip;
        return this;
    }

    @JsonProperty("criteria.effDate")
    public String getCriteriaEffDate() {
        return criteriaEffDate;
    }

    @JsonProperty("criteria.effDate")
    public void setCriteriaEffDate(String criteriaEffDate) {
        this.criteriaEffDate = criteriaEffDate;
    }

    public LocationCodeMaintenance100QapiPost withCriteriaEffDate(String criteriaEffDate) {
        this.criteriaEffDate = criteriaEffDate;
        return this;
    }

    @JsonProperty("criteria.cntyCode")
    public String getCriteriaCntyCode() {
        return criteriaCntyCode;
    }

    @JsonProperty("criteria.cntyCode")
    public void setCriteriaCntyCode(String criteriaCntyCode) {
        this.criteriaCntyCode = criteriaCntyCode;
    }

    public LocationCodeMaintenance100QapiPost withCriteriaCntyCode(String criteriaCntyCode) {
        this.criteriaCntyCode = criteriaCntyCode;
        return this;
    }

    @JsonProperty("criteria.termDate")
    public String getCriteriaTermDate() {
        return criteriaTermDate;
    }

    @JsonProperty("criteria.termDate")
    public void setCriteriaTermDate(String criteriaTermDate) {
        this.criteriaTermDate = criteriaTermDate;
    }

    public LocationCodeMaintenance100QapiPost withCriteriaTermDate(String criteriaTermDate) {
        this.criteriaTermDate = criteriaTermDate;
        return this;
    }

    @JsonProperty("criteria.natnCode")
    public String getCriteriaNatnCode() {
        return criteriaNatnCode;
    }

    @JsonProperty("criteria.natnCode")
    public void setCriteriaNatnCode(String criteriaNatnCode) {
        this.criteriaNatnCode = criteriaNatnCode;
    }

    public LocationCodeMaintenance100QapiPost withCriteriaNatnCode(String criteriaNatnCode) {
        this.criteriaNatnCode = criteriaNatnCode;
        return this;
    }

    @JsonProperty("criteria.ctryCodePhone")
    public String getCriteriaCtryCodePhone() {
        return criteriaCtryCodePhone;
    }

    @JsonProperty("criteria.ctryCodePhone")
    public void setCriteriaCtryCodePhone(String criteriaCtryCodePhone) {
        this.criteriaCtryCodePhone = criteriaCtryCodePhone;
    }

    public LocationCodeMaintenance100QapiPost withCriteriaCtryCodePhone(String criteriaCtryCodePhone) {
        this.criteriaCtryCodePhone = criteriaCtryCodePhone;
        return this;
    }

    @JsonProperty("criteria.locnCodePred")
    public String getCriteriaLocnCodePred() {
        return criteriaLocnCodePred;
    }

    @JsonProperty("criteria.locnCodePred")
    public void setCriteriaLocnCodePred(String criteriaLocnCodePred) {
        this.criteriaLocnCodePred = criteriaLocnCodePred;
    }

    public LocationCodeMaintenance100QapiPost withCriteriaLocnCodePred(String criteriaLocnCodePred) {
        this.criteriaLocnCodePred = criteriaLocnCodePred;
        return this;
    }

    @JsonProperty("criteria.phoneArea")
    public String getCriteriaPhoneArea() {
        return criteriaPhoneArea;
    }

    @JsonProperty("criteria.phoneArea")
    public void setCriteriaPhoneArea(String criteriaPhoneArea) {
        this.criteriaPhoneArea = criteriaPhoneArea;
    }

    public LocationCodeMaintenance100QapiPost withCriteriaPhoneArea(String criteriaPhoneArea) {
        this.criteriaPhoneArea = criteriaPhoneArea;
        return this;
    }

    @JsonProperty("criteria.squareFootage")
    public String getCriteriaSquareFootage() {
        return criteriaSquareFootage;
    }

    @JsonProperty("criteria.squareFootage")
    public void setCriteriaSquareFootage(String criteriaSquareFootage) {
        this.criteriaSquareFootage = criteriaSquareFootage;
    }

    public LocationCodeMaintenance100QapiPost withCriteriaSquareFootage(String criteriaSquareFootage) {
        this.criteriaSquareFootage = criteriaSquareFootage;
        return this;
    }

    @JsonProperty("criteria.squareFootageRate")
    public String getCriteriaSquareFootageRate() {
        return criteriaSquareFootageRate;
    }

    @JsonProperty("criteria.squareFootageRate")
    public void setCriteriaSquareFootageRate(String criteriaSquareFootageRate) {
        this.criteriaSquareFootageRate = criteriaSquareFootageRate;
    }

    public LocationCodeMaintenance100QapiPost withCriteriaSquareFootageRate(String criteriaSquareFootageRate) {
        this.criteriaSquareFootageRate = criteriaSquareFootageRate;
        return this;
    }

    @JsonProperty("criteria.phoneExt")
    public String getCriteriaPhoneExt() {
        return criteriaPhoneExt;
    }

    @JsonProperty("criteria.phoneExt")
    public void setCriteriaPhoneExt(String criteriaPhoneExt) {
        this.criteriaPhoneExt = criteriaPhoneExt;
    }

    public LocationCodeMaintenance100QapiPost withCriteriaPhoneExt(String criteriaPhoneExt) {
        this.criteriaPhoneExt = criteriaPhoneExt;
        return this;
    }

    @JsonProperty("criteria.houseNumber")
    public String getCriteriaHouseNumber() {
        return criteriaHouseNumber;
    }

    @JsonProperty("criteria.houseNumber")
    public void setCriteriaHouseNumber(String criteriaHouseNumber) {
        this.criteriaHouseNumber = criteriaHouseNumber;
    }

    public LocationCodeMaintenance100QapiPost withCriteriaHouseNumber(String criteriaHouseNumber) {
        this.criteriaHouseNumber = criteriaHouseNumber;
        return this;
    }

    @JsonProperty("criteria.carrierRoute")
    public String getCriteriaCarrierRoute() {
        return criteriaCarrierRoute;
    }

    @JsonProperty("criteria.carrierRoute")
    public void setCriteriaCarrierRoute(String criteriaCarrierRoute) {
        this.criteriaCarrierRoute = criteriaCarrierRoute;
    }

    public LocationCodeMaintenance100QapiPost withCriteriaCarrierRoute(String criteriaCarrierRoute) {
        this.criteriaCarrierRoute = criteriaCarrierRoute;
        return this;
    }

    @JsonProperty("criteria.addrLine1")
    public String getCriteriaAddrLine1() {
        return criteriaAddrLine1;
    }

    @JsonProperty("criteria.addrLine1")
    public void setCriteriaAddrLine1(String criteriaAddrLine1) {
        this.criteriaAddrLine1 = criteriaAddrLine1;
    }

    public LocationCodeMaintenance100QapiPost withCriteriaAddrLine1(String criteriaAddrLine1) {
        this.criteriaAddrLine1 = criteriaAddrLine1;
        return this;
    }

    @JsonProperty("criteria.deliveryPoint")
    public String getCriteriaDeliveryPoint() {
        return criteriaDeliveryPoint;
    }

    @JsonProperty("criteria.deliveryPoint")
    public void setCriteriaDeliveryPoint(String criteriaDeliveryPoint) {
        this.criteriaDeliveryPoint = criteriaDeliveryPoint;
    }

    public LocationCodeMaintenance100QapiPost withCriteriaDeliveryPoint(String criteriaDeliveryPoint) {
        this.criteriaDeliveryPoint = criteriaDeliveryPoint;
        return this;
    }

    @JsonProperty("criteria.addrLine2")
    public String getCriteriaAddrLine2() {
        return criteriaAddrLine2;
    }

    @JsonProperty("criteria.addrLine2")
    public void setCriteriaAddrLine2(String criteriaAddrLine2) {
        this.criteriaAddrLine2 = criteriaAddrLine2;
    }

    public LocationCodeMaintenance100QapiPost withCriteriaAddrLine2(String criteriaAddrLine2) {
        this.criteriaAddrLine2 = criteriaAddrLine2;
        return this;
    }

    @JsonProperty("criteria.correctionDigit")
    public String getCriteriaCorrectionDigit() {
        return criteriaCorrectionDigit;
    }

    @JsonProperty("criteria.correctionDigit")
    public void setCriteriaCorrectionDigit(String criteriaCorrectionDigit) {
        this.criteriaCorrectionDigit = criteriaCorrectionDigit;
    }

    public LocationCodeMaintenance100QapiPost withCriteriaCorrectionDigit(String criteriaCorrectionDigit) {
        this.criteriaCorrectionDigit = criteriaCorrectionDigit;
        return this;
    }

    @JsonProperty("criteria.addrLine3")
    public String getCriteriaAddrLine3() {
        return criteriaAddrLine3;
    }

    @JsonProperty("criteria.addrLine3")
    public void setCriteriaAddrLine3(String criteriaAddrLine3) {
        this.criteriaAddrLine3 = criteriaAddrLine3;
    }

    public LocationCodeMaintenance100QapiPost withCriteriaAddrLine3(String criteriaAddrLine3) {
        this.criteriaAddrLine3 = criteriaAddrLine3;
        return this;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVLOCN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVLOCN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public LocationCodeMaintenance100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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

    public LocationCodeMaintenance100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LocationCodeMaintenance100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaCoasCode");
        sb.append('=');
        sb.append(((this.criteriaCoasCode == null)?"<null>":this.criteriaCoasCode));
        sb.append(',');
        sb.append("criteriaAddrLine4");
        sb.append('=');
        sb.append(((this.criteriaAddrLine4 == null)?"<null>":this.criteriaAddrLine4));
        sb.append(',');
        sb.append("criteriaStatusInd");
        sb.append('=');
        sb.append(((this.criteriaStatusInd == null)?"<null>":this.criteriaStatusInd));
        sb.append(',');
        sb.append("criteriaCity");
        sb.append('=');
        sb.append(((this.criteriaCity == null)?"<null>":this.criteriaCity));
        sb.append(',');
        sb.append("criteriaLocnCode");
        sb.append('=');
        sb.append(((this.criteriaLocnCode == null)?"<null>":this.criteriaLocnCode));
        sb.append(',');
        sb.append("criteriaState");
        sb.append('=');
        sb.append(((this.criteriaState == null)?"<null>":this.criteriaState));
        sb.append(',');
        sb.append("criteriaTitle");
        sb.append('=');
        sb.append(((this.criteriaTitle == null)?"<null>":this.criteriaTitle));
        sb.append(',');
        sb.append("criteriaZip");
        sb.append('=');
        sb.append(((this.criteriaZip == null)?"<null>":this.criteriaZip));
        sb.append(',');
        sb.append("criteriaEffDate");
        sb.append('=');
        sb.append(((this.criteriaEffDate == null)?"<null>":this.criteriaEffDate));
        sb.append(',');
        sb.append("criteriaCntyCode");
        sb.append('=');
        sb.append(((this.criteriaCntyCode == null)?"<null>":this.criteriaCntyCode));
        sb.append(',');
        sb.append("criteriaTermDate");
        sb.append('=');
        sb.append(((this.criteriaTermDate == null)?"<null>":this.criteriaTermDate));
        sb.append(',');
        sb.append("criteriaNatnCode");
        sb.append('=');
        sb.append(((this.criteriaNatnCode == null)?"<null>":this.criteriaNatnCode));
        sb.append(',');
        sb.append("criteriaCtryCodePhone");
        sb.append('=');
        sb.append(((this.criteriaCtryCodePhone == null)?"<null>":this.criteriaCtryCodePhone));
        sb.append(',');
        sb.append("criteriaLocnCodePred");
        sb.append('=');
        sb.append(((this.criteriaLocnCodePred == null)?"<null>":this.criteriaLocnCodePred));
        sb.append(',');
        sb.append("criteriaPhoneArea");
        sb.append('=');
        sb.append(((this.criteriaPhoneArea == null)?"<null>":this.criteriaPhoneArea));
        sb.append(',');
        sb.append("criteriaSquareFootage");
        sb.append('=');
        sb.append(((this.criteriaSquareFootage == null)?"<null>":this.criteriaSquareFootage));
        sb.append(',');
        sb.append("criteriaSquareFootageRate");
        sb.append('=');
        sb.append(((this.criteriaSquareFootageRate == null)?"<null>":this.criteriaSquareFootageRate));
        sb.append(',');
        sb.append("criteriaPhoneExt");
        sb.append('=');
        sb.append(((this.criteriaPhoneExt == null)?"<null>":this.criteriaPhoneExt));
        sb.append(',');
        sb.append("criteriaHouseNumber");
        sb.append('=');
        sb.append(((this.criteriaHouseNumber == null)?"<null>":this.criteriaHouseNumber));
        sb.append(',');
        sb.append("criteriaCarrierRoute");
        sb.append('=');
        sb.append(((this.criteriaCarrierRoute == null)?"<null>":this.criteriaCarrierRoute));
        sb.append(',');
        sb.append("criteriaAddrLine1");
        sb.append('=');
        sb.append(((this.criteriaAddrLine1 == null)?"<null>":this.criteriaAddrLine1));
        sb.append(',');
        sb.append("criteriaDeliveryPoint");
        sb.append('=');
        sb.append(((this.criteriaDeliveryPoint == null)?"<null>":this.criteriaDeliveryPoint));
        sb.append(',');
        sb.append("criteriaAddrLine2");
        sb.append('=');
        sb.append(((this.criteriaAddrLine2 == null)?"<null>":this.criteriaAddrLine2));
        sb.append(',');
        sb.append("criteriaCorrectionDigit");
        sb.append('=');
        sb.append(((this.criteriaCorrectionDigit == null)?"<null>":this.criteriaCorrectionDigit));
        sb.append(',');
        sb.append("criteriaAddrLine3");
        sb.append('=');
        sb.append(((this.criteriaAddrLine3 == null)?"<null>":this.criteriaAddrLine3));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
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
        result = ((result* 31)+((this.criteriaLocnCode == null)? 0 :this.criteriaLocnCode.hashCode()));
        result = ((result* 31)+((this.criteriaHouseNumber == null)? 0 :this.criteriaHouseNumber.hashCode()));
        result = ((result* 31)+((this.criteriaCoasCode == null)? 0 :this.criteriaCoasCode.hashCode()));
        result = ((result* 31)+((this.criteriaCity == null)? 0 :this.criteriaCity.hashCode()));
        result = ((result* 31)+((this.criteriaAddrLine4 == null)? 0 :this.criteriaAddrLine4 .hashCode()));
        result = ((result* 31)+((this.criteriaLocnCodePred == null)? 0 :this.criteriaLocnCodePred.hashCode()));
        result = ((result* 31)+((this.criteriaZip == null)? 0 :this.criteriaZip.hashCode()));
        result = ((result* 31)+((this.criteriaAddrLine3 == null)? 0 :this.criteriaAddrLine3 .hashCode()));
        result = ((result* 31)+((this.criteriaNatnCode == null)? 0 :this.criteriaNatnCode.hashCode()));
        result = ((result* 31)+((this.criteriaAddrLine2 == null)? 0 :this.criteriaAddrLine2 .hashCode()));
        result = ((result* 31)+((this.criteriaEffDate == null)? 0 :this.criteriaEffDate.hashCode()));
        result = ((result* 31)+((this.criteriaAddrLine1 == null)? 0 :this.criteriaAddrLine1 .hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.criteriaCarrierRoute == null)? 0 :this.criteriaCarrierRoute.hashCode()));
        result = ((result* 31)+((this.criteriaPhoneArea == null)? 0 :this.criteriaPhoneArea.hashCode()));
        result = ((result* 31)+((this.criteriaTitle == null)? 0 :this.criteriaTitle.hashCode()));
        result = ((result* 31)+((this.criteriaSquareFootage == null)? 0 :this.criteriaSquareFootage.hashCode()));
        result = ((result* 31)+((this.criteriaCorrectionDigit == null)? 0 :this.criteriaCorrectionDigit.hashCode()));
        result = ((result* 31)+((this.criteriaTermDate == null)? 0 :this.criteriaTermDate.hashCode()));
        result = ((result* 31)+((this.criteriaDeliveryPoint == null)? 0 :this.criteriaDeliveryPoint.hashCode()));
        result = ((result* 31)+((this.criteriaState == null)? 0 :this.criteriaState.hashCode()));
        result = ((result* 31)+((this.criteriaPhoneExt == null)? 0 :this.criteriaPhoneExt.hashCode()));
        result = ((result* 31)+((this.criteriaCtryCodePhone == null)? 0 :this.criteriaCtryCodePhone.hashCode()));
        result = ((result* 31)+((this.criteriaStatusInd == null)? 0 :this.criteriaStatusInd.hashCode()));
        result = ((result* 31)+((this.criteriaSquareFootageRate == null)? 0 :this.criteriaSquareFootageRate.hashCode()));
        result = ((result* 31)+((this.criteriaCntyCode == null)? 0 :this.criteriaCntyCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LocationCodeMaintenance100QapiPost) == false) {
            return false;
        }
        LocationCodeMaintenance100QapiPost rhs = ((LocationCodeMaintenance100QapiPost) other);
        return ((((((((((((((((((((((((((((this.criteriaLocnCode == rhs.criteriaLocnCode)||((this.criteriaLocnCode!= null)&&this.criteriaLocnCode.equals(rhs.criteriaLocnCode)))&&((this.criteriaHouseNumber == rhs.criteriaHouseNumber)||((this.criteriaHouseNumber!= null)&&this.criteriaHouseNumber.equals(rhs.criteriaHouseNumber))))&&((this.criteriaCoasCode == rhs.criteriaCoasCode)||((this.criteriaCoasCode!= null)&&this.criteriaCoasCode.equals(rhs.criteriaCoasCode))))&&((this.criteriaCity == rhs.criteriaCity)||((this.criteriaCity!= null)&&this.criteriaCity.equals(rhs.criteriaCity))))&&((this.criteriaAddrLine4 == rhs.criteriaAddrLine4)||((this.criteriaAddrLine4 != null)&&this.criteriaAddrLine4 .equals(rhs.criteriaAddrLine4))))&&((this.criteriaLocnCodePred == rhs.criteriaLocnCodePred)||((this.criteriaLocnCodePred!= null)&&this.criteriaLocnCodePred.equals(rhs.criteriaLocnCodePred))))&&((this.criteriaZip == rhs.criteriaZip)||((this.criteriaZip!= null)&&this.criteriaZip.equals(rhs.criteriaZip))))&&((this.criteriaAddrLine3 == rhs.criteriaAddrLine3)||((this.criteriaAddrLine3 != null)&&this.criteriaAddrLine3 .equals(rhs.criteriaAddrLine3))))&&((this.criteriaNatnCode == rhs.criteriaNatnCode)||((this.criteriaNatnCode!= null)&&this.criteriaNatnCode.equals(rhs.criteriaNatnCode))))&&((this.criteriaAddrLine2 == rhs.criteriaAddrLine2)||((this.criteriaAddrLine2 != null)&&this.criteriaAddrLine2 .equals(rhs.criteriaAddrLine2))))&&((this.criteriaEffDate == rhs.criteriaEffDate)||((this.criteriaEffDate!= null)&&this.criteriaEffDate.equals(rhs.criteriaEffDate))))&&((this.criteriaAddrLine1 == rhs.criteriaAddrLine1)||((this.criteriaAddrLine1 != null)&&this.criteriaAddrLine1 .equals(rhs.criteriaAddrLine1))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.criteriaCarrierRoute == rhs.criteriaCarrierRoute)||((this.criteriaCarrierRoute!= null)&&this.criteriaCarrierRoute.equals(rhs.criteriaCarrierRoute))))&&((this.criteriaPhoneArea == rhs.criteriaPhoneArea)||((this.criteriaPhoneArea!= null)&&this.criteriaPhoneArea.equals(rhs.criteriaPhoneArea))))&&((this.criteriaTitle == rhs.criteriaTitle)||((this.criteriaTitle!= null)&&this.criteriaTitle.equals(rhs.criteriaTitle))))&&((this.criteriaSquareFootage == rhs.criteriaSquareFootage)||((this.criteriaSquareFootage!= null)&&this.criteriaSquareFootage.equals(rhs.criteriaSquareFootage))))&&((this.criteriaCorrectionDigit == rhs.criteriaCorrectionDigit)||((this.criteriaCorrectionDigit!= null)&&this.criteriaCorrectionDigit.equals(rhs.criteriaCorrectionDigit))))&&((this.criteriaTermDate == rhs.criteriaTermDate)||((this.criteriaTermDate!= null)&&this.criteriaTermDate.equals(rhs.criteriaTermDate))))&&((this.criteriaDeliveryPoint == rhs.criteriaDeliveryPoint)||((this.criteriaDeliveryPoint!= null)&&this.criteriaDeliveryPoint.equals(rhs.criteriaDeliveryPoint))))&&((this.criteriaState == rhs.criteriaState)||((this.criteriaState!= null)&&this.criteriaState.equals(rhs.criteriaState))))&&((this.criteriaPhoneExt == rhs.criteriaPhoneExt)||((this.criteriaPhoneExt!= null)&&this.criteriaPhoneExt.equals(rhs.criteriaPhoneExt))))&&((this.criteriaCtryCodePhone == rhs.criteriaCtryCodePhone)||((this.criteriaCtryCodePhone!= null)&&this.criteriaCtryCodePhone.equals(rhs.criteriaCtryCodePhone))))&&((this.criteriaStatusInd == rhs.criteriaStatusInd)||((this.criteriaStatusInd!= null)&&this.criteriaStatusInd.equals(rhs.criteriaStatusInd))))&&((this.criteriaSquareFootageRate == rhs.criteriaSquareFootageRate)||((this.criteriaSquareFootageRate!= null)&&this.criteriaSquareFootageRate.equals(rhs.criteriaSquareFootageRate))))&&((this.criteriaCntyCode == rhs.criteriaCntyCode)||((this.criteriaCntyCode!= null)&&this.criteriaCntyCode.equals(rhs.criteriaCntyCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
