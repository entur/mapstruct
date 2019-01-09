/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.targetthis;

import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED
)
public interface CustomerEntityMapper1 {
    CustomerEntityMapper1 INSTANCE = Mappers.getMapper( CustomerEntityMapper1.class );

    @Mapping(target = ".", source = "entity.*")
    CustomerEntity map(CustomerDTO customer);

    @Mapping(target = ".", source = "customer.entity.*")
    @Mapping(target = "name", source = "customer.name")
    CustomerEntity map(OrderDTO order);

    @Mapping(target = "entity", source = ".")
    CustomerDTO map(CustomerEntity customer);

    @Mapping(target = "entity", source = ".")
    OrderDTO map( OrderEntity order );

    OrderLineDTO map( OrderLine line);
}