Steps to Run the Project 

 1 .  Clone it.
 2 .  And Open home.html 
 
 Steps to Deploy on Heroku
 
1. Add a file called composer.json to the root directory by running touch composer.json
2. Add a file called index.php to the root directory by running touch index.php
3. Rename the homepage (e.g. index.html) to home.html
4. In index.php, add the following line: <?php include_once("home.html"); ?>
5. In composer.json, add the following line: {}
6. Run git push heroku master
 
