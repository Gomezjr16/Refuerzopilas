import java.util.Stack;

public class Metodos {
    Stack<PaginaWeb> pila = new Stack<>();

    public void visitar(PaginaWeb p) {
        pila.push(p);
    }

    public void retroceder() {
        if (!pila.isEmpty()) {
            pila.pop();

            if (!pila.isEmpty()) {
                PaginaWeb actual = pila.peek();
                System.out.println("Ahora estás en: " + actual.getTitulo() + " - " + actual.getUrl());
            } else {
                System.out.println("No hay páginas");
            }
        } else {
            System.out.println("No hay páginas");
        }
    }

    public void verActual() {
        if (!pila.isEmpty()) {
            PaginaWeb p = pila.peek();
            System.out.println(p.getTitulo() + " - " + p.getUrl());
        } else {
            System.out.println("Pila vacía");
        }
    }

    public void verHistorial() {
        if (!pila.isEmpty()) {
            for (PaginaWeb p : pila) {
                System.out.println(p.getTitulo() + " - " + p.getUrl() + " - " + p.getFechaAcceso());
            }
        } else {
            System.out.println("No hay historial");
        }
    }
}