# Réponses — Évaluation POO : héritage, polymorphisme, transtypag
- Matricule :768058632
- Nom et prénom :Diarry Soung
- N (deux derniers chiffres du matricule) :32

> Rédigez vos justifications **avec vos propres mots**. Elles serviront de base à l'échange oral.

## Exercice 1 — A. Affichage prédit

Écrivez ci-dessous, entre les deux lignes de trois accents graves, **une ligne par ligne affichée**, dans l'ordre.
Ne modifiez pas les lignes de trois accents graves.

`A vehicule
F null 0
E moto 132
Moto2
vehicule
moto
C3
C2
D-vehicule
A vehicule
F null 0
E moto 132
true false
true
A vehicule
B vehicule
:3
:'''


## Exercice 1 — A. Justifications

1. Ligne qui commence par « F » : le constructeur vehicule appelle demarrer()mais  les champs de Moto ne sont pas encore remplis donc nuull et 0.
2. Ligne « C3 » :l'argument est vu comme vehicule,donc on  choisit comparer(vehicule),et Moto l'a redefini en C3
3. Ligne « C2 » : l'argument est vu comme Moto,donc on choisie comparer (Moto),Moto ne l'a pas redefini ,ca reste C2
4. Ligne qui commence par « D- » :categorie()est static,  c'est le type de la variable,vehicule,qui decide,pas l'objet reel
5. Pourquoi des lignes « A », « F », « E » :le new Moto() est cree avant l'affichage ,donc il affiche ses 3 lignes d'abord,puis on affiche true false.

## Exercice 1 — B. Transtypage

Colonne « Compile ? » : `oui` ou `non`. Colonne « Exécution » : `OK`, `exception` (en précisant laquelle), ou `-` si le code ne compile pas.

| n° | Compile ? | Exécution | Justification |
|----|-----------|-----------|---------------|
| 1  |  oui       |  ok         |    c'est un Moto est un vehicule,m           |
| 2  |  non     |    -       |a est declarer vehicule il faux un cast pour le mettre dans moto               |
| 3  |oui       |    ok       a contient vraiment un moto               |
| 4  | oui       exceptionClassException           |b contient vraiment un camion pas Moto               |
| 5  |  non     |    -       | c est un Moto on ne peut pas le transformer en camion ce sont2 type difference              |
| 6  |   oui    | exceptionClassException          | b contient un camion pas un string              |
| 7  |  non         |   -        |   b est declarer objet n'a pas de methode type()            |
| 8  | oui         |   ok        |   b contient un camion qui est un vehicul et type()donne "vehicule            |
