package coralcorp.Model;

public class User {

    private String username;
    private String pswdHash;
    private String mail;
    private String activeCharacter;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPswdHash() {
        return pswdHash;
    }

    public void setPswdHash(String pswdHash) {
        this.pswdHash = pswdHash;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getActiveCharacter() {
        return activeCharacter;
    }

    public void setActiveCharacter(String activeCharacter) {
        this.activeCharacter = activeCharacter;
    }
}
