FROM ubuntu:latest
RUN apt-get update 
 
RUN apt-get install -y openjdk-21-jdk 
    
RUN apt-get install -y ant

RUN apt-get install git -y

RUN java -version && ant -version

WORKDIR /app


RUN git clone -b pro_reliaze https://github.com/nastya1989db/calculatorapp.git

RUN ant -f calculatorapp/minus/build_minus.xml
RUN ant -f calculatorapp/plus/build_plus.xml
RUN ant -f calculatorapp/other/build_other.xml

CMD ["java", "-cp", "Main.jar:/app/calculatorapp/other/jarAll/CalculatorMinus.jar:/app/calculatorapp/other/jarAll/CalculatorSum.jar:/app/calculatorapp/other/build", "Main"]


