// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for WorkerSelectorState. */
public enum WorkerSelectorState {
    /** Enum value active. */
    ACTIVE("active"),

    /** Enum value expired. */
    EXPIRED("expired");

    /** The actual serialized value for a WorkerSelectorState instance. */
    private final String value;

    WorkerSelectorState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a WorkerSelectorState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed WorkerSelectorState object, or null if unable to parse.
     */
    @JsonCreator
    public static WorkerSelectorState fromString(String value) {
        WorkerSelectorState[] items = WorkerSelectorState.values();
        for (WorkerSelectorState item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
