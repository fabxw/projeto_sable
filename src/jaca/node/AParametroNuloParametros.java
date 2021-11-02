/* This file was generated by SableCC (http://www.sablecc.org/). */

package jaca.node;

import jaca.analysis.*;

@SuppressWarnings("nls")
public final class AParametroNuloParametros extends PParametros
{
    private TVazioNIgnorado _vazioNIgnorado_;

    public AParametroNuloParametros()
    {
        // Constructor
    }

    public AParametroNuloParametros(
        @SuppressWarnings("hiding") TVazioNIgnorado _vazioNIgnorado_)
    {
        // Constructor
        setVazioNIgnorado(_vazioNIgnorado_);

    }

    @Override
    public Object clone()
    {
        return new AParametroNuloParametros(
            cloneNode(this._vazioNIgnorado_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParametroNuloParametros(this);
    }

    public TVazioNIgnorado getVazioNIgnorado()
    {
        return this._vazioNIgnorado_;
    }

    public void setVazioNIgnorado(TVazioNIgnorado node)
    {
        if(this._vazioNIgnorado_ != null)
        {
            this._vazioNIgnorado_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._vazioNIgnorado_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._vazioNIgnorado_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._vazioNIgnorado_ == child)
        {
            this._vazioNIgnorado_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._vazioNIgnorado_ == oldChild)
        {
            setVazioNIgnorado((TVazioNIgnorado) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
