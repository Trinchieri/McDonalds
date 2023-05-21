# McDonald's

## Scopo del progetto
Vogliamo progettare il funzionamento generale delle ordinazioni del McDonald's. Il progetto sarà in grado di registrare diverse ordinazioni, modificarle, se necessario, restituire il prezzo di ogni ordinazione e il numero dell'ordine. Inoltre, daremo la possibilità di scegliere dove ordinare (all'interno del ristorante oppure tramite McDrive).


## Funzionalità
* Scegliere se mangiare all'interno del ristorante oppure ordinare tramite McDrive
* Scegliere quale tra le seguenti opzioni ordinare: McCafé, McMenù, HappyMeal
* Compilare l'ordine, avendo la possibilità di personalizzare ciò che si sceglie
* Al termine è possibile modificare l'ordine
* Visualizzare il numero dell'ordine
* Visualizzare data e ora di quando si ha ordinato
* Visualizzare il prezzo finale (scontrino)


## Interfaccia Testuale
Il programma chiede all'utente se questo vuole ordinare: in caso di affermazione positiva, chiederà, poi, se vuole usufruire dell'asporto.
Riguardo le specifiche dell'ordine, l'utente sceglierà, in primo luogo, quale tipo di ordinazione intende eseguire (McCafé, McMenù, HappyMeal), per poi inserire le specifiche dell'ordine scelto. A seguito di ciò, l'utente può modificare la sua ordinazione oppure ordinare qualcos'altro.
Infine, verranno stampate le specifiche dell'ordine con il relativo prezzo.


## Interfaccia grafica
Sono state implementate le seguenti classi:
* Ordine_frm: pagina principale dove è possibile scegliere se ordinare McCafé, McMenù, HappyMeal e accedere a CheckOrdine
* McCafe_frm - Menu_frm - HappyMeal_frm: compilare l'ordine vero e proprio
* CheckOrdine_frm: visualizzazione dell'anteprima di ciò che si ha ordinato ed il prezzo e inserimento della scelta dell'asporto
* Scontrino_frm: stampa finale dell'ordine

Inoltre, è presente un package (imgs) contenente le immagini presenti nella GUI.


## Implementazione del progetto
### Classi
* GestoreOrdini
* GestorePanini
* Constants: contiene HashMap constanti, nelle quali vengono salvate le specifiche dei singoli prodotti
* HappyMeal
* HappyMenu
* McMenu
* McCafe
* Ordine
* Panino
* Patata
* Salsa


### Gestione file
#### panini.csv
Il file è associato alla classe GestionePanini.
La struttura è la seguente:
1. nome
2. tipo di carne (burger)
3. formaggio
4. salsa
5. insalata
6. cipolla
7. cetriolo
8. bacon
9. pane
10. chiave (valore utilizzato all'interno di GestorePanini)
11. prezzo

#### ordini.txt
Il file è associato a GestioneOrdini. All'interno di esso vengono salvati i vari ordini nel formato indicato nel toString di McCafe / McMenù / HappyMeal.

#### numero.txt
Il file è associato a GestioneOrdini. All'interno di esso viene salvato il numero dell'ordine corrente, che verrà letto ed incrementato per l'ordine successivo, per poi essere aggiornato.
