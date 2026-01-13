package builder;

public class House {
    private final int walls;
    private final boolean hasRoof;
    private final boolean hasGarage;
    private final boolean hasGarden;
    private final boolean hasSwimmingPool;

    private House(Builder builder) {
        this.walls = builder.walls;
        this.hasRoof = builder.hasRoof;
        this.hasGarage = builder.hasGarage;
        this.hasGarden = builder.hasGarden;
        this.hasSwimmingPool = builder.hasSwimmingPool;
    }

    @Override
    public String toString() {
        return "House{" + "walls=" + walls + ", hasRoof=" + hasRoof + ", hasGarage=" + hasGarage + ", hasGarden=" + hasGarden + ", hasSwimmingPool=" + hasSwimmingPool + '}';
    }

    //Builder
    public static class Builder {
        private int walls;
        private boolean hasRoof;
        private boolean hasGarage;
        private boolean hasGarden;
        private boolean hasSwimmingPool;

        public Builder walls(int walls) {
            this.walls = walls;
            return this;
        }

        public Builder roof(boolean hasRoof) {
            this.hasRoof = hasRoof;
            return this;
        }

        public Builder garage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public Builder garden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public Builder swimmingPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}
