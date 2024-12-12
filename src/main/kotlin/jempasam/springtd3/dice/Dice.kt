package jempasam.springtd3.dice

import org.springframework.stereotype.Component

@Component
class Dice{

    val SIDES = 6

    fun roll() = (Math.random()*SIDES).toInt()+1

}
