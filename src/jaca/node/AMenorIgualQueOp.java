/* This file was generated by SableCC (http://www.sablecc.org/). */

package jaca.node;

import jaca.analysis.*;

@SuppressWarnings("nls")
public final class AMenorIgualQueOp extends POp
{
    private TMenorIgualQue _menorIgualQue_;

    public AMenorIgualQueOp()
    {
        // Constructor
    }

    public AMenorIgualQueOp(
        @SuppressWarnings("hiding") TMenorIgualQue _menorIgualQue_)
    {
        // Constructor
        setMenorIgualQue(_menorIgualQue_);

    }

    @Override
    public Object clone()
    {
        return new AMenorIgualQueOp(
            cloneNode(this._menorIgualQue_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMenorIgualQueOp(this);
    }

    public TMenorIgualQue getMenorIgualQue()
    {
        return this._menorIgualQue_;
    }

    public void setMenorIgualQue(TMenorIgualQue node)
    {
        if(this._menorIgualQue_ != null)
        {
            this._menorIgualQue_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._menorIgualQue_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._menorIgualQue_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._menorIgualQue_ == child)
        {
            this._menorIgualQue_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._menorIgualQue_ == oldChild)
        {
            setMenorIgualQue((TMenorIgualQue) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
