package models;


public class Sneaker {

    private int id;
    private String name;
    private String brand;
    private String sport;
    private int size;
    private int qty;
    private float price;


    public Sneaker(int newId, String newName, String newBrand, String newSport, int newQty, float newPrice) {
        id = newId;
        name = newName;
        brand = newBrand;
        sport = newSport;
        qty = newQty;
        price = newPrice;
    }



    public void setName(String name) {
        this.name = name;
    }

    public String getName(Sneaker inputShoe) {
        return inputShoe.name;
    }

    public static int getId(Sneaker inputShoe) {
        return inputShoe.id;
    }
    public String getBrand(Sneaker inputShoe) {
        return inputShoe.brand;
    }

    public String getSport(Sneaker inputShoe) {
        return inputShoe.sport;
    }

    public int getQty(Sneaker inputShoe) {
        return inputShoe.qty;
    }

    public float getPrice(Sneaker inputShoe){
        return inputShoe.price;

    }
}
