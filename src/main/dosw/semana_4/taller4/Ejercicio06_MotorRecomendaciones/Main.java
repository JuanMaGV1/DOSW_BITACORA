package main.dosw.semana_4.taller4.Ejercicio06_MotorRecomendaciones;

import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Datos de contenido
        List<Content> allContent = Arrays.asList(
            new Content(1, "Stranger Things", "Sci-Fi"),
            new Content(2, "The Crown", "Drama"),
            new Content(3, "La Casa de Papel", "Thriller"),
            new Content(4, "The Witcher", "Fantasy"),
            new Content(5, "Breaking Bad", "Drama"),
            new Content(6, "The Mandalorian", "Sci-Fi"),
            new Content(7, "Game of Thrones", "Fantasy"),
            new Content(8, "Narcos", "Thriller")
        );
        
        // Crear usuario
        User user = new User("Juan");
        user.setFavoriteGenres(Arrays.asList("Sci-Fi", "Fantasy"));
        user.addToHistory(1);
        user.addToHistory(5);
        
        System.out.println("=== MOTOR DE RECOMENDACIONES ===\n");
        System.out.println(" Usuario: " + user.getName());
        System.out.println("  Géneros favoritos: " + user.getFavoriteGenres());
        System.out.println("  Historial: " + user.getWatchHistory() + "\n");
        
        // Crear perfil con algoritmo inicial
        RecommendationAlgorithm initialAlg = new GenreStrategy(allContent);
        UserProfile profile = new UserProfile(user, initialAlg);
        
        // Crear observers y suscribirlos
        System.out.println(" Suscribiendo componentes:");
        HomePageComponent home = new HomePageComponent(profile);
        SuggestedListComponent suggested = new SuggestedListComponent(profile);
        NotificationService notifier = new NotificationService(profile);
        
        profile.attach(home);
        profile.attach(suggested);
        profile.attach(notifier);
        
        System.out.println("\n" + "=".repeat(60));
        System.out.println(" RECOMENDACIÓN INICIAL (GenreStrategy)");
        System.out.println("=".repeat(60));
        profile.getRecommendations();
        
        System.out.println("\n" + "=".repeat(60));
        System.out.println(" CAMBIO DE ALGORITMO (GenreStrategy -> PopularityStrategy)");
        System.out.println("=".repeat(60));
        profile.setAlgorithm(new PopularityStrategy(allContent));
        
        System.out.println("=".repeat(60));
        System.out.println(" CAMBIO DE ALGORITMO (PopularityStrategy -> HistoryStrategy)");
        System.out.println("=".repeat(60));
        profile.setAlgorithm(new HistoryStrategy(allContent));
        
        System.out.println("=".repeat(60));
        System.out.println(" CAMBIO DE PREFERENCIAS DEL USUARIO");
        System.out.println("=".repeat(60));
        profile.setUserPreferences(Arrays.asList("Thriller", "Drama"));
    }
}