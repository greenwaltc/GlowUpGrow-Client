package android.bignerdranch.glowupgrow_client.proxy;

import android.bignerdranch.glowupgrow_client.data.model.LiveTerrarium;

public class GetTerrResult {
    private LiveTerrarium terrarium;
    private String message;
    private boolean success;

    // success response body
    public GetTerrResult(LiveTerrarium terrarium, boolean success) {
        this.terrarium = terrarium;
        this.success = success;
    }

    // failure response body
    public GetTerrResult(String message, boolean success) {
        this.message = message;
        this.success = success;
    }

    public LiveTerrarium getTerrarium() {
        return terrarium;
    }

    public String getMessage() {
        return message;
    }

    public boolean isSuccess() {
        return success;
    }
}