package com.example.dndbuildhelper

abstract class Gnome : Race()
{
    override val iINTChange: Int = 2
}

data class DeepGnome(override val iDEXChange: Int = 1) : Gnome()
{

}

data class MarkOfScribingGnome(override val iCHAChange: Int = 1) : Gnome()
{

}

data class RockGnome(override val iCONChange: Int = 1) : Gnome()
{

}