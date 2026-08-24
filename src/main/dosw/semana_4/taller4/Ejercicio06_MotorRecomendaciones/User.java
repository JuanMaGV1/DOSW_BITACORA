package main.dosw.semana_4.taller4.Ejercicio06_MotorRecomendaciones;

import java.util.List;
import java.util.ArrayList;

public class User {
    private String name;
    private List<String> favoriteGenres;
    private List<Integer> watchHistory;
    
    public User(String name) {
        this.name = name;
        this.favoriteGenres = new ArrayList<>();
        this.watchHistory = new ArrayList<>();
    }
    
    public String getName() { return name; }
    public List<String> getFavoriteGenres() { return favoriteGenres; }
    public List<Integer> getWatchHistory() { return watchHistory; }
    
    public void setFavoriteGenres(List<String> genres) {
        this.favoriteGenres = genres;
    }
    
    public void addToHistory(int contentId) {
        watchHistory.add(contentId);
    }
}