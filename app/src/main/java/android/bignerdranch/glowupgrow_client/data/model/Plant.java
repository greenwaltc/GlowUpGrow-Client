package android.bignerdranch.glowupgrow_client.data.model;

public class Plant {
    private Integer plantID;
    private String name;
    private Double temperature;
    private Double soilMoisture;
    private Double humidity;
    private Double lightLevel;
    private Integer growthTimeDays;
    private Double spaceReq;

    public Plant(Integer plantID, String name, Double temperature, Double soilMoisture,
                 Double humidity, Double lightLevel, Integer growthTimeDays, Double spaceReq) {
        this.plantID = plantID;
        this.name = name;
        this.temperature = temperature;
        this.soilMoisture = soilMoisture;
        this.humidity = humidity;
        this.lightLevel = lightLevel;
        this.growthTimeDays = growthTimeDays;
        this.spaceReq = spaceReq;
    }

    public Integer getPlantID() {
        return plantID;
    }

    public String getName() {
        return name;
    }

    public Double getTemp() {
        return temperature;
    }

    public Double getSoilMoisture() {
        return soilMoisture;
    }

    public Double getHumidity() { return humidity; }

    public Double getLightLevel() {
        return lightLevel;
    }

    public Integer getGrowthTimeDays() {
        return growthTimeDays;
    }

    public Double getSpaceReq() { return spaceReq; }
}
