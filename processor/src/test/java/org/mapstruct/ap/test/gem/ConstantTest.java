/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.gem;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.mapstruct.MappingConstants;
import org.mapstruct.ap.internal.gem.MappingConstantsGem;

/**
 * Test constants values
 *
 * @author Sjaak Derksen
 */
public class ConstantTest {

    @Test
    public void constantsShouldBeEqual() {
        assertThat( MappingConstants.ANY_REMAINING ).isEqualTo( MappingConstantsGem.ANY_REMAINING );
        assertThat( MappingConstants.ANY_UNMAPPED ).isEqualTo( MappingConstantsGem.ANY_UNMAPPED );
        assertThat( MappingConstants.NULL ).isEqualTo( MappingConstantsGem.NULL );
        assertThat( MappingConstants.SUFFIX_TRANSFORMATION ).isEqualTo( MappingConstantsGem.SUFFIX_TRANSFORMATION );
        assertThat( MappingConstants.STRIP_SUFFIX_TRANSFORMATION )
            .isEqualTo( MappingConstantsGem.STRIP_SUFFIX_TRANSFORMATION );
        assertThat( MappingConstants.PREFIX_TRANSFORMATION ).isEqualTo( MappingConstantsGem.PREFIX_TRANSFORMATION );
        assertThat( MappingConstants.STRIP_PREFIX_TRANSFORMATION )
            .isEqualTo( MappingConstantsGem.STRIP_PREFIX_TRANSFORMATION );
    }
}
