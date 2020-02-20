package br.com.correios.webservice.postagem

import javax.xml.ws.WebFault


@WebFault(name = "SQLException", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/")
class SQLExceptionException : java.lang.Exception {

    var faultInfo: SQLException
        private set

    constructor(message: String?, faultInfo: SQLException) : super(message) {
        this.faultInfo = faultInfo
    }

    constructor(message: String?, faultInfo: SQLException, cause: Throwable?) : super(message, cause) {
        this.faultInfo = faultInfo
    }

    companion object {
        private const val serialVersionUID = -8676187739818948570L
    }
}