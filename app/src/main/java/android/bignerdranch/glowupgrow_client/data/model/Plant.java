package android.bignerdranch.glowupgrow_client.data.model;

public class Plant {
    private int plantID;
    private String name;
    private int temp;
    private int soilMoisture;
    private int humidity;
    private int lightLevel;
    private int growthTimeDays;
    private int spaceReq;

    public Plant(int plantID, String name, int temp, int soilMoisture, int humidity,
                 int lightLevel, int growthTimeDays, int spaceReq) {
        this.plantID = plantID;
        this.name = name;
        this.temp = temp;
        this.soilMoisture = soilMoisture;
        this.humidity = humidity;
        this.lightLevel = lightLevel;
        this.growthTimeDays = growthTimeDays;
        this.spaceReq = spaceReq;
    }

    public int getPlantID() {
        return plantID;
    }

    public String getName() {
        return name;
    }

    public int getTemp() {
        return temp;
    }

    public int getSoilMoisture() {
        return soilMoisture;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getLightLevel() {
        return lightLevel;
    }

    public int getGrowthTimeDays() {
        return growthTimeDays;
    }

    public int getSpaceReq() {
        return spaceReq;
    }
}
