package com.test.test.common.factory;

import com.test.test.common.entity.constant.ConfigTypeConstant;
import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.support.DefaultPropertySourceFactory;
import org.springframework.core.io.support.EncodedResource;

import java.io.IOException;
import java.util.Properties;

/**
 * 解决@PropertySource注解对于yml的支持
 *
 * @author wangjiahao
 * @date 2019/10/30
 */
public class YamlConfigFactory extends DefaultPropertySourceFactory {

    /**
     * 创建配置路径
     *
     * @param name     配置名称
     * @param resource 配置路径
     * @return yml配置
     * @throws IOException
     */
    @Override
    public PropertySource<?> createPropertySource(String name, EncodedResource resource) throws IOException {
        String sourceName = name != null ? name : resource.getResource().getFilename();
        if (!resource.getResource().exists()) {
            return new PropertiesPropertySource(sourceName, new Properties());
        } else if (sourceName.endsWith(ConfigTypeConstant.CONFIG_TYPE_YML)
                || sourceName.endsWith(ConfigTypeConstant.CONFIG_TYPE_YAML)) {
            Properties propertiesFromYaml = loadYml(resource);
            return new PropertiesPropertySource(sourceName, propertiesFromYaml);
        } else {
            return super.createPropertySource(name, resource);
        }
    }

    private Properties loadYml(EncodedResource resource) {
        YamlPropertiesFactoryBean factory = new YamlPropertiesFactoryBean();
        factory.setResources(resource.getResource());
        factory.afterPropertiesSet();
        return factory.getObject();
    }


}
