package android.bignerdranch.glowupgrow_client.proxy;

import java.lang.reflect.Field;

public class GetTerrRequest {
    private String authToken;
    private int terrariumID;

    public GetTerrRequest() {}

    public GetTerrRequest(String authToken, int terrariumID) {
        setAuthToken(authToken);
        setTerrariumID(terrariumID);
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

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public int getTerrariumID() {
        return terrariumID;
    }

    public void setTerrariumID(int terrariumID) {
        this.terrariumID = terrariumID;
    }
}
