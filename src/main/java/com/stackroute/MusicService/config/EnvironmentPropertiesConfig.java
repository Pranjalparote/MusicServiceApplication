/*package com.stackroute.MusicService.config;

import com.stackroute.MusicService.domain.Music;
import com.stackroute.MusicService.repository.MusicRepository;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;


@Component
@PropertySource("classpath:application.properties")
public class EnvironmentPropertiesConfig implements ApplicationListener<ContextRefreshedEvent>
{
    private static final Logger logs=Logger.getLogger(EnvironmentPropertiesConfig.class);
    private MusicRepository musicRepository;
    @Autowired
    private Environment env;
    @Autowired
    public EnvironmentPropertiesConfig(MusicRepository musicRepository){
        this.musicRepository=musicRepository;
    }
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent){
        logs.info("data inserted");
        Music music14 = new Music(Integer.parseInt(env.getProperty("app.musicId")),env.getProperty("app.musicname"),env.getProperty("app.comment"));
        musicRepository.save(music14);
        logs.info("data successfully inserted");
    }
}

*/

