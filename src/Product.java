public class Product implements Comparable<Product> {
    private String description;
    private double value;

    public Product(String description, double value) {
        this.description = description;
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Product: description " + description +  ", value=" + value;
    }

    @Override
    public int compareTo(Product anotherProduct) {
        return Double.valueOf(this.value).compareTo(Double.valueOf(anotherProduct.value));
    }
}
