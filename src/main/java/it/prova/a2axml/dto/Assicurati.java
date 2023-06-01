//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.2 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.06.01 alle 10:58:48 AM CEST 
//


package it.prova.a2axml.dto;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import it.prova.a2axml.model.AssicuratoModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="assicurato" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="cognome" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="datadinascita" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                   &lt;element name="codicefiscale" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="numerosinistri" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "assicurato"
})
@XmlRootElement(name = "assicurati")
public class Assicurati {

    @XmlElement(required = true)
    protected List<Assicurati.Assicurato> assicurato;

    /**
     * Gets the value of the assicurato property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assicurato property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssicurato().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Assicurati.Assicurato }
     * 
     * 
     */
    public List<Assicurati.Assicurato> getAssicurato() {
        if (assicurato == null) {
            assicurato = new ArrayList<Assicurati.Assicurato>();
        }
        return this.assicurato;
    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="cognome" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="datadinascita" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *         &lt;element name="codicefiscale" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="numerosinistri" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "nome",
        "cognome",
        "datadinascita",
        "codicefiscale",
        "numerosinistri"
    })
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class Assicurato {

        @XmlElement(required = true)
        protected String nome;
        @XmlElement(required = true)
        protected String cognome;
        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar datadinascita;
        @XmlElement(required = true)
        protected String codicefiscale;
        @XmlElement(required = true)
        protected BigInteger numerosinistri;
        

    	public Assicurato buildAssicuratoModel() {
    		Assicurato result = Assicurato.builder().nome(this.nome).cognome(this.cognome).datadinascita(this.datadinascita)
    				.codicefiscale(this.codicefiscale).numerosinistri(this.numerosinistri).build();

    		return result;
    	}
    	
    	public List<Assicurato> buildAssicuratoModelFromList(List < Assicurato > modelListInput) {
    		return modelListInput.stream().map(assicuratoEntity -> {
    			Assicurato result = assicuratoEntity.buildAssicuratoModel();
    			return result;
    		}).collect(Collectors.toList());
    	}
    	public List<Assicurato> buildAssicuratoDTOFromModelList(List < AssicuratoModel > modelListInput) {
    		return modelListInput.stream().map(assicuratoEntity -> {
    			Assicurato result = Assicurato.buildAssicuratoFromModel(assicuratoEntity);
    			return result;
    		}).collect(Collectors.toList());
    	}
    	
    	public static Assicurato buildAssicuratoFromModel(AssicuratoModel assicuratoModel) {

    		Assicurato result = Assicurato.builder().nome(assicuratoModel.getNome())
    				.cognome(assicuratoModel.getCognome()).codicefiscale(assicuratoModel.getCodiceFiscale())
    				.datadinascita(null).numerosinistri(BigInteger.valueOf(assicuratoModel.getNumeroSinistri())).build();
    		return result;
    	}
        

        /**
         * Recupera il valore della proprietà nome.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNome() {
            return nome;
        }

        /**
         * Imposta il valore della proprietà nome.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNome(String value) {
            this.nome = value;
        }

        /**
         * Recupera il valore della proprietà cognome.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCognome() {
            return cognome;
        }

        /**
         * Imposta il valore della proprietà cognome.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCognome(String value) {
            this.cognome = value;
        }

        /**
         * Recupera il valore della proprietà datadinascita.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDatadinascita() {
            return datadinascita;
        }

        /**
         * Imposta il valore della proprietà datadinascita.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDatadinascita(XMLGregorianCalendar value) {
            this.datadinascita = value;
        }

        /**
         * Recupera il valore della proprietà codicefiscale.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodicefiscale() {
            return codicefiscale;
        }

        /**
         * Imposta il valore della proprietà codicefiscale.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodicefiscale(String value) {
            this.codicefiscale = value;
        }

        /**
         * Recupera il valore della proprietà numerosinistri.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNumerosinistri() {
            return numerosinistri;
        }

        /**
         * Imposta il valore della proprietà numerosinistri.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNumerosinistri(BigInteger value) {
            this.numerosinistri = value;
        }

    }

}
