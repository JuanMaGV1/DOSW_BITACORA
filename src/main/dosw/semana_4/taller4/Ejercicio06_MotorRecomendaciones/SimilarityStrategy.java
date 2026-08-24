package main.dosw.semana_4.taller4.Ejercicio06_MotorRecomendaciones;

import java.util.List;

public class SimilarityStrategy implements RecommendationAlgorithm {
    private List<Content> allContent;
    
    public SimilarityStrategy(List<Content> allContent) {
        this.allContent = allContent;
    }
    
    @Override
    public List<Content> recommend(User user) {
        System.out.println(" Recomendando por similitud con otros usuarios");
        return allContent.stream()
                .skip(2)
                .limit(3)
                .toList();
    }
}