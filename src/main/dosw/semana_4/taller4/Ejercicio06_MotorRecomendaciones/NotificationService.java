package main.dosw.semana_4.taller4.Ejercicio06_MotorRecomendaciones;

import java.util.List;

public class NotificationService implements PreferenceObserver {
    private UserProfile profile;
    
    public NotificationService(UserProfile profile) {
        this.profile = profile;
    }
    
    @Override
    public void onPreferenceChanged(User user) {
        System.out.println("   NotificationService: Enviando notificación a " + user.getName());
        List<Content> recommendations = profile.getRecommendations();
        System.out.println("   NotificationService: Notificación: 'Nuevas recomendaciones disponibles: " + 
                          recommendations.stream().limit(2).toList() + "'");
    }
}