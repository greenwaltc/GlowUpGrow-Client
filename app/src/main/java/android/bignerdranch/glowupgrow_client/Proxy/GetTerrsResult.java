package android.bignerdranch.glowupgrow_client.Proxy;

import android.bignerdranch.glowupgrow_client.data.model.LiveTerrarium;

import java.util.ArrayList;

public class GetTerrsResult {
    private ArrayList<LiveTerrarium> terrariums;
    private String message;
    private boolean success;

    // success response body
    public GetTerrsResult(ArrayList<LiveTerrarium> terrariums, boolean success) {
        this.terrariums = terrariums;
        this.success = success;
    }

    // failure response body
    public GetTerrsResult(String message, boolean success) {
        this.message = message;
        this.success = success;
    }

    public ArrayList<LiveTerrarium> getTerrariums() {
        return terrariums;
    }

    public String getMessage() {
        return message;
    }

    public boolean isSuccess() {
        return success;
    }
}
