package model;

import java.util.Calendar;

/**
 * The BibliographicProduct class represents a bibliographic product in the virtual library system.
 * It serves as the base class for specific types of bibliographic products such as books and magazines.
 */
public class BibliographicProduct {
    private String id;
    private String name;
    private int numberOfPages;
    private Calendar publicationDate;
    private String url;
    private int pagesRead;
    private int salesCount;
    private int subscriptionCount;

     /**
     * Constructs a BibliographicProduct object with the specified identifier, name, number of pages,
     * publication date, URL, and pages read.
     *
     * @param id              the identifier of the bibliographic product
     * @param name            the name of the bibliographic product
     * @param numberOfPages   the number of pages in the bibliographic product
     * @param publicationDate the publication date of the bibliographic product
     * @param url             the URL of the bibliographic product
     * @param pagesRead       the number of pages read in the bibliographic product
     */
    public BibliographicProduct(String id, String name, int numberOfPages, Calendar publicationDate, String url, int pagesRead) {
        this.id = id;
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.publicationDate = publicationDate;
        this.url = url;
        this.pagesRead = pagesRead;
    }

    /**
     * Returns the identifier of the bibliographic product.
     *
     * @return the identifier of the bibliographic product
     */
    public String getId() {
        return id;
    }

     /**
     * Returns the name of the bibliographic product.
     *
     * @return the name of the bibliographic product
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the number of pages in the bibliographic product.
     *
     * @return the number of pages in the bibliographic product
     */
    public int getNumberOfPages() {
        return numberOfPages;
    }

    /**
     * Returns the publication date of the bibliographic product.
     *
     * @return the publication date of the bibliographic product
     */
    public Calendar getPublicationDate() {
        return publicationDate;
    }

    /**
     * Returns the URL of the bibliographic product.
     *
     * @return the URL of the bibliographic product
     */
    public String getUrl() {
        return url;
    }

    /**
     * Returns the number of pages read in the bibliographic product.
     *
     * @return the number of pages read in the bibliographic product
     */
    public int getPagesRead() {
        return pagesRead;
    }

    /**
     * Sets the identifier of the bibliographic product.
     *
     * @param id the identifier to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
    * Sets the name of the bibliographic product.
    *
    * @param name the name to set
    */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the number of pages in the bibliographic product.
     *
     * @param numberOfPages the number of pages to set
     */
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    /**
     * Sets the publication date of the bibliographic product.
     *
     * @param publicationDate the publication date to set
     */
    public void setPublicationDate(Calendar publicationDate) {
        this.publicationDate = publicationDate;
    }

    /**
     * Sets the URL of the bibliographic product.
     *
     * @param url the URL to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Sets the number of pages read in the bibliographic product.
     *
     * @param pagesRead the number of pages read to set
     */
    public void setPagesRead(int pagesRead) {
        this.pagesRead = pagesRead;
    }

    /**
     * Returns the count of sales for the bibliographic product.
     *
     * @return the count of sales for the bibliographic product
     */
    public int getSalesCount() {
        return salesCount;
    }

     /**
     * Increments the count of sales for the bibliographic product by one.
     */
    public void incrementSalesCount() {
        salesCount++;
    }

    /**
     * Returns the count of subscriptions for the bibliographic product.
     *
     * @return the count of subscriptions for the bibliographic product
     */
    public int getSubscriptionCount() {
        return subscriptionCount;
    }

    /**
     * Increments the count of subscriptions for the bibliographic product by one.
     */
    public void incrementSubscriptionCount() {
        subscriptionCount++;
    }

    /**
     * Decrements the count of subscriptions for the bibliographic product by one.
     */
    public void decrementSubscriptionCount() {
        subscriptionCount--;
    }

    /**
     * Displays the information of the bibliographic product, including its ID, name,
     * number of pages, publication date, URL, and pages read.
     */
    public void displayInformation() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Number of Pages: " + numberOfPages);
        System.out.println("Publication Date: " + publicationDate.getTime());
        System.out.println("URL: " + url);
        System.out.println("Pages Read: " + pagesRead);
    }
}
