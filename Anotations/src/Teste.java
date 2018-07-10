import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Teste {
    public static void main(String[] args) {
        Class<Galaxy> g = Galaxy.class;

        if (g.isAnnotationPresent(SmartPhoneAnnotation.class)) {
            System.out.println("Possue annotation");
            for (Annotation a: g.getAnnotations()) {
                if (a instanceof SmartPhoneAnnotation) {
                    System.out.println("Fabricante: " + ((SmartPhoneAnnotation)a).fabricante());
                    System.out.println("Preco: " + ((SmartPhoneAnnotation)a).preco());
                }
            }
        }

        System.out.println("\nAtributos");
        for (Field f: g.getDeclaredFields()) {
            System.out.println(f.getName());
        }

        System.out.println("\nMétodos");
        for (Method m: g.getDeclaredMethods()) {
            System.out.println(m.getName());
        }

    }
}
