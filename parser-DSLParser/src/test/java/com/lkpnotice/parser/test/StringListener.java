package com.lkpnotice.parser.test;

import com.lkpnotice.parser.test.ExprParser.ExprContext;

/**
 * Created by lkpnotice on 2017/8/13.
 */
public class StringListener extends  ExprBaseListener {

    @Override
    public void enterExpr(ExprContext ctx) {
        if (ctx.INT() == null){
            System.out.println(ctx.INT());
        }else {
            System.out.println(ctx.INT().getText());
        }
        super.enterExpr(ctx);
    }
}
