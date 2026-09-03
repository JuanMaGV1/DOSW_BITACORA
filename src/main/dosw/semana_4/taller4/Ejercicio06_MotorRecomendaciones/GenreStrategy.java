package main.dosw.semana_4.taller4.Ejercicio06_MotorRecomendaciones;

import java.util.List;

public class GenreStrategy implements RecommendationAlgorithm {
    private List<Content> allContent;
    
    public GenreStrategy(List<Content> allContent) {
        this.allContent = allContent;
    }
    
    @Override
    public List<Content> recommend(User user) {
        System.out.println(" Recomendando por género favorito: " + user.getFavoriteGenres());
        return allContent.stream()
                .filter(content -> user.getFavoriteGenres().contains(content.getGenre()))
                .toList();
    }
}