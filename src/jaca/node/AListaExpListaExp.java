/* This file was generated by SableCC (http://www.sablecc.org/). */

package jaca.node;

import jaca.analysis.*;

@SuppressWarnings("nls")
public final class AListaExpListaExp extends PListaExp
{
    private PExp _exp_;
    private PListasExp _listasExp_;

    public AListaExpListaExp()
    {
        // Constructor
    }

    public AListaExpListaExp(
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") PListasExp _listasExp_)
    {
        // Constructor
        setExp(_exp_);

        setListasExp(_listasExp_);

    }

    @Override
    public Object clone()
    {
        return new AListaExpListaExp(
            cloneNode(this._exp_),
            cloneNode(this._listasExp_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAListaExpListaExp(this);
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

    public PListasExp getListasExp()
    {
        return this._listasExp_;
    }

    public void setListasExp(PListasExp node)
    {
        if(this._listasExp_ != null)
        {
            this._listasExp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._listasExp_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exp_)
            + toString(this._listasExp_);
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

        if(this._listasExp_ == child)
        {
            this._listasExp_ = null;
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

        if(this._listasExp_ == oldChild)
        {
            setListasExp((PListasExp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}