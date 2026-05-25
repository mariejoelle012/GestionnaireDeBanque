BankManager

Application Java simple permettant de manipuler différents types de comptes bancaires grâce au principe d’héritage en programmation orientée objet.

Objectif

Ce projet montre comment :

- créer une classe parent ;

- créer des classes enfants avec extends ;

- utiliser l’héritage ;

- créer des objets dans la méthode main ;

- accéder aux attributs hérités.



---

Structure du projet
````text
BankManager/
│
└── src/
│
├── BankAccount.java
├── CheckingAccount.java
├── SavingsAccount.java
├── COD.java
└── BankManager.java

````
---

Classes du projet:

- BankAccount

- Classe parent contenant les informations communes à tous les comptes bancaires.

- Attributs

- account : numéro du compte

- balance : solde du compte



---

CheckingAccount

Classe enfant héritant de BankAccount.

Attribut supplémentaire

limit : limite du compte courant



---

SavingsAccount

Classe enfant héritant de BankAccount.

Attribut supplémentaire





---

COD

Classe enfant héritant de BankAccount.

Attribut supplémentaire





---

Fonctionnement

Dans la méthode main :

1. Création d’une instance de chaque classe enfant ;


2. Attribution des valeurs aux attributs ;


3. Affichage des informations dans la console.




---

Exemple de sortie
````
***** Checking Account *****
Compte : CHK001
Solde : 250000.0
Limite : 50000.0

***** Savings Account *****
Compte : SVG001
Solde : 1000000.0


***** COD *****
Compte : COD001
Solde : 3000000.0

````

---

Technologies utilisées

- Java

- Programmation Orientée Objet (POO)



---

Concepts utilisés

- Classes et objets

- Héritage

- Attributs

- Méthode main

- Instanciation

- Affichage console



---

Auteur

Yao Marie Joëlle