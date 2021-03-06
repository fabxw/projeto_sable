/* This file was generated by SableCC (http://www.sablecc.org/). */

package jaca.node;

import jaca.analysis.*;

@SuppressWarnings("nls")
public final class AIdClasseSeguinteIdClasseSeguinte extends PIdClasseSeguinte
{
    private TIdClasse _idClasse_;

    public AIdClasseSeguinteIdClasseSeguinte()
    {
        // Constructor
    }

    public AIdClasseSeguinteIdClasseSeguinte(
        @SuppressWarnings("hiding") TIdClasse _idClasse_)
    {
        // Constructor
        setIdClasse(_idClasse_);

    }

    @Override
    public Object clone()
    {
        return new AIdClasseSeguinteIdClasseSeguinte(
            cloneNode(this._idClasse_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIdClasseSeguinteIdClasseSeguinte(this);
    }

    public TIdClasse getIdClasse()
    {
        return this._idClasse_;
    }

    public void setIdClasse(TIdClasse node)
    {
        if(this._idClasse_ != null)
        {
            this._idClasse_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._idClasse_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._idClasse_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._idClasse_ == child)
        {
            this._idClasse_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._idClasse_ == oldChild)
        {
            setIdClasse((TIdClasse) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
