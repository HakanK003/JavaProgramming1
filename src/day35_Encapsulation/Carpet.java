package day35_Encapsulation;

public class Carpet {

    private double width, length, unitPrice;
    private boolean isPersian;

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        if (width>0) setWidth(width); else System.err.println("Invalid entry");
        if(length>0)setLength(length); else System.err.println("Invalid entry");
        setPersian(isPersian);
        if(unitPrice>0)setUnitPrice(unitPrice); else System.err.println("Invalid entry");
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public boolean isPersian() {
        return isPersian;
    }

    public void setWidth(double width) {
        if(width>0) this.width = width; else System.err.println("Invalid entry");
    }

    public void setLength(double length) {
        if(length>0) this.length = length; else System.err.println("Invalid entry");
    }

    public void setUnitPrice(double unitPrice) {
        if(unitPrice>0) this.unitPrice = unitPrice; else System.err.println("Invalid entry");
    }

    public void setPersian(boolean persian) {
        isPersian = persian;
    }

    public double calcCost(){
        if (width==0||length==0||unitPrice==0)return 0;
        return (width*length)*unitPrice + ((isPersian)?200:0);
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", cost= $" + calcCost() +
                '}';
    }
}

/*
Carpet Task
		3.1create a class named Carpet:
                private variables:
                        width, length, unitPrice, isPersian (boolean)

                Encapsulate all the fields:
                		Conditions:
                			width can not be negative
                			width can not be negative
                			unit price can not be negative

		Add a constructor to set all the instances
                instance methods:
                        calcCost(): should be able to calculate the total cost of the carpet and return it as double
                        toString(): should be able to display all the info of the carpet
                        including the total cost of the carpet as calculated by calcCost()
            total price of carpet = (width*length)*unitPrice
            if the carpet is persian  carpet, add 200$ to the totalPrice
 */