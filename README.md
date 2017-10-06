# ribbon-testing

##build all applications

###
    sampleeureka$ gradle clean build 
###
    sampleeureka$java -jar build/lib/*.jar

###
     profile$gradle clean build
     profile$java -jar -DPUBLIC_PORT=8090 build/lib/*.jar
     profile$java -jar -DPUBLIC_PORT=8091 build/lib/*.jar
     profile$java -jar -DPUBLIC_PORT=8092 build/lib/*.jar
  
###
    aggregator$gradle clean build
    aggregator$java -jar build/lib/*.jar
  
  
  repeadely access/query : `http://localhost:9090/welcome` and observ that request going to different servers in round robbin fashion.
  
  now stop one the profile server (say 8092) and repeadely access/query : `http://localhost:9090/welcome` and  observ few requests resulted in 500 error (connection errors in aggregator application)
  
  
  
  
