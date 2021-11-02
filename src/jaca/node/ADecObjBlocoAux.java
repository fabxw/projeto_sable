/* This file was generated by SableCC (http://www.sablecc.org/). */

package jaca.node;

import jaca.analysis.*;

@SuppressWarnings("nls")
public final class ADecObjBlocoAux extends PBlocoAux
{
    private PDecObj _decObj_;

    public ADecObjBlocoAux()
    {
        // Constructor
    }

    public ADecObjBlocoAux(
        @SuppressWarnings("hiding") PDecObj _decObj_)
    {
        // Constructor
        setDecObj(_decObj_);

    }

    @Override
    public Object clone()
    {
        return new ADecObjBlocoAux(
            cloneNode(this._decObj_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADecObjBlocoAux(this);
    }

    public PDecObj getDecObj()
    {
        return this._decObj_;
    }

    public void setDecObj(PDecObj node)
    {
        if(this._decObj_ != null)
        {
            this._decObj_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._decObj_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._decObj_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._decObj_ == child)
        {
            this._decObj_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._decObj_ == oldChild)
        {
            setDecObj((PDecObj) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
