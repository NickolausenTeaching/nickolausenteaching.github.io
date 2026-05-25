Attività laboratoriale: costruire una tabella di frequenze dei caratteri contenuti in un file di testo
===

Consegna
---

Costruire un programma C# che, preso in input un file contenente del testo, ne costruisca una tabella di frequenze dei caratteri.

In particolare, preso un file `input.txt` con contenuto "`ciao`", deve essere possibile stampare un risultato simile a:

```sh
'c' -> 1
'i' -> 1
'a' -> 1
'o' -> 1
```

Se, all'interno di `input.txt` ci fosse il contenuto "`ciao ciao`", dovrei visualizzare:

```sh
'c' -> 2
'i' -> 2
'a' -> 2
'o' -> 2
' ' -> 1
```

Allegati
---

- [\[`input01.txt`\]](assets/input01.txt), [\[`input02.txt`\]](assets/input02.txt), [\[`input03.txt`\]](assets/input03.txt)

Anteprima di `input01.txt`:

```text
We use a constant “driving force” F d together with a Gaussian thermostatting “constraint force” F d to simulate a nonequilibrium steady-state current (particle velocity) in a periodic, two-dimensional, classical Lorentz gas. The ratio of the average particle velocity to the driving force (field strength) is the Lorentz-gas conductivity. A regular “Galton-board” lattice of fixed particles is arranged in a dense triangular-lattice structure. The moving scatterer particle travels through the lattice at constant kinetic energy, making elastic hard-disk collisions with the fixed particles. At low field strengths the nonequilibrium conductivity is statistically indistinguishable from the equilibrium Green-Kubo estimate of Machta and Zwanzig. The low-field conductivity varies smoothly, but in a complicated way, with field strength. For moderate fields the conductivity generally decreases nearly linearly with field, but is nearly discontinuous at certain values where interesting stable cycles of collisions occur. As the field is increased, the phase-space probability density drops in apparent fractal dimensionality from 3 to 1. We compare the nonlinear conductivity with similar zero-density results from the two-particle Boltzmann equation.
```

Tabella delle frequenze di `input01.txt`

```text
==== FREQUENCY TABLE for input01.txt ====
Char W appears 2 times
Char e appears 110 times
Char   appears 171 times
Char u appears 30 times
Char s appears 63 times
Char a appears 80 times
Char c appears 52 times
Char o appears 61 times
Char n appears 67 times
Char t appears 111 times
Char “ appears 3 times
Char d appears 37 times
Char r appears 68 times
Char i appears 106 times
Char v appears 14 times
Char g appears 21 times
Char f appears 20 times
Char ” appears 3 times
Char F appears 3 times
Char h appears 33 times
Char w appears 12 times
Char G appears 3 times
Char m appears 19 times
Char l appears 57 times
Char q appears 4 times
Char b appears 11 times
Char y appears 21 times
Char - appears 11 times
Char ( appears 2 times
Char p appears 15 times
Char ) appears 2 times
Char , appears 7 times
Char L appears 2 times
Char z appears 5 times
Char . appears 9 times
Char T appears 3 times
Char A appears 3 times
Char x appears 2 times
Char k appears 3 times
Char K appears 1 times
Char M appears 1 times
Char Z appears 1 times
Char 3 appears 1 times
Char 1 appears 1 times
Char B appears 1 times
**** END OF TABLE for input01.txt ****
```

---

Anteprima di `input02.txt`:

```text
Beautiful is better than ugly.
Explicit is better than implicit.
Simple is better than complex.
Complex is better than complicated.
Flat is better than nested.
Sparse is better than dense.
Readability counts.
Special cases aren't special enough to break the rules.
Although practicality beats purity.
Errors should never pass silently.
Unless explicitly silenced.
In the face of ambiguity, refuse the temptation to guess.
There should be one-- and preferably only one --obvious way to do it.
Although that way may not be obvious at first unless you're Dutch.
Now is better than never.
Although never is often better than *right* now.
If the implementation is hard to explain, it's a bad idea.
If the implementation is easy to explain, it may be a good idea.
Namespaces are one honking great idea -- let's do more of those!
```

