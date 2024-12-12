package jempasam.springtd3.dice

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import java.util.Date

@Entity
data class DiceRollLog(

    @Id
    @GeneratedValue
    var id: Long,

    var diceCount: Int,

    var results: IntArray,

    var timestamp: Date,

){
    constructor(): this(0, 0, IntArray(0), Date())
}