package org.mapstruct.ap.test.enumtemplatemapping;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mapstruct.ap.testutil.WithClasses;
import org.mapstruct.ap.testutil.runner.AnnotationProcessorTestRunner;

@RunWith(AnnotationProcessorTestRunner.class)
@WithClasses( {
    Enum1Domain.class,
    Enum1DTO.class,
    Enum1ExtraValueDomain.class,
    Enum1ExtraValueDTO.class,
    Enum2Domain.class,
    Enum2DTO.class,
    Enum2ExtraValueDomain.class,
    Enum2ExtraValueDTO.class,
    Enum3Domain.class,
    Enum3DTO.class,
    Enum3ExtraValueDomain.class,
    Enum3ExtraValueDTO.class,
    EnumMapper1.class
})
public class EnumTemplateMappingTest {
    @Test
    @WithClasses( {
    } )
    public void testTargetPrefixEnums() {
        Enum1DTO t1 = Enum1DTO.VALUE1;
        Enum1Domain d1 = EnumMapper1.INSTANCE.map( t1 );

        System.out.println(t1);
        System.out.println(d1);

        Assert.assertEquals( Enum1Domain.DOMAIN_VALUE1, d1 );
    }

    @Test
    @WithClasses( {
    } )
    public void testTargetPrefixEnumsWithExplicitValueMapping() {
        Enum1ExtraValueDTO t1 = Enum1ExtraValueDTO.VALUE1;
        Enum1ExtraValueDomain d1 = EnumMapper1.INSTANCE.map( t1 );

        System.out.println(t1);
        System.out.println(d1);

        Assert.assertEquals( Enum1ExtraValueDomain.DOMAIN_VALUE1, d1 );

        Enum1ExtraValueDTO t2 = Enum1ExtraValueDTO.EXTRA_VALUE3;
        Enum1ExtraValueDomain d2 = EnumMapper1.INSTANCE.map( t2 );

        System.out.println(t2);
        System.out.println(d2);

        Assert.assertEquals( Enum1ExtraValueDomain.CUSTOM_VALUE3, d2 );
    }

    @Test
    @WithClasses( {
    } )
    public void testTargetPrefixExtraValueInSource() {
        Enum1ExtraValueDTO t1 = Enum1ExtraValueDTO.VALUE1;
        Enum1Domain d1 = EnumMapper1.INSTANCE.mapSourceExtraValue( t1 );

        System.out.println(t1);
        System.out.println(d1);

        Assert.assertEquals( Enum1Domain.DOMAIN_VALUE1, d1 );

        Enum1ExtraValueDTO t2 = Enum1ExtraValueDTO.EXTRA_VALUE3;
        Enum1Domain d2 = EnumMapper1.INSTANCE.mapSourceExtraValue( t2 );

        System.out.println(t2);
        System.out.println(d2);

        Assert.assertNull( d2 );
    }

    @Test
    @WithClasses( {
    } )
    public void testSourcePrefixEnums() {
        Enum2DTO t2 = Enum2DTO.DTO_VALUE1;
        Enum2Domain d2 = EnumMapper1.INSTANCE.map( t2 );

        System.out.println(t2);
        System.out.println(d2);

        Assert.assertEquals( Enum2Domain.VALUE1, d2 );
    }

    @Test
    @WithClasses( {
    } )
    public void testSourcePrefixEnumsWithExplicitValueMapping() {
        Enum2ExtraValueDTO t1 = Enum2ExtraValueDTO.DTO_VALUE1;
        Enum2ExtraValueDomain d1 = EnumMapper1.INSTANCE.map( t1 );

        System.out.println(t1);
        System.out.println(d1);

        Assert.assertEquals( Enum2ExtraValueDomain.VALUE1, d1 );

        Enum2ExtraValueDTO t2 = Enum2ExtraValueDTO.EXTRA_VALUE3;
        Enum2ExtraValueDomain d2 = EnumMapper1.INSTANCE.map( t2 );

        System.out.println(t2);
        System.out.println(d2);

        Assert.assertEquals( Enum2ExtraValueDomain.CUSTOM_VALUE3, d2 );
    }

    @Test
    @WithClasses( {
    } )
    public void testSourcePrefixExtraValueInSource() {
        Enum2ExtraValueDTO t1 = Enum2ExtraValueDTO.DTO_VALUE1;
        Enum2Domain d1 = EnumMapper1.INSTANCE.mapSourceExtraValue( t1 );

        System.out.println(t1);
        System.out.println(d1);

        Assert.assertEquals( Enum2Domain.VALUE1, d1 );

        Enum2ExtraValueDTO t2 = Enum2ExtraValueDTO.EXTRA_VALUE3;
        Enum2Domain d2 = EnumMapper1.INSTANCE.mapSourceExtraValue( t2 );

        System.out.println(t2);
        System.out.println(d2);

        Assert.assertNull( d2 );
    }

    @Test
    @WithClasses( {
    } )
    public void testTargetSourcePrefixEnums() {
        Enum3DTO t2 = Enum3DTO.DTO_VALUE1;
        Enum3Domain d2 = EnumMapper1.INSTANCE.map( t2 );

        System.out.println(t2);
        System.out.println(d2);

        Assert.assertEquals( Enum3Domain.DOMAIN_VALUE1, d2 );
    }

    @Test
    @WithClasses( {
    } )
    public void testTargetSourcePrefixEnumsWithExplicitValueMapping() {
        Enum3ExtraValueDTO t1 = Enum3ExtraValueDTO.DTO_VALUE1;
        Enum3ExtraValueDomain d1 = EnumMapper1.INSTANCE.map( t1 );

        System.out.println(t1);
        System.out.println(d1);

        Assert.assertEquals( Enum3ExtraValueDomain.DOMAIN_VALUE1, d1 );

        Enum3ExtraValueDTO t2 = Enum3ExtraValueDTO.EXTRA_VALUE3;
        Enum3ExtraValueDomain d2 = EnumMapper1.INSTANCE.map( t2 );

        System.out.println(t2);
        System.out.println(d2);

        Assert.assertEquals( Enum3ExtraValueDomain.CUSTOM_VALUE3, d2 );
    }

    @Test
    @WithClasses( {
    } )
    public void testTargetSourcePrefixExtraValueInSource() {
        Enum3ExtraValueDTO t1 = Enum3ExtraValueDTO.DTO_VALUE1;
        Enum3Domain d1 = EnumMapper1.INSTANCE.mapSourceExtraValue( t1 );

        System.out.println(t1);
        System.out.println(d1);

        Assert.assertEquals( Enum3Domain.DOMAIN_VALUE1, d1 );

        Enum3ExtraValueDTO t2 = Enum3ExtraValueDTO.EXTRA_VALUE3;
        Enum3Domain d2 = EnumMapper1.INSTANCE.mapSourceExtraValue( t2 );

        System.out.println(t2);
        System.out.println(d2);

        Assert.assertNull( d2 );
    }
}
