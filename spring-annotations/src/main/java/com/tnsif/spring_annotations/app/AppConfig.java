
package com.tnsif.spring_annotations.app;

import org.springframework.context.annotation.Bean;

public class AppConfig {
	@Bean
	public MusicTeacher getTeacherInfo() {
		return new MusicTeacher();
	}
	
}
