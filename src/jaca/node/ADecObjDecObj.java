/* This file was generated by SableCC (http://www.sablecc.org/). */

package jaca.node;

import jaca.analysis.*;

@SuppressWarnings("nls")
public final class ADecObjDecObj extends PDecObj
{
    private TObj _obj_;
    private TIdClasse _idClasse_;
    private TId _id_;
    private TPontoevirgula _pontoevirgula_;

    public ADecObjDecObj()
    {
        // Constructor
    }

    public ADecObjDecObj(
        @SuppressWarnings("hiding") TObj _obj_,
        @SuppressWarnings("hiding") TIdClasse _idClasse_,
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") TPontoevirgula _pontoevirgula_)
    {
        // Constructor
        setObj(_obj_);

        setIdClasse(_idClasse_);

        setId(_id_);

        setPontoevirgula(_pontoevirgula_);

    }

    @Override
    public Object clone()
    {
        return new ADecObjDecObj(
            cloneNode(this._obj_),
            cloneNode(this._idClasse_),
            cloneNode(this._id_),
            cloneNode(this._pontoevirgula_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADecObjDecObj(this);
    }

    public TObj getObj()
    {
        return this._obj_;
    }

    public void setObj(TObj node)
    {
        if(this._obj_ != null)
        {
            this._obj_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._obj_ = node;
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
            + toString(this._obj_)
            + toString(this._idClasse_)
            + toString(this._id_)
            + toString(this._pontoevirgula_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._obj_ == child)
        {
            this._obj_ = null;
            return;
        }

        if(this._idClasse_ == child)
        {
            this._idClasse_ = null;
            return;
        }

        if(this._id_ == child)
        {
            this._id_ = null;
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
        if(this._obj_ == oldChild)
        {
            setObj((TObj) newChild);
            return;
        }

        if(this._idClasse_ == oldChild)
        {
            setIdClasse((TIdClasse) newChild);
            return;
        }

        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
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
