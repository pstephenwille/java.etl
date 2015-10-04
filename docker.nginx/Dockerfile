FROM nginx
RUN bash -c 'rm /etc/nginx/sites-available/default'
VOLUME ../src/main/webapp /usr/share/nginx/html
VOLUME conf.d /etc/nginx/conf.d