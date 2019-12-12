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
class MicroVehical extends Vehical 
{ 
    //This class will construt micro vehicle
    MicroVehical(Loc loc) 
    { 
        super(VehicalType.MICRO, loc); 
        construct(); 
    } 
    @Override
    protected void construct() 
    { 
        System.out.println("Link to Vehical Micro"); 
    } 
} 