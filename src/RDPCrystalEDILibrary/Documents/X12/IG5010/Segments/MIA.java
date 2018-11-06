package RDPCrystalEDILibrary.Documents.X12.IG5010.Segments;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import RDPCrystalEDILibrary.Documents.*;
import RDPCrystalEDILibrary.Documents.X12.IG5010.Segments.*;
import RDPCrystalEDILibrary.*;public class MIA extends DocumentSegment {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setQuantity1 (java.lang.String value){ try { javonetHandle.set("Quantity1",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getQuantity1 (){ try { return  (java.lang.String) javonetHandle.get("Quantity1");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setMonetaryAmount1 (java.lang.String value){ try { javonetHandle.set("MonetaryAmount1",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMonetaryAmount1 (){ try { return  (java.lang.String) javonetHandle.get("MonetaryAmount1");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setQuantity2 (java.lang.String value){ try { javonetHandle.set("Quantity2",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getQuantity2 (){ try { return  (java.lang.String) javonetHandle.get("Quantity2");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setMonetaryAmount2 (java.lang.String value){ try { javonetHandle.set("MonetaryAmount2",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMonetaryAmount2 (){ try { return  (java.lang.String) javonetHandle.get("MonetaryAmount2");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setReferenceIdentification1 (java.lang.String value){ try { javonetHandle.set("ReferenceIdentification1",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getReferenceIdentification1 (){ try { return  (java.lang.String) javonetHandle.get("ReferenceIdentification1");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setMonetaryAmount3 (java.lang.String value){ try { javonetHandle.set("MonetaryAmount3",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMonetaryAmount3 (){ try { return  (java.lang.String) javonetHandle.get("MonetaryAmount3");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setMonetaryAmount4 (java.lang.String value){ try { javonetHandle.set("MonetaryAmount4",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMonetaryAmount4 (){ try { return  (java.lang.String) javonetHandle.get("MonetaryAmount4");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setMonetaryAmount5 (java.lang.String value){ try { javonetHandle.set("MonetaryAmount5",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMonetaryAmount5 (){ try { return  (java.lang.String) javonetHandle.get("MonetaryAmount5");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setMonetaryAmount6 (java.lang.String value){ try { javonetHandle.set("MonetaryAmount6",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMonetaryAmount6 (){ try { return  (java.lang.String) javonetHandle.get("MonetaryAmount6");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setMonetaryAmount7 (java.lang.String value){ try { javonetHandle.set("MonetaryAmount7",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMonetaryAmount7 (){ try { return  (java.lang.String) javonetHandle.get("MonetaryAmount7");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setMonetaryAmount8 (java.lang.String value){ try { javonetHandle.set("MonetaryAmount8",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMonetaryAmount8 (){ try { return  (java.lang.String) javonetHandle.get("MonetaryAmount8");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setMonetaryAmount9 (java.lang.String value){ try { javonetHandle.set("MonetaryAmount9",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMonetaryAmount9 (){ try { return  (java.lang.String) javonetHandle.get("MonetaryAmount9");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setMonetaryAmount10 (java.lang.String value){ try { javonetHandle.set("MonetaryAmount10",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMonetaryAmount10 (){ try { return  (java.lang.String) javonetHandle.get("MonetaryAmount10");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setMonetaryAmount11 (java.lang.String value){ try { javonetHandle.set("MonetaryAmount11",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMonetaryAmount11 (){ try { return  (java.lang.String) javonetHandle.get("MonetaryAmount11");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setQuantity3 (java.lang.String value){ try { javonetHandle.set("Quantity3",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getQuantity3 (){ try { return  (java.lang.String) javonetHandle.get("Quantity3");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setMonetaryAmount12 (java.lang.String value){ try { javonetHandle.set("MonetaryAmount12",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMonetaryAmount12 (){ try { return  (java.lang.String) javonetHandle.get("MonetaryAmount12");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setMonetaryAmount13 (java.lang.String value){ try { javonetHandle.set("MonetaryAmount13",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMonetaryAmount13 (){ try { return  (java.lang.String) javonetHandle.get("MonetaryAmount13");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setMonetaryAmount14 (java.lang.String value){ try { javonetHandle.set("MonetaryAmount14",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMonetaryAmount14 (){ try { return  (java.lang.String) javonetHandle.get("MonetaryAmount14");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setMonetaryAmount15 (java.lang.String value){ try { javonetHandle.set("MonetaryAmount15",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMonetaryAmount15 (){ try { return  (java.lang.String) javonetHandle.get("MonetaryAmount15");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
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
            public void setMonetaryAmount16 (java.lang.String value){ try { javonetHandle.set("MonetaryAmount16",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMonetaryAmount16 (){ try { return  (java.lang.String) javonetHandle.get("MonetaryAmount16");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public MIA (){  super((NObject) null); try {  javonetHandle = Javonet.New("MIA"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public MIA(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
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