Tabella delle frequenze di `input02.txt`:

```text
==== FREQUENCY TABLE for input02.txt ====
Char B appears 1 times
Char e appears 86 times
Char a appears 50 times
Char u appears 20 times
Char t appears 74 times
Char i appears 49 times
Char f appears 10 times
Char l appears 33 times
Char   appears 118 times
Char s appears 42 times
Char b appears 19 times
Char r appears 31 times
Char h appears 29 times
Char n appears 38 times
Char g appears 11 times
Char y appears 15 times
Char . appears 18 times
Char 
 appears 18 times
Char E appears 2 times
Char x appears 6 times
Char p appears 20 times
Char c appears 16 times
Char m appears 15 times
Char S appears 3 times
Char o appears 41 times
Char C appears 1 times
Char d appears 16 times
Char F appears 1 times
Char R appears 1 times
Char ' appears 4 times
Char k appears 2 times
Char A appears 3 times
Char v appears 5 times
Char U appears 1 times
Char I appears 3 times
Char , appears 3 times
Char T appears 1 times
Char - appears 6 times
Char w appears 4 times
Char D appears 1 times
Char N appears 2 times
Char * appears 2 times
Char ! appears 1 times
**** END OF TABLE for input02.txt ****
```

---

Anteprima di `input03.txt`:

```text
Fantalonavo qui coatto nelle vie di Remoria
Cubicavo nel mio acquico di noia
Come quei simulenti digitore di memorie
Continuavo a notticare tra magnolie
Stavo in giro negli ambienti liminali
Continuavo nei miei raplaplà
Impazzire fino a snumerare
In questa città di matti e sono certo
La gente nel pubblico penserà:

“Ma come fa a sapere quello che pensiamo?”
“Ahh il pubblico penserà”
“Ma sta canzone che…?”

Fanfolavo qui coatto nelle vie della carta
Come avessi la ragione in cellulosa, sì
Io ho capito che hai capito
Tu hai capito? Riadattati
L’iperuranio impoverito vi ha distratti
Qui in Italia va di moda abbuiolare lutti
Questa cosa ce la vogliono copiare tutti
Sono l’ultimo dei nubivaghi e dei bambulti
Però io, sono il prio, sono il mago… yeah!

Ho un’idea, spumeggiante, rea
Del fatto che vi siete
Tutti quanti persi nella mia rimea
Come Dante che canta un girone a Caltagirone
Solo, giri di parole, piri di girole
Siamo i nuovi prodigieri di una contraltea
Perché la vita è smegia, una garosa apnea
Solo glossolalie, una canzone ed un tema
Se non c’hai capito niente non è mica un problema

Fanfole, girano le fanfole, suonano le fanfole
E mi conosce tutta Italia
Fanfole, girano le fanfole, volano le bambole
E poi qualcuno le mitraglia
Fanfole, girano le fanfole, suonano le fanfole
Qui dove chi sbaglia spara
Girano le fanfole, suonano le fanfole
Presidente guarda e impara

Girano le fanfole, suonano le fanfole
Non capisci mai quando parlano
E pensa che tu volevi dare la colpa a me
Girano le fanfole, suonano le fanfole
Ci rubano tutto poi scappano
E adesso si meritano un testo che non c’è

In giro è una fanfuria di fandonie e trucchi
Pieno di farfantini di fanfalucchi
Se la politica è un teatro giuro sono dei geni
Siamo tutti Stefano Cucchi, Giulio Regeni
E guardo il mondo da un oblò, nell’oblomovismo
Che come turbini di trottolerie, parlano
E quando chiedo spiegazioni annuiscono
Capito sì, come parlassi in arabo:

ملاكلا يز درولا
,ٮارم 0ى دم 0ى لىع قارولا
را>ٮ ,ٮالBڡلم ّع امل ٮ6 ,ح 0ى در,ٮلا ا>ٮأ أول
اح>ٮا شم ,ٮ>ٮحلم كيز
ةللا6ٮ ةللا6ٮ
daje
ت>ٮا مذلا احص>ٮ ةيوش
فوش ال>ٮ ,حوم م>ٮاورة لك ةل6ٮل
اح>ٮا ,ح6ٮ>ٮا ه>ٮا ناشع >ٮ >ڡBٮح ع>ٮ6ٮ>ٮا
ناشع احص>ٮ نم ال>ٮوم
عمسا كلام 0ى
عمسا
anacapito
عمسا ا>ٮأ م ,ح>ٮون

Adesso fammi un giro dei Tool…
Un tango…
Un blues…
Non sai più in quale gruppo li hanno assunti
È come se ogni volta ti mandassi confuso
E tu capissi che ogni volta ti ho illuso
E poi la rabbia
Ti portasse a quel punto
A ricordare
Questo nome e il riassunto
È che al tuo amico dici:
“Guarda, questo è quello delle…”

Fanfole, girano le fanfole, suonano le fanfole
E mi conosce tutta Italia
Fanfole, girano le fanfole, volano le bambole
E poi qualcuno le mitraglia
Fanfole, girano le fanfole, suonano le fanfole
Qui dove chi sbaglia spara
Girano le fanfole, servono più ancore
Presidente guarda e impara
Girano le fanfole, suonano le fanfole
Non capisci mai quando parlano
E pensa che tu volevi dare la colpa a me
Girano le fanfole, suonano le fanfole
Ci rubano tutto poi scappano
E adesso si meritano un testo che non c’è
```

