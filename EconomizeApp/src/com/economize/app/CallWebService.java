package com.economize.app;

import java.util.ArrayList;
import java.util.Vector;
import org.kobjects.base64.Base64;
import org.ksoap2.HeaderProperty;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

public class CallWebService
{
        private static final String NAMESPACE = "urn:server";
        private static final String URL = "http://10.0.2.2:8080/economize/Web/webservice/server_actros.php";
        private static final String USER_PASSWORD = "perdig@:tonh0";
        private Vector <SoapObject> result;
        
        public void call(String method_name)
        {
                SoapObject request = new SoapObject(NAMESPACE, method_name);
                //Use this to add parameters
                //request.addProperty("Parameter","Value");
                SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
                envelope.setOutputSoapObject(request);
                HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);
                try {
                        ArrayList<HeaderProperty> headerProperty = new ArrayList<HeaderProperty>();
                        headerProperty.add(new HeaderProperty("Authorization", "Basic : " + Base64.encode(USER_PASSWORD.getBytes())));
                        androidHttpTransport.call(NAMESPACE + "#" + method_name + "Server", envelope, headerProperty);
                        this.setResult((Vector <SoapObject>) envelope.getResponse());
                } catch (Exception e) {
                        e.printStackTrace();
                }
        }

	public Vector<SoapObject> getResult() {
		return result;
	}

	public void setResult(Vector<SoapObject> result) {
		this.result = result;
	}
}