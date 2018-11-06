package RDPCrystalEDILibrary.Documents.X12.IG5010.Segments;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import RDPCrystalEDILibrary.Documents.*;
import RDPCrystalEDILibrary.Documents.X12.IG5010.Segments.*;
import RDPCrystalEDILibrary.*;public class LX extends DocumentSegment {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setAssignedNumber (java.lang.String value){ try { javonetHandle.set("AssignedNumber",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getAssignedNumber (){ try { return  (java.lang.String) javonetHandle.get("AssignedNumber");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public LX (){  super((NObject) null); try {  javonetHandle = Javonet.New("LX"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LX(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
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