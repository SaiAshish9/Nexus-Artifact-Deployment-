https://medium.com/mobile-app-development-publication/setup-local-nexus-repository-easily-623b2017ddfd

https://help.sonatype.com/repomanager3/product-information/download

```
tar xvzf nexus-3.47.1-01-unix.tar.gz

Two folders will be created
/nexus-3.47.1-01
/sonatype-work

cd nexus-3.47.1-01/bin
./nexus run

admin password:

./sonatype-work/nexus3/admin.password

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
