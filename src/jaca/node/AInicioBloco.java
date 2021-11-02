/* This file was generated by SableCC (http://www.sablecc.org/). */

package jaca.node;

import jaca.analysis.*;

@SuppressWarnings("nls")
public final class AInicioBloco extends PBloco
{
    private TInicio _inicio_;
    private PEstruturaBloco _estruturaBloco_;
    private TFim _fim_;

    public AInicioBloco()
    {
        // Constructor
    }

    public AInicioBloco(
        @SuppressWarnings("hiding") TInicio _inicio_,
        @SuppressWarnings("hiding") PEstruturaBloco _estruturaBloco_,
        @SuppressWarnings("hiding") TFim _fim_)
    {
        // Constructor
        setInicio(_inicio_);

        setEstruturaBloco(_estruturaBloco_);

        setFim(_fim_);

    }

    @Override
    public Object clone()
    {
        return new AInicioBloco(
            cloneNode(this._inicio_),
            cloneNode(this._estruturaBloco_),
            cloneNode(this._fim_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAInicioBloco(this);
    }

    public TInicio getInicio()
    {
        return this._inicio_;
    }

    public void setInicio(TInicio node)
    {
        if(this._inicio_ != null)
        {
            this._inicio_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._inicio_ = node;
    }

    public PEstruturaBloco getEstruturaBloco()
    {
        return this._estruturaBloco_;
    }

    public void setEstruturaBloco(PEstruturaBloco node)
    {
        if(this._estruturaBloco_ != null)
        {
            this._estruturaBloco_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._estruturaBloco_ = node;
    }

    public TFim getFim()
    {
        return this._fim_;
    }

    public void setFim(TFim node)
    {
        if(this._fim_ != null)
        {
            this._fim_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fim_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._inicio_)
            + toString(this._estruturaBloco_)
            + toString(this._fim_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._inicio_ == child)
        {
            this._inicio_ = null;
            return;
        }

        if(this._estruturaBloco_ == child)
        {
            this._estruturaBloco_ = null;
            return;
        }

        if(this._fim_ == child)
        {
            this._fim_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._inicio_ == oldChild)
        {
            setInicio((TInicio) newChild);
            return;
        }

        if(this._estruturaBloco_ == oldChild)
        {
            setEstruturaBloco((PEstruturaBloco) newChild);
            return;
        }

        if(this._fim_ == oldChild)
        {
            setFim((TFim) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
