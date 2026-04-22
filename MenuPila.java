import java.util.Scanner;

public class MenuPila {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        int op;

        do {
            System.out.println("\n1. Visitar página");
            System.out.println("2. Retroceder");
            System.out.println("3. Ver actual");
            System.out.println("4. Ver historial");
            System.out.println("0. Salir");

            op = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (op) {
                case 1:
                    PaginaWeb p = new PaginaWeb();

                    System.out.print("URL: ");
                    p.setUrl(sc.nextLine());

                    System.out.print("Titulo: ");
                    p.setTitulo(sc.nextLine());

                    System.out.print("Fecha: ");
                    p.setFechaAcceso(sc.nextLine());

                    m.visitar(p);
                    break;

                case 2:
                    m.retroceder();
                    break;

                case 3:
                    m.verActual();
                    break;

                case 4:
                    m.verHistorial();
                    break;

            }
        } while (op != 0);

        sc.close();
    }
}