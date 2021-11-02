/* This file was generated by SableCC (http://www.sablecc.org/). */

package jaca.node;

import jaca.analysis.*;

@SuppressWarnings("nls")
public final class AOuExpFinal extends PExpFinal
{
    private PExp _exp_;
    private TOu _ou_;
    private PExpAux _expAux_;

    public AOuExpFinal()
    {
        // Constructor
    }

    public AOuExpFinal(
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") TOu _ou_,
        @SuppressWarnings("hiding") PExpAux _expAux_)
    {
        // Constructor
        setExp(_exp_);

        setOu(_ou_);

        setExpAux(_expAux_);

    }

    @Override
    public Object clone()
    {
        return new AOuExpFinal(
            cloneNode(this._exp_),
            cloneNode(this._ou_),
            cloneNode(this._expAux_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOuExpFinal(this);
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

    public TOu getOu()
    {
        return this._ou_;
    }

    public void setOu(TOu node)
    {
        if(this._ou_ != null)
        {
            this._ou_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ou_ = node;
    }

    public PExpAux getExpAux()
    {
        return this._expAux_;
    }

    public void setExpAux(PExpAux node)
    {
        if(this._expAux_ != null)
        {
            this._expAux_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expAux_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exp_)
            + toString(this._ou_)
            + toString(this._expAux_);
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

        if(this._ou_ == child)
        {
            this._ou_ = null;
            return;
        }

        if(this._expAux_ == child)
        {
            this._expAux_ = null;
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

        if(this._ou_ == oldChild)
        {
            setOu((TOu) newChild);
            return;
        }

        if(this._expAux_ == oldChild)
        {
            setExpAux((PExpAux) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
