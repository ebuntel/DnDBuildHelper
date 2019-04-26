package com.example.dndbuildhelper

data class Dragonborn(override val iSTRChange: Int = 2,
                      override val iCHAChange: Int = 1,
                      override val sAge: String = "Young dragonborn grow quickly. They walk hours after hatching, " +
                              "attain the size and development of a 10-year-old human child by the age of 3, and " +
                              "reach adulthood by 15. They live to be around 80.",
                      override val sAlignment: String  = "Dragonborn tend to extremes, making a conscious choice " +
                              "for one side or the other in the cosmic war between good and evil (represented " +
                              "by Bahamut and Tiamat, respectively). Most dragonborn are good, but those who " +
                              "side with Tiamat can be terrible villains.",
                      override val sSize: String = "Dragonborn are taller and heavier than humans, standing " +
                              "well over 6 feet tall and averaging almost 250 pounds. Your size is Medium.",
                      override val sSpeed: String = "Your base walking speed is 30 feet.",
                      override val sLanguages: String = "You can speak, read, and write Common and Draconic. " +
                              "Draconic is thought to be one of the oldest languages and is often used in the " +
                              "study of magic. The language sounds harsh to most other creatures and includes " +
                              "numerous hard consonants and sibilants.") : Race()
{

}