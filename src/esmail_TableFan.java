
import java.util.Date;

/**
 *
 * @author Manaal Esmail
 */
public class esmail_TableFan {

    private final int SLOW = 100;
    private final int MEDIUM = 200;
    private final int FAST = 300;

    private int speed;
    private Date dateOfPurchased;
    private String brand;
    private boolean isOn;
    private double radius;
    private String color;

    public esmail_TableFan() {
        radius = 10;
        speed = FAST;
        color = "White";
        isOn = true;
        dateOfPurchased = new Date();
    }

    public int getSpeed() {
        return speed;
    }

    public Date getDateOfPurchased() {
        return dateOfPurchased;
    }

    public String getBrand() {
        return brand;
    }

    public boolean isIsOn() {
        return isOn;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setDateOfPurchased(Date dateOfPurchased) {
        this.dateOfPurchased = dateOfPurchased;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void display() {
        System.out.println("Purchased: \t" + dateOfPurchased);
        System.out.println("Brand: \t\t" + brand);
        
        System.out.println("Speed: \t\t" + speed);
        System.out.println("Is On: \t\t" + isOn);
        System.out.println("Radius: \t" + radius);
        System.out.println("Color: \t\t" + color);
        
        System.out.println();
    }
}
