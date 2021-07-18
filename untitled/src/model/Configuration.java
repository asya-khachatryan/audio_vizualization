package model;

public class Configuration {
    enum Resolution {HD, FHD, _4K}

    private Resolution resolution;


    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    public int getResolutionCoefficient() {
        if (resolution.equals(Resolution.HD)) {
            return 1;
        } else if (resolution.equals(Resolution.FHD)) {
            return 2;
        } else {
            return 4;
        }
    }
}
