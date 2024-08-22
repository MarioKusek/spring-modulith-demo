package hr.fer.spring.modulith.demo;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.test.ApplicationModuleTest;

@ApplicationModuleTest
public class DemoApplicationIntegrationTests {

    @Test
    void appModulesVerification() {
        ApplicationModules.of(DemoApplication.class).verify();
    }

}
