package ControleClasse;

public interface Callback<T> {
    T executa(T obj);

    default void oi() {
        System.out.printf("oi");
    }

    default void thau() {
        System.out.printf("thau");
    }
}
