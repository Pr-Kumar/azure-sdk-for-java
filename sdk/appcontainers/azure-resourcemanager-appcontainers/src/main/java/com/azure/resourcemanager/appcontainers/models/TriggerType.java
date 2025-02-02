// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Trigger type of the job. */
public final class TriggerType extends ExpandableStringEnum<TriggerType> {
    /** Static value Scheduled for TriggerType. */
    public static final TriggerType SCHEDULED = fromString("Scheduled");

    /** Static value Event for TriggerType. */
    public static final TriggerType EVENT = fromString("Event");

    /** Static value Manual for TriggerType. */
    public static final TriggerType MANUAL = fromString("Manual");

    /**
     * Creates a new instance of TriggerType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public TriggerType() {
    }

    /**
     * Creates or finds a TriggerType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TriggerType.
     */
    @JsonCreator
    public static TriggerType fromString(String name) {
        return fromString(name, TriggerType.class);
    }

    /**
     * Gets known TriggerType values.
     *
     * @return known TriggerType values.
     */
    public static Collection<TriggerType> values() {
        return values(TriggerType.class);
    }
}
