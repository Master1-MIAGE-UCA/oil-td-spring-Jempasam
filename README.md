# Application Spring de lancer de dé
## Etape 1: Dice
La classe [Dice](src/main/kotlin/jempasam/springtd3/dice/Dice.kt) est un Component spring boot qui permet de générer le résultat d'un lancer de dé.
## Etape 2: DiceRollLog
La classe [DiceRollLog](src/main/kotlin/jempasam/springtd3/dice/DiceRollLog.kt) est une entité qui décrit le résultat d'un lancer de plusieurs dés.
## Etape 3: DiceRepository
La classe [DiceRepository](src/main/kotlin/jempasam/springtd3/dice/DiceRepository.kt) permet de persister et de récupérer des `DiceRollLog` dans la b
## Etape 3: DiceService
La classe [DiceService](src/main/kotlin/jempasam/springtd3/dice/DiceService.kt) permet de générer des `DiceRollLog` à partir d'un nombre de dés et les
