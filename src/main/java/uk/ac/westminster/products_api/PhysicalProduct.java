package uk.ac.westminster.products_api;

// A PhysicalProduct IS-A Product because it can be used anywhere a Product is expected: it has an id, a name and a price and is sold in the shop.
// A ShoppingCart would NOT pass the IS-A test because a cart is not a product; it HAS products (a HAS-A relationship).
public class PhysicalProduct extends Product {

    private double weightKg;
    private String dimensions;

    public PhysicalProduct() {
    }

    public PhysicalProduct(Long id, String name, double price,
                           double weightKg, String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }
}