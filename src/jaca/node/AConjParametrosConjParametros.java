/* This file was generated by SableCC (http://www.sablecc.org/). */

package jaca.node;

import jaca.analysis.*;

@SuppressWarnings("nls")
public final class AConjParametrosConjParametros extends PConjParametros
{
    private TBarra _barra_;
    private PParametro _parametro_;

    public AConjParametrosConjParametros()
    {
        // Constructor
    }

    public AConjParametrosConjParametros(
        @SuppressWarnings("hiding") TBarra _barra_,
        @SuppressWarnings("hiding") PParametro _parametro_)
    {
        // Constructor
        setBarra(_barra_);

        setParametro(_parametro_);

    }

    @Override
    public Object clone()
    {
        return new AConjParametrosConjParametros(
            cloneNode(this._barra_),
            cloneNode(this._parametro_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAConjParametrosConjParametros(this);
    }

    public TBarra getBarra()
    {
        return this._barra_;
    }

    public void setBarra(TBarra node)
    {
        if(this._barra_ != null)
        {
            this._barra_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._barra_ = node;
    }

    public PParametro getParametro()
    {
        return this._parametro_;
    }

    public void setParametro(PParametro node)
    {
        if(this._parametro_ != null)
        {
            this._parametro_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parametro_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._barra_)
            + toString(this._parametro_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._barra_ == child)
        {
            this._barra_ = null;
            return;
        }

        if(this._parametro_ == child)
        {
            this._parametro_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._barra_ == oldChild)
        {
            setBarra((TBarra) newChild);
            return;
        }

        if(this._parametro_ == oldChild)
        {
            setParametro((PParametro) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
