package br.com.correios.webservice.util

import org.apache.log4j.LogManager
import org.apache.log4j.Logger
import java.io.ByteArrayOutputStream
import java.io.IOException
import java.util.*
import javax.xml.namespace.QName
import javax.xml.soap.SOAPException
import javax.xml.soap.SOAPMessage
import javax.xml.ws.handler.MessageContext
import javax.xml.ws.handler.soap.SOAPHandler
import javax.xml.ws.handler.soap.SOAPMessageContext


/**
 *
 * @author lima.joao
 * @since 20/02/2020 08:18
 */
class LogHandler: SOAPHandler<SOAPMessageContext> {
    private val LOG: Logger = LogManager.getLogger(LogHandler::class.java)

    override fun handleMessage(context: SOAPMessageContext): Boolean {
        LOG.info("***handleMessage***")
        logSoapMessage(context)
        return true
    }

    override fun handleFault(context: SOAPMessageContext): Boolean {
        LOG.info("***handleFault***")
        logSoapMessage(context)
        return false
    }

    override fun close(context: MessageContext?) {
        LOG.info("_______________close_____________ ")
    }

    override fun getHeaders(): Set<QName?>? {
        return HashSet<QName?>()
    }

    private fun logSoapMessage(context: SOAPMessageContext) {
        val isOutBound = context[MessageContext.MESSAGE_OUTBOUND_PROPERTY] as Boolean
        val soapMsg: SOAPMessage = context.message
        try {
            if (isOutBound) {
                LOG.info("Intercepting outbound message:")
            } else {
                LOG.info("Intercepting inbound message:")
            }
            val baos = ByteArrayOutputStream()
            soapMsg.writeTo(baos)
            LOG.info(baos)
            LOG.info("\n________________________________")
        } catch (e: SOAPException) {
            e.printStackTrace()
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
}