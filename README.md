# SeaBuild-API
This is the global api for all network related plugins for SeaBuild.net
## Table of Contents

- [Dependency](#dependency)
  - [Maven](#maven)
  - [Gradle](#gradle)
- [Components](#components)
  - [Get a Component](#get-a-component)
  - [Register a Component](#register-a-component)
- [Additional Annotations for Injections](#additional-annotations-for-injections)
  - [@Component](#component)
  - [@Listener](#listener)
  - [@Scheduler](#scheduler)
  - [@SubCommand](#subcommand)
## Dependency
### Maven
```
<repository>
  <id>flammenfuchs-repo-public</id>
  <name>Flammenfuchs_YT's Repository</name>
  <url>https://repo.flammenfuchs.de/public</url>
</repository>
```
```
<dependency>
    <groupId>net.seabuild</groupId>
    <artifactId>seabuild-api</artifactId>
    <version>%VERSION%</version>
</dependency>
```
### Gradle
```
maven {
	url "https://repo.flammenfuchs.de/public"
}
```
```
implementation("net.seabuild:seabuild-api:%VERSION%")
```
## Components
Components are used to access parts of the api
### Get a Component
#### Manually:
```
ExampleComponent example
    = SeaBuild.getComponent(ExampleComponent.class);
```
#### Automatic
All classes processed by Injections can simply inject components

```
@Inject
private ExampleComponent example;
```
### Register a Component
#### Manually
```
ExampleComponent example = new ExampleComponentImpl();
SeaBuild.putComponent(example, ExampleComponent.class);
```
#### Automatic
```
@Component(ExampleComponent.class)
public class ExampleComponentImpl implements ExampleComponent {

  ...

}
```
## Additional Annotations for Injections
### @Component
As stated in above, this annotation is used to register Components automatically
```
@Component(ExampleComponent.class)
```
#### Paramenters:
**value** *(needed)***:** <br>
The class of the implemented component

### @Listener
Methods annotated with @Listener are executed when a defined Event is called
```
@Listener(ExampleEvent.class)
```
#### Paramenters:
**value** *(needed)***:** <br>
The class of the Event<p>
**The method needs to have 1 parameter, the event itself.**

### @Scheduler
Methods annotated with @Scheduler are executed in a scheduler
```
@Scheduler(async = true, delay = 1, repeating = 20)
```
#### Paramenters:
**async** *(not needed)***:** <br>
The default value is `false`.<br>
**delay** *(needed)***:** <br>
The delay of the scheduler in ticks.<br>
**repeating** *(not needed)***:** <br>
The default value is `0L` and gives the repeating time in ticks. `0L` means it is not repeating<br>

### @SubCommand
Methods annotated with @Scheduler are executed in a scheduler
```
@SubCommand(ExampleCommand.class)
```
#### Paramenters:
**value** *(needed)***:** <br>
The parent command to register<br>
