# Java API POC test app.

### Dependencies:
    Maven, Java8, Node, Gulp-cli, docker, docker-compose
    

## Install
1. Ensure all the above dependencies are installed.
2. Clone and CD into repo.
3. Run: mvn package - *builds the api jar used by docker.*
4. Run: gulp dev - *builds the /dist dir for the front end.*
5. Run: sudo service docker start
6. Run: sudo docker-compose up
7. localhost:8080


#### The app
You should see a simple web page with a single input field for your zip. 
Enter zip, click button. You should see values populate the list items, including a weather icon.
For each request, Nginx proxys the zip request to Tomcat API server on http://api:8090 (could be any URI).
The API code caches data in Mongo on another connected container; 3 containers total as illustrated
by the docker-compose.yml:
    
    webproxy:
      image: nginx
      ports:
        - "8080:8080"
      volumes:
        - ./docker.nginx/conf.d:/etc/nginx/conf.d
        - ./src/main/webapp:/usr/share/nginx/html
      links:
        - api:api
    
    api:
      build: .
      links:
        - mongodb:mongo
    
    mongodb:
      image: mongo
      volumes:
        - /data/db

