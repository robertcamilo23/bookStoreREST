package luc.webservices.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement ( name = "Status" )
@XmlAccessorType ( XmlAccessType.FIELD )
@XmlType ( name = "" )
public enum Status
{
	CONFIRMED, UNCONFIRMED, CANCELED, SHIPPED, DELIVERED, NONEXISTENT
}