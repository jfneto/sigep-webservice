package br.com.correios.webservice.postagem

import br.com.correios.webservice.enums.SimNao
import java.util.*
import javax.xml.bind.annotation.*
import javax.xml.datatype.XMLGregorianCalendar

/**
 *
 * Java class for chancelaMaster complex type.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="chancelaMaster">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="ativo" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}simNao" minOccurs="0"/>
 * &lt;element name="chancela" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 * &lt;element name="dataAtualizacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 * &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 * &lt;element name="servicosSigep" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}servicoSigep" maxOccurs="unbounded" minOccurs="0"/>
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
    name = "chancelaMaster",
    namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
    propOrder = ["ativo", "chancela", "dataAtualizacao", "descricao", "id", "servicosSigep"]
)
class ChancelaMaster {

    @XmlSchemaType(name = "string")
    var ativo: SimNao? = null

    lateinit var chancela: ByteArray

    @XmlSchemaType(name = "dateTime")
    var dataAtualizacao: XMLGregorianCalendar? = null

    var descricao: String? = null

    var id: Long? = null

    @XmlElement(nillable = true)
    var servicosSigep: List<ServicoSigep>? = ArrayList()

}