<h1>SIR - TP JPA, par Banchet Chloé et Kaakati Dania</h1>
Ce TP regroupe les TP2 et 3 et aborde le JPA ainsi que Servlet.

<h2>JPA</h2>
A partir d'un modèle métier fournit, la création d'entités s'est faite.

<h3>Entities</h3>
Il faut donc créer une entité pour chaque classe, avec ses attributs et toutes les informations permettant de la définir.
Pour spécifier la création d'une entité, il faut placer @Entity avant de définir la classe Java. Il faut également déclarer
grâce à @Id	@GeneratedValue qu'un attribut sera la clef et qu'elle sera générée automatiquement. Il faut veiller à créer des
get/set pour chaque attribut définit.

Il y a la possibilité de définir des liens entre les Entities, grâce à par exemple @ManyToMany, pour l'entité Person, indiquant
qu'une personne peut avoir plusieurs résidences, et une résidence appartient à plusieurs personnes.
Une autre définition utilisée est @OneToMany @JoinColumn(name = "RESIDENCE_ID"), qui met en évidence qu'une résidence possède
plusieurs dispositifs électroniques, mais qu'un dispositif électronique n'est rattaché qu'à une résidence, grâce à l'id de la résidence.

L'héritage est aussi mis en place dans ce TP. Pour déclarer une entité abstraite on ajoute @Entity @Inheritance(strategy = InheritanceType.SINGLE_TABLE).

<h3>Mise en oeuvre de JPA</h3>
C'est dans le fichier JpaTest.java que se fait la mise en oeuvre.

C'est ici qu'on créé toutes les entities comme étant des objets, afin d'établir des liens et de faire des interactions entres ceux-ci.
Tout d'abord il faut créer les EntityManager permettant d'effectuer des transactions avec la base de données. Ces transactions
sont du type insert/delete/update. Utilisation de tx.begin() et tx.commit() pour cela.
Ici, la création de 2 personnes, avec l'ajout d'une résidence pour l'un d'entre eux.
Elaboration de requêtes sur la base de données.

<h2>Servlet</h2>
