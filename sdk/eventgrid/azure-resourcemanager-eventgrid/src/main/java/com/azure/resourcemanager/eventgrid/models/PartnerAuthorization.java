// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The partner authorization details. */
@Fluent
public final class PartnerAuthorization {
    /*
     * Time used to validate the authorization expiration time for each
     * authorized partner. If DefaultMaximumExpirationTimeInDays is
     * not specified, the default is 7 days. Otherwise, allowed values are
     * between 1 and 365 days.
     */
    @JsonProperty(value = "defaultMaximumExpirationTimeInDays")
    private Integer defaultMaximumExpirationTimeInDays;

    /*
     * The list of authorized partners.
     */
    @JsonProperty(value = "authorizedPartnersList")
    private List<Partner> authorizedPartnersList;

    /**
     * Get the defaultMaximumExpirationTimeInDays property: Time used to validate the authorization expiration time for
     * each authorized partner. If DefaultMaximumExpirationTimeInDays is not specified, the default is 7 days.
     * Otherwise, allowed values are between 1 and 365 days.
     *
     * @return the defaultMaximumExpirationTimeInDays value.
     */
    public Integer defaultMaximumExpirationTimeInDays() {
        return this.defaultMaximumExpirationTimeInDays;
    }

    /**
     * Set the defaultMaximumExpirationTimeInDays property: Time used to validate the authorization expiration time for
     * each authorized partner. If DefaultMaximumExpirationTimeInDays is not specified, the default is 7 days.
     * Otherwise, allowed values are between 1 and 365 days.
     *
     * @param defaultMaximumExpirationTimeInDays the defaultMaximumExpirationTimeInDays value to set.
     * @return the PartnerAuthorization object itself.
     */
    public PartnerAuthorization withDefaultMaximumExpirationTimeInDays(Integer defaultMaximumExpirationTimeInDays) {
        this.defaultMaximumExpirationTimeInDays = defaultMaximumExpirationTimeInDays;
        return this;
    }

    /**
     * Get the authorizedPartnersList property: The list of authorized partners.
     *
     * @return the authorizedPartnersList value.
     */
    public List<Partner> authorizedPartnersList() {
        return this.authorizedPartnersList;
    }

    /**
     * Set the authorizedPartnersList property: The list of authorized partners.
     *
     * @param authorizedPartnersList the authorizedPartnersList value to set.
     * @return the PartnerAuthorization object itself.
     */
    public PartnerAuthorization withAuthorizedPartnersList(List<Partner> authorizedPartnersList) {
        this.authorizedPartnersList = authorizedPartnersList;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (authorizedPartnersList() != null) {
            authorizedPartnersList().forEach(e -> e.validate());
        }
    }
}
