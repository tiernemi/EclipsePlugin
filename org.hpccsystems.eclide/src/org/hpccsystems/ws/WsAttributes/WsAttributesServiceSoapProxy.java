package org.hpccsystems.ws.WsAttributes;

public class WsAttributesServiceSoapProxy implements org.hpccsystems.ws.WsAttributes.WsAttributesServiceSoap {
  private String _endpoint = null;
  private org.hpccsystems.ws.WsAttributes.WsAttributesServiceSoap wsAttributesServiceSoap = null;
  
  public WsAttributesServiceSoapProxy() {
    _initWsAttributesServiceSoapProxy();
  }
  
  public WsAttributesServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWsAttributesServiceSoapProxy();
  }
  
  private void _initWsAttributesServiceSoapProxy() {
    try {
      wsAttributesServiceSoap = (new org.hpccsystems.ws.WsAttributes.WsAttributesLocator()).getWsAttributesServiceSoap();
      if (wsAttributesServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wsAttributesServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wsAttributesServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wsAttributesServiceSoap != null)
      ((javax.xml.rpc.Stub)wsAttributesServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.hpccsystems.ws.WsAttributes.WsAttributesServiceSoap getWsAttributesServiceSoap() {
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap;
  }
  
  public org.hpccsystems.ws.WsAttributes.UpdateAttributesResponse checkinAttributes(org.hpccsystems.ws.WsAttributes.CheckinAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.checkinAttributes(parameters);
  }
  
  public org.hpccsystems.ws.WsAttributes.UpdateAttributesResponse checkoutAttributes(org.hpccsystems.ws.WsAttributes.CheckoutAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.checkoutAttributes(parameters);
  }
  
  public org.hpccsystems.ws.WsAttributes.CreateAttributeResponse createAttribute(org.hpccsystems.ws.WsAttributes.CreateAttribute parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.createAttribute(parameters);
  }
  
  public org.hpccsystems.ws.WsAttributes.CreateLabelResponse createLabel(org.hpccsystems.ws.WsAttributes.CreateLabel parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.createLabel(parameters);
  }
  
  public org.hpccsystems.ws.WsAttributes.CreateModuleResponse createModule(org.hpccsystems.ws.WsAttributes.CreateModule parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.createModule(parameters);
  }
  
  public org.hpccsystems.ws.WsAttributes.UpdateAttributesResponse deleteAttributes(org.hpccsystems.ws.WsAttributes.DeleteAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.deleteAttributes(parameters);
  }
  
  public org.hpccsystems.ws.WsAttributes.DeleteLabelResponse deleteLabel(org.hpccsystems.ws.WsAttributes.DeleteLabel parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.deleteLabel(parameters);
  }
  
  public org.hpccsystems.ws.WsAttributes.DeleteModuleResponse deleteModule(org.hpccsystems.ws.WsAttributes.DeleteModule parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.deleteModule(parameters);
  }
  
  public org.hpccsystems.ws.WsAttributes.FindAttributesResponse findAttributes(org.hpccsystems.ws.WsAttributes.FindAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.findAttributes(parameters);
  }
  
  public org.hpccsystems.ws.WsAttributes.GetAttributeResponse getAttribute(org.hpccsystems.ws.WsAttributes.GetAttribute parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.getAttribute(parameters);
  }
  
  public org.hpccsystems.ws.WsAttributes.GetAttributeHistoryResponse getAttributeHistory(org.hpccsystems.ws.WsAttributes.GetAttributeHistory parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.getAttributeHistory(parameters);
  }
  
  public org.hpccsystems.ws.WsAttributes.GetAttributeLabelsResponse getAttributeLabels(org.hpccsystems.ws.WsAttributes.GetAttributeLabels parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.getAttributeLabels(parameters);
  }
  
  public org.hpccsystems.ws.WsAttributes.GetAttributesResponse getAttributes(org.hpccsystems.ws.WsAttributes.GetAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.getAttributes(parameters);
  }
  
  public org.hpccsystems.ws.WsAttributes.GetLabelsResponse getLabels(org.hpccsystems.ws.WsAttributes.GetLabels parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.getLabels(parameters);
  }
  
  public org.hpccsystems.ws.WsAttributes.GetModulesResponse getModules(org.hpccsystems.ws.WsAttributes.GetModules parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.getModules(parameters);
  }
  
  public org.hpccsystems.ws.WsAttributes.UpdateAttributesResponse importAttributes(org.hpccsystems.ws.WsAttributes.ImportAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.importAttributes(parameters);
  }
  
  public org.hpccsystems.ws.WsAttributes.ListAttributeTypesResponse listAttributeTypes() throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.listAttributeTypes();
  }
  
  public org.hpccsystems.ws.WsAttributes.UpdateAttributesResponse renameAttributes(org.hpccsystems.ws.WsAttributes.RenameAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.renameAttributes(parameters);
  }
  
  public org.hpccsystems.ws.WsAttributes.RenameModuleResponse renameModule(org.hpccsystems.ws.WsAttributes.RenameModule parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.renameModule(parameters);
  }
  
  public org.hpccsystems.ws.WsAttributes.UpdateAttributesResponse rollbackAttributes(org.hpccsystems.ws.WsAttributes.RollbackAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.rollbackAttributes(parameters);
  }
  
  public org.hpccsystems.ws.WsAttributes.UpdateAttributesResponse saveAttributes(org.hpccsystems.ws.WsAttributes.SaveAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.saveAttributes(parameters);
  }
  
  public org.hpccsystems.ws.WsAttributes.SupportsEarMarkResponse supportsEarMark() throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.supportsEarMark();
  }
  
  public org.hpccsystems.ws.WsAttributes.UpdateLabelResponse updateLabel(org.hpccsystems.ws.WsAttributes.UpdateLabel parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.updateLabel(parameters);
  }
  
  
}