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
enum Loc 
{ 
  DEFAULT, USA, UK 
} 
  
class UKVehicalFactory //This class create the factory for UK vehicle
{ 
    static Vehical buildVehical(VehicalType vt) 
    { 
        Vehical Vehical = null; 
        switch (vt) 
        { 
           //Here abstract UK factory will create the object without specify the class
           //Factory class give the object as per facory patten
	       case LUXURY: 
                Vehical = new LuxuryVehical(Loc.UK); 
                break; 
            //Here we get LUXURY vehicle
              
            case MINI: 
                Vehical = new MiniType(Loc.UK); 
                break; 
                 //Here we get MINI vehicle
            case MICRO: 
                Vehical = new MicroVehical(Loc.UK); 
                break; 
                  //Here we get MICRO vehicle
                default: 
                break; 
              
        } 
        return Vehical; 
    } 
} 