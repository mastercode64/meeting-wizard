package com.wirecard.meetingwizard.config

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
@EnableWebMvc
class CorsConfig : WebMvcConfigurer {

    @Override
    override fun addCorsMappings(registry: CorsRegistry) {
        registry.addMapping("/**")
    }



}