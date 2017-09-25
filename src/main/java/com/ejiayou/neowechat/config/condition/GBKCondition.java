package com.ejiayou.neowechat.config.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author huangzhe
 * @datetime 2017/9/25.
 * @describe
 */
public class GBKCondition implements Condition{
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        String endcoding = System.getProperty("file.encoding");
        if (endcoding != null){
            return "gbk".equals(endcoding.toLowerCase());
        }
        return false;
    }
}
