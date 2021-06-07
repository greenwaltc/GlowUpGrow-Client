package android.bignerdranch.glowupgrow_client.Data.model;

public class TerrariumModel {
    private Integer modelID;
    private Double spaceAvailable;

    public TerrariumModel(Integer modelID, Double spaceAvailable) {
        this.modelID = modelID;
        this.spaceAvailable = spaceAvailable;
    }

    public Integer getModelID() {
        return modelID;
    }

    public Double getSpaceAvailable() {
        return spaceAvailable;
    }
}
