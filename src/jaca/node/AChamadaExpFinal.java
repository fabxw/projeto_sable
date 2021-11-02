/* This file was generated by SableCC (http://www.sablecc.org/). */

package jaca.node;

import jaca.analysis.*;

@SuppressWarnings("nls")
public final class AChamadaExpFinal extends PExpFinal
{
    private PChamada _chamada_;
    private TPontoevirgula _pontoevirgula_;

    public AChamadaExpFinal()
    {
        // Constructor
    }

    public AChamadaExpFinal(
        @SuppressWarnings("hiding") PChamada _chamada_,
        @SuppressWarnings("hiding") TPontoevirgula _pontoevirgula_)
    {
        // Constructor
        setChamada(_chamada_);

        setPontoevirgula(_pontoevirgula_);

    }

    @Override
    public Object clone()
    {
        return new AChamadaExpFinal(
            cloneNode(this._chamada_),
            cloneNode(this._pontoevirgula_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAChamadaExpFinal(this);
    }

    public PChamada getChamada()
    {
        return this._chamada_;
    }

    public void setChamada(PChamada node)
    {
        if(this._chamada_ != null)
        {
            this._chamada_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._chamada_ = node;
    }

    public TPontoevirgula getPontoevirgula()
    {
        return this._pontoevirgula_;
    }

    public void setPontoevirgula(TPontoevirgula node)
    {
        if(this._pontoevirgula_ != null)
        {
            this._pontoevirgula_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pontoevirgula_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._chamada_)
            + toString(this._pontoevirgula_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._chamada_ == child)
        {
            this._chamada_ = null;
            return;
        }

        if(this._pontoevirgula_ == child)
        {
            this._pontoevirgula_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._chamada_ == oldChild)
        {
            setChamada((PChamada) newChild);
            return;
        }

        if(this._pontoevirgula_ == oldChild)
        {
            setPontoevirgula((TPontoevirgula) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
