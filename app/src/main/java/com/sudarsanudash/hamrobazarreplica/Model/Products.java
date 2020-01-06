package com.sudarsanudash.hamrobazarreplica.Model;

public class Products {

    private String name;
    private String price;
    private int imageId;
    private String used;

    public Products(String name, String price, int imageId, String used) {
        this.name = name;
        this.price = price;
        this.imageId = imageId;
        this.used = used;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getUsed() {
        return used;
    }

    public void setUsed(String used) {
        this.used = used;
    }
}
