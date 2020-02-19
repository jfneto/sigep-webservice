package br.com.correios.webservice.postagem

import javax.xml.ws.WebFault

/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 *
 */
@WebFault(name = "SigepClienteException", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/")
class SigepClienteException : java.lang.Exception {

    var faultInfo: String
        private set

    constructor(message: String?, faultInfo: String) : super(message) {
        this.faultInfo = faultInfo
    }

    constructor(message: String?, faultInfo: String, cause: Throwable?) : super(message, cause) {
        this.faultInfo = faultInfo
    }

    companion object {
        private const val serialVersionUID = -7963758229863005774L
    }
}