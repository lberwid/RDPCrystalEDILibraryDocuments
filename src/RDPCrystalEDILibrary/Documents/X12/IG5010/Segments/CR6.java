package RDPCrystalEDILibrary.Documents.X12.IG5010.Segments;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import RDPCrystalEDILibrary.Documents.*;
import RDPCrystalEDILibrary.Documents.X12.IG5010.Segments.*;
import RDPCrystalEDILibrary.*;public class CR6 extends DocumentSegment {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setPrognosisCode (java.lang.String value){ try { javonetHandle.set("PrognosisCode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getPrognosisCode (){ try { return  (java.lang.String) javonetHandle.get("PrognosisCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setDate1 (java.lang.String value){ try { javonetHandle.set("Date1",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getDate1 (){ try { return  (java.lang.String) javonetHandle.get("Date1");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setDateTimePeriodFormatQualifier1 (java.lang.String value){ try { javonetHandle.set("DateTimePeriodFormatQualifier1",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getDateTimePeriodFormatQualifier1 (){ try { return  (java.lang.String) javonetHandle.get("DateTimePeriodFormatQualifier1");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setDateTimePeriod1 (java.lang.String value){ try { javonetHandle.set("DateTimePeriod1",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getDateTimePeriod1 (){ try { return  (java.lang.String) javonetHandle.get("DateTimePeriod1");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setDate2 (java.lang.String value){ try { javonetHandle.set("Date2",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getDate2 (){ try { return  (java.lang.String) javonetHandle.get("Date2");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
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
            public void setCertificationTypeCode (java.lang.String value){ try { javonetHandle.set("CertificationTypeCode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getCertificationTypeCode (){ try { return  (java.lang.String) javonetHandle.get("CertificationTypeCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setDate3 (java.lang.String value){ try { javonetHandle.set("Date3",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getDate3 (){ try { return  (java.lang.String) javonetHandle.get("Date3");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setProductServiceIDQualifier (java.lang.String value){ try { javonetHandle.set("ProductServiceIDQualifier",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getProductServiceIDQualifier (){ try { return  (java.lang.String) javonetHandle.get("ProductServiceIDQualifier");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setMedicalCodeValue (java.lang.String value){ try { javonetHandle.set("MedicalCodeValue",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMedicalCodeValue (){ try { return  (java.lang.String) javonetHandle.get("MedicalCodeValue");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setDate4 (java.lang.String value){ try { javonetHandle.set("Date4",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getDate4 (){ try { return  (java.lang.String) javonetHandle.get("Date4");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setDate5 (java.lang.String value){ try { javonetHandle.set("Date5",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getDate5 (){ try { return  (java.lang.String) javonetHandle.get("Date5");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setDate6 (java.lang.String value){ try { javonetHandle.set("Date6",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getDate6 (){ try { return  (java.lang.String) javonetHandle.get("Date6");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setDateTimePeriodFormatQualifier2 (java.lang.String value){ try { javonetHandle.set("DateTimePeriodFormatQualifier2",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getDateTimePeriodFormatQualifier2 (){ try { return  (java.lang.String) javonetHandle.get("DateTimePeriodFormatQualifier2");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setDateTimePeriod2 (java.lang.String value){ try { javonetHandle.set("DateTimePeriod2",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getDateTimePeriod2 (){ try { return  (java.lang.String) javonetHandle.get("DateTimePeriod2");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setPatientLocationCode (java.lang.String value){ try { javonetHandle.set("PatientLocationCode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getPatientLocationCode (){ try { return  (java.lang.String) javonetHandle.get("PatientLocationCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setDate7 (java.lang.String value){ try { javonetHandle.set("Date7",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getDate7 (){ try { return  (java.lang.String) javonetHandle.get("Date7");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setDate8 (java.lang.String value){ try { javonetHandle.set("Date8",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getDate8 (){ try { return  (java.lang.String) javonetHandle.get("Date8");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setDate9 (java.lang.String value){ try { javonetHandle.set("Date9",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getDate9 (){ try { return  (java.lang.String) javonetHandle.get("Date9");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setDate10 (java.lang.String value){ try { javonetHandle.set("Date10",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getDate10 (){ try { return  (java.lang.String) javonetHandle.get("Date10");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public CR6 (){  super((NObject) null); try {  javonetHandle = Javonet.New("CR6"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public CR6(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
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