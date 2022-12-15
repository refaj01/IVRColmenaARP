package connectivity.ws.operations;

/**
 * This class is generated automatically.  Manual edits must be outside of the tagged
 * areas (for example, "START:CLASS:..." and "END:CLASS:...").  Changes within the
 * tag areas will be overwritten when the web service operation is regenerated.
 * Last generated by Orchestration Designer at: (timestamp generation disabled)
 */
public class ConsultaIVR extends com.avaya.sce.runtime.connectivity.ws2.CallService {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

    /**
    * Constructor for ConsultaIVR.
    */
    public ConsultaIVR( com.avaya.sce.runtimecommon.IRuntimeSession mySession ) {
		//{{START:CLASS:CONSTRUCTOR
        super(mySession);

        //Web Service
        setServiceName("ConsultasIvr");
        setSOAPAction("http://www.colmena.arp.com.co/ObtenerAiuIvr");
        setTimeoutSecondsFromParameter("ConsultasIvr_1671137464229TimeoutSeconds");
        setEndpointFromParameter("ConsultasIvr_1671137464229EndpointUrl");
        setAuthenticationFromParameter("ConsultasIvr_1671137464229Authentication");
        setPasswordFromParameter("ConsultasIvr_1671137464229Password");
        setUsernameFromParameter("ConsultasIvr_1671137464229Username");
        setUsernameTokenTimeoutFromParameter("ConsultasIvr_1671137464229UserNameTokenTimeout");
        setSendPasswordInClearFromParameter("ConsultasIvr_1671137464229SendPasswordInClear");

        //Operation
        setOperation(new javax.xml.namespace.QName("http://www.colmena.arp.com.co/", "ObtenerAiuIvr"));
        setOperationNSPrefix("ns1");
        setWrappedStyle(true);

        //Input parameters
        {
            com.avaya.sce.runtime.connectivity.ws2.WsParam param1 = new com.avaya.sce.runtime.connectivity.ws2.WsParam(new javax.xml.namespace.QName("http://www.colmena.arp.com.co/", "ObtenerAiuIvr"), new javax.xml.namespace.QName("connectivity.ws.beans", "ObtenerAiuIvr"));
            param1.setWrapped(false);
            param1.setArray(false);
            param1.setUseJavaObject(false);
            param1.setNsPrefix("ns1");

            {
                com.avaya.sce.runtime.connectivity.ws2.WsParamField field2 = new com.avaya.sce.runtime.connectivity.ws2.WsParamField(new javax.xml.namespace.QName("http://www.colmena.arp.com.co/", "documento"), new javax.xml.namespace.QName("", "java.lang.String"), param1);
                field2.setNsPrefix("ns1");
                field2.setDDVariableName("ConsultaObtenerAiuIvr:documento");
                field2.setUseJavaObject(false);
                param1.addField(field2);
            }

            {
                com.avaya.sce.runtime.connectivity.ws2.WsParamField field2 = new com.avaya.sce.runtime.connectivity.ws2.WsParamField(new javax.xml.namespace.QName("http://www.colmena.arp.com.co/", "idprestador"), new javax.xml.namespace.QName("", "java.lang.String"), param1);
                field2.setNsPrefix("ns1");
                field2.setDDVariableName("ConsultaObtenerAiuIvr:idPrestador");
                field2.setUseJavaObject(false);
                param1.addField(field2);
            }
            addInParameter(param1);
        }

        //Output parameters
        {
            com.avaya.sce.runtime.connectivity.ws2.WsParam param1 = new com.avaya.sce.runtime.connectivity.ws2.WsParam(new javax.xml.namespace.QName("http://www.colmena.arp.com.co/", "ObtenerAiuIvrResponse"), new javax.xml.namespace.QName("connectivity.ws.beans", "ObtenerAiuIvrResponse"));
            param1.setWrapped(false);
            param1.setArray(false);
            param1.setUseJavaObject(false);
            param1.setNsPrefix("ns1");

            {
                com.avaya.sce.runtime.connectivity.ws2.WsParamField field2 = new com.avaya.sce.runtime.connectivity.ws2.WsParamField(new javax.xml.namespace.QName("http://www.colmena.arp.com.co/", "ObtenerAiuIvrResult"), new javax.xml.namespace.QName("", "java.lang.String"), param1);
                field2.setNsPrefix("ns1");
                field2.setDDVariableName("ConsultaObtenerAiuIvr:result");
                field2.setUseJavaObject(false);
                param1.addField(field2);
            }
            addOutParameter(param1);
        }
        //}}END:CLASS:CONSTRUCTOR








    }

}

