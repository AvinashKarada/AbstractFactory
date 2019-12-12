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

//Define the type of vehicle
enum VehicalType 
{ 
    LUXURY,MINI,MICRO,   
} 
  
abstract class Vehical //Here we create the abstract lass
{ 
    Vehical(VehicalType vt, Loc loc) 
    { 
        this.vt = vt; 
        this.loc = loc; 
    } 
   
    abstract void construct(); 
   
    VehicalType vt = null; 
    Loc loc = null; 
   
    VehicalType getvt() //get the type of vehicle
    { 
        return vt; 
    } 
   
    void setvt(VehicalType vt) //Store the type of vehicle
    { 
        this.vt = vt; 
    } 
   
    Loc getloc() 
    { 
        return loc; 
    } 
   
    void setloc(Loc loc) 
    { 
        this.loc = loc; 
    } 
   
    @Override
    public String toString() //Display the result
    { 
        return "Vehicalvt - "+vt + " located in "+loc; 
    } 
} 
  