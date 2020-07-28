package com.test.test.common.selector;

import com.test.test.common.configure.IntegralAuthExceptionConfigure;
import com.test.test.common.configure.IntegralOauth2FeignConfigure;
import com.test.test.common.configure.IntegralServerProtectConfigure;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import javax.annotation.Nonnull;

/**
 * @author wangjiahao
 */
public class IntegralCloudApplicationSelector implements ImportSelector {

    @Override
    @SuppressWarnings("all")
    public String[] selectImports(@Nonnull AnnotationMetadata annotationMetadata) {
        return new String[]{
                IntegralAuthExceptionConfigure.class.getName(),
                IntegralOauth2FeignConfigure.class.getName(),
                IntegralServerProtectConfigure.class.getName()
        };
    }
}
