# samplejava

    mvn dependency:copy-dependencies  
copies the dependencies defined in the POM into the dependency folder in the target folder

    mvn package                       
creates a jar (or whatever target format is defined in the POM) in the project's target folder

    mvn install                       
puts the jar into the maven repo <user>\.m2\repository
