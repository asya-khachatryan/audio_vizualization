package model;

public class Configuration {
    enum Resolution {
        HD(1), FHD(2), _4K(4);

        private int coefficient;

        Resolution(int coefficient) {
            this.coefficient = coefficient;
        }

        public int getCoefficient() {
            return coefficient;
        }
    }

    private Resolution resolution;


    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

}
