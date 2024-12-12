package jempasam.springtd3.dice

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface DiceRollRepository: JpaRepository<DiceRollLog, Long>{

}