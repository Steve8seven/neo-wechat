package com.ejiayou.neowechat.config.condition;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

/**
 * @author huangzhe
 * @datetime 2017/9/25.
 * @describe
 */

@SpringBootConfiguration
public class EncodeingConvertConfiguration {

    @Bean
    @Conditional(UTF8Condition.class)
    public EncodeConvert createUTF8EncodeingConvert(){
        return new UTF8EncodeingConvert();
    }

    @Bean
    @Conditional(GBKCondition.class)
    public EncodeConvert createGBKEncodeingConvert(){
        return new GBKEncodeingConvert();
    }
}
