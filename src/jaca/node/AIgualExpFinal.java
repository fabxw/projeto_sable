/* This file was generated by SableCC (http://www.sablecc.org/). */

package jaca.node;

import jaca.analysis.*;

@SuppressWarnings("nls")
public final class AIgualExpFinal extends PExpFinal
{
    private PExp _exp_;
    private TIgualdade _igualdade_;
    private PExpAux _expAux_;

    public AIgualExpFinal()
    {
        // Constructor
    }

    public AIgualExpFinal(
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") TIgualdade _igualdade_,
        @SuppressWarnings("hiding") PExpAux _expAux_)
    {
        // Constructor
        setExp(_exp_);

        setIgualdade(_igualdade_);

        setExpAux(_expAux_);

    }

    @Override
    public Object clone()
    {
        return new AIgualExpFinal(
            cloneNode(this._exp_),
            cloneNode(this._igualdade_),
            cloneNode(this._expAux_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIgualExpFinal(this);
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

    public TIgualdade getIgualdade()
    {
        return this._igualdade_;
    }

    public void setIgualdade(TIgualdade node)
    {
        if(this._igualdade_ != null)
        {
            this._igualdade_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._igualdade_ = node;
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
            + toString(this._igualdade_)
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

        if(this._igualdade_ == child)
        {
            this._igualdade_ = null;
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

        if(this._igualdade_ == oldChild)
        {
            setIgualdade((TIgualdade) newChild);
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