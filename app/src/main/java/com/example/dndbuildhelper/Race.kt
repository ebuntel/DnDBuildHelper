package com.example.dndbuildhelper

abstract class Race
{
    open val sName : String = ""        //The race's name
    open val iSTRChange : Int = 0       //The race's STR mod
    open val iDEXChange : Int = 0       //The race's DEX mod
    open val iCONChange : Int = 0       //The race's CON mod
    open val iINTChange : Int = 0       //The race's INT mod
    open val iCHAChange : Int = 0       //The race's CHA mod
    open val iWISChange : Int = 0       //The race's WIS mod
    open val sAge : String = ""         //The race's age
    open val sAlignment : String = ""   //The race's alignment
    open val sSpeed : String = ""       //The race's speed
    open val sSize : String = ""        //The race's size
    open val sAbilities : String = ""   //The race's abilities
    open val sLanguages : String = ""   //The race's languages
    open val sSource : String = ""      //The race's sourcebook
}