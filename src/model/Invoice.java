package model;

import java.util.Calendar;


/**
 * The Invoice class represents an invoice for a purchased bibliographic product.
 */
public class Invoice {
    private User user;
    private BibliographicProduct product;
    private Calendar date;
    private double amount;

    
    /**
     * Constructs an Invoice object with the specified user, product, date, and amount.
     *
     * @param user    the user associated with the invoice
     * @param product the bibliographic product associated with the invoice
     * @param date    the date of the invoice
     * @param amount  the amount of the invoice
     */
    public Invoice(User user, BibliographicProduct product, Calendar date, double amount) {
        this.user = user;
        this.product = product;
        this.date = date;
        this.amount = amount;
    }
    
    /**
     * Returns the user associated with the invoice.
     *
     * @return the user associated with the invoice
     */
    public User getUser() {
        return user;
    }

    /**
     * Returns the bibliographic product associated with the invoice.
     *
     * @return the bibliographic product associated with the invoice
     */
    public BibliographicProduct getProduct() {
        return product;
    }

    /**
     * Returns the date of the invoice.
     *
     * @return the date of the invoice
     */
    public Calendar getDate() {
        return date;
    }

    /**
     * Returns the amount of the invoice.
     *
     * @return the amount of the invoice
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Returns a string representation of the Invoice object.
     *
     * @return a string representation of the Invoice object
     */
    @Override
    public String toString() {
        return "Invoice{" +
                "user=" + user +
                ", product=" + product +
                ", date=" + date.getTime() +
                ", amount=" + amount +
                '}';
    }
}


