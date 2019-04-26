package com.example.dndbuildhelper

abstract class Dwarf : Race()
{
    override val sAge : String = "Dwarves mature at the same rate as humans, but they’re considered young until they " +
            "reach the age of 50. On average, they live about 350 years."
    override val sLanguages : String = "You can speak, read, and write Common and Dwarvish. Dwarvish is full of hard " +
            "consonants and guttural sounds, and those characteristics spill over into whatever other " +
            "language a dwarf might speak."
    override val sAlignment : String = "Most dwarves are lawful, believing firmly in the benefits of " +
            "a well-ordered society. They tend toward good as well, with a strong sense of fair play and " +
            "a belief that everyone deserves to share in the benefits of a just order."
    override val sSize : String = "Dwarves stand between 4 and 5 feet tall and average about 150 pounds. Your " +
            "size is Medium."
    override val sSpeed : String = "Your base walking speed is 25 feet. Your speed is not reduced by wearing " +
            "heavy armor."
    override val sAbilities: String = "Darkvision\n" +
            "Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in " +
            "dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. " +
            "You can’t discern color in darkness, only shades of gray.\n" +
            "Dwarven Resilience\n" +
            "You have advantage on saving throws against poison, and you have resistance against poison damage.\n" +
            "Dwarven Combat Training\n" +
            "You have proficiency with the battleaxe, handaxe, light hammer, and warhammer.\n" +
            "Tool Proficiency\n" +
            "You gain proficiency with the artisan’s tools of your choice: smith’s tools, brewer’s supplies," +
            " or mason’s tools.\n" +
            "Stonecunning\n" +
            "Whenever you make an Intelligence (History) check related to the origin of stonework, you are " +
            "considered proficient in the History skill and add double your proficiency bonus to the check, " +
            "instead of your normal proficiency bonus.\n"
    override val iCONChange: Int = 2
}

data class HillDwarf(override val sName : String = "Hill dwarf",
                     override val iWISChange: Int = 1) : Dwarf()
{
    override val sAbilities : String = super.sAbilities + "Dwarven Toughness\n" +
            "Your hit point maximum increases by 1, and it increases by 1 every time you gain a level."
}

data class MountainDwarf(override val sName : String = "Mountain Dwarf",
                         override val iSTRChange : Int = 2) : Dwarf()
{
    override val sAbilities: String = super.sAbilities + "Dwarven Armor Training\n" +
            "You have proficiency with light and medium armor."
}

data class HouseKundarakDwarf(override val sName: String = "House Kundarak Dwarf",
                              override val iDEXChange: Int = 1,
                              override val iINTChange : Int = 1) : Dwarf()
{
    override val sAbilities: String = super.sAbilities + "Master of Locks\n" +
            "When you make an Intelligence (History), Intelligence (Investigation), or Thieves’ Tools " +
            "check involving lock and trap mechanisms, you can roll one Intuition die, a d4, and add the number " +
            "rolled to the ability check.\n" +
            "Wards and Seals\n" +
            "You can use your mark to cast the alarm spell as a ritual. Starting at 3rd level you can cast arcane " +
            "lock once with this trait and you regain the ability to do so when you finish a long rest. Intelligence " +
            "is your spellcasting ability for these spells."
}