# gradle-antlr-example

An example of using ANTLR to generate a Parser and Lexer using Gradle.

## Building the Example
Run the following command to build the example:

    ./gradlew clean build
    
## Running the Example
Run the following command to start the example:

    ./gradlew run
    
If successful, you will see each expression found during parsing printed to the console:

    > Task :run
    [main] INFO at.mavila.antlr.Main - Running the example...
    [main] INFO at.mavila.antlr.MyListener - 10+20*30
    [main] INFO at.mavila.antlr.MyListener - 10
    [main] INFO at.mavila.antlr.MyListener - 20*30
    [main] INFO at.mavila.antlr.MyListener - 20
    [main] INFO at.mavila.antlr.MyListener - 30
    
## Bugs and Feedback
For bugs, questions, and discussions, please use the [Github Issues](https://github.com/totopoloco/antlr4_sample/issues).
