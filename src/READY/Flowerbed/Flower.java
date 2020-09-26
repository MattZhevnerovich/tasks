package READY.Flowerbed;

public class Flower {
    double price;
    boolean freshness;
    double stemLength;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isFreshness() {
        return freshness;
    }

    public void setFreshness(boolean freshness) {
        this.freshness = freshness;
    }

    public double getStemLength() {
        return stemLength;
    }

    public void setStemLength(double stemLength) {
        this.stemLength = stemLength;
    }

    public Flower(double price, boolean freshness, double stemLength) {
        this.price = price;
        this.freshness = freshness;
        this.stemLength = stemLength;
    }


    @Override
    public String toString() {
        return "Flower{" +
                "price=" + price +
                ", freshness=" + freshness +
                ", stemLength=" + stemLength +
                '}';
    }
}
