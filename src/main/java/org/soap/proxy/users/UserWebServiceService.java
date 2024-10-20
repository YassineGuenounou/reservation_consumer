
package org.soap.proxy.users;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.3
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "UserWebServiceService", targetNamespace = "http://server.reservation.org/", wsdlLocation = "http://localhost:8088/users?wsdl")
public class UserWebServiceService
    extends Service
{

    private static final URL USERWEBSERVICESERVICE_WSDL_LOCATION;
    private static final WebServiceException USERWEBSERVICESERVICE_EXCEPTION;
    private static final QName USERWEBSERVICESERVICE_QNAME = new QName("http://server.reservation.org/", "UserWebServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8088/users?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        USERWEBSERVICESERVICE_WSDL_LOCATION = url;
        USERWEBSERVICESERVICE_EXCEPTION = e;
    }

    public UserWebServiceService() {
        super(__getWsdlLocation(), USERWEBSERVICESERVICE_QNAME);
    }

    public UserWebServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), USERWEBSERVICESERVICE_QNAME, features);
    }

    public UserWebServiceService(URL wsdlLocation) {
        super(wsdlLocation, USERWEBSERVICESERVICE_QNAME);
    }

    public UserWebServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, USERWEBSERVICESERVICE_QNAME, features);
    }

    public UserWebServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UserWebServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Users
     */
    @WebEndpoint(name = "UsersPort")
    public Users getUsersPort() {
        return super.getPort(new QName("http://server.reservation.org/", "UsersPort"), Users.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Users
     */
    @WebEndpoint(name = "UsersPort")
    public Users getUsersPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://server.reservation.org/", "UsersPort"), Users.class, features);
    }

    private static URL __getWsdlLocation() {
        if (USERWEBSERVICESERVICE_EXCEPTION!= null) {
            throw USERWEBSERVICESERVICE_EXCEPTION;
        }
        return USERWEBSERVICESERVICE_WSDL_LOCATION;
    }

}
