package RDPCrystalEDILibrary.Documents.X12.IG5010.Segments;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import RDPCrystalEDILibrary.Documents.*;
import RDPCrystalEDILibrary.Documents.X12.IG5010.Segments.*;
import RDPCrystalEDILibrary.*;public class EB extends DocumentSegment {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setEligibilityOrBenefitInformationCode (java.lang.String value){ try { javonetHandle.set("EligibilityOrBenefitInformationCode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getEligibilityOrBenefitInformationCode (){ try { return  (java.lang.String) javonetHandle.get("EligibilityOrBenefitInformationCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setCoverageLevelCode (java.lang.String value){ try { javonetHandle.set("CoverageLevelCode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getCoverageLevelCode (){ try { return  (java.lang.String) javonetHandle.get("CoverageLevelCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setServiceTypeCode (java.lang.String value){ try { javonetHandle.set("ServiceTypeCode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getServiceTypeCode (){ try { return  (java.lang.String) javonetHandle.get("ServiceTypeCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setInsuranceTypeCode (java.lang.String value){ try { javonetHandle.set("InsuranceTypeCode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getInsuranceTypeCode (){ try { return  (java.lang.String) javonetHandle.get("InsuranceTypeCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setPlanCoverageDescription (java.lang.String value){ try { javonetHandle.set("PlanCoverageDescription",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getPlanCoverageDescription (){ try { return  (java.lang.String) javonetHandle.get("PlanCoverageDescription");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setTimePeriodQualifier (java.lang.String value){ try { javonetHandle.set("TimePeriodQualifier",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getTimePeriodQualifier (){ try { return  (java.lang.String) javonetHandle.get("TimePeriodQualifier");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setMonetaryAmount (java.lang.String value){ try { javonetHandle.set("MonetaryAmount",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMonetaryAmount (){ try { return  (java.lang.String) javonetHandle.get("MonetaryAmount");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setPercentage (java.lang.String value){ try { javonetHandle.set("Percentage",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getPercentage (){ try { return  (java.lang.String) javonetHandle.get("Percentage");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setQuantityQualifier (java.lang.String value){ try { javonetHandle.set("QuantityQualifier",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getQuantityQualifier (){ try { return  (java.lang.String) javonetHandle.get("QuantityQualifier");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setQuantity (java.lang.String value){ try { javonetHandle.set("Quantity",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getQuantity (){ try { return  (java.lang.String) javonetHandle.get("Quantity");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setYesNoConditionOrResponseCode1 (java.lang.String value){ try { javonetHandle.set("YesNoConditionOrResponseCode1",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getYesNoConditionOrResponseCode1 (){ try { return  (java.lang.String) javonetHandle.get("YesNoConditionOrResponseCode1");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setYesNoConditionOrResponseCode2 (java.lang.String value){ try { javonetHandle.set("YesNoConditionOrResponseCode2",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getYesNoConditionOrResponseCode2 (){ try { return  (java.lang.String) javonetHandle.get("YesNoConditionOrResponseCode2");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setCompositeMedicalProcedureIdentifier (CompositeMedicalProcedureIdentifier value){ try { javonetHandle.set("CompositeMedicalProcedureIdentifier",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public CompositeMedicalProcedureIdentifier getCompositeMedicalProcedureIdentifier (){ try { return new CompositeMedicalProcedureIdentifier((NObject)javonetHandle.get("CompositeMedicalProcedureIdentifier"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setCompositeDiagnosticCodePointer (CompositeDiagnosticCodePointer value){ try { javonetHandle.set("CompositeDiagnosticCodePointer",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public CompositeDiagnosticCodePointer getCompositeDiagnosticCodePointer (){ try { return new CompositeDiagnosticCodePointer((NObject)javonetHandle.get("CompositeDiagnosticCodePointer"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public EB (){  super((NObject) null); try {  javonetHandle = Javonet.New("EB"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public EB(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
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