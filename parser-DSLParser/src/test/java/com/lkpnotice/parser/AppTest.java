package com.lkpnotice.parser;

import java.io.IOException;

import com.lkpnotice.parser.test.ExprLexer;
import com.lkpnotice.parser.test.ExprParser;
import com.lkpnotice.parser.test.StringListener;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public static void main(String[] args) throws IOException {
        String inputStr = "100+2*34";
        ExprLexer lexer = new ExprLexer(new ANTLRInputStream(inputStr));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        ExprParser parser = new ExprParser(tokens);
        ParseTree tree = parser.expr();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new StringListener(), tree);

    }

}
