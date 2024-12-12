package jempasam.springtd3.dice

import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class DiceAPI(private val dice: DiceService) {

    /**
     * Roll a dice and save the result in the logs.
     */
    @GetMapping("/rollDice")
    fun rollDice() = dice.rollDices(1)

    /**
     * Roll the given count of dices and save the results in the logs.
     */
    @GetMapping("/rollDices/{count}")
    fun rollDices(@PathVariable count: Int) = dice.rollDices(count)

    /**
     * Get the dice roll logs.
     */
    @GetMapping("/diceLogs")
    fun diceLogs() = dice.diceHistory()

    /**
     * Clear the dice roll logs.
     */
    @DeleteMapping("/diceLogs")
    fun clearLogs() = dice.clearHistory()
}