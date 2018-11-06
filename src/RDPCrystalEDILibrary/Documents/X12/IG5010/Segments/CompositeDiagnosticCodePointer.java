package RDPCrystalEDILibrary.Documents.X12.IG5010.Segments;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import RDPCrystalEDILibrary.Documents.*;
import RDPCrystalEDILibrary.Documents.X12.IG5010.Segments.*;public class CompositeDiagnosticCodePointer extends CompositeElement {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setDiagnosisCodePointer1 (java.lang.String value){ try { javonetHandle.set("DiagnosisCodePointer1",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getDiagnosisCodePointer1 (){ try { return  (java.lang.String) javonetHandle.get("DiagnosisCodePointer1");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setDiagnosisCodePointer2 (java.lang.String value){ try { javonetHandle.set("DiagnosisCodePointer2",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getDiagnosisCodePointer2 (){ try { return  (java.lang.String) javonetHandle.get("DiagnosisCodePointer2");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setDiagnosisCodePointer3 (java.lang.String value){ try { javonetHandle.set("DiagnosisCodePointer3",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getDiagnosisCodePointer3 (){ try { return  (java.lang.String) javonetHandle.get("DiagnosisCodePointer3");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setDiagnosisCodePointer4 (java.lang.String value){ try { javonetHandle.set("DiagnosisCodePointer4",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getDiagnosisCodePointer4 (){ try { return  (java.lang.String) javonetHandle.get("DiagnosisCodePointer4");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public CompositeDiagnosticCodePointer (){  super((NObject) null); try {  javonetHandle = Javonet.New("CompositeDiagnosticCodePointer"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public CompositeDiagnosticCodePointer(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
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