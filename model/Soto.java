package model;

public class Soto implements Menu {
    private double quantity;

    public Soto(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public double totalPrice() {
        return quantity * 12000;
    }
}
