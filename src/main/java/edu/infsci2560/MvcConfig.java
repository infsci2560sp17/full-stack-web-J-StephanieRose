package edu.infsci2560;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {
    
    

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/interest").setViewName("interest");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/signup").setViewName("signup");
        registry.addViewController("/artscrafts").setViewName("artscrafts");
        registry.addViewController("/cooking").setViewName("cooking");
        registry.addViewController("/customer").setViewName("customer");
        registry.addViewController("/fitness").setViewName("fitness");
        registry.addViewController("/gaming").setViewName("gaming");
        registry.addViewController("/greeting").setViewName("greeting");
        registry.addViewController("/music").setViewName("music");
        registry.addViewController("/reading").setViewName("reading");
        registry.addViewController("/sports").setViewName("sports");
        registry.addViewController("/volunteering").setViewName("volunteering");
        registry.addViewController("/about").setViewName("about us");
        registry.addViewController("/profile").setViewName("profile");
        registry.addViewController("/logout").setViewName("Signout");
        registry.addViewController("/files").setViewName("uploadForm");
    }

}