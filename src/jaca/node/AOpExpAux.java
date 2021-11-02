/* This file was generated by SableCC (http://www.sablecc.org/). */

package jaca.node;

import jaca.analysis.*;

@SuppressWarnings("nls")
public final class AOpExpAux extends PExpAux
{
    private PExp _exp_;
    private POp _op_;
    private PExpFinal _expFinal_;

    public AOpExpAux()
    {
        // Constructor
    }

    public AOpExpAux(
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") POp _op_,
        @SuppressWarnings("hiding") PExpFinal _expFinal_)
    {
        // Constructor
        setExp(_exp_);

        setOp(_op_);

        setExpFinal(_expFinal_);

    }

    @Override
    public Object clone()
    {
        return new AOpExpAux(
            cloneNode(this._exp_),
            cloneNode(this._op_),
            cloneNode(this._expFinal_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOpExpAux(this);
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

    public POp getOp()
    {
        return this._op_;
    }

    public void setOp(POp node)
    {
        if(this._op_ != null)
        {
            this._op_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._op_ = node;
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
            + toString(this._op_)
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

        if(this._op_ == child)
        {
            this._op_ = null;
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

        if(this._op_ == oldChild)
        {
            setOp((POp) newChild);
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