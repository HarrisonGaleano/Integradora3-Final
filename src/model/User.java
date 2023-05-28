package model;

import java.util.ArrayList;
import java.util.List;

/**
 * The abstract User class represents a user in the virtual library system.
 * It provides common attributes and operations for different types of users.
 */
public abstract class User {
    private String name;
    private String ID;
    private List<Book> books;
    private List<Magazine> magazines;

    /**
     * Constructs a User object with the specified name and ID.
     *
     * @param name the name of the user
     * @param ID   the ID of the user
     */
    public User(String name, String ID) {
        this.name = name;
        this.ID = ID;
        this.books = new ArrayList<>();
        this.magazines = new ArrayList<>();
    }

     /**
     * Returns the ID of the user.
     *
     * @return the ID of the user
     */
    public String getID() {
        return ID;
    }

      /**
     * Adds a book to the user's collection.
     *
     * @param book the book to be bought
     */
    public void buyBook(Book book) {
        books.add(book);
    }

     /**
     * Subscribes to a magazine.
     *
     * @param magazine the magazine to be subscribed
     */
    public void subscribeToMagazine(Magazine magazine) {
        magazines.add(magazine);
    }

     /**
     * Cancels a magazine subscription.
     *
     * @param magazine the magazine to be unsubscribed
     */
    public void cancelMagazineSubscription(Magazine magazine) {
        magazines.remove(magazine);
    }

    /**
     * Returns the type of the user.
     *
     * @return the type of the user
     */
    public abstract String getUserType();

    /**
     * Returns a string representation of the User object.
     *
     * @return a string representation of the User object
     */
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", books=" + books +
                ", magazines=" + magazines +
                '}';
    }
}