Tabella delle frequenze di `input03.txt`:

```text
==== FREQUENCY TABLE for input03.txt ====
Char F appears 8 times
Char a appears 265 times
Char n appears 193 times
Char t appears 112 times
Char l appears 150 times
Char o appears 247 times
Char v appears 29 times
Char   appears 445 times
Char q appears 16 times
Char u appears 94 times
Char i appears 221 times
Char c appears 75 times
Char e appears 212 times
Char d appears 49 times
Char R appears 3 times
Char m appears 56 times
Char r appears 93 times
Char 
 appears 100 times
Char C appears 12 times
Char b appears 27 times
Char s appears 83 times
Char g appears 42 times
Char S appears 9 times
Char p appears 58 times
Char à appears 4 times
Char I appears 7 times
Char z appears 5 times
Char f appears 62 times
Char L appears 2 times
Char : appears 3 times
Char “ appears 4 times
Char M appears 2 times
Char h appears 30 times
Char ? appears 3 times
Char ” appears 4 times
Char A appears 3 times
Char … appears 6 times
Char , appears 40 times
Char ì appears 2 times
Char T appears 4 times
Char ’ appears 7 times
Char Q appears 5 times
Char P appears 5 times
Char ò appears 2 times
Char y appears 1 times
Char ! appears 1 times
Char H appears 1 times
Char D appears 2 times
Char é appears 1 times
Char è appears 7 times
Char E appears 12 times
Char G appears 8 times
Char N appears 3 times
Char م appears 17 times
Char ل appears 22 times
Char ا appears 34 times
Char ك appears 4 times
Char ي appears 3 times
Char ز appears 2 times
Char د appears 3 times
Char ر appears 6 times
Char و appears 9 times
Char ٮ appears 29 times
Char 0 appears 4 times
Char ى appears 5 times
Char ع appears 8 times
Char ق appears 1 times
Char > appears 19 times
Char B appears 2 times
Char ڡ appears 2 times
Char ّ appears 1 times
Char 6 appears 6 times
Char ح appears 10 times
Char أ appears 3 times
Char ش appears 5 times
Char ة appears 5 times
Char j appears 1 times
Char ت appears 1 times
Char ذ appears 1 times
Char ص appears 2 times
Char ف appears 1 times
Char ه appears 1 times
Char ن appears 4 times
Char س appears 3 times
Char U appears 2 times
Char ù appears 2 times
Char È appears 2 times
**** END OF TABLE for input03.txt ****
```