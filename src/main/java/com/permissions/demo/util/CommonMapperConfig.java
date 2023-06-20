/*
 * Canadian Tire Corporation, Ltd. Do not reproduce without permission in writing.
 * Copyright (c) 2022. Canadian Tire Corporation, Ltd. All rights reserved.
 */

package com.permissions.demo.util;

import org.mapstruct.MapperConfig;
import org.mapstruct.ReportingPolicy;

@MapperConfig(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CommonMapperConfig {
}
