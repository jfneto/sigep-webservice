package br.com.correios.webservice.postagem

import br.com.correios.webservice.enums.Acao
import br.com.correios.webservice.enums.TipoBloqueio
import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlSchemaType
import javax.xml.bind.annotation.XmlType

/**
 *
 * Java class for bloquearObjeto complex type.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="bloquearObjeto">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="numeroEtiqueta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="idPlp" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 * &lt;element name="tipoBloqueio" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}tipoBloqueio" minOccurs="0"/>
 * &lt;element name="acao" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}acao" minOccurs="0"/>
 * &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="senha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    name = "bloquearObjeto",
    namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
    propOrder = ["numeroEtiqueta", "idPlp", "tipoBloqueio", "acao", "usuario", "senha"]
)
class BloquearObjeto {
    var numeroEtiqueta: String? = null
    var idPlp: Long? = null
    @XmlSchemaType(name = "string")
    var tipoBloqueio: TipoBloqueio? = null
    @XmlSchemaType(name = "string")
    var acao: Acao? = null
    var usuario: String? = null
    var senha: String? = null
}