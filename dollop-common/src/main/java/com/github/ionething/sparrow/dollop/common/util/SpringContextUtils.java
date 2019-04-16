package com.github.ionething.sparrow.dollop.common.util;

import lombok.Getter;
import org.springframework.beans.BeansException;
import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @author Vincent
 */
@Component
public class SpringContextUtils implements ApplicationContextAware {

    @Getter
    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        applicationContext = context;
    }

    /**
     * 获取Spring boot配置
     * @param name
     * @param target
     * @param <T>
     * @return
     */
    public static <T> T getProperty(String name, Class<T> target) {
        Environment environment = applicationContext.getEnvironment();
        Binder binder = Binder.get(environment);
        return binder.bind(name, Bindable.of(target)).get();
    }

    /**
     * 获取bean
     * @param requireType
     * @param <T>
     * @return
     */
    public static <T> T getBean(Class<T> requireType) {
        return applicationContext.getBean(requireType);
    }
}
