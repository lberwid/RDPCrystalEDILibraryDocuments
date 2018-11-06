package RDPCrystalEDILibrary.Documents.X12.IG5010.Segments;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import RDPCrystalEDILibrary.Documents.*;
import RDPCrystalEDILibrary.Documents.X12.IG5010.Segments.*;public class ReferenceIdentifier extends CompositeElement {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setReferenceIdentificationQualifier1 (java.lang.String value){ try { javonetHandle.set("ReferenceIdentificationQualifier1",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getReferenceIdentificationQualifier1 (){ try { return  (java.lang.String) javonetHandle.get("ReferenceIdentificationQualifier1");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setReferenceIdentification1 (java.lang.String value){ try { javonetHandle.set("ReferenceIdentification1",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getReferenceIdentification1 (){ try { return  (java.lang.String) javonetHandle.get("ReferenceIdentification1");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setReferenceIdentificationQualifier2 (java.lang.String value){ try { javonetHandle.set("ReferenceIdentificationQualifier2",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getReferenceIdentificationQualifier2 (){ try { return  (java.lang.String) javonetHandle.get("ReferenceIdentificationQualifier2");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setReferenceIdentification2 (java.lang.String value){ try { javonetHandle.set("ReferenceIdentification2",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getReferenceIdentification2 (){ try { return  (java.lang.String) javonetHandle.get("ReferenceIdentification2");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setReferenceIdentificationQualifier3 (java.lang.String value){ try { javonetHandle.set("ReferenceIdentificationQualifier3",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getReferenceIdentificationQualifier3 (){ try { return  (java.lang.String) javonetHandle.get("ReferenceIdentificationQualifier3");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setReferenceIdentification3 (java.lang.String value){ try { javonetHandle.set("ReferenceIdentification3",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getReferenceIdentification3 (){ try { return  (java.lang.String) javonetHandle.get("ReferenceIdentification3");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public ReferenceIdentifier (){  super((NObject) null); try {  javonetHandle = Javonet.New("ReferenceIdentifier"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ReferenceIdentifier(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.String GetString (java.lang.Character compElemSep){ try { return  (java.lang.String) javonetHandle.invoke("GetString",compElemSep);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}