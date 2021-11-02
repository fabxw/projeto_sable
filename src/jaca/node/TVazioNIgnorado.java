/* This file was generated by SableCC (http://www.sablecc.org/). */

package jaca.node;

import jaca.analysis.*;

@SuppressWarnings("nls")
public final class TVazioNIgnorado extends Token
{
    public TVazioNIgnorado(String text)
    {
        setText(text);
    }

    public TVazioNIgnorado(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TVazioNIgnorado(getText(), getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTVazioNIgnorado(this);
    }
}
