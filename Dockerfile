FROM anapsix/alpine-java
MAINTAINER ram 
COPY BillChangeApp.jar /home/BillChangeApp.jar
CMD ["java","-jar","/home/BillChangeApp.jar"]

