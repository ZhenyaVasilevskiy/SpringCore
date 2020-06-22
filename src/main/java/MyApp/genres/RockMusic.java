package MyApp.genres;

import MyApp.Music;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Rock song";
    }
}