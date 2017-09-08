package com.Mypro.configuration;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import java.util.Locale;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.Mypro")
public class MyproConfiguration extends WebMvcConfigurerAdapter {
    @Bean(name="Mypro")
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
 
        return viewResolver;
    }

    @Bean
    public MessageSource messageSource() {
    	ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
    	messageSource.setBasename("classpath:messages");
    	messageSource.setDefaultEncoding("UTF-8");
    	return messageSource;
    }
    
    @Bean
    public CookieLocaleResolver localeResolver(){
	 CookieLocaleResolver resolver = new CookieLocaleResolver();
	 resolver.setDefaultLocale(new Locale("en"));
	 resolver.setCookieName("Cookie");
	 resolver.setCookieMaxAge(4800);
	 return resolver;
    }
    
    /*
     * Configure ResourceHandlers to serve static resources like CSS/ Javascript etc...
     *
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("/static/");
    }
    

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
		registry.addInterceptor(localeChangeInterceptor);
		
	    //registry.addInterceptor(new LoggingInterceptor());
	    //registry.addInterceptor(new TransactionInterceptor()).addPathPatterns("/person/save/*");
	}
}
