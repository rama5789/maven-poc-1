# Run commands

```sh
-----------------------------------------
# xtrim-util-app-1.0-SNAPSHOT.jar included in xtrim-app-1.0-SNAPSHOT.jar


-----------------------------------------
# xtrim-util-app-1.0-SNAPSHOT.jar not included in xtrim-app-1.0-SNAPSHOT.jar

# Scenario - 1

$ java -cp C:\MyTemp\MavenWS\xtrim-app\extra_jars\xtrim-util-app-1.0-SNAPSHOT.jar;C:\MyTemp\MavenWS\xtrim-app\target\xtrim-app-1.0-SNAPSHOT.jar com.xtrim.app.App
Hello world!
Hello world
The current local time is: 09:41:24.302
Nov 08, 2022 9:41:24 AM com.xtrim.app.util.ApplicationProperties readProperty
INFO: Reading Property PORT
Nov 08, 2022 9:41:24 AM com.xtrim.app.App main
INFO: 4000
Nov 08, 2022 9:41:24 AM com.xtrimutil.app.util.ApplicationProperties readProperty
INFO: Reading Property PORT
Nov 08, 2022 9:41:24 AM com.xtrim.app.App main
INFO: 4000
Nov 08, 2022 9:41:24 AM com.xtrimutil.app.util.ApplicationProperties readProperty
INFO: Reading Property PORT2
Nov 08, 2022 9:41:24 AM com.xtrim.app.App main
INFO: 4001

# Scenario - 2

$ java -cp C:\MyTemp\MavenWS\xtrim-app\target\xtrim-app-1.0-SNAPSHOT.jar;C:\MyTemp\MavenWS\xtrim-app\extra_jars\xtrim-util-app-1.0-SNAPSHOT.jar com.xtrim.app.App
Hello world!
Hello world
The current local time is: 09:41:45.822
Nov 08, 2022 9:41:45 AM com.xtrim.app.util.ApplicationProperties readProperty
INFO: Reading Property PORT
Nov 08, 2022 9:41:45 AM com.xtrim.app.App main
INFO: 3000
Nov 08, 2022 9:41:45 AM com.xtrimutil.app.util.ApplicationProperties readProperty
INFO: Reading Property PORT
Nov 08, 2022 9:41:45 AM com.xtrim.app.App main
INFO: 3000
Nov 08, 2022 9:41:45 AM com.xtrimutil.app.util.ApplicationProperties readProperty
INFO: Reading Property PORT2
Nov 08, 2022 9:41:45 AM com.xtrim.app.App main
INFO: There is no key in the properties file
```
