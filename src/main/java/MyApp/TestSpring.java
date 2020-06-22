package MyApp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import MyApp.config.AppConfig;
public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                AppConfig.class
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.playMusic());

        context.close();
    }
}

