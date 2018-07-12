import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflections { // Uso de reflections para capturar informções de uma classe
    public static void main(String[] args) {
        Class<Galaxy> g = Galaxy.class; // criando um objeto classe

        if (g.isAnnotationPresent(SmartPhoneAnnotation.class)) { // verificando se a classe tem a annotation SmartPhoneAnnotation
            System.out.println("Possue annotation");
            for (Annotation a : g.getAnnotations()) { // varrendo todas as annotations
                if (a instanceof SmartPhoneAnnotation) { // verificando se ela é do tipo SmartPhoneAnnotation
                    System.out.println("Fabricante: " + ((SmartPhoneAnnotation) a).fabricante()); // usando cast para acessar os atributos e metodos da annotation
                    System.out.println("Preco: " + ((SmartPhoneAnnotation) a).preco());
                }
            }
        }

        System.out.println("\nAtributos");
        for (Field f : g.getDeclaredFields()) { // varrendo todos os atributos
            System.out.println(f.getName());
        }

        System.out.println("\nMétodos");
        for (Method m : g.getDeclaredMethods()) { // varrendo todos os metodos
            System.out.println(m.getName());
        }

        System.out.println(g);
    }
}
