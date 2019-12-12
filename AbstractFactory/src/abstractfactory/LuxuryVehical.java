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
class LuxuryVehical extends Vehical 
{ 
     //This class will construt Luxury vehicle
    LuxuryVehical(Loc loc) 
    { 
        super(VehicalType.LUXURY, loc); 
        construct(); 
    } 
    @Override
    protected void construct() 
    { 
        System.out.println("Link to Vehical luxury"); 
    } 
} 