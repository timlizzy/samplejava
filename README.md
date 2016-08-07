# samplejava

    git clone https://github.com/timlizzy/samplejava
    cd samplejava
    cd my-app
    mvn package
    cd ../my-base
    mvn package
    cd ..
    cd my-app/target/classes
    java -classpath ".;..\..\..\my-base\target\classes" com.mycompany.app.App
