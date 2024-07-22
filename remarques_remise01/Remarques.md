# AsciiPaint

## Divers

- Git : gitignore en ordre
- Javadoc : Quelques erreurs et parfois incomplètes. 
- La documentation est absente de l’interface `Shape`
- Couverture de test : couverture insuffisante
- Nom de variable peu explicite (i,j,x,y)
- Regarde la documentation de la documentation `StringBuilder` avant de poursuivre
- Action move non définies dans le Controller
- Alignement du code incorrecte

## Analyse de code

Commence par jeter un œil aux remarques générées par Intelliji dans la page index.html

Reviens-vers moi si il y a des remarques que tu ne comprends pas ou que tu ne trouves pas appropriées

## Réflexion

Dans la classe `Point`, faut-il définir une méthode `boolean isLeftTo(Point other)` qui retourne vrai si le point est à gauche du point passé en paramètre ?

La méthode `isInside` de la classe `Rectangle` ne serait-elle pas plus simple ?

La responsabilisé de la classe `Point` sur ses attributs `x` et `y` ne serait-elle pas respectée de cette façon ?

## Méthodes et paramètres d'entrées

Attention les méthodes qui utilisent directement leurs paramètres d'entrées, doivent contrôler leurs validités, elles en sont responsables. Voici quelques exemples : 

Classe `Drawing`

- méthode `addShape`
- paramètre `shape`
- contrainte ne peut pas être `null`

Classe `Circle`

- constructeur
- paramètre `point`
- contrainte ne peut pas être `null`

Classe `ColoredShape`

- constructeur
- paramètre `color`
- contrainte ne peut pas être vide





