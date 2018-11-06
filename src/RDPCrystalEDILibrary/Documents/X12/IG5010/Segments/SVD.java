package RDPCrystalEDILibrary.Documents.X12.IG5010.Segments;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import RDPCrystalEDILibrary.Documents.*;
import RDPCrystalEDILibrary.Documents.X12.IG5010.Segments.*;
import RDPCrystalEDILibrary.*;public class SVD extends DocumentSegment {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setIdentificationCode (java.lang.String value){ try { javonetHandle.set("IdentificationCode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getIdentificationCode (){ try { return  (java.lang.String) javonetHandle.get("IdentificationCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setMonetaryAmount (java.lang.String value){ try { javonetHandle.set("MonetaryAmount",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMonetaryAmount (){ try { return  (java.lang.String) javonetHandle.get("MonetaryAmount");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setCompositeMedicalProcedureIdentifier (CompositeMedicalProcedureIdentifier value){ try { javonetHandle.set("CompositeMedicalProcedureIdentifier",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public CompositeMedicalProcedureIdentifier getCompositeMedicalProcedureIdentifier (){ try { return new CompositeMedicalProcedureIdentifier((NObject)javonetHandle.get("CompositeMedicalProcedureIdentifier"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setProductServiceID (java.lang.String value){ try { javonetHandle.set("ProductServiceID",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getProductServiceID (){ try { return  (java.lang.String) javonetHandle.get("ProductServiceID");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setQuantity (java.lang.String value){ try { javonetHandle.set("Quantity",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getQuantity (){ try { return  (java.lang.String) javonetHandle.get("Quantity");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setAssignedNumber (java.lang.String value){ try { javonetHandle.set("AssignedNumber",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getAssignedNumber (){ try { return  (java.lang.String) javonetHandle.get("AssignedNumber");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public SVD (){  super((NObject) null); try {  javonetHandle = Javonet.New("SVD"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SVD(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
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