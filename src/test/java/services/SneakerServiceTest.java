package services;
import models.Sneaker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SneakerServiceTest {
    @Test
    public void createTest(){

        // (1)
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedSport = "Tennis";

        int expectedQty = 10;
        float expectedPrice = 80.00f;

        // (2)
        SneakerService sneakerService = new SneakerService();
        Sneaker testSneaker = SneakerService.create(expectedName, expectedBrand,
                expectedSport,  expectedQty, expectedPrice);

        // (3)
        int actualId = testSneaker.getId(testSneaker);
        String actualName = testSneaker.getName(testSneaker);
        String actualBrand = testSneaker.getBrand(testSneaker);
        String actualSport = testSneaker.getSport(testSneaker);
        int actualQty = testSneaker.getQty(testSneaker);
        float actualPrice = testSneaker.getPrice(testSneaker);

        // (4)
        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedSport, actualSport);

        Assertions.assertEquals(expectedQty, actualQty);
        Assertions.assertEquals(expectedPrice, actualPrice);

    }
}
