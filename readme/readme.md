http://localhost:8080/swagger-ui.html

java -javaagent:C:\Users\admin\Desktop\jacoco\jacocoagent.jar=includes=com.importzhh.*,output=tcpserver,port=8893,address=192.168.0.102 -Xverify:none -jar jacoco_test-0.0.1-SNAPSHOT.jar

ant dump

ant report

https://testerhome.com/topics/22950