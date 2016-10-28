This proof-of-concept project aims to make a binary port of a Java 8 API to an earlier Java major versions.
The experiment is based on a simple Java 8 Stream API example supposed to run on Java 6:

```java
Stream.of(args).map(String::toUpperCase).forEach(EntryPoint::dump)
```

Requirements:

* JDK 1.8
* Ant 1.9.7
* JDK or JRE 1.6 to run the ported code

# How to build

To build the project, use the following command:

```
ant clean all
```

or alternatively:

```
./build.sh
```

# How to run

Once the target artifacts are built, the target artifacts (both downgraded JDK 8 classes and the test classes) can be ran on different JVMs.

To run the example on Java 8, make sure you have the environment variable `JDK_8_HOME` variable set to your Java 8 home.
To run the example on Java 6, make sure you have `JDK_6_HOME` set.
Once the variables exist, run:

```
ant run-as-java-8
```

or alternatively:

```
./run-java-8.sh
```

If the command above succeeds, then the Java 6-targeted exampled can be launched: 

```
ant run-as-java-6
```

or alternatively:

```
./run-java-6.sh
```

# Results

The result programmatic output of both `run-as-java-6` and `run-as-java-8` is expected to be the same:
 
```
pre: stream
>FOO
>BAR
>BAZ
post: stream
```
