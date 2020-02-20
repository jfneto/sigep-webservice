package br.com.correios.webservice.rastreio

import javax.jws.*
import javax.xml.bind.annotation.XmlSeeAlso
import javax.xml.ws.Action
import javax.xml.ws.RequestWrapper
import javax.xml.ws.ResponseWrapper

/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 */
@WebService(name = "Service", targetNamespace = "http://resource.webservice.correios.com.br/")
@XmlSeeAlso(ObjectFactory::class)
interface Service {

    @WebMethod(action = "buscaEventos")
    @WebResult(targetNamespace = "")
    @RequestWrapper(
        localName = "buscaEventos",
        targetNamespace = "http://resource.webservice.correios.com.br/",
        className = "br.com.correios.webservice.resource.BuscaEventos"
    )
    @ResponseWrapper(
        localName = "buscaEventosResponse",
        targetNamespace = "http://resource.webservice.correios.com.br/",
        className = "br.com.correios.webservice.resource.BuscaEventosResponse"
    )
    @Action(input = "buscaEventos", output = "http://resource.webservice.correios.com.br/Service/buscaEventosResponse")
    fun buscaEventos(
        @WebParam(name = "usuario", targetNamespace = "") usuario: String?,
        @WebParam(name = "senha", targetNamespace = "") senha: String?,
        @WebParam(name = "tipo", targetNamespace = "") tipo: String?,
        @WebParam(name = "resultado", targetNamespace = "") resultado: String?,
        @WebParam(name = "lingua", targetNamespace = "") lingua: String?,
        @WebParam(name = "objetos", targetNamespace = "") objetos: String?
    ): EventosDosCorreios?

    @WebMethod(action = "buscaEventosLista")
    @WebResult(targetNamespace = "")
    @RequestWrapper(
        localName = "buscaEventosLista",
        targetNamespace = "http://resource.webservice.correios.com.br/",
        className = "br.com.correios.webservice.resource.BuscaEventosLista"
    )
    @ResponseWrapper(
        localName = "buscaEventosListaResponse",
        targetNamespace = "http://resource.webservice.correios.com.br/",
        className = "br.com.correios.webservice.resource.BuscaEventosListaResponse"
    )
    @Action(
        input = "buscaEventosLista",
        output = "http://resource.webservice.correios.com.br/Service/buscaEventosListaResponse"
    )
    @HandlerChain(file = "handlers.xml")
    fun buscaEventosLista(
        @WebParam(name = "usuario", targetNamespace = "") usuario: String?,
        @WebParam(name = "senha", targetNamespace = "") senha: String?,
        @WebParam(name = "tipo", targetNamespace = "") tipo: String?,
        @WebParam(name = "resultado", targetNamespace = "") resultado: String?,
        @WebParam(name = "lingua", targetNamespace = "") lingua: String?,
        @WebParam(name = "objetos", targetNamespace = "") objetos: List<String?>?
    ): EventosDosCorreios?
}