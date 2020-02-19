package br.com.correios.webservice.estimativa

import java.math.BigDecimal
import javax.xml.bind.annotation.*

/**
 *
 * Java class for anonymous complex type.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="nCdEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="sDsSenha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="nCdServico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="sCepOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="sCepDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="nVlPeso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="nCdFormato" type="{http://www.w3.org/2001/XMLSchema}int"/>
 * &lt;element name="nVlComprimento" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 * &lt;element name="nVlAltura" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 * &lt;element name="nVlLargura" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 * &lt;element name="nVlDiametro" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 * &lt;element name="sCdMaoPropria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="nVlValorDeclarado" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 * &lt;element name="sCdAvisoRecebimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    name = "",
    propOrder = ["nCdEmpresa", "sDsSenha", "nCdServico", "sCepOrigem", "sCepDestino", "nVlPeso", "nCdFormato", "nVlComprimento", "nVlAltura", "nVlLargura", "nVlDiametro", "sCdMaoPropria", "nVlValorDeclarado", "sCdAvisoRecebimento"]
)
@XmlRootElement(name = "CalcPrecoPrazo", namespace = "http://tempuri.org/")
class CalcPrecoPrazo {

    @XmlElement(namespace = "http://tempuri.org/")
    var nCdEmpresa: String? = null

    @XmlElement(namespace = "http://tempuri.org/")
    var sDsSenha: String? = null

    @XmlElement(namespace = "http://tempuri.org/")
    var nCdServico: String? = null

    @XmlElement(namespace = "http://tempuri.org/")
    var sCepOrigem: String? = null

    @XmlElement(namespace = "http://tempuri.org/")
    var sCepDestino: String? = null

    @XmlElement(namespace = "http://tempuri.org/")
    var nVlPeso: String? = null

    @XmlElement(namespace = "http://tempuri.org/")
    var nCdFormato = 0

    @XmlElement(namespace = "http://tempuri.org/", required = true)
    var nVlComprimento: BigDecimal? = null

    @XmlElement(namespace = "http://tempuri.org/", required = true)
    var nVlAltura: BigDecimal? = null

    @XmlElement(namespace = "http://tempuri.org/", required = true)
    var nVlLargura: BigDecimal? = null

    @XmlElement(namespace = "http://tempuri.org/", required = true)
    var nVlDiametro: BigDecimal? = null

    @XmlElement(namespace = "http://tempuri.org/")
    var sCdMaoPropria: String? = null

    @XmlElement(namespace = "http://tempuri.org/", required = true)
    var nVlValorDeclarado: BigDecimal? = null

    @XmlElement(namespace = "http://tempuri.org/")
    var sCdAvisoRecebimento: String? = null

}