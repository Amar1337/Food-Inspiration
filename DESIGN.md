Some parts that you may describe here:

#####- a diagram of modules or classes that I've decided to implement, in appropriate detail
![uml](https://cloud.githubusercontent.com/assets/18394877/15707599/d3c596c6-27f9-11e6-9632-bc17f25e82b1.PNG)

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
![1loginpage](https://cloud.githubusercontent.com/assets/18394877/15707048/e58f4cc4-27f6-11e6-86fd-cf194674f690.png)

**Login pagina** gemaakt zodat de gegevens van de gebruiker opgeslagen worden en opgehaald worden. Hierdoor is het mogelijk voor de gebruiker om constant zijn/haar gegevens weer terug te krijgen als de app opgestart wordt.

![2registerpage](https://cloud.githubusercontent.com/assets/18394877/15707049/e58f64a2-27f6-11e6-87f3-7f75c8857702.png)

**Registratie pagina** gemaakt voor nieuwe gebruikers zonder inloggegevens. De gegevens worden dan opgeslagen in de Sql database.

![3decisionpage](https://cloud.githubusercontent.com/assets/18394877/15707051/e5928e8e-27f6-11e6-9457-845e3a750d44.png)

**Decision pagina** is de pagina waar de gebruiker de afbeeldingen voor zich krijgt en hierop zijn/haar keuze kan maken. Dus een like of een dislike. Als de afbeelding geliked wordt dan zal het gerecht worden opgeslagen in de **Cookbook**.

![4cookbookpage](https://cloud.githubusercontent.com/assets/18394877/15707052/e5a6343e-27f6-11e6-909a-5c294f8c29a5.png)

De **cookbook** is een pagina waar alle "matches" van de gebruiker geplaatst zijn, een soort van gallerij van matches. Als de gebruiker op een afbeelding drukt dan wordt hij/zij doorgeschakeld naar het recept van de afbeelding.

![5mealpage](https://cloud.githubusercontent.com/assets/18394877/15707046/e58e423e-27f6-11e6-846f-04025cf1ced7.png)

Eenmaal op de **MealPage** kan de gebruiker zien waaruit het gerecht bestaat. Als het de gebruiker bevalt, dan zal hij/zij de mogelijk hebben om door te gaan naar de **How To** pagina.

![6mealpage2](https://cloud.githubusercontent.com/assets/18394877/15707050/e58f67a4-27f6-11e6-8815-06029c04553e.png)

De gebruiker kan op de **HowToMake** overzichtelijk zien hoe het gerecht bereidt moet worden. (Met daaronder een button om het gerecht op te slaan in zijn/haar persoonlijke agenda). 

![7agendapage](https://cloud.githubusercontent.com/assets/18394877/15707047/e58e783a-27f6-11e6-9c56-a1cda8d11fd9.png)

Dit is een feature die uiteindelijk geïmplementeerd zal worden, mits er genoeg tijd is om de bovenstaande features perfect uit te werken.

#####- A list of APIs and frameworks or plugins that you will be using to provide functionality in your app
- BigOven API
**Search**
Search over 350,000+ recipes by ingredient, Title and more.

**Display Recipes and Photos**
Display recipes in detail, including photos and ratings, on your website or mobile application.

**Recipe Reviews**
Get recipe reviews, and detailed ingredient information.

**Grocery Lists**
Fetch and update grocery list information in the cloud.

**Recipes How you Want Them**
Support JSON format in an easy to use REST-based API.

- Google Calender plugin
- SQLite 
- Android SDK (voor de framework)

#####- A list of data sources if you will get data from an external source
- BigOven Datasource website. BigOven zorgt ervoor dat ik genoeg data heb zoals recepten, afbeeldingen, ingrediënten. 

#####- A list of database tables and fields (and their types) if you will use a database
- user_id
- E-mail
- ID
- Password
