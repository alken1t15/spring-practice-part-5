package kz.alken1t.alex;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("kz.alken1t.alex")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}