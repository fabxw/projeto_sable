/* This file was generated by SableCC (http://www.sablecc.org/). */

package jaca.node;

import jaca.analysis.*;

@SuppressWarnings("nls")
public final class ADecProcedMetodos extends PMetodos
{
    private PDecProced _decProced_;

    public ADecProcedMetodos()
    {
        // Constructor
    }

    public ADecProcedMetodos(
        @SuppressWarnings("hiding") PDecProced _decProced_)
    {
        // Constructor
        setDecProced(_decProced_);

    }

    @Override
    public Object clone()
    {
        return new ADecProcedMetodos(
            cloneNode(this._decProced_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADecProcedMetodos(this);
    }

    public PDecProced getDecProced()
    {
        return this._decProced_;
    }

    public void setDecProced(PDecProced node)
    {
        if(this._decProced_ != null)
        {
            this._decProced_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._decProced_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._decProced_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._decProced_ == child)
        {
            this._decProced_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._decProced_ == oldChild)
        {
            setDecProced((PDecProced) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}