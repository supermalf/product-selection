package com.sky;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Provides sanity check of Spring Context XML configuration without having to build project.
 * Verifies that Spring context can be created and the Spring Boot application bean retrieved.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ProductSelectionApplication.class)
@WebAppConfiguration
public class ApplicationContextTest {

    @Autowired
    ApplicationContext ctx;

    @Test
    public void testContextLoads() throws Exception {
        assertNotNull(ctx);

        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
        for (String bean : beanDefinitionNames) {
            System.out.println("Found bean: " + bean);
        }

        assertTrue(this.ctx.containsBean("catalogueServiceImpl"));
    }
}
