package br.com.correios.webservice.postagem

import br.com.correios.webservice.enums.Acao
import br.com.correios.webservice.enums.StatusCartao
import br.com.correios.webservice.enums.StatusPlp
import br.com.correios.webservice.enums.TipoBloqueio
import javax.jws.*
import javax.xml.bind.annotation.XmlSeeAlso
import javax.xml.datatype.XMLGregorianCalendar
import javax.xml.ws.RequestWrapper
import javax.xml.ws.ResponseWrapper

/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 *
 */
@WebService(name = "AtendeCliente", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/")
//@XmlSeeAlso(ObjectFactory::class)
interface AtendeCliente {

    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(
        localName = "bloquearObjeto",
        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
        className = "br.com.correios.webservice.postagem.BloquearObjeto"
    )
    @ResponseWrapper(
        localName = "bloquearObjetoResponse",
        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
        className = "br.com.correios.webservice.postagem.BloquearObjetoResponse"
    )
    @Throws(AutenticacaoException::class, SigepClienteException::class)
    @HandlerChain(file = "handlers.xml")
    fun bloquearObjeto(
        @WebParam(name = "numeroEtiqueta", targetNamespace = "") numeroEtiqueta: String?,
        @WebParam(name = "idPlp", targetNamespace = "") idPlp: Long?,
        @WebParam(name = "tipoBloqueio", targetNamespace = "") tipoBloqueio: TipoBloqueio?,
        @WebParam(name = "acao", targetNamespace = "") acao: Acao?,
        @WebParam(name = "usuario", targetNamespace = "") usuario: String?,
        @WebParam(name = "senha", targetNamespace = "") senha: String?
    ): String?

    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(
        localName = "buscaCliente",
        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
        className = "br.com.correios.webservice.postagem.BuscaCliente"
    )
    @ResponseWrapper(
        localName = "buscaClienteResponse",
        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
        className = "br.com.correios.webservice.postagem.BuscaClienteResponse"
    )
    @Throws(AutenticacaoException::class, SigepClienteException::class)
    @HandlerChain(file = "handlers.xml")
    fun buscaCliente(
        @WebParam(name = "idContrato", targetNamespace = "") idContrato: String?,
        @WebParam(name = "idCartaoPostagem", targetNamespace = "") idCartaoPostagem: String?,
        @WebParam(name = "usuario", targetNamespace = "") usuario: String?,
        @WebParam(name = "senha", targetNamespace = "") senha: String?
    ): ClienteERP?

    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(
        localName = "buscaContrato",
        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
        className = "br.com.correios.webservice.postagem.BuscaContrato"
    )
    @ResponseWrapper(
        localName = "buscaContratoResponse",
        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
        className = "br.com.correios.webservice.postagem.BuscaContratoResponse"
    )
    @Throws(AutenticacaoException::class, SigepClienteException::class)
    @HandlerChain(file = "handlers.xml")
    fun buscaContrato(
        @WebParam(name = "numero", targetNamespace = "") numero: String?,
        @WebParam(name = "diretoria", targetNamespace = "") diretoria: Long,
        @WebParam(name = "usuario", targetNamespace = "") usuario: String?,
        @WebParam(name = "senha", targetNamespace = "") senha: String?
    ): ContratoERP?

    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(
        localName = "buscaPagamentoEntrega",
        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
        className = "br.com.correios.webservice.postagem.BuscaPagamentoEntrega"
    )
    @ResponseWrapper(
        localName = "buscaPagamentoEntregaResponse",
        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
        className = "br.com.correios.webservice.postagem.BuscaPagamentoEntregaResponse"
    )
    @Throws(AutenticacaoException::class, SigepClienteException::class)
    @HandlerChain(file = "handlers.xml")
    fun buscaPagamentoEntrega(
        @WebParam(name = "usuario", targetNamespace = "") usuario: String?,
        @WebParam(name = "senha", targetNamespace = "") senha: String?
    ): String?

    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(
        localName = "buscaServicos",
        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
        className = "br.com.correios.webservice.postagem.BuscaServicos"
    )
    @ResponseWrapper(
        localName = "buscaServicosResponse",
        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
        className = "br.com.correios.webservice.postagem.BuscaServicosResponse"
    )
    @Throws(AutenticacaoException::class, SigepClienteException::class)
    @HandlerChain(file = "handlers.xml")
    fun buscaServicos(
        @WebParam(name = "idContrato", targetNamespace = "") idContrato: String?,
        @WebParam(name = "idCartaoPostagem", targetNamespace = "") idCartaoPostagem: String?,
        @WebParam(name = "usuario", targetNamespace = "") usuario: String?,
        @WebParam(name = "senha", targetNamespace = "") senha: String?
    ): List<ServicoERP?>?

    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(
        localName = "cancelarObjeto",
        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
        className = "br.com.correios.webservice.postagem.CancelarObjeto"
    )
    @ResponseWrapper(
        localName = "cancelarObjetoResponse",
        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
        className = "br.com.correios.webservice.postagem.CancelarObjetoResponse"
    )
    @Throws(AutenticacaoException::class, ExceptionException::class, SigepClienteException::class)
    @HandlerChain(file = "handlers.xml")
    fun cancelarObjeto(
        @WebParam(name = "idPlp", targetNamespace = "") idPlp: Long?,
        @WebParam(name = "numeroEtiqueta", targetNamespace = "") numeroEtiqueta: String?,
        @WebParam(name = "usuario", targetNamespace = "") usuario: String?,
        @WebParam(name = "senha", targetNamespace = "") senha: String?
    ): Boolean?

    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(
        localName = "cancelarPedidoScol",
        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
        className = "br.com.correios.webservice.postagem.CancelarPedidoScol"
    )
    @ResponseWrapper(
        localName = "cancelarPedidoScolResponse",
        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
        className = "br.com.correios.webservice.postagem.CancelarPedidoScolResponse"
    )
    @Throws(AutenticacaoException::class, SigepClienteException::class)
    @HandlerChain(file = "handlers.xml")
    fun cancelarPedidoScol(
        @WebParam(name = "codAdministrativo", targetNamespace = "") codAdministrativo: Int?,
        @WebParam(name = "idPostagem", targetNamespace = "") idPostagem: String?,
        @WebParam(name = "tipo", targetNamespace = "") tipo: String?,
        @WebParam(name = "usuario", targetNamespace = "") usuario: String?,
        @WebParam(name = "senha", targetNamespace = "") senha: String?
    ): RetornoCancelamentoTO?

    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(
        localName = "consultaCEP",
        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
        className = "br.com.correios.webservice.postagem.ConsultaCEP"
    )
    @ResponseWrapper(
        localName = "consultaCEPResponse",
        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
        className = "br.com.correios.webservice.postagem.ConsultaCEPResponse"
    )
    @Throws(SQLExceptionException::class, SigepClienteException::class)
    @HandlerChain(file = "handlers.xml")
    fun consultaCEP(
        @WebParam(name = "cep", targetNamespace = "") cep: String?
    ): EnderecoERP?

    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(
        localName = "fechaPlp",
        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
        className = "br.com.correios.webservice.postagem.FechaPlp"
    )
    @ResponseWrapper(
        localName = "fechaPlpResponse",
        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
        className = "br.com.correios.webservice.postagem.FechaPlpResponse"
    )
    @Throws(AutenticacaoException::class, SigepClienteException::class)
    @HandlerChain(file = "handlers.xml")
    fun fechaPlp(
        @WebParam(name = "xml", targetNamespace = "") xml: String?,
        @WebParam(name = "idPlpCliente", targetNamespace = "") idPlpCliente: Long?,
        @WebParam(name = "cartaoPostagem", targetNamespace = "") cartaoPostagem: String?,
        @WebParam(name = "faixaEtiquetas", targetNamespace = "") faixaEtiquetas: String?,
        @WebParam(name = "usuario", targetNamespace = "") usuario: String?,
        @WebParam(name = "senha", targetNamespace = "") senha: String?
    ): Long?

    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(
        localName = "fechaPlpVariosServicos",
        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
        className = "br.com.correios.webservice.postagem.FechaPlpVariosServicos"
    )
    @ResponseWrapper(
        localName = "fechaPlpVariosServicosResponse",
        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
        className = "br.com.correios.webservice.postagem.FechaPlpVariosServicosResponse"
    )
    @Throws(AutenticacaoException::class, SigepClienteException::class)
    @HandlerChain(file = "handlers.xml")
    fun fechaPlpVariosServicos(
        @WebParam(name = "xml", targetNamespace = "") xml: String?,
        @WebParam(name = "idPlpCliente", targetNamespace = "") idPlpCliente: Long?,
        @WebParam(name = "cartaoPostagem", targetNamespace = "") cartaoPostagem: String?,
        @WebParam(name = "listaEtiquetas", targetNamespace = "") listaEtiquetas: List<String?>?,
        @WebParam(name = "usuario", targetNamespace = "") usuario: String?,
        @WebParam(name = "senha", targetNamespace = "") senha: String?
    ): Long?

    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(
        localName = "geraDigitoVerificadorEtiquetas",
        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
        className = "br.com.correios.webservice.postagem.GeraDigitoVerificadorEtiquetas"
    )
    @ResponseWrapper(
        localName = "geraDigitoVerificadorEtiquetasResponse",
        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
        className = "br.com.correios.webservice.postagem.GeraDigitoVerificadorEtiquetasResponse"
    )
    @Throws(AutenticacaoException::class, SigepClienteException::class)
    @HandlerChain(file = "handlers.xml")
    fun geraDigitoVerificadorEtiquetas(
        @WebParam(name = "etiquetas", targetNamespace = "") etiquetas: List<String?>?,
        @WebParam(name = "usuario", targetNamespace = "") usuario: String?,
        @WebParam(name = "senha", targetNamespace = "") senha: String?
    ): List<Int?>?

    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(
        localName = "getStatusCartaoPostagem",
        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
        className = "br.com.correios.webservice.postagem.GetStatusCartaoPostagem"
    )
    @ResponseWrapper(
        localName = "getStatusCartaoPostagemResponse",
        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
        className = "br.com.correios.webservice.postagem.GetStatusCartaoPostagemResponse"
    )
    @Throws(AutenticacaoException::class, SigepClienteException::class)
    @HandlerChain(file = "handlers.xml")
    fun getStatusCartaoPostagem(
        @WebParam(name = "numeroCartaoPostagem", targetNamespace = "") numeroCartaoPostagem: String?,
        @WebParam(name = "usuario", targetNamespace = "") usuario: String?,
        @WebParam(name = "senha", targetNamespace = "") senha: String?
    ): StatusCartao?

    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(
        localName = "getStatusPLP",
        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
        className = "br.com.correios.webservice.postagem.GetStatusPLP"
    )
    @ResponseWrapper(
        localName = "getStatusPLPResponse",
        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
        className = "br.com.correios.webservice.postagem.GetStatusPLPResponse"
    )
    @Throws(SigepClienteException::class)
    @HandlerChain(file = "handlers.xml")
    fun getStatusPLP(
        @WebParam(name = "arg0", targetNamespace = "") arg0: List<ObjetoPostal?>?,
        @WebParam(name = "arg1", targetNamespace = "") arg1: String?
    ): StatusPlp?

    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(
        localName = "integrarUsuarioScol",
        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
        className = "br.com.correios.webservice.postagem.IntegrarUsuarioScol"
    )
    @ResponseWrapper(
        localName = "integrarUsuarioScolResponse",
        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
        className = "br.com.correios.webservice.postagem.IntegrarUsuarioScolResponse"
    )
    @Throws(AutenticacaoException::class, SigepClienteException::class)
    @HandlerChain(file = "handlers.xml")
    fun integrarUsuarioScol(
        @WebParam(name = "codAdministrativo", targetNamespace = "") codAdministrativo: Int?,
        @WebParam(name = "usuario", targetNamespace = "") usuario: String?,
        @WebParam(name = "senha", targetNamespace = "") senha: String?
    ): Boolean?

    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(
        localName = "obterClienteAtualizacao",
        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
        className = "br.com.correios.webservice.postagem.ObterClienteAtualizacao"
    )
    @ResponseWrapper(
        localName = "obterClienteAtualizacaoResponse",
        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
        className = "br.com.correios.webservice.postagem.ObterClienteAtualizacaoResponse"
    )
    @Throws(AutenticacaoException::class, SigepClienteException::class)
    @HandlerChain(file = "handlers.xml")
    fun obterClienteAtualizacao(
        @WebParam(name = "cnpjCliente", targetNamespace = "") cnpjCliente: String?,
        @WebParam(name = "usuario", targetNamespace = "") usuario: String?,
        @WebParam(name = "senha", targetNamespace = "") senha: String?
    ): XMLGregorianCalendar?

    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(
        localName = "obterEmbalagemLRS",
        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
        className = "br.com.correios.webservice.postagem.ObterEmbalagemLRS"
    )
    @ResponseWrapper(
        localName = "obterEmbalagemLRSResponse",
        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
        className = "br.com.correios.webservice.postagem.ObterEmbalagemLRSResponse"
    )
    @Throws(SigepClienteException::class)
    @HandlerChain(file = "handlers.xml")
    fun obterEmbalagemLRS(): List<EmbalagemLRSMaster?>?

    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(
        localName = "solicitaEtiquetas",
        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
        className = "br.com.correios.webservice.postagem.SolicitaEtiquetas"
    )
    @ResponseWrapper(
        localName = "solicitaEtiquetasResponse",
        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
        className = "br.com.correios.webservice.postagem.SolicitaEtiquetasResponse"
    )
    @Throws(AutenticacaoException::class, SigepClienteException::class)
    @HandlerChain(file = "handlers.xml")
    fun solicitaEtiquetas(
        @WebParam(name = "tipoDestinatario", targetNamespace = "") tipoDestinatario: String?,
        @WebParam(name = "identificador", targetNamespace = "") identificador: String?,
        @WebParam(name = "idServico", targetNamespace = "") idServico: Long?,
        @WebParam(name = "qtdEtiquetas", targetNamespace = "") qtdEtiquetas: Int?,
        @WebParam(name = "usuario", targetNamespace = "") usuario: String?,
        @WebParam(name = "senha", targetNamespace = "") senha: String?
    ): String?

    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(
        localName = "solicitaPLP",
        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
        className = "br.com.correios.webservice.postagem.SolicitaPLP"
    )
    @ResponseWrapper(
        localName = "solicitaPLPResponse",
        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
        className = "br.com.correios.webservice.postagem.SolicitaPLPResponse"
    )
    @Throws(AutenticacaoException::class, SigepClienteException::class)
    @HandlerChain(file = "handlers.xml")
    fun solicitaPLP(
        @WebParam(name = "idPlpMaster", targetNamespace = "") idPlpMaster: Long?,
        @WebParam(name = "numEtiqueta", targetNamespace = "") numEtiqueta: String?,
        @WebParam(name = "usuario", targetNamespace = "") usuario: String?,
        @WebParam(name = "senha", targetNamespace = "") senha: String?
    ): String?

    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(
        localName = "solicitarPostagemScol",
        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
        className = "br.com.correios.webservice.postagem.SolicitarPostagemScol"
    )
    @ResponseWrapper(
        localName = "solicitarPostagemScolResponse",
        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
        className = "br.com.correios.webservice.postagem.SolicitarPostagemScolResponse"
    )
    @Throws(AutenticacaoException::class, SigepClienteException::class)
    @HandlerChain(file = "handlers.xml")
    fun solicitarPostagemScol(
        @WebParam(name = "codAdministrativo", targetNamespace = "") codAdministrativo: Int?,
        @WebParam(name = "xml", targetNamespace = "") xml: String?,
        @WebParam(name = "usuario", targetNamespace = "") usuario: String?,
        @WebParam(name = "senha", targetNamespace = "") senha: String?
    ): String?

    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(
        localName = "solicitaXmlPlp",
        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
        className = "br.com.correios.webservice.postagem.SolicitaXmlPlp"
    )
    @ResponseWrapper(
        localName = "solicitaXmlPlpResponse",
        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
        className = "br.com.correios.webservice.postagem.SolicitaXmlPlpResponse"
    )
    @Throws(AutenticacaoException::class, SigepClienteException::class)
    @HandlerChain(file = "handlers.xml")
    fun solicitaXmlPlp(
        @WebParam(name = "idPlpMaster", targetNamespace = "") idPlpMaster: Long?,
        @WebParam(name = "usuario", targetNamespace = "") usuario: String?,
        @WebParam(name = "senha", targetNamespace = "") senha: String?
    ): String?

    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(
        localName = "validaEtiquetaPLP",
        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
        className = "br.com.correios.webservice.postagem.ValidaEtiquetaPLP"
    )
    @ResponseWrapper(
        localName = "validaEtiquetaPLPResponse",
        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
        className = "br.com.correios.webservice.postagem.ValidaEtiquetaPLPResponse"
    )
    @Throws(AutenticacaoException::class, SigepClienteException::class)
    @HandlerChain(file = "handlers.xml")
    fun validaEtiquetaPLP(
        @WebParam(name = "numeroEtiqueta", targetNamespace = "") numeroEtiqueta: String?,
        @WebParam(name = "idPlp", targetNamespace = "") idPlp: Long?,
        @WebParam(name = "usuario", targetNamespace = "") usuario: String?,
        @WebParam(name = "senha", targetNamespace = "") senha: String?
    ): Boolean

    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(
        localName = "validaPlp",
        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
        className = "br.com.correios.webservice.postagem.ValidaPlp"
    )
    @ResponseWrapper(
        localName = "validaPlpResponse",
        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
        className = "br.com.correios.webservice.postagem.ValidaPlpResponse"
    )
    @Throws(AutenticacaoException::class, SigepClienteException::class)
    @HandlerChain(file = "handlers.xml")
    fun validaPlp(
        @WebParam(name = "cliente", targetNamespace = "") cliente: Long,
        @WebParam(name = "numero", targetNamespace = "") numero: String?,
        @WebParam(name = "diretoria", targetNamespace = "") diretoria: Long,
        @WebParam(name = "cartao", targetNamespace = "") cartao: String?,
        @WebParam(name = "unidadePostagem", targetNamespace = "") unidadePostagem: String?,
        @WebParam(name = "servico", targetNamespace = "") servico: Long?,
        @WebParam(name = "servicosAdicionais", targetNamespace = "") servicosAdicionais: List<String?>?,
        @WebParam(name = "usuario", targetNamespace = "") usuario: String?,
        @WebParam(name = "senha", targetNamespace = "") senha: String?
    ): Boolean

    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(
        localName = "validarPostagemReversa",
        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
        className = "br.com.correios.webservice.postagem.ValidarPostagemReversa"
    )
    @ResponseWrapper(
        localName = "validarPostagemReversaResponse",
        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
        className = "br.com.correios.webservice.postagem.ValidarPostagemReversaResponse"
    )
    @Throws(AutenticacaoException::class, SigepClienteException::class)
    @HandlerChain(file = "handlers.xml")
    fun validarPostagemReversa(
        @WebParam(name = "codAdministrativo", targetNamespace = "") codAdministrativo: Int?,
        @WebParam(name = "codigoServico", targetNamespace = "") codigoServico: Int?,
        @WebParam(name = "cepDestinatario", targetNamespace = "") cepDestinatario: String?,
        @WebParam(name = "coleta", targetNamespace = "") coleta: ColetaReversaTO?,
        @WebParam(name = "usuario", targetNamespace = "") usuario: String?,
        @WebParam(name = "senha", targetNamespace = "") senha: String?
    ): Boolean?

    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(
        localName = "validarPostagemSimultanea",
        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
        className = "br.com.correios.webservice.postagem.ValidarPostagemSimultanea"
    )
    @ResponseWrapper(
        localName = "validarPostagemSimultaneaResponse",
        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
        className = "br.com.correios.webservice.postagem.ValidarPostagemSimultaneaResponse"
    )
    @Throws(AutenticacaoException::class, SigepClienteException::class)
    @HandlerChain(file = "handlers.xml")
    fun validarPostagemSimultanea(
        @WebParam(name = "codAdministrativo", targetNamespace = "") codAdministrativo: Int?,
        @WebParam(name = "codigoServico", targetNamespace = "") codigoServico: Int?,
        @WebParam(name = "cepDestinatario", targetNamespace = "") cepDestinatario: String?,
        @WebParam(name = "coleta", targetNamespace = "") coleta: ColetaSimultaneaTO?,
        @WebParam(name = "usuario", targetNamespace = "") usuario: String?,
        @WebParam(name = "senha", targetNamespace = "") senha: String?
    ): Boolean?

    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(
        localName = "verificaDisponibilidadeServico",
        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
        className = "br.com.correios.webservice.postagem.VerificaDisponibilidadeServico"
    )
    @ResponseWrapper(
        localName = "verificaDisponibilidadeServicoResponse",
        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
        className = "br.com.correios.webservice.postagem.VerificaDisponibilidadeServicoResponse"
    )
    @Throws(AutenticacaoException::class, SigepClienteException::class)
    @HandlerChain(file = "handlers.xml")
    fun verificaDisponibilidadeServico(
        @WebParam(name = "codAdministrativo", targetNamespace = "") codAdministrativo: Int?,
        @WebParam(name = "numeroServico", targetNamespace = "") numeroServico: String?,
        @WebParam(name = "cepOrigem", targetNamespace = "") cepOrigem: String?,
        @WebParam(name = "cepDestino", targetNamespace = "") cepDestino: String?,
        @WebParam(name = "usuario", targetNamespace = "") usuario: String?,
        @WebParam(name = "senha", targetNamespace = "") senha: String?
    ): String

    /*
atualizaPagamentoNaEntrega
atualizaRemessaAgrupada
buscaDataAtual
buscaOpcoes
buscaServicosAdicionaisAtivos
buscaServicosValorDeclarado
buscaServicosXServicosAdicionais
buscaTarifaVale
calculaTarifaServico
obterMensagemParametrizada
pesquisarDimensoesServico
pesquisarEmbalagensPorServico
pesquisarParametrosPorDescricao
pesquisarServicosAdicionais
verificaModalTransporte
VerificaSeTodosObjetosCancelados
 */


    // TODO - Verificar métodos inexistentes no webservice
//    @WebMethod
//    @WebResult(targetNamespace = "")
//    @RequestWrapper(
//        localName = "consultaSRO",
//        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
//        className = "br.com.correios.webservice.postagem.ConsultaSRO"
//    )
//    @ResponseWrapper(
//        localName = "consultaSROResponse",
//        targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
//        className = "br.com.correios.webservice.postagem.ConsultaSROResponse"
//    )
//    @Throws(SigepClienteException::class)
//    @HandlerChain(file = "handlers.xml")
//    fun consultaSRO(
//        @WebParam(name = "listaObjetos", targetNamespace = "") listaObjetos: List<String?>?,
//        @WebParam(name = "tipoConsulta", targetNamespace = "") tipoConsulta: String?,
//        @WebParam(name = "tipoResultado", targetNamespace = "") tipoResultado: String?,
//        @WebParam(name = "usuarioSro", targetNamespace = "") usuarioSro: String?,
//        @WebParam(name = "senhaSro", targetNamespace = "") senhaSro: String?
//    ): String?

}