import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.Product;
import util.PriceUpdate;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        List<Product> productsList = new ArrayList<>();

        productsList.add(new Product("Tv", 900.00));
        productsList.add(new Product("Mouse", 50.00));
        productsList.add(new Product("Tablet", 350.00));
        productsList.add(new Product("Hd Case", 80.90));

        productsList.forEach(System.out::println);

        productsList.forEach(Product::StaticPriceUpdate);

        System.out.println("--------------------");

        for (Product product : productsList) {
            System.out.println(product);
        }
    }
}
