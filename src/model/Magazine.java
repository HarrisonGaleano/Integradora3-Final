package model;

import java.util.Calendar;

/**
 * The Magazine class represents a magazine in the virtual library system.
 * It is a specific type of bibliographic product.
 */
public class Magazine extends BibliographicProduct {
    private double subscriptionValue;
    private String emissionPeriodicity;
    private int activeSubscriptions;
    private String category;

    /**
     * Constructs a Magazine object with the specified identifier, name, number of pages,
     * publication date, URL, pages read, subscription value, emission periodicity,
     * active subscriptions, and category.
     *
     * @param id                  the identifier of the magazine
     * @param name                the name of the magazine
     * @param numberOfPages       the number of pages in the magazine
     * @param publicationDate     the publication date of the magazine
     * @param url                 the URL of the magazine
     * @param pagesRead           the number of pages read in the magazine
     * @param subscriptionValue   the subscription value of the magazine
     * @param emissionPeriodicity the emission periodicity of the magazine
     * @param activeSubscriptions the number of active subscriptions for the magazine
     * @param category            the category of the magazine
     */
    public Magazine(String id, String name, int numberOfPages, Calendar publicationDate, String url, int pagesRead, double subscriptionValue, String emissionPeriodicity, int activeSubscriptions, String category) {
        super(id, name, numberOfPages, publicationDate, url, pagesRead);
        this.subscriptionValue = subscriptionValue;
        this.emissionPeriodicity = emissionPeriodicity;
        this.activeSubscriptions = activeSubscriptions;
        this.category = category;
    }

    /**
     * Increments the count of subscriptions for the magazine by one and generates a subscription receipt
     * with the current date and the amount paid.
     *
     * @param amountPaid the amount paid for subscribing to the magazine
     */
    public void subscribeToMagazine(double amountPaid) {
        incrementSubscriptionCount();

        // Generar factura con la fecha de operación y el monto pagado
        Calendar currentDate = Calendar.getInstance();

        System.out.println("Suscripción a revista realizada exitosamente. Suscripciones activas: " + getSubscriptionCount());
    }

      /**
     * Returns the subscription value of the magazine.
     *
     * @return the subscription value of the magazine
     */
    public double getSubscriptionValue() {
        return subscriptionValue;
    }

    
    /**
     * Sets the subscription value of the magazine.
     *
     * @param subscriptionValue the subscription value to set
     */
    public void setSubscriptionValue(double subscriptionValue) {
        this.subscriptionValue = subscriptionValue;
    }

     /**
     * Returns the emission periodicity of the magazine.
     *
     * @return the emission periodicity of the magazine
     */
    public String getEmissionPeriodicity() {
        return emissionPeriodicity;
    }

    /**
     * Sets the emission periodicity of the magazine.
     *
     * @param emissionPeriodicity the emission periodicity to set
     */
    public void setEmissionPeriodicity(String emissionPeriodicity) {
        this.emissionPeriodicity = emissionPeriodicity;
    }

    /**
     * Returns the number of active subscriptions for the magazine.
     *
     * @return the number of active subscriptions for the magazine
     */
    public int getActiveSubscriptions() {
        return activeSubscriptions;
    }

    /**
     * Sets the number of active subscriptions for the magazine.
     *
     * @param activeSubscriptions the number of active subscriptions to set
     */
    public void setActiveSubscriptions(int activeSubscriptions) {
        this.activeSubscriptions = activeSubscriptions;
    }

      /**
     * Returns the category of the magazine.
     *
     * @return the category of the magazine
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the category of the magazine.
     *
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Displays the information of the magazine, including its ID, name, number of pages,
     * publication date, URL, pages read, subscription value, emission periodicity,
     * active subscriptions, and category.
     */
    @Override
    public void displayInformation() {
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Number of Pages: " + getNumberOfPages());
        System.out.println("Publication Date: " + getPublicationDate().getTime());
        System.out.println("URL: " + getUrl());
        System.out.println("Pages Read: " + getPagesRead());
        System.out.println("Subscription Value: $" + subscriptionValue);
        System.out.println("Emission Periodicity: " + emissionPeriodicity);
        System.out.println("Active Subscriptions: " + activeSubscriptions);
        System.out.println("Category: " + category);
    }
}
