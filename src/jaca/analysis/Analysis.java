/* This file was generated by SableCC (http://www.sablecc.org/). */

package jaca.analysis;

import jaca.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAProgramaPrograma(AProgramaPrograma node);
    void caseAClasseDefClasse(AClasseDefClasse node);
    void caseARelacaoRelacao(ARelacaoRelacao node);
    void caseAFamiliaFamilia(AFamiliaFamilia node);
    void caseARelacoesRelacoes(ARelacoesRelacoes node);
    void caseADecObjAtributos(ADecObjAtributos node);
    void caseADecVarAtributos(ADecVarAtributos node);
    void caseADecConsAtributos(ADecConsAtributos node);
    void caseADecProcedMetodos(ADecProcedMetodos node);
    void caseADecFuncaoMetodos(ADecFuncaoMetodos node);
    void caseADecObjDecObj(ADecObjDecObj node);
    void caseADecVarRealDecVar(ADecVarRealDecVar node);
    void caseADecConstanteRealDecCons(ADecConstanteRealDecCons node);
    void caseAInicializarInicializar(AInicializarInicializar node);
    void caseARealTipoPrimitivo(ARealTipoPrimitivo node);
    void caseABooleanoTipoPrimitivo(ABooleanoTipoPrimitivo node);
    void caseATipoClasseTipoClasse(ATipoClasseTipoClasse node);
    void caseATipoPrimitivoTipo(ATipoPrimitivoTipo node);
    void caseATipoClasseTipo(ATipoClasseTipo node);
    void caseADecFuncaoRealDecFuncao(ADecFuncaoRealDecFuncao node);
    void caseADecFuncaoBooleanaExpDecFuncao(ADecFuncaoBooleanaExpDecFuncao node);
    void caseAProcedComandoDecProced(AProcedComandoDecProced node);
    void caseAProcedDecProced(AProcedDecProced node);
    void caseASeInicialComando(ASeInicialComando node);
    void caseASenaoComando(ASenaoComando node);
    void caseAEnquantoComando(AEnquantoComando node);
    void caseAAtribuicaoComando(AAtribuicaoComando node);
    void caseAChamdaIdComando(AChamdaIdComando node);
    void caseABlocoComando(ABlocoComando node);
    void caseAInicioBloco(AInicioBloco node);
    void caseAAtributosEstruturaBloco(AAtributosEstruturaBloco node);
    void caseAComandoEstruturaBloco(AComandoEstruturaBloco node);
    void caseASenaoEstruturaSenao(ASenaoEstruturaSenao node);
    void caseAChamaChamada(AChamaChamada node);
    void caseAVazioListaListaExp(AVazioListaListaExp node);
    void caseAExprListaExp(AExprListaExp node);
    void caseAListaExpListaExp(AListaExpListaExp node);
    void caseAListasExpListasExp(AListasExpListasExp node);
    void caseAParametroNuloParametros(AParametroNuloParametros node);
    void caseAParametroParametros(AParametroParametros node);
    void caseAConjParametrosConjParametros(AConjParametrosConjParametros node);
    void caseAValorRealExp(AValorRealExp node);
    void caseABoolVerdadeExp(ABoolVerdadeExp node);
    void caseABoolFalsoExp(ABoolFalsoExp node);
    void caseAIdExp(AIdExp node);
    void caseAChamdaIdExp(AChamdaIdExp node);
    void caseAAtributoIdExp(AAtributoIdExp node);
    void caseAExpreExp(AExpreExp node);
    void caseANegativoExp(ANegativoExp node);
    void caseADifExp(ADifExp node);
    void caseAOpExp(AOpExp node);
    void caseABlocoExpExp(ABlocoExpExp node);
    void caseAChamadaChamadaOpcional(AChamadaChamadaOpcional node);
    void caseASomaOp(ASomaOp node);
    void caseAMenosOp(AMenosOp node);
    void caseAMultOp(AMultOp node);
    void caseADivOp(ADivOp node);
    void caseAModOp(AModOp node);
    void caseAIgualdadeOp(AIgualdadeOp node);
    void caseAMenorQueOp(AMenorQueOp node);
    void caseAMenorIgualQueOp(AMenorIgualQueOp node);
    void caseAAndOp(AAndOp node);
    void caseAOuOp(AOuOp node);
    void caseAInicioConstBlocoExp(AInicioConstBlocoExp node);
    void caseAAtributoAtributo(AAtributoAtributo node);
    void caseAParametroBoolParametro(AParametroBoolParametro node);

    void caseTClasse(TClasse node);
    void caseTFilha(TFilha node);
    void caseTOutput(TOutput node);
    void caseTAmpersand(TAmpersand node);
    void caseTPontoevirgula(TPontoevirgula node);
    void caseTFim(TFim node);
    void caseTInicio(TInicio node);
    void caseTObj(TObj node);
    void caseTVar(TVar node);
    void caseTConstante(TConstante node);
    void caseTInicializacao(TInicializacao node);
    void caseTBooleano(TBooleano node);
    void caseTReal(TReal node);
    void caseTDecProcedimento(TDecProcedimento node);
    void caseTProcedimento(TProcedimento node);
    void caseTFuncao(TFuncao node);
    void caseTVirgula(TVirgula node);
    void caseTSe(TSe node);
    void caseTEnquanto(TEnquanto node);
    void caseTSenao(TSenao node);
    void caseTPonto(TPonto node);
    void caseTVerdade(TVerdade node);
    void caseTFalso(TFalso node);
    void caseTNumero(TNumero node);
    void caseTId(TId node);
    void caseTIdClasse(TIdClasse node);
    void caseTSoma(TSoma node);
    void caseTMenos(TMenos node);
    void caseTMult(TMult node);
    void caseTDiv(TDiv node);
    void caseTMod(TMod node);
    void caseTIgualdade(TIgualdade node);
    void caseTMenorQue(TMenorQue node);
    void caseTMenorIgualQue(TMenorIgualQue node);
    void caseTDiferente(TDiferente node);
    void caseTAnd(TAnd node);
    void caseTOu(TOu node);
    void caseTParEsq(TParEsq node);
    void caseTParDir(TParDir node);
    void caseTComentarioLinha(TComentarioLinha node);
    void caseTComentarioBloco(TComentarioBloco node);
    void caseTBarra(TBarra node);
    void caseTVazio(TVazio node);
    void caseTVazioNIgnorado(TVazioNIgnorado node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
