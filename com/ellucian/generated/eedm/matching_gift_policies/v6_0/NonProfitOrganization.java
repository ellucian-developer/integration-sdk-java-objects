
package com.ellucian.generated.eedm.matching_gift_policies.v6_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum NonProfitOrganization {

    HEALTH_CARE("healthCare"),
    MUSEUMS("museums"),
    SOCIAL_SERVICES("socialServices"),
    PERFORMING_ARTS("performingArts"),
    PUBLIC_RADIO("publicRadio"),
    RELIGIOUS("religious"),
    ENVIRONMENTAL("environmental"),
    CULTURAL("cultural"),
    CHARITIES("charities"),
    FRATERNITY("fraternity"),
    HOSPITALS("hospitals"),
    PROFESSIONAL_SOCIETIES("professionalSocieties"),
    UNITED_WAY("unitedWay"),
    RED_CROSS("redCross"),
    HOSPICES("hospices"),
    ZOOS("zoos"),
    LIBRARIES("libraries"),
    RELIEF("relief"),
    YOUTH("youth"),
    CHILD_ADVOCACY("childAdvocacy"),
    ANIMAL_WELFARE("animalWelfare"),
    RELIGIOUS_BASED_SERVICES("religiousBasedServices"),
    DISASTER_RELIEF("disasterRelief"),
    WALKS_RUNS_BIKES_NONPROFIT("walksRunsBikesNonprofit"),
    NURSING_HOME("nursingHome"),
    ELDER_CARE("elderCare"),
    COMMUNITY_DEVELOPMENT("communityDevelopment"),
    AFFORDABLE_HOUSING("affordableHousing"),
    FIRE_RESCUE("fireRescue"),
    SPORTS_DEVELOPMENT("sportsDevelopment"),
    SINGLE_DESEASE("singleDesease");
    private final String value;
    private final static Map<String, NonProfitOrganization> CONSTANTS = new HashMap<String, NonProfitOrganization>();

    static {
        for (NonProfitOrganization c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    NonProfitOrganization(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static NonProfitOrganization fromValue(String value) {
        NonProfitOrganization constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
