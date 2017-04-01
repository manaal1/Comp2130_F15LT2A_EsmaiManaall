
/**
 * 
 * @author Manaal Esmail
 */
public class esmail_TestTableFan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        esmail_TableFan fan_1 = new esmail_TableFan();
        esmail_TableFan fan_2 = new esmail_TableFan();
        esmail_TableFan fan_3 = new esmail_TableFan();
        
        System.out.println("Fan 1 Purchased on: " + fan_1.getDateOfPurchased());
        System.out.println("Fan 2 Purchased on: " + fan_2.getDateOfPurchased());
        System.out.println("FAn 3 Purchased on: " + fan_3.getDateOfPurchased());
        
        System.out.println();
        fan_1.setSpeed(300);
        fan_1.setBrand("USHA");
        fan_1.setColor("Black");
        fan_1.setIsOn(true);
        fan_1.setRadius(30);
        
        fan_2.setSpeed(300);
        fan_2.setBrand("SONY");
        fan_2.setColor("Pink");
        fan_2.setIsOn(false);
        fan_2.setRadius(20);
        
        fan_3.setSpeed(100);
        fan_3.setBrand("KHAITAN");
        fan_3.setColor("Green");
        fan_3.setIsOn(false);
        fan_3.setRadius(40);
        
        fan_1.display();
        fan_2.display();
        fan_3.display();
        
    }
    
}
