package main.dosw.semana_4.taller4.Ejercicio06_MotorRecomendaciones;

import java.util.List;

public class HistoryStrategy implements RecommendationAlgorithm {
    private List<Content> allContent;
    
    public HistoryStrategy(List<Content> allContent) {
        this.allContent = allContent;
    }
    
    @Override
    public List<Content> recommend(User user) {
        System.out.println(" Recomendando basado en historial: " + user.getWatchHistory());
        // Simular recomendaciones basadas en historial
        return allContent.stream()
                .limit(3)
                .toList();
    }
}