package android.bignerdranch.glowupgrow_client.proxy;

import java.lang.reflect.Field;

public class UpdateTerrRequest {
    private int terrariumID;
    private int plantID;

    public UpdateTerrRequest() {}

    public UpdateTerrRequest(int terrariumID, int plantID) {
        setTerrariumID(terrariumID);
        setPlantID(plantID);
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

    public int getTerrariumID() {
        return terrariumID;
    }

    public void setTerrariumID(int terrariumID) {
        this.terrariumID = terrariumID;
    }

    public int getPlantID() {
        return plantID;
    }

    public void setPlantID(int plantID) {
        this.plantID = plantID;
    }
}
