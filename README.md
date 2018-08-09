# newSpot

![alt text](https://raw.githubusercontent.com/SKozak/news-app/master/screen.png)

## Use docker compose to run project

* Run only backend app
  * Open terminal in cloned project folder 
  * type docker-compose build new-spot-core after that type docker-compose up new-spot-core
* Or run with frontend server
  * clone https://github.com/SKozak/newSpot and https://github.com/SKozak/news-app to one directory for example "newsDir"
  * copy docker-compose.yml from one of above cloned project to newsDir 
  * open terminal in newsDir type docker-compose build after that type docker-compose up

backend app starts on localhost:8080
frontend app starts on localhost:8082
