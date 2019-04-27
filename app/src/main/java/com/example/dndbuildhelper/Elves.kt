package com.example.dndbuildhelper

abstract class Elf : Race()
{
    override val sAge: String = "Although elves reach physical maturity at about the same age as humans, " +
            "the elven understanding of adulthood goes beyond physical growth to encompass worldly experience. " +
            "An elf typically claims adulthood and an adult name around the age of 100 and can live to be " +
            "750 years old."
    override val sAlignment: String = "Elves love freedom, variety, and self-expression, so they lean strongly " +
            "toward the gentler aspects of chaos. They value and protect others’ freedom as well as their own, " +
            "and they are more often good than not. The drow are an exception; their exile into the Underdark has " +
            "made them vicious and dangerous. Drow are more often evil than not."
    override val sSize: String = "Elves range from under 5 to over 6 feet tall and have slender builds. " +
            "Your size is Medium."
    override val sSpeed: String = "Your base walking speed is 30 feet."
    override val sAbilities: String = "Darkvision\n" +
            "Accustomed to twilit forests and the night sky, you have superior vision in dark and dim conditions. " +
            "You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it " +
            "were dim light. You can’t discern color in darkness, only shades of gray.\n" +
            "Keen Senses\n" +
            "You have proficiency in the Perception skill.\n" +
            "Fey Ancestry\n" +
            "You have advantage on saving throws against being charmed, and magic can’t put you to sleep.\n" +
            "Trance\n" +
            "Elves don’t need to sleep. Instead, they meditate deeply, remaining semiconscious, for 4 hours a day." +
            " (The Common word for such meditation is “trance.”) While meditating, you can dream after a fashion;" +
            " such dreams are actually mental exercises that have become reflexive through years of practice. After" +
            " resting in this way, you gain the same benefit that a human does from 8 hours of sleep."
    override val sLanguages: String = "You can speak, read, and write Common and Elvish. Elvish is fluid, with " +
            "subtle intonations and intricate grammar. Elven literature is rich and varied, and their songs and " +
            "poems are famous among other races. Many bards learn their language so they can add Elvish " +
            "ballads to their repertoires."
    override val iDEXChange: Int = 2
}

data class ElfOfAerenal(override val iWISChange: Int = 1): Elf(){
    override val sAbilities: String = super.sAbilities + "Aereni Elf\n" +
            "An Aereni elf can choose one skill or tool proficiency. Your proficiency bonus is doubled for " +
            "any ability check you make that uses this chosen proficiency.\n" +
            "Cantrip\n" +
            "You know one cantrip of your choice from the wizard spell list. Intelligence is your spellcasting " +
            "ability for it.\n" +
            "Extra Language\n" +
            "You can speak, read, and write one extra language of your choice."
}

data class ElfOfAerenalTwo(override val iWISChange: Int = 1): Elf()
{
    override val sAbilities: String = super.sAbilities + "Aereni Elf\n" +
            "An Aereni elf can choose one skill or tool proficiency. Your proficiency bonus is doubled for any " +
            "ability check you make that uses this chosen proficiency.\n" +
            "Fleet of Foot\n" +
            "Your base walking speed increases to 35 feet.\n" +
            "Mask of the Wild\n" +
            "You can attempt to hide even when you are only lightly obscured by foliage, heavy rain, falling snow, " +
            "mist, and other natural phenomena."
}

data class HighElf(override val iINTChange: Int = 1): Elf()
{
    override val sAbilities: String = super.sAbilities + "Elf Weapon Training\n" +
            "You have proficiency with the longsword, shortsword, shortbow, and longbow.\n" +
            "Cantrip\n" +
            "You know one cantrip of your choice from the wizard spell list. Intelligence is your spellcasting " +
            "ability for it.\n" +
            "Extra Language\n" +
            "You can speak, read, and write one extra language of your choice."
}

data class ElfOfTheHousesOfShadow(override val iCHAChange: Int = 1): Elf()
{
    override val sAbilities: String = super.sAbilities + "Natural Talent\n" +
            "You gain proficiency with one musical instrument or the Performance skill.\n" +
            "Gift of the Shadows\n" +
            "When you make a Charisma (Performance) or Dexterity (Stealth) check, you can roll one Intuition die, " +
            "a d4, and add the number rolled to the ability check.\n" +
            "Shape Shadows\n" +
            "You know the minor illusion cantrip. Charisma is your spellcasting ability for this trait.\n" +
            "Slip Into Shadow\n" +
            "You can use the Hide action as a bonus action, even if you have no cover or if you’re under " +
            "observation. Regardless of whether you succeed or fail, once you use this ability, you can’t use it" +
            " again until you finish a short or long rest."
}

data class ValenarHighElf(override val iINTChange: Int = 1): Elf()
{
    override val sAbilities: String = super.sAbilities + "Valenar Elf\n" +
            "A Valenar elf gains proficiency with the scimitar, double scimitar, longbow, and shortbow.\n" +
            "Cantrip\n" +
            "You know one cantrip of your choice from the wizard spell list. Intelligence is your spellcasting " +
            "ability for it.\n" +
            "Extra Language\n" +
            "You can speak, read, and write one extra language of your choice."
}

data class ValenarWoodElf(override val iWISChange: Int = 1): Elf()
{
    override val sAbilities: String = super.sAbilities + "Valenar Elf\n" +
            "A Valenar elf gains proficiency with the scimitar, double scimitar, longbow, and shortbow.\n" +
            "Fleet of Foot\n" +
            "Your base walking speed increases to 35 feet.\n" +
            "Mask of the Wild\n" +
            "You can attempt to hide even when you are only lightly obscured by foliage, heavy rain, falling " +
            "snow, mist, and other natural phenomena."
}

data class WoodElf(override val iINTChange: Int = 1): Elf()
{
    override val sAbilities: String = super.sAbilities + "Elf Weapon Training\n" +
            "You have proficiency with the longsword, shortsword, shortbow, and longbow.\n" +
            "Fleet of Foot\n" +
            "Your base walking speed increases to 35 feet.\n" +
            "Mask of the Wild\n" +
            "You can attempt to hide even when you are only lightly obscured by foliage, heavy rain, " +
            "falling snow, mist, and other natural phenomena.\n"
}