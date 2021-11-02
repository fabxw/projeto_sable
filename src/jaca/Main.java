package jaca;
import java.io.*;

import jaca.lexer.*;
import jaca.node.*;
import jaca.parser.*;

public class Main
{
 public static void main(String[] args)
 {
  try
  {
   String arquivo = "teste/Codigo3.jaca";
  
   Lexer lex = new Lexer(
		    new PushbackReader(  
		    new FileReader(arquivo), 1024));
   
   Parser p = new Parser(lex); 
   
   Start tree = p.parse();
   //Imprime �rvore na sa�da padr�o
   //tree.apply(new ASTPrinter());
   //Imprime �rvore em interface gr�fica
   tree.apply(new ASTDisplay());
  }
  catch(Exception e)
  {
   System.out.println(e.getMessage());
  }
 }
}