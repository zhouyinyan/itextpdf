/* Generated By:JavaCC: Do not edit this line. PAParser.java */

/*
 * The contents of this file are subject to the Mozilla Public License Version 1.1
 * (the "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the License.
 *
 * The Original Code is 'iText, a free JAVA-PDF library'.
 *
 * The Initial Developer of the Original Code is Bruno Lowagie. Portions created by
 * the Initial Developer are Copyright (C) 1999, 2000, 2001, 2002 by Bruno Lowagie.
 * All Rights Reserved.
 * Co-Developer of the code is Paulo Soares. Portions created by the Co-Developer
 * are Copyright (C) 2000, 2001, 2002 by Paulo Soares. All Rights Reserved.
 *
 * Contributor(s): all the names of the contributors are added in the source code
 * where applicable.
 *
 * Alternatively, the contents of this file may be used under the terms of the
 * LGPL license (the "GNU LIBRARY GENERAL PUBLIC LICENSE"), in which case the
 * provisions of LGPL are applicable instead of those above.  If you wish to
 * allow use of your version of this file only under the terms of the LGPL
 * License and not to allow others to use your version of this file under
 * the MPL, indicate your decision by deleting the provisions above and
 * replace them with the notice and other provisions required by the LGPL.
 * If you do not delete the provisions above, a recipient may use your version
 * of this file under either the MPL or the GNU LIBRARY GENERAL PUBLIC LICENSE.
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the MPL as stated above or under the terms of the GNU
 * Library General Public License as published by the Free Software Foundation;
 * either version 2 of the License, or any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Library general Public License for more
 * details.
 *
 * If you didn't download this code from the following link, you should check if
 * you aren't using an obsolete version:
 * http://www.lowagie.com/iText/
 *
 * This class is generated based on a grammar file privided by SUN, and updated
 * by Carsten Hammer.  SUN's license agreement can be found at this URL:
 * http://java.sun.com/products/java-media/2D/samples/samples-license.html
 * See also the file sun.txt in directory com.lowagie.text.pdf
 */

package com.lowagie.text.pdf.codec.postscript;

public class PAParser extends Object implements PAParserConstants {

  void error_skipto(int kind) throws ParseException {
ParseException e=generateParseException();
Token t;
String dump="";
do{
if(getToken(1).kind==kind)break;
t=getNextToken();
dump+=t.image;
}while(t.kind!=kind);
System.out.println("Ignoriere >"+dump+"<");
  }

  String ExceptionString(String hint,JavaCharStream jj_input_stream,PAContext context,Token t,Exception e) throws ParseException {
  return "\nparser "+hint+" ["+jj_input_stream.bufpos+"]"+context.engine.litMode()+":\""+t.image+"\" in line "+t.beginLine+" column "+t.beginColumn+"\n"+e.toString();
  }

