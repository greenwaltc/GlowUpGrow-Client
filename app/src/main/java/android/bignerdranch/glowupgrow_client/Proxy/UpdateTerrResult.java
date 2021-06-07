package android.bignerdranch.glowupgrow_client.Proxy;

import android.bignerdranch.glowupgrow_client.Data.model.Plant;

public class UpdateTerrResult {
    private Plant plant;
    private String message;
    private boolean success;

    // success response body
    public UpdateTerrResult(Plant plant, boolean success) {
        this.plant = plant;
        this.success = success;
    }

    // failure response body
    public UpdateTerrResult(String message, boolean success) {
        this.message = message;
        this.success = success;
    }

    public Plant getPlant() {
        return plant;
    }

    public String getMessage() {
        return message;
    }

    public boolean isSuccess() {
        return success;
    }
}
