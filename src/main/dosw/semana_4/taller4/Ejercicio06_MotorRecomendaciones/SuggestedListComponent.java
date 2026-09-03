package main.dosw.semana_4.taller4.Ejercicio06_MotorRecomendaciones;

import java.util.List;

public class SuggestedListComponent implements PreferenceObserver {
    private UserProfile profile;
    
    public SuggestedListComponent(UserProfile profile) {
        this.profile = profile;
    }
    
    @Override
    public void onPreferenceChanged(User user) {
        System.out.println("   SuggestedList: Actualizando lista de sugeridos...");
        List<Content> recommendations = profile.getRecommendations();
        System.out.println("   SuggestedList: Mostrando " + recommendations.size() + " sugerencias: " + recommendations);
    }
}