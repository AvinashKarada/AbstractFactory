/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author 
 */
class VehicalFactory 
{ 
    //This class is common to build the vehical without explitely speciy their class
    private VehicalFactory()  
    { 
          
    } 
    public static Vehical buildVehical(VehicalType vt) 
    { 
        Vehical Vehical = null; 
        
        switch (vt) 
        { 
            case MICRO: 
                Vehical = new MicroVehical(Loc.DEFAULT); 
                break; 
            case LUXURY: 
                Vehical = new LuxuryVehical(Loc.DEFAULT); 
                break; 
            case MINI: 
                Vehical = new MiniType(Loc.DEFAULT); 
                break; 
                  
            
                  
                default: 
                break; 
              
        } 
        return Vehical; 
  
    } 
} 
  
