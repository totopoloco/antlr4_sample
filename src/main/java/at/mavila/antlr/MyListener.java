package at.mavila.antlr;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyListener extends ExprBaseListener {

  @Override
  public void enterExpr(final ExprParser.ExprContext exprContext) {
    log.info("Entering expression: {}", exprContext.getText());

  }
}
