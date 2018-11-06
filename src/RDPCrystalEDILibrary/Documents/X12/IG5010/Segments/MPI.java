package RDPCrystalEDILibrary.Documents.X12.IG5010.Segments;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import RDPCrystalEDILibrary.Documents.*;
import RDPCrystalEDILibrary.Documents.X12.IG5010.Segments.*;
import RDPCrystalEDILibrary.*;public class MPI extends DocumentSegment {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setInformationStatusCode (java.lang.String value){ try { javonetHandle.set("InformationStatusCode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getInformationStatusCode (){ try { return  (java.lang.String) javonetHandle.get("InformationStatusCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setEmploymentStatusCode (java.lang.String value){ try { javonetHandle.set("EmploymentStatusCode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getEmploymentStatusCode (){ try { return  (java.lang.String) javonetHandle.get("EmploymentStatusCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setGovernmentServiceAffiliationCode (java.lang.String value){ try { javonetHandle.set("GovernmentServiceAffiliationCode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getGovernmentServiceAffiliationCode (){ try { return  (java.lang.String) javonetHandle.get("GovernmentServiceAffiliationCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setDescription (java.lang.String value){ try { javonetHandle.set("Description",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getDescription (){ try { return  (java.lang.String) javonetHandle.get("Description");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setMilitaryServiceRankCode (java.lang.String value){ try { javonetHandle.set("MilitaryServiceRankCode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMilitaryServiceRankCode (){ try { return  (java.lang.String) javonetHandle.get("MilitaryServiceRankCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setDateTimePeriodFormatQualifier (java.lang.String value){ try { javonetHandle.set("DateTimePeriodFormatQualifier",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getDateTimePeriodFormatQualifier (){ try { return  (java.lang.String) javonetHandle.get("DateTimePeriodFormatQualifier");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setDateTimePeriod (java.lang.String value){ try { javonetHandle.set("DateTimePeriod",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getDateTimePeriod (){ try { return  (java.lang.String) javonetHandle.get("DateTimePeriod");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public MPI (){  super((NObject) null); try {  javonetHandle = Javonet.New("MPI"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public MPI(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
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