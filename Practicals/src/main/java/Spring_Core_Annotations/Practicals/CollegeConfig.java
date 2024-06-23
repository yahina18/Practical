package Spring_Core_Annotations.Practicals;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "Spring_Core_Annotations.Practicals")
@PropertySource("classpath:Student-info.properties") //classpath mistake...

public class CollegeConfig {

	/*
	 * @Bean public Principal principalBean() { return new Principal(); }
	 * 
	 * @Bean public College collegeBean() { return new College();
	 * 
	 * }
	 * 
	 * @Bean public Teacher mathTeacher() { return new MathTeacher(); }
	 */
}
