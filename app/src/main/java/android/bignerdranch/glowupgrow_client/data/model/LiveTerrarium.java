package android.bignerdranch.glowupgrow_client.data.model;

public class LiveTerrarium {
    private Integer terrariumID;
    private Integer userID;
    private Integer modelID;
    private Integer plantID;
    private Double temperature;
    private Double soilMoisture;
    private Double humidity;
    private Double lightLevel;
    private Integer daysGrown;

    public LiveTerrarium(Integer terrariumID, Integer userID, Integer modelID, Integer plantID, Double temperature,
                         Double soilMoisture, Double humidity, Double lightLevel, Integer daysGrown) {
        this.terrariumID = terrariumID;
        this.userID = userID;
        this.modelID = modelID;
        this.plantID = plantID;
        this.temperature = temperature;
        this.soilMoisture = soilMoisture;
        this.humidity = humidity;
        this.lightLevel = lightLevel;
        this.daysGrown = daysGrown;
    }

    public Integer getTerrariumID() {
        return terrariumID;
    }

    public Integer getUserID() {
        return userID;
    }

    public Integer getModelID() {
        return modelID;
    }

    public Integer getPlantID() {
        return plantID;
    }

    public void setPlantID(Integer plantID) {
        this.plantID = plantID;
    }

    public Double getTemp() {
        return temperature;
    }

    public void setTemp(Double temp) {
        this.temperature = temp;
    }

    public Double getSoilMoisture() {
        return soilMoisture;
    }

    public void setSoilMoisture(Double soilMoisture) {
        this.soilMoisture = soilMoisture;
    }

    public Double getHumidity() {
        return humidity;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    public Double getLightLevel() {
        return lightLevel;
    }

    public void setLightLevel(Double lightLevel) {
        this.lightLevel = lightLevel;
    }

    public Integer getDaysGrown() {
        return daysGrown;
    }

    public void setDaysGrown(Integer daysGrown) {
        this.daysGrown = daysGrown;
    }
}
