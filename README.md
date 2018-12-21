# controller-archetype
> Controller Archetype Generator

This maven archetype generates a WelcomeController for a Java Spring boot project. It will generate the WelcomeController from a scaffolding template and will not include any sorts of dependecies modifications.

Besides generating WelcomeController it will also generate WelcomeControllerTest.java used for unit testing.

## Usage

### Build and Install

In order to install the archetype definition install it with maven.

```bash
mvn install
```

### WelcomeController Generation

In order to create a project containing this WelcomeController and it's test use the following command

#### params to reference this archetype
- archetypeGroupId=net.linoman
- archetypeArtifactId=controller-archetype
- archetypeVersion=1.0-SNAPSHOT

#### params used to fill templtes
- groupId=my.example.demo
- artifactId=my-new-artifact
- version=1.0-SNAPSHOT

```bash
mvn archetype:generate \
    -DarchetypeGroupId=net.linoman \
    -DarchetypeArtifactId=controller-archetype \
    -DarchetypeVersion=1.0-SNAPSHOT \
    -DgroupId=my.example.demo \
    -DartifactId=my-new-artifact \
    -Dversion=1.0-SNAPSHOT
```