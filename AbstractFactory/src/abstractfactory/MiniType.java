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
class MiniType extends Vehical 
{ 
     //This class will construt mini vehicle
    MiniType(Loc loc) 
    { 
        super(VehicalType.MINI,loc ); 
        construct(); 
    } 
      
    @Override
    void construct() 
    { 
        System.out.println("Link to Mini Vehical "); 
    } 
} 
  