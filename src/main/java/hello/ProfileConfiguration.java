package hello;

import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProfileConfiguration {

    @Profile("test")
    @Bean
    public TestProfile testProfile() {
        return new TestProfile();
    }

    @Profile("dev")
    @Bean
    public DevProfile devProfile() {
        return new DevProfile();
    }
}
