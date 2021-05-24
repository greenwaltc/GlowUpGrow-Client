package android.bignerdranch.glowupgrow_client.proxy;

public class LoginResult {
    private String authToken;
    private String username;
    private String userID;
    private String errorMessage;
    private boolean success;

    // success response object
    public LoginResult(String authToken, String username, String userID, boolean success) {
        this.authToken = authToken;
        this.username = username;
        this.userID = userID;
        this.success = success;
    }

    // failure response object
    public LoginResult(String errorMessage, boolean success) {
        this.errorMessage = errorMessage;
        this.success = success;
    }

    public String getAuthToken() {
        return authToken;
    }

    public String getUsername() {
        return username;
    }

    public String getUserID() {
        return userID;
    }

    public String getMessage() {
        return errorMessage;
    }

    public boolean isSuccess() {
        return success;
    }
}