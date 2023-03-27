import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Persona> personas = new ArrayList<>();
    String opcion = "";
    while (!opcion.equals("3")) {
      System.out.println("1. Agregar persona");
      System.out.println("2. Listar personas");
      System.out.println("3. Salir");
      System.out.print("Ingrese una opción: ");
      opcion = scanner.nextLine();
      switch (opcion) {
        case "1":
          Persona persona = new Persona();
          System.out.print("Ingrese el nombre: ");
          persona.setNombre(scanner.nextLine());
          System.out.print("Ingrese el apellido: ");
          persona.setApellido(scanner.nextLine());
          System.out.print("Ingrese la fecha de nacimiento: ");
          persona.setFechaNacimiento(scanner.nextLine());
          personas.add(persona);
          break;
        case "2":
          System.out.println("Personas:");
          for (Persona p : personas) {
            System.out.println(p.getNombre() + " " + p.getApellido() + " (" + p.getFechaNacimiento() + ")");
          }
          break;
        case "3":
          break;
        default:
          System.out.println("Opción inválida");
          break;
      }
    }
  }
}
