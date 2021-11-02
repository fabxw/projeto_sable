/* This file was generated by SableCC (http://www.sablecc.org/). */

package jaca.node;

import jaca.analysis.*;

@SuppressWarnings("nls")
public final class AEExpAux extends PExpAux
{
    private PExp _exp_;
    private TAnd _and_;
    private PExpFinal _expFinal_;

    public AEExpAux()
    {
        // Constructor
    }

    public AEExpAux(
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") TAnd _and_,
        @SuppressWarnings("hiding") PExpFinal _expFinal_)
    {
        // Constructor
        setExp(_exp_);

        setAnd(_and_);

        setExpFinal(_expFinal_);

    }

    @Override
    public Object clone()
    {
        return new AEExpAux(
            cloneNode(this._exp_),
            cloneNode(this._and_),
            cloneNode(this._expFinal_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEExpAux(this);
    }

    public PExp getExp()
    {
        return this._exp_;
    }

    public void setExp(PExp node)
    {
        if(this._exp_ != null)
        {
            this._exp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp_ = node;
    }

    public TAnd getAnd()
    {
        return this._and_;
    }

    public void setAnd(TAnd node)
    {
        if(this._and_ != null)
        {
            this._and_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._and_ = node;
    }

    public PExpFinal getExpFinal()
    {
        return this._expFinal_;
    }

    public void setExpFinal(PExpFinal node)
    {
        if(this._expFinal_ != null)
        {
            this._expFinal_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expFinal_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exp_)
            + toString(this._and_)
            + toString(this._expFinal_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        if(this._and_ == child)
        {
            this._and_ = null;
            return;
        }

        if(this._expFinal_ == child)
        {
            this._expFinal_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        if(this._and_ == oldChild)
        {
            setAnd((TAnd) newChild);
            return;
        }

        if(this._expFinal_ == oldChild)
        {
            setExpFinal((PExpFinal) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
