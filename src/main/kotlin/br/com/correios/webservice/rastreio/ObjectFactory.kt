package br.com.correios.webservice.rastreio

import javax.xml.bind.JAXBElement
import javax.xml.bind.annotation.XmlElementDecl
import javax.xml.bind.annotation.XmlRegistry
import javax.xml.namespace.QName

/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the br.com.correios.webservice.rastro package.
 *
 * An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 *
 */
@XmlRegistry
class ObjectFactory{
    /**
     * Create an instance of [BuscaEventosLista]
     *
     */
    fun createBuscaEventosLista(): BuscaEventosLista {
        return BuscaEventosLista()
    }

    /**
     * Create an instance of [Eventos]
     *
     */
    fun createEventos(): Eventos {
        return Eventos()
    }

    /**
     * Create an instance of [EnderecoMobile]
     *
     */
    fun createEnderecoMobile(): EnderecoMobile {
        return EnderecoMobile()
    }

    /**
     * Create an instance of [Sroxml]
     *
     */
    fun createSroxml(): Sroxml {
        return Sroxml()
    }

    /**
     * Create an instance of [Objeto]
     *
     */
    fun createObjeto(): Objeto {
        return Objeto()
    }

    /**
     * Create an instance of [BuscaEventos]
     *
     */
    fun createBuscaEventos(): BuscaEventos {
        return BuscaEventos()
    }

    /**
     * Create an instance of [BuscaEventosListaResponse]
     *
     */
    fun createBuscaEventosListaResponse(): BuscaEventosListaResponse {
        return BuscaEventosListaResponse()
    }

    /**
     * Create an instance of [Destinos]
     *
     */
    fun createDestinos(): Destinos {
        return Destinos()
    }

    /**
     * Create an instance of [BuscaEventosResponse]
     *
     */
    fun createBuscaEventosResponse(): BuscaEventosResponse {
        return BuscaEventosResponse()
    }

    /**
     * Create an instance of [JAXBElement]`<`[EnderecoMobile]`>`}
     *
     */
    @XmlElementDecl(
        namespace = "http://resource.webservice.correios.com.br/",
        name = "endereco"
    )
    fun createEndereco(value: EnderecoMobile): JAXBElement<EnderecoMobile> {
        return JAXBElement(
            _Endereco_QNAME,
            EnderecoMobile::class.java,
            null,
            value
        )
    }

    /**
     * Create an instance of [JAXBElement]`<`[BuscaEventosLista]`>`}
     *
     */
    @XmlElementDecl(
        namespace = "http://resource.webservice.correios.com.br/",
        name = "buscaEventosLista"
    )
    fun createBuscaEventosLista(value: BuscaEventosLista): JAXBElement<BuscaEventosLista> {
        return JAXBElement(
            _BuscaEventosLista_QNAME,
            BuscaEventosLista::class.java,
            null,
            value
        )
    }

    /**
     * Create an instance of [JAXBElement]`<`[Eventos]`>`}
     *
     */
    @XmlElementDecl(
        namespace = "http://resource.webservice.correios.com.br/",
        name = "evento"
    )
    fun createEvento(value: Eventos): JAXBElement<Eventos> {
        return JAXBElement(
            _Evento_QNAME,
            Eventos::class.java,
            null,
            value
        )
    }

    /**
     * Create an instance of [JAXBElement]`<`[BuscaEventosResponse]`>`}
     *
     */
    @XmlElementDecl(
        namespace = "http://resource.webservice.correios.com.br/",
        name = "buscaEventosResponse"
    )
    fun createBuscaEventosResponse(value: BuscaEventosResponse): JAXBElement<BuscaEventosResponse> {
        return JAXBElement(
            _BuscaEventosResponse_QNAME,
            BuscaEventosResponse::class.java,
            null,
            value
        )
    }

    /**
     * Create an instance of [JAXBElement]`<`[Sroxml]`>`}
     *
     */
    @XmlElementDecl(
        namespace = "http://resource.webservice.correios.com.br/",
        name = "rastro"
    )
    fun createRastro(value: Sroxml): JAXBElement<Sroxml> {
        return JAXBElement(
            _Rastro_QNAME,
            Sroxml::class.java,
            null,
            value
        )
    }

    /**
     * Create an instance of [JAXBElement]`<`[Objeto]`>`}
     *
     */
    @XmlElementDecl(
        namespace = "http://resource.webservice.correios.com.br/",
        name = "objeto"
    )
    fun createObjeto(value: Objeto): JAXBElement<Objeto> {
        return JAXBElement(
            _Objeto_QNAME,
            Objeto::class.java,
            null,
            value
        )
    }

    /**
     * Create an instance of [JAXBElement]`<`[BuscaEventos]`>`}
     *
     */
    @XmlElementDecl(
        namespace = "http://resource.webservice.correios.com.br/",
        name = "buscaEventos"
    )
    fun createBuscaEventos(value: BuscaEventos): JAXBElement<BuscaEventos> {
        return JAXBElement(
            _BuscaEventos_QNAME,
            BuscaEventos::class.java,
            null,
            value
        )
    }

    /**
     * Create an instance of [JAXBElement]`<`[BuscaEventosListaResponse]`>`}
     *
     */
    @XmlElementDecl(
        namespace = "http://resource.webservice.correios.com.br/",
        name = "buscaEventosListaResponse"
    )
    fun createBuscaEventosListaResponse(value: BuscaEventosListaResponse): JAXBElement<BuscaEventosListaResponse> {
        return JAXBElement(
            _BuscaEventosListaResponse_QNAME,
            BuscaEventosListaResponse::class.java,
            null,
            value
        )
    }

    /**
     * Create an instance of [JAXBElement]`<`[Destinos]`>`}
     *
     */
    @XmlElementDecl(
        namespace = "http://resource.webservice.correios.com.br/",
        name = "destino"
    )
    fun createDestino(value: Destinos): JAXBElement<Destinos> {
        return JAXBElement(
            _Destino_QNAME,
            Destinos::class.java,
            null,
            value
        )
    }

    companion object {
        private val _Endereco_QNAME =
            QName("http://resource.webservice.correios.com.br/", "endereco")
        private val _BuscaEventosLista_QNAME =
            QName("http://resource.webservice.correios.com.br/", "buscaEventosLista")
        private val _Evento_QNAME =
            QName("http://resource.webservice.correios.com.br/", "evento")
        private val _BuscaEventosResponse_QNAME =
            QName("http://resource.webservice.correios.com.br/", "buscaEventosResponse")
        private val _Rastro_QNAME =
            QName("http://resource.webservice.correios.com.br/", "rastro")
        private val _Objeto_QNAME =
            QName("http://resource.webservice.correios.com.br/", "objeto")
        private val _BuscaEventos_QNAME =
            QName("http://resource.webservice.correios.com.br/", "buscaEventos")
        private val _BuscaEventosListaResponse_QNAME =
            QName("http://resource.webservice.correios.com.br/", "buscaEventosListaResponse")
        private val _Destino_QNAME =
            QName("http://resource.webservice.correios.com.br/", "destino")
    }
}