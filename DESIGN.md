Some parts that you may describe here:

#####- a diagram of modules or classes that I've decided to implement, in appropriate detail
![uml](https://cloud.githubusercontent.com/assets/18394877/15673243/a5411cfe-2735-11e6-90c7-7e456310976e.PNG)
Zoals op het bovenstaande plaatje te zien is, zal ik beginnen met ongeveer 7 activiteiten. De 7e activiteit de agenda, zal geïmplementeerd worden als ik voldoende tijd over heb nadat de eerste 6 activiteiten perfect werken.
De app zal bestaan uit de volgende activiteiten:
- Login
- Register
- Decision
- Meal
- Cookbook
- How to make
- (Agenda)
 
#####- Advanced sketches of your UI that clearly explain which features are connected to which underlying part of the code
![1loginpage](https://cloud.githubusercontent.com/assets/18394877/15706014/da8e67ec-27f1-11e6-9b93-9002be113744.png)

**Login pagina** gemaakt zodat de gegevens van de gebruiker opgeslagen worden en opgehaald worden. Hierdoor is het mogelijk voor de gebruiker om constant zijn/haar gegevens weer terug te krijgen als de app opgestart wordt.

![2registerpage](https://cloud.githubusercontent.com/assets/18394877/15706013/da8bdf86-27f1-11e6-8670-2929c0ceb944.png)

**Registratie pagina** gemaakt voor nieuwe gebruikers zonder inloggegevens. De gegevens worden dan opgeslagen in de Sql database.

![3decisionpage](https://cloud.githubusercontent.com/assets/18394877/15706015/da909eb8-27f1-11e6-8ad8-f4c8dbad9a2a.png)

**Decision pagina** is de pagina waar de gebruiker de afbeeldingen voor zich krijgt en hierop zijn/haar keuze kan maken. Dus een like of een dislike. Als de afbeelding geliked wordt dan zal het gerecht worden opgeslagen in de **Cookbook**.

![4cookbookpage](https://cloud.githubusercontent.com/assets/18394877/15706016/da914412-27f1-11e6-8941-0cd3cfa99d7f.png)

De **cookbook** is een pagina waar alle "matches" van de gebruiker geplaatst zijn, een soort van gallerij van matches. Als de gebruiker op een afbeelding drukt dan wordt hij/zij doorgeschakeld naar het recept van de afbeelding.

![5mealpage](https://cloud.githubusercontent.com/assets/18394877/15706010/da6eb7bc-27f1-11e6-94f7-237a84692ae0.png)

Eenmaal op de **MealPage** kan de gebruiker zien waaruit het gerecht bestaat. Als het de gebruiker bevalt, dan zal hij/zij de mogelijk hebben om door te gaan naar de **How To** pagina.

![6howtomakepage](https://cloud.githubusercontent.com/assets/18394877/15706011/da853bd6-27f1-11e6-9b15-e3b9e96f3434.png)

De gebruiker kan op de **HowToMake** overzichtelijk zien hoe het gerecht bereidt moet worden. (Met daaronder een button om het gerecht op te slaan in zijn/haar persoonlijke agenda). 

![7agendapage](https://cloud.githubusercontent.com/assets/18394877/15706012/da87e1e2-27f1-11e6-8d51-5866c78828ea.png)

Dit is een feature die uiteindelijk geïmplementeerd zal worden, mits er genoeg tijd is om de bovenstaande features perfect uit te werken.

#####- A list of APIs and frameworks or plugins that you will be using to provide functionality in your app
- BigOven API
- Google Calender plugin
- SQLite

#####- A list of data sources if you will get data from an external source
- BigOven Datasource website

#####- A list of database tables and fields (and their types) if you will use a database
- user_id
- E-mail
- ID
- Password
