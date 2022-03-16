
package SecurityGonago;

public class User {
    protected String Name ;
    protected String LastName;
    protected String Email;
    protected String ID;
    protected String UserType;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
       this.Name=Name.toUpperCase();
        this.Name = Name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName=LastName.toUpperCase();
        this.LastName = LastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email=Email.toLowerCase();
        this.Email = Email;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
       
        this.ID = ID;
    }

    public String getUserType() {
        return UserType;
    }

    public void setUserType(String UserType) {
        this.UserType=UserType.toUpperCase();
        this.UserType = UserType;
    }

    public int getTelephone() {
        return Telephone;
    }

    public void setTelephone(int Telephone) {
        this.Telephone = Telephone;
    }
   
   
         
   
}
