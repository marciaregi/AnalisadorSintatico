/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.analisadorsintatico.parte3;

/**
 *
 * @author Regina
 */

import java.io.*;
import java_cup.runtime.*;
import br.com.analisadorsintatico.parte3.Yylex;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\070\000\002\002\003\000\002\002\004\000\002\007" +
    "\011\000\002\010\003\000\002\010\007\000\002\011\011" +
    "\000\002\012\016\000\002\013\003\000\002\013\007\000" +
    "\002\023\003\000\002\023\003\000\002\024\005\000\002" +
    "\024\004\000\002\017\021\000\002\017\016\000\002\026" +
    "\003\000\002\026\005\000\002\026\004\000\002\021\003" +
    "\000\002\021\003\000\002\020\004\000\002\022\004\000" +
    "\002\022\006\000\002\022\006\000\002\022\010\000\002" +
    "\025\007\000\002\025\007\000\002\014\005\000\002\014" +
    "\005\000\002\014\005\000\002\015\003\000\002\015\003" +
    "\000\002\016\003\000\002\016\003\000\002\005\004\000" +
    "\002\005\004\000\002\005\004\000\002\005\004\000\002" +
    "\005\004\000\002\005\004\000\002\003\005\000\002\003" +
    "\005\000\002\003\005\000\002\003\005\000\002\003\003" +
    "\000\002\003\003\000\002\004\006\000\002\004\006\000" +
    "\002\004\006\000\002\004\005\000\002\004\010\000\002" +
    "\004\010\000\002\004\010\000\002\004\010\000\002\006" +
    "\003\000\002\006\002" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\226\000\022\002\uffca\006\024\007\021\010\022\014" +
    "\005\016\017\024\014\027\025\001\002\000\024\002\uffca" +
    "\006\024\007\021\010\022\014\005\016\017\024\014\027" +
    "\025\033\uffca\001\002\000\004\030\163\001\002\000\024" +
    "\002\uffca\006\024\007\021\010\022\014\005\016\017\024" +
    "\014\027\025\033\uffca\001\002\000\024\002\uffca\006\024" +
    "\007\021\010\022\014\005\016\017\024\014\027\025\033" +
    "\uffca\001\002\000\004\002\001\001\002\000\004\002\160" +
    "\001\002\000\026\002\ufffe\006\ufffe\007\ufffe\010\ufffe\012" +
    "\154\014\ufffe\016\ufffe\024\ufffe\027\ufffe\033\ufffe\001\002" +
    "\000\004\024\153\001\002\000\010\020\130\026\131\036" +
    "\126\001\002\000\024\002\uffca\006\024\007\021\010\022" +
    "\014\005\016\017\024\014\027\025\033\uffca\001\002\000" +
    "\006\026\114\034\113\001\002\000\004\024\uffef\001\002" +
    "\000\006\002\uffcb\033\uffcb\001\002\000\004\030\102\001" +
    "\002\000\004\032\067\001\002\000\024\002\uffca\006\024" +
    "\007\021\010\022\014\005\016\017\024\014\027\025\033" +
    "\uffca\001\002\000\004\030\035\001\002\000\004\024\uffee" +
    "\001\002\000\024\002\uffca\006\024\007\021\010\022\014" +
    "\005\016\017\024\014\027\025\033\uffca\001\002\000\026" +
    "\002\ufffa\006\ufffa\007\ufffa\010\ufffa\013\030\014\ufffa\016" +
    "\ufffa\024\ufffa\027\ufffa\033\ufffa\001\002\000\004\032\031" +
    "\001\002\000\022\006\024\007\021\010\022\014\005\016" +
    "\017\024\014\027\025\033\uffca\001\002\000\004\033\033" +
    "\001\002\000\024\002\ufff9\006\ufff9\007\ufff9\010\ufff9\014" +
    "\ufff9\016\ufff9\024\ufff9\027\ufff9\033\ufff9\001\002\000\006" +
    "\002\uffdb\033\uffdb\001\002\000\012\005\036\023\042\024" +
    "\037\037\040\001\002\000\004\025\063\001\002\000\006" +
    "\021\056\025\055\001\002\000\006\021\051\025\050\001" +
    "\002\000\006\022\uffd5\031\uffd5\001\002\000\006\022\uffd4" +
    "\031\uffd4\001\002\000\004\031\044\001\002\000\004\032" +
    "\045\001\002\000\022\006\024\007\021\010\022\014\005" +
    "\016\017\024\014\027\025\033\uffca\001\002\000\004\033" +
    "\047\001\002\000\026\002\uffff\006\uffff\007\uffff\010\uffff" +
    "\012\uffff\014\uffff\016\uffff\024\uffff\027\uffff\033\uffff\001" +
    "\002\000\004\037\uffe2\001\002\000\006\024\054\037\uffe3" +
    "\001\002\000\004\037\053\001\002\000\006\022\uffd7\031" +
    "\uffd7\001\002\000\006\022\uffd6\031\uffd6\001\002\000\010" +
    "\005\062\024\uffe2\037\uffe2\001\002\000\006\024\uffe3\037" +
    "\uffe3\001\002\000\006\024\061\037\060\001\002\000\006" +
    "\022\uffd8\031\uffd8\001\002\000\006\022\uffd9\031\uffd9\001" +
    "\002\000\006\022\uffe4\031\uffe4\001\002\000\006\005\064" +
    "\024\065\001\002\000\006\022\uffe6\031\uffe6\001\002\000" +
    "\006\022\uffe5\031\uffe5\001\002\000\006\002\uffdf\033\uffdf" +
    "\001\002\000\022\006\024\007\021\010\022\014\005\016" +
    "\017\024\014\027\025\033\uffca\001\002\000\004\033\071" +
    "\001\002\000\004\011\072\001\002\000\004\030\073\001" +
    "\002\000\004\015\074\001\002\000\004\024\075\001\002" +
    "\000\004\031\076\001\002\000\004\032\077\001\002\000" +
    "\022\006\024\007\021\010\022\014\005\016\017\024\014" +
    "\027\025\033\uffca\001\002\000\004\033\101\001\002\000" +
    "\026\002\ufffb\006\ufffb\007\ufffb\010\ufffb\013\ufffb\014\ufffb" +
    "\016\ufffb\024\ufffb\027\ufffb\033\ufffb\001\002\000\012\005" +
    "\036\023\042\024\037\037\040\001\002\000\004\031\107" +
    "\001\002\000\006\022\105\031\ufff2\001\002\000\014\005" +
    "\036\023\042\024\037\031\ufff0\037\040\001\002\000\004" +
    "\031\ufff1\001\002\000\004\032\110\001\002\000\022\006" +
    "\024\007\021\010\022\014\005\016\017\024\014\027\025" +
    "\033\uffca\001\002\000\004\033\112\001\002\000\024\002" +
    "\ufffc\006\ufffc\007\ufffc\010\ufffc\014\ufffc\016\ufffc\024\ufffc" +
    "\027\ufffc\033\ufffc\001\002\000\024\002\uffec\006\uffec\007" +
    "\uffec\010\uffec\014\uffec\016\uffec\024\uffec\027\uffec\033\uffec" +
    "\001\002\000\010\024\116\035\117\037\115\001\002\000" +
    "\004\034\124\001\002\000\004\034\123\001\002\000\004" +
    "\024\120\001\002\000\004\035\121\001\002\000\004\034" +
    "\122\001\002\000\024\002\uffe9\006\uffe9\007\uffe9\010\uffe9" +
    "\014\uffe9\016\uffe9\024\uffe9\027\uffe9\033\uffe9\001\002\000" +
    "\024\002\uffea\006\uffea\007\uffea\010\uffea\014\uffea\016\uffea" +
    "\024\uffea\027\uffea\033\uffea\001\002\000\024\002\uffeb\006" +
    "\uffeb\007\uffeb\010\uffeb\014\uffeb\016\uffeb\024\uffeb\027\uffeb" +
    "\033\uffeb\001\002\000\006\002\uffde\033\uffde\001\002\000" +
    "\004\034\152\001\002\000\010\005\132\024\134\037\133" +
    "\001\002\000\010\005\uffe1\024\uffe1\037\uffe1\001\002\000" +
    "\010\005\uffe0\024\uffe0\037\uffe0\001\002\000\004\034\151" +
    "\001\002\000\006\017\144\034\143\001\002\000\006\017" +
    "\136\034\135\001\002\000\024\002\uffd3\006\uffd3\007\uffd3" +
    "\010\uffd3\014\uffd3\016\uffd3\024\uffd3\027\uffd3\033\uffd3\001" +
    "\002\000\006\024\137\037\140\001\002\000\004\034\142" +
    "\001\002\000\004\034\141\001\002\000\024\002\uffcc\006" +
    "\uffcc\007\uffcc\010\uffcc\014\uffcc\016\uffcc\024\uffcc\027\uffcc" +
    "\033\uffcc\001\002\000\024\002\uffcf\006\uffcf\007\uffcf\010" +
    "\uffcf\014\uffcf\016\uffcf\024\uffcf\027\uffcf\033\uffcf\001\002" +
    "\000\024\002\uffd2\006\uffd2\007\uffd2\010\uffd2\014\uffd2\016" +
    "\uffd2\024\uffd2\027\uffd2\033\uffd2\001\002\000\006\024\146" +
    "\037\145\001\002\000\004\034\150\001\002\000\004\034" +
    "\147\001\002\000\024\002\uffce\006\uffce\007\uffce\010\uffce" +
    "\014\uffce\016\uffce\024\uffce\027\uffce\033\uffce\001\002\000" +
    "\024\002\uffcd\006\uffcd\007\uffcd\010\uffcd\014\uffcd\016\uffcd" +
    "\024\uffcd\027\uffcd\033\uffcd\001\002\000\024\002\uffd1\006" +
    "\uffd1\007\uffd1\010\uffd1\014\uffd1\016\uffd1\024\uffd1\027\uffd1" +
    "\033\uffd1\001\002\000\024\002\uffd0\006\uffd0\007\uffd0\010" +
    "\uffd0\014\uffd0\016\uffd0\024\uffd0\027\uffd0\033\uffd0\001\002" +
    "\000\006\026\uffed\034\uffed\001\002\000\004\032\155\001" +
    "\002\000\022\006\024\007\021\010\022\014\005\016\017" +
    "\024\014\027\025\033\uffca\001\002\000\004\033\157\001" +
    "\002\000\024\002\ufffd\006\ufffd\007\ufffd\010\ufffd\014\ufffd" +
    "\016\ufffd\024\ufffd\027\ufffd\033\ufffd\001\002\000\004\002" +
    "\000\001\002\000\006\002\uffdd\033\uffdd\001\002\000\006" +
    "\002\uffda\033\uffda\001\002\000\006\024\164\027\166\001" +
    "\002\000\004\026\214\001\002\000\004\024\175\001\002" +
    "\000\004\024\167\001\002\000\004\026\170\001\002\000" +
    "\006\024\172\037\171\001\002\000\004\034\174\001\002" +
    "\000\004\034\173\001\002\000\004\024\uffe7\001\002\000" +
    "\004\024\uffe8\001\002\000\004\021\176\001\002\000\006" +
    "\024\177\037\200\001\002\000\004\034\ufff8\001\002\000" +
    "\004\034\ufff7\001\002\000\004\034\202\001\002\000\004" +
    "\024\203\001\002\000\006\020\212\036\211\001\002\000" +
    "\004\031\205\001\002\000\004\032\206\001\002\000\022" +
    "\006\024\007\021\010\022\014\005\016\017\024\014\027" +
    "\025\033\uffca\001\002\000\004\033\210\001\002\000\024" +
    "\002\ufff3\006\ufff3\007\ufff3\010\ufff3\014\ufff3\016\ufff3\024" +
    "\ufff3\027\ufff3\033\ufff3\001\002\000\004\031\ufff5\001\002" +
    "\000\004\037\213\001\002\000\004\031\ufff6\001\002\000" +
    "\006\024\177\037\200\001\002\000\004\034\216\001\002" +
    "\000\004\024\217\001\002\000\004\021\220\001\002\000" +
    "\006\024\177\037\200\001\002\000\004\034\222\001\002" +
    "\000\004\024\203\001\002\000\004\031\224\001\002\000" +
    "\004\032\225\001\002\000\022\006\024\007\021\010\022" +
    "\014\005\016\017\024\014\027\025\033\uffca\001\002\000" +
    "\004\033\227\001\002\000\024\002\ufff4\006\ufff4\007\ufff4" +
    "\010\ufff4\014\ufff4\016\ufff4\024\ufff4\027\ufff4\033\ufff4\001" +
    "\002\000\006\002\uffdc\033\uffdc\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\226\000\034\002\010\004\005\005\017\006\007\007" +
    "\011\010\014\011\006\012\026\013\003\017\025\020\015" +
    "\021\012\022\022\001\001\000\032\004\005\005\017\006" +
    "\227\007\011\010\014\011\006\012\026\013\003\017\025" +
    "\020\015\021\012\022\022\001\001\000\002\001\001\000" +
    "\032\004\005\005\017\006\161\007\011\010\014\011\006" +
    "\012\026\013\003\017\025\020\015\021\012\022\022\001" +
    "\001\000\032\004\005\005\017\006\160\007\011\010\014" +
    "\011\006\012\026\013\003\017\025\020\015\021\012\022" +
    "\022\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\016\126\001\001\000" +
    "\032\004\005\005\017\006\124\007\011\010\014\011\006" +
    "\012\026\013\003\017\025\020\015\021\012\022\022\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\032\004\005\005" +
    "\017\006\065\007\011\010\014\011\006\012\026\013\003" +
    "\017\025\020\015\021\012\022\022\001\001\000\002\001" +
    "\001\000\002\001\001\000\032\004\005\005\017\006\033" +
    "\007\011\010\014\011\006\012\026\013\003\017\025\020" +
    "\015\021\012\022\022\001\001\000\002\001\001\000\002" +
    "\001\001\000\032\004\005\005\017\006\031\007\011\010" +
    "\014\011\006\012\026\013\003\017\025\020\015\021\012" +
    "\022\022\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\003\042\014\040\001\001\000\002" +
    "\001\001\000\004\015\056\001\001\000\004\015\051\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\032\004\005\005\017\006\045\007" +
    "\011\010\014\011\006\012\026\013\003\017\025\020\015" +
    "\021\012\022\022\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\032\004\005" +
    "\005\017\006\067\007\011\010\014\011\006\012\026\013" +
    "\003\017\025\020\015\021\012\022\022\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\032\004\005\005\017\006\077\007\011\010\014\011" +
    "\006\012\026\013\003\017\025\020\015\021\012\022\022" +
    "\001\001\000\002\001\001\000\002\001\001\000\010\003" +
    "\103\014\040\026\102\001\001\000\002\001\001\000\002" +
    "\001\001\000\010\003\103\014\040\026\105\001\001\000" +
    "\002\001\001\000\002\001\001\000\032\004\005\005\017" +
    "\006\110\007\011\010\014\011\006\012\026\013\003\017" +
    "\025\020\015\021\012\022\022\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\032\004" +
    "\005\005\017\006\155\007\011\010\014\011\006\012\026" +
    "\013\003\017\025\020\015\021\012\022\022\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\025\164\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\023\200\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\024\203\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\032\004" +
    "\005\005\017\006\206\007\011\010\014\011\006\012\026" +
    "\013\003\017\025\020\015\021\012\022\022\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\023\214\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\023\220\001\001\000\002\001\001\000\004\024\222\001" +
    "\001\000\002\001\001\000\002\001\001\000\032\004\005" +
    "\005\017\006\225\007\011\010\014\011\006\012\026\013" +
    "\003\017\025\020\015\021\012\022\022\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
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
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    public static void main (String args[]) throws Exception {
        new parser (new Yylex(System.in)).parse();
    }

    public String erro;
    
    public String getErro() {
        return erro;
    }

    public void syntax_error (Symbol s) {
        erro = ("Erro de sintaxe. Linha: " + (s.right + 1) +
        " Coluna: " + s.left + ". Texto: \"" + s.value + "\"");

        System.out.print(erro);
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // S ::= EXPRESSAO_REPETE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("S",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= S EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // IF ::= RESERVADO_IF SEPARADOR_PARENTESE_ABRE EXPRESSAO_RELACIONAL SEPARADOR_PARENTESE_FECHA SEPARADOR_CHAVE_ABRE EXPRESSAO_REPETE SEPARADOR_CHAVE_FECHA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("IF",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // IF_ELSE ::= IF 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("IF_ELSE",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // IF_ELSE ::= IF RESERVADO_ELSE SEPARADOR_CHAVE_ABRE EXPRESSAO_REPETE SEPARADOR_CHAVE_FECHA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("IF_ELSE",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // WHILE ::= RESERVADO_WHILE SEPARADOR_PARENTESE_ABRE OP_LOGICO SEPARADOR_PARENTESE_FECHA SEPARADOR_CHAVE_ABRE EXPRESSAO_REPETE SEPARADOR_CHAVE_FECHA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("WHILE",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // TRY_CATCH ::= RESERVADO_TRY SEPARADOR_CHAVE_ABRE EXPRESSAO_REPETE SEPARADOR_CHAVE_FECHA RESERVADO_CATCH SEPARADOR_PARENTESE_ABRE EXCECAO ID SEPARADOR_PARENTESE_FECHA SEPARADOR_CHAVE_ABRE EXPRESSAO_REPETE SEPARADOR_CHAVE_FECHA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("TRY_CATCH",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-11)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // TRY_CATCH_FINALLY ::= TRY_CATCH 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("TRY_CATCH_FINALLY",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // TRY_CATCH_FINALLY ::= TRY_CATCH RESERVADO_FINALLY SEPARADOR_CHAVE_ABRE EXPRESSAO_REPETE SEPARADOR_CHAVE_FECHA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("TRY_CATCH_FINALLY",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // NUMERO_ID ::= ID 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("NUMERO_ID",17, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // NUMERO_ID ::= NUMERO 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("NUMERO_ID",17, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // ATRIBUICAO_AUTO_INCREMENTO ::= ID OPERADOR_ATRIBUICAO NUMERO 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ATRIBUICAO_AUTO_INCREMENTO",18, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // ATRIBUICAO_AUTO_INCREMENTO ::= ID OPERADOR_AUTO_INCREMENTO 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ATRIBUICAO_AUTO_INCREMENTO",18, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // FOR ::= RESERVADO_FOR SEPARADOR_PARENTESE_ABRE ID OPERADOR_ATRIBUICAO_IGUAL NUMERO_ID SEPARADOR_PONTO_VIRGULA ID OPERADOR_RELACIONAL NUMERO_ID SEPARADOR_PONTO_VIRGULA ATRIBUICAO_AUTO_INCREMENTO SEPARADOR_PARENTESE_FECHA SEPARADOR_CHAVE_ABRE EXPRESSAO_REPETE SEPARADOR_CHAVE_FECHA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("FOR",13, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-14)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // FOR ::= RESERVADO_FOR SEPARADOR_PARENTESE_ABRE TIPO_ATRIBUICAO_NUMERO ID OPERADOR_RELACIONAL NUMERO_ID SEPARADOR_PONTO_VIRGULA ATRIBUICAO_AUTO_INCREMENTO SEPARADOR_PARENTESE_FECHA SEPARADOR_CHAVE_ABRE EXPRESSAO_REPETE SEPARADOR_CHAVE_FECHA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("FOR",13, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-11)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // OP_LOGICO ::= EXPRESSAO_RELACIONAL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("OP_LOGICO",20, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // OP_LOGICO ::= EXPRESSAO_RELACIONAL OPERADOR_LOGICO OP_LOGICO 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("OP_LOGICO",20, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // OP_LOGICO ::= EXPRESSAO_RELACIONAL OPERADOR_LOGICO 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("OP_LOGICO",20, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // TIPO_GERAL ::= TIPO 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("TIPO_GERAL",15, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // TIPO_GERAL ::= TIPO_NUMERICO 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("TIPO_GERAL",15, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // TIPO_DECLARACAO ::= TIPO_GERAL ID 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("TIPO_DECLARACAO",14, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // TIPO_ATRIBUICAO ::= TIPO_DECLARACAO SEPARADOR_PONTO_VIRGULA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("TIPO_ATRIBUICAO",16, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // TIPO_ATRIBUICAO ::= TIPO_DECLARACAO OPERADOR_ATRIBUICAO_IGUAL NUMERO SEPARADOR_PONTO_VIRGULA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("TIPO_ATRIBUICAO",16, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // TIPO_ATRIBUICAO ::= TIPO_DECLARACAO OPERADOR_ATRIBUICAO_IGUAL ID SEPARADOR_PONTO_VIRGULA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("TIPO_ATRIBUICAO",16, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // TIPO_ATRIBUICAO ::= TIPO_DECLARACAO OPERADOR_ATRIBUICAO_IGUAL ASPAS ID ASPAS SEPARADOR_PONTO_VIRGULA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("TIPO_ATRIBUICAO",16, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // TIPO_ATRIBUICAO_NUMERO ::= TIPO_NUMERICO ID OPERADOR_ATRIBUICAO_IGUAL NUMERO SEPARADOR_PONTO_VIRGULA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("TIPO_ATRIBUICAO_NUMERO",19, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // TIPO_ATRIBUICAO_NUMERO ::= TIPO_NUMERICO ID OPERADOR_ATRIBUICAO_IGUAL ID SEPARADOR_PONTO_VIRGULA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("TIPO_ATRIBUICAO_NUMERO",19, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // OP_NULL ::= RESERVADO_NULL OPERADOR_RELACIONAL_IGUAL_DIFERENTE RESERVADO_NULL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("OP_NULL",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // OP_NULL ::= RESERVADO_NULL OPERADOR_RELACIONAL_IGUAL_DIFERENTE ID 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("OP_NULL",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // OP_NULL ::= ID OPERADOR_RELACIONAL_IGUAL_DIFERENTE RESERVADO_NULL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("OP_NULL",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // OP_RELACIONAL ::= OPERADOR_RELACIONAL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("OP_RELACIONAL",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // OP_RELACIONAL ::= OPERADOR_RELACIONAL_IGUAL_DIFERENTE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("OP_RELACIONAL",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // OP_ATRIBUICAO ::= OPERADOR_ATRIBUICAO 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("OP_ATRIBUICAO",12, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // OP_ATRIBUICAO ::= OPERADOR_ATRIBUICAO_IGUAL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("OP_ATRIBUICAO",12, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // EXPRESSAO ::= TIPO_ATRIBUICAO EXPRESSAO_REPETE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESSAO",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // EXPRESSAO ::= IF_ELSE EXPRESSAO_REPETE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESSAO",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // EXPRESSAO ::= WHILE EXPRESSAO_REPETE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESSAO",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // EXPRESSAO ::= TRY_CATCH_FINALLY EXPRESSAO_REPETE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESSAO",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // EXPRESSAO ::= FOR EXPRESSAO_REPETE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESSAO",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // EXPRESSAO ::= EXPRESSAO_ATRIBUICAO EXPRESSAO_REPETE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESSAO",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // EXPRESSAO_RELACIONAL ::= ID OP_RELACIONAL ID 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESSAO_RELACIONAL",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // EXPRESSAO_RELACIONAL ::= ID OP_RELACIONAL NUMERO 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESSAO_RELACIONAL",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // EXPRESSAO_RELACIONAL ::= NUMERO OP_RELACIONAL NUMERO 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESSAO_RELACIONAL",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // EXPRESSAO_RELACIONAL ::= NUMERO OPERADOR_RELACIONAL ID 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESSAO_RELACIONAL",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // EXPRESSAO_RELACIONAL ::= OP_NULL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESSAO_RELACIONAL",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 45: // EXPRESSAO_RELACIONAL ::= OPERADOR_BOOLEANO 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESSAO_RELACIONAL",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 46: // EXPRESSAO_ATRIBUICAO ::= ID OP_ATRIBUICAO ID SEPARADOR_PONTO_VIRGULA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESSAO_ATRIBUICAO",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 47: // EXPRESSAO_ATRIBUICAO ::= ID OP_ATRIBUICAO NUMERO SEPARADOR_PONTO_VIRGULA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESSAO_ATRIBUICAO",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 48: // EXPRESSAO_ATRIBUICAO ::= ID OP_ATRIBUICAO RESERVADO_NULL SEPARADOR_PONTO_VIRGULA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESSAO_ATRIBUICAO",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 49: // EXPRESSAO_ATRIBUICAO ::= ID OPERADOR_AUTO_INCREMENTO SEPARADOR_PONTO_VIRGULA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESSAO_ATRIBUICAO",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 50: // EXPRESSAO_ATRIBUICAO ::= ID OP_ATRIBUICAO ID OPERADOR_ARITMETICO ID SEPARADOR_PONTO_VIRGULA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESSAO_ATRIBUICAO",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 51: // EXPRESSAO_ATRIBUICAO ::= ID OP_ATRIBUICAO NUMERO OPERADOR_ARITMETICO ID SEPARADOR_PONTO_VIRGULA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESSAO_ATRIBUICAO",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 52: // EXPRESSAO_ATRIBUICAO ::= ID OP_ATRIBUICAO NUMERO OPERADOR_ARITMETICO NUMERO SEPARADOR_PONTO_VIRGULA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESSAO_ATRIBUICAO",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 53: // EXPRESSAO_ATRIBUICAO ::= ID OP_ATRIBUICAO ID OPERADOR_ARITMETICO NUMERO SEPARADOR_PONTO_VIRGULA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESSAO_ATRIBUICAO",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 54: // EXPRESSAO_REPETE ::= EXPRESSAO 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESSAO_REPETE",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 55: // EXPRESSAO_REPETE ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESSAO_REPETE",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), (Symbol) RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
