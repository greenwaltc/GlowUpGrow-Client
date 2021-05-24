package android.bignerdranch.glowupgrow_client.data.model;

public class LiveTerrarium {
    private int terrariumID;
    private int userID;
    private int modelID;
    private int plantID;
    private int temp;
    private int soilMoisture;
    private int humidity;
    private int lightLevel;
    private int daysGrown;

    public LiveTerrarium(int terrariumID, int userID, int modelID, int plantID, int temp,
                         int soilMoisture, int humidity, int lightLevel, int daysGrown) {
        this.terrariumID = terrariumID;
        this.userID = userID;
        this.modelID = modelID;
        this.plantID = plantID;
        this.temp = temp;
        this.soilMoisture = soilMoisture;
        this.humidity = humidity;
        this.lightLevel = lightLevel;
        this.daysGrown = daysGrown;
    }

    public int getTerrariumID() {
        return terrariumID;
    }

    public int getUserID() {
        return userID;
    }

    public int getModelID() {
        return modelID;
    }

    public int getPlantID() {
        return plantID;
    }

    public void setPlantID(int plantID) {
        this.plantID = plantID;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getSoilMoisture() {
        return soilMoisture;
    }

    public void setSoilMoisture(int soilMoisture) {
        this.soilMoisture = soilMoisture;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getLightLevel() {
        return lightLevel;
    }

    public void setLightLevel(int lightLevel) {
        this.lightLevel = lightLevel;
    }

    public int getDaysGrown() {
        return daysGrown;
    }

    public void setDaysGrown(int daysGrown) {
        this.daysGrown = daysGrown;
    }
}
