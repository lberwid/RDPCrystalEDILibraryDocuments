package RDPCrystalEDILibrary.Documents.X12.IG5010.Segments;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import RDPCrystalEDILibrary.Documents.*;
import RDPCrystalEDILibrary.Documents.X12.IG5010.Segments.*;
import RDPCrystalEDILibrary.*;public class DTM extends DocumentSegment {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setDateTimeQualifier (java.lang.String value){ try { javonetHandle.set("DateTimeQualifier",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getDateTimeQualifier (){ try { return  (java.lang.String) javonetHandle.get("DateTimeQualifier");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setDate (java.lang.String value){ try { javonetHandle.set("Date",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getDate (){ try { return  (java.lang.String) javonetHandle.get("Date");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setTime (java.lang.String value){ try { javonetHandle.set("Time",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getTime (){ try { return  (java.lang.String) javonetHandle.get("Time");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setTimeCode (java.lang.String value){ try { javonetHandle.set("TimeCode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getTimeCode (){ try { return  (java.lang.String) javonetHandle.get("TimeCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
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
            public java.lang.String getDateTimePeriod (){ try { return  (java.lang.String) javonetHandle.get("DateTimePeriod");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public DTM (){  super((NObject) null); try {  javonetHandle = Javonet.New("DTM"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DTM(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
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