    package model;

    import java.util.Calendar;

    /**
     * The Book class represents a book in the virtual library system.
     * It extends the BibliographicProduct class and provides additional attributes and operations specific to books.
     */
    public class PremiumUser extends User {
        private Calendar joinDate;

        /**
     * Constructs a Book object with the specified identifier, name, number of pages, publication date, URL, and pages read.
     *
     * @param id              the identifier of the book
     * @param name            the name of the book
     * @param numberOfPages   the number of pages in the book
     * @param publicationDate the publication date of the book
     * @param url             the URL of the book
     * @param pagesRead       the number of pages read in the book
     */
        public PremiumUser(String name, String ID, Calendar joinDate) {
            super(name, ID);
            this.joinDate = joinDate;
        }

        /**
     * Returns the number of pages in the book.
     *
     * @return the number of pages in the book
     */
        public Calendar getJoinDate() {
            return joinDate;
        }

        /**
     * Sets the number of pages in the book.
     *
     * @param numberOfPages the number of pages to set
     */
        @Override
        public String getUserType() {
            return "Premium";
        }
    }

