package ui;

import java.util.Scanner;

import model.System;
import model.BibliographicProduct;
import model.User;

/**
 * This class represents the user interface of the virtual library.
 * It provides methods to interact with the system and perform various operations.
 */
public class UserInterface {
    private static System system;
    private static Scanner scanner;

      /**
     * The main method that starts the virtual library application.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        system = new System();
        scanner = new Scanner(System.in);

        int option = 0;

        while (option != 9) {
            printMenu();
            option = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (option) {
                case 1:
                    registerUser();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    generateObjectsAutomatically();
                    break;
                case 4:
                    buyBook();
                    break;
                case 5:
                    subscribeToMagazine();
                    break;
                case 6:
                    cancelMagazineSubscription();
                    break;
                case 7:
                    displayProductMatrix();
                    break;
                case 8:
                    displayUsers();
                    break;
                case 9:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, intenta nuevamente.");
                    break;
            }
        }

        scanner.close();
    }

      /**
     * Prints the menu of available options in the virtual library.
     */
    private static void printMenu() {
        System.out.println("=== Biblioteca Virtual ===");
        System.out.println("1. Registrar usuario");
        System.out.println("2. Agregar producto");
        System.out.println("3. Generar objetos automáticamente");
        System.out.println("4. Comprar libro");
        System.out.println("5. Suscribirse a revista");
        System.out.println("6. Cancelar suscripción a revista");
        System.out.println("7. Mostrar matriz de productos");
        System.out.println("8. Mostrar usuarios");
        System.out.println("9. Salir");
        System.out.print("Selecciona una opción: ");
    }

    /**
     * Registers a new user in the virtual library.
     */
    private static void registerUser() {
        System.out.print("Nombre: ");
        String name = scanner.nextLine();

        System.out.print("ID: ");
        String id = scanner.nextLine();

        System.out.print("Fecha de ingreso (formato dd/mm/aaaa): ");
        String joinDateStr = scanner.nextLine();
        // Parse the join date
        // ... (implement the parsing logic according to the format)

        System.out.print("Tipo de usuario (1: Regular, 2: Premium): ");
        int userType = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        system.registerUser(name, id, joinDate, userType);
    }

     /**
     * Adds a new product to the virtual library.
     */
    private static void addProduct() {
        System.out.print("Identificador: ");
        String id = scanner.nextLine();

        System.out.print("Nombre: ");
        String name = scanner.nextLine();

        System.out.print("Número de páginas: ");
        int numberOfPages = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Fecha de publicación (formato dd/mm/aaaa): ");
        String publicationDateStr = scanner.nextLine();
        // Parse the publication date
        // ... (implement the parsing logic according to the format)

        System.out.print("URL: ");
        String url = scanner.nextLine();

        System.out.print("Páginas leídas: ");
        int pagesRead = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        BibliographicProduct product = new Book(id, name, numberOfPages, publicationDate, url, pagesRead);
        system.addProduct(product);
    }

    /**
     * Generates objects automatically.
     */
    private static void generateObjectsAutomatically() {
        // Implement the logic to generate objects automatically
    }

     /**
     * Allows a user to buy a book.
     */
    private static void buyBook() {
        System.out.print("ID del usuario: ");
        String userId = scanner.nextLine();

        System.out.print("ID del libro a comprar: ");
        String bookId = scanner.nextLine();

        User user = system.findUserById(userId);
        BibliographicProduct product = system.findProductById(bookId);

        if (user != null && product != null) {
            if (product instanceof Book) {
                user.buyBook((Book) product);
                System.out.println("Libro comprado exitosamente.");
            } else {
                System.out.println("El producto no es un libro.");
            }
        } else {
            System.out.println("No se encontró el usuario o el libro en el sistema.");
        }
    }

      /**
     * Allows a user to subscribe to a magazine.
     */
    private static void subscribeToMagazine() {
        System.out.print("ID del usuario: ");
        String userId = scanner.nextLine();

        System.out.print("ID de la revista a suscribirse: ");
        String magazineId = scanner.nextLine();

        User user = system.findUserById(userId);
        BibliographicProduct product = system.findProductById(magazineId);

        if (user != null && product != null) {
            if (product instanceof Magazine) {
                user.subscribeToMagazine((Magazine) product);
                System.out.println("Suscripción realizada exitosamente.");
            } else {
                System.out.println("El producto no es una revista.");
            }
        } else {
            System.out.println("No se encontró el usuario o la revista en el sistema.");
        }
    }

    /**
     * Cancels a magazine subscription for a user.
     */
    private static void cancelMagazineSubscription() {
        System.out.print("ID del usuario: ");
        String userId = scanner.nextLine();

        System.out.print("ID de la revista a cancelar suscripción: ");
        String magazineId = scanner.nextLine();

        User user = system.findUserById(userId);
        BibliographicProduct product = system.findProductById(magazineId);

        if (user != null && product != null) {
            if (product instanceof Magazine) {
                user.cancelMagazineSubscription((Magazine) product);
                System.out.println("Suscripción cancelada exitosamente.");
            } else {
                System.out.println("El producto no es una revista.");
            }
        } else {
            System.out.println("No se encontró el usuario o la revista en el sistema.");
        }
    }

        /**
     * Displays the product matrix.
     */
    private static void displayProductMatrix() {
        system.displayProductMatrix();
    }

    /**
     * Displays the list of users.
     */
    private static void displayUsers() {
        system.displayUsers();
    }
}
