package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SneakerTest {



    @Test // (1)
    public void constructorTest(){

        // (2)
        int expectedId = 6;
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedSport = "Tennnis";
        int expectedQty = 10;
        float expectedPrice = 80.00f;

        // (3)
        Sneaker testSneaker = new Sneaker(expectedId, expectedName, expectedBrand,
                expectedSport, expectedQty,expectedPrice);

        // (4)
        Assertions.assertEquals(expectedId, testSneaker.getId(testSneaker));
        Assertions.assertEquals(expectedName, testSneaker.getName(testSneaker));
        Assertions.assertEquals(expectedBrand, testSneaker.getBrand(testSneaker));
        Assertions.assertEquals(expectedSport, testSneaker.getSport(testSneaker));
        Assertions.assertEquals(expectedQty, testSneaker.getQty(testSneaker));
        Assertions.assertEquals(expectedPrice, testSneaker.getPrice(testSneaker));
    }

}
