package main.dosw.semana_1.streams;

import java.util.Arrays;
import java.util.List;

public class Reto5 {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction("T001", 500000, true),
                new Transaction("T002", 250000, true),
                new Transaction("T003", 800000, false),
                new Transaction("T004", 150000, true)
        );
        boolean loteValido = transactions.stream()
                                         .peek(transaction -> System.out.println("Procesando: " + transaction))
                                         .anyMatch(transaction ->!transaction.isApproved());
                                         
        System.out.println("\n¿El lote es válido? " + !loteValido);
    }
}
