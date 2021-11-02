/* This file was generated by SableCC (http://www.sablecc.org/). */

package jaca.node;

import jaca.analysis.*;

@SuppressWarnings("nls")
public final class ABlocoExpExpAux extends PExpAux
{
    private PBlocoExp _blocoExp_;

    public ABlocoExpExpAux()
    {
        // Constructor
    }

    public ABlocoExpExpAux(
        @SuppressWarnings("hiding") PBlocoExp _blocoExp_)
    {
        // Constructor
        setBlocoExp(_blocoExp_);

    }

    @Override
    public Object clone()
    {
        return new ABlocoExpExpAux(
            cloneNode(this._blocoExp_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABlocoExpExpAux(this);
    }

    public PBlocoExp getBlocoExp()
    {
        return this._blocoExp_;
    }

    public void setBlocoExp(PBlocoExp node)
    {
        if(this._blocoExp_ != null)
        {
            this._blocoExp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._blocoExp_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._blocoExp_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._blocoExp_ == child)
        {
            this._blocoExp_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._blocoExp_ == oldChild)
        {
            setBlocoExp((PBlocoExp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
