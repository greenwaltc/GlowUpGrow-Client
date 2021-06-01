package android.bignerdranch.glowupgrow_client.Proxy;

import java.lang.reflect.Field;

public class RegisterRequest {
    private String username;
    private String password;
    private String email;

    public RegisterRequest() {}

    public RegisterRequest(String username, String password, String email) {
        setUsername(username);
        setPassword(password);
        setEmail(email);
    }

    /**
     * Checks if any of the class variables have a null value
     */
    public boolean anyNull() {
        for (Field f : getClass().getDeclaredFields()) {
            try {
                if (f.get(this) == null) {
                    return true;
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     * Checks if any of the class variables are an empty string
     */
    public boolean anyEmpty() {
        for (Field f : getClass().getDeclaredFields()) {
            try {
                if (f.get(this).equals("")) {
                    return true;
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
