package main.dosw.semana_4.taller4.Ejercicio06_MotorRecomendaciones;

import java.util.List;
import java.util.ArrayList;

public class UserProfile {
    private User user;
    private RecommendationAlgorithm algorithm;
    private List<PreferenceObserver> observers;
    
    public UserProfile(User user, RecommendationAlgorithm initialAlgorithm) {
        this.user = user;
        this.algorithm = initialAlgorithm;
        this.observers = new ArrayList<>();
    }
    
    public void attach(PreferenceObserver observer) {
        observers.add(observer);
        System.out.println("  " + observer.getClass().getSimpleName() + " suscrito");
    }
    
    public void detach(PreferenceObserver observer) {
        observers.remove(observer);
    }
    
    public void setAlgorithm(RecommendationAlgorithm algorithm) {
        System.out.println("\n Cambiando algoritmo de recomendación...");
        this.algorithm = algorithm;
        notifyObservers();
    }
    
    public void setUserPreferences(List<String> genres) {
        System.out.println("\n Cambiando preferencias del usuario...");
        user.setFavoriteGenres(genres);
        notifyObservers();
    }
    
    private void notifyObservers() {
        System.out.println(" Notificando a " + observers.size() + " observadores...");
        observers.stream().forEach(observer -> {
            observer.onPreferenceChanged(user);
        });
        System.out.println(" Actualización completada\n");
    }
    
    public List<Content> getRecommendations() {
        return algorithm.recommend(user);
    }
}