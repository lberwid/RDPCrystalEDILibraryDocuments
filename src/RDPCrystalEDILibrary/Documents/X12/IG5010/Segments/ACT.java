package RDPCrystalEDILibrary.Documents.X12.IG5010.Segments;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import RDPCrystalEDILibrary.Documents.*;
import RDPCrystalEDILibrary.Documents.X12.IG5010.Segments.*;
import RDPCrystalEDILibrary.*;public class ACT extends DocumentSegment {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setAccountNumber1 (java.lang.String value){ try { javonetHandle.set("AccountNumber1",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getAccountNumber1 (){ try { return  (java.lang.String) javonetHandle.get("AccountNumber1");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setget_ACTACTName (java.lang.String value){ try { javonetHandle.set("get_ACTACTName",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getACTACTName (){ try { return  (java.lang.String) javonetHandle.get("ACTACTName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setIdentificationCodeQualifier (java.lang.String value){ try { javonetHandle.set("IdentificationCodeQualifier",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getIdentificationCodeQualifier (){ try { return  (java.lang.String) javonetHandle.get("IdentificationCodeQualifier");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setIdentificationCode (java.lang.String value){ try { javonetHandle.set("IdentificationCode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getIdentificationCode (){ try { return  (java.lang.String) javonetHandle.get("IdentificationCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setAccountNumberQualifier (java.lang.String value){ try { javonetHandle.set("AccountNumberQualifier",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getAccountNumberQualifier (){ try { return  (java.lang.String) javonetHandle.get("AccountNumberQualifier");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setAccountNumber2 (java.lang.String value){ try { javonetHandle.set("AccountNumber2",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getAccountNumber2 (){ try { return  (java.lang.String) javonetHandle.get("AccountNumber2");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setDescription (java.lang.String value){ try { javonetHandle.set("Description",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getDescription (){ try { return  (java.lang.String) javonetHandle.get("Description");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setPaymentMethodTypeCode (java.lang.String value){ try { javonetHandle.set("PaymentMethodTypeCode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getPaymentMethodTypeCode (){ try { return  (java.lang.String) javonetHandle.get("PaymentMethodTypeCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setBenefitStatusCode (java.lang.String value){ try { javonetHandle.set("BenefitStatusCode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getBenefitStatusCode (){ try { return  (java.lang.String) javonetHandle.get("BenefitStatusCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public ACT (){  super((NObject) null); try {  javonetHandle = Javonet.New("ACT"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ACT(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
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