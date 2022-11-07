# Setup a Maven Project

```sh
-------------------------------------------
# Check maven version

$ mvn --version
Apache Maven 3.8.1 (05c21c65bdfed0f71a2f2ada8b84da59348c4c5d)
Maven home: C:\MyProgramFiles\java\apache-maven-3.8.1
Java version: 17.0.4.1, vendor: Amazon.com Inc., runtime: C:\MyProgramFiles\java\jdk\jdk17.0.4_9_amazon
Default locale: en_IN, platform encoding: Cp1252
OS name: "windows 11", version: "10.0", arch: "amd64", family: "windows"

# create a maven project
# https://maven.apache.org/archetypes/maven-archetype-quickstart/
# https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html

$ mvn archetype:generate \
-DgroupId=com.xtrim.app \
-DartifactId=xtrim-app \
-DarchetypeArtifactId=maven-archetype-quickstart \
-DarchetypeVersion=1.4 \
-DinteractiveMode=false

-------------------------------------------
# Create a maven wrapper
# https://maven.apache.org/wrapper/

$ mvn wrapper:wrapper -Dmaven=3.8.6

$ mvnw --version
Apache Maven 3.8.6 (84538c9988a25aec085021c365c560670ad80f63)
Maven home: C:\Users\erram\.m2\wrapper\dists\apache-maven-3.8.6-bin\67568434\apache-maven-3.8.6
Java version: 17.0.4.1, vendor: Amazon.com Inc., runtime: C:\MyProgramFiles\java\jdk\jdk17.0.4_9_amazon
Default locale: en_IN, platform encoding: Cp1252
OS name: "windows 11", version: "10.0", arch: "amd64", family: "windows"

```

# Execute a Maven Jar

```sh
-------------------------------------------
# Execute directly

$ java -cp target/xtrim-app-1.0-SNAPSHOT.jar com.xtrim.app.App
$ java -jar target/xtrim-app-1.0-SNAPSHOT.jar
Hello World!
Exception in thread "main" java.lang.NoClassDefFoundError: org/apache/commons/lang3/StringUtils
        at com.xtrim.app.App.main(App.java:12)
Caused by: java.lang.ClassNotFoundException: org.apache.commons.lang3.StringUtils
        at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
        at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
        at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:520)
        ... 1 more

# Execute with classpath

$ java -cp C:\Users\erram\.m2\repository\org\apache\commons\commons-lang3\3.12.0\commons-lang3-3.12.0.jar;C:\Users\erram\.m2\repository\joda-time\joda-time\2.12.1\joda-time-2.12.1.jar;target/xtrim-app-1.0-SNAPSHOT.jar com.xtrim.app.App
$ java -cp C:\Users\erram\.m2\repository\org\apache\commons\commons-lang3\3.12.0\*;C:\Users\erram\.m2\repository\joda-time\joda-time\2.12.1\*;target/xtrim-app-1.0-SNAPSHOT.jar com.xtrim.app.App
Hello world!
Hello world
The current local time is: 15:30:51.095
```

# Execute a Maven Uber Jar

```sh
-------------------------------------------
# jars generated

$ ls target/ | grep .jar
original-xtrim-app-1.0-SNAPSHOT.jar
xtrim-app-1.0-SNAPSHOT.jar

# Execute directly (thin jar)

$ java -jar target/original-xtrim-app-1.0-SNAPSHOT.jar
Hello world!
Exception in thread "main" java.lang.NoClassDefFoundError: org/apache/commons/lang3/StringUtils
:::::::::::::::

# Execute directly (Uber jar)

$ java -jar target/xtrim-app-1.0-SNAPSHOT.jar
Hello world!
Hello world
The current local time is: 22:17:03.502

```

# Enforcer Setup

```sh
-------------------------------------------
# Enforce Rules
# https://maven.apache.org/enforcer/enforcer-rules/index.html
# https://maven.apache.org/enforcer/enforcer-rules/versionRanges.html

$ mvn validate

```

# Exclude a dependent jar from Uber Jar

```sh
-------------------------------------------
# Exclude a jar
# Make the scope fo the jar "provided"

$ java -jar target/xtrim-app-1.0-SNAPSHOT.jar
Hello world!
Hello world
Exception in thread "main" java.lang.NoClassDefFoundError: org/joda/time/LocalTime
        at com.xtrim.app.App.main(App.java:18)
:::::::::::::::

```
