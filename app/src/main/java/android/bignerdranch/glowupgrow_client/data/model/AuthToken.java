package android.bignerdranch.glowupgrow_client.Data.model;

public class AuthToken {
    private Integer UserID;
    private String AuthToken;

    /**
     * Creates an authorization token model object
     * @param userID The ID of the user that the auth token belongs to
     * @param authToken The unique authorization string generated when registering/logging in
     */
    public AuthToken(Integer userID, String authToken) {
        UserID = userID;
        AuthToken = authToken;
    }

    public Integer getUserID() {
        return UserID;
    }

    public void setUserID(Integer userID) {
        UserID = userID;
    }

    public String getAuthToken() {
        return AuthToken;
    }

    public void setAuthToken(String authToken) {
        AuthToken = authToken;
    }
}