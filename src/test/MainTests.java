package test;

import main.Main;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MainTests {
  private ByteArrayOutputStream output = new ByteArrayOutputStream();

  @Before
  public void setOutput() {
    System.setOut(new PrintStream(output));
  }

  @Test
  public void testStrings() {
    String[] strings = {"qwe", "wqe", "", "qwee", "a", "a"};
    Main.function(strings);
    Assert.assertEquals("a=4,5 eqw=0,1 ", output.toString());
  }

  @Test
  public void testNull() {
    String[] strings = {};
    Main.function(strings);
    Assert.assertEquals("Неверный ввод", output.toString());
  }

  @After
  public void cleanUpStreams() {
    System.setOut(null);
  }
}
