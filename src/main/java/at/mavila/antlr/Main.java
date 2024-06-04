package at.mavila.antlr;

import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

@Slf4j
public class Main {

  public static void main(String... args) {
    log.info("Running the example...");

    ExprLexer lexer = new ExprLexer(CharStreams.fromString("""
        10+20*30
        
        """));

    CommonTokenStream tokens = new CommonTokenStream(lexer);
    ExprParser parser = new ExprParser(tokens);
    ParseTree parseTree = parser.expr();

    ParseTreeWalker walker = new ParseTreeWalker();
    final ExprListener listener = new MyListener();
    walker.walk(listener, parseTree);
  }
}