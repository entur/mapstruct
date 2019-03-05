/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.enumtemplatemapping;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ValueMapping;
import org.mapstruct.ValueMappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EnumMapper1 {
    EnumMapper1 INSTANCE = Mappers.getMapper( EnumMapper1.class );

    @ValueMappings( targetPrefix = "DOMAIN_", value = {} )
    Enum1Domain map( Enum1DTO in );

    @ValueMappings( targetPrefix = "DOMAIN_", value = {
        @ValueMapping( target = "CUSTOM_VALUE3", source = "EXTRA_VALUE3" )
    } )
    Enum1ExtraValueDomain map( Enum1ExtraValueDTO in );

    @ValueMappings( targetPrefix = "DOMAIN_", value = {
        @ValueMapping( target = MappingConstants.NULL, source = MappingConstants.ANY_REMAINING )
    } )
    Enum1Domain mapSourceExtraValue( Enum1ExtraValueDTO in );

    @ValueMappings( targetPrefix = "DOMAIN_", value = {
        @ValueMapping( target = MappingConstants.NULL, source = MappingConstants.ANY_REMAINING )
    } )
    Enum1ExtraValueDomain mapTargetExtraValue( Enum1DTO in );

    @ValueMappings( sourcePrefix = "DTO_", value = {} )
    Enum2Domain map( Enum2DTO in );

    @ValueMappings( sourcePrefix = "DTO_", value = {
        @ValueMapping( target = "CUSTOM_VALUE3", source = "EXTRA_VALUE3" )
    } )
    Enum2ExtraValueDomain map( Enum2ExtraValueDTO in );

    @ValueMappings( sourcePrefix = "DTO_", value = {
        @ValueMapping( target = MappingConstants.NULL, source = MappingConstants.ANY_REMAINING )
    } )
    Enum2Domain mapSourceExtraValue( Enum2ExtraValueDTO in );

    @ValueMappings( sourcePrefix = "DTO_", value = {
        @ValueMapping( target = MappingConstants.NULL, source = MappingConstants.ANY_REMAINING )
    } )
    Enum2ExtraValueDomain mapTargetExtraValue( Enum2DTO in );

    @ValueMappings( targetPrefix = "DOMAIN_", sourcePrefix = "DTO_", value = {} )
    Enum3Domain map( Enum3DTO in );

    @ValueMappings( targetPrefix = "DOMAIN_", sourcePrefix = "DTO_", value = {
        @ValueMapping( target = "CUSTOM_VALUE3", source = "EXTRA_VALUE3" )
    } )
    Enum3ExtraValueDomain map( Enum3ExtraValueDTO in );

    @ValueMappings( targetPrefix = "DOMAIN_", sourcePrefix = "DTO_", value = {
        @ValueMapping( target = MappingConstants.NULL, source = MappingConstants.ANY_REMAINING )
    } )
    Enum3Domain mapSourceExtraValue( Enum3ExtraValueDTO in );

    @ValueMappings( targetPrefix = "DOMAIN_", sourcePrefix = "DTO_", value = {
        @ValueMapping( target = MappingConstants.NULL, source = MappingConstants.ANY_REMAINING )
    } )
    Enum3ExtraValueDomain mapTargetExtraValue( Enum3DTO in );

}