  final public void parse(PAContext context) throws ParseException {
        Token x = null;
    try {
      label_1:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case INTEGER_LITERAL:
        case FLOATING_POINT_LITERAL:
        case STRING_LITERAL:
        case IDENTIFIER:
        case KEY_IDENTIFIER:
        case IMMEDIATE_IDENTIFIER:
        case LBRACE:
        case RBRACE:
        case LBRACKET:
        case RBRACKET:
        case LDICT:
        case RDICT:
        case Instring:
          ;
          break;
        default:
          jj_la1[0] = jj_gen;
          break label_1;
        }
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case INTEGER_LITERAL:
        case FLOATING_POINT_LITERAL:
        case STRING_LITERAL:
        case IDENTIFIER:
        case KEY_IDENTIFIER:
        case IMMEDIATE_IDENTIFIER:
        case Instring:
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case INTEGER_LITERAL:
            x = jj_consume_token(INTEGER_LITERAL);
                                try {
                                  {if(PAContext.DebugExecution){System.out.print("\nparser ["+jj_input_stream.getBeginLine()+","+jj_input_stream.getBeginColumn()+"]"+context.engine.litMode()+":\""+x.image+"\"");System.out.flush();System.err.flush();}}
                                        context.engine.process(new Integer(x.image));
                                } catch(NumberFormatException e) {
                                        {if (true) throw new ParseException(ExceptionString("int_literal",jj_input_stream,context,token,e));}
                                } catch(PainterException e) {
                                        {if (true) throw new ParseException(ExceptionString("int_literal",jj_input_stream,context,token,e));}
                                }
            break;
          case FLOATING_POINT_LITERAL:
            x = jj_consume_token(FLOATING_POINT_LITERAL);
                                try {
                                  {if(PAContext.DebugExecution){System.out.print("\nparser ["+jj_input_stream.getBeginLine()+","+jj_input_stream.getBeginColumn()+"]"+context.engine.litMode()+":\""+x.image+"\"");System.out.flush();System.err.flush();}}
                                       context.engine.process(new Double(x.image));
                                } catch(NumberFormatException e) {
                                        {if (true) throw new ParseException(ExceptionString("float_literal",jj_input_stream,context,token,e));}
                                } catch(PainterException e) {
                                        {if (true) throw new ParseException(ExceptionString("float_literal",jj_input_stream,context,token,e));}
                                }
            break;
          case Instring:
            jj_consume_token(Instring);
            x = jj_consume_token(HEX_STRING_LITERAL);
                                try {
                                  {if(PAContext.DebugExecution){System.out.print("\nparser ["+jj_input_stream.getBeginLine()+","+jj_input_stream.getBeginColumn()+"]"+context.engine.litMode()+":\""+x.image+"\"");System.out.flush();System.err.flush();}}
                                      context.engine.process((x.image.substring(1, x.image.length() -1)));
                                } catch(PainterException e) {
                                      {if (true) throw new ParseException(ExceptionString("hex_string_literal",jj_input_stream,context,token,e));}
                                 }
            break;
          case STRING_LITERAL:
            x = jj_consume_token(STRING_LITERAL);
                               try {
                                 {if(PAContext.DebugExecution){System.out.print("\nparser ["+jj_input_stream.getBeginLine()+","+jj_input_stream.getBeginColumn()+"]"+context.engine.litMode()+":\""+x.image+"\"");System.out.flush();System.err.flush();}}
                                     context.engine.process(x.image.substring(1, x.image.length() -1));
                               } catch(PainterException e) {
                                     {if (true) throw new ParseException(ExceptionString("string_literal",jj_input_stream,context,token,e));}
                                }
            break;
          case IDENTIFIER:
            x = jj_consume_token(IDENTIFIER);
                                try {
                                  {if(PAContext.DebugExecution){System.out.print("\nparser ["+jj_input_stream.getBeginLine()+","+jj_input_stream.getBeginColumn()+"]"+context.engine.litMode()+":\""+x.image+"\"");System.out.flush();System.err.flush();}}
                                              context.engine.process(new PAToken(x.image, PAToken.IDENTIFIER));
                                } catch(PainterException e) {
                                             {if (true) throw new ParseException(ExceptionString("identifier",jj_input_stream,context,token,e));}
                                }
            break;
          case KEY_IDENTIFIER:
            x = jj_consume_token(KEY_IDENTIFIER);
                                try {
                                  {if(PAContext.DebugExecution){System.out.print("\nparser ["+jj_input_stream.getBeginLine()+","+jj_input_stream.getBeginColumn()+"]"+context.engine.litMode()+":\""+x.image+"\"");System.out.flush();System.err.flush();}}
                                            context.engine.process(new PAToken(x.image.substring(1, x.image.length()), PAToken.KEY));
                                } catch(PainterException e) {
                                  {if (true) throw new ParseException(ExceptionString("key_identifier",jj_input_stream,context,token,e));}
                                 }
            break;
          case IMMEDIATE_IDENTIFIER:
            x = jj_consume_token(IMMEDIATE_IDENTIFIER);
                                try {
                                  {if(PAContext.DebugExecution){System.out.print("\nparser ["+jj_input_stream.getBeginLine()+","+jj_input_stream.getBeginColumn()+"]"+context.engine.litMode()+":\""+x.image+"\"");System.out.flush();System.err.flush();}}
                                            context.engine.process(new PAToken(x.image.substring(2, x.image.length()), PAToken.IMMEDIATE));
                                } catch(PainterException e) {
                                         {if (true) throw new ParseException(ExceptionString("immediate_identifier",jj_input_stream,context,token,e));}
                                }
            break;
          default:
            jj_la1[1] = jj_gen;
            jj_consume_token(-1);
            throw new ParseException();
          }
          break;
        case LBRACE:
          jj_consume_token(LBRACE);
                                try {
                                  {if(PAContext.DebugExecution){System.out.print("\nparser ["+jj_input_stream.getBeginLine()+","+jj_input_stream.getBeginColumn()+"]"+context.engine.litMode()+":\""+token.image+"\"");System.out.flush();System.err.flush();}}
                                             context.engine.process(new PAToken(null, PAToken.START_PROCEDURE));
                                } catch(PainterException e) {
                                  {if (true) throw new ParseException(ExceptionString("lbrace",jj_input_stream,context,token,e));}
                                }
          break;
        case RBRACE:
          jj_consume_token(RBRACE);
                                try {
                                  {if(PAContext.DebugExecution){System.out.print("\nparser ["+jj_input_stream.getBeginLine()+","+jj_input_stream.getBeginColumn()+"]"+context.engine.litMode()+":\""+token.image+"\"");System.out.flush();System.err.flush();}}
                                      context.engine.process(new PAToken(null, PAToken.END_PROCEDURE));
                                } catch(PainterException e) {
                                  {if (true) throw new ParseException(ExceptionString("rbrace",jj_input_stream,context,token,e));}
                               }
          break;
        case LBRACKET:
          jj_consume_token(LBRACKET);
                                try {
                                  {if(PAContext.DebugExecution){System.out.print("\nparser ["+jj_input_stream.getBeginLine()+","+jj_input_stream.getBeginColumn()+"]"+context.engine.litMode()+":\""+token.image+"\"");System.out.flush();System.err.flush();}}
                                       context.engine.process(new PAToken(null, PAToken.START_ARRAY));
                                } catch(PainterException e) {
                                  {if (true) throw new ParseException(ExceptionString("lbracket",jj_input_stream,context,token,e));}
                                }
          break;
        case RBRACKET:
          jj_consume_token(RBRACKET);
                                try {
                                  {if(PAContext.DebugExecution){System.out.print("\nparser ["+jj_input_stream.getBeginLine()+","+jj_input_stream.getBeginColumn()+"]"+context.engine.litMode()+":\""+token.image+"\"");System.out.flush();System.err.flush();}}
                                       context.engine.process(new PAToken(null, PAToken.END_ARRAY));
                                } catch(PainterException e) {
                                  {if (true) throw new ParseException(ExceptionString("rbracket",jj_input_stream,context,token,e));}
                                }
          break;
        case LDICT:
          jj_consume_token(LDICT);
                               try {
                                 {if(PAContext.DebugExecution){System.out.print("\nparser ["+jj_input_stream.getBeginLine()+","+jj_input_stream.getBeginColumn()+"]"+context.engine.litMode()+":\""+token.image+"\"");System.out.flush();System.err.flush();}}
                                      context.engine.process(new PAToken(null, PAToken.START_DICT));
                               } catch(PainterException e) {
                                 {if (true) throw new ParseException(ExceptionString("ldict",jj_input_stream,context,token,e));}
                                }
          break;
        case RDICT:
          jj_consume_token(RDICT);
                               try {
                                 {if(PAContext.DebugExecution){System.out.print("\nparser ["+jj_input_stream.getBeginLine()+","+jj_input_stream.getBeginColumn()+"]"+context.engine.litMode()+":\""+token.image+"\"");System.out.flush();System.err.flush();}}
                                       context.engine.process(new PAToken(null, PAToken.END_DICT));
                               } catch(PainterException e) {
                                 {if (true) throw new ParseException(ExceptionString("rdict",jj_input_stream,context,token,e));}
                                 }
          break;
        default:
          jj_la1[2] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
    } catch (ParseException e) {
    System.out.flush();System.err.flush();
                  //System.out.println("Fehlerhaftes Element in Spalte "+e.currentToken.beginColumn+" in Eingabedatei in Zeile="+e.currentToken.next.beginLine+" in Zeichen Nr. "+e.currentToken.next.beginColumn+". >"+e.currentToken.next.image+"< wurde hier nicht erwartet.");
                  //System.err.println("Fehler:"+e);
                  e.printStackTrace();
                  error_skipto(WHITESPACE);
                  System.exit(0);
    }
  }

  public PAParserTokenManager token_source;
  JavaCharStream jj_input_stream;
  public Token token, jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[3];
  final private int[] jj_la1_0 = {0x13f3d20,0x1003d20,0x13f3d20,};

  public PAParser(java.io.InputStream stream) {
    jj_input_stream = new JavaCharStream(stream, 1, 1);
    token_source = new PAParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 3; i++) jj_la1[i] = -1;
  }

  public void ReInit(java.io.InputStream stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 3; i++) jj_la1[i] = -1;
  }

  public PAParser(java.io.Reader stream) {
    jj_input_stream = new JavaCharStream(stream, 1, 1);
    token_source = new PAParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 3; i++) jj_la1[i] = -1;
  }

  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 3; i++) jj_la1[i] = -1;
  }

  public PAParser(PAParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 3; i++) jj_la1[i] = -1;
  }

  public void ReInit(PAParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 3; i++) jj_la1[i] = -1;
  }

  final private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  final private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.Vector jj_expentries = new java.util.Vector();
  private int[] jj_expentry;
  private int jj_kind = -1;

  final public ParseException generateParseException() {
    jj_expentries.removeAllElements();
    boolean[] la1tokens = new boolean[25];
    for (int i = 0; i < 25; i++) {
      la1tokens[i] = false;
    }
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 3; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 25; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.addElement(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = (int[])jj_expentries.elementAt(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  final public void enable_tracing() {
  }

  final public void disable_tracing() {
  }

}
