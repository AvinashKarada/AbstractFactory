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
class USAVehicalFactory 
{ 
    //Here abstract factory for UK and  will create the object without specify the class
           //Factory class give the object as per facory patten
	 
    public static Vehical buildVehical(VehicalType vt) 
    { 
        
        Vehical Vehical = null; 
        switch (vt) 
        { 
            case MICRO: 
                Vehical = new MicroVehical(Loc.USA); 
                break; 
              //Here we get MICRO vehicle
            case MINI: 
                Vehical = new MiniType(Loc.USA); 
                break; 
                //Here we get MINI vehicle  
            case LUXURY: 
                Vehical = new LuxuryVehical(Loc.USA); 
                break; 
                //Here we get LUXURY vehicle  
                default: 
                break; 
              
        } 
        return Vehical; 
    } 
} 
  
  
