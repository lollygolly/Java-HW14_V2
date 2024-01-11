package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShopRepositoryTest {

    Product product1 = new Product(1, "хлеб", 75);
    Product product2 = new Product(2, "колбаса", 219);
    Product product3 = new Product(3, "сыр", 195);

    @Test
    public void shouldRemoveProduct() {
        ShopRepository repo = new ShopRepository();
        repo.add(product1);
        repo.add(product2);
        repo.add(product3);
        repo.remove(2);

        Product[] expected = {product1, product3};
        Product[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNotRemoveProduct() {
        ShopRepository repo = new ShopRepository();
        repo.add(product1);
        repo.add(product2);
        repo.add(product3);

        Assertions.assertThrows(RuntimeException.class, () -> {
            repo.remove(55);
        });
    }
}
