package br.com.correios.webservice.postagem

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlType

/**
 *
 * Java class for calculaTarifaServico complex type.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="calculaTarifaServico">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="codAdministrativo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="senha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="codServico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="cepOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="cepDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="peso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="codFormato" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 * &lt;element name="comprimento" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 * &lt;element name="altura" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 * &lt;element name="largura" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 * &lt;element name="diametro" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 * &lt;element name="codMaoPropria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="valorDeclarado" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 * &lt;element name="codAvisoRecebimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    name = "calculaTarifaServico",
    namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
    propOrder = ["codAdministrativo", "usuario", "senha", "codServico", "cepOrigem", "cepDestino", "peso", "codFormato", "comprimento", "altura", "largura", "diametro", "codMaoPropria", "valorDeclarado", "codAvisoRecebimento"]
)
class CalculaTarifaServico {

    var codAdministrativo: String? = null

    var usuario: String? = null

    var senha: String? = null

    var codServico: String? = null

    var cepOrigem: String? = null

    var cepDestino: String? = null

    var peso: String? = null

    var codFormato: Int? = null

    var comprimento: Double? = null

    var altura: Double? = null

    var largura: Double? = null

    var diametro: Double? = null

    var codMaoPropria: String? = null

    var valorDeclarado: Double? = null

    var codAvisoRecebimento: String? = null

}