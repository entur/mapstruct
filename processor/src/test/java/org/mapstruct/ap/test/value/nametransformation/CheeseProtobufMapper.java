/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.value.nametransformation;

import org.mapstruct.EnumMapping;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ValueMapping;
import org.mapstruct.factory.Mappers;

/**
 * @author Arne Seime
 */
@Mapper
public interface CheeseProtobufMapper {

    CheeseProtobufMapper INSTANCE = Mappers.getMapper( CheeseProtobufMapper.class );

    @EnumMapping(nameTransformationStrategy = MappingConstants.PREFIX_TRANSFORMATION,
        configuration = "CHEESE_TYPE_PROTOBUF_")
    @ValueMapping(source =  MappingConstants.NULL, target = "CHEESE_TYPE_PROTOBUF_UNSPECIFIED")
    CheeseTypeProtobuf map(CheeseType cheese);

    @InheritInverseConfiguration
    @ValueMapping(source = "UNRECOGNIZED", target = MappingConstants.NULL)
    CheeseType mapInheritInverse(CheeseTypeProtobuf cheese);
}
