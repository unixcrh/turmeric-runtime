//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.07 at 12:06:52 PM GMT+05:30 
//


package com.ebay.marketplace.search.v1.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for ResultSummaryInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultSummaryInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="matchCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="abridgedMatchCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultSummaryInfo", propOrder = {
    "matchCount",
    "abridgedMatchCount"
})
public class ResultSummaryInfo {

    protected int matchCount;
    protected Integer abridgedMatchCount;

    /**
     * Gets the value of the matchCount property.
     * 
     */
    public int getMatchCount() {
        return matchCount;
    }

    /**
     * Sets the value of the matchCount property.
     * 
     */
    public void setMatchCount(int value) {
        this.matchCount = value;
    }

    /**
     * Gets the value of the abridgedMatchCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAbridgedMatchCount() {
        return abridgedMatchCount;
    }

    /**
     * Sets the value of the abridgedMatchCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAbridgedMatchCount(Integer value) {
        this.abridgedMatchCount = value;
    }

}