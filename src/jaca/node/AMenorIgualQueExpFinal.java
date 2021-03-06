/* This file was generated by SableCC (http://www.sablecc.org/). */

package jaca.node;

import jaca.analysis.*;

@SuppressWarnings("nls")
public final class AMenorIgualQueExpFinal extends PExpFinal
{
    private PExp _exp_;
    private TMenorIgualQue _menorIgualQue_;
    private PExpAux _expAux_;

    public AMenorIgualQueExpFinal()
    {
        // Constructor
    }

    public AMenorIgualQueExpFinal(
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") TMenorIgualQue _menorIgualQue_,
        @SuppressWarnings("hiding") PExpAux _expAux_)
    {
        // Constructor
        setExp(_exp_);

        setMenorIgualQue(_menorIgualQue_);

        setExpAux(_expAux_);

    }

    @Override
    public Object clone()
    {
        return new AMenorIgualQueExpFinal(
            cloneNode(this._exp_),
            cloneNode(this._menorIgualQue_),
            cloneNode(this._expAux_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMenorIgualQueExpFinal(this);
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
            + toString(this._menorIgualQue_)
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

        if(this._menorIgualQue_ == child)
        {
            this._menorIgualQue_ = null;
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

        if(this._menorIgualQue_ == oldChild)
        {
            setMenorIgualQue((TMenorIgualQue) newChild);
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
