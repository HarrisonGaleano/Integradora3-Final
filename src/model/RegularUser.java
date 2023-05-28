package model;

import java.util.Calendar;

/**
 * The RegularUser class represents a regular user in the virtual library system.
 * It extends the User class and provides additional attributes and operations specific to regular users.
 */
public class RegularUser extends User {
    private Calendar joinDate;

    /**
     * Constructs a RegularUser object with the specified name, ID, and join date.
     *
     * @param name      the name of the regular user
     * @param ID        the ID of the regular user
     * @param joinDate  the join date of the regular user
     */
    public RegularUser(String name, String ID, Calendar joinDate) {
        super(name, ID);
        this.joinDate = joinDate;
    }

    /**
     * Returns the join date of the regular user.
     *
     * @return the join date of the regular user
     */
    public Calendar getJoinDate() {
        return joinDate;
    }

    /**
     * Returns the type of the user.
     *
     * @return the type of the user ("Regular")
     */
    @Override
    public String getUserType() {
        return "Regular";
    }
}
