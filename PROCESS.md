# day 1
-	Het was vandaag de bedoeling om een projectproposal te maken
-	Het probleem is beschreven. Probleem is dat je elke dag moet bedenken wat je gaat eten en wat je gaat maken om te eten. Het idee is dat je eten, recepten, ingrediënten en plaatjes aangeboden krijgt.
-	Eigenschappen van de applicatie zijn beschreven.
-	Een overzicht van sketches zijn gemaakt en in de doc folder geplaatst
-	Er wordt gebruik gemaakt van de BigOven API met daarin 350.000+ recepten
-	Concurrent is voornamelijk “Tender”. Een app met hetzelfde principe alleen de gebruiksvriendelijkheid is enorm slecht. Na een uur de app gebruikt te hebben zijn er paar valkuilen opgevallen zoals dat je wordt doorgelinked naar een website als je op een recept klikt. Reclame is op een enorm onvriendelijke manier toegepast op de app.
-	Technische problemen zijn beschreven zoals het aspect van de snelheid, gebruiksvriendelijkheid en de persoonlijke toevoeging zoals je “matches” kunnen plaatsen in een agenda. Het is mogelijk dat ik bepaalde features niet kan toevoegen puur door het feit dat ik de kennis hier niet voor heb. Mocht dit gebeuren dan zal ik de assistenten inschakelen voor hulp.

# day 2
-	“Vergadering” gehad met mijn groep, bestaande uit Lydia, Paul en Marijn
-	We hebben elkaars concepten besproken en aangevuld
-	Ik ben vergeten de recepten toe te voegen.  Lydia heeft mij hierop gewezen en het is mogelijk om deze met behulp van de API toe te voegen.
-	Voor de rest ben ik bezig met de 2e deadline namelijk het “design-document” . 
-	Het uitwerken van mijn design dus hoe mijn app eruit gaat zien.
-	Het maken van een diagram van de app (UML)

# day 3
-	Een wachtwoord confirmatie toevoegen
-	Wellicht ID weghalen omdat email al gebruikt wordt
-	Pijl van login naar DecisionActivity
-	Pijl van btnCookbook naar CookbookActivity
-	MealActivity en CookbookActivity omdraaien
-	Ingrediënten en recept op 1 pagina, wellicht de mogelijkheid om te kunnen swipen.
-	Kijken hoe ik de opgeslagen “likes” ga opslaan.

# day 4
- Prototype maken
- Login en Registreren (+ agenda) nog weggelaten
- StartActivity (eerste pagina) geadd waar de gebruiker 2 keuzes heeft, namelijk door naar de MainActivity of naar zijn/haar Cookbook
- Toast geadd aan dislike en like button om de onClick te testen
- Cookbook onClick intent naar Cookbook met de likes (matches)
- Momenteel is de Cookbook hardcoded. Gridview van images werkt wel ook als het verschillende images zijn
- Eenmaal geklikt op een image ga je naar de FullImage. Dit werkt ook bij andere Images (uit de drawable nog maar gaat een API worden)
- Listview onder de Imageview (full image) met ingrediënten (ook hardcoded, zal ook met de BigOven API anders worden)
- TODO; Recepten en ingrediënten proberen op 1 pagina te stoppen
- TODO; De functie toevoegen om in de FullImageActivity te kunnen swipen, zodat je niet weer terug naar de Cookbook hoeft te gaan
- TODO; Bij de MainActivity de mogelijkheid om te kunnen swipen van gerecht
- TODO; text toevoegen boven de Imageview op de FullImageActivity

# day 5 (presentatie)
- 
