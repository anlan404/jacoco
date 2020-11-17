http://localhost:8080/swagger-ui.html

java -javaagent:C:\Users\admin\Desktop\jacoco\jacocoagent.jar,output=tcpserver,port=8893,address=192.168.0.104 -Xverify:none -jar jacoco_test-0.0.1-SNAPSHOT.jar

-javaagent:/Users/importzhh/Soft/jacoco/jacoco-0.8.6/lib/jacocoagent.jar=includes=com.importzhh.*,output=tcpserver,port=6300,address=127.0.0.1 -Xverify:none

ant dump

ant report

https://testerhome.com/topics/22950