/* This file was generated by SableCC (http://www.sablecc.org/). */

package jaca.node;

import jaca.analysis.*;

@SuppressWarnings("nls")
public final class AChamdaIdComandoFinal extends PComandoFinal
{
    private TId _id_;
    private TPonto _ponto_;
    private PChamada _chamada_;
    private TPontoevirgula _pontoevirgula_;

    public AChamdaIdComandoFinal()
    {
        // Constructor
    }

    public AChamdaIdComandoFinal(
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") TPonto _ponto_,
        @SuppressWarnings("hiding") PChamada _chamada_,
        @SuppressWarnings("hiding") TPontoevirgula _pontoevirgula_)
    {
        // Constructor
        setId(_id_);

        setPonto(_ponto_);

        setChamada(_chamada_);

        setPontoevirgula(_pontoevirgula_);

    }

    @Override
    public Object clone()
    {
        return new AChamdaIdComandoFinal(
            cloneNode(this._id_),
            cloneNode(this._ponto_),
            cloneNode(this._chamada_),
            cloneNode(this._pontoevirgula_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAChamdaIdComandoFinal(this);
    }

    public TId getId()
    {
        return this._id_;
    }

    public void setId(TId node)
    {
        if(this._id_ != null)
        {
            this._id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id_ = node;
    }

    public TPonto getPonto()
    {
        return this._ponto_;
    }

    public void setPonto(TPonto node)
    {
        if(this._ponto_ != null)
        {
            this._ponto_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ponto_ = node;
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
            + toString(this._id_)
            + toString(this._ponto_)
            + toString(this._chamada_)
            + toString(this._pontoevirgula_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._ponto_ == child)
        {
            this._ponto_ = null;
            return;
        }

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
        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(this._ponto_ == oldChild)
        {
            setPonto((TPonto) newChild);
            return;
        }

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
