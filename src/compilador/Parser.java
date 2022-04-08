
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package compilador;

import java.io.*;
import java_cup.runtime.*;
import compilador.Lexico;
import java_cup.runtime.ComplexSymbolFactory.Location;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\057\000\002\002\012\000\002\002\004\000\002\003" +
    "\004\000\002\004\003\000\002\004\003\000\002\004\003" +
    "\000\002\004\003\000\002\004\003\000\002\004\004\000" +
    "\002\005\006\000\002\005\005\000\002\005\004\000\002" +
    "\006\003\000\002\006\003\000\002\006\003\000\002\006" +
    "\003\000\002\006\003\000\002\007\003\000\002\007\005" +
    "\000\002\010\003\000\002\010\003\000\002\010\003\000" +
    "\002\010\003\000\002\011\003\000\002\011\003\000\002" +
    "\011\003\000\002\011\003\000\002\011\003\000\002\011" +
    "\003\000\002\012\003\000\002\012\005\000\002\012\005" +
    "\000\002\013\003\000\002\013\003\000\002\013\003\000" +
    "\002\014\014\000\002\015\006\000\002\015\006\000\002" +
    "\016\003\000\002\017\011\000\002\020\006\000\002\020" +
    "\004\000\002\020\004\000\002\020\004\000\002\020\004" +
    "\000\002\021\004\000\002\021\004" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\121\000\004\004\004\001\002\000\004\046\007\001" +
    "\002\000\004\002\006\001\002\000\004\002\000\001\002" +
    "\000\004\021\010\001\002\000\002\001\002\000\020\007" +
    "\022\011\012\012\016\013\013\014\015\022\014\046\021" +
    "\001\002\000\006\027\ufffe\046\ufffe\001\002\000\006\027" +
    "\ufffb\046\ufffb\001\002\000\004\023\031\001\002\000\006" +
    "\027\ufffa\046\ufffa\001\002\000\006\027\ufffd\046\ufffd\001" +
    "\002\000\020\007\uffff\011\uffff\012\uffff\013\uffff\014\uffff" +
    "\022\uffff\046\uffff\001\002\000\006\027\026\046\025\001" +
    "\002\000\004\026\023\001\002\000\006\027\ufffc\046\ufffc" +
    "\001\002\000\016\007\022\011\012\012\016\013\013\014" +
    "\015\046\021\001\002\000\024\007\ufff7\011\ufff7\012\ufff7" +
    "\013\ufff7\014\ufff7\021\ufff7\022\ufff7\034\ufff7\046\ufff7\001" +
    "\002\000\026\007\ufff6\011\ufff6\012\ufff6\013\ufff6\014\ufff6" +
    "\021\ufff6\022\ufff6\026\027\034\ufff6\046\ufff6\001\002\000" +
    "\006\027\ufff9\046\ufff9\001\002\000\016\007\022\011\012" +
    "\012\016\013\013\014\015\046\021\001\002\000\024\007" +
    "\ufff8\011\ufff8\012\ufff8\013\ufff8\014\ufff8\021\ufff8\022\ufff8" +
    "\034\ufff8\046\ufff8\001\002\000\036\005\034\006\033\007" +
    "\022\010\046\011\012\012\016\013\013\014\015\015\035" +
    "\016\032\017\041\046\036\047\047\052\037\001\002\000" +
    "\014\007\uffe0\011\uffe0\012\uffe0\013\uffe0\014\uffe0\001\002" +
    "\000\066\005\ufff2\006\ufff2\007\ufff2\010\ufff2\011\ufff2\012" +
    "\ufff2\013\ufff2\014\ufff2\015\ufff2\016\ufff2\017\ufff2\022\ufff2" +
    "\026\ufff2\030\ufff2\031\ufff2\032\ufff2\033\ufff2\035\ufff2\036" +
    "\ufff2\037\ufff2\040\ufff2\041\ufff2\042\ufff2\046\ufff2\047\ufff2" +
    "\052\ufff2\001\002\000\036\005\uffdb\006\uffdb\007\uffdb\010" +
    "\uffdb\011\uffdb\012\uffdb\013\uffdb\014\uffdb\015\uffdb\016\uffdb" +
    "\017\uffdb\046\uffdb\047\uffdb\052\uffdb\001\002\000\014\007" +
    "\uffe1\011\uffe1\012\uffe1\013\uffe1\014\uffe1\001\002\000\066" +
    "\005\ufff5\006\ufff5\007\ufff5\010\ufff5\011\ufff5\012\ufff5\013" +
    "\ufff5\014\ufff5\015\ufff5\016\ufff5\017\ufff5\021\121\026\023" +
    "\030\ufff5\031\ufff5\032\ufff5\033\ufff5\035\ufff5\036\ufff5\037" +
    "\ufff5\040\ufff5\041\ufff5\042\ufff5\046\ufff5\047\ufff5\052\ufff5" +
    "\001\002\000\066\005\ufff4\006\ufff4\007\ufff4\010\ufff4\011" +
    "\ufff4\012\ufff4\013\ufff4\014\ufff4\015\ufff4\016\ufff4\017\ufff4" +
    "\022\ufff4\026\ufff4\030\ufff4\031\ufff4\032\ufff4\033\ufff4\035" +
    "\ufff4\036\ufff4\037\ufff4\040\ufff4\041\ufff4\042\ufff4\046\ufff4" +
    "\047\ufff4\052\ufff4\001\002\000\036\005\034\006\033\007" +
    "\022\010\046\011\012\012\016\013\013\014\015\015\035" +
    "\016\032\017\041\046\036\047\047\052\037\001\002\000" +
    "\014\007\uffdf\011\uffdf\012\uffdf\013\uffdf\014\uffdf\001\002" +
    "\000\036\005\034\006\033\007\022\010\046\011\012\012" +
    "\016\013\013\014\015\015\035\016\032\017\041\046\036" +
    "\047\047\052\037\001\002\000\036\005\034\006\033\007" +
    "\022\010\046\011\012\012\016\013\013\014\015\015\035" +
    "\016\032\017\041\046\036\047\047\052\037\001\002\000" +
    "\014\007\022\011\012\012\016\013\013\014\015\001\002" +
    "\000\036\005\034\006\033\007\022\010\046\011\012\012" +
    "\016\013\013\014\015\015\035\016\032\017\041\046\036" +
    "\047\047\052\037\001\002\000\066\005\ufff1\006\ufff1\007" +
    "\ufff1\010\ufff1\011\ufff1\012\ufff1\013\ufff1\014\ufff1\015\ufff1" +
    "\016\ufff1\017\ufff1\022\ufff1\026\ufff1\030\ufff1\031\ufff1\032" +
    "\ufff1\033\ufff1\035\ufff1\036\ufff1\037\ufff1\040\ufff1\041\ufff1" +
    "\042\ufff1\046\ufff1\047\ufff1\052\ufff1\001\002\000\066\005" +
    "\ufff3\006\ufff3\007\ufff3\010\ufff3\011\ufff3\012\ufff3\013\ufff3" +
    "\014\ufff3\015\ufff3\016\ufff3\017\ufff3\022\ufff3\026\ufff3\030" +
    "\ufff3\031\ufff3\032\ufff3\033\ufff3\035\ufff3\036\ufff3\037\ufff3" +
    "\040\ufff3\041\ufff3\042\ufff3\046\ufff3\047\ufff3\052\ufff3\001" +
    "\002\000\004\024\103\001\002\000\006\021\072\034\073" +
    "\001\002\000\062\005\uffe4\006\uffe4\007\uffe4\010\uffe4\011" +
    "\uffe4\012\uffe4\013\uffe4\014\uffe4\015\uffe4\016\uffe4\017\uffe4" +
    "\030\065\031\061\032\054\033\062\035\063\036\056\037" +
    "\053\040\057\041\060\042\064\046\uffe4\047\uffe4\052\uffe4" +
    "\001\002\000\014\006\uffea\010\uffea\046\uffea\047\uffea\052" +
    "\uffea\001\002\000\014\006\uffec\010\uffec\046\uffec\047\uffec" +
    "\052\uffec\001\002\000\014\006\033\010\046\046\067\047" +
    "\047\052\037\001\002\000\014\006\uffe5\010\uffe5\046\uffe5" +
    "\047\uffe5\052\uffe5\001\002\000\014\006\uffe9\010\uffe9\046" +
    "\uffe9\047\uffe9\052\uffe9\001\002\000\014\006\uffe8\010\uffe8" +
    "\046\uffe8\047\uffe8\052\uffe8\001\002\000\014\006\uffed\010" +
    "\uffed\046\uffed\047\uffed\052\uffed\001\002\000\014\006\uffeb" +
    "\010\uffeb\046\uffeb\047\uffeb\052\uffeb\001\002\000\014\006" +
    "\uffe6\010\uffe6\046\uffe6\047\uffe6\052\uffe6\001\002\000\014" +
    "\006\uffe7\010\uffe7\046\uffe7\047\uffe7\052\uffe7\001\002\000" +
    "\014\006\uffee\010\uffee\046\uffee\047\uffee\052\uffee\001\002" +
    "\000\014\006\033\010\046\046\067\047\047\052\037\001" +
    "\002\000\066\005\ufff5\006\ufff5\007\ufff5\010\ufff5\011\ufff5" +
    "\012\ufff5\013\ufff5\014\ufff5\015\ufff5\016\ufff5\017\ufff5\022" +
    "\ufff5\026\ufff5\030\ufff5\031\ufff5\032\ufff5\033\ufff5\035\ufff5" +
    "\036\ufff5\037\ufff5\040\ufff5\041\ufff5\042\ufff5\046\ufff5\047" +
    "\ufff5\052\ufff5\001\002\000\036\005\uffe3\006\uffe3\007\uffe3" +
    "\010\uffe3\011\uffe3\012\uffe3\013\uffe3\014\uffe3\015\uffe3\016" +
    "\uffe3\017\uffe3\046\uffe3\047\uffe3\052\uffe3\001\002\000\036" +
    "\005\uffe2\006\uffe2\007\uffe2\010\uffe2\011\uffe2\012\uffe2\013" +
    "\uffe2\014\uffe2\015\uffe2\016\uffe2\017\uffe2\046\uffe2\047\uffe2" +
    "\052\uffe2\001\002\000\014\006\033\010\046\046\067\047" +
    "\047\052\037\001\002\000\014\006\033\010\046\046\067" +
    "\047\047\052\037\001\002\000\036\005\034\006\033\007" +
    "\022\010\046\011\012\012\016\013\013\014\015\015\035" +
    "\016\032\017\041\046\036\047\047\052\037\001\002\000" +
    "\006\020\uffd9\024\uffd9\001\002\000\004\022\102\001\002" +
    "\000\006\022\ufff0\026\100\001\002\000\014\006\033\010" +
    "\046\046\067\047\047\052\037\001\002\000\004\022\uffef" +
    "\001\002\000\036\005\uffdc\006\uffdc\007\uffdc\010\uffdc\011" +
    "\uffdc\012\uffdc\013\uffdc\014\uffdc\015\uffdc\016\uffdc\017\uffdc" +
    "\046\uffdc\047\uffdc\052\uffdc\001\002\000\004\002\001\001" +
    "\002\000\006\020\uffd8\024\uffd8\001\002\000\006\027\026" +
    "\046\106\001\002\000\004\021\107\001\002\000\002\001" +
    "\002\000\020\007\022\011\012\012\016\013\013\014\015" +
    "\022\111\046\021\001\002\000\004\023\112\001\002\000" +
    "\036\005\034\006\033\007\022\010\046\011\012\012\016" +
    "\013\013\014\015\015\035\016\032\017\041\046\036\047" +
    "\047\052\037\001\002\000\004\020\114\001\002\000\004" +
    "\024\115\001\002\000\036\005\uffde\006\uffde\007\uffde\010" +
    "\uffde\011\uffde\012\uffde\013\uffde\014\uffde\015\uffde\016\uffde" +
    "\017\uffde\046\uffde\047\uffde\052\uffde\001\002\000\006\020" +
    "\uffd7\024\uffd7\001\002\000\006\020\uffd5\024\uffd5\001\002" +
    "\000\006\020\uffd6\024\uffd6\001\002\000\014\006\033\010" +
    "\046\046\067\047\047\052\037\001\002\000\004\022\123" +
    "\001\002\000\036\005\uffdd\006\uffdd\007\uffdd\010\uffdd\011" +
    "\uffdd\012\uffdd\013\uffdd\014\uffdd\015\uffdd\016\uffdd\017\uffdd" +
    "\046\uffdd\047\uffdd\052\uffdd\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\121\000\004\002\004\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\003\010\001\001\000\006\004\017\005\016\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\006\004\017" +
    "\005\023\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\004\017\005\027\001\001\000\002" +
    "\001\001\000\024\004\017\005\050\006\051\012\044\013" +
    "\043\014\037\015\042\016\041\020\047\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\024\004\017" +
    "\005\050\006\051\012\044\013\043\014\037\015\042\016" +
    "\041\020\117\001\001\000\002\001\001\000\024\004\017" +
    "\005\050\006\051\012\044\013\043\014\037\015\042\016" +
    "\041\020\116\001\001\000\024\004\017\005\050\006\051" +
    "\012\044\013\043\014\037\015\042\016\041\020\115\001" +
    "\001\000\004\004\104\001\001\000\024\004\017\005\050" +
    "\006\051\012\044\013\043\014\037\015\042\016\041\020" +
    "\103\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\006\010\065\011\054\001" +
    "\001\000\002\001\001\000\002\001\001\000\006\006\051" +
    "\012\070\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\006\006" +
    "\051\012\067\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\006\006\076\007\075\001\001\000" +
    "\006\006\051\012\073\001\001\000\024\004\017\005\050" +
    "\006\051\012\044\013\043\014\037\015\042\016\041\020" +
    "\074\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\006\076\007\100\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\003\107\001" +
    "\001\000\006\004\017\005\016\001\001\000\002\001\001" +
    "\000\024\004\017\005\050\006\051\012\044\013\043\014" +
    "\037\015\042\016\041\020\112\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\006\076\007\121" +
    "\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    // colocar fun��es que ser�o geradas no c�digo
    // exemplo - tratamento de erros sint�ticos
    public void syntax_error(Symbol s){
        String strErro = "Erro de sintaxe. Linha: " + (s.right + 1) +
            " Coluna: " + s.left + ". Texto: \"" + s.value + "\"" + " \n Token Encontrado: " + sym.terminalNames[s.sym] + " state " + s.parse_state;
        
        report_error(strErro, null); 
        
    }
    public void semantico(Object tk){
       System.out.println("Sem�ntico....");
    }


    


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // PROGRAMA ::= PROGRAM ID AP LISTA_VAR FP AC BLOCO FC 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("PROGRAMA",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= PROGRAMA EOF 
            {
              Object RESULT =null;
		Location start_valxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xleft;
		Location start_valxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xright;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // LISTA_VAR ::= LISTA_VAR VAR 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("LISTA_VAR",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // TYPE ::= INT 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("TYPE",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // TYPE ::= STRING 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("TYPE",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // TYPE ::= FLOAT 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("TYPE",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // TYPE ::= BOOL 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("TYPE",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // TYPE ::= VOID 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("TYPE",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // TYPE ::= TYPE ARRAY 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("TYPE",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // VAR ::= TYPE ID VIRGULA VAR 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("VAR",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // VAR ::= ID VIRGULA VAR 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("VAR",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // VAR ::= TYPE ID 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("VAR",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // TERM ::= ID 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("TERM",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // TERM ::= CADEIA 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("TERM",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // TERM ::= CONST 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("TERM",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // TERM ::= TRUE 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("TERM",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // TERM ::= FALSE 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("TERM",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // PARAMETRO ::= TERM 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("PARAMETRO",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // PARAMETRO ::= TERM VIRGULA PARAMETRO 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("PARAMETRO",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // OPERADOR_ARIT ::= SOMA 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("OPERADOR_ARIT",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // OPERADOR_ARIT ::= SUB 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("OPERADOR_ARIT",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // OPERADOR_ARIT ::= MULT 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("OPERADOR_ARIT",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // OPERADOR_ARIT ::= DIV 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("OPERADOR_ARIT",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // OPERADOR_BOOL ::= MAIORQ 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("OPERADOR_BOOL",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // OPERADOR_BOOL ::= MENORQ 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("OPERADOR_BOOL",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // OPERADOR_BOOL ::= MAIORI 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("OPERADOR_BOOL",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // OPERADOR_BOOL ::= MENORI 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("OPERADOR_BOOL",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // OPERADOR_BOOL ::= IGUAL 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("OPERADOR_BOOL",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // OPERADOR_BOOL ::= DIF 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("OPERADOR_BOOL",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // EXPRESSAO ::= TERM 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("EXPRESSAO",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // EXPRESSAO ::= TERM OPERADOR_ARIT EXPRESSAO 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("EXPRESSAO",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // EXPRESSAO ::= TERM OPERADOR_BOOL EXPRESSAO 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("EXPRESSAO",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // SCOPE ::= PUBLIC 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("SCOPE",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // SCOPE ::= PRIVATE 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("SCOPE",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // SCOPE ::= PROTECTED 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("SCOPE",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // FUNCAO ::= SCOPE TYPE ID AP LISTA_VAR FP AC BLOCO RETURN FC 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("FUNCAO",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-9)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // CALL_FUNC ::= ID AP PARAMETRO FP 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("CALL_FUNC",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // CALL_FUNC ::= VAR AP PARAMETRO FP 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("CALL_FUNC",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // ESTRUTURA ::= IF 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("ESTRUTURA",12, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // CONDICIONAL ::= IF AP EXPRESSAO FP AC BLOCO FC 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("CONDICIONAL",13, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // BLOCO ::= VAR ATT EXPRESSAO BLOCO 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("BLOCO",14, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // BLOCO ::= EXPRESSAO BLOCO 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("BLOCO",14, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // BLOCO ::= CALL_FUNC BLOCO 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("BLOCO",14, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // BLOCO ::= FUNCAO BLOCO 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("BLOCO",14, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // BLOCO ::= ESTRUTURA BLOCO 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("BLOCO",14, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 45: // RETORNO ::= RETURN ID 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("RETORNO",15, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 46: // RETORNO ::= RETURN EXPRESSAO 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("RETORNO",15, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}
