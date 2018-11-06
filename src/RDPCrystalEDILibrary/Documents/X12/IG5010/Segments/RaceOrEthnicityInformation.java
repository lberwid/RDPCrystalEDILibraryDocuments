package RDPCrystalEDILibrary.Documents.X12.IG5010.Segments;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import RDPCrystalEDILibrary.Documents.*;
import RDPCrystalEDILibrary.Documents.X12.IG5010.Segments.*;public class RaceOrEthnicityInformation extends CompositeElement {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setRaceOrEthnicityCode (java.lang.String value){ try { javonetHandle.set("RaceOrEthnicityCode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getRaceOrEthnicityCode (){ try { return  (java.lang.String) javonetHandle.get("RaceOrEthnicityCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setCodeListQualifierCode (java.lang.String value){ try { javonetHandle.set("CodeListQualifierCode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getCodeListQualifierCode (){ try { return  (java.lang.String) javonetHandle.get("CodeListQualifierCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setIndustryCode (java.lang.String value){ try { javonetHandle.set("IndustryCode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getIndustryCode (){ try { return  (java.lang.String) javonetHandle.get("IndustryCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public RaceOrEthnicityInformation (){  super((NObject) null); try {  javonetHandle = Javonet.New("RaceOrEthnicityInformation"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public RaceOrEthnicityInformation(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
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