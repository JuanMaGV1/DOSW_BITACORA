package main.dosw.semana_4.taller4.Ejercicio06_MotorRecomendaciones;

import java.util.List;

public class HomePageComponent implements PreferenceObserver {
    private UserProfile profile;
    
    public HomePageComponent(UserProfile profile) {
        this.profile = profile;
    }
    
    @Override
    public void onPreferenceChanged(User user) {
        System.out.println("   HomePage: Actualizando página principal...");
        List<Content> recommendations = profile.getRecommendations();
        System.out.println("   HomePage: Mostrando " + recommendations.size() + " recomendaciones: " + recommendations);
    }
}