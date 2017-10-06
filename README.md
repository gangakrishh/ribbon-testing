# ribbon-testing

##build all applications

  cd sampleeureka
  gradle clean build 
  run `java -jar build/lib/*.jar`
  
  cd profile
  gradle clean build
  run `java -jar -DPUBLIC_PORT=8090 build/lib/*.jar`
  run `java -jar -DPUBLIC_PORT=8091 build/lib/*.jar`
  run `java -jar -DPUBLIC_PORT=8092 build/lib/*.jar`
  
  
  cd aggregator
  gradle clean build
  run `java -jar build/lib/*.jar`
  
  
  repeadely access/query : `http://localhost:9090/welcome` and observ that request going to different servers in round robbin fashion.
  
  now stop one the profile server (say 8092) and repeadely access/query : `http://localhost:9090/welcome` and  observ few requests resulted in 500 error (connection errors in aggregator application)
  
  
  
  