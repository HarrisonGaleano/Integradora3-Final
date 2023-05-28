package model;

import java.util.Calendar;

/**
 * The Book class represents a book in the virtual library system.
 * It is a specific type of bibliographic product.
 */
public class Book extends BibliographicProduct {
    private String shortReview;
    private String genre;
    private double saleValue;
    private int copiesSold;

    /**
     * Constructs a Book object with the specified identifier, name, number of pages,
     * publication date, URL, pages read, short review, genre, sale value, and copies sold.
     *
     * @param id              the identifier of the book
     * @param name            the name of the book
     * @param numberOfPages   the number of pages in the book
     * @param publicationDate the publication date of the book
     * @param url             the URL of the book
     * @param pagesRead       the number of pages read in the book
     * @param shortReview     the short review of the book
     * @param genre           the genre of the book
     * @param saleValue       the sale value of the book
     * @param copiesSold      the number of copies sold for the book
     */
    public Book(String id, String name, int numberOfPages, Calendar publicationDate, String url, int pagesRead, String shortReview, String genre, double saleValue, int copiesSold) {
        super(id, name, numberOfPages, publicationDate, url, pagesRead);
        this.shortReview = shortReview;
        this.genre = genre;
        this.saleValue = saleValue;
        this.copiesSold = copiesSold;
    }

    /**
     * Increments the count of sales for the book by one and generates a purchase receipt
     * with the current date and the amount paid.
     *
     * @param amountPaid the amount paid for purchasing the book
     */
    public void purchaseBook(double amountPaid) {
        incrementSalesCount();

        // Generar factura con la fecha de operación y el monto pagado
        Calendar currentDate = Calendar.getInstance();

        System.out.println("Libro adquirido exitosamente. Número de ejemplares vendidos: " + getSalesCount());
    }

    /**
     * Returns the short review of the book.
     *
     * @return the short review of the book
     */
    public String getShortReview() {
        return shortReview;
    }

    /**
     * Sets the short review of the book.
     *
     * @param shortReview the short review to set
     */
    public void setShortReview(String shortReview) {
        this.shortReview = shortReview;
    }

    /**
     * Returns the genre of the book.
     *
     * @return the genre of the book
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Sets the genre of the book.
     *
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
    * Returns the sale value of the book.
    *
    * @return the sale value of the book
    */
    public double getSaleValue() {
        return saleValue;
    }

    /**
     * Sets the sale value of the book.
     *
     * @param saleValue the sale value to set
     */
    public void setSaleValue(double saleValue) {
        this.saleValue = saleValue;
    }

    /**
    * Returns the number of copies sold for the book.
    *
    * @return the number of copies sold for the book
    */
    public int getCopiesSold() {
        return copiesSold;
    }

    /**
     * Sets the number of copies sold for the book.
     *
     * @param copiesSold the number of copies sold to set
     */
    public void setCopiesSold(int copiesSold) {
        this.copiesSold = copiesSold;
    }

    /**
     * Displays the information of the book, including its ID, name, number of pages,
     * publication date, URL, pages read, short review, genre, sale value, and copies sold.
     */
    @Override
    public void displayInformation() {
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Number of Pages: " + getNumberOfPages());
        System.out.println("Publication Date: " + getPublicationDate().getTime());
        System.out.println("URL: " + getUrl());
        System.out.println("Pages Read: " + getPagesRead());

        System.out.println("Short Review: " + shortReview);
        System.out.println("Genre: " + genre);
        System.out.println("Sale Value: $" + saleValue);
        System.out.println("Copies Sold: " + copiesSold);
    }
}
