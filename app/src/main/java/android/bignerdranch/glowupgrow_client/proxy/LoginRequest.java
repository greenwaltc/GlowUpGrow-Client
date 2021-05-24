package android.bignerdranch.glowupgrow_client.proxy;

import java.lang.reflect.Field;

public class LoginRequest {
    private String username;
    private String password;

    public LoginRequest() {}

    public LoginRequest(String username, String password) {
        setUsername(username);
        setPassword(password);
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
}
