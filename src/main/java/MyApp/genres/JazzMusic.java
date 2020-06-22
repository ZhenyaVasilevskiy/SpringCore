package MyApp.genres;

import MyApp.Music;

public class JazzMusic implements Music {
    @Override
    public String getSong() {
        return "Jazz song";
    }
}