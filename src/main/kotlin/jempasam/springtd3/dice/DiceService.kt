package jempasam.springtd3.dice

import org.springframework.stereotype.Service
import java.util.Date

@Service
class DiceService(private val dice: Dice, private val repository: DiceRollRepository) {

    fun rollDices(count: Int): DiceRollLog{
        val roll = DiceRollLog(0, count, IntArray(count){dice.roll()}, Date())
        return repository.saveAndFlush(roll)
    }

    fun diceHistory() = repository.findAll()

    fun clearHistory() = repository.deleteAll()
}