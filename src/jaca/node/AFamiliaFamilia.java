/* This file was generated by SableCC (http://www.sablecc.org/). */

package jaca.node;

import java.util.*;
import jaca.analysis.*;

@SuppressWarnings("nls")
public final class AFamiliaFamilia extends PFamilia
{
    private PRelacao _relacao_;
    private final LinkedList<PRelacoes> _relacoes_ = new LinkedList<PRelacoes>();
    private TPontoevirgula _pontoevirgula_;

    public AFamiliaFamilia()
    {
        // Constructor
    }

    public AFamiliaFamilia(
        @SuppressWarnings("hiding") PRelacao _relacao_,
        @SuppressWarnings("hiding") List<?> _relacoes_,
        @SuppressWarnings("hiding") TPontoevirgula _pontoevirgula_)
    {
        // Constructor
        setRelacao(_relacao_);

        setRelacoes(_relacoes_);

        setPontoevirgula(_pontoevirgula_);

    }

    @Override
    public Object clone()
    {
        return new AFamiliaFamilia(
            cloneNode(this._relacao_),
            cloneList(this._relacoes_),
            cloneNode(this._pontoevirgula_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFamiliaFamilia(this);
    }

    public PRelacao getRelacao()
    {
        return this._relacao_;
    }

    public void setRelacao(PRelacao node)
    {
        if(this._relacao_ != null)
        {
            this._relacao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._relacao_ = node;
    }

    public LinkedList<PRelacoes> getRelacoes()
    {
        return this._relacoes_;
    }

    public void setRelacoes(List<?> list)
    {
        for(PRelacoes e : this._relacoes_)
        {
            e.parent(null);
        }
        this._relacoes_.clear();

        for(Object obj_e : list)
        {
            PRelacoes e = (PRelacoes) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._relacoes_.add(e);
        }
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
            + toString(this._relacao_)
            + toString(this._relacoes_)
            + toString(this._pontoevirgula_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._relacao_ == child)
        {
            this._relacao_ = null;
            return;
        }

        if(this._relacoes_.remove(child))
        {
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
        if(this._relacao_ == oldChild)
        {
            setRelacao((PRelacao) newChild);
            return;
        }

        for(ListIterator<PRelacoes> i = this._relacoes_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PRelacoes) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._pontoevirgula_ == oldChild)
        {
            setPontoevirgula((TPontoevirgula) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
