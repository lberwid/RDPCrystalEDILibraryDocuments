package RDPCrystalEDILibrary.Documents.X12.IG5010.Segments;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import RDPCrystalEDILibrary.Documents.*;
import RDPCrystalEDILibrary.Documents.X12.IG5010.Segments.*;
import RDPCrystalEDILibrary.*;public class ISA extends DocumentSegment {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setAuthorizationInformationQualifier (java.lang.String value){ try { javonetHandle.set("AuthorizationInformationQualifier",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getAuthorizationInformationQualifier (){ try { return  (java.lang.String) javonetHandle.get("AuthorizationInformationQualifier");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setAuthorizationInformation (java.lang.String value){ try { javonetHandle.set("AuthorizationInformation",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getAuthorizationInformation (){ try { return  (java.lang.String) javonetHandle.get("AuthorizationInformation");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setSecurityInformationQualifier (java.lang.String value){ try { javonetHandle.set("SecurityInformationQualifier",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getSecurityInformationQualifier (){ try { return  (java.lang.String) javonetHandle.get("SecurityInformationQualifier");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setSecurityInformation (java.lang.String value){ try { javonetHandle.set("SecurityInformation",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getSecurityInformation (){ try { return  (java.lang.String) javonetHandle.get("SecurityInformation");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setInterchangeIDQualifier1 (java.lang.String value){ try { javonetHandle.set("InterchangeIDQualifier1",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getInterchangeIDQualifier1 (){ try { return  (java.lang.String) javonetHandle.get("InterchangeIDQualifier1");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setInterchangeSenderID (java.lang.String value){ try { javonetHandle.set("InterchangeSenderID",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getInterchangeSenderID (){ try { return  (java.lang.String) javonetHandle.get("InterchangeSenderID");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setInterchangeIDQualifier2 (java.lang.String value){ try { javonetHandle.set("InterchangeIDQualifier2",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getInterchangeIDQualifier2 (){ try { return  (java.lang.String) javonetHandle.get("InterchangeIDQualifier2");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setInterchangeReceiverID (java.lang.String value){ try { javonetHandle.set("InterchangeReceiverID",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getInterchangeReceiverID (){ try { return  (java.lang.String) javonetHandle.get("InterchangeReceiverID");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setInterchangeDate (java.lang.String value){ try { javonetHandle.set("InterchangeDate",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getInterchangeDate (){ try { return  (java.lang.String) javonetHandle.get("InterchangeDate");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setInterchangeTime (java.lang.String value){ try { javonetHandle.set("InterchangeTime",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getInterchangeTime (){ try { return  (java.lang.String) javonetHandle.get("InterchangeTime");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setRepetitionSeparator (java.lang.String value){ try { javonetHandle.set("RepetitionSeparator",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getRepetitionSeparator (){ try { return  (java.lang.String) javonetHandle.get("RepetitionSeparator");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setInterchangeControlVersionNumber (java.lang.String value){ try { javonetHandle.set("InterchangeControlVersionNumber",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getInterchangeControlVersionNumber (){ try { return  (java.lang.String) javonetHandle.get("InterchangeControlVersionNumber");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setInterchangeControlNumber (java.lang.String value){ try { javonetHandle.set("InterchangeControlNumber",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getInterchangeControlNumber (){ try { return  (java.lang.String) javonetHandle.get("InterchangeControlNumber");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setAcknowledgmentRequested (java.lang.String value){ try { javonetHandle.set("AcknowledgmentRequested",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getAcknowledgmentRequested (){ try { return  (java.lang.String) javonetHandle.get("AcknowledgmentRequested");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setInterchangeUsageIndicator (java.lang.String value){ try { javonetHandle.set("InterchangeUsageIndicator",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getInterchangeUsageIndicator (){ try { return  (java.lang.String) javonetHandle.get("InterchangeUsageIndicator");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setComponentElementSeparator (java.lang.String value){ try { javonetHandle.set("ComponentElementSeparator",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getComponentElementSeparator (){ try { return  (java.lang.String) javonetHandle.get("ComponentElementSeparator");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public ISA (){  super((NObject) null); try {  javonetHandle = Javonet.New("ISA"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ISA(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Write (WriteArguments w){ try { javonetHandle.invoke("Write",w);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Load (LightWeightSegment segment){ try { javonetHandle.invoke("Load",segment);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}