/* This file was generated by SableCC (http://www.sablecc.org/). */

package jaca.parser;

import jaca.node.*;
import jaca.analysis.*;

class TokenIndex extends AnalysisAdapter
{
    int index;

    @Override
    public void caseTClasse(@SuppressWarnings("unused") TClasse node)
    {
        this.index = 0;
    }

    @Override
    public void caseTFilha(@SuppressWarnings("unused") TFilha node)
    {
        this.index = 1;
    }

    @Override
    public void caseTOutput(@SuppressWarnings("unused") TOutput node)
    {
        this.index = 2;
    }

    @Override
    public void caseTAmpersand(@SuppressWarnings("unused") TAmpersand node)
    {
        this.index = 3;
    }

    @Override
    public void caseTPontoevirgula(@SuppressWarnings("unused") TPontoevirgula node)
    {
        this.index = 4;
    }

    @Override
    public void caseTFim(@SuppressWarnings("unused") TFim node)
    {
        this.index = 5;
    }

    @Override
    public void caseTInicio(@SuppressWarnings("unused") TInicio node)
    {
        this.index = 6;
    }

    @Override
    public void caseTObj(@SuppressWarnings("unused") TObj node)
    {
        this.index = 7;
    }

    @Override
    public void caseTVar(@SuppressWarnings("unused") TVar node)
    {
        this.index = 8;
    }

    @Override
    public void caseTConstante(@SuppressWarnings("unused") TConstante node)
    {
        this.index = 9;
    }

    @Override
    public void caseTInicializacao(@SuppressWarnings("unused") TInicializacao node)
    {
        this.index = 10;
    }

    @Override
    public void caseTBooleano(@SuppressWarnings("unused") TBooleano node)
    {
        this.index = 11;
    }

    @Override
    public void caseTReal(@SuppressWarnings("unused") TReal node)
    {
        this.index = 12;
    }

    @Override
    public void caseTDecProcedimento(@SuppressWarnings("unused") TDecProcedimento node)
    {
        this.index = 13;
    }

    @Override
    public void caseTProcedimento(@SuppressWarnings("unused") TProcedimento node)
    {
        this.index = 14;
    }

    @Override
    public void caseTFuncao(@SuppressWarnings("unused") TFuncao node)
    {
        this.index = 15;
    }

    @Override
    public void caseTVirgula(@SuppressWarnings("unused") TVirgula node)
    {
        this.index = 16;
    }

    @Override
    public void caseTSe(@SuppressWarnings("unused") TSe node)
    {
        this.index = 17;
    }

    @Override
    public void caseTEnquanto(@SuppressWarnings("unused") TEnquanto node)
    {
        this.index = 18;
    }

    @Override
    public void caseTSenao(@SuppressWarnings("unused") TSenao node)
    {
        this.index = 19;
    }

    @Override
    public void caseTPonto(@SuppressWarnings("unused") TPonto node)
    {
        this.index = 20;
    }

    @Override
    public void caseTVerdade(@SuppressWarnings("unused") TVerdade node)
    {
        this.index = 21;
    }

    @Override
    public void caseTFalso(@SuppressWarnings("unused") TFalso node)
    {
        this.index = 22;
    }

    @Override
    public void caseTNumero(@SuppressWarnings("unused") TNumero node)
    {
        this.index = 23;
    }

    @Override
    public void caseTId(@SuppressWarnings("unused") TId node)
    {
        this.index = 24;
    }

    @Override
    public void caseTIdClasse(@SuppressWarnings("unused") TIdClasse node)
    {
        this.index = 25;
    }

    @Override
    public void caseTSoma(@SuppressWarnings("unused") TSoma node)
    {
        this.index = 26;
    }

    @Override
    public void caseTMenos(@SuppressWarnings("unused") TMenos node)
    {
        this.index = 27;
    }

    @Override
    public void caseTMult(@SuppressWarnings("unused") TMult node)
    {
        this.index = 28;
    }

    @Override
    public void caseTDiv(@SuppressWarnings("unused") TDiv node)
    {
        this.index = 29;
    }

    @Override
    public void caseTMod(@SuppressWarnings("unused") TMod node)
    {
        this.index = 30;
    }

    @Override
    public void caseTIgualdade(@SuppressWarnings("unused") TIgualdade node)
    {
        this.index = 31;
    }

    @Override
    public void caseTMenorQue(@SuppressWarnings("unused") TMenorQue node)
    {
        this.index = 32;
    }

    @Override
    public void caseTMenorIgualQue(@SuppressWarnings("unused") TMenorIgualQue node)
    {
        this.index = 33;
    }

    @Override
    public void caseTDiferente(@SuppressWarnings("unused") TDiferente node)
    {
        this.index = 34;
    }

    @Override
    public void caseTAnd(@SuppressWarnings("unused") TAnd node)
    {
        this.index = 35;
    }

    @Override
    public void caseTOu(@SuppressWarnings("unused") TOu node)
    {
        this.index = 36;
    }

    @Override
    public void caseTParEsq(@SuppressWarnings("unused") TParEsq node)
    {
        this.index = 37;
    }

    @Override
    public void caseTParDir(@SuppressWarnings("unused") TParDir node)
    {
        this.index = 38;
    }

    @Override
    public void caseTBarra(@SuppressWarnings("unused") TBarra node)
    {
        this.index = 39;
    }

    @Override
    public void caseTVazioNIgnorado(@SuppressWarnings("unused") TVazioNIgnorado node)
    {
        this.index = 40;
    }

    @Override
    public void caseEOF(@SuppressWarnings("unused") EOF node)
    {
        this.index = 41;
    }
}