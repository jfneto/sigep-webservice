package br.com.correios.webservice.estimativa

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlType

/**
 *
 * Java class for cServico complex type.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="cServico">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 * &lt;element name="Valor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="PrazoEntrega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="ValorMaoPropria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="ValorAvisoRecebimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="ValorValorDeclarado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="EntregaDomiciliar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="EntregaSabado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="Erro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="MsgErro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="ValorSemAdicionais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="obsFim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="DataMaxEntrega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="HoraMaxEntrega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
</pre> *
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "cServico",
    namespace = "http://tempuri.org/",
    propOrder = ["codigo", "valor", "prazoEntrega", "valorMaoPropria", "valorAvisoRecebimento", "valorValorDeclarado", "entregaDomiciliar", "entregaSabado", "erro", "msgErro", "valorSemAdicionais", "obsFim", "dataMaxEntrega", "horaMaxEntrega"]
)
class CServico {

    @XmlElement(name = "Codigo", namespace = "http://tempuri.org/")
    var codigo = 0

    @XmlElement(name = "Valor", namespace = "http://tempuri.org/")
    var valor: String? = null

    @XmlElement(name = "PrazoEntrega", namespace = "http://tempuri.org/")
    var prazoEntrega: String? = null

    @XmlElement(name = "ValorMaoPropria", namespace = "http://tempuri.org/")
    var valorMaoPropria: String? = null

    @XmlElement(name = "ValorAvisoRecebimento", namespace = "http://tempuri.org/")
    var valorAvisoRecebimento: String? = null

    @XmlElement(name = "ValorValorDeclarado", namespace = "http://tempuri.org/")
    var valorValorDeclarado: String? = null

    @XmlElement(name = "EntregaDomiciliar", namespace = "http://tempuri.org/")
    var entregaDomiciliar: String? = null

    @XmlElement(name = "EntregaSabado", namespace = "http://tempuri.org/")
    var entregaSabado: String? = null

    @XmlElement(name = "Erro", namespace = "http://tempuri.org/")
    var erro: String? = null

    @XmlElement(name = "MsgErro", namespace = "http://tempuri.org/")
    var msgErro: String? = null

    @XmlElement(name = "ValorSemAdicionais", namespace = "http://tempuri.org/")
    var valorSemAdicionais: String? = null

    @XmlElement(namespace = "http://tempuri.org/")
    var obsFim: String? = null

    @XmlElement(name = "DataMaxEntrega", namespace = "http://tempuri.org/")
    var dataMaxEntrega: String? = null

    @XmlElement(name = "HoraMaxEntrega", namespace = "http://tempuri.org/")
    var horaMaxEntrega: String? = null

}