package RDPCrystalEDILibrary;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import RDPCrystalEDILibrary.*;
import jio.System.Collections.Generic.*;public class ScrubRule {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setSegmentName (java.lang.String value){ try { javonetHandle.set("SegmentName",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getSegmentName (){ try { return  (java.lang.String) javonetHandle.get("SegmentName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public List<ScrubPosition> getScrubPositions (){ try { return new List<ScrubPosition>((NObject)javonetHandle.get("ScrubPositions"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setReplaceCharacter (java.lang.Character value){ try { javonetHandle.set("ReplaceCharacter",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Character getReplaceCharacter (){ try { return javonetHandle.get("ReplaceCharacter");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public ScrubRule (){ try {  javonetHandle = Javonet.New("ScrubRule");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ScrubRule(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}