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