# VSC Java project using Maven

This is an example of a Java project for Visual Studio Code.
It uses a Maven pom.xml file to organize the build and classpath.

You will need the "Java Extension Pack" in VSC.  
Obviously, you'll also need to install Java and set up the JAVA_HOME environment variable.
Also, install Maven and set up the MAVEN_HOME environment variable.

A nice feature here is that VSC generates the dot-files for Eclipse.

## How to create a VSC project for Maven

1. In the VSC terminal:
   1. Move to the parent directory of your new project
   2. User maven to create the project folder:  `mvn archetype:generate -DgroupId=keith -DartifactId=sample`
   3. You will now have a sample project, with a main class named `App`
2. In VSC, use File > Open... to open the new project folder.
3. In the File Explorer, on the bottom right, there will be a list of "Maven Projects".  Right clicking on your project will bring up a list of Maven goals.  Execute the "package" goal to compile everything.
4. Modify the existing Java files.  Change `App` to whatever you need.
5. Modify the `pom.xml` file to contain your actual dependencies.
6. Do File > Save Workspace as... to create a workspace file inside the project folder.

