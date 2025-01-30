package collectionsHashSet;

public class Product {

    private String product;
    private String brand;
    private double cost;


    public Product(String product, String brand, double cost) {
        this.product = product;
        this.brand = brand;
        this.cost = cost;
    }
    

    @Override
    public int hashCode() {
        return brand.hashCode();
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        if (product == null) {
            if (other.product != null)
                return false;
        } else if (!product.equals(other.product))
            return false;
        if (brand == null) {
            if (other.brand != null)
                return false;
        } else if (!brand.equals(other.brand))
            return false;
        if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
            return false;
        return true;
    }


    @Override
    public String toString() {
        return "Product [product=" + product + ", brand=" + brand + ", cost=" + cost + "]";
    }

    
    
}
