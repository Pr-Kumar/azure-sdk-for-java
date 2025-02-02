// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Response containing the primary and secondary admin API keys for a given Azure Cognitive Search service. */
@Immutable
public final class AdminKeyResultInner {
    /*
     * The primary admin API key of the search service.
     */
    @JsonProperty(value = "primaryKey", access = JsonProperty.Access.WRITE_ONLY)
    private String primaryKey;

    /*
     * The secondary admin API key of the search service.
     */
    @JsonProperty(value = "secondaryKey", access = JsonProperty.Access.WRITE_ONLY)
    private String secondaryKey;

    /**
     * Get the primaryKey property: The primary admin API key of the search service.
     *
     * @return the primaryKey value.
     */
    public String primaryKey() {
        return this.primaryKey;
    }

    /**
     * Get the secondaryKey property: The secondary admin API key of the search service.
     *
     * @return the secondaryKey value.
     */
    public String secondaryKey() {
        return this.secondaryKey;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
