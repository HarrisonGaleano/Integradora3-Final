package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * This class represents the system of the virtual library.
 * It manages the product matrix, user registration, product addition, automatic object generation,
 * product purchase, magazine subscription, cancellation of magazine subscription,
 * and display of products and users.
 */
public class System {
    private BibliographicProduct[][] productMatrix;
    private List<User> users;
    private List<Invoice> invoices;

     /**
     * Constructs a new System object with default values.
     * Initializes the product matrix, user list, and invoice list.
     */
    public System() {
        this.productMatrix = new BibliographicProduct[10][10];
        this.users = new ArrayList<>();
        this.invoices = new ArrayList<>();
    }

     /**
     * Registers a new user in the system.
     *
     * @param name     the name of the user
     * @param ID       the ID of the user
     * @param joinDate the join date of the user
     * @param userType the type of the user
     */
    public void registerUser(String name, String ID, Calendar joinDate, int userType) {
        User user;
        if (userType == 1) {
            user = new RegularUser(name, ID, joinDate);
        } else if (userType == 2) {
            user = new PremiumUser(name, ID, joinDate);
        } else {
            System.out.println("Tipo de usuario no válido.");
            return;
        }
        users.add(user);
        System.out.println("Usuario registrado exitosamente.");
    }

      /**
     * Adds a new product to the product matrix.
     *
     * @param product the product to be added
     */
    public void addProduct(BibliographicProduct product) {
        int[] emptyCell = findEmptyCell();
        if (emptyCell != null) {
            int row = emptyCell[0];
            int col = emptyCell[1];
            productMatrix[row][col] = product;
            System.out.println(product.getClass().getSimpleName() + " agregado exitosamente en la casilla (" + row + ", " + col + ").");
        } else {
            System.out.println("No hay espacio disponible para agregar el producto.");
        }
    }

      /**
     * Generates objects automatically in the system.
     */
    public void generateObjectsAutomatically() {
        // Generar objetos automáticamente
        addProduct(new Book("1A3", "Harry Potter and the Sorcerer's Stone", 320, Calendar.getInstance(), "HPSS.png", 0));
        addProduct(new Magazine("Z1T", "Vogue", 40, Calendar.getInstance(), "LMV2021.jpg", 0, "Variedades", 4.99, "Mensual", 122867));
    }

    /**
     * Allows a user to buy a book.
     *
     * @param user the user who wants to buy the book
     * @param book the book to be bought
     */
    public void buyBook(User user, Book book) {
        user.buyBook(book);

        // Actualizar el número de ejemplares vendidos
        book.incrementCopiesSold();

        // Crear factura
        Calendar date = Calendar.getInstance();
        double amount = book.getSalePrice();
        Invoice invoice = new Invoice(user, book, date, amount);
        invoices.add(invoice);
    }

     /**
     * Allows a user to subscribe to a magazine.
     *
     * @param user     the user who wants to subscribe
     * @param magazine the magazine to be subscribed
     */
    public void subscribeToMagazine(User user, Magazine magazine) {
        user.subscribeToMagazine(magazine);

        // Actualizar el número de suscripciones activas
        magazine.incrementSubscriptions();

        // Crear factura
        Calendar date = Calendar.getInstance();
        double amount = magazine.getSubscriptionPrice();
        Invoice invoice = new Invoice(user, magazine, date, amount);
        invoices.add(invoice);
    }

     /**
     * Cancels a magazine subscription for a user.
     *
     * @param user     the user who wants to cancel the subscription
     * @param magazine the magazine to be unsubscribed
     */
    public void cancelMagazineSubscription(User user, Magazine magazine) {
        user.cancelMagazineSubscription(magazine);

        // Actualizar el número de suscripciones activas
        magazine.decrementSubscriptions();
    }

    /**
     * Displays the product matrix.
     */
    public void displayProductMatrix() {
        System.out.println("Matriz de productos:");
        for (int i = 0; i < productMatrix.length; i++) {
            for (int j = 0; j < productMatrix[i].length; j++) {
                BibliographicProduct product = productMatrix[i][j];
                if (product != null) {
                    System.out.println("Casilla (" + i + ", " + j + "): " + product);
                }
            }
        }
    }

     /**
     * Displays the list of users.
     */
    public void displayUsers() {
        System.out.println("Lista de usuarios:");
        for (User user : users) {
            System.out.println(user);
        }
    }

      /**
     * Finds an empty cell in the product matrix.
     *
     * @return the coordinates of an empty cell, or null if no empty cell is found
     */
    private int[] findEmptyCell() {
        for (int i = 0; i < productMatrix.length; i++) {
            for (int j = 0; j < productMatrix[i].length; j++) {
                if (productMatrix[i][j] == null) {
                    return new int[]{i, j};
                }
            }
        }
        return null; // No hay espacio disponible
    }

     /**
     * Finds a product in the product matrix by its ID.
     *
     * @param id the ID of the product to be found
     * @return the found product, or null if no product with the specified ID is found
     */
    public BibliographicProduct findProductById(String id) {
        for (int i = 0; i < productMatrix.length; i++) {
            for (int j = 0; j < productMatrix[i].length; j++) {
                BibliographicProduct product = productMatrix[i][j];
                if (product != null && product.getId().equals(id)) {
                    return product;
                }
            }
        }
        return null; // No se encontró el producto con el ID especificado
    }

     /**
     * Finds a user in the user list by their ID.
     *
     * @param id the ID of the user to be found
     * @return the found user, or null if no user with the specified ID is found
     */
    public User findUserById(String id) {
        for (User user : users) {
            if (user.getID().equals(id)) {
                return user;
            }
        }
        return null; // No se encontró el usuario con el ID especificado
    }
}
