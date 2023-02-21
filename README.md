https://medium.com/mobile-app-development-publication/setup-local-nexus-repository-easily-623b2017ddfd

https://help.sonatype.com/repomanager3/product-information/download

```
tar xvzf nexus-3.47.1-01-unix.tar.gz

Two folders will be created
/nexus-3.47.1-01
/sonatype-work

cd nexus-3.47.1-01/bin
./nexus run

./nexus run
No suitable Java Virtual Machine could be found on your system.
The version of the JVM must be 1.8.
Please define INSTALL4J_JAVA_HOME to point to a suitable JVM.

export INSTALL4J_JAVA_HOME=/usr/local/opt/openjdk@8/bin

./nexus run   
2023-02-22 00:30:28,018+0530 INFO  [FelixStartLevel] *SYSTEM org.sonatype.nexus.pax.logging.NexusLogActivator - start
2023-02-22 00:30:28,368+0530 INFO  [FelixStartLevel] *SYSTEM org.sonatype.nexus.features.internal.FeaturesWrapper - Fast FeaturesService starting
2023-02-22 00:30:29,185+0530 INFO  [FelixStartLevel] *SYSTEM ROOT - bundle org.apache.felix.scr:2.1.30 (54) Starting with globalExtender setting: false
2023-02-22 00:30:29,190+0530 INFO  [FelixStartLevel] *SYSTEM ROOT - bundle org.apache.felix.scr:2.1.30 (54)  Version = 2.1.30
2023-02-22 00:30:29,437+0530 WARN  [FelixStartLevel] *SYSTEM uk.org.lidalia.sysoutslf4j.context.SysOutOverSLF4JInitialiser - Your logging framework class org.ops4j.pax.logging.slf4j.Slf4jLogger is not known - if it needs access to the standard println methods on the console you will need to register it by calling registerLoggingSystemPackage

brew install openjdk@8

java --version
openjdk 17.0.5 2022-10-18 LTS
OpenJDK Runtime Environment Corretto-17.0.5.8.1 (build 17.0.5+8-LTS)
OpenJDK 64-Bit Server VM Corretto-17.0.5.8.1 (build 17.0.5+8-LTS, mixed mode, sharing)

admin password:

cat ./sonatype-work/nexus3/admin.password
73a7354d-7bf2-49bd-bf45-21f7efc94630

New password: admin

Click on the copy button and it will display the URL you can upload the library,
e.g. http://localhost:8081/repository/maven-releases/
```

```
Using the URL in your Android Gradle file upload library

repositories {
    maven {
        url = uri(http://localhost:8081/repository/maven-releases/)
        setAllowInsecureProtocol(true)
        credentials {
            username = "admin"
            password = "mynexuspassword"
        }
    }
}
```

```
Using the URL in your Android Gradle file to download the libraries

repositories {
    maven {
        setAllowInsecureProtocol(true)
        url "http://localhost:8081/repository/maven-releases/"
    }
    google()
    mavenCentral()
}
```

<img width="1260" alt="Screenshot 2023-02-22 at 12 32 22 AM" src="https://user-images.githubusercontent.com/43849911/220435577-908e371d-eb5c-4147-bf27-f67e7a0ae48b.png">

<img width="1258" alt="Screenshot 2023-02-22 at 12 32 44 AM" src="https://user-images.githubusercontent.com/43849911/220435634-148fde80-d444-4aef-999e-ae18069ebbe3.png">

<img width="1260" alt="Screenshot 2023-02-22 at 12 34 07 AM" src="https://user-images.githubusercontent.com/43849911/220435901-d4939280-6518-4278-abc7-c26a1d78cdad.png">

<img width="1261" alt="Screenshot 2023-02-22 at 12 34 57 AM" src="https://user-images.githubusercontent.com/43849911/220436029-522d2ed4-780a-46ef-bcea-6620a4b771a8.png">

<img width="1263" alt="Screenshot 2023-02-22 at 12 36 49 AM" src="https://user-images.githubusercontent.com/43849911/220436362-7f50d43b-c1ed-4b77-a8ed-430312297bf0.png">

<img width="1257" alt="Screenshot 2023-02-22 at 12 37 23 AM" src="https://user-images.githubusercontent.com/43849911/220436469-321d65b9-3a87-4b15-8b89-4c003be36712.png">

<img width="1166" alt="Screenshot 2023-02-22 at 12 54 57 AM" src="https://user-images.githubusercontent.com/43849911/220439657-4aab57cd-1ddc-4591-9a11-f5fc994b66c0.png">

