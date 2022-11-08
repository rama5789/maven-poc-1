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
-DgroupId=com.xtrimutil.app \
-DartifactId=xtrim-util-app \
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

$ java -cp target/xtrim-util-app-1.0-SNAPSHOT.jar com.xtrimutil.app.App
$ java -jar target/xtrim-util-app-1.0-SNAPSHOT.jar
Hello World!
Nov 07, 2022 11:49:52 PM com.xtrimutil.app.util.ApplicationProperties readProperty
INFO: Reading Property PORT
Nov 07, 2022 11:49:52 PM com.xtrimutil.app.App main
INFO: 4000

```

# Enforcer Setup

```sh
-------------------------------------------
# Enforce Rules
# https://maven.apache.org/enforcer/enforcer-rules/index.html
# https://maven.apache.org/enforcer/enforcer-rules/versionRanges.html

$ mvn validate

```
