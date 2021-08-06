import java.util.Date;

public class Player {

    private String firstname;
    private String lastname;
    private long identityNo;
    private Date dateOfBirth;

    public Player(String firstname, String lastname, long identityNo, Date dateOfBirth) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.identityNo = identityNo;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public long getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(long identityNo) {
        this.identityNo = identityNo;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
