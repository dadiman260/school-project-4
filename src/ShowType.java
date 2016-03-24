import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ShowType {

    private String Type;
    private int left;

    public ShowType(String newType, int newleft) {
        left = newleft;
        Type = newType;
    }

    public int getAmountLeft()
    {
        return this.left;
    }

    public void pay( double amount )
    {
        this.left -= amount;
    }
    public void reset( )
    {
        left = 300;
    }
    public String getType()
    {
        return this.Type;
    }
    
}
    
   

