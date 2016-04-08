package com.economize.app;

import com.economize.app.CallWebService;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Vector;
import org.kobjects.base64.Base64;
import org.ksoap2.HeaderProperty;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

public class Economize extends Activity
{
        /** Called when the activity is first created. */
        @Override
        public void onCreate(Bundle savedInstanceState)
        {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.main);
                
                CallWebService webservice = new CallWebService();
                webservice.call("GetDepartments");
                
                TextView t = (TextView)this.findViewById(R.id.resultbox);
                t.setText("SOAP response:\n\n");
                if(!webservice.getResult().isEmpty()){
                        for (SoapObject cs : webservice.getResult()) {
                                t.append("ID " + cs.getProperty(0).toString());
                                t.append("Nivel1 " + cs.getProperty(1).toString());
                                t.append("Nivel2 " + cs.getProperty(2).toString());
                                t.append("Nome " + cs.getProperty(3).toString());
                                t.append("Status " + cs.getProperty(4).toString());
                                t.append("\n");
                        }
                } else {
                        t.setText("Requisição recusada - Sem permissão!");
                }
        }
}