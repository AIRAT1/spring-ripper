package screensaver;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.core.type.classreading.MethodMetadataReadingVisitor;

import java.lang.reflect.Field;

public class BeanUtil {

    public static String resolveClassNameFromJavaConfig(BeanDefinition beanDefinition) {
        try {
            Object reader = Class.forName("org.springframework.context.annotation.ConfigurationClassBeanDefinitionReader$ConfigurationClassBeanDefinition").cast(beanDefinition);
            Field field = reader.getClass().getDeclaredField("factoryMethodMetadata");
            field.setAccessible(true);
            MethodMetadataReadingVisitor visitor = (MethodMetadataReadingVisitor)field.get(reader);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return null;
    }
}
