package android.bignerdranch.glowupgrow_client.data.model;

public class User {
    private Integer UserID;
    private String Username;
    private byte[] Password;
    private String EmailAddress;
    private byte[] Salt;

    public User(Integer userID, String username, byte[] password, String emailAddress, byte[] salt) {
        UserID = userID;
        Username = username;
        Password = password;
        EmailAddress = emailAddress;
        Salt = salt;
    }

    public Integer getUserID() {
        return UserID;
    }

    public void setUserID(Integer userID) {
        UserID = userID;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public byte[] getPassword() {
        return Password;
    }

    public void setPassword(byte[] password) {
        Password = password;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
    }

    public byte[] getSalt() {
        return Salt;
    }

    public void setSalt(byte[] salt) {
        Salt = salt;
    }
}