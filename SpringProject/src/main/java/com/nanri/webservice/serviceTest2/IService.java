package com.nanri.webservice.serviceTest2;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style; 
@WebService  
@SOAPBinding(style = Style.RPC)  
public interface IService {  
    public User getUserByName(@WebParam(name = "name") String name);  
    public void setUser(User user);  
}  