package RDPCrystalEDILibrary.Documents.X12.IG5010.Segments;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import RDPCrystalEDILibrary.Documents.*;
import RDPCrystalEDILibrary.Documents.X12.IG5010.Segments.*;
import RDPCrystalEDILibrary.*;public class MOA extends DocumentSegment {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setPercentage (java.lang.String value){ try { javonetHandle.set("Percentage",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getPercentage (){ try { return  (java.lang.String) javonetHandle.get("Percentage");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setMonetaryAmount1 (java.lang.String value){ try { javonetHandle.set("MonetaryAmount1",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMonetaryAmount1 (){ try { return  (java.lang.String) javonetHandle.get("MonetaryAmount1");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setReferenceIdentification1 (java.lang.String value){ try { javonetHandle.set("ReferenceIdentification1",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getReferenceIdentification1 (){ try { return  (java.lang.String) javonetHandle.get("ReferenceIdentification1");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setReferenceIdentification2 (java.lang.String value){ try { javonetHandle.set("ReferenceIdentification2",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getReferenceIdentification2 (){ try { return  (java.lang.String) javonetHandle.get("ReferenceIdentification2");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setReferenceIdentification3 (java.lang.String value){ try { javonetHandle.set("ReferenceIdentification3",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getReferenceIdentification3 (){ try { return  (java.lang.String) javonetHandle.get("ReferenceIdentification3");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setReferenceIdentification4 (java.lang.String value){ try { javonetHandle.set("ReferenceIdentification4",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getReferenceIdentification4 (){ try { return  (java.lang.String) javonetHandle.get("ReferenceIdentification4");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setReferenceIdentification5 (java.lang.String value){ try { javonetHandle.set("ReferenceIdentification5",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getReferenceIdentification5 (){ try { return  (java.lang.String) javonetHandle.get("ReferenceIdentification5");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setMonetaryAmount2 (java.lang.String value){ try { javonetHandle.set("MonetaryAmount2",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMonetaryAmount2 (){ try { return  (java.lang.String) javonetHandle.get("MonetaryAmount2");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setMonetaryAmount3 (java.lang.String value){ try { javonetHandle.set("MonetaryAmount3",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMonetaryAmount3 (){ try { return  (java.lang.String) javonetHandle.get("MonetaryAmount3");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public MOA (){  super((NObject) null); try {  javonetHandle = Javonet.New("MOA"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public MOA(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
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