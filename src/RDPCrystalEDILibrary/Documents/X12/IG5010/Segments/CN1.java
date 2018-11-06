package RDPCrystalEDILibrary.Documents.X12.IG5010.Segments;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import RDPCrystalEDILibrary.Documents.*;
import RDPCrystalEDILibrary.Documents.X12.IG5010.Segments.*;
import RDPCrystalEDILibrary.*;public class CN1 extends DocumentSegment {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setContractTypeCode (java.lang.String value){ try { javonetHandle.set("ContractTypeCode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getContractTypeCode (){ try { return  (java.lang.String) javonetHandle.get("ContractTypeCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setMonetaryAmount (java.lang.String value){ try { javonetHandle.set("MonetaryAmount",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMonetaryAmount (){ try { return  (java.lang.String) javonetHandle.get("MonetaryAmount");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setPercent (java.lang.String value){ try { javonetHandle.set("Percent",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getPercent (){ try { return  (java.lang.String) javonetHandle.get("Percent");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setReferenceIdentification (java.lang.String value){ try { javonetHandle.set("ReferenceIdentification",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getReferenceIdentification (){ try { return  (java.lang.String) javonetHandle.get("ReferenceIdentification");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setTermsDiscountPercent (java.lang.String value){ try { javonetHandle.set("TermsDiscountPercent",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getTermsDiscountPercent (){ try { return  (java.lang.String) javonetHandle.get("TermsDiscountPercent");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setVersionIdentifier (java.lang.String value){ try { javonetHandle.set("VersionIdentifier",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getVersionIdentifier (){ try { return  (java.lang.String) javonetHandle.get("VersionIdentifier");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public CN1 (){  super((NObject) null); try {  javonetHandle = Javonet.New("CN1"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public CN1(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
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