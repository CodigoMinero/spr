package py.gov.stp.mh.inserts_presupuesto;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
@author		DGTIC-STP
@email      dgtic@stp.gov.py
*/

/**
 * This class was generated by Apache CXF 2.4.6
 * 2016-07-25T08:27:05.050-04:00
 * Generated source version: 2.4.6
 * 
 */
@WebServiceClient(name = "InsertsPresupuestoService", 
                  wsdlLocation = "http://10.20.2.148:8080/stp/inserts_presupuesto?wsdl",
                  targetNamespace = "http://inserts.service.siaf.hacienda.gov.py/") 
public class InsertsPresupuestoService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://inserts.service.siaf.hacienda.gov.py/", "InsertsPresupuestoService");
    public final static QName InsertsPresupuestoPort = new QName("http://inserts.service.siaf.hacienda.gov.py/", "InsertsPresupuestoPort");
    static {
        URL url = null;
        try {
            url = new URL("http://10.20.2.148:8080/stp/inserts_presupuesto?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(InsertsPresupuestoService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://10.20.2.148:8080/stp/inserts_presupuesto?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public InsertsPresupuestoService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public InsertsPresupuestoService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public InsertsPresupuestoService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public InsertsPresupuestoService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public InsertsPresupuestoService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public InsertsPresupuestoService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns InsertsPresupuesto
     */
    @WebEndpoint(name = "InsertsPresupuestoPort")
    public InsertsPresupuesto getInsertsPresupuestoPort() {
        return super.getPort(InsertsPresupuestoPort, InsertsPresupuesto.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns InsertsPresupuesto
     */
    @WebEndpoint(name = "InsertsPresupuestoPort")
    public InsertsPresupuesto getInsertsPresupuestoPort(WebServiceFeature... features) {
        return super.getPort(InsertsPresupuestoPort, InsertsPresupuesto.class, features);
    }

}
