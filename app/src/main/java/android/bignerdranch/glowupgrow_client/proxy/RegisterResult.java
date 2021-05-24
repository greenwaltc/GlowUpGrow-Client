package android.bignerdranch.glowupgrow_client.proxy;

public class RegisterResult {
    private String authToken;
    private String username;
    private String message;
    private boolean success;

    // success response object
    public RegisterResult(String authToken, String username, boolean success) {
        this.authToken = authToken;
        this.username = username;
        this.success = success;
    }

    // failure response object
    public RegisterResult(String message, boolean success) {
        this.message = message;
        this.success = success;
    }

    public String getAuthToken() {
        return authToken;
    }

    public String getUsername() {
        return username;
    }

    public String getMessage() {
        return message;
    }

    public boolean isSuccess() {
        return success;
    }
}
