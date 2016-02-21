<h1>SIR - TP JPA, par Banchet Chlo� et Kaakati Dania</h1>
Ce TP regroupe les TP2 et 3 et aborde le JPA ainsi que Servlet.

<h2>JPA</h2>
A partir d'un mod�le m�tier fournit, la cr�ation d'entit�s s'est faite.

<h3>Entities</h3>
Il faut donc cr�er une entit� pour chaque classe, avec ses attributs et toutes les informations permettant de la d�finir.
Pour sp�cifier la cr�ation d'une entit�, il faut placer @Entity avant de d�finir la classe Java. Il faut �galement d�clarer
gr�ce � @Id	@GeneratedValue qu'un attribut sera la clef et qu'elle sera g�n�r�e automatiquement. Il faut veiller � cr�er des
get/set pour chaque attribut d�finit.

Il y a la possibilit� de d�finir des liens entre les Entities, gr�ce � par exemple @ManyToMany, pour l'entit� Person, indiquant
qu'une personne peut avoir plusieurs r�sidences, et une r�sidence appartient � plusieurs personnes.
Une autre d�finition utilis�e est @OneToMany @JoinColumn(name = "RESIDENCE_ID"), qui met en �vidence qu'une r�sidence poss�de
plusieurs dispositifs �lectroniques, mais qu'un dispositif �lectronique n'est rattach� qu'� une r�sidence, gr�ce � l'id de la r�sidence.

L'h�ritage est aussi mis en place dans ce TP. Pour d�clarer une entit� abstraite on ajoute @Entity @Inheritance(strategy = InheritanceType.SINGLE_TABLE).

<h3>Mise en oeuvre de JPA</h3>
C'est dans le fichier JpaTest.java que se fait la mise en oeuvre.

C'est ici qu'on cr�� toutes les entities comme �tant des objets, afin d'�tablir des liens et de faire des interactions entres ceux-ci.
Tout d'abord il faut cr�er les EntityManager permettant d'effectuer des transactions avec la base de donn�es. Ces transactions
sont du type insert/delete/update. Utilisation de tx.begin() et tx.commit() pour cela.
Ici, la cr�ation de 2 personnes, avec l'ajout d'une r�sidence pour l'un d'entre eux.
Elaboration de requ�tes sur la base de donn�es.

<h2>Servlet</h2>
