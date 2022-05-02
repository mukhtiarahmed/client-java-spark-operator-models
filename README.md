# Spark Operator Model Classes
This module contains the Java model classes generated from the release version of [spark operator](https://github.com/GoogleCloudPlatform/spark-on-k8s-operator/blob/master/manifest/crds/sparkoperator.k8s.io_sparkapplications.yaml) CRDs.

## Usage
To use this library, include the following maven dependencies
```xml
        <dependency>
            <groupId>io.kubernetes</groupId>
            <artifactId>client-java-api</artifactId>
            <version>15.0.0</version>
        </dependency>
        <dependency>
            <groupId>io.kubernetes</groupId>
            <artifactId>client-java-extended</artifactId>
            <version>15.0.0</version>
        </dependency>
		<dependency>
			<groupId>io.kubernetes</groupId>
			<artifactId>client-java-spark-operator-models</artifactId>
			<version>15.0.0</version>
		</dependency>
```
