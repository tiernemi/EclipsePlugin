/*******************************************************************************
 * Copyright (c) 2011 HPCC Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     HPCC Systems - initial API and implementation
 ******************************************************************************/
/**
 * WUPublishWorkunitResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsworkunits;

public class WUPublishWorkunitResponse  implements java.io.Serializable {
	private org.hpccsystems.ws.wsworkunits.ArrayOfEspException exceptions;

	private java.lang.String wuid;

	private java.lang.String result;

	private java.lang.String querySet;

	private java.lang.String queryName;

	private java.lang.String queryId;

	private org.hpccsystems.ws.wsworkunits.WUCopyLogicalClusterFileSections[] clusterFiles;

	public WUPublishWorkunitResponse() {
	}

	public WUPublishWorkunitResponse(
			org.hpccsystems.ws.wsworkunits.ArrayOfEspException exceptions,
			java.lang.String wuid,
			java.lang.String result,
			java.lang.String querySet,
			java.lang.String queryName,
			java.lang.String queryId,
			org.hpccsystems.ws.wsworkunits.WUCopyLogicalClusterFileSections[] clusterFiles) {
		this.exceptions = exceptions;
		this.wuid = wuid;
		this.result = result;
		this.querySet = querySet;
		this.queryName = queryName;
		this.queryId = queryId;
		this.clusterFiles = clusterFiles;
	}


	/**
	 * Gets the exceptions value for this WUPublishWorkunitResponse.
	 * 
	 * @return exceptions
	 */
	 public org.hpccsystems.ws.wsworkunits.ArrayOfEspException getExceptions() {
		 return exceptions;
	 }


	 /**
	  * Sets the exceptions value for this WUPublishWorkunitResponse.
	  * 
	  * @param exceptions
	  */
	 public void setExceptions(org.hpccsystems.ws.wsworkunits.ArrayOfEspException exceptions) {
		 this.exceptions = exceptions;
	 }


	 /**
	  * Gets the wuid value for this WUPublishWorkunitResponse.
	  * 
	  * @return wuid
	  */
	 public java.lang.String getWuid() {
		 return wuid;
	 }


	 /**
	  * Sets the wuid value for this WUPublishWorkunitResponse.
	  * 
	  * @param wuid
	  */
	 public void setWuid(java.lang.String wuid) {
		 this.wuid = wuid;
	 }


	 /**
	  * Gets the result value for this WUPublishWorkunitResponse.
	  * 
	  * @return result
	  */
	 public java.lang.String getResult() {
		 return result;
	 }


	 /**
	  * Sets the result value for this WUPublishWorkunitResponse.
	  * 
	  * @param result
	  */
	 public void setResult(java.lang.String result) {
		 this.result = result;
	 }


	 /**
	  * Gets the querySet value for this WUPublishWorkunitResponse.
	  * 
	  * @return querySet
	  */
	 public java.lang.String getQuerySet() {
		 return querySet;
	 }


	 /**
	  * Sets the querySet value for this WUPublishWorkunitResponse.
	  * 
	  * @param querySet
	  */
	 public void setQuerySet(java.lang.String querySet) {
		 this.querySet = querySet;
	 }


	 /**
	  * Gets the queryName value for this WUPublishWorkunitResponse.
	  * 
	  * @return queryName
	  */
	 public java.lang.String getQueryName() {
		 return queryName;
	 }


	 /**
	  * Sets the queryName value for this WUPublishWorkunitResponse.
	  * 
	  * @param queryName
	  */
	 public void setQueryName(java.lang.String queryName) {
		 this.queryName = queryName;
	 }


	 /**
	  * Gets the queryId value for this WUPublishWorkunitResponse.
	  * 
	  * @return queryId
	  */
	 public java.lang.String getQueryId() {
		 return queryId;
	 }


	 /**
	  * Sets the queryId value for this WUPublishWorkunitResponse.
	  * 
	  * @param queryId
	  */
	 public void setQueryId(java.lang.String queryId) {
		 this.queryId = queryId;
	 }


	 /**
	  * Gets the clusterFiles value for this WUPublishWorkunitResponse.
	  * 
	  * @return clusterFiles
	  */
	 public org.hpccsystems.ws.wsworkunits.WUCopyLogicalClusterFileSections[] getClusterFiles() {
		 return clusterFiles;
	 }


	 /**
	  * Sets the clusterFiles value for this WUPublishWorkunitResponse.
	  * 
	  * @param clusterFiles
	  */
	 public void setClusterFiles(org.hpccsystems.ws.wsworkunits.WUCopyLogicalClusterFileSections[] clusterFiles) {
		 this.clusterFiles = clusterFiles;
	 }

	 private java.lang.Object __equalsCalc = null;
	 @Override
	 public synchronized boolean equals(java.lang.Object obj) {
		 if (!(obj instanceof WUPublishWorkunitResponse)) return false;
		 WUPublishWorkunitResponse other = (WUPublishWorkunitResponse) obj;
		 if (obj == null) return false;
		 if (this == obj) return true;
		 if (__equalsCalc != null) {
			 return (__equalsCalc == obj);
		 }
		 __equalsCalc = obj;
		 boolean _equals;
		 _equals = true && 
				 ((this.exceptions==null && other.getExceptions()==null) || 
						 (this.exceptions!=null &&
						 this.exceptions.equals(other.getExceptions()))) &&
						 ((this.wuid==null && other.getWuid()==null) || 
								 (this.wuid!=null &&
								 this.wuid.equals(other.getWuid()))) &&
								 ((this.result==null && other.getResult()==null) || 
										 (this.result!=null &&
										 this.result.equals(other.getResult()))) &&
										 ((this.querySet==null && other.getQuerySet()==null) || 
												 (this.querySet!=null &&
												 this.querySet.equals(other.getQuerySet()))) &&
												 ((this.queryName==null && other.getQueryName()==null) || 
														 (this.queryName!=null &&
														 this.queryName.equals(other.getQueryName()))) &&
														 ((this.queryId==null && other.getQueryId()==null) || 
																 (this.queryId!=null &&
																 this.queryId.equals(other.getQueryId()))) &&
																 ((this.clusterFiles==null && other.getClusterFiles()==null) || 
																		 (this.clusterFiles!=null &&
																		 java.util.Arrays.equals(this.clusterFiles, other.getClusterFiles())));
		 __equalsCalc = null;
		 return _equals;
	 }

	 private boolean __hashCodeCalc = false;
	 @Override
	 public synchronized int hashCode() {
		 if (__hashCodeCalc) {
			 return 0;
		 }
		 __hashCodeCalc = true;
		 int _hashCode = 1;
		 if (getExceptions() != null) {
			 _hashCode += getExceptions().hashCode();
		 }
		 if (getWuid() != null) {
			 _hashCode += getWuid().hashCode();
		 }
		 if (getResult() != null) {
			 _hashCode += getResult().hashCode();
		 }
		 if (getQuerySet() != null) {
			 _hashCode += getQuerySet().hashCode();
		 }
		 if (getQueryName() != null) {
			 _hashCode += getQueryName().hashCode();
		 }
		 if (getQueryId() != null) {
			 _hashCode += getQueryId().hashCode();
		 }
		 if (getClusterFiles() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getClusterFiles());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getClusterFiles(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 __hashCodeCalc = false;
		 return _hashCode;
	 }

	 // Type metadata
	 private static org.apache.axis.description.TypeDesc typeDesc =
	 new org.apache.axis.description.TypeDesc(WUPublishWorkunitResponse.class, true);

	 static {
		 typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUPublishWorkunitResponse"));
		 org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("exceptions");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("wuid");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Wuid"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("result");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Result"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("querySet");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySet"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("queryName");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QueryName"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("queryId");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QueryId"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("clusterFiles");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ClusterFiles"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUCopyLogicalClusterFileSections"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Cluster"));
		 typeDesc.addFieldDesc(elemField);
	 }

	 /**
	  * Return type metadata object
	  */
	 public static org.apache.axis.description.TypeDesc getTypeDesc() {
		 return typeDesc;
	 }

	 /**
	  * Get Custom Serializer
	  */
	 public static org.apache.axis.encoding.Serializer getSerializer(
			 java.lang.String mechType, 
			 java.lang.Class _javaType,  
			 javax.xml.namespace.QName _xmlType) {
		 return 
				 new  org.apache.axis.encoding.ser.BeanSerializer(
						 _javaType, _xmlType, typeDesc);
	 }

	 /**
	  * Get Custom Deserializer
	  */
	 public static org.apache.axis.encoding.Deserializer getDeserializer(
			 java.lang.String mechType, 
			 java.lang.Class _javaType,  
			 javax.xml.namespace.QName _xmlType) {
		 return 
				 new  org.apache.axis.encoding.ser.BeanDeserializer(
						 _javaType, _xmlType, typeDesc);
	 }

}
