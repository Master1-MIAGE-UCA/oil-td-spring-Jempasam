# Application Spring de lancer de dé
## Etape 1: Dice
La classe [Dice](src/main/kotlin/jempasam/springtd3/dice/Dice.kt) est un Component spring boot qui permet de générer le résultat d'un lancer de dé.
## Etape 2: DiceRollLog
La classe [DiceRollLog](src/main/kotlin/jempasam/springtd3/dice/DiceRollLog.kt) est une entité qui décrit le résultat d'un lancer de plusieurs dés.
## Etape 3: DiceRepository
La classe [DiceRepository](src/main/kotlin/jempasam/springtd3/dice/DiceRepository.kt) permet de persister et de récupérer l'historique des `DiceRollLog` dans la base de données.
## Etape 4: DiceService
La classe [DiceService](src/main/kotlin/jempasam/springtd3/dice/DiceService.kt) permet de générer des `DiceRollLog` à partir d'un nombre de dés en les sauvegardant dans l'historique des lancés grâce au `DiceRepository`.
## Etape 5: DiceAPI
La classe [DiceAPI](src/main/kotlin/jempasam/springtd3/dice/DiceAPI.kt) est un contrôleur REST qui expose les endpoints suivants:
`GET` `/rollDice`: Lancer un seul dé grâce au `DiceService`.
`GET` `/rollDices/{X}`: Lancer X dés grâce au `DiceService`.
`GET` `/diceLogs`: Récupérer l'historique des lancés grâce au `DiceRepository`.
`DELETE` `/diceLogs`: Supprimer l'historique des lancés grâce au `DiceRepository`.
## Etape 6: Swagger
L'API est documentée grâce à Swagger. Vous pouvez accéder à la documentation sur [http://localhost:8081/swagger-ui/index.html#](http://localhost:8081/swagger-ui/index.html#).
## Autres informations
Le projet est programmé en Kotlin et donc ne nécessite pas Lombok.