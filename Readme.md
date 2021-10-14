######################################################################################
Execute tests on docker:
######################################################################################
1. Selenium hub
   docker pull selenium/hub:3.141.59

2. Selenium firefox node
   docker pull selenium/node-firefox

3. Selenium chrome node - docker pull selenium/node-chrome:3.141.59
4. Selenium firefox debug - docker pull selenium/node-firefox-debug
5. Selenium chrome debug - docker pull selenium/node-chrome-debug
6. run: docker images
7. start selenium hub - docker run -d -p 4444:4444 --name selenium-hub selenium/hub
   check if the hub works: http://localhost:4444/grid/console
8. run chrome node: docker run -d -v /dev/shm:/dev/shm --privileged --link selenium-hub:hub selenium/node-chrome:3.141.59
9. run firefox node: docker run -d -v /dev/shm:/dev/shm --privileged --link selenium-hub:hub selenium/node-firefox
10. run the chrome debug: docker run -d --link selenium-hub:hub selenium/node-chrome-debug
11. run the firefox debug: docker run -d --link selenium-hub:hub selenium/node-firefox-debug


######################################################################################
Docker compose
######################################################################################

1. Start the infrastructure: docker compose -f docker-compose.yml up -d
2. Stop the infrastructure docker-compose -f docker-compose.yml down