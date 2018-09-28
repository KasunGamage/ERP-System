
package janitha;

import java.util.Calendar;


public class ValidMethods {
    
    public ValidMethods()
    {
        
    }
    
    public boolean textOnlyValidation1(String val)
    {
        boolean valid = true;
        
        if(val.matches("[a-zA-Z]+"))
            valid = true;
        else
            valid = false;
                
        return valid;
    }
    
    public boolean textOnlyValidation2(String val)
    {
    
        boolean valid = true;
        
        if(val.matches("^[[a-zA-Z]+\\s?]+$"))
            valid = true;
        else
            valid = false;
                
        return valid;
    }
    
    public boolean addressValidation(String val)
    {
        boolean valid = true;
        
        if(val.matches("^[a-zA-Z]*(0-9|.|s)*[a-zA-Z]*$"))
            valid = true;
        else
            valid = false;
                
        return valid;
    }
    
    public boolean phoneValidation(String val)
    {
        boolean valid = true;
        
        if(val.matches("^[\\+?((?:[0-9]?){1,}[0-9])?|0\\d{9}]+$"))
            valid = true;
        else
            valid = false;
                
        return valid;
    }
    
    public boolean emailValidation(String val)
    {
        boolean valid = true;
        
        if(val.matches("^[[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]]*$"))
            valid = true;
        else
            valid = false;
                
        return valid;
    }
    
   
}
