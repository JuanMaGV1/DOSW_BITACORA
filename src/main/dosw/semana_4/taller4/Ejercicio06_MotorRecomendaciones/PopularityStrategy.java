package main.dosw.semana_4.taller4.Ejercicio06_MotorRecomendaciones;

import java.util.List;

class PopularityStrategy implements RecommendationAlgorithm {
    private List<Content> allContent;
    
    public PopularityStrategy(List<Content> allContent) {
        this.allContent = allContent;
    }
    
    @Override
    public List<Content> recommend(User user) {
        System.out.println(" Recomendando los más populares");
        return allContent.stream()
                .limit(5)
                .toList();
    }
}