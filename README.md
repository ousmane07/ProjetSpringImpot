
## Projet Spring Boot Impot

Projet Final Spring Boot

Bonjour Monsieur Seck

Dans le cas de ce projet, j'ai choisi la première option c'est à dire de " créer les API reste pour l'ajout et la liste de chaque classe seulement "

NB: Je n'ai pas eu l'occasion de faire marcher le code du à des problèmes d'environnement, de versions et de serveurs

Mais par des captures d'écrans et des explications, je vais vous expliquer la logique que j'ai utilisé pour faire ce projet

## Presentation du projet 
Voici une capture d'écran de de l'ensembles des répertoires du projets
![Capture1](https://github.com/ousmane07/ProjetSpringImpot/blob/master/1.png?raw=true) 
![Capture2](https://github.com/ousmane07/ProjetSpringImpot/blob/master/2.png?raw=true)

Dans cette capture vous pouvez voir différents répertoires, nous allons en expliquer juste quelques
- Model ( qui contient l'ensemble des classes)
- Interfaces ( qui contient l'interface de chaque classe et qui doivent ensuite etre implementé )
- Controller ( c'est ici qu'on va mettre les Controller de chaque classe et chaque controller doit avoir l'annotation @RestController )
- Service ( pour les services des classes)
- Exception ( pour retourner un message en cas d'erreurs )
- la classe Main " SpringbootappApplication "
- Dans la Deuxième capture vous pouvez voir le fichier application.yml, en effet le fichier s'appelait application.properties mais en essayant de faire communiquer mon application à la base de données il me générait beaucoup d'erreurs raison pour laquelle je l'ai renommé en un fichier .yml ce qui m'a fait un peu avancer
- Et le fichier pom.xml qui contient l'ensemble des dépendances, plugins etc nécessaires pour la réalisation de ce projet

## Les API Rest ( Liste des classes)

Nous allons prendre l'exemple du contoller Paiement

![Capture3](https://github.com/ousmane07/ProjetSpringImpot/blob/master/3.png?raw=true)


Dans cette capture, vous allez voir le controller avec les annotations
- @RestController qui lui permettra de devenir un Spring MVC Rest Controller
- @RequestMapping qui permet au controller de mapper les requetes HTTP (GET, POST, PUT, DELETE, etc.). Cette annotation contiendra l'url qu'on va saisir au niveau de POSTMAN pour recevoir une réponse
- Sachant qu'on a déjà insérez des paiements manuellement, Vous allez aussi voir une méthode getAllPaiement() qui permet de renvoyer l'ensemble des paiement de la base de données

## La liste Sur POSTMAN 

![Capture4](https://github.com/ousmane07/ProjetSpringImpot/blob/master/4.png?raw=true)

Sur Postman on doit choisir GET puisque nous voulons recevoir la liste des paiements puis renseigner l'url de l'API en haut à gauche puis on clique sur send. C'est dans la section Body en bas qu'on doit recevoir un résultat. Dans mon cas j'ai eu des erreurs raison pour laquelle je ne recois pas encore la liste des paiements  


## Les API Rest ( Ajout d'une classe)

![Capture5](https://github.com/ousmane07/ProjetSpringImpot/blob/master/5.png?raw=true)
Dans cette partie, la méthode createPaiement aura une annotation @PostMapping au lieu de @GetMapping. Ceci s'explique par le fait que dans cette partie on insère, on fait une requete Post
Cette méthoe sauvegarde l'objet paiement

## L'ajout sur Postman

![Capture5](https://github.com/ousmane07/ProjetSpringImpot/blob/master/6.png?raw=true)

L'url reste la meme mais la requete change on met POST au lieu de GET, on clique sur Body puis sur raw puis on met les éléments à insérer comme dans la capture. Une fois qu'on clique sur send, les élèments insérés doivent etre enregistrer dans la base de données.

Voici en quelques lignes ce qu'on a eu à faire dans ce projet. Notons que les problèmes d'environnement m'ont fait perdre enormément de temps raison pour laquelle je n'ai pu finir le projet. Mais dans les jours qui souvent, on améliorera ce projet afin qu'il réponde aux exigences 